package com.ss.android.ugc.aweme.discover;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public interface IDiscoverAllService {
    static {
        Covode.recordClassIndex(49866);
    }

    a<Aweme, ?> a();
}
