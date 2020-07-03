package com.rk.todo.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rk.todo.model.Todo;
import com.rk.todo.repository.TodoRepository;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
    private TodoRepository todoRepository;
	
	@Override
	public List<Todo> getTodosByUserName(String user) {
		// TODO Auto-generated method stub
		return todoRepository.findByUserName(user);
	}

	@Override
	public Optional<Todo> getTodoById(long id) {
		// TODO Auto-generated method stub
		return todoRepository.findById(id);
	}

	@Override
	public void updateTodo(Todo todo) {
		// TODO Auto-generated method stub
		todoRepository.save(todo);
	}

	@Override
	public void addTodo(String name, String desc, Date targetDate, boolean isDone) {
		// TODO Auto-generated method stub
		todoRepository.save(new Todo(name, desc, targetDate, isDone));
	}

	@Override
	public void deleteTodo(long id) {
		// TODO Auto-generated method stub
		Optional < Todo > todo = todoRepository.findById(id);
        if (todo.isPresent()) {
            todoRepository.delete(todo.get());
        }
	}

	@Override
	public void saveTodo(Todo todo) {
		// TODO Auto-generated method stub
		todoRepository.save(todo);
	}

}
