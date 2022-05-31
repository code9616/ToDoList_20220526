package com.springboot.todolist.web.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ContentRespDto {
	private int id;
	private int usercode;
	private String content;
	private int complet;
}
