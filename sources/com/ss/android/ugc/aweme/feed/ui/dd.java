package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class dd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final cv f94561a;

    static {
        Covode.recordClassIndex(60027);
    }

    dd(cv cvVar) {
        this.f94561a = cvVar;
    }

    public final void run() {
        cv cvVar = this.f94561a;
        if (cvVar.f94520j != null) {
            cvVar.f94520j.a().removeObserver(cvVar.f94522l);
        }
    }
}
