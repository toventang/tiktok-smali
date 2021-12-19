package com.ss.android.ugc.aweme.comment.barrage;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import f.a.t;

public interface IBarrageCommentAndLikeApi {

    public static final class a {
        static {
            Covode.recordClassIndex(44013);
        }
    }

    static {
        Covode.recordClassIndex(44012);
    }

    @h(a = "/aweme/v2/comment/list/")
    t<CommentItemList> fetchCommentList(@z(a = "aweme_id") String str, @z(a = "cursor") long j2, @z(a = "count") int i2, @z(a = "insert_ids") String str2, @z(a = "channel_id") int i3, @z(a = "source_type") int i4, @z(a = "scenario") int i5);
}
