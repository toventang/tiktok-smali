package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.social.monitor.d;
import java.util.concurrent.Callable;

final /* synthetic */ class ThirdPartyFriendModel$$Lambda$2 implements Callable {
    private final ThirdPartyFriendModel arg$1;
    private final d arg$2;

    static {
        Covode.recordClassIndex(61617);
    }

    ThirdPartyFriendModel$$Lambda$2(ThirdPartyFriendModel thirdPartyFriendModel, d dVar) {
        this.arg$1 = thirdPartyFriendModel;
        this.arg$2 = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.arg$1.lambda$uploadContacts$2$ThirdPartyFriendModel(this.arg$2);
    }
}
