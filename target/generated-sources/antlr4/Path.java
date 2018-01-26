import java.util.ArrayList;
import java.util.List;

public class Path extends Shape {
	
	private List<Integer> x = new ArrayList<>();
	private List<Integer> y = new ArrayList<>();
	private String strokecolor="\"black\"";
	private int strokewidth;
	private String content;

	public Path() {
		super.setIsPath(true);
		content = "";
	}
	
	@Override
	public void move(String cx, String cy){
		System.out.println("Warning: Path cannot be moved.");
	}
	
	public void setX(String newx) {
		super.setX(newx);
		x.add(Integer.parseInt(newx));
		content+="M "+newx+",";
	}
	
	public void setY(String newy) {
		super.setY(newy);
		y.add(Integer.parseInt(newy));
		content+=newy;
	}
	
	public void add(String newx, String newy) {
		if (super.isClosed()) {
			System.out.println("Warning: Trying to add a point to a path that is already closed.");
		} else {
			int numx = Integer.parseInt(newx);
			x.add(numx);
			int numy = Integer.parseInt(newy);
			y.add(numy);
			content+=" L "+newx+","+newy;
		}
	}
	
	public void addC(String bpt1x, String bpt1y, String bpt2x, String bpt2y, String newx, String newy) {
		if (super.isClosed()) {
			System.out.println("Warning: Trying to add a curve to a path that is already closed.");
		} else {
			int numx = Integer.parseInt(newx);
			x.add(numx);
			int numy = Integer.parseInt(newy);
			y.add(numy);
			int numbpt1x = Integer.parseInt(bpt1x);
			x.add(numbpt1x);
			int numbpt1y = Integer.parseInt(bpt1y);
			y.add(numbpt1y);
			int numbpt2x = Integer.parseInt(bpt2x);
			x.add(numbpt2x);
			int numbpt2y = Integer.parseInt(bpt2y);
			y.add(numbpt2y);
			content+=" C "+bpt1x+","+bpt1y+" "+bpt2x+","+bpt2y+" "+newx+","+newy;
		}
	}
	
	public void addS(String bpt1x, String bpt1y, String newx, String newy) {
		if (super.isClosed()) {
			System.out.println("Warning: Trying to add a curve to a path that is already closed.");
		} else {
			int numx = Integer.parseInt(newx);
			x.add(numx);
			int numy = Integer.parseInt(newy);
			y.add(numy);
			int numbpt1x = Integer.parseInt(bpt1x);
			x.add(numbpt1x);
			int numbpt1y = Integer.parseInt(bpt1y);
			y.add(numbpt1y);
			content+=" S "+bpt1x+","+bpt1y+" "+newx+","+newy;
		}
	}
	
	public void addQ(String bpt1x, String bpt1y, String newx, String newy) {
		int numx = Integer.parseInt(newx);
		x.add(numx);
		int numy = Integer.parseInt(newy);
		y.add(numy);
		int numbpt1x = Integer.parseInt(bpt1x);
		x.add(numbpt1x);
		int numbpt1y = Integer.parseInt(bpt1y);
		y.add(numbpt1y);
		content+=" Q "+bpt1x+","+bpt1y+" "+newx+","+newy;
	}
	
	public void close() {
		if (super.isClosed()) {
			System.out.println("Warning: Trying to close a path that is already closed.");
		} else {
			super.setIsClosed(true);
			content+=" Z";
		}
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
		for (Integer value : x) {
			a = Math.max(a, value);
		}
		int b=0;
		for (Integer value : y) {
			b = Math.max(b, value);
		}
		int x = a*super.getscX();
		int y = Math.max(b*super.getscY(), b*super.getscX());
		return (int) Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
	}
	
	public String toString() {
		
		String res="";
		
		if (super.Link()) {
			String l = super.getLink().replace("\"", "");
			res+="<a xlink:href=\"http://"+l+"\" target=\"_blank\">\n\t";
		}
		
		res += "<path d=\""+content+"\"";
		
		if (super.getColor()!=null) {res+=" fill="+super.getColor();}
		
		if (strokecolor!=null) {res+=" stroke="+strokecolor;}
		
		if (strokewidth>0 && strokecolor==null) {
			System.out.println("Warning: Path has stroke width set but no stroke color.");
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
