package egovframework.sr.board.controller;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import egovframework.sr.board.service.SrBoardService;
import egovframework.sr.board.vo.SrBoardPageVO;

@Controller
public class SrBoardController {

	@Resource(name = "SrService")
	private SrBoardService SrBoardService;

	
	@RequestMapping("/hello.do")
	public @ResponseBody String HelloWorldTest() {
		
		return "Hello World!!";
	}
	
	@RequestMapping("/testDB.do")
	public @ResponseBody String testDB() throws Exception{
	
		try {
			SrBoardService.testDB();
			return "success";
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "false";
		}
	}
	@RequestMapping("/srBoardList.do")
	public String SrBoardList(Model model) throws Exception{
	
		List<?> result = SrBoardService.selectSrBoardList(new SrBoardPageVO("1", "1", "1", 1, 1, 1, 1, 1, 1));
		model.addAttribute("value",result);
		return "srBoard/SrBoardList";
	}
	
}
