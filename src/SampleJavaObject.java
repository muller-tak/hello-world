
public class SampleJavaObject {
	public int id;
	public String name;
	
	public SampleJavaObject(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getIdName() {
		return String.valueOf(id)+name;
	}
}
