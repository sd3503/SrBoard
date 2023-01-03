package egovframework.sr.board.vo;

import java.sql.Date;

public class SrBoardVO2 {
	private Long idx;
	private String Name;
	public Long getIdx() {
		return idx;
	}
	public void setIdx(Long idx) {
		this.idx = idx;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public SrBoardVO2(Long idx, String name) {
		super();
		this.idx = idx;
		Name = name;
	}

	
}
