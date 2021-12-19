package com.bytedance.geckox.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class Response<T> {
    @c(a = "data")
    public T data;
    @c(a = "message")
    public String msg;
    @c(a = "status")
    public int status;

    static {
        Covode.recordClassIndex(17376);
    }
}
