
public class Circle extends Shape {


	private int radius;
	private String strokecolor;
	private int strokewidth;

	public void setX(String x) {
		super.setX(x);		
	}
	
	public void setY(String y) {
		super.setY(y);		
	}

	public void setColor(String c) {
		super.setColor(c);
	}
	
	public void setRadius(String r) {
		int numr = Integer.parseInt(r);
		radius=numr;
	}

	public void setStroke(String c) {
		strokecolor=c;
	}
	
	public void setStrokeWidth(String w) {
		int numw = Integer.parseInt(w);
		strokewidth=numw;
	}

	public int getHighestPos() {
		return Math.max(
				Math.max((super.getX()+radius)*super.getscX(),super.getY()+radius*super.getscY()),
						super.getY()+radius*super.getscX());
	}
	
	
	public String toString() {
		
		String res="";
		
		if (super.Link()) {
			String l = super.getLink().replace("\"", "");
			res+="<a xlink:href=\"http://"+l+"\" target=\"_blank\">\n\t";
		}
		
		res += "<circle cx=\""+super.getX()+"\" cy=\""+super.getY()+"\" r=\""+radius+"\"";
		
		if (super.getColor()!=null) {res+=" fill="+super.getColor();}
		
		if (strokecolor!=null) {res+=" stroke="+strokecolor;}
		
		if (strokewidth>0 && strokecolor==null) {
			System.out.println("Warning: Circle has stroke width set but no stroke color.");
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
