package egovframework.sr.board.all;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@Resource(name = "SrService")
	private SrBoardService SrBoardService;
	
	@GetMapping("/main.do")
	public String mainPage() {
		return "main";
	}
}
