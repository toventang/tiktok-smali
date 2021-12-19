package com.ss.android.ugc.aweme.friends.model;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.social.monitor.d;

final /* synthetic */ class ThirdPartyFriendModel$$Lambda$3 implements g {
    private final ThirdPartyFriendModel arg$1;
    private final d arg$2;

    static {
        Covode.recordClassIndex(61618);
    }

    ThirdPartyFriendModel$$Lambda$3(ThirdPartyFriendModel thirdPartyFriendModel, d dVar) {
        this.arg$1 = thirdPartyFriendModel;
        this.arg$2 = dVar;
    }

    @Override // b.g
    public final Object then(i iVar) {
        return this.arg$1.lambda$uploadContacts$3$ThirdPartyFriendModel(this.arg$2, iVar);
    }
}
