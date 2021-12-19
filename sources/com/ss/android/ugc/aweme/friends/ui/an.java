package com.ss.android.ugc.aweme.friends.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.zhiliaoapp.musically.R;
import h.f.a.b;

final /* synthetic */ class an implements b {

    /* renamed from: a  reason: collision with root package name */
    private final InviteUserListActivity f97156a;

    static {
        Covode.recordClassIndex(61733);
    }

    an(InviteUserListActivity inviteUserListActivity) {
        this.f97156a = inviteUserListActivity;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        int i2;
        InviteUserListActivity inviteUserListActivity = this.f97156a;
        TuxButton tuxButton = (TuxButton) obj;
        if (inviteUserListActivity.f97124l == 3) {
            i2 = R.string.bxw;
        } else if (inviteUserListActivity.f97124l == 2) {
            i2 = R.string.bxa;
        } else {
            i2 = inviteUserListActivity.f97124l == 4 ? R.string.bxg : 0;
        }
        tuxButton.setText(i2);
        tuxButton.setButtonSize(3);
        tuxButton.setButtonVariant(0);
        tuxButton.setOnClickListener(new aq(inviteUserListActivity));
        return null;
    }
}
