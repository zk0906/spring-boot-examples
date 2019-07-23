package com.neo.mapper.test1;

import com.neo.model.User;

import java.util.List;

/**
 * dao 层和 xml 需要按照库来分在不同的目录
 */
public interface User1Mapper {

	List<User> getAll();

	User getOne(Long id);

	void insert(User user);

	void update(User user);

	void delete(Long id);

}
