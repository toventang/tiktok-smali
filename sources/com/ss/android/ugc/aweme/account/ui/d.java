package com.ss.android.ugc.aweme.account.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.utils.bt;
import com.ss.android.ugc.aweme.views.i;

final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final RecoverDeletedAccountActivity f65432a;

    static {
        Covode.recordClassIndex(40221);
    }

    d(RecoverDeletedAccountActivity recoverDeletedAccountActivity) {
        this.f65432a = recoverDeletedAccountActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        RecoverDeletedAccountActivity recoverDeletedAccountActivity = this.f65432a;
        if (!recoverDeletedAccountActivity.f65421i) {
            if (recoverDeletedAccountActivity.f65420h == null) {
                recoverDeletedAccountActivity.f65420h = new i(recoverDeletedAccountActivity);
            }
            bt.a(recoverDeletedAccountActivity.f65420h);
            b.a();
            b.f62864a.a(new f(recoverDeletedAccountActivity));
            recoverDeletedAccountActivity.f65421i = true;
            b.b().logout("recover_account", "user_logout");
        }
    }
}
