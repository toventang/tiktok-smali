package com.ss.android.ugc.aweme.comment.c;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;

public final class j extends BaseResponse {
    @c(a = "notice")

    /* renamed from: a  reason: collision with root package name */
    public final i f71765a;

    static {
        Covode.recordClassIndex(44131);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof j) && l.a(this.f71765a, ((j) obj).f71765a);
        }
        return true;
    }

    public final int hashCode() {
        i iVar = this.f71765a;
        if (iVar != null) {
            return iVar.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "PinResult(notice=" + this.f71765a + ")";
    }
}
