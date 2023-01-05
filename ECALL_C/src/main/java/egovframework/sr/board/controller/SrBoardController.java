package egovframework.sr.board.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import egovframework.sr.board.service.SrBoardService;
import egovframework.sr.board.vo.PageNationInfo;
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
	public String SrBoardList(@RequestParam(value = "currentPageNo", defaultValue = "1")int currentPageNo
								,String searchKeyword,int dateType,@RequestParam(value = "startDate", defaultValue = "")String startDate
								,@RequestParam(value = "endDate", defaultValue = "")String endDate,int request,int srSequence,int path
								,Model model) throws Exception{
		if(startDate.equals(""))
		{
			startDate = "1992-12-20";
			
		}
		if(endDate.equals(""))
		{
			SimpleDateFormat format = new SimpleDateFormat("yyyyy-MM-dd");
			endDate = format.format(new Date());
			
		}
		
		PageNationInfo pageInfo = new PageNationInfo(currentPageNo, 10, 10, 0);
		SrBoardPageVO pageVO = new SrBoardPageVO();
		pageVO.setPageIndex(currentPageNo);
		pageVO.setFirstIndex(pageInfo.getFirstPageNoOnPageList());
		pageVO.setLastIndex(pageInfo.getLastPageNoOnPageList());
		pageVO.setSearchKeyword(searchKeyword);
		pageVO.setPath(path);
		pageVO.setRequest(request);
		pageVO.setSrSequence(srSequence);
		pageVO.setDateType(dateType);
		pageVO.setStartDate(pageInfo.convert(startDate));
		pageVO.setEndDate(pageInfo.convert(endDate));
		int totcnt = SrBoardService.selectSrBoardListTotCnt(pageVO);
		
		
		List<?> result = SrBoardService.selectSrBoardList(pageVO);
		int totalRecordCount = SrBoardService.selectSrBoardListTotCnt(pageVO);
		
		
		
		pageVO.setLastIndex(pageInfo.getLastPageNoOnPageList());
		model.addAttribute("value",result);
		return "srBoard/SrBoardList";
	}
	
}
