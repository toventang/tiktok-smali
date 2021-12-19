package com.ss.android.ugc.aweme.upvote.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.translation.a.a;
import com.ss.android.ugc.aweme.upvote.c.b;
import com.ss.android.ugc.aweme.upvote.c.c;
import com.ss.android.ugc.aweme.upvote.c.f;
import f.a.ab;
import h.f.b.l;

public final class UpvoteApi implements IUpvoteApi {

    /* renamed from: a  reason: collision with root package name */
    public static final UpvoteApi f142023a = new UpvoteApi();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IUpvoteApi f142024b;

    @Override // com.ss.android.ugc.aweme.upvote.api.IUpvoteApi
    @t(a = "tiktok/v1/upvote/delete")
    @g
    public final ab<BaseResponse> deleteUpvote(@e(a = "item_id") String str) {
        l.d(str, "");
        return this.f142024b.deleteUpvote(str);
    }

    @Override // com.ss.android.ugc.aweme.upvote.api.IUpvoteApi
    @h(a = "aweme/v1/comment/digg/")
    public final f.a.t<BaseResponse> digg(@z(a = "cid") String str, @z(a = "aweme_id") String str2, @z(a = "digg_type") int i2) {
        l.d(str, "");
        l.d(str2, "");
        return this.f142024b.digg(str, str2, i2);
    }

    @Override // com.ss.android.ugc.aweme.upvote.api.IUpvoteApi
    @h(a = "tiktok/v1/upvote/batch_list")
    public final f.a.t<b> getUpvoteBatchList(@z(a = "item_ids") String str, @z(a = "upvote_reasons") String str2) {
        l.d(str, "");
        l.d(str2, "");
        return this.f142024b.getUpvoteBatchList(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.upvote.api.IUpvoteApi
    @h(a = "tiktok/v1/upvote/list")
    public final f.a.t<f> getUpvoteList(@z(a = "item_id") String str, @z(a = "cursor") long j2, @z(a = "count") int i2, @z(a = "insert_ids") String str2, @z(a = "upvote_reason") String str3) {
        l.d(str, "");
        l.d(str2, "");
        return this.f142024b.getUpvoteList(str, j2, i2, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.upvote.api.IUpvoteApi
    @t(a = "tiktok/v1/upvote/publish")
    @g
    public final ab<com.ss.android.ugc.aweme.upvote.c.g> publishUpvote(@e(a = "item_id") String str, @e(a = "text") String str2, @e(a = "skip_rethink") Boolean bool) {
        l.d(str, "");
        return this.f142024b.publishUpvote(str, str2, bool);
    }

    @Override // com.ss.android.ugc.aweme.upvote.api.IUpvoteApi
    @t(a = "tiktok/v1/upvote/batch_publish")
    @g
    public final ab<c> publishUpvoteBatch(@e(a = "item_ids") String str) {
        l.d(str, "");
        return this.f142024b.publishUpvoteBatch(str);
    }

    @Override // com.ss.android.ugc.aweme.upvote.api.IUpvoteApi
    @t(a = "/aweme/v1/contents/translation/")
    @g
    public final f.a.t<a> translate(@e(a = "trg_lang") String str, @e(a = "translation_info") String str2, @z(a = "scene") int i2) {
        l.d(str, "");
        l.d(str2, "");
        return this.f142024b.translate(str, str2, i2);
    }

    static {
        Covode.recordClassIndex(92817);
    }

    private UpvoteApi() {
        Object a2 = RetrofitFactory.a().a(com.ss.android.c.b.f59141e).a(IUpvoteApi.class);
        l.b(a2, "");
        this.f142024b = (IUpvoteApi) a2;
    }
}
