package com.springboot.todolist.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.todolist.domain.TodoList;
import com.springboot.todolist.domain.TodoListRepository;
import com.springboot.todolist.web.dto.ContentReqDto;
import com.springboot.todolist.web.dto.ContentRespDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoListServiceImpl implements TodoListService {

	private final TodoListRepository todoListRepository;

	@Override
	public boolean createContent(ContentReqDto contentReqDto) {
		return todoListRepository.save(contentReqDto.toEntity(0)) > 0;
	}

	@Override
	public List<ContentRespDto> getContentList() {
		List<ContentRespDto> list = new ArrayList<ContentRespDto>();
		todoListRepository.getListAll().forEach(r -> {list.add(r.toDto());});
		return list;
	}

	@Override
	public boolean modifiContent(int id, ContentReqDto contentReqDto) {
		return todoListRepository.modifi(contentReqDto.toEntity(id)) > 0;
	}

	@Override
	public boolean removeContent(int id) {
		return todoListRepository.remove(id) > 0;
	}
	
	

}
