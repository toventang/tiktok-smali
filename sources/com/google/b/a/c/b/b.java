package com.google.b.a.c.b;

import com.bytedance.covode.number.Covode;
import com.google.b.a.d.d;
import com.google.b.a.g.j;

public abstract class b<T> extends j {

    /* renamed from: a  reason: collision with root package name */
    public final String f53555a;

    /* renamed from: b  reason: collision with root package name */
    public final String f53556b;

    /* renamed from: c  reason: collision with root package name */
    public final com.google.b.a.d.b f53557c;

    /* renamed from: d  reason: collision with root package name */
    public d f53558d = new d();

    /* renamed from: e  reason: collision with root package name */
    public int f53559e = -1;

    /* renamed from: f  reason: collision with root package name */
    public Class<T> f53560f;

    /* renamed from: g  reason: collision with root package name */
    private final a f53561g;

    static {
        Covode.recordClassIndex(33139);
    }

    /* renamed from: a */
    public b<T> b(String str, Object obj) {
        return (b) super.b(str, obj);
    }

    public b(a aVar, String str, String str2, com.google.b.a.d.b bVar, Class<T> cls) {
        this.f53560f = (Class) com.google.b.a.f.a.a.a.a.b.a(cls);
        this.f53561g = (a) com.google.b.a.f.a.a.a.a.b.a(aVar);
        this.f53555a = (String) com.google.b.a.f.a.a.a.a.b.a(str);
        this.f53556b = (String) com.google.b.a.f.a.a.a.a.b.a(str2);
        this.f53557c = null;
        String str3 = aVar.f53539f;
        if (str3 != null) {
            d dVar = this.f53558d;
            String valueOf = String.valueOf(String.valueOf(str3));
            dVar.a(new StringBuilder(valueOf.length() + 1 + "Google-API-Java-Client".length()).append(valueOf).append(" ").append("Google-API-Java-Client").toString());
            return;
        }
        this.f53558d.a("Google-API-Java-Client");
    }
}
