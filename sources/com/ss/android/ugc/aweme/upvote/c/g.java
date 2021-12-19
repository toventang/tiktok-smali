package com.ss.android.ugc.aweme.upvote.c;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.CommentRethinkPopup;
import h.f.b.l;

public final class g extends BaseResponse {
    @c(a = "upvote")

    /* renamed from: a  reason: collision with root package name */
    public final h f142035a;
    @c(a = "rethink_popup")

    /* renamed from: b  reason: collision with root package name */
    public final CommentRethinkPopup f142036b;

    static {
        Covode.recordClassIndex(92826);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f142035a, gVar.f142035a) && l.a(this.f142036b, gVar.f142036b);
    }

    public final int hashCode() {
        h hVar = this.f142035a;
        int i2 = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        CommentRethinkPopup commentRethinkPopup = this.f142036b;
        if (commentRethinkPopup != null) {
            i2 = commentRethinkPopup.hashCode();
        }
        return hashCode + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "UpvotePublishResponse(upvote=" + this.f142035a + ", rethinkPopup=" + this.f142036b + ")";
    }
}
