package com.ss.android.ugc.aweme.account.login.authorize;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.n.a;

final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final AuthorizeActivity f63357a;

    /* renamed from: b  reason: collision with root package name */
    private final a f63358b;

    static {
        Covode.recordClassIndex(39048);
    }

    f(AuthorizeActivity authorizeActivity, a aVar) {
        this.f63357a = authorizeActivity;
        this.f63358b = aVar;
    }

    public final void run() {
        this.f63357a.c(this.f63358b);
    }
}
