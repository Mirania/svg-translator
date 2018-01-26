import java.util.ArrayList;

public class Group extends Shape {

	private ArrayList<Shape> shapes=new ArrayList<Shape>();
	
	public Group() {
		super.setIsList(true);
	}
	
	public ArrayList<Shape> getShapes() {
		return shapes;
	}
	
	public void addShape(Shape shape) {
		System.out.println(shape);
		shapes.add(shape);
	}
	
	public void removeShape(Shape var) {
		shapes.remove(var);
	}
	
	@Override
	public int getListSize() {
		return shapes.size();
	}
	
	public void setRotateAngle(String a) {
		for (Shape s : shapes) {
			s.setRotateAngle(a);
		}
	}
	
	public void setRotateX(String x) {
		for (Shape s : shapes){
			s.setRotateX(x);
		}
	};
	
	public void setRotateY(String y) {
		for (Shape s : shapes) {
			s.setRotateY(y);
		}
	};
	
	public void setScaleX(String x) {
		for (Shape s : shapes) {
			s.setScaleX(x);
		}
	};
	
	public void setScaleY(String y) {
		for (Shape s : shapes) {
			s.setScaleY(y);
		}
	};
	
	public void add(String newx, String newy) {
		for (Shape s : shapes) {
			s.add(newx,newy);
		}
	}
	
	public void addC(String bpt1x, String bpt1y, String bpt2x, String bpt2y, String newx, String newy) {
		for (Shape s : shapes) {
			s.addC(bpt1x,bpt1y,bpt2x,bpt2y,newx,newy);
		}
	}
	
	public void addS(String bpt1x, String bpt1y, String newx, String newy) {
		for (Shape s : shapes) {
			s.addS(bpt1x,bpt1y,newx,newy);
		}
	}
	
	public void addQ(String bpt1x, String bpt1y, String newx, String newy) {
		for (Shape s : shapes) {
			s.addQ(bpt1x,bpt1y,newx,newy);
		}
	}
	
	public void close() {
		for (Shape s : shapes) {
			s.close();
		}
	}
	
	public void setLink(String st) {
		for (Shape s : shapes) {
			s.setLink(st);
		}
	}
	public void clip(int id){
		for (Shape s : shapes) {
			s.clip(id);
		}
	}
	public String toString() {
		String res="";
		
		if (shapes.size()==0) return res;
		if (shapes.size()==1) return shapes.get(0).toString();
		
		for (int i=0;i<shapes.size();i++) {
			if (i==0) res+=shapes.get(i)+"\n"; //first
			else if (i<shapes.size()-1) res+="\t\t\t"+shapes.get(i)+"\n"; //middle
			else res+="\t\t\t"+shapes.get(i); //last
		}
		
		return res;
	}
	
	public int getHighestPos() {
		int x=0;
		for (Shape s : shapes) {
			x = Math.max(x, s.getHighestPos());
		}
		return x;
	}
	
	@Override
	public void move(String cx, String cy){
		for (Shape s : shapes) {
			s.move(cx,cy);
		}
	}
}
