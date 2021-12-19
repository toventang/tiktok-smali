package com.ss.android.ugc.aweme.detail.i;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.m;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

public interface l extends m {
    static {
        Covode.recordClassIndex(49588);
    }

    void a(List<Aweme> list);

    void c_(Exception exc);
}
