package com.ss.android.ugc.aweme.creatortools.creatorplus;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;
import java.util.List;

public final class d extends BaseResponse {
    @c(a = "creator_plus_status")

    /* renamed from: a  reason: collision with root package name */
    public final Integer f78414a;
    @c(a = "features")

    /* renamed from: b  reason: collision with root package name */
    public final List<c> f78415b;

    static {
        Covode.recordClassIndex(48694);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f78414a, dVar.f78414a) && l.a(this.f78415b, dVar.f78415b);
    }

    public final int hashCode() {
        Integer num = this.f78414a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        List<c> list = this.f78415b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "CreatorPlusFeaturesResponse(creatorPlusStatus=" + this.f78414a + ", features=" + this.f78415b + ")";
    }
}
