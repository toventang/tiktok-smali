package com.ss.android.ugc.aweme.video.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.app.SharePrefCache;

public final class a {
    static {
        Covode.recordClassIndex(94219);
    }

    public static boolean a() {
        if (!SharePrefCache.inst().getVideoPreload().c().booleanValue()) {
            return false;
        }
        if (com.ss.android.ugc.aweme.framework.c.a.a(d.a()) || SharePrefCache.inst().getWeakNetPreLoadSwitch().c().intValue() == 1) {
            return true;
        }
        return false;
    }
}
