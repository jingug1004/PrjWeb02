package org.zerock.service;

import org.zerock.domain.BoardVO;

import java.util.List;

/**
 * Created by macbookpro on 2017. 2. 4.. PM 1:01
 */
public interface BoardService {

    public void regist(BoardVO board) throws Exception;

    public BoardVO read(Integer bno) throws Exception;

    public void modify(BoardVO board) throws Exception;

    public void remove(Integer bno) throws Exception;

    public List<BoardVO> listAll() throws Exception;

}
