package com.agrosupport.api.post.domain.services;

import com.agrosupport.api.post.domain.model.aggregates.Post;
import com.agrosupport.api.post.domain.model.queries.GetAllPostsQuery;
import com.agrosupport.api.post.domain.model.queries.GetPostByAdvisorIdQuery;
import com.agrosupport.api.post.domain.model.queries.GetPostByIdQuery;

import java.util.List;
import java.util.Optional;

public interface PostQueryService {
    List<Post> handle(GetAllPostsQuery query);
    Optional<Post> handle(GetPostByIdQuery query);
    List<Post> handle(GetPostByAdvisorIdQuery query);
}
