package com.ss.android.ugc.aweme.bg;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;

public final class a extends BaseResponse {
    @c(a = "data")

    /* renamed from: a  reason: collision with root package name */
    public final b f68657a;

    static {
        Covode.recordClassIndex(42254);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && l.a(this.f68657a, ((a) obj).f68657a);
        }
        return true;
    }

    public final int hashCode() {
        b bVar = this.f68657a;
        if (bVar != null) {
            return bVar.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "KproActivityResponse(data=" + this.f68657a + ")";
    }
}
