package com.ss.android.ugc.aweme.commercialize.live.business.links.f;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class d implements Serializable {
    @c(a = "status_code")
    private final int statusCode;
    @c(a = "status_msg")
    private final String statusMsg;
    @c(a = "total")
    private final int total;

    static {
        Covode.recordClassIndex(46019);
    }

    public static int com_ss_android_ugc_aweme_commercialize_live_business_links_model_BusinessLinksCountResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ d copy$default(d dVar, int i2, String str, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = dVar.statusCode;
        }
        if ((i4 & 2) != 0) {
            str = dVar.statusMsg;
        }
        if ((i4 & 4) != 0) {
            i3 = dVar.total;
        }
        return dVar.copy(i2, str, i3);
    }

    public final int component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusMsg;
    }

    public final int component3() {
        return this.total;
    }

    public final d copy(int i2, String str, int i3) {
        l.d(str, "");
        return new d(i2, str, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.statusCode == dVar.statusCode && l.a(this.statusMsg, dVar.statusMsg) && this.total == dVar.total;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_commercialize_live_business_links_model_BusinessLinksCountResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_commercialize_live_business_links_model_BusinessLinksCountResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.statusCode) * 31;
        String str = this.statusMsg;
        return ((com_ss_android_ugc_aweme_commercialize_live_business_links_model_BusinessLinksCountResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_commercialize_live_business_links_model_BusinessLinksCountResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.total);
    }

    public final String toString() {
        return "BusinessLinksCountResponse(statusCode=" + this.statusCode + ", statusMsg=" + this.statusMsg + ", total=" + this.total + ")";
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final int getTotal() {
        return this.total;
    }

    public d(int i2, String str, int i3) {
        l.d(str, "");
        this.statusCode = i2;
        this.statusMsg = str;
        this.total = i3;
    }
}
