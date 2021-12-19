package com.ss.android.ugc.aweme.account.ui;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final RecoverDeletedAccountActivity f65436a;

    static {
        Covode.recordClassIndex(40225);
    }

    h(RecoverDeletedAccountActivity recoverDeletedAccountActivity) {
        this.f65436a = recoverDeletedAccountActivity;
    }

    public final void run() {
        this.f65436a.f65422j.queryUser();
    }
}
