package com.middleware.domain.response.middleware;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class MiddlewareResponse implements Serializable {

    private List<DataMiddleware> data;
    private Integer total_data;
}
