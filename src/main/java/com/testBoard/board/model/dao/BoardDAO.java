package com.testBoard.board.model.dao;

import com.testBoard.board.model.vo.BoardVO;

public interface BoardDAO {

	public void write(BoardVO boardVO) throws Exception;
}
