package com.ss.android.ugc.aweme.util;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.util.HashMap;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    static final HashMap<String, Aweme> f142504a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static final j f142505b = new j();

    private j() {
    }

    static {
        Covode.recordClassIndex(93199);
    }

    public static Aweme a(String str) {
        l.d(str, "");
        return f142504a.get(str);
    }
}
