package com.ss.android.ugc.aweme;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.login.LoginUtilsServiceImpl;

final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f112198a;

    static {
        Covode.recordClassIndex(72102);
    }

    n(Bundle bundle) {
        this.f112198a = bundle;
    }

    public final void run() {
        LoginUtilsServiceImpl.a().a(this.f112198a);
    }
}
