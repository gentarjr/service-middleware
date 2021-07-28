package com.middleware.domain.response.middleware;

import lombok.Data;

import java.io.Serializable;

@Data
public class DataMiddleware implements Serializable {

    private String tanggal_buat;
    private String nama_pembuat;
    private String avatar;
    private String judul;
    private String konten;
    private String id;
}
