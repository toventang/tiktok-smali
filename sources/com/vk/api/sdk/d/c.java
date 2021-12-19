package com.vk.api.sdk.d;

import com.bytedance.covode.number.Covode;
import com.vk.api.sdk.b;
import com.vk.api.sdk.internal.e;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f156289a;

    static {
        Covode.recordClassIndex(103796);
    }

    public final String a() {
        return this.f156289a.o.getValue();
    }

    public final String b() {
        return this.f156289a.f156237j.getValue();
    }

    public final String c() {
        return this.f156289a.f156238k.getValue();
    }

    public final String toString() {
        return "OkHttpExecutorConfig(host='" + a() + "', accessToken='" + b() + "', secret='" + c() + "', logFilterCredentials=" + this.f156289a.f156239l + ')';
    }

    public c(b bVar) {
        l.c(bVar, "");
        this.f156289a = bVar;
        if (bVar.f156228a != null) {
            String a2 = a();
            if (a2 == null || a2.length() == 0) {
                StringBuilder sb = new StringBuilder("Illegal host value: ");
                if (a2 == null) {
                    l.a();
                }
                throw new IllegalArgumentException(sb.append(a2).toString());
            }
            e.a(b());
            return;
        }
        throw new IllegalArgumentException("context is null");
    }
}
