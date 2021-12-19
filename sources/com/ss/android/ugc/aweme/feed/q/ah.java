package com.ss.android.ugc.aweme.feed.q;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.video.ac;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ah implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final w f93756a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f93757b;

    static {
        Covode.recordClassIndex(59648);
    }

    ah(w wVar, Aweme aweme) {
        this.f93756a = wVar;
        this.f93757b = aweme;
    }

    public final void run() {
        w wVar = this.f93756a;
        Aweme aweme = this.f93757b;
        if (ac.a(aweme)) {
            m.f68150a.execute(new ac(wVar, aweme));
        }
    }
}
