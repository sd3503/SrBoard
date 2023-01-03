package egovframework.sr.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;



import egovframework.sr.board.vo.SrBoardVO2;

	@Repository("SrBoardDAO")
	public class SrBoardDAO {
		private Connection conn;
	    private PreparedStatement stmt;
	    private ResultSet rs;

	    private final String BLOG_REGISTER     = "INSERT INTO TEST(NAME) VALUES(?) ";

	
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
