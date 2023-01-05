package egovframework.sr.board.service;

import java.util.List;

import egovframework.sr.board.vo.PageNationInfo;
import egovframework.sr.board.vo.SrBoardPageVO;
import egovframework.sr.board.vo.SrBoardVO;

public interface SrBoardService {
	public void WriteSrBoard(SrBoardVO srBoardVO) throws Exception;
	
	public void RemoveSrBoard (int idx) throws Exception;
	
	public SrBoardVO GetSrBoardById (int idx) throws Exception;
	
	public SrBoardVO selectSrBoard(SrBoardVO vo) throws Exception;

	public List<?> selectSrBoardList(SrBoardPageVO pageVO) throws Exception;

	public int selectSrBoardListTotCnt(SrBoardPageVO pageVO);
	
	public void testDB() throws Exception; 
}
