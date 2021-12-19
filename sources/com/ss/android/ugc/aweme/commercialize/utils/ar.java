package com.ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.ss.android.ugc.aweme.global.config.settings.c;

public final class ar {
    static {
        Covode.recordClassIndex(46639);
    }

    public static boolean a() {
        try {
            if (!c.f99077a.f99078b.getShopping().getDisableCard().booleanValue()) {
                return true;
            }
            return false;
        } catch (a unused) {
            return true;
        }
    }
}
