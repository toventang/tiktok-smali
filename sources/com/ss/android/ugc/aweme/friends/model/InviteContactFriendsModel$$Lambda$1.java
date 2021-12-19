package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.social.monitor.d;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public final /* synthetic */ class InviteContactFriendsModel$$Lambda$1 implements Callable {
    private final InviteContactFriendsModel arg$1;
    private final d arg$2;
    private final AtomicReference arg$3;
    private final boolean arg$4;
    private final int arg$5;

    static {
        Covode.recordClassIndex(61578);
    }

    InviteContactFriendsModel$$Lambda$1(InviteContactFriendsModel inviteContactFriendsModel, d dVar, AtomicReference atomicReference, boolean z, int i2) {
        this.arg$1 = inviteContactFriendsModel;
        this.arg$2 = dVar;
        this.arg$3 = atomicReference;
        this.arg$4 = z;
        this.arg$5 = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.arg$1.lambda$uploadContacts$1$InviteContactFriendsModel(this.arg$2, this.arg$3, this.arg$4, this.arg$5);
    }
}
