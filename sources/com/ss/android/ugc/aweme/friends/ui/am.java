package com.ss.android.ugc.aweme.friends.ui;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.ufr.c;
import com.ss.android.ugc.aweme.ufr.d;
import com.ss.android.ugc.aweme.ufr.g;
import com.zhiliaoapp.musically.R;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class am implements f {

    /* renamed from: a  reason: collision with root package name */
    private final InviteUserListActivity f97155a;

    static {
        Covode.recordClassIndex(61732);
    }

    am(InviteUserListActivity inviteUserListActivity) {
        this.f97155a = inviteUserListActivity;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        InviteUserListActivity inviteUserListActivity = this.f97155a;
        d dVar = (d) obj;
        if (dVar.f141689a == g.AUTHORIZED) {
            r.a("friend_list_notify_confirm", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "facebook").f66730a);
            inviteUserListActivity.n = c.b.f141662a.a(inviteUserListActivity.o);
            if (TextUtils.isEmpty(inviteUserListActivity.n)) {
                new b(inviteUserListActivity).e(R.string.cog).b();
            } else {
                inviteUserListActivity.c();
            }
        } else if ((dVar.f141689a == g.REQUEST_ACTUAL_PERMISSION || dVar.f141689a == g.REQUEST_UID_PERMISSION) && !dVar.f141690b.f141691a) {
            inviteUserListActivity.f97120h.setRefreshing(false);
            inviteUserListActivity.finish();
        }
    }
}
