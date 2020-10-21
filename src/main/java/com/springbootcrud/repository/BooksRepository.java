package com.springbootcrud.repository;

import org.springframework.data.repository.CrudRepository;
import com.springbootcrud.model.Books;

//repository that extends CrudRepository
public interface BooksRepository extends CrudRepository<Books, Integer>
{
}