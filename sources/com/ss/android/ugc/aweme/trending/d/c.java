package com.ss.android.ugc.aweme.trending.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.dm;
import com.ss.android.ugc.aweme.utils.x;

public abstract class c implements x.a {
    static {
        Covode.recordClassIndex(92102);
    }

    public abstract String a(Aweme aweme);

    @Override // com.ss.android.ugc.aweme.utils.x.a
    public final boolean a(Aweme aweme, String str) {
        if (aweme == null || !aweme.hasTrendingBarFYP()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.utils.x.a
    public final String a(Aweme aweme, String str, dm dmVar) {
        return a(aweme);
    }
}
