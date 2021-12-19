package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.story.d.a;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class cu {
    static {
        Covode.recordClassIndex(93405);
    }

    public static final List<Aweme> a(List<? extends FollowFeed> list) {
        Aweme aweme;
        l.d(list, "");
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        for (T t : list) {
            if (t != null) {
                aweme = t.getAweme();
            } else {
                aweme = null;
            }
            arrayList.add(aweme);
        }
        return arrayList;
    }

    public static final List<FollowFeed> b(List<? extends FollowFeed> list) {
        Aweme aweme;
        l.d(list, "");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            T t2 = t;
            if (t2 != null) {
                aweme = t2.getAweme();
            } else {
                aweme = null;
            }
            if (!a.g(aweme)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }
}
