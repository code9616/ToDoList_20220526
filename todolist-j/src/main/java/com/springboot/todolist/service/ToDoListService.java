package com.springboot.todolist.service;

import com.springboot.todolist.web.dto.todolist.ToDoListInsertReqDto;
import com.springboot.todolist.web.dto.todolist.ToDoListUpdateReqDto;

public interface ToDoListService {
	public int createToDoList(ToDoListInsertReqDto toDoListInsertReqDto) throws Exception;
}
