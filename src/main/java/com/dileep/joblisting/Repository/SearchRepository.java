package com.dileep.joblisting.Repository;

import com.dileep.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);
}
