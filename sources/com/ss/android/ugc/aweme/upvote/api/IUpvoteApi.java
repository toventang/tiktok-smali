package com.ss.android.ugc.aweme.upvote.api;

import com.bytedance.covode.number.Covode;
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

public interface IUpvoteApi {
    static {
        Covode.recordClassIndex(92816);
    }

    @t(a = "tiktok/v1/upvote/delete")
    @g
    ab<BaseResponse> deleteUpvote(@e(a = "item_id") String str);

    @h(a = "aweme/v1/comment/digg/")
    f.a.t<BaseResponse> digg(@z(a = "cid") String str, @z(a = "aweme_id") String str2, @z(a = "digg_type") int i2);

    @h(a = "tiktok/v1/upvote/batch_list")
    f.a.t<b> getUpvoteBatchList(@z(a = "item_ids") String str, @z(a = "upvote_reasons") String str2);

    @h(a = "tiktok/v1/upvote/list")
    f.a.t<f> getUpvoteList(@z(a = "item_id") String str, @z(a = "cursor") long j2, @z(a = "count") int i2, @z(a = "insert_ids") String str2, @z(a = "upvote_reason") String str3);

    @t(a = "tiktok/v1/upvote/publish")
    @g
    ab<com.ss.android.ugc.aweme.upvote.c.g> publishUpvote(@e(a = "item_id") String str, @e(a = "text") String str2, @e(a = "skip_rethink") Boolean bool);

    @t(a = "tiktok/v1/upvote/batch_publish")
    @g
    ab<c> publishUpvoteBatch(@e(a = "item_ids") String str);

    @t(a = "/aweme/v1/contents/translation/")
    @g
    f.a.t<a> translate(@e(a = "trg_lang") String str, @e(a = "translation_info") String str2, @z(a = "scene") int i2);
}
