package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.f;

public final class k extends f.a {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f51086c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f51087d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Bundle f51088e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ f f51089f;

    static {
        Covode.recordClassIndex(31924);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void b() {
        this.f51089f.f50845h.clearConditionalUserProperty(this.f51086c, this.f51087d, this.f51088e);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(f fVar, String str, String str2, Bundle bundle) {
        super(fVar);
        this.f51089f = fVar;
        this.f51086c = str;
        this.f51087d = str2;
        this.f51088e = bundle;
    }
}
