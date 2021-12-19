package com.google.android.play.core.e.b;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.e.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f53291a;

    /* renamed from: b  reason: collision with root package name */
    private final f f53292b;

    static {
        Covode.recordClassIndex(32924);
    }

    g(a aVar, f fVar) {
        this.f53291a = aVar;
        this.f53292b = fVar;
    }

    public final void run() {
        a aVar = this.f53291a;
        aVar.f53267c.a(this.f53292b);
    }
}
