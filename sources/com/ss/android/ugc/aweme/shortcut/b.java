package com.ss.android.ugc.aweme.shortcut;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;

public final class b extends BaseResponse {
    @c(a = "data")

    /* renamed from: a  reason: collision with root package name */
    public final a f124688a;

    static {
        Covode.recordClassIndex(81935);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && l.a(this.f124688a, ((b) obj).f124688a);
        }
        return true;
    }

    public final int hashCode() {
        a aVar = this.f124688a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "FissionWithdrawalNumData(data=" + this.f124688a + ")";
    }
}
