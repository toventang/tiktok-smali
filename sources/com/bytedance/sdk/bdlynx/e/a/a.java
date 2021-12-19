package com.bytedance.sdk.bdlynx.e.a;

import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public LruCache<String, com.bytedance.sdk.bdlynx.e.b.a.a> f43702a = new LruCache<>(16);

    /* renamed from: b  reason: collision with root package name */
    private final int f43703b = 16;

    static {
        Covode.recordClassIndex(26747);
    }

    public final void a(String str, com.bytedance.sdk.bdlynx.e.b.a.a aVar) {
        l.c(str, "");
        l.c(aVar, "");
        this.f43702a.put(str, aVar);
    }
}
