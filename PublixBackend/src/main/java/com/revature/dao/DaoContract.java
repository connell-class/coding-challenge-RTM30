package com.revature.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface DaoContract<T, I> {

  T findById(I id);

  void save(T t);

  boolean delete(T t);

  T update(T t);

  List<T> findAll();

  T findByAuthorId(int id);

  List<T> findAllById(int id);

  T findByString(String s);

}
