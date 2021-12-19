package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.f;

public final class t extends f.a {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ oy f51285c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ f f51286d;

    static {
        Covode.recordClassIndex(32068);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void a() {
        this.f51285c.a((Bundle) null);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void b() {
        this.f51286d.f50845h.getGmpAppId(this.f51285c);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(f fVar, oy oyVar) {
        super(fVar);
        this.f51286d = fVar;
        this.f51285c = oyVar;
    }
}
