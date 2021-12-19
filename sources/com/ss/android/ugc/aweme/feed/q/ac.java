package com.ss.android.ugc.aweme.feed.q;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;

final /* synthetic */ class ac implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final w f93749a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f93750b;

    static {
        Covode.recordClassIndex(59643);
    }

    ac(w wVar, Aweme aweme) {
        this.f93749a = wVar;
        this.f93750b = aweme;
    }

    public final void run() {
        this.f93749a.a(this.f93750b);
    }
}
