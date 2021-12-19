package com.ss.android.ugc.aweme.story.userstory.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryResponse;
import com.ss.android.ugc.aweme.story.model.j;
import f.a.t;
import h.f.b.l;

public final class UserStoryApi implements IUserStoryApi {

    /* renamed from: a  reason: collision with root package name */
    public static final UserStoryApi f138508a = new UserStoryApi();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IUserStoryApi f138509b;

    @Override // com.ss.android.ugc.aweme.story.userstory.api.IUserStoryApi
    @h(a = "/tiktok/v1/story/get_user_stories")
    public final t<j> getUserStories(@z(a = "author_ids") String str) {
        l.d(str, "");
        return this.f138509b.getUserStories(str);
    }

    @Override // com.ss.android.ugc.aweme.story.userstory.api.IUserStoryApi
    @h(a = "/tiktok/v1/story/get_user_story")
    public final t<UserStoryResponse> getUserStory(@z(a = "author_id") String str, @z(a = "cursor") long j2, @z(a = "load_before") boolean z, @z(a = "count") int i2) {
        l.d(str, "");
        return this.f138509b.getUserStory(str, j2, z, i2);
    }

    static {
        Covode.recordClassIndex(90599);
    }

    private UserStoryApi() {
        Object a2 = RetrofitFactory.a().a(b.f59141e).a(IUserStoryApi.class);
        l.b(a2, "");
        this.f138509b = (IUserStoryApi) a2;
    }
}
