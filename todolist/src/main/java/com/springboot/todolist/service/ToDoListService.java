package com.springboot.todolist.service;

import com.springboot.todolist.web.dto.ToDoListReqDto;

public interface ToDoListService {
	public int createToDoList(ToDoListReqDto toDoListReqDto);
}
