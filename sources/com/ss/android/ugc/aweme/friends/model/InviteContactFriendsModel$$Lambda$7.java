package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.invite.e;
import com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel;

/* access modifiers changed from: package-private */
public final /* synthetic */ class InviteContactFriendsModel$$Lambda$7 implements Runnable {
    private final InviteContactFriendsModel.IFetchShareConfigCallback arg$1;
    private final e arg$2;

    static {
        Covode.recordClassIndex(61584);
    }

    InviteContactFriendsModel$$Lambda$7(InviteContactFriendsModel.IFetchShareConfigCallback iFetchShareConfigCallback, e eVar) {
        this.arg$1 = iFetchShareConfigCallback;
        this.arg$2 = eVar;
    }

    public final void run() {
        InviteContactFriendsModel.lambda$null$6$InviteContactFriendsModel(this.arg$1, this.arg$2);
    }
}
