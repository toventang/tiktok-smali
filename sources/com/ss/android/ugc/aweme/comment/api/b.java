package com.ss.android.ugc.aweme.comment.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;

public final class b extends BaseResponse {
    @c(a = "failed_cids")

    /* renamed from: a  reason: collision with root package name */
    public final String f71460a;

    static {
        Covode.recordClassIndex(43984);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && l.a(this.f71460a, ((b) obj).f71460a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f71460a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "CommentBatchDeleteResponse(failedCids=" + this.f71460a + ")";
    }

    private /* synthetic */ b() {
        this("");
    }

    private b(String str) {
        this.f71460a = str;
    }
}
