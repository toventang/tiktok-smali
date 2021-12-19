package com.bytedance.android.live.base.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public final class b {
    @c(a = "uri")

    /* renamed from: a  reason: collision with root package name */
    public String f7375a;
    @c(a = "url_list")

    /* renamed from: b  reason: collision with root package name */
    public List<String> f7376b;

    static {
        Covode.recordClassIndex(3583);
    }

    public final ImageModel a() {
        return new ImageModel(this.f7375a, this.f7376b);
    }

    public final String toString() {
        return "UrlStruct{uri='" + this.f7375a + '\'' + ", urlList=" + this.f7376b + '}';
    }
}
