import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

// to test creation of branch in github, add this comment.
public class MyJsonParse {
	ObjectMapper mapper;
	
	MyJsonParse () {
		mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
	}
	
	void writer(Object json) throws JsonProcessingException {
		System.out.println(mapper.writeValueAsString(json));
	}
}
