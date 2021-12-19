package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.a.b;
import com.google.android.gms.internal.measurement.f;

/* access modifiers changed from: package-private */
public final class aa extends f.a {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f50621c = 5;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f50622d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Object f50623e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Object f50624f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ Object f50625g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ f f50626h;

    static {
        Covode.recordClassIndex(31597);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void b() {
        this.f50626h.f50845h.logHealthData(this.f50621c, this.f50622d, b.a(this.f50623e), b.a(this.f50624f), b.a(this.f50625g));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    aa(f fVar, String str, Object obj) {
        super(false);
        this.f50626h = fVar;
        this.f50622d = str;
        this.f50623e = obj;
    }
}
