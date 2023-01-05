<%@page import="egovframework.sr.board.vo.SrBoardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	List<SrBoardVO> list =  (List<SrBoardVO>)request.getAttribute("value");
	int i = 0;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판 목록</title>

<!-- 공통 CSS -->
<link rel="stylesheet" type="text/css" href="/ECALL_C/css/srBoard/common.css"/>

<!-- 공통 JavaScript -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script>

</script>
</head>
<body>
<div id="wrap">
			
	<div id="container">
		<div class="inner">		
		<div id="search">
		
			<table>
				<tbody>
					<tr>
						<td>
        					<select name="searchCondition" id="searchCondition" style="width: 100px">
        						<option value="0" label="전체" />
        						<option value="1" label="요청자" />
        						<option value="2" label="요청부서" />
        						<option value="3" label="요청재목" />
        						<option value="4" label="요청내용" />
        					</select>
						</td>
						<td colspan="3">
                        	<input name="searchKeyword" id="searchKeyword" width="300px"/>
						</td>
					</tr>
					<tr>
						<td>
        					<select name="dateType" id="dateType" style="width: 100px">
        						<option value="0" label="요청일" />
        						<option value="1" label="완료예정일" />
        						<option value="2" label="완료일" />
        					</select>
						</td>
						<td>
                        	<input name="startDate" id="startDate"/>~
						</td>
						
						<td>
                        	<input name="endDate" id="endDate"/>
						</td>
					</tr>
					<tr>
						<td>
        					<select name="request" id="request" style="width: 100px">
        						<option value="0" label="요청구분" />
        						<option value="1" label="사용문의" />
        						<option value="2" label="데이터처리" />
        						<option value="3" label="운영지원" />
        						<option value="4" label="장애" />
        						<option value="5" label="단순변경" />
        						<option value="6" label="하자보수" />
        						<option value="7" label="보완개발" />
        						<option value="8" label="확대개발" />
        						<option value="9" label="적응유지보수" />
        						<option value="10" label="기타" />
        						<option value="11" label="미분류" />
        					</select>
						</td>
						<td>
        					<select name="path" id="srSequence" style="width: 100px">
        						<option value="0" label="전체" />
        						<option value="1" label="온라인" />
        						<option value="2" label="전자우편" />
        						<option value="3" label="전화" />
        						<option value="4" label="공문" />
        						<option value="5" label="업무협의" />
        					</select>
						</td>
						<td>
        					<select name="srSequence" id="path" style="width: 100px">
        						<option value="0" label="접수전" />
        						<option value="1" label="처리중" />
        						<option value="2" label="처리완료" />
        						<option value="3" label="협의필요" />
        					</select>
						</td>
						<td>
							<div class="btn_right mt15">
								<button type="button" class="btn black mr5" onclick="javascript:goBoardWrite();">검색하기</button>
							</div>
						</td>
						<td>
							<div class="btn_right mt15">
								<button type="button" class="btn black mr5" onclick="javascript:goBoardWrite();">작성하기</button>
							</div>
						</td>
					</tr>
					
				</tbody>
			</table>
        	</div>
			<h2>게시글 목록</h2>			
			<form id="boardForm" name="boardForm">
				<input type="hidden" id="function_name" name="function_name" value="getBoardList" />
				<input type="hidden" id="pageIndex" name="pageIndex" value="1" />
				
				<div class="page_info">
					<span class="total_count"><strong>전체</strong> : <span id="total_count" class="t_red">0</span>개</span>
				</div>
			
				<table width="100%" class="table01">
					<thead>		
						<tr>
							<th>번호</th>
							<th>진행상태</th>
							<th>요청경로</th>
							<th>요청부서</th>
							<th>요청자</th>
							<th>요청제목</th>
							<th>작업자</th>
							<th>요청일</th>
							<th>완료예정일</th>
							<th>완료일</th>
						</tr>
					</thead>
					<tbody id="tbody">
					<%if(list != null){%>
					<%for(i = 0 ; i < list.size(); i++){ %>
						<tr style="cursor: pointer;" onclick="">
							<td>
							<%=list.get(i).getIdx() %>
							</td>
							<td>
							<%if(list.get(i).getSrSequence() == 1){ %>
							접수전
							<%}%>
							<%if(list.get(i).getSrSequence() == 2){ %>
							처리중
							<%}%>
							<%if(list.get(i).getSrSequence() == 3){ %>
							처리완료
							<%}%>
							<%if(list.get(i).getSrSequence() == 4){ %>
							협의필요
							<%}%>
							</td>
							<td>
							<%if(list.get(i).getPath() == 0){ %>
							전체
							<%}%>
							<%if(list.get(i).getPath() == 1){ %>
							온라인
							<%}%>
							<%if(list.get(i).getPath() == 2){ %>
							전자우편
							<%}%>
							<%if(list.get(i).getPath() == 3){ %>
							전화
							<%}%>
							<%if(list.get(i).getPath() == 4){ %>
							공문
							<%}%>
							<%if(list.get(i).getPath() == 5){ %>
							업무협의
							<%}%>
							</td>
							<td>
							<%=list.get(i).getDepartment() %>
							</td>
							<td>
							<%=list.get(i).getWriter() %>
							</td>
							<td>
							<%=list.get(i).getSubject() %>
							</td>
							<td>
							<%=list.get(i).getFildWorker() %>
							</td>
							<td>
							<%=list.get(i).getRegDate() %>
							</td>
							<td>
							<%=list.get(i).getExEndDate() %>
							</td>
							<td>
							<%if(list.get(i).getSrSequence() == 3){ %>
								<%=list.get(i).getEndDate() %>
							<%}%>
							
							</td>
						</tr>
					<%}%>
					<%} %>
					</tbody>	
				</table>
			</form>			
		</div>
		
		<div id="pagination"></div>
			
	</div>
</div>
</body>
</html>