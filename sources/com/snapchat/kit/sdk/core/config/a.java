package com.snapchat.kit.sdk.core.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;
import java.util.Map;

public final class a implements Serializable {
    @c(a = "query")

    /* renamed from: a  reason: collision with root package name */
    private final String f57094a;
    @c(a = "variables")

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Object> f57095b;

    static {
        Covode.recordClassIndex(35574);
    }

    public a(String str, Map<String, Object> map) {
        this.f57094a = str;
        this.f57095b = map;
    }
}
