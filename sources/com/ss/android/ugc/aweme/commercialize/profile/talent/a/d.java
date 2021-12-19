package com.ss.android.ugc.aweme.commercialize.profile.talent.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;
import java.util.List;

public final class d extends BaseResponse {
    @c(a = "ad_gap")

    /* renamed from: a  reason: collision with root package name */
    public final int f75267a;
    @c(a = "profile_ads")

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f75268b;

    static {
        Covode.recordClassIndex(46443);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f75267a == dVar.f75267a && l.a(this.f75268b, dVar.f75268b);
    }

    public final int hashCode() {
        int i2 = this.f75267a * 31;
        List<b> list = this.f75268b;
        return i2 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "ProfileTalentShareAdResult(adGap=" + this.f75267a + ", profileAds=" + this.f75268b + ")";
    }
}
