package com.springboot.todolist.web.dto;

import com.springboot.todolist.domain.todolist.ToDoListMst;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ToDoListReqDto {
	private String content;
	
	public ToDoListMst toToDoListMstEntity() {
		return ToDoListMst.builder()
				
				.content(content)
				.build();
	}
}
