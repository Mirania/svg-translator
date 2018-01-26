import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class SVGGenerator extends RulesBaseListener {
	
	private FileWriter fw;
	private File f; //output
	private List<String> printMemory; //lista para imprimir
	private int maxSize; //para ter janela dinamica
	private Shape memory; //para atribuir a vars / draw
	private Map<String,Shape> vars; //lista de vars
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRotate(@NotNull RulesParser.RotateContext ctx) { 
		
		if (!vars.containsKey(ctx.a.getText())) {
			System.err.println("Variable \""+ctx.a.getText()+"\" not found.");
        	System.exit(1);
		}
		
		Shape s = vars.get(ctx.a.getText());
		
		if (ctx.i!=null) { //rotate(i 0,0)
			s.setRotateAngle(ctx.i.getText());
		} else { //rotate(i x,y);
			Map<String,String> params = new HashMap<>(); //add params
			params.put(ctx.a1.id.getText(), ctx.a1.value.getText());
			if (ctx.a2!=null) params.put(ctx.a2.id.getText(), ctx.a2.value.getText());
			if (ctx.a3!=null) params.put(ctx.a3.id.getText(), ctx.a3.value.getText());
		
			int amount = params.size();
			
			if (!params.containsKey("a") && !params.containsKey("angle")) { //check if mandatory params exist
				System.err.println("Rotation requires an angle!");
				System.exit(1);
			}
			
			if (amount>1 && !params.containsKey("y")) {
				System.err.println("Rotation center requires a Y coordinate!");
				System.exit(1);
			}
			
			if (amount>1 && !params.containsKey("x")) {
				System.err.println("Rotation center requires an X coordinate!");
				System.exit(1);
			}
						
			for (Map.Entry<String, String> entry : params.entrySet()) { //add values to shape
				if (entry.getKey().equals("a") || entry.getKey().equals("angle")) s.setRotateAngle(entry.getValue());
				else if (entry.getKey().equals("x")) s.setRotateX(entry.getValue());
				else if (entry.getKey().equals("y")) s.setRotateY(entry.getValue());
			}
			
		}

		vars.put(ctx.a.getText(), s);
	}
	
	@Override public void exitMove(@NotNull RulesParser.MoveContext ctx) { 
		
		if (!vars.containsKey(ctx.a.getText())) {
			System.err.println("Variable \""+ctx.a.getText()+"\" not found.");
        	System.exit(1);
		}
		
		Shape s = vars.get(ctx.a.getText());
		
		Map<String,String> params = new HashMap<>(); //add params
		params.put(ctx.a1.id.getText(), ctx.a1.value.getText());
		if (ctx.a2!=null) params.put(ctx.a2.id.getText(), ctx.a2.value.getText());
		
		if (!params.containsKey("y") && !params.containsKey("x")) {
			System.err.println("Move requires a Y and/or X coordinate!");
			System.exit(1);
		}
		
		String x="0";
		String y="0";
		
		for (Map.Entry<String, String> entry : params.entrySet()) { //add values to shape
			if (entry.getKey().equals("x")) x = entry.getValue();
			else if (entry.getKey().equals("y")) y = entry.getValue();
		}
					
		s.move(x,y);

	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSetClip(@NotNull RulesParser.SetClipContext ctx) { 
		
		if (!vars.containsKey(ctx.a.getText())) {
			System.err.println("Variable \""+ctx.a.getText()+"\" not found.");
        	System.exit(1);
		} else if (!vars.containsKey(ctx.i.getText())) {
			System.err.println("Variable \""+ctx.i.getText()+"\" not found.");
        	System.exit(1);
		}
		Shape s = vars.get(ctx.a.getText());
		if (! s.isClip()){
			System.err.println("The first argument must be a ClipPath!");
        	System.exit(1);
		}
		ClipPath s1 = (ClipPath) s;
		Shape s2 = vars.get(ctx.i.getText());
		
		s2.clip(s1.getID());
	
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitScale(@NotNull RulesParser.ScaleContext ctx) { 
		
		if (!vars.containsKey(ctx.a.getText())) {
			System.err.println("Variable \""+ctx.a.getText()+"\" not found.");
        	System.exit(1);
		}
		
		Shape s = vars.get(ctx.a.getText());
		
		if (ctx.i!=null) { //scale(i)
			s.setScaleX(ctx.i.getText());
		} else { //scale(x=1,y=2);
			Map<String,String> params = new HashMap<>(); //add params
			params.put(ctx.a1.id.getText(), ctx.a1.value.getText());
			params.put(ctx.a2.id.getText(), ctx.a2.value.getText());

			if (!params.containsKey("x")) {
				System.err.println("Scale requires an X axis multiplier!");
				System.exit(1);
			}
			
			if (!params.containsKey("y")) {
				System.err.println("Scale requires a Y axis multiplier!");
			}
			
			for (Map.Entry<String, String> entry : params.entrySet()) { //add values to shape
				if (entry.getKey().equals("x")) s.setScaleX(entry.getValue());
				else if (entry.getKey().equals("y")) s.setScaleY(entry.getValue());
			}

		}


		vars.put(ctx.a.getText(), s);
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitHyperlink(@NotNull RulesParser.HyperlinkContext ctx) { 
		
		if (!vars.containsKey(ctx.a.getText())) {
			System.err.println("Variable \""+ctx.a.getText()+"\" not found.");
        	System.exit(1);
		}
		
		Shape s = vars.get(ctx.a.getText());
	
		s.setLink(ctx.t.getText());

		vars.put(ctx.a.getText(), s);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRegular(@NotNull RulesParser.RegularContext ctx) {
		Regular c = new Regular();

		Map<String,String> params = new HashMap<>(); //add params
		params.put(ctx.a1.id.getText(), ctx.a1.value.getText());
		params.put(ctx.a2.id.getText(), ctx.a2.value.getText());
		params.put(ctx.a3.id.getText(), ctx.a3.value.getText());
		params.put(ctx.a4.id.getText(), ctx.a4.value.getText());
		if (ctx.a5!=null) params.put(ctx.a5.id.getText(), ctx.a5.value.getText());
		if (ctx.a6!=null) params.put(ctx.a6.id.getText(), ctx.a6.value.getText());
		if (ctx.a7!=null) params.put(ctx.a7.id.getText(), ctx.a7.value.getText());
		
		if (!params.containsKey("x")) { //check if mandatory params exist
			System.err.println("Regular polygon requires an X coordinate for its center!");
			System.exit(1);
		}
		
		if (!params.containsKey("y")) {
			System.err.println("Regular polygon requires a Y coordinate for its center!");
			System.exit(1);
		}
		
		if (!params.containsKey("r") && !params.containsKey("radius")) {
			System.err.println("Regular polygon requires a radius!");
			System.exit(1);
		}
		
		if (!params.containsKey("n") && !params.containsKey("nSides")) {
			System.err.println("Regular polygon requires an amount of sides!");
			System.exit(1);
		}
		
		for (Map.Entry<String, String> entry : params.entrySet()) { //add values to shape
			if (entry.getKey().equals("x")) c.setX(entry.getValue());
			else if (entry.getKey().equals("y")) c.setY(entry.getValue());
			else if (entry.getKey().equals("r") || entry.getKey().equals("radius")) c.setRadius(entry.getValue());
			else if (entry.getKey().equals("n") || entry.getKey().equals("nSides")) c.setNsides(entry.getValue());
			else if (entry.getKey().equals("c") || entry.getKey().equals("color")) c.setColor(entry.getValue());
			else if (entry.getKey().equals("s") || entry.getKey().equals("stroke")) c.setStroke(entry.getValue());
			else if (entry.getKey().equals("sw") || entry.getKey().equals("stroke-width")) c.setStrokeWidth(entry.getValue());
		}
		memory=c; //add to memory
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterComment(@NotNull RulesParser.CommentContext ctx) { 
		Comment c = new Comment();

		Map<String,String> params = new HashMap<>(); //add params
		params.put(ctx.a1.id.getText(), ctx.a1.value.getText());
		params.put(ctx.a2.id.getText(), ctx.a2.value.getText());
		if (ctx.a3!=null) params.put(ctx.a3.id.getText(), ctx.a3.value.getText());
		if (ctx.a4!=null) params.put(ctx.a4.id.getText(), ctx.a4.value.getText());
		if (ctx.a5!=null) params.put(ctx.a5.id.getText(), ctx.a5.value.getText());
		
		if (!params.containsKey("x")) { //check if mandatory params exist
			System.err.println("Comment requires an X coordinate for its upper-left corner!");
			System.exit(1);
		}
		
		if (!params.containsKey("y")) {
			System.err.println("Comment requires a Y coordinate for its upper-left corner!");
			System.exit(1);
		}
		
		for (int i=0;i<ctx.TEXT().size();i++) c.addLine(ctx.TEXT(i).getText());
		
		for (Map.Entry<String, String> entry : params.entrySet()) { //add values to shape
			if (entry.getKey().equals("x")) c.setX(entry.getValue());
			else if (entry.getKey().equals("y")) c.setY(entry.getValue());
			else if (entry.getKey().equals("c") || entry.getKey().equals("color")) c.setColor(entry.getValue());
			else if (entry.getKey().equals("s") || entry.getKey().equals("stroke")) c.setStroke(entry.getValue());
			else if (entry.getKey().equals("sw") || entry.getKey().equals("stroke-width")) c.setStrokeWidth(entry.getValue());
		}
		memory=c; //add to memory
	}
	/** 
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterRect(@NotNull RulesParser.RectContext ctx) {
		Rectangle c = new Rectangle();

		Map<String,String> params = new HashMap<>(); //add params
		params.put(ctx.a1.id.getText(), ctx.a1.value.getText());
		params.put(ctx.a2.id.getText(), ctx.a2.value.getText());
		params.put(ctx.a3.id.getText(), ctx.a3.value.getText());
		params.put(ctx.a4.id.getText(), ctx.a4.value.getText());
		if (ctx.a5!=null) params.put(ctx.a5.id.getText(), ctx.a5.value.getText());
		if (ctx.a6!=null) params.put(ctx.a6.id.getText(), ctx.a6.value.getText());
		if (ctx.a7!=null) params.put(ctx.a7.id.getText(), ctx.a7.value.getText());
		
		if (!params.containsKey("x")) { //check if mandatory params exist
			System.err.println("Rectangle requires an X coordinate for its upper-left corner!");
			System.exit(1);
		}
		
		if (!params.containsKey("y")) {
			System.err.println("Rectangle requires a Y coordinate for its upper-left corner!");
			System.exit(1);
		}
		
		if (!params.containsKey("w") && !params.containsKey("width")) {
			System.err.println("Rectangle requires a width!");
			System.exit(1);
		}
		
		if (!params.containsKey("h") && !params.containsKey("height")) {
			System.err.println("Rectangle requires a height!");
			System.exit(1);
		}
		
		for (Map.Entry<String, String> entry : params.entrySet()) { //add values to shape
			if (entry.getKey().equals("x")) c.setX(entry.getValue());
			else if (entry.getKey().equals("y")) c.setY(entry.getValue());
			else if (entry.getKey().equals("w") || entry.getKey().equals("width")) c.setWidth(entry.getValue());
			else if (entry.getKey().equals("h") || entry.getKey().equals("height")) c.setHeight(entry.getValue());
			else if (entry.getKey().equals("c") || entry.getKey().equals("color")) c.setColor(entry.getValue());
			else if (entry.getKey().equals("s") || entry.getKey().equals("stroke")) c.setStroke(entry.getValue());
			else if (entry.getKey().equals("sw") || entry.getKey().equals("stroke-width")) c.setStrokeWidth(entry.getValue());
		}
		memory=c; //add to memory
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAddpt(@NotNull RulesParser.AddptContext ctx) {
		
		if (!vars.containsKey(ctx.a.getText())) {
			System.err.println("Variable \""+ctx.a.getText()+"\" not found.");
        	System.exit(1);
		}
		
		Shape s = vars.get(ctx.a.getText());
	
		if (ctx.x!=null) {
			s.add(ctx.x.getText(),ctx.y.getText());
		} else {	
			Map<String,String> params = new HashMap<>(); //add params
			params.put(ctx.a1.id.getText(), ctx.a1.value.getText());
			params.put(ctx.a2.id.getText(), ctx.a2.value.getText());
			
			if (!params.containsKey("x")) { //check if mandatory params exist
				System.err.println("Adding a point requires an X coordinate!");
				System.exit(1);
			}
			
			if (!params.containsKey("y")) {
				System.err.println("Adding a point requires a Y coordinate!");
				System.exit(1);
			}
				String ptx="";
				String pty="";
				
				for (Map.Entry<String, String> entry : params.entrySet()) { //add values to shape
					if (entry.getKey().equals("x")) ptx=entry.getValue();
					else if (entry.getKey().equals("y")) pty=entry.getValue();
				}
				
				s.add(ptx, pty);
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAddq(@NotNull RulesParser.AddqContext ctx) {
		
		if (!vars.containsKey(ctx.a.getText())) {
			System.err.println("Variable \""+ctx.a.getText()+"\" not found.");
        	System.exit(1);
		}
		
		Shape s = vars.get(ctx.a.getText());
		
		if (s.isPath()) {
			if (s.isClosed()) {
				System.out.println("Warning: Trying to add a quadratic curve to a path that is already closed.");
				return;
			}
			
			Map<String,String> params = new HashMap<>(); //add params
			params.put(ctx.a1.id.getText(), ctx.a1.value.getText());
			params.put(ctx.a2.id.getText(), ctx.a2.value.getText());
			params.put(ctx.a3.id.getText(), ctx.a3.value.getText());
			params.put(ctx.a4.id.getText(), ctx.a4.value.getText());
			
			if (!params.containsKey("x")) { //check if mandatory params exist
				System.err.println("Adding a quadratic curve to path requires an X coordinate!");
				System.exit(1);
			}
			
			if (!params.containsKey("y")) {
				System.err.println("Adding a quadratic curve to path requires a Y coordinate!");
				System.exit(1);
			}
			
			if (!params.containsKey("bx")) {
				System.err.println("Adding a quadratic curve to path requires an X coordinate for the Bezier point!");
				System.exit(1);
			}
			
			if (!params.containsKey("by")) {
				System.err.println("Adding a quadratic curve to path requires a Y coordinate for the Bezier point!");
				System.exit(1);
			}
			
			String ptx="";
			String pty="";
			String bptx="";
			String bpty="";
			
			for (Map.Entry<String, String> entry : params.entrySet()) { //add values to shape
				if (entry.getKey().equals("x")) ptx=entry.getValue();
				else if (entry.getKey().equals("y")) pty=entry.getValue();
				else if (entry.getKey().equals("bx")) bptx=entry.getValue();
				else if (entry.getKey().equals("by")) bpty=entry.getValue();
			}
			
			s.addQ(bptx, bpty, ptx, pty);
		} else {
			System.out.println("Warning: trying to add a quadratic curve to a structure that isn't a path.");
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAddcurve(@NotNull RulesParser.AddcurveContext ctx) { 
		
		if (!vars.containsKey(ctx.a.getText())) {
			System.err.println("Variable \""+ctx.a.getText()+"\" not found.");
        	System.exit(1);
		}
		
		Shape s = vars.get(ctx.a.getText());
		
		if (s.isPath()) {
			if (s.isClosed()) {
				System.out.println("Warning: Trying to add a curve to a path that is already closed.");
				return;
			}
			
			Map<String,String> params = new HashMap<>(); //add params
			params.put(ctx.a1.id.getText(), ctx.a1.value.getText());
			params.put(ctx.a2.id.getText(), ctx.a2.value.getText());
			params.put(ctx.a3.id.getText(), ctx.a3.value.getText());
			params.put(ctx.a4.id.getText(), ctx.a4.value.getText());
			if (ctx.a5!=null) params.put(ctx.a5.id.getText(), ctx.a5.value.getText());
			if (ctx.a6!=null) params.put(ctx.a6.id.getText(), ctx.a6.value.getText());
			
			int amount = params.size();
			
			if (!params.containsKey("x")) { //check if mandatory params exist
				System.err.println("Adding a curve to path requires an X coordinate!");
				System.exit(1);
			}
			
			if (!params.containsKey("y")) {
				System.err.println("Adding a curve to path requires a Y coordinate!");
				System.exit(1);
			}
			
			if (!params.containsKey("bx")) {
				System.err.println("Adding a curve to path requires an X coordinate for the Bezier point!");
				System.exit(1);
			}
			
			if (!params.containsKey("by")) {
				System.err.println("Adding a curve to path requires a Y coordinate for the Bezier point!");
				System.exit(1);
			}
			
			if (amount>4 && !params.containsKey("bx2")) {
				System.err.println("Adding a curve to path requires an X coordinate for the 2nd Bezier point!");
				System.exit(1);
			}
			
			if (amount>4 && !params.containsKey("by2")) {
				System.err.println("Adding a curve to path requires a Y coordinate for the 2nd Bezier point!");
				System.exit(1);
			}
			
			String ptx="";
			String pty="";
			String bptx="";
			String bpty="";
			String bpt2x="";
			String bpt2y="";
			
			for (Map.Entry<String, String> entry : params.entrySet()) { //add values to shape
				if (entry.getKey().equals("x")) ptx=entry.getValue();
				else if (entry.getKey().equals("y")) pty=entry.getValue();
				else if (entry.getKey().equals("bx")) bptx=entry.getValue();
				else if (entry.getKey().equals("by")) bpty=entry.getValue();
				else if (entry.getKey().equals("bx2")) bpt2x=entry.getValue();
				else if (entry.getKey().equals("by2")) bpt2y=entry.getValue();
			}
			
			if (amount>4) s.addC(bptx, bpty, bpt2x, bpt2y, ptx, pty);
			else s.addS(bptx, bpty, ptx, pty);
			
		} else {
			System.out.println("Warning: trying to add a curve to a structure that isn't a path.");
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitClose(@NotNull RulesParser.CloseContext ctx) { 
		
		if (!vars.containsKey(ctx.a.getText())) {
			System.err.println("Variable \""+ctx.a.getText()+"\" not found.");
        	System.exit(1);
		}
		
		Shape s = vars.get(ctx.a.getText());
		
		s.close();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDraw(@NotNull RulesParser.DrawContext ctx) {
		
		if (ctx.a!=null) { //get var
			if (!vars.containsKey(ctx.a.getText())) {
				System.err.println("Variable \""+ctx.a.getText()+"\" not found.");
	        	System.exit(1);
			}
			System.out.println("printing var "+ctx.a.getText()+": "+vars.get(ctx.a.getText()));
			printMemory.add(vars.get(ctx.a.getText()).toString());
			maxSize = Math.max(maxSize,vars.get(ctx.a.getText()).getHighestPos());
		} else { //draw shape
		printMemory.add(memory.toString());
		maxSize = Math.max(maxSize,memory.getHighestPos());
		System.out.println("printing: "+memory);

		}
		
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPath(@NotNull RulesParser.PathContext ctx) { 
		Path c = new Path();
		
		c.setX(ctx.x.getText());
		c.setY(ctx.y.getText());

		Map<String,String> params = new HashMap<>(); //add params
		if (ctx.a1!=null) params.put(ctx.a1.id.getText(), ctx.a1.value.getText());
		if (ctx.a2!=null) params.put(ctx.a2.id.getText(), ctx.a2.value.getText());
		if (ctx.a3!=null) params.put(ctx.a3.id.getText(), ctx.a3.value.getText());
		
		for (Map.Entry<String, String> entry : params.entrySet()) { //add values to shape
			if (entry.getKey().equals("c") || entry.getKey().equals("color")) c.setColor(entry.getValue());
			else if (entry.getKey().equals("s") || entry.getKey().equals("stroke")) c.setStroke(entry.getValue());
			else if (entry.getKey().equals("sw") || entry.getKey().equals("stroke-width")) c.setStrokeWidth(entry.getValue());
		}
		memory=c; //add to memory
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterStar(@NotNull RulesParser.StarContext ctx) {
		Star c = new Star();

		Map<String,String> params = new HashMap<>(); //add params
		params.put(ctx.a1.id.getText(), ctx.a1.value.getText());
		params.put(ctx.a2.id.getText(), ctx.a2.value.getText());
		params.put(ctx.a3.id.getText(), ctx.a3.value.getText());
		params.put(ctx.a4.id.getText(), ctx.a4.value.getText());
		params.put(ctx.a5.id.getText(), ctx.a5.value.getText());
		if (ctx.a6!=null) params.put(ctx.a6.id.getText(), ctx.a6.value.getText());
		if (ctx.a7!=null) params.put(ctx.a7.id.getText(), ctx.a7.value.getText());
		if (ctx.a8!=null) params.put(ctx.a8.id.getText(), ctx.a8.value.getText());
		
		if (!params.containsKey("x")) { //check if mandatory params exist
			System.err.println("Star requires an X coordinate for its center!");
			System.exit(1);
		}
		
		if (!params.containsKey("y")) {
			System.err.println("Star requires a Y coordinate for its center!");
			System.exit(1);
		}
		
		if (!params.containsKey("r") && !params.containsKey("radius")) {
			System.err.println("Star requires a radius!");
			System.exit(1);
		}
		
		if (!params.containsKey("inner") && !params.containsKey("innerRadius")) {
			System.err.println("Star requires an inner radius!");
			System.exit(1);
		}
		
		if (!params.containsKey("n") && !params.containsKey("nTips")) {
			System.err.println("Star requires a number of tips!");
			System.exit(1);
		}
		
		for (Map.Entry<String, String> entry : params.entrySet()) { //add values to shape
			if (entry.getKey().equals("x")) c.setX(entry.getValue());
			else if (entry.getKey().equals("y")) c.setY(entry.getValue());
			else if (entry.getKey().equals("r") || entry.getKey().equals("radius")) c.setRadius(entry.getValue());
			else if (entry.getKey().equals("c") || entry.getKey().equals("color")) c.setColor(entry.getValue());
			else if (entry.getKey().equals("inner") || entry.getKey().equals("innerRadius")) c.setInnerRadius(entry.getValue());
			else if (entry.getKey().equals("n") || entry.getKey().equals("nTips")) c.setNTips(entry.getValue());
			else if (entry.getKey().equals("s") || entry.getKey().equals("stroke")) c.setStroke(entry.getValue());
			else if (entry.getKey().equals("sw") || entry.getKey().equals("stroke-width")) c.setStrokeWidth(entry.getValue());
		}
		memory=c; //add to memory
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitSetvar(@NotNull RulesParser.SetvarContext ctx) {
		
		if (ctx.ID().size()>1) { //var = shape, ou criar array
			for (int i=1;i<ctx.ID().size();i++) {
				if (!vars.containsKey(ctx.ID(i).getText())) {
					System.err.println("Variable \""+ctx.ID(i).getText()+"\" not found.");
	            	System.exit(1);
				}
			}
		}
		
		int amount = ctx.ID().size();
		
		if (ctx.s!=null) { // var = shape
			vars.put(ctx.a.getText(), memory);
			
		} else if (ctx.x!=null) { //new array or clone
			if (amount>2) { //new array
				Group temp = new Group();
				for (int i=1;i<ctx.ID().size();i++) {
					String var = ctx.ID(i).getText();
					temp.addShape(vars.get(var));
				}
				vars.put(ctx.a.getText(), temp);		
			} else { //clone
				Shape n = vars.get(ctx.x.getText());
				vars.put(ctx.a.getText(), n);
			}
			
		} else if (ctx.ar!=null) { //force array
			Group temp = new Group();
			if (ctx.ID().size()>1) {
				for (int i=1;i<ctx.ID().size();i++) {
					String var = ctx.ID(i).getText();
					temp.addShape(vars.get(var));
				}	
			}
			vars.put(ctx.a.getText(), temp);
			
		} else if (ctx.d!=null) { //add to array
			if (!vars.containsKey(ctx.a.getText())) {
				System.err.println("Variable \""+ctx.a.getText()+"\" not found.");
            	System.exit(1);
			}
			
			for (int i=1;i<ctx.ID().size();i++) {
				String var = ctx.ID(i).getText();
				vars.get(ctx.a.getText()).addShape(vars.get(var));
			}
			
		} else if (ctx.r!=null) { //remove from array
			if (!vars.containsKey(ctx.a.getText())) {
				System.err.println("Variable \""+ctx.a.getText()+"\" not found.");
            	System.exit(1);
			}
			
			for (int i=1;i<ctx.ID().size();i++) {
				String var = ctx.ID(i).getText();
				vars.get(ctx.a.getText()).removeShape(vars.get(var));
			}
			System.out.println("Updated: "+vars.get(ctx.a.getText()));
		} else if (ctx.g!=null) { //force array
			ClipPath temp = new ClipPath();
			if (ctx.ID().size()>1) {
				for (int i=1;i<ctx.ID().size();i++) {
					String var = ctx.ID(i).getText();
					temp.addShape(vars.get(var));
				}	
			}
			vars.put(ctx.a.getText(), temp);
			
		}
		
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterLine(@NotNull RulesParser.LineContext ctx) {
		Line c = new Line();

		Map<String,String> params = new HashMap<>(); //add params

		c.setX(ctx.i1.getText());
		c.setY(ctx.i2.getText());
		c.setX2(ctx.i3.getText());
		c.setY2(ctx.i4.getText());
		
		if (ctx.a5!=null) params.put(ctx.a5.id.getText(), ctx.a5.value.getText());
		if (ctx.a6!=null) params.put(ctx.a6.id.getText(), ctx.a6.value.getText());
		
		for (Map.Entry<String, String> entry : params.entrySet()) { //add values to shape
			if (entry.getKey().equals("s") || entry.getKey().equals("stroke") ||
					entry.getKey().equals("c") || entry.getKey().equals("color")) c.setStroke(entry.getValue());
			else if (entry.getKey().equals("sw") || entry.getKey().equals("stroke-width")) c.setStrokeWidth(entry.getValue());
		}
		memory=c; //add to memory
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterMain(@NotNull RulesParser.MainContext ctx) {
		try {
			printMemory = new ArrayList<>();
			vars = new HashMap<>();
			f = new File("output.html");
			if (!f.exists()) f.createNewFile();
			fw = new FileWriter(f);
			
			fw.write("<!DOCTYPE html>\n\n<html>\n\t<body>\n");
			
		} catch (IOException e) {
			System.err.println("Error setting up output file!");
			System.exit(1);
		}

	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitMain(@NotNull RulesParser.MainContext ctx) {
		try {
			fw.write("\t\t<svg height=\""+(maxSize+1)+"\" width=\""+(maxSize+1)+"\">\n");
			for (String sh : printMemory) {
				fw.write("\t\t\t"+sh+"\n");
			}
			fw.write("\t\t</svg>\n");
			fw.write("\t</body>\n");
			fw.write("</html>");
			fw.close();
			System.out.println("File 'output.html' has been generated.");
		} catch (IOException e) {
			System.err.println("Error printing to output file!");
			System.exit(1);
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterEllipse(@NotNull RulesParser.EllipseContext ctx) {
		Ellipse c = new Ellipse();

		Map<String,String> params = new HashMap<>(); //add params
		params.put(ctx.a1.id.getText(), ctx.a1.value.getText());
		params.put(ctx.a2.id.getText(), ctx.a2.value.getText());
		params.put(ctx.a3.id.getText(), ctx.a3.value.getText());
		params.put(ctx.a4.id.getText(), ctx.a4.value.getText());
		if (ctx.a5!=null) params.put(ctx.a5.id.getText(), ctx.a5.value.getText());
		if (ctx.a6!=null) params.put(ctx.a6.id.getText(), ctx.a6.value.getText());
		if (ctx.a7!=null) params.put(ctx.a7.id.getText(), ctx.a7.value.getText());
		
		if (!params.containsKey("x")) { //check if mandatory params exist
			System.err.println("Ellipse requires an X coordinate for its center!");
			System.exit(1);
		}
		
		if (!params.containsKey("y")) {
			System.err.println("Ellipse requires a Y coordinate for its center!");
			System.exit(1);
		}
		
		if (!params.containsKey("w") && !params.containsKey("width")) {
			System.err.println("Ellipse requires a width (horizontal radius)!");
			System.exit(1);
		}
		
		if (!params.containsKey("h") && !params.containsKey("height")) {
			System.err.println("Ellipse requires a height (vertical radius)!");
			System.exit(1);
		}
		
		for (Map.Entry<String, String> entry : params.entrySet()) { //add values to shape
			if (entry.getKey().equals("x")) c.setX(entry.getValue());
			else if (entry.getKey().equals("y")) c.setY(entry.getValue());
			else if (entry.getKey().equals("w") || entry.getKey().equals("width")) c.setRadiusX(entry.getValue());
			else if (entry.getKey().equals("h") || entry.getKey().equals("height")) c.setRadiusY(entry.getValue());
			else if (entry.getKey().equals("c") || entry.getKey().equals("color")) c.setColor(entry.getValue());
			else if (entry.getKey().equals("s") || entry.getKey().equals("stroke")) c.setStroke(entry.getValue());
			else if (entry.getKey().equals("sw") || entry.getKey().equals("stroke-width")) c.setStrokeWidth(entry.getValue());
		}
		memory=c; //add to memory
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterCircle(@NotNull RulesParser.CircleContext ctx) {
		Circle c = new Circle();

		Map<String,String> params = new HashMap<>(); //add params
		params.put(ctx.a1.id.getText(), ctx.a1.value.getText());
		params.put(ctx.a2.id.getText(), ctx.a2.value.getText());
		params.put(ctx.a3.id.getText(), ctx.a3.value.getText());
		if (ctx.a4!=null) params.put(ctx.a4.id.getText(), ctx.a4.value.getText());
		if (ctx.a5!=null) params.put(ctx.a5.id.getText(), ctx.a5.value.getText());
		if (ctx.a6!=null) params.put(ctx.a6.id.getText(), ctx.a6.value.getText());
		
		if (!params.containsKey("x")) { //check if mandatory params exist
			System.err.println("Circle requires an X coordinate for its center!");
			System.exit(1);
		}
		
		if (!params.containsKey("y")) {
			System.err.println("Circle requires a Y coordinate for its center!");
			System.exit(1);
		}
		
		if (!params.containsKey("r") && !params.containsKey("radius")) {
			System.err.println("Circle requires a radius!");
			System.exit(1);
		}
		
		for (Map.Entry<String, String> entry : params.entrySet()) { //add values to shape
			if (entry.getKey().equals("x")) c.setX(entry.getValue());
			else if (entry.getKey().equals("y")) c.setY(entry.getValue());
			else if (entry.getKey().equals("r") || entry.getKey().equals("radius")) c.setRadius(entry.getValue());
			else if (entry.getKey().equals("c") || entry.getKey().equals("color")) c.setColor(entry.getValue());
			else if (entry.getKey().equals("s") || entry.getKey().equals("stroke")) c.setStroke(entry.getValue());
			else if (entry.getKey().equals("sw") || entry.getKey().equals("stroke-width")) c.setStrokeWidth(entry.getValue());
		}
		memory=c; //add to memory
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterCommand(@NotNull RulesParser.CommandContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitCommand(@NotNull RulesParser.CommandContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterSq(@NotNull RulesParser.SqContext ctx) {
		Rectangle c = new Rectangle();

		Map<String,String> params = new HashMap<>(); //add params
		params.put(ctx.a1.id.getText(), ctx.a1.value.getText());
		params.put(ctx.a2.id.getText(), ctx.a2.value.getText());
		params.put(ctx.a3.id.getText(), ctx.a3.value.getText());
		if (ctx.a4!=null) params.put(ctx.a4.id.getText(), ctx.a4.value.getText());
		if (ctx.a5!=null) params.put(ctx.a5.id.getText(), ctx.a5.value.getText());
		if (ctx.a6!=null) params.put(ctx.a6.id.getText(), ctx.a6.value.getText());
		
		if (!params.containsKey("x")) { //check if mandatory params exist
			System.err.println("Rectangle requires an X coordinate for its upper-left corner!");
			System.exit(1);
		}
		
		if (!params.containsKey("y")) {
			System.err.println("Rectangle requires a Y coordinate for its upper-left corner!");
			System.exit(1);
		}
		
		if (!params.containsKey("w") && !params.containsKey("width") &&
				!params.containsKey("h") && !params.containsKey("height")) {
			System.err.println("Rectangle requires a width or height!");
			System.exit(1);
		}
		
		for (Map.Entry<String, String> entry : params.entrySet()) { //add values to shape
			if (entry.getKey().equals("x")) c.setX(entry.getValue());
			else if (entry.getKey().equals("y")) c.setY(entry.getValue());
			else if (entry.getKey().equals("w") || entry.getKey().equals("width") ||
					entry.getKey().equals("h") || entry.getKey().equals("height")) {
						c.setWidth(entry.getValue());
						c.setHeight(entry.getValue());
					}
			else if (entry.getKey().equals("c") || entry.getKey().equals("color")) c.setColor(entry.getValue());
			else if (entry.getKey().equals("s") || entry.getKey().equals("stroke")) c.setStroke(entry.getValue());
			else if (entry.getKey().equals("sw") || entry.getKey().equals("stroke-width")) c.setStrokeWidth(entry.getValue());
		}
		memory=c; //add to memory
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitSq(@NotNull RulesParser.SqContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterPolyline(@NotNull RulesParser.PolylineContext ctx) {
		Polyline c = new Polyline();

		Map<String,String> params = new HashMap<>(); //add params
		if (ctx.a1!=null) params.put(ctx.a1.id.getText(), ctx.a1.value.getText());
		if (ctx.a2!=null) params.put(ctx.a2.id.getText(), ctx.a2.value.getText());
		if (ctx.a3!=null) params.put(ctx.a3.id.getText(), ctx.a3.value.getText());
		
		for (int i=0;i<ctx.INT().size();i+=2) {
			c.addX(ctx.INT(i).getText());
			c.addY(ctx.INT(i+1).getText());
		}
		
		for (Map.Entry<String, String> entry : params.entrySet()) { //add values to shape
			if (entry.getKey().equals("c") || entry.getKey().equals("color")) c.setColor(entry.getValue());
			else if (entry.getKey().equals("s") || entry.getKey().equals("stroke")) c.setStroke(entry.getValue());
			else if (entry.getKey().equals("sw") || entry.getKey().equals("stroke-width")) c.setStrokeWidth(entry.getValue());
		}
		memory=c; //add to memory
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPolygon(@NotNull RulesParser.PolygonContext ctx) { 
		Polygon c = new Polygon();

		Map<String,String> params = new HashMap<>(); //add params
		if (ctx.a1!=null) params.put(ctx.a1.id.getText(), ctx.a1.value.getText());
		if (ctx.a2!=null) params.put(ctx.a2.id.getText(), ctx.a2.value.getText());
		if (ctx.a3!=null) params.put(ctx.a3.id.getText(), ctx.a3.value.getText());
		
		for (int i=0;i<ctx.INT().size();i+=2) {
			c.addX(ctx.INT(i).getText());
			c.addY(ctx.INT(i+1).getText());
		}
		
		for (Map.Entry<String, String> entry : params.entrySet()) { //add values to shape
			if (entry.getKey().equals("c") || entry.getKey().equals("color")) c.setColor(entry.getValue());
			else if (entry.getKey().equals("s") || entry.getKey().equals("stroke")) c.setStroke(entry.getValue());
			else if (entry.getKey().equals("sw") || entry.getKey().equals("stroke-width")) c.setStrokeWidth(entry.getValue());
		}
		memory=c; //add to memory
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterEveryRule(@NotNull ParserRuleContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitEveryRule(@NotNull ParserRuleContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void visitTerminal(@NotNull TerminalNode node) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void visitErrorNode(@NotNull ErrorNode node) {
	}
}