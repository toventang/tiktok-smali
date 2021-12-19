package com.ss.android.ugc.aweme.friends.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class aq implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final InviteUserListActivity f97159a;

    static {
        Covode.recordClassIndex(61736);
    }

    aq(InviteUserListActivity inviteUserListActivity) {
        this.f97159a = inviteUserListActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f97159a.a();
    }
}
