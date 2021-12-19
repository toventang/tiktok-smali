package com.ss.android.ugc.aweme.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;

public final class e extends BaseResponse {
    @c(a = "landing_url")

    /* renamed from: a  reason: collision with root package name */
    public final String f66450a;

    static {
        Covode.recordClassIndex(40840);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof e) && l.a(this.f66450a, ((e) obj).f66450a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f66450a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "LinkTransResult(longUrl=" + this.f66450a + ")";
    }
}
