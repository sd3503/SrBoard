package egovframework.sr.board.all;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

	@Repository("SrBoardDAO")
	public class SrBoardDAO extends EgovAbstractDAO {
	
		/*
		 * public void insertSrBoard(SrBoardVO vo) throws Exception { // TODO
		 * Auto-generated method stub
		 * 
		 * }
		 * 
		 * 
		 * public void updateSrBoard(SrBoardVO vo) throws Exception { // TODO
		 * Auto-generated method stub
		 * 
		 * }
		 * 
		 * 
		 * public void deleteSrBoard(SrBoardVO vo) throws Exception { // TODO
		 * Auto-generated method stub
		 * 
		 * }
		 * 
		 * 
		 * public SrBoardVO selectSrBoard(SrBoardVO vo) throws Exception { // TODO
		 * Auto-generated method stub return null; }
		 * 
		 * 
		 * public List<?> selectSrBoardList(SrBoardPageVO searchVO) throws Exception {
		 * // TODO Auto-generated method stub return null; }
		 * 
		 * 
		 * public int selectSrBoardListTotCnt(SrBoardPageVO searchVO) { // TODO
		 * Auto-generated method stub return 0; }
		 */
	
	
	  public List<SrBoardVO2> testDB() throws Exception { 
		  List<SrBoardVO2> asdf = (List<SrBoardVO2>)select("test.test2");
		  return asdf; 
		  }
	 

}
