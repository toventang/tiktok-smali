package com.ss.android.ugc.aweme.model.api.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;

public final class b extends BaseResponse {
    @c(a = "navi_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f110704a;

    static {
        Covode.recordClassIndex(71045);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && l.a(this.f110704a, ((b) obj).f110704a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f110704a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "ProfileNaviEditResponse(naviId=" + this.f110704a + ")";
    }
}
