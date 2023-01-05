package egovframework.sr.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.sr.board.vo.PageNationInfo;
import egovframework.sr.board.vo.SrBoardPageVO;
import egovframework.sr.board.vo.SrBoardVO;
import egovframework.sr.board.vo.SrBoardVO2;

	@Repository("SrBoardDAO")
	public class SrBoardDAO {
		private Connection conn;
	    private PreparedStatement stmt;
	    private ResultSet rs;

	    private final String BLOG_REGISTER     = "INSERT INTO TEST(NAME) VALUES(?) ";
	    private final String SELECTSRBOARDCNT = "SELECT COUNT(*) totcnt FROM SAMPLE"
	    											+"WHERE ";
	    
	    public List<?> selectSrBoardList(SrBoardPageVO pageVO)
	    {
	    	try {
	    		String query = "SELECT * FROM SRBOARD ORDER BY IDX DESC LIMIT 0,15";
	            conn = JDBCUtil.getConnection();
	            stmt = conn.prepareStatement(query);
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
	    
	    public int selectSrBoardCnt(SrBoardPageVO pageVO)
	    {
	    	try {
	    		String query = "SELECT COUNT(*) totcnt FROM srboard WHERE ( WRITER LIKE ? OR DEPARTMENT LIKE ? OR SUBJECT LIKE ? OR CONTENT LIKE ?)"
	    						+"AND SRSEQUENCE = ? ";
	    		
	            conn = JDBCUtil.getConnection();
	    		if(pageVO.getRequest() == 0)
	    		{
	    			query = query.concat("OR REQUEST = ? ");
	    		}else
	    		{
	    			query = query.concat("AND REQUEST = ? ");
	    		}
	    		
	    		if(pageVO.getPath() == 0)
	    		{
	    			query = query.concat("OR PATH = ? ");
	    		}else
	    		{
	    			query = query.concat("AND PATH = ? ");
	    		}

	    		
	    		if(pageVO.getDateType() == 0)
	    		{
	    			query = query.concat("AND REGDATE BETWEEN ? AND ? ");
	    		}else if(pageVO.getDateType() == 1)
	    		{
	    			query = query.concat("AND EXENDDATE BETWEEN ? AND ? ");
	    		}else if(pageVO.getDateType() == 2)
	    		{
	    			query = query.concat("AND ENDDATE BETWEEN ? AND ? ");
	    		}
	    		
	            stmt = conn.prepareStatement(query);
	            
	            
	            if(pageVO.getSearchCondition() == 0)
	    		{
	            	stmt.setString(1, "%" + pageVO.getSearchKeyword() + "%");
	            	stmt.setString(2, "%" + pageVO.getSearchKeyword() + "%");
	            	stmt.setString(3, "%" + pageVO.getSearchKeyword() + "%");
	            	stmt.setString(4, "%" + pageVO.getSearchKeyword() + "%");
	    		}
	    		if(pageVO.getSearchCondition() == 1)
	    		{
	            	stmt.setString(1, "%" + pageVO.getSearchKeyword() + "%");
	            	stmt.setString(2, "");
	            	stmt.setString(3, "");
	            	stmt.setString(4, "");
	    		}
	    		if(pageVO.getSearchCondition() == 2)
	    		{
	            	stmt.setString(1, "");
	            	stmt.setString(2, "%" + pageVO.getSearchKeyword() + "%");
	            	stmt.setString(3, "");
	            	stmt.setString(4, "");
	    		}
	    		if(pageVO.getSearchCondition() == 3)
	    		{
	            	stmt.setString(1, "");
	            	stmt.setString(2, "");
	            	stmt.setString(3, "%" + pageVO.getSearchKeyword() + "%");
	            	stmt.setString(4, "");
	    		}
	    		if(pageVO.getSearchCondition() == 4)
	    		{
	            	stmt.setString(1, "");
	            	stmt.setString(2, "");
	            	stmt.setString(3, "");
	            	stmt.setString(4, "%" + pageVO.getSearchKeyword() + "%");
	    		}
	    		
	    		if(pageVO.getRequest() == 0)
	    		{
	    			
	    			stmt.setInt(5, 0);
	    		}else
	    		{
	    			stmt.setInt(5, pageVO.getRequest());
	    		}
	    		
	    		if(pageVO.getPath() == 0)
	    		{
	    			stmt.setInt(6, 0);
	    		}else
	    		{
	    			stmt.setInt(6, pageVO.getPath());
	    		}
	    		stmt.setInt(7, pageVO.getSrSequence());
	    		
	    		stmt.setDate(8, new java.sql.Date(pageVO.getStartDate().getTime()));
	    		stmt.setDate(9, new java.sql.Date(pageVO.getEndDate().getTime()));
	    		int totcnt = 0;
	    		rs = stmt.executeQuery();
	            while (rs.next()) {
	                
	            	totcnt = rs.getInt("totcnt");
	                
	                
	            }
	            return totcnt;
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            JDBCUtil.close(stmt, conn);
	        }
	    	
	    	return 0;
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
