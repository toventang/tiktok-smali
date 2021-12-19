package com.vk.api.sdk.f.a;

import com.bytedance.covode.number.Covode;
import com.vk.api.sdk.f.a.c;
import h.f.b.l;
import h.h;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private h<? extends c.a> f156307a;

    /* renamed from: b  reason: collision with root package name */
    private final String f156308b;

    static {
        Covode.recordClassIndex(103808);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.h<? extends com.vk.api.sdk.f.a.c$a>, h.h<com.vk.api.sdk.f.a.c$a> */
    @Override // com.vk.api.sdk.f.a.c
    public final h<c.a> a() {
        return this.f156307a;
    }

    @Override // com.vk.api.sdk.f.a.c
    public final void a(c.a aVar) {
        l.c(aVar, "");
        if (((c.a) this.f156307a.getValue()).ordinal() <= aVar.ordinal()) {
            int i2 = b.f156309a[aVar.ordinal()];
        }
    }

    public a(h<? extends c.a> hVar, String str) {
        l.c(hVar, "");
        l.c(str, "");
        this.f156307a = hVar;
        this.f156308b = str;
    }
}
