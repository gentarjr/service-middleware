package com.middleware.service;

import com.middleware.domain.form.ArticleForm;
import com.middleware.domain.response.article.ArticleResponse;
import com.middleware.domain.response.middleware.MiddlewareResponse;

public interface MiddlewareService {
    MiddlewareResponse getListPaymentCategory(ArticleForm form);
}
