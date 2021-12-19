package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.backends.g;
import com.google.android.datatransport.runtime.c.b;

final /* synthetic */ class k implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final h f49587a;

    /* renamed from: b  reason: collision with root package name */
    private final g f49588b;

    /* renamed from: c  reason: collision with root package name */
    private final Iterable f49589c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.android.datatransport.runtime.k f49590d;

    /* renamed from: e  reason: collision with root package name */
    private final int f49591e;

    static {
        Covode.recordClassIndex(31019);
    }

    k(h hVar, g gVar, Iterable iterable, com.google.android.datatransport.runtime.k kVar, int i2) {
        this.f49587a = hVar;
        this.f49588b = gVar;
        this.f49589c = iterable;
        this.f49590d = kVar;
        this.f49591e = i2;
    }

    @Override // com.google.android.datatransport.runtime.c.b.a
    public final Object a() {
        h hVar = this.f49587a;
        g gVar = this.f49588b;
        Iterable<com.google.android.datatransport.runtime.scheduling.a.g> iterable = this.f49589c;
        com.google.android.datatransport.runtime.k kVar = this.f49590d;
        int i2 = this.f49591e;
        if (gVar.a() == g.a.TRANSIENT_ERROR) {
            hVar.f49576c.a(iterable);
            hVar.f49577d.a(kVar, i2 + 1);
            return null;
        }
        hVar.f49576c.b(iterable);
        if (gVar.a() == g.a.OK) {
            hVar.f49576c.a(kVar, hVar.f49579f.a() + gVar.b());
        }
        if (!hVar.f49576c.b(kVar)) {
            return null;
        }
        hVar.f49577d.a(kVar, 1);
        return null;
    }
}
