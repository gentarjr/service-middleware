package com.middleware.controller;

import com.middleware.domain.form.ArticleForm;
import com.middleware.domain.response.article.ArticleResponse;
import com.middleware.domain.response.middleware.MiddlewareResponse;
import com.middleware.service.MiddlewareService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class MiddlewareController {

    private final MiddlewareService middlewareService;

    @PostMapping("/artikel")
    public MiddlewareResponse postArticle(@RequestBody ArticleForm form){
        MiddlewareResponse response = middlewareService.getListPaymentCategory(form);
        return response;
    }

}
