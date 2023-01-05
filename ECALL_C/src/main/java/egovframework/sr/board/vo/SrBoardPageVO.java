package egovframework.sr.board.vo;

import java.util.Date;

public class SrBoardPageVO {
	
	/** 검색조건 */
	private int searchCondition = 0;

	/** 검색Keyword */
	private String searchKeyword = "";

	/** 검색시작날짜 */
	private Date startDate;
	
	/** 검색끝날짜 */
	private Date endDate;
	


	private int dateType = 0;
	
	private int request = 0;
	
	private int srSequence = 0;
	
	private int path = 0;
	
	/** 검색사용여부 */
	private String searchUseYn = "";

	/** 현재페이지 */
	private int pageIndex = 1;

	/** 페이지당 게시글 수 */
	private int pageUnit = 10;

	/** 한 페이지에 전개되는 페이지 수 */
	private int pageSize = 10;

	/** 첫번째 페이지 */
	private int firstIndex = 1;

	/** 마지막 페이지 */
	private int lastIndex = 1;

	public int getSearchCondition() {
		return searchCondition;
	}

	public void setSearchCondition(int searchCondition) {
		this.searchCondition = searchCondition;
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getRequest() {
		return request;
	}

	public void setRequest(int request) {
		this.request = request;
	}

	public int getSrSequence() {
		return srSequence;
	}

	public void setSrSequence(int srSequence) {
		this.srSequence = srSequence;
	}

	public int getPath() {
		return path;
	}

	public void setPath(int path) {
		this.path = path;
	}

	public String getSearchUseYn() {
		return searchUseYn;
	}

	public void setSearchUseYn(String searchUseYn) {
		this.searchUseYn = searchUseYn;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageUnit() {
		return pageUnit;
	}

	public void setPageUnit(int pageUnit) {
		this.pageUnit = pageUnit;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getFirstIndex() {
		return firstIndex;
	}

	public void setFirstIndex(int firstIndex) {
		this.firstIndex = firstIndex;
	}

	public int getLastIndex() {
		return lastIndex;
	}

	public void setLastIndex(int lastIndex) {
		this.lastIndex = lastIndex;
	}

	public int getRecordCountPerPage() {
		return recordCountPerPage;
	}

	public void setRecordCountPerPage(int recordCountPerPage) {
		this.recordCountPerPage = recordCountPerPage;
	}
	public int getDateType() {
		return dateType;
	}

	public void setDateType(int dateType) {
		this.dateType = dateType;
	}
	/** 페이지당 게시글 수 */
	private int recordCountPerPage = 10;

	
}
