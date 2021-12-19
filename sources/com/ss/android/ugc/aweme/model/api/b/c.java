package com.ss.android.ugc.aweme.model.api.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.model.api.a.d;
import h.f.b.l;
import java.util.List;

public final class c extends BaseResponse {
    @com.google.gson.a.c(a = "has_more")

    /* renamed from: a  reason: collision with root package name */
    public final int f110705a;
    @com.google.gson.a.c(a = "navi_profile_images")

    /* renamed from: b  reason: collision with root package name */
    public final List<d> f110706b;

    static {
        Covode.recordClassIndex(71046);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f110705a == cVar.f110705a && l.a(this.f110706b, cVar.f110706b);
    }

    public final int hashCode() {
        int i2 = this.f110705a * 31;
        List<d> list = this.f110706b;
        return i2 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "ProfileNaviImageListResponse(hasMore=" + this.f110705a + ", naviList=" + this.f110706b + ")";
    }
}
