package com.ss.android.ugc.aweme.story.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryResponse;
import com.ss.android.ugc.aweme.story.archive.a.a;
import com.ss.android.ugc.aweme.story.model.d;
import com.ss.android.ugc.aweme.story.model.j;
import f.a.ab;
import f.a.t;

public interface IStoryApi {
    static {
        Covode.recordClassIndex(89298);
    }

    @h(a = "/tiktok/story/archive/detail/v1")
    t<d> getStoryArchDetail();

    @h(a = "/tiktok/story/archive/list/v1")
    t<a> getStoryArchList(@z(a = "cursor") long j2, @z(a = "count") long j3);

    @h(a = "/tiktok/v1/story/get_user_stories")
    t<j> getUserStories(@z(a = "author_ids") String str);

    @h(a = "/tiktok/v1/story/get_user_story")
    t<UserStoryResponse> getUserStory(@z(a = "author_id") String str, @z(a = "cursor") long j2, @z(a = "load_before") boolean z, @z(a = "count") int i2);

    @h(a = "/aweme/v1/multi/aweme/detail/")
    t<com.ss.android.ugc.aweme.detail.g.a> queryBatchAwemeRx(@z(a = "aweme_ids") String str, @z(a = "origin_type") String str2, @z(a = "push_params") String str3, @z(a = "story_req_source") int i2);

    @com.bytedance.retrofit2.b.t(a = "/tiktok/story/view/report/v1")
    ab<BaseResponse> reportStoryViewed(@z(a = "story_id") String str);
}
