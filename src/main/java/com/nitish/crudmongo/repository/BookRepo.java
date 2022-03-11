package com.nitish.crudmongo.repository;

import com.nitish.crudmongo.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepo extends MongoRepository<Book, Integer>{}
