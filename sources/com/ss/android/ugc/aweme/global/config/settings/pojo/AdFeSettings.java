package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class AdFeSettings {
    @c(a = "legal_page")
    private String legalPage;
    @c(a = "music_legal")
    private String musicLegal;
    @c(a = "revenue_share")
    private RevenueShare revenueShare;

    static {
        Covode.recordClassIndex(63008);
    }

    public String getLegalPage() {
        String str = this.legalPage;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getMusicLegalPage() {
        String str = this.musicLegal;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public RevenueShare getRevenueShare() {
        RevenueShare revenueShare2 = this.revenueShare;
        if (revenueShare2 != null) {
            return revenueShare2;
        }
        throw new a();
    }
}
