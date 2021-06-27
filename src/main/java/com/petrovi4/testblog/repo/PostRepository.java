package com.petrovi4.testblog.repo;

import com.petrovi4.testblog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
