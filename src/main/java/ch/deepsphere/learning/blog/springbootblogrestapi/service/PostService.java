package ch.deepsphere.learning.blog.springbootblogrestapi.service;

import ch.deepsphere.learning.blog.springbootblogrestapi.dto.PostDto;
import ch.deepsphere.learning.blog.springbootblogrestapi.dto.PostResponse;

import java.util.List;

public interface PostService {

    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    PostDto updatePost(long id, PostDto postDto);

    void deletePost(long id);

    List<PostDto> getPostByCategory(Long categoryId);
}
