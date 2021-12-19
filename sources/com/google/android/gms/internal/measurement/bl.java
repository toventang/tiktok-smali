package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class bl implements bj {

    /* renamed from: a  reason: collision with root package name */
    private final bm f50709a;

    /* renamed from: b  reason: collision with root package name */
    private final String f50710b;

    static {
        Covode.recordClassIndex(31678);
    }

    bl(bm bmVar, String str) {
        this.f50709a = bmVar;
        this.f50710b = str;
    }

    @Override // com.google.android.gms.internal.measurement.bj
    public final Object a() {
        bm bmVar = this.f50709a;
        return bb.a(bmVar.f50712a.getContentResolver(), this.f50710b);
    }
}
