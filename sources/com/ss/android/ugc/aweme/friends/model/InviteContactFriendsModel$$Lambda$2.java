package com.ss.android.ugc.aweme.friends.model;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.social.monitor.d;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public final /* synthetic */ class InviteContactFriendsModel$$Lambda$2 implements g {
    private final InviteContactFriendsModel arg$1;
    private final d arg$2;
    private final AtomicReference arg$3;

    static {
        Covode.recordClassIndex(61579);
    }

    InviteContactFriendsModel$$Lambda$2(InviteContactFriendsModel inviteContactFriendsModel, d dVar, AtomicReference atomicReference) {
        this.arg$1 = inviteContactFriendsModel;
        this.arg$2 = dVar;
        this.arg$3 = atomicReference;
    }

    @Override // b.g
    public final Object then(i iVar) {
        return this.arg$1.lambda$uploadContacts$2$InviteContactFriendsModel(this.arg$2, this.arg$3, iVar);
    }
}
