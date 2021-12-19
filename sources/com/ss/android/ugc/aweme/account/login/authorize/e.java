package com.ss.android.ugc.aweme.account.login.authorize;

import android.content.Intent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final AuthorizeActivity f63354a;

    /* renamed from: b  reason: collision with root package name */
    private final int f63355b;

    /* renamed from: c  reason: collision with root package name */
    private final Intent f63356c;

    static {
        Covode.recordClassIndex(39047);
    }

    e(AuthorizeActivity authorizeActivity, int i2, Intent intent) {
        this.f63354a = authorizeActivity;
        this.f63355b = i2;
        this.f63356c = intent;
    }

    public final void run() {
        AuthorizeActivity authorizeActivity = this.f63354a;
        authorizeActivity.setResult(this.f63355b, this.f63356c);
        authorizeActivity.finish();
    }
}
