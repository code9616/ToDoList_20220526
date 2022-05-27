package com.springboot.todolist.service;

import org.springframework.stereotype.Service;

import com.springboot.todolist.domain.todolist.ToDoListMst;
import com.springboot.todolist.domain.todolist.ToDoListRepository;
import com.springboot.todolist.web.dto.todolist.ToDoListInsertReqDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ToDoListServiceImpl implements ToDoListService{
	
	private final ToDoListRepository todolistRepository;
	
	@Override
	public int createToDoList(ToDoListInsertReqDto todolistInsertReqDto) throws Exception{
		
		ToDoListMst todolistMst = todolistInsertReqDto.toToDoListMstEntity();
		
		int result = todolistRepository.insertToDoList(todolistMst);
		
		if(result > 0) {
			return todolistMst.getId();
		}
		
		return 0;
	}
	
		
}
