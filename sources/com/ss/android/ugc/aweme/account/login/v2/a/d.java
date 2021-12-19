package com.ss.android.ugc.aweme.account.login.v2.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;
import java.util.List;

public final class d extends BaseResponse {
    @c(a = "is_valid")

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f64233a = null;
    @c(a = "recommended_unique_ids")

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f64234b = null;

    static {
        Covode.recordClassIndex(39573);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f64233a, dVar.f64233a) && l.a(this.f64234b, dVar.f64234b);
    }

    public final int hashCode() {
        Boolean bool = this.f64233a;
        int i2 = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        List<String> list = this.f64234b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "CheckUserNameResponse(is_valid=" + this.f64233a + ", recommended_unique_ids=" + this.f64234b + ")";
    }
}
