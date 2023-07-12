package com.srhdp.blogrestapi.payload;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;
import java.util.Set;
@Data
@Schema(
        description = "PostDto Model Information"
)
public class PostDtoV2 {
    private Long id;
    @Schema(
            description = "Blog Post Title"
    )
    @NotEmpty
    @Size(min = 2,message = "Post title should have at least 2 character")
    private String title;
    @Schema(
            description = "Blog Post Description"
    )
    @NotEmpty
    @Size(min = 10,message = "Description title should have at least 2 character")
    private String description;
    @Schema(
            description = "Blog Post Content"
    )
    @NotEmpty
    private String content;
    private Set<CommentDto> comments;
    @Schema(
            description = "Blog Post Category"
    )
    private Long categoryId;
    private List<String> tags;
}
