package com.ss.android.ugc.aweme.friends.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.f.c;
import com.ss.android.ugc.aweme.friends.i.f;
import com.ss.android.ugc.aweme.friends.model.ContactModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class ad implements c.b {

    /* renamed from: a  reason: collision with root package name */
    private final InviteFriendsActivity f97144a;

    /* renamed from: b  reason: collision with root package name */
    private final User f97145b;

    /* renamed from: c  reason: collision with root package name */
    private final ContactModel f97146c;

    static {
        Covode.recordClassIndex(61723);
    }

    ad(InviteFriendsActivity inviteFriendsActivity, User user, ContactModel contactModel) {
        this.f97144a = inviteFriendsActivity;
        this.f97145b = user;
        this.f97146c = contactModel;
    }

    @Override // com.ss.android.ugc.aweme.friends.f.c.b
    public final void a(String str) {
        InviteFriendsActivity inviteFriendsActivity = this.f97144a;
        User user = this.f97145b;
        ContactModel contactModel = this.f97146c;
        boolean unused = f.a(inviteFriendsActivity, contactModel.phoneNumber, inviteFriendsActivity.f97103h.a(in.j(user)) + str, R.string.coa);
    }
}
