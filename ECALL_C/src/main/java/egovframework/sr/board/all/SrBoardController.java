package egovframework.sr.board.all;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SrBoardController {

	@Resource(name = "SrService")
	private SrBoardService SrBoardService;

	
	@GetMapping("/hello.do")
	public @ResponseBody String HelloWorldTest() {
		
		return "Hello World!!";
	}
	
	@GetMapping("/testDB.do")
	public @ResponseBody String testDB() throws Exception{
	
		try {
			List<SrBoardVO2> test = SrBoardService.testDB();
			return test.toString();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
}
