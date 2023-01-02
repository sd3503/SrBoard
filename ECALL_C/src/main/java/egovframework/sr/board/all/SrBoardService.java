package egovframework.sr.board.all;

import java.util.List;

public interface SrBoardService {
	public void SrBoardWrite(int idx) throws Exception;
	
	public void SrBoardRemove (int idx) throws Exception;
	
	public SrBoardVO SrBoardGetById (int idx) throws Exception;
	
	public void SrBoardGetAll (SrBoardVO srBoardVO) throws Exception;
	
	public List<SrBoardVO> testDB() throws Exception;
}
