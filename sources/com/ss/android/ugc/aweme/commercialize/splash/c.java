package com.ss.android.ugc.aweme.commercialize.splash;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f75282a;

    static {
        Covode.recordClassIndex(46465);
    }

    c(b bVar) {
        this.f75282a = bVar;
    }

    public final void run() {
        b bVar = this.f75282a;
        if (bVar.f75273a != null) {
            bVar.f75273a.a();
            bVar.f75273a = null;
        }
    }
}
