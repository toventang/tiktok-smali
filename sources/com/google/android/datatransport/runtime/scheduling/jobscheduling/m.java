package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.c.b;
import com.google.android.datatransport.runtime.k;

final /* synthetic */ class m implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final h f49593a;

    /* renamed from: b  reason: collision with root package name */
    private final k f49594b;

    /* renamed from: c  reason: collision with root package name */
    private final int f49595c;

    static {
        Covode.recordClassIndex(31021);
    }

    m(h hVar, k kVar, int i2) {
        this.f49593a = hVar;
        this.f49594b = kVar;
        this.f49595c = i2;
    }

    @Override // com.google.android.datatransport.runtime.c.b.a
    public final Object a() {
        h hVar = this.f49593a;
        hVar.f49577d.a(this.f49594b, this.f49595c + 1);
        return null;
    }
}
