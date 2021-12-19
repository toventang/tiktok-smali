package com.ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bw.a.d;
import com.ss.android.ugc.aweme.friends.model.RecommendList;

public interface u extends d {
    static {
        Covode.recordClassIndex(75332);
    }

    void a(RecommendList recommendList);

    void a(Exception exc);

    void b(RecommendList recommendList);
}
