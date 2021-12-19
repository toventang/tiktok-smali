package com.ss.android.ugc.aweme.comment.barrage;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import f.a.t;
import h.f.b.l;

public final class BarrageCommentAndLikeApi implements IBarrageCommentAndLikeApi {

    /* renamed from: a  reason: collision with root package name */
    public static final BarrageCommentAndLikeApi f71530a = new BarrageCommentAndLikeApi();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IBarrageCommentAndLikeApi f71531b;

    @Override // com.ss.android.ugc.aweme.comment.barrage.IBarrageCommentAndLikeApi
    @h(a = "/aweme/v2/comment/list/")
    public final t<CommentItemList> fetchCommentList(@z(a = "aweme_id") String str, @z(a = "cursor") long j2, @z(a = "count") int i2, @z(a = "insert_ids") String str2, @z(a = "channel_id") int i3, @z(a = "source_type") int i4, @z(a = "scenario") int i5) {
        l.d(str, "");
        return this.f71531b.fetchCommentList(str, j2, i2, str2, i3, i4, i5);
    }

    static {
        Covode.recordClassIndex(44011);
    }

    private BarrageCommentAndLikeApi() {
        Object a2 = RetrofitFactory.a().a(b.f59141e).a(IBarrageCommentAndLikeApi.class);
        l.b(a2, "");
        this.f71531b = (IBarrageCommentAndLikeApi) a2;
    }
}
