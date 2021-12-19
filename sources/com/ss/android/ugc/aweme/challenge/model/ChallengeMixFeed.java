package com.ss.android.ugc.aweme.challenge.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.discover.mixfeed.d;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;

public final class ChallengeMixFeed {
    @c(a = "dynamic_patch")
    public d dynamicPatch;
    @c(a = "dynamic_type")
    public int dynamicType;
    @c(a = StringSet.type)
    public int feedType;
    public LogPbBean mLogPbBean;

    static {
        Covode.recordClassIndex(43161);
    }

    public final boolean isLynxCard() {
        if (this.feedType == 999) {
            return true;
        }
        return false;
    }

    public final boolean isVsLiveCard() {
        if (this.feedType == 998) {
            return true;
        }
        return false;
    }
}
