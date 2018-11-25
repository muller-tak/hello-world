import com.fasterxml.jackson.core.JsonProcessingException;

// Github branch testing no 2.
public class HelloWorld {

	public static void main(String[] args) throws JsonProcessingException {
		System.out.println	("Hello world!");
		
		
		MyJsonParse mjParse = new MyJsonParse();
		SampleJavaObject hoge = new SampleJavaObject(1, "hoge");
		
		mjParse.writer(hoge);
	}

}
