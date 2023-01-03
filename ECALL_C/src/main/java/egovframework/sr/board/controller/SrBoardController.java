package egovframework.sr.board.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import org.junit.*;

import egovframework.sr.board.service.SrBoardService;
import egovframework.sr.board.vo.SrBoardPageVO;
import egovframework.sr.board.vo.SrBoardVO;

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
	public String SrBoardList() throws Exception{
	
		return "srBoard/SrBoardList";
	}
	/** 게시판 - 목록 조회 */
	@RequestMapping(value = "/getsrBoardList.do", method = RequestMethod.POST)
	@ResponseBody
	public List<?> getBoardList(@ModelAttribute("searchVO") SrBoardPageVO searchVO, ModelMap model) throws Exception {

		/** EgovPropertyService.sample */
		searchVO.setPageUnit(99999);
		searchVO.setPageSize(10);

		/** pageing setting */
		/*
		 * PaginationInfo paginationInfo = new PaginationInfo();
		 * paginationInfo.setCurrentPageNo(searchVO.getPageIndex());
		 * paginationInfo.setRecordCountPerPage(searchVO.getPageUnit());
		 * paginationInfo.setPageSize(searchVO.getPageSize());
		 * 
		 * searchVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
		 * searchVO.setLastIndex(paginationInfo.getLastRecordIndex());
		 * searchVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());
		 * 
		 * List<?> sampleList = sampleService.selectSampleList(searchVO);
		 * model.addAttribute("resultList", sampleList);
		 * 
		 * int totCnt = sampleService.selectSampleListTotCnt(searchVO);
		 * paginationInfo.setTotalRecordCount(totCnt);
		 * model.addAttribute("paginationInfo", paginationInfo);
		 */
		
		List<?> result = SrBoardService.selectSrBoardList(searchVO);

		return result;
	}
	
}
