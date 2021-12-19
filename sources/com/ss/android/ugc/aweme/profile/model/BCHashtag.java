package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class BCHashtag implements Serializable {
    @c(a = "ad")
    private final String ad = "";
    @c(a = "partner_with")
    private final String partnerWith = "";

    static {
        Covode.recordClassIndex(75205);
    }

    public final String getAd() {
        return this.ad;
    }

    public final String getPartnerWith() {
        return this.partnerWith;
    }
}
