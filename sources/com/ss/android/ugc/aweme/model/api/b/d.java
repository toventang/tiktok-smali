package com.ss.android.ugc.aweme.model.api.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.model.api.a.b;
import h.f.b.l;

public final class d extends BaseResponse {
    @c(a = "navi")

    /* renamed from: a  reason: collision with root package name */
    public final b f110707a;

    static {
        Covode.recordClassIndex(71047);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d) && l.a(this.f110707a, ((d) obj).f110707a);
        }
        return true;
    }

    public final int hashCode() {
        b bVar = this.f110707a;
        if (bVar != null) {
            return bVar.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "ProfileNaviInfoResponse(navi=" + this.f110707a + ")";
    }
}
