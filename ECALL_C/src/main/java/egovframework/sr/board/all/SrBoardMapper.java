package egovframework.sr.board.all;

import java.util.List;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("SrBoardMapper")
public interface SrBoardMapper {
	/*	*//**
			 * 글을 등록한다.
			 * 
			 * @param vo - 등록할 정보가 담긴 SampleVO
			 * @return 등록 결과
			 * @exception Exception
			 */
	/*
	 * void insertSrBoard(SrBoardVO vo) throws Exception;
	 * 
	 *//**
		 * 글을 수정한다.
		 * 
		 * @param vo - 수정할 정보가 담긴 SampleVO
		 * @return void형
		 * @exception Exception
		 */
	/*
	 * void updateSrBoard(SrBoardVO vo) throws Exception;
	 * 
	 *//**
		 * 글을 삭제한다.
		 * 
		 * @param vo - 삭제할 정보가 담긴 SampleVO
		 * @return void형
		 * @exception Exception
		 */
	/*
	 * void deleteSrBoard(SrBoardVO vo) throws Exception;
	 * 
	 *//**
		 * 글을 조회한다.
		 * 
		 * @param vo - 조회할 정보가 담긴 SampleVO
		 * @return 조회한 글
		 * @exception Exception
		 */
	/*
	 * SrBoardVO selectSrBoard(SrBoardVO vo) throws Exception;
	 * 
	 *//**
		 * 글 목록을 조회한다.
		 * 
		 * @param searchVO - 조회할 정보가 담긴 VO
		 * @return 글 목록
		 * @exception Exception
		 */
	/*
	 * List<?> selectSrBoardList(SrBoardPageVO searchVO) throws Exception;
	 * 
	 *//**
		 * 글 총 갯수를 조회한다. @param searchVO - 조회할 정보가 담긴 VO @return 글 총 갯수 @exception
		 *//*
			 * int selectSrBoardListTotCnt(SrBoardPageVO searchVO);
			 */

	List<SrBoardVO> testDB() throws Exception;
}
