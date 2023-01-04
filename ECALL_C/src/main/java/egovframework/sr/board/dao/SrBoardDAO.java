package egovframework.sr.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.sr.board.vo.SrBoardPageVO;
import egovframework.sr.board.vo.SrBoardVO;
import egovframework.sr.board.vo.SrBoardVO2;

	@Repository("SrBoardDAO")
	public class SrBoardDAO {
		private Connection conn;
	    private PreparedStatement stmt;
	    private ResultSet rs;

	    private final String BLOG_REGISTER     = "INSERT INTO TEST(NAME) VALUES(?) ";
	    private final String SELECTLIST     = "SELECT * FROM SRBOARD ORDER BY IDX DESC LIMIT 0,15 ";
	    
	    public List<?> selectSrBoardList(SrBoardPageVO PageVO)
	    {
	    	try {
	            conn = JDBCUtil.getConnection();
	            stmt = conn.prepareStatement(SELECTLIST);
	            rs = stmt.executeQuery();
	            
	            List<SrBoardVO> tempList = new ArrayList<>();
	            
	            while (rs.next()) {
	                SrBoardVO srBoard = new SrBoardVO();
	                srBoard.setIdx(rs.getLong("IDX"));
	                srBoard.setRegDate(rs.getDate("REGDATE"));
	                srBoard.setSrSequence(rs.getInt("SRSEQUENCE"));
	                srBoard.setDepartment(rs.getString("DEPARTMENT"));
	                srBoard.setPath(rs.getInt("PATH"));
	                srBoard.setWriter(rs.getString("WRITER"));
	                srBoard.setPhone(rs.getString("PHONE"));
	                srBoard.setSubject(rs.getString("SUBJECT"));
	                srBoard.setFildWorker(rs.getString("FILDWORKER"));
	                srBoard.setContent(rs.getString("CONTENT"));
	                srBoard.setResult(rs.getString("RESULT"));
	                srBoard.setRequest(rs.getInt("REQUEST"));
	                srBoard.setExEndDate(rs.getDate("EXENDDATE"));
	                srBoard.setEndDate(rs.getDate("ENDDATE"));
	                srBoard.setSpendDate(rs.getString("SPENDTIME"));
	                tempList.add(srBoard);
	                
	            }
	            return tempList;
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            JDBCUtil.close(stmt, conn);
	        }
	    	
	    	return null;
	    }
	
		public void InsertDataTest(SrBoardVO2 vo){
	        try {
	            conn = JDBCUtil.getConnection();
	            stmt = conn.prepareStatement(BLOG_REGISTER);
	            stmt.setString(1, vo.getName());
	            int count = stmt.executeUpdate();
	            System.out.println(count + "건 처리 완료 (registerBlog)");
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            JDBCUtil.close(stmt, conn);
	        }
	    }
	 

}
