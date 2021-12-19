package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.a.b;
import com.google.android.gms.internal.measurement.f;

public final class l extends f.a {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Activity f51142c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f51143d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f51144e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ f f51145f;

    static {
        Covode.recordClassIndex(31951);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void b() {
        this.f51145f.f50845h.setCurrentScreen(b.a(this.f51142c), this.f51143d, this.f51144e, this.f50848a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(f fVar, Activity activity, String str, String str2) {
        super(fVar);
        this.f51145f = fVar;
        this.f51142c = activity;
        this.f51143d = str;
        this.f51144e = str2;
    }
}
