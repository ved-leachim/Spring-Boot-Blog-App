package ch.deepsphere.learning.blog.springbootblogrestapi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CommentDto {
    private long id;
    @NotEmpty(message = "Name should not be null or empty")
    private String name;
    @NotEmpty(message = "Email must be a well-formatted email address")
    @Email
    private String email;
    @NotEmpty(message = "Body should not be null or empty")
    @Size(min = 10, message = "Body should have at least 10 characters")
    private String body;
}
