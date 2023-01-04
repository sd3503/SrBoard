package egovframework.sr.board.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.sr.board.dao.SrBoardDAO;
import egovframework.sr.board.vo.SrBoardPageVO;
import egovframework.sr.board.vo.SrBoardVO;
import egovframework.sr.board.vo.SrBoardVO2;

@Service("SrService")
public class SrBoardServiceImpl implements SrBoardService{
	
	@Resource(name="SrBoardDAO")
	private SrBoardDAO SrBoardDAO;
	
	 @Override public void testDB() throws Exception { 
		 SrBoardVO2 testVO = new SrBoardVO2(0L, "test");
		 
		 SrBoardDAO.InsertDataTest(testVO);
	 }

	@Override
	public void WriteSrBoard(SrBoardVO srBoardVO) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RemoveSrBoard(int idx) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SrBoardVO GetSrBoardById(int idx) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SrBoardVO selectSrBoard(SrBoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> selectSrBoardList(SrBoardPageVO searchVO) throws Exception {
		// TODO Auto-generated method stub
		return SrBoardDAO.selectSrBoardList(searchVO);
	}

	@Override
	public int selectSrBoardListTotCnt(SrBoardPageVO searchVO) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
