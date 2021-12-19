package com.ss.android.ugc.aweme.app.accountsdk;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.bk;
import com.ss.android.ugc.aweme.f;

final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final f f66546a;

    static {
        Covode.recordClassIndex(40904);
    }

    e(f fVar) {
        this.f66546a = fVar;
    }

    public final void run() {
        b.c().saveSharedAccount(new bk.a(this.f66546a));
    }
}
