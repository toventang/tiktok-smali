package com.ss.android.ugc.aweme.feed.q;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f93797a;

    static {
        Covode.recordClassIndex(59680);
    }

    n(a aVar) {
        this.f93797a = aVar;
    }

    public final void run() {
        a aVar = this.f93797a;
        if (aVar.N != null && aVar.aD != null) {
            aVar.N.postOnAnimation(aVar.aD);
        }
    }
}
