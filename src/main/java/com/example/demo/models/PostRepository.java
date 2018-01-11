package com.example.demo.models;

import org.springframework.data.repository.CrudRepository;

/**
 * PostReposiitory Class
 * Created by frodriguez on 10/24/2017.
 */
public interface PostRepository extends CrudRepository<Post,Long> {
}
