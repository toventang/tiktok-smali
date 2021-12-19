package com.ss.android.ugc.aweme.friends.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class ak implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final InviteUserListActivity f97153a;

    static {
        Covode.recordClassIndex(61730);
    }

    ak(InviteUserListActivity inviteUserListActivity) {
        this.f97153a = inviteUserListActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f97153a.onClick(view);
    }
}
