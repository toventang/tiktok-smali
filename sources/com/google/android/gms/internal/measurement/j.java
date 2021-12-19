package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.f;

public final class j extends f.a {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f51051c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f51052d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ oy f51053e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ f f51054f;

    static {
        Covode.recordClassIndex(31893);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void a() {
        this.f51053e.a((Bundle) null);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void b() {
        this.f51054f.f50845h.getConditionalUserProperties(this.f51051c, this.f51052d, this.f51053e);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(f fVar, String str, String str2, oy oyVar) {
        super(fVar);
        this.f51054f = fVar;
        this.f51051c = str;
        this.f51052d = str2;
        this.f51053e = oyVar;
    }
}
