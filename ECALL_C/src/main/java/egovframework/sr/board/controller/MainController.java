package egovframework.sr.board.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import egovframework.sr.board.service.SrBoardService;

@Controller
public class MainController {

	@Resource(name = "SrService")
	private SrBoardService SrBoardService;
	
	@GetMapping("/main.do")
	public String mainPage() {
		return "main";
	}
}
