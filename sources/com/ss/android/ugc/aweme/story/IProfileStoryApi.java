package com.ss.android.ugc.aweme.story;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.story.model.d;
import com.ss.android.ugc.aweme.story.model.g;
import f.a.t;

public interface IProfileStoryApi {
    static {
        Covode.recordClassIndex(89276);
    }

    @h(a = "/tiktok/story/archive/detail/v1")
    t<d> getStoryArchDetail();

    @h(a = "/tiktok/story/view/info/v1")
    t<g> getStoryViewInfo(@z(a = "sec_author_id") String str, @z(a = "author_id") String str2);
}
