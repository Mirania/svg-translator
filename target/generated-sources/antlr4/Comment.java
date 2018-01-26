import java.util.ArrayList;
import java.util.List;

public class Comment extends Shape {

		private List<String> lines = new ArrayList<>();		
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
		
		public void setStroke(String c) {
			strokecolor=c;
		}
		
		public void setStrokeWidth(String w) {
			int numw = Integer.parseInt(w);
			strokewidth=numw;
		}
		
		public void addLine(String s) {
			lines.add(s);
		}
		
		public int getHighestPos() {
			int longest=0;
			int x;
			int y;
			int z;
			for (String s : lines) longest = Math.max(longest, s.length());
			x = (super.getX()+longest)*strokewidth*super.getscX();
			y = (super.getY()+lines.size()*25)*strokewidth*super.getscY();
			z = (super.getY()+lines.size()*25)*strokewidth*super.getscX();
			return (int)
					Math.max(
					Math.sqrt(Math.pow(x,2)+Math.pow(y,2)),
					Math.sqrt(Math.pow(x,2)+Math.pow(z,2))
					);
		}
		
		public String toString() {
			
			String res="";
			
			if (super.Link()) {
				String l = super.getLink().replace("\"", "");
				res+="<a xlink:href=\"http://"+l+"\" target=\"_blank\">\n\t";
			}
			
			res += "<text x=\""+super.getX()+"\" y=\""+super.getY()+"\"";
			
			if (super.getColor()!=null) {res+=" fill="+super.getColor();}
			
			if (strokecolor!=null) {res+=" stroke="+strokecolor;}
			
			if (strokewidth>0 && strokecolor==null) {
				System.out.println("Warning: Comment has stroke width set but no stroke color.");
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
				
			res+=" >";
			
			for (int i=0;i<lines.size();i++) {
				if (i==0) {
					res+=lines.get(i);
				} else {
					int lineY = 25*i+super.getY();
					if (super.Link()) res+="\n\t\t";
					else res+="\n\t";
					res+="<tspan x=\""+super.getX()+"\" y=\""+lineY+"\">"+lines.get(i)+"</tspan>";
				}
			}
			
			if (lines.size()==1) res+="</text>";
			else if (super.Link()) res+="\n\t</text>";
			else res+="\n</text>";
			
			if (super.Link()) res+="\n</a>";
			
			return res;
			
		}
}
