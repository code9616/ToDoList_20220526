package com.springboot.todolist.service;

import java.util.List;

import com.springboot.todolist.web.dto.ContentReqDto;
import com.springboot.todolist.web.dto.ContentRespDto;

public interface TodoListService {
	public boolean createContent(ContentReqDto contentReqDto);
	public List<ContentRespDto> getContentList();
	public boolean modifiContent(int id, ContentReqDto contentReqDto);
	public boolean removeContent(int id);
}
