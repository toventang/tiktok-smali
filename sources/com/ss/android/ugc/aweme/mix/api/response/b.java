package com.ss.android.ugc.aweme.mix.api.response;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;

public final class b extends BaseResponse {
    @c(a = "mix_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f109797a;

    static {
        Covode.recordClassIndex(70315);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && l.a(this.f109797a, ((b) obj).f109797a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f109797a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "ManageResponse(mixId=" + this.f109797a + ")";
    }
}
