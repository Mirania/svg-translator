
public class Line extends Shape {

	private int x2;
	private int y2;
	private String strokecolor="\"black\""; //=color
	private int strokewidth;

	public void setX1(String x) {
		super.setX(x);		
	}
	
	public void setY1(String y) {
		super.setY(y);		
	}
	
	public void setX2(String x) {
		int numx = Integer.parseInt(x);
		x2=numx;		
	}
	
	public void setY2(String y) {
		int numy = Integer.parseInt(y);
		y2=numy;	
	}
	
	
	public void move(String newx, String newy) {
		int numx = Integer.parseInt(newx);
		super.setX(super.getX()+numx);
		int numy = Integer.parseInt(newy);
		super.setY(super.getY()+numy);
		x2+=numx;
		y2+=numy;
	}
	
	public void setStroke(String c) {
		strokecolor=c;
	}
	
	public void setStrokeWidth(String w) {
		int numw = Integer.parseInt(w);
		strokewidth=numw;
	}
	
	public int getHighestPos() {
		int distX = (Math.abs(super.getX()-x2))*super.getscX();
		int distY = Math.max(Math.abs(super.getY()-y2)*super.getscX(), (Math.abs(super.getY()-y2))*super.getscX());
		return (int) Math.sqrt(Math.pow(distX, 2)+Math.pow(distY, 2))+Math.max(super.getX(), super.getY());
	}
	
	public String toString() {
		
		String res="";
		
		if (super.Link()) {
			String l = super.getLink().replace("\"", "");
			res+="<a xlink:href=\"http://"+l+"\" target=\"_blank\">\n\t";
		}
		
		res += "<line x1=\""+super.getX()+"\" y1=\""+super.getY()+"\" x2=\""+x2+"\" y2=\""+y2+"\"";
		
		if (strokecolor!=null) {res+=" stroke="+strokecolor;}
		
		if (strokewidth>0 && strokecolor==null) {
			System.out.println("Warning: Line has stroke width set but no stroke color.");
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
		
		res+=" />";
		
		if (super.Link()) res+="\n</a>";
		
		return res;
		
	}
}
