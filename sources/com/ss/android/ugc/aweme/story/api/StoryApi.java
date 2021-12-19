package com.ss.android.ugc.aweme.story.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryResponse;
import com.ss.android.ugc.aweme.story.archive.a.a;
import com.ss.android.ugc.aweme.story.model.d;
import com.ss.android.ugc.aweme.story.model.j;
import f.a.ab;
import f.a.t;
import h.f.b.l;

public final class StoryApi implements IStoryApi {

    /* renamed from: a  reason: collision with root package name */
    public static final StoryApi f136727a = new StoryApi();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IStoryApi f136728b;

    @Override // com.ss.android.ugc.aweme.story.api.IStoryApi
    @h(a = "/tiktok/story/archive/detail/v1")
    public final t<d> getStoryArchDetail() {
        return this.f136728b.getStoryArchDetail();
    }

    @Override // com.ss.android.ugc.aweme.story.api.IStoryApi
    @h(a = "/tiktok/story/archive/list/v1")
    public final t<a> getStoryArchList(@z(a = "cursor") long j2, @z(a = "count") long j3) {
        return this.f136728b.getStoryArchList(j2, j3);
    }

    @Override // com.ss.android.ugc.aweme.story.api.IStoryApi
    @h(a = "/tiktok/v1/story/get_user_stories")
    public final t<j> getUserStories(@z(a = "author_ids") String str) {
        l.d(str, "");
        return this.f136728b.getUserStories(str);
    }

    @Override // com.ss.android.ugc.aweme.story.api.IStoryApi
    @h(a = "/tiktok/v1/story/get_user_story")
    public final t<UserStoryResponse> getUserStory(@z(a = "author_id") String str, @z(a = "cursor") long j2, @z(a = "load_before") boolean z, @z(a = "count") int i2) {
        l.d(str, "");
        return this.f136728b.getUserStory(str, j2, z, i2);
    }

    @Override // com.ss.android.ugc.aweme.story.api.IStoryApi
    @h(a = "/aweme/v1/multi/aweme/detail/")
    public final t<com.ss.android.ugc.aweme.detail.g.a> queryBatchAwemeRx(@z(a = "aweme_ids") String str, @z(a = "origin_type") String str2, @z(a = "push_params") String str3, @z(a = "story_req_source") int i2) {
        return this.f136728b.queryBatchAwemeRx(str, str2, str3, i2);
    }

    @Override // com.ss.android.ugc.aweme.story.api.IStoryApi
    @com.bytedance.retrofit2.b.t(a = "/tiktok/story/view/report/v1")
    public final ab<BaseResponse> reportStoryViewed(@z(a = "story_id") String str) {
        l.d(str, "");
        return this.f136728b.reportStoryViewed(str);
    }

    static {
        Covode.recordClassIndex(89305);
    }

    private StoryApi() {
        Object a2 = RetrofitFactory.a().a(b.f59141e).a(IStoryApi.class);
        l.b(a2, "");
        this.f136728b = (IStoryApi) a2;
    }
}
