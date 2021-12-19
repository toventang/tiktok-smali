package com.ss.android.ugc.aweme.story.interaction.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.story.model.f;
import com.ss.android.ugc.aweme.story.model.i;
import f.a.t;

public interface IStoryInteractionApi {

    public static final class a {
        static {
            Covode.recordClassIndex(90171);
        }
    }

    static {
        Covode.recordClassIndex(90170);
    }

    @h(a = "/aweme/v2/comment/list/")
    t<CommentItemList> fetchCommentListV2(@z(a = "aweme_id") String str, @z(a = "cursor") long j2, @z(a = "count") int i2, @z(a = "insert_ids") String str2, @z(a = "channel_id") int i3, @z(a = "source_type") int i4);

    @h(a = "/tiktok/story/like/list/v1")
    t<f> fetchStoryLikedList(@z(a = "story_id") String str, @z(a = "cursor") long j2, @z(a = "count") int i2);

    @h(a = "/tiktok/story/view/list/v1")
    t<i> getStoryViewerList(@z(a = "story_id") String str, @z(a = "cursor") long j2, @z(a = "count") int i2, @z(a = "insert_id") String str2);

    @com.bytedance.retrofit2.b.t(a = "/tiktok/story/emoji_reaction/send/v1")
    @g
    t<BaseResponse> sendEmojiReaction(@e(a = "story_id") String str, @e(a = "emoji_id") int i2);
}
