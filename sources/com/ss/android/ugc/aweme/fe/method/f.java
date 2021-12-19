package com.ss.android.ugc.aweme.fe.method;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ce.b;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements b.AbstractC1579b {

    /* renamed from: a  reason: collision with root package name */
    private final e f91278a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f91279b;

    static {
        Covode.recordClassIndex(57448);
    }

    f(e eVar, Activity activity) {
        this.f91278a = eVar;
        this.f91279b = activity;
    }

    @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
    public final void a(String[] strArr, int[] iArr) {
        this.f91278a.b(this.f91279b, iArr);
    }
}
