package com.ss.android.ugc.aweme.feed.q;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.feed.e.i;
import com.ss.android.ugc.aweme.feed.e.j;
import com.ss.android.ugc.aweme.feed.e.k;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.video.preload.f;

public interface al extends i, j, k, am, f {
    static {
        Covode.recordClassIndex(59652);
    }

    com.ss.android.ugc.aweme.video.i aN();

    VerticalViewPager aQ();

    boolean aZ();

    boolean ac();

    void ax_();

    void b(String str, boolean z);

    Aweme bL();

    aj bf();

    void d(int i2);

    void g(String str);

    String h(Aweme aweme);

    boolean i(boolean z);
}
