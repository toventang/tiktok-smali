package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.aq.a.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class db implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final cv f94557a;

    static {
        Covode.recordClassIndex(60025);
    }

    db(cv cvVar) {
        this.f94557a = cvVar;
    }

    public final void run() {
        cv cvVar = this.f94557a;
        cvVar.f94511a.setTag(a.f66964a, false);
        cvVar.f94511a.setImageDrawable(cvVar.f94518h);
    }
}
