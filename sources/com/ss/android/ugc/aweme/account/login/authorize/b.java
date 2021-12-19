package com.ss.android.ugc.aweme.account.login.authorize;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final AuthorizeActivity f63349a;

    static {
        Covode.recordClassIndex(39041);
    }

    b(AuthorizeActivity authorizeActivity) {
        this.f63349a = authorizeActivity;
    }

    public final void run() {
        AuthorizeActivity authorizeActivity = this.f63349a;
        Context applicationContext = authorizeActivity.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        new com.ss.android.ugc.aweme.tux.a.i.a(applicationContext).a(R.string.d02).a();
        authorizeActivity.a(0, new Intent());
        cj.i();
    }
}
