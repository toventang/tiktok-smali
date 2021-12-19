package com.ss.android.ugc.aweme.video.simplayer.tt;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.j.p;

public final class e {
    static {
        Covode.recordClassIndex(94178);
    }

    public static boolean a(p pVar) {
        if (pVar == null || pVar.f() == null) {
            return false;
        }
        for (String str : pVar.f()) {
            if (TextUtils.equals(str, "bytevc1")) {
                return true;
            }
        }
        return false;
    }
}
