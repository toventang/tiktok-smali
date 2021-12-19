package com.ss.android.ugc.aweme.feed.x;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.b.l;

public final class k {
    static {
        Covode.recordClassIndex(60378);
    }

    public static final boolean a(AwemeRawAd awemeRawAd) {
        l.d(awemeRawAd, "");
        if (awemeRawAd.getUseOrdinaryWeb_() == null) {
            return true;
        }
        Boolean useOrdinaryWeb_ = awemeRawAd.getUseOrdinaryWeb_();
        l.b(useOrdinaryWeb_, "");
        return useOrdinaryWeb_.booleanValue();
    }
}
