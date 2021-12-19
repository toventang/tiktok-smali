package com.ss.android.ugc.aweme.upvote.publish;

import com.bytedance.assem.arch.extensions.a;
import com.bytedance.assem.arch.extensions.f;
import com.bytedance.assem.arch.extensions.t;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.CommentRethinkPopup;
import h.f.b.l;
import h.p;

public final class g implements j {

    /* renamed from: a  reason: collision with root package name */
    public final f<BaseResponse> f142305a;

    /* renamed from: b  reason: collision with root package name */
    public final CommentRethinkPopup f142306b;

    /* renamed from: c  reason: collision with root package name */
    public final a<p<Integer, String>> f142307c;

    static {
        Covode.recordClassIndex(93078);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f142305a, gVar.f142305a) && l.a(this.f142306b, gVar.f142306b) && l.a(this.f142307c, gVar.f142307c);
    }

    public final int hashCode() {
        f<BaseResponse> fVar = this.f142305a;
        int i2 = 0;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        CommentRethinkPopup commentRethinkPopup = this.f142306b;
        int hashCode2 = (hashCode + (commentRethinkPopup != null ? commentRethinkPopup.hashCode() : 0)) * 31;
        a<p<Integer, String>> aVar = this.f142307c;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "UpvotePublishState(request=" + this.f142305a + ", rethinkPopup=" + this.f142306b + ", publishEvent=" + this.f142307c + ")";
    }

    public /* synthetic */ g() {
        this(t.f25669a, null, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.assem.arch.extensions.f<? extends com.ss.android.ugc.aweme.base.api.BaseResponse> */
    /* JADX WARN: Multi-variable type inference failed */
    private g(f<? extends BaseResponse> fVar, CommentRethinkPopup commentRethinkPopup, a<p<Integer, String>> aVar) {
        l.d(fVar, "");
        this.f142305a = fVar;
        this.f142306b = commentRethinkPopup;
        this.f142307c = aVar;
    }

    public static /* synthetic */ g a(g gVar, f fVar, CommentRethinkPopup commentRethinkPopup, a aVar, int i2) {
        if ((i2 & 1) != 0) {
            fVar = gVar.f142305a;
        }
        if ((i2 & 2) != 0) {
            commentRethinkPopup = gVar.f142306b;
        }
        if ((i2 & 4) != 0) {
            aVar = gVar.f142307c;
        }
        l.d(fVar, "");
        return new g(fVar, commentRethinkPopup, aVar);
    }
}
