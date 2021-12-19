package com.ss.android.ugc.aweme.account.login.authorize;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final AuthorizeActivity f63352a;

    static {
        Covode.recordClassIndex(39045);
    }

    c(AuthorizeActivity authorizeActivity) {
        this.f63352a = authorizeActivity;
    }

    public final void run() {
        this.f63352a.finish();
    }
}
