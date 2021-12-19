package com.ss.android.ugc.aweme.discover.helper;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.search.i;
import h.f.b.l;

public final class ag {

    /* renamed from: a  reason: collision with root package name */
    public static final ag f81067a = new ag();

    private ag() {
    }

    static {
        Covode.recordClassIndex(50390);
    }

    public static String a(String str) {
        l.d(str, "");
        if (l.a((Object) str, (Object) i.HASHTAG.getTabName())) {
            return "tag";
        }
        return str;
    }
}
