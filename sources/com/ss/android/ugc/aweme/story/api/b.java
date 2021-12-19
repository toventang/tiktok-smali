package com.ss.android.ugc.aweme.story.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import f.a.t;
import java.util.List;

public interface b {
    static {
        Covode.recordClassIndex(89307);
    }

    Aweme a();

    Aweme a(String str);

    t<Aweme> a(String str, boolean z);

    t<List<Aweme>> a(List<String> list);

    void a(Aweme aweme, boolean z, String str);

    void a(FollowStatus followStatus);
}
