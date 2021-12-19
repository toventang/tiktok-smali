package com.bytedance.lynx.hybrid.h;

import com.bytedance.android.monitorV2.k.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.c;
import com.bytedance.lynx.hybrid.f;
import h.f.b.l;

public class a {

    /* renamed from: f  reason: collision with root package name */
    public String f40979f = d.a();

    /* renamed from: g  reason: collision with root package name */
    public String f40980g = "default_bid";

    /* renamed from: h  reason: collision with root package name */
    public f f40981h;

    /* renamed from: i  reason: collision with root package name */
    public c f40982i = new c();

    static {
        Covode.recordClassIndex(25109);
    }

    public int hashCode() {
        return this.f40979f.hashCode();
    }

    public final void a(c cVar) {
        l.c(cVar, "");
        this.f40982i = cVar;
    }

    public final <T> T a(Class<T> cls) {
        l.c(cls, "");
        return (T) c.a.a().a(this, cls);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return l.a((Object) ((a) obj).f40979f, (Object) this.f40979f);
        }
        return false;
    }

    public final <T> void a(Class<T> cls, T t) {
        l.c(cls, "");
        c.a.a().a(this, cls, t);
    }
}
