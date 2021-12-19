package com.ss.android.ugc.aweme.badge;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;
import java.util.List;

public final class i extends BaseResponse {
    @c(a = "campaign_detail")

    /* renamed from: a  reason: collision with root package name */
    public final d f67928a;
    @c(a = "profile_badges")

    /* renamed from: b  reason: collision with root package name */
    public final List<h> f67929b;

    static {
        Covode.recordClassIndex(41817);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return l.a(this.f67928a, iVar.f67928a) && l.a(this.f67929b, iVar.f67929b);
    }

    public final int hashCode() {
        d dVar = this.f67928a;
        int i2 = 0;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        List<h> list = this.f67929b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "EditProfileBadgeResponse(campaignDetail=" + this.f67928a + ", profileBadges=" + this.f67929b + ")";
    }
}
