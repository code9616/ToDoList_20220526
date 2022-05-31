package com.springboot.todolist.web.dto;

import com.springboot.todolist.domain.TodoList;

import lombok.Data;

@Data
public class ContentReqDto {
	private int usercode;
	private String content;
	private int complet;
	
	public TodoList toEntity(int id) {
		return TodoList.builder()
				.id(id)
				.usercode(usercode)
				.content(content)
				.complet(complet)
				.build();
				
	}
}
