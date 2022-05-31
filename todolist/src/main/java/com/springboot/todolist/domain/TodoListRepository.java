package com.springboot.todolist.domain;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TodoListRepository {
	public int save(TodoList todoList);
	public List<TodoList> getListAll();
	public int modifi(TodoList todoList);
	public int remove(int id);
}
