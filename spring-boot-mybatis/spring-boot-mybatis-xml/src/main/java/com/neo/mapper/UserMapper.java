package com.neo.mapper;

import com.neo.model.User;

import java.util.List;

/**
 * 与mapper.xml对应
 */
public interface UserMapper {

	List<User> getAll();

	User getOne(Long id);

	void insert(User user);

	void update(User user);

	void delete(Long id);

}
