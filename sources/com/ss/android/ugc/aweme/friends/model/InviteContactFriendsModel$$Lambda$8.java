package com.ss.android.ugc.aweme.friends.model;

import b.i;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class InviteContactFriendsModel$$Lambda$8 implements Callable {
    private final i arg$1;

    static {
        Covode.recordClassIndex(61585);
    }

    private InviteContactFriendsModel$$Lambda$8(i iVar) {
        this.arg$1 = iVar;
    }

    static Callable get$Lambda(i iVar) {
        return new InviteContactFriendsModel$$Lambda$8(iVar);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.arg$1.d();
    }
}
