package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.f;

/* access modifiers changed from: package-private */
public final class ag extends f.a {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Long f50644c = null;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f50645d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f50646e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Bundle f50647f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ boolean f50648g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ boolean f50649h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ f f50650i;

    static {
        Covode.recordClassIndex(31603);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void b() {
        long longValue;
        Long l2 = this.f50644c;
        if (l2 == null) {
            longValue = this.f50848a;
        } else {
            longValue = l2.longValue();
        }
        this.f50650i.f50845h.logEvent(this.f50645d, this.f50646e, this.f50647f, this.f50648g, this.f50649h, longValue);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ag(f fVar, String str, String str2, Bundle bundle, boolean z) {
        super(fVar);
        this.f50650i = fVar;
        this.f50645d = str;
        this.f50646e = str2;
        this.f50647f = bundle;
        this.f50648g = z;
        this.f50649h = true;
    }
}
