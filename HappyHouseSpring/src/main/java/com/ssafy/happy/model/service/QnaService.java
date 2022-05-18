package com.ssafy.happy.model.service;

import java.sql.SQLException;
import java.util.List;

import com.ssafy.happy.dto.Qna;

public interface QnaService {
	Qna select(int no) throws SQLException;
	List<Qna> selectAll() throws SQLException;
	int insert(Qna notice) throws SQLException;
	int delete(int no) throws SQLException;
    int updateAsk(Qna notice) throws SQLException;
    int updateAns(Qna notice) throws SQLException;
}
