package com.ss.android.ugc.aweme.account.security;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;

public final class c extends BaseResponse {
    @com.google.gson.a.c(a = "data")

    /* renamed from: a  reason: collision with root package name */
    public final a f65310a = null;

    static {
        Covode.recordClassIndex(40157);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c) && l.a(this.f65310a, ((c) obj).f65310a);
        }
        return true;
    }

    public final int hashCode() {
        a aVar = this.f65310a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "SafeInfoNoticeMsgResponse(data=" + this.f65310a + ")";
    }

    private c() {
    }
}
