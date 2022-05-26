package com.springboot.todolist.web.controller.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.todolist.web.dto.ToDoListReqDto;

@RestController
@RequestMapping("/api/v1")
public class ToDoListController {
	
	//리스트 전체 들고오기
	@GetMapping("/todo/list")
	public ResponseEntity<?> getListAll(){
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	//내용추가
	@PostMapping("/todo")
	public ResponseEntity<?> addToDo(@RequestBody ToDoListReqDto toDoListReqDto){
		int id = 
		System.out.println(toDoListReqDto);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	//내용수정
	@PutMapping("/todo/{id}")
	public ResponseEntity<?> modifiToDo(@PathVariable int id){
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	//내용삭제
	@DeleteMapping("/todo/{id}")
	public ResponseEntity<?> removeToDo(@PathVariable int id){
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
