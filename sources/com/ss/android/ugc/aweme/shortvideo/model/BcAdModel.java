package com.ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.TagBAUser;
import h.f.b.l;

public final class BcAdModel {
    public final String ad;
    public final TagBAUser baUser;
    public final String partnerWith;

    static {
        Covode.recordClassIndex(84411);
    }

    public BcAdModel(String str, String str2, TagBAUser tagBAUser) {
        l.d(str, "");
        l.d(str2, "");
        this.ad = str;
        this.partnerWith = str2;
        this.baUser = tagBAUser;
    }
}
