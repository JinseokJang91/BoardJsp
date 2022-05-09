package com.testBoard.board.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.testBoard.board.model.service.BoardService;
import com.testBoard.board.model.vo.BoardVO;

@Controller
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	BoardService service;
	
	//게시판 글 작성 화면
	@RequestMapping(value = "board.bo", method = RequestMethod.GET)
	public String writeView() throws Exception{
		System.out.println("writeView 확인");
		logger.info("writeView");
		
		return "board/writeView";
	}
	
	//게시판 글 작성
	@RequestMapping(value="boardWrite.bo", method=RequestMethod.POST)
	public String write(BoardVO boardVO) throws Exception{
		logger.info("write");
		System.out.println("write 확인");
		service.write(boardVO);
		
		return "redirect:/";
	}
	
}
