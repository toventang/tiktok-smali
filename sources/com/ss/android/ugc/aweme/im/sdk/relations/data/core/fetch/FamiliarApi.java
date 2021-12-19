package com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch;

import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model.FamiliarsRelationFetchResponse;
import l.b.c;
import l.b.e;
import l.b.o;

public interface FamiliarApi {
    static {
        Covode.recordClassIndex(66120);
    }

    @o(a = "im/spotlight/friend_relation/")
    @e
    q<FamiliarsRelationFetchResponse> getSpotlightRelationOfFriends(@c(a = "params") String str);
}
