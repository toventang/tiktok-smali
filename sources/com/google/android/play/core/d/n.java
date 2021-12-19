package com.google.android.play.core.d;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.e.ap;

/* access modifiers changed from: package-private */
public final class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f53213a;

    static {
        Covode.recordClassIndex(32888);
    }

    n(Context context) {
        this.f53213a = context;
    }

    public final void run() {
        ap.a(this.f53213a).a(true);
    }
}
