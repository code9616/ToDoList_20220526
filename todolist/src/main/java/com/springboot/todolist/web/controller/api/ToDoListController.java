package com.springboot.todolist.web.controller.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.todolist.service.TodoListService;
import com.springboot.todolist.web.dto.CMRespDto;
import com.springboot.todolist.web.dto.ContentReqDto;
import com.springboot.todolist.web.dto.ContentRespDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ToDoListController {
	
	private final TodoListService todoListService;
	
	//리스트 전체 들고오기
	@GetMapping("/todo/list")
	public ResponseEntity<?> getListAll() {
		return new ResponseEntity<>(new CMRespDto<List<ContentRespDto>>(1, "내용 가져오기 성공", todoListService.getContentList()), HttpStatus.OK);
	}
	
	//내용 추가
	@PostMapping("/todo")
	public ResponseEntity<?> addToDo(@Valid @RequestBody ContentReqDto contentReqDto, BindingResult bindingResult) {
//		if(bindingResult.hasErrors()) {
//			Map<String, String> errorMap = new HashMap<String, String>();
//			for(FieldError error : bindingResult.getFieldErrors()) {
//				errorMap.put(error.getField(), error.getDefaultMessage());
//			}
//			
//			throw new CustomValidationApiException("유효성 검사 실패", errorMap);
//		}
		
		return new ResponseEntity<>(new CMRespDto<Boolean>(1, "추가 성공", todoListService.createContent(contentReqDto)), HttpStatus.OK);
	}
	
	//내용 수정
	@PutMapping("/todo/{id}")
	public ResponseEntity<?> modifiToDo(@PathVariable int id, @Valid @RequestBody ContentReqDto contentReqDto, BindingResult bindingResult) {
		return new ResponseEntity<>(new CMRespDto<Boolean>(1, "수정 성공", todoListService.modifiContent(id, contentReqDto)), HttpStatus.OK);
	}
	
	//내용 삭제
	@DeleteMapping("/todo/{id}")
	public ResponseEntity<?> removeToDo(@PathVariable int id) {
		return new ResponseEntity<>(new CMRespDto<Boolean>(1, "삭제 성공", todoListService.removeContent(id)), HttpStatus.OK);
	}
	
}
