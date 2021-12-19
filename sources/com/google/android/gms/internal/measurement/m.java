package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.f;

public final class m extends f.a {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f51175c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ f f51176d;

    static {
        Covode.recordClassIndex(31978);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void b() {
        this.f51176d.f50845h.setUserId(this.f51175c, this.f50848a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(f fVar, String str) {
        super(fVar);
        this.f51176d = fVar;
        this.f51175c = str;
    }
}
