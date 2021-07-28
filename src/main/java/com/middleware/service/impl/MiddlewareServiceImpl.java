package com.middleware.service.impl;

import com.middleware.domain.form.ArticleForm;
import com.middleware.domain.response.article.ArticleResponse;
import com.middleware.domain.response.middleware.MiddlewareResponse;
import com.middleware.service.MiddlewareService;
import com.middleware.service.ServiceDataList;
import com.middleware.service.internal.ArticleServiceClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MiddlewareServiceImpl implements MiddlewareService {

    private final ArticleServiceClient articleServiceClient;
    private final ServiceDataList serviceDataList;


    @Override
    public MiddlewareResponse getListPaymentCategory(ArticleForm form) {

        Integer jumlah = form.getJumlah();
        Integer halaman = form.getHalaman();

        ArticleResponse result = articleServiceClient.listHalaman(jumlah, halaman);

        MiddlewareResponse response = serviceDataList.listArticle(result);

        return response;
    }
}
