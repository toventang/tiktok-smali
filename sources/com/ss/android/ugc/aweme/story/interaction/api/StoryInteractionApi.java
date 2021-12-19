package com.ss.android.ugc.aweme.story.interaction.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.story.model.f;
import com.ss.android.ugc.aweme.story.model.i;
import f.a.t;
import h.f.b.l;

public final class StoryInteractionApi implements IStoryInteractionApi {

    /* renamed from: a  reason: collision with root package name */
    public static final StoryInteractionApi f137840a = new StoryInteractionApi();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IStoryInteractionApi f137841b;

    @Override // com.ss.android.ugc.aweme.story.interaction.api.IStoryInteractionApi
    @h(a = "/aweme/v2/comment/list/")
    public final t<CommentItemList> fetchCommentListV2(@z(a = "aweme_id") String str, @z(a = "cursor") long j2, @z(a = "count") int i2, @z(a = "insert_ids") String str2, @z(a = "channel_id") int i3, @z(a = "source_type") int i4) {
        l.d(str, "");
        return this.f137841b.fetchCommentListV2(str, j2, i2, str2, i3, i4);
    }

    @Override // com.ss.android.ugc.aweme.story.interaction.api.IStoryInteractionApi
    @h(a = "/tiktok/story/like/list/v1")
    public final t<f> fetchStoryLikedList(@z(a = "story_id") String str, @z(a = "cursor") long j2, @z(a = "count") int i2) {
        l.d(str, "");
        return this.f137841b.fetchStoryLikedList(str, j2, i2);
    }

    @Override // com.ss.android.ugc.aweme.story.interaction.api.IStoryInteractionApi
    @h(a = "/tiktok/story/view/list/v1")
    public final t<i> getStoryViewerList(@z(a = "story_id") String str, @z(a = "cursor") long j2, @z(a = "count") int i2, @z(a = "insert_id") String str2) {
        l.d(str, "");
        return this.f137841b.getStoryViewerList(str, j2, i2, str2);
    }

    @Override // com.ss.android.ugc.aweme.story.interaction.api.IStoryInteractionApi
    @com.bytedance.retrofit2.b.t(a = "/tiktok/story/emoji_reaction/send/v1")
    @g
    public final t<BaseResponse> sendEmojiReaction(@e(a = "story_id") String str, @e(a = "emoji_id") int i2) {
        l.d(str, "");
        return this.f137841b.sendEmojiReaction(str, i2);
    }

    static {
        Covode.recordClassIndex(90172);
    }

    private StoryInteractionApi() {
        Object a2 = RetrofitFactory.a().a(b.f59141e).a(IStoryInteractionApi.class);
        l.b(a2, "");
        this.f137841b = (IStoryInteractionApi) a2;
    }
}
