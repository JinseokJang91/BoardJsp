package com.testBoard.board.model.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.testBoard.board.model.dao.BoardDAO;
import com.testBoard.board.model.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;

	@Override
	public void write(BoardVO boardVO) throws Exception {
		dao.write(boardVO);
	}
	
}
