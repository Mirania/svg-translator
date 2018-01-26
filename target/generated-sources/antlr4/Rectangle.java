
public class Rectangle extends Shape { //is also square

	private int width;
	private int height;
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
	
	public void setWidth(String w) {
		int numw = Integer.parseInt(w);
		width=numw;
	}
	
	public void setHeight(String h) {
		int numh = Integer.parseInt(h);
		height=numh;
	}
	
	public void setStroke(String c) {
		strokecolor=c;
	}
	
	public void setStrokeWidth(String w) {
		int numw = Integer.parseInt(w);
		strokewidth=numw;
	}

	public int getHighestPos() {
		return (int)
				Math.max(
				Math.sqrt(Math.pow((super.getX()+width)*super.getscX(),2)+Math.pow((super.getY()+width)*super.getscY(),2)),
				Math.sqrt(Math.pow((super.getX()+width)*super.getscX(),2)+Math.pow((super.getY()+width)*super.getscX(),2))
				);
	}
	
	public String toString() {
		
		String res="";
		
		if (super.Link()) {
			String l = super.getLink().replace("\"", "");
			res+="<a xlink:href=\"http://"+l+"\" target=\"_blank\">\n\t";
		}
		
		res += "<rect x=\""+super.getX()+"\" y=\""+super.getY()+"\" width=\""+width+"\" height=\""+height+"\"";
		
		if (super.getColor()!=null) {res+=" fill="+super.getColor();}
		
		if (strokecolor!=null) {res+=" stroke="+strokecolor;}
		
		if (strokewidth>0 && strokecolor==null) {
			if (width==height) System.out.println("Warning: Square has stroke width set but no stroke color.");
			else System.out.println("Warning: Rectangle has stroke width set but no stroke color.");
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
