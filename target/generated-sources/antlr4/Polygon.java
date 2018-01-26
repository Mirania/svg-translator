import java.util.ArrayList;
import java.util.List;

public class Polygon extends Shape {

	private List<Integer> x = new ArrayList<>();
	private List<Integer> y = new ArrayList<>();
	private String strokecolor;
	private int strokewidth;
	
	@Override
	public void move(String cx, String cy){
		int numx = Integer.parseInt(cx);
		int numy = Integer.parseInt(cy);
		for (int i=0;i<x.size();i++) {
			x.set(i, x.get(i)+numx);
			y.set(i, y.get(i)+numy);
		}
	}
	
	public void addX(String newx) {
		int numx = Integer.parseInt(newx);
		x.add(numx);
	}
	
	public void addY(String newy) {
		int numy = Integer.parseInt(newy);
		y.add(numy);
	}
	
	public void setColor(String c) {
		super.setColor(c);
	}

	public void setStroke(String c) {
		strokecolor=c;
	}
	
	public void setStrokeWidth(String w) {
		int numw = Integer.parseInt(w);
		strokewidth=numw;
	}

	public int getHighestPos() {
		int a=0;
		int b=0;
		for (Integer value : x) {
			a = Math.max(a, value);
		}
		for (Integer value : y) {
			b = Math.max(b, value);
		}
		return Math.max(Math.max(a*super.getscX(), b*super.getscY()), b*super.getscX());
	}
	
	public String toString() {
		
		String res="";
		
		if (super.Link()) {
			String l = super.getLink().replace("\"", "");
			res+="<a xlink:href=\"http://"+l+"\" target=\"_blank\">\n\t";
		}
		
		res += "<polygon points=\"";
		
		for (int i=0;i<x.size();i++) {
			if (i==x.size()-1) res += x.get(i)+","+y.get(i);
			else res += x.get(i)+","+y.get(i)+" ";
		}
		
		res+="\"";
		
		if (super.getColor()!=null) {res+=" fill="+super.getColor();}
		
		if (strokecolor!=null) {res+=" stroke="+strokecolor;}
		
		if (strokewidth>0 && strokecolor==null) {
			System.out.println("Warning: Polygon has stroke width set but no stroke color.");
		}
		else if (strokewidth>0) {
			res+=" stroke-width=\""+strokewidth+"\"";
		}
		
if (super.Rotate() || super.ScaleX()) res+=" transform=\"";
		
		if (super.Rotate()) {
			res+="rotate("+super.getRotateAngle()+" "+super.getrX()+","+super.getrY()+")";
			
			if (!super.ScaleX()) {res+="\"";}
		}
		
		if (super.ScaleX()) {
			
			if (!super.Rotate()) res+="scale("+super.getscX();
			else res+=" scale("+super.getscX();
			
			if (super.ScaleY()) {
				res+=","+super.getscY();
			}
			
			res+=")\"";

		}
		
		res+=this.getClip()+" />";
		
		if (super.Link()) res+="\n</a>";
		
		return res;
		
	}
}
