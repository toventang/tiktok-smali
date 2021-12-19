package com.ss.android.ugc.aweme.story.userstory.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryResponse;
import com.ss.android.ugc.aweme.story.model.j;
import f.a.t;

public interface IUserStoryApi {
    static {
        Covode.recordClassIndex(90598);
    }

    @h(a = "/tiktok/v1/story/get_user_stories")
    t<j> getUserStories(@z(a = "author_ids") String str);

    @h(a = "/tiktok/v1/story/get_user_story")
    t<UserStoryResponse> getUserStory(@z(a = "author_id") String str, @z(a = "cursor") long j2, @z(a = "load_before") boolean z, @z(a = "count") int i2);
}
