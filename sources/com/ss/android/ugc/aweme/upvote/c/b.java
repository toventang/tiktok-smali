package com.ss.android.ugc.aweme.upvote.c;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;
import java.util.List;

public final class b extends BaseResponse {
    @c(a = "upvote_lists")

    /* renamed from: a  reason: collision with root package name */
    public final List<e> f142029a;

    static {
        Covode.recordClassIndex(92821);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && l.a(this.f142029a, ((b) obj).f142029a);
        }
        return true;
    }

    public final int hashCode() {
        List<e> list = this.f142029a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "UpvoteBatchListResponse(upvoteLists=" + this.f142029a + ")";
    }
}
