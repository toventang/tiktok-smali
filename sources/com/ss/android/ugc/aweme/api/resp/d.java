package com.ss.android.ugc.aweme.api.resp;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;

public final class d extends BaseResponse {
    @c(a = "data")

    /* renamed from: a  reason: collision with root package name */
    public final e f66475a = null;

    static {
        Covode.recordClassIndex(40854);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d) && l.a(this.f66475a, ((d) obj).f66475a);
        }
        return true;
    }

    public final int hashCode() {
        e eVar = this.f66475a;
        if (eVar != null) {
            return eVar.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "GetItemProductInfoResponse(data=" + this.f66475a + ")";
    }

    private d() {
    }
}
