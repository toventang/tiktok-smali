package com.ss.android.ugc.aweme.feed.x;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.k;
import com.ss.android.ugc.aweme.story.d.a;
import java.util.HashMap;

public final class ag {

    /* renamed from: a  reason: collision with root package name */
    public static HashMap<String, Boolean> f95301a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static HashMap<String, k.b> f95302b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public static final ag f95303c = new ag();

    /* renamed from: d  reason: collision with root package name */
    private static HashMap<String, Boolean> f95304d = new HashMap<>();

    private ag() {
    }

    static {
        Covode.recordClassIndex(60366);
    }

    public static boolean a(Aweme aweme) {
        Boolean bool;
        String e2 = e(aweme);
        if (e2 == null || (bool = f95301a.get(e2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static k.b b(Aweme aweme) {
        String e2 = e(aweme);
        if (e2 == null) {
            return null;
        }
        return f95302b.get(e2);
    }

    public static void c(Aweme aweme) {
        String e2 = e(aweme);
        if (e2 != null) {
            f95304d.put(e2, true);
        }
    }

    public static boolean d(Aweme aweme) {
        Boolean bool;
        String e2 = e(aweme);
        if (e2 == null || (bool = f95304d.get(e2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static String e(Aweme aweme) {
        String aid;
        if (aweme == null) {
            return null;
        }
        if (a.d(aweme)) {
            aid = aweme.getAuthorUid();
        } else {
            aid = aweme.getAid();
        }
        if (aid == null) {
            return null;
        }
        return aid;
    }
}
