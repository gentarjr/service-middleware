package com.middleware.domain.response.article;

import lombok.Data;

import java.io.Serializable;

@Data
public class DataArticle implements Serializable {

    private static final long serialVersionUID = 1L;

    private String createdAt;
    private String author;
    private String avatar;
    private String title;
    private String content;
    private String id;
}
