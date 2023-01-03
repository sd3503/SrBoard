package egovframework.sr.board.service;

import java.util.List;

import egovframework.sr.board.vo.SrBoardPageVO;
import egovframework.sr.board.vo.SrBoardVO;
import egovframework.sr.board.vo.SrBoardVO2;

public interface SrBoardService {
	public void WriteSrBoard(SrBoardVO srBoardVO) throws Exception;
	
	public void RemoveSrBoard (int idx) throws Exception;
	
	public SrBoardVO GetSrBoardById (int idx) throws Exception;
	
	public SrBoardVO selectSrBoard(SrBoardVO vo) throws Exception;

	public List<?> selectSrBoardList(SrBoardPageVO searchVO) throws Exception;

	public int selectSrBoardListTotCnt(SrBoardPageVO searchVO);
	
	public void testDB() throws Exception; 
}
