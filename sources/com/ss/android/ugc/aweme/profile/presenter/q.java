package com.ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

public abstract class q<T, K> extends a<T, K> {
    static {
        Covode.recordClassIndex(75328);
    }

    public abstract void a(String str);

    public abstract void a(List<Aweme> list, boolean z);
}
