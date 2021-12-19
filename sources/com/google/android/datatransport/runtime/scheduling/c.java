package com.google.android.datatransport.runtime.scheduling;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.c.b;
import com.google.android.datatransport.runtime.h;
import com.google.android.datatransport.runtime.k;

final /* synthetic */ class c implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final a f49539a;

    /* renamed from: b  reason: collision with root package name */
    private final k f49540b;

    /* renamed from: c  reason: collision with root package name */
    private final h f49541c;

    static {
        Covode.recordClassIndex(30997);
    }

    c(a aVar, k kVar, h hVar) {
        this.f49539a = aVar;
        this.f49540b = kVar;
        this.f49541c = hVar;
    }

    @Override // com.google.android.datatransport.runtime.c.b.a
    public final Object a() {
        a aVar = this.f49539a;
        k kVar = this.f49540b;
        aVar.f49472d.a(kVar, this.f49541c);
        aVar.f49470b.a(kVar, 1);
        return null;
    }
}
