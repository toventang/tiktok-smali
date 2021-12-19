package com.ss.android.ugc.aweme.account.login.authorize;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cj;

final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final AuthorizeActivity f63346a;

    static {
        Covode.recordClassIndex(39037);
    }

    a(AuthorizeActivity authorizeActivity) {
        this.f63346a = authorizeActivity;
    }

    public final void run() {
        this.f63346a.a(0, new Intent());
        cj.i();
    }
}
