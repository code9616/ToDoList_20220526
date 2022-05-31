package com.springboot.todolist.domain;

import java.time.LocalDateTime;

import com.springboot.todolist.web.dto.ContentRespDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TodoList {
	private int id;
	private int usercode;
	private String content;
	private int complet;
	private LocalDateTime create_date;
	private LocalDateTime update_date;
	
	public ContentRespDto toDto() {
		return ContentRespDto.builder()
				.id(id)
				.usercode(usercode)
				.content(content)
				.complet(complet)
				.build();
	}
}
