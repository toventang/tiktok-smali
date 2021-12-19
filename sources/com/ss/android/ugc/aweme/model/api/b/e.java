package com.ss.android.ugc.aweme.model.api.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.model.api.a.b;
import h.f.b.l;
import java.util.List;

public final class e extends BaseResponse {
    @c(a = "total")

    /* renamed from: a  reason: collision with root package name */
    public final Long f110708a;
    @c(a = "has_more")

    /* renamed from: b  reason: collision with root package name */
    public final int f110709b;
    @c(a = "navis")

    /* renamed from: c  reason: collision with root package name */
    public final List<b> f110710c;

    static {
        Covode.recordClassIndex(71048);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f110708a, eVar.f110708a) && this.f110709b == eVar.f110709b && l.a(this.f110710c, eVar.f110710c);
    }

    public final int hashCode() {
        Long l2 = this.f110708a;
        int i2 = 0;
        int hashCode = (((l2 != null ? l2.hashCode() : 0) * 31) + this.f110709b) * 31;
        List<b> list = this.f110710c;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "ProfileNaviListResponse(naviCount=" + this.f110708a + ", hasMore=" + this.f110709b + ", naviList=" + this.f110710c + ")";
    }
}
