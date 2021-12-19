package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;

public final class df {

    /* renamed from: a  reason: collision with root package name */
    public static int f89784a = b.a().a(true, "feed_scrool_duration_opt_ratio", 100);

    public static int a() {
        int i2 = f89784a;
        if (i2 > 200) {
            return 200;
        }
        if (i2 < 30) {
            return 30;
        }
        return i2;
    }

    static {
        Covode.recordClassIndex(56405);
    }
}
