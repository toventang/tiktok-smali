package com.ss.android.ugc.aweme.fe.method;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ce.b;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements b.AbstractC1579b {

    /* renamed from: a  reason: collision with root package name */
    private final e f91303a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f91304b;

    static {
        Covode.recordClassIndex(57464);
    }

    g(e eVar, Activity activity) {
        this.f91303a = eVar;
        this.f91304b = activity;
    }

    @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
    public final void a(String[] strArr, int[] iArr) {
        this.f91303a.a(this.f91304b, iArr);
    }
}
