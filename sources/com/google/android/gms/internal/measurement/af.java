package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.a.b;
import com.google.android.gms.internal.measurement.f;

/* access modifiers changed from: package-private */
public final class af extends f.a {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f50639c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f50640d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Object f50641e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ boolean f50642f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ f f50643g;

    static {
        Covode.recordClassIndex(31602);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void b() {
        this.f50643g.f50845h.setUserProperty(this.f50639c, this.f50640d, b.a(this.f50641e), this.f50642f, this.f50848a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    af(f fVar, String str, String str2, Object obj, boolean z) {
        super(fVar);
        this.f50643g = fVar;
        this.f50639c = str;
        this.f50640d = str2;
        this.f50641e = obj;
        this.f50642f = z;
    }
}
