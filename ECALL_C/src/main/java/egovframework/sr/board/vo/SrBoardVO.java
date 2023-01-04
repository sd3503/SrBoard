package egovframework.sr.board.vo;

import java.sql.Date;

public class SrBoardVO {
	private Long idx;
	private Date regDate;
	private int srSequence;
	private String department;
	private int path;
	private String writer;
	private String phone;
	private String subject;
	private String fildWorker;
	private String Content;
	private String result;
	private int request;
	private Date exEndDate;
	private Date endDate;
	private String spendDate;
	public Long getIdx() {
		return idx;
	}
	public void setIdx(Long idx) {
		this.idx = idx;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getSrSequence() {
		return srSequence;
	}
	public void setSrSequence(int srSequence) {
		this.srSequence = srSequence;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getPath() {
		return path;
	}
	public void setPath(int path) {
		this.path = path;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getFildWorker() {
		return fildWorker;
	}
	public void setFildWorker(String fildWorker) {
		this.fildWorker = fildWorker;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public int getRequest() {
		return request;
	}
	public void setRequest(int request) {
		this.request = request;
	}
	public Date getExEndDate() {
		return exEndDate;
	}
	public void setExEndDate(Date exEndDate) {
		this.exEndDate = exEndDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getSpendDate() {
		return spendDate;
	}
	public void setSpendDate(String spendDate) {
		this.spendDate = spendDate;
	}
	public SrBoardVO(Long idx, Date regDate, int srSequence, String department, int path, String writer, String phone,
			String subject, String fildWorker, String content, String result, int request, Date exEndDate, Date endDate,
			String spendDate) {
		super();
		this.idx = idx;
		this.regDate = regDate;
		this.srSequence = srSequence;
		this.department = department;
		this.path = path;
		this.writer = writer;
		this.phone = phone;
		this.subject = subject;
		this.fildWorker = fildWorker;
		Content = content;
		this.result = result;
		this.request = request;
		this.exEndDate = exEndDate;
		this.endDate = endDate;
		this.spendDate = spendDate;
	}
	public SrBoardVO() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
