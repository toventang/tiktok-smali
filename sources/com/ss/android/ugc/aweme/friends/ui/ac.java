package com.ss.android.ugc.aweme.friends.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ac implements SwipeRefreshLayout.b {

    /* renamed from: a  reason: collision with root package name */
    private final InviteFriendsActivity f97143a;

    static {
        Covode.recordClassIndex(61722);
    }

    ac(InviteFriendsActivity inviteFriendsActivity) {
        this.f97143a = inviteFriendsActivity;
    }

    @Override // com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout.b
    public final void a() {
        InviteFriendsActivity inviteFriendsActivity = this.f97143a;
        if (inviteFriendsActivity.f97105j != null) {
            inviteFriendsActivity.f97105j.a(1);
            return;
        }
        inviteFriendsActivity.f97099d.setRefreshing(false);
    }
}
