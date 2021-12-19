package com.ss.android.ugc.aweme.model.api.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;

public final class a extends BaseResponse {
    @c(a = "navi_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f110703a;

    static {
        Covode.recordClassIndex(71044);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && l.a(this.f110703a, ((a) obj).f110703a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f110703a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "ProfileNaviCreateResponse(naviId=" + this.f110703a + ")";
    }
}
