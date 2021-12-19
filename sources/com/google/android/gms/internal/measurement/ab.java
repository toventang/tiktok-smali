package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.f;

public final class ab extends f.a {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f50627c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f50628d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ boolean f50629e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ oy f50630f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ f f50631g;

    static {
        Covode.recordClassIndex(31598);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void a() {
        this.f50630f.a((Bundle) null);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void b() {
        this.f50631g.f50845h.getUserProperties(this.f50627c, this.f50628d, this.f50629e, this.f50630f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ab(f fVar, String str, String str2, boolean z, oy oyVar) {
        super(fVar);
        this.f50631g = fVar;
        this.f50627c = str;
        this.f50628d = str2;
        this.f50629e = z;
        this.f50630f = oyVar;
    }
}
