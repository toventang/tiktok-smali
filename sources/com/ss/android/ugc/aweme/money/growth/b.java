package com.ss.android.ugc.aweme.money.growth;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class b {
    @c(a = "campaign_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f110829a;
    @c(a = "campaign")

    /* renamed from: b  reason: collision with root package name */
    public final String f110830b;

    static {
        Covode.recordClassIndex(71117);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f110829a, bVar.f110829a) && l.a(this.f110830b, bVar.f110830b);
    }

    public final int hashCode() {
        String str = this.f110829a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f110830b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "GoogleCampaignInfo(campaignId=" + this.f110829a + ", campaign=" + this.f110830b + ")";
    }
}
