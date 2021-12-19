package com.ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.model.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;

public final class bh {

    /* renamed from: a  reason: collision with root package name */
    public static final bh f75664a = new bh();

    /* renamed from: b  reason: collision with root package name */
    private static final LinkedHashMap<String, ac> f75665b = new LinkedHashMap<>(12, 0.75f, true);

    private bh() {
    }

    static {
        Covode.recordClassIndex(46670);
    }

    public static ac a(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        if (aweme.getLinkAdData() == null && aweme.needPreloadAdLink()) {
            aweme.setLinkAdData(f75665b.get(aweme.getAid()));
        }
        return aweme.getLinkAdData();
    }
}
