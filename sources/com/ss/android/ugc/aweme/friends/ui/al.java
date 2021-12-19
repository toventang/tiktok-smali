package com.ss.android.ugc.aweme.friends.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class al implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final InviteUserListActivity f97154a;

    static {
        Covode.recordClassIndex(61731);
    }

    al(InviteUserListActivity inviteUserListActivity) {
        this.f97154a = inviteUserListActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f97154a.onBackPressed();
    }
}
