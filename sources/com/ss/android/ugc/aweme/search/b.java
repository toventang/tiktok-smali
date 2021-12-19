package com.ss.android.ugc.aweme.search;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.alading.d;
import com.ss.android.ugc.aweme.discover.alading.f;
import com.ss.android.ugc.aweme.discover.model.SearchUser;

public final class b {
    static {
        Covode.recordClassIndex(78803);
    }

    public static com.ss.android.ugc.aweme.e.b a(d dVar, SearchUser searchUser) {
        if (searchUser.cardType() == 1) {
            return new f(dVar);
        }
        return null;
    }
}
