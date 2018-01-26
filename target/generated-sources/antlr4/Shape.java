
public class Shape {
	
	private int x;
	private int y;
	private String color="\"none\"";
	private boolean rotate=false;
	private int rotateAngle;
	private int rX;
	private int rY;
	private boolean scaleX=false;
	private boolean scaleY=false;
	private int scX=1;
	private int scY=1;
	private boolean hasLink=false;
	private String link;
	private boolean isPath=false; //add pts
	private boolean isPline=false; //add pts
	private boolean isList=false; //join arrays
	private boolean closed=false; //path
	private boolean clipped=false;  //clipPath
	private int clipID=-1;			//clipID
	private boolean isClip=false;
	
	
	
	public void move(String cx, String cy){
		int numx = Integer.parseInt(cx);
		x+=numx;
		int numy = Integer.parseInt(cy);
		y+=numy;
	}
	public void setX(String cx) {
		int numx = Integer.parseInt(cx);
		x=numx;
	};
	
	public void setY(String cy) {
		int numy = Integer.parseInt(cy);
		y=numy;
	};
	
	public void setX(int cx) {
		x=cx;
	};
	
	public void setY(int cy) {
		y=cy;
	};
	
	public int getHighestPos() {
		return 0; //assume-se que x maximo = y maximo devido a rotacao
	}
	
	public void setRotateAngle(String a) {
		rotate=true;
		int numa = Integer.parseInt(a);
		rotateAngle=numa;
		rX=x;
		rY=y;
	}
	
	public void setRotateX(String x) {
		int numx = Integer.parseInt(x);
		rX=numx;
	};
	
	public void setRotateY(String y) {
		int numy = Integer.parseInt(y);
		rY=numy;
	};
	
	public void setScaleX(String x) {
		scaleX=true; //ou global scale
		int numx = Integer.parseInt(x);
		scX=numx;
	};
	
	public void setScaleY(String y) {
		scaleY=true;
		int numy = Integer.parseInt(y);
		scY=numy;
	};
	
	public void setColor(String c) {
		this.color=c;
	};
	
	public String toString() {
		return "Generic shape";
	};
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getListSize() {
		return 0;
	}
	
	public void setIsList(boolean b) {
		isList=b;
	}
	
	public void setIsClosed(boolean b) {
		closed=b;
	}
	
	public void add(String newx, String newy) {
		System.out.println("Warning: Trying to add a point to a structure that isn't a path or polyline.");
	}
	
	public void addC(String bpt1x, String bpt1y, String bpt2x, String bpt2y, String newx, String newy) {
		System.out.println("Warning: Trying to add a curve to a structure that isn't a path or polyline.");
	}
	
	public void addS(String bpt1x, String bpt1y, String newx, String newy) {
		System.out.println("Warning: Trying to add a curve to a structure that isn't a path or polyline.");
	}
	
	public void addQ(String bpt1x, String bpt1y, String newx, String newy) {
		System.out.println("Warning: Trying to add a quadratic curve to a structure that isn't a path or polyline.");
	}
	
	public void close() {
		System.out.println("Warning: Trying to close a structure that isn't a path or polyline.");
	}
	
	public void addShape(Shape var) {
		System.out.println("Warning: Trying to add structures to a structure that isn't a container.");
	}
	
	public void removeShape(Shape var) {
		System.out.println("Warning: Trying to remove structures from a structure that isn't a container.");
	}
	
	public void setIsPath(boolean b) {
		isPath=b;
	}
	
	public void setIsPline(boolean b) {
		isPline=b;
	}
	
	public String getListShape(int i) {
		return null;
	}
	
	public boolean Rotate() {
		return rotate;
	}
	
	public boolean isList() {
		return isList;
	}
	
	public boolean isPath() {
		return isPath;
	}
	
	public boolean isPline() {
		return isPline;
	}
	
	public boolean isClosed() {
		return closed;
	}
	
	public boolean Link() {
		return hasLink;
	}

	public int getRotateAngle() {
		return rotateAngle;
	}
	
	public void setLink(String s) {
		hasLink=true;
		link=s;
	}
	
	public String getLink() {
		return link;
	}

	public int getrX() {
		return rX;
	}

	public int getrY() {
		return rY;
	}

	public boolean ScaleX() {
		return scaleX;
	}

	public boolean ScaleY() {
		return scaleY;
	}

	public int getscX() {
		return scX;
	}

	public int getscY() {
		return scY;
	}

	public String getColor() {
		return color;
	}
	
	public void clip(int id){
		this.clipped=true;
		this.clipID=id;
	}
	
	public boolean isClip(){
		return this.isClip;
	}
	
	public void setClip(){
		this.isClip=true;
	}
	
	public String getClip(){
		if (this.clipped){
			return " clip-path=\"url(#ClipPath"+clipID+")\"";
		} else return "";
	}
}
