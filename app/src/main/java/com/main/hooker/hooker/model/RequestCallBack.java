package com.main.hooker.hooker.model;

import com.main.hooker.hooker.entity.Book;

import java.util.List;

public interface RequestCallBack {
    void success(List<Book.DataBean> data);

    void fail(Exception e);
}
