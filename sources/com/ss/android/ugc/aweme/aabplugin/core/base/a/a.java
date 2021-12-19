package com.ss.android.ugc.aweme.aabplugin.core.base.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;

public final class a {
    static {
        Covode.recordClassIndex(38437);
    }

    public static int a() {
        try {
            if ((d.a().getApplicationInfo().flags & 262144) == 262144) {
                return 1;
            }
            return 0;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }
}
