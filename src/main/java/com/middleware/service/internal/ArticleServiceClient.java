package com.middleware.service.internal;

import com.middleware.config.ServiceMiddlewareFeignClientConfig;
import com.middleware.domain.response.article.ArticleResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "article-service", url = "${article.service.url}", configuration = {ServiceMiddlewareFeignClientConfig.class})
public interface ArticleServiceClient {


    @GetMapping(value = "/articles")
    ArticleResponse listHalaman(@RequestParam Integer page,
                                @RequestParam Integer limit);
}
