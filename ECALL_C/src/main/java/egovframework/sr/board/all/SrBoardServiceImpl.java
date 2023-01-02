package egovframework.sr.board.all;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("SrService")
public class SrBoardServiceImpl extends EgovAbstractServiceImpl implements SrBoardService{
	
	@Resource(name="SrBoardDAO")
	private SrBoardDAO test;

	@Override
	public void SrBoardWrite(int idx) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SrBoardRemove(int idx) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SrBoardVO SrBoardGetById(int idx) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void SrBoardGetAll(SrBoardVO srBoardVO) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	 @Override public List<SrBoardVO2> testDB() throws Exception { 
		 List<SrBoardVO2> data = test.testDB(); 
		 return data; 
		 
	 }
	 
	
	

}
