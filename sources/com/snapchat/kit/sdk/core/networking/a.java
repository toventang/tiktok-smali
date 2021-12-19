package com.snapchat.kit.sdk.core.networking;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.google.gson.g;
import l.e;
import l.m;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public final f f57239a;

    /* renamed from: b  reason: collision with root package name */
    public final c f57240b;

    /* renamed from: c  reason: collision with root package name */
    public final i f57241c;

    /* renamed from: d  reason: collision with root package name */
    private final Cache f57242d;

    /* renamed from: e  reason: collision with root package name */
    private final g f57243e;

    static {
        Covode.recordClassIndex(35786);
    }

    public static <T> T a(String str, Class<T> cls) {
        g gVar = new g();
        gVar.f54717g = true;
        return (T) new m.a().a(str).a(new OkHttpClient.Builder().build()).a(l.a.a.a.a(gVar.b())).a().a(cls);
    }

    public final <T> T a(k kVar, String str, Class<T> cls, e.a aVar) {
        OkHttpClient.Builder addInterceptor = new OkHttpClient.Builder().cache(this.f57242d).addInterceptor(kVar);
        if (str.startsWith("https://api.snapkit.com")) {
            addInterceptor.certificatePinner(n.a());
        }
        return (T) new m.a().a(str).a(addInterceptor.build()).a(aVar).a().a(cls);
    }

    a(Cache cache, f fVar, c cVar, g gVar, i iVar) {
        this.f57242d = cache;
        this.f57239a = fVar;
        this.f57240b = cVar;
        this.f57243e = gVar;
        this.f57241c = iVar;
    }
}
