package com.dileep.joblisting.Repository;

import com.dileep.joblisting.model.Post;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class SearchRepositoryImpl implements SearchRepository{
    @Override
    public List<Post> findByText(String text) {
        final List<Post> posts = new ArrayList<>();

        for (Post p:
             posts) {
            if (p.getTech().equals(text)){
                posts.add(p);
            }

        }

        return posts;
    }
}
