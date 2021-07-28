package com.middleware.domain.response.article;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ArticleResponse implements Serializable {

    private List<DataArticle> items;
    private Integer count;
}
