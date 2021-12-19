package com.ss.android.ugc.aweme.upvote.c;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;

public final class f extends BaseResponse {
    @c(a = "upvote_list")

    /* renamed from: a  reason: collision with root package name */
    public final e f142033a;
    @c(a = "new_insert_ids")

    /* renamed from: b  reason: collision with root package name */
    public final String f142034b;

    static {
        Covode.recordClassIndex(92825);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f142033a, fVar.f142033a) && l.a(this.f142034b, fVar.f142034b);
    }

    public final int hashCode() {
        e eVar = this.f142033a;
        int i2 = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        String str = this.f142034b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "UpvoteListResponse(upvoteList=" + this.f142033a + ", newInsertIds=" + this.f142034b + ")";
    }
}
