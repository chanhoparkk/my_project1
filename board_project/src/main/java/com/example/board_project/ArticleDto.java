package com.example.board_project;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link com.example.board_project.domain.Article} entity
 */
public record ArticleDto(
        String title,
        String content,
        String hashtag,
        LocalDateTime createdAt,
        String createdBy,
        LocalDateTime modifiedAt,
        String modifiedBy
) implements Serializable {
}