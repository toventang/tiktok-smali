package com.ss.android.ugc.aweme.feed.q;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.m.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ag implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final w f93755a;

    static {
        Covode.recordClassIndex(59647);
    }

    ag(w wVar) {
        this.f93755a = wVar;
    }

    public final void run() {
        w wVar = this.f93755a;
        int width = wVar.N.getWidth();
        int height = wVar.N.getHeight();
        a.f93595a = width;
        a.f93596b = height;
    }
}
