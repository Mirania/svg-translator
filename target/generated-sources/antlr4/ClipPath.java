
public class ClipPath extends Group{
	private static int clipPathID=1;
	private int ID;
	
	public ClipPath(){
		this.ID=clipPathID++;
		this.setClip();
	}
	
	
	public int getID(){
		return this.ID;
	}
	
	
	
	@Override
	public String toString() {
		String res="";
		res+="<clipPath id=\"ClipPath"+ID+"\">\n\t\t\t";
		res+=super.toString();
		res+="\n\t\t\t</clipPath>";
		return res;
	}
	
}
