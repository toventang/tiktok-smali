package com.ss.android.ugc.aweme.discover.mixfeed.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.mixfeed.h;
import h.a.n;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final List<Integer> f81632a = n.b(16, 19);

    /* renamed from: b  reason: collision with root package name */
    private static final List<Integer> f81633b = n.b(65280, 1048336);

    static {
        Covode.recordClassIndex(50727);
    }

    public static final boolean a(h hVar) {
        int feedType;
        if (hVar == null || (feedType = hVar.getFeedType()) == 65465 || f81633b.contains(Integer.valueOf(feedType))) {
            return false;
        }
        return true;
    }

    public static final boolean a(Integer num) {
        if (num == null) {
            return false;
        }
        num.intValue();
        if (num.intValue() == 70 || num.intValue() == 72 || num.intValue() == 62) {
            return true;
        }
        return false;
    }
}
