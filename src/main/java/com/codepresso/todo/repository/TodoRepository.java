package com.codepresso.todo.repository;

import com.codepresso.todo.vo.Todo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TodoRepository {
    void save(@Param("todo") Todo todo);

    // Todo 타입의 객체를 리스트로 가지는 메소드
    List<Todo> findAll();

    void deleteById(@Param("id") Integer id);
}
