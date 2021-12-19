package com.ss.android.ugc.aweme.account.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final RecoverDeletedAccountActivity f65433a;

    static {
        Covode.recordClassIndex(40222);
    }

    e(RecoverDeletedAccountActivity recoverDeletedAccountActivity) {
        this.f65433a = recoverDeletedAccountActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        RecoverDeletedAccountActivity recoverDeletedAccountActivity = this.f65433a;
        recoverDeletedAccountActivity.f65423k.a(RecoverDeletedAccountActivity.f65413b, new g(recoverDeletedAccountActivity));
    }
}
