package com.ss.android.ugc.aweme.upvote.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;
import java.util.List;

public final class c extends BaseResponse {
    @com.google.gson.a.c(a = "upvotes")

    /* renamed from: a  reason: collision with root package name */
    public final List<h> f142030a;
    @com.google.gson.a.c(a = "failed_item_ids")

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f142031b;

    static {
        Covode.recordClassIndex(92822);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f142030a, cVar.f142030a) && l.a(this.f142031b, cVar.f142031b);
    }

    public final int hashCode() {
        List<h> list = this.f142030a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.f142031b;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "UpvoteBatchPublishResponse(upvotes=" + this.f142030a + ", failedItemIds=" + this.f142031b + ")";
    }
}
