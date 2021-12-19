package com.ss.android.ugc.aweme.friends.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class ah implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final InviteUserListActivity f97150a;

    static {
        Covode.recordClassIndex(61727);
    }

    ah(InviteUserListActivity inviteUserListActivity) {
        this.f97150a = inviteUserListActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f97150a.onClick(view);
    }
}
