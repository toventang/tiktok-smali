package com.ss.android.ugc.aweme.service;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.by;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import java.util.List;

public interface IFollowFeedService {
    static {
        Covode.recordClassIndex(79357);
    }

    by a(Context context);

    String a(e eVar);

    List<Aweme> a(List<? extends FollowFeed> list);

    void a();

    void a(e eVar, float f2);

    float b(e eVar);

    Fragment b();
}
