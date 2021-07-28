package com.middleware.domain.form;

import lombok.Data;

@Data
public class ArticleForm {

    private Integer jumlah;
    private Integer halaman;

    public ArticleForm(Integer jumlah, Integer halaman) {
        this.jumlah = jumlah;
        this.halaman = halaman;
    }
}
