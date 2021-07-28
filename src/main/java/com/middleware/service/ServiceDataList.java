package com.middleware.service;

import com.middleware.domain.response.article.ArticleResponse;
import com.middleware.domain.response.article.DataArticle;
import com.middleware.domain.response.middleware.DataMiddleware;
import com.middleware.domain.response.middleware.MiddlewareResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceDataList {

    public MiddlewareResponse listArticle(ArticleResponse result) {
        MiddlewareResponse response = new MiddlewareResponse();
        List<DataMiddleware> dataMiddleware = new ArrayList<>();
        for(DataArticle da : result.getItems()){
            DataMiddleware data = new DataMiddleware();
            data.setId(da.getId());
            data.setAvatar(da.getAvatar());
            data.setJudul(da.getTitle());
            data.setNama_pembuat(da.getAuthor());
            data.setTanggal_buat(da.getCreatedAt());
            data.setKonten(da.getContent());
            dataMiddleware.add(data);
        }
        response.setData(dataMiddleware);
        response.setTotal_data(result.getCount());
        return response;
    }
}
