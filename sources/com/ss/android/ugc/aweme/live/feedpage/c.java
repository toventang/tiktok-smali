package com.ss.android.ugc.aweme.live.feedpage;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.profile.model.User;
import f.a.d.f;
import java.util.List;
import java.util.Map;

public interface c {
    static {
        Covode.recordClassIndex(69443);
    }

    void a(long j2);

    void a(User user, f<Map<Long, Long>> fVar, String str);

    void a(User user, List<User> list, f<Long> fVar, String str);

    void a(List<Aweme> list);

    void b(List<FollowFeed> list);
}
