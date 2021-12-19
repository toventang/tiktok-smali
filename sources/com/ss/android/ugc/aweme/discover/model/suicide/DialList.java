package com.ss.android.ugc.aweme.discover.model.suicide;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;

public final class DialList {
    @c(a = "info")
    public SearchDialInfo searchDialInfo;
    @c(a = StringSet.type)
    public String type;

    static {
        Covode.recordClassIndex(50996);
    }
}
