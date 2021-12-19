package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.a.b;
import com.google.android.gms.internal.measurement.f;

final class al extends f.a {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Activity f50660c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ oy f50661d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ f.b f50662e;

    static {
        Covode.recordClassIndex(31608);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void b() {
        f.this.f50845h.onActivitySaveInstanceState(b.a(this.f50660c), this.f50661d, this.f50849b);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    al(f.b bVar, Activity activity, oy oyVar) {
        super(f.this);
        this.f50662e = bVar;
        this.f50660c = activity;
        this.f50661d = oyVar;
    }
}
