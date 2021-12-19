package com.ss.android.ugc.aweme.friends.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.share.InviteFriendSharePackage;
import com.ss.android.ugc.aweme.sharer.b;
import com.ss.android.ugc.aweme.sharer.ui.bar.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ab implements f {

    /* renamed from: a  reason: collision with root package name */
    private final InviteFriendsActivity f97141a;

    /* renamed from: b  reason: collision with root package name */
    private final InviteFriendSharePackage f97142b;

    static {
        Covode.recordClassIndex(61721);
    }

    ab(InviteFriendsActivity inviteFriendsActivity, InviteFriendSharePackage inviteFriendSharePackage) {
        this.f97141a = inviteFriendsActivity;
        this.f97142b = inviteFriendSharePackage;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.bar.f
    public final void a_(b bVar) {
        InviteFriendsActivity inviteFriendsActivity = this.f97141a;
        InviteFriendSharePackage inviteFriendSharePackage = this.f97142b;
        if (!inviteFriendSharePackage.a(bVar, inviteFriendsActivity)) {
            bVar.a(inviteFriendSharePackage.a(bVar), inviteFriendsActivity);
        }
    }
}
