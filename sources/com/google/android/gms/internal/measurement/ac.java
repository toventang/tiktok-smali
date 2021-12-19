package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.f;

public final class ac extends f.a {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f50632c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ oy f50633d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ f f50634e;

    static {
        Covode.recordClassIndex(31599);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void a() {
        this.f50633d.a((Bundle) null);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void b() {
        this.f50634e.f50845h.getMaxUserProperties(this.f50632c, this.f50633d);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ac(f fVar, String str, oy oyVar) {
        super(fVar);
        this.f50634e = fVar;
        this.f50632c = str;
        this.f50633d = oyVar;
    }
}
