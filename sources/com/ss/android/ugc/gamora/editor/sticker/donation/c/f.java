package com.ss.android.ugc.gamora.editor.sticker.donation.c;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;
import java.util.List;

public final class f extends BaseResponse {
    @c(a = "cursor")

    /* renamed from: a  reason: collision with root package name */
    public final Integer f146550a;
    @c(a = "has_more")

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f146551b;
    @c(a = "ngos")

    /* renamed from: c  reason: collision with root package name */
    public final List<e> f146552c;

    static {
        Covode.recordClassIndex(96449);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f146550a, fVar.f146550a) && l.a(this.f146551b, fVar.f146551b) && l.a(this.f146552c, fVar.f146552c);
    }

    public final int hashCode() {
        Integer num = this.f146550a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Boolean bool = this.f146551b;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        List<e> list = this.f146552c;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode2 + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "OrganizationSearchResultResponse(cursor=" + this.f146550a + ", hasMore=" + this.f146551b + ", orgList=" + this.f146552c + ")";
    }
}
