package com.lynx.tasm.ui.image;

import com.bytedance.covode.number.Covode;
import com.facebook.drawee.e.q;

public class g {
    static {
        Covode.recordClassIndex(35445);
    }

    public static q.b a(String str) {
        if ("aspectFit".equals(str)) {
            return q.b.f47438d;
        }
        if ("aspectFill".equals(str)) {
            return q.b.f47442h;
        }
        if ("scaleToFill".equals(str)) {
            return q.b.f47436b;
        }
        if ("center".equals(str)) {
            return q.b.f47440f;
        }
        if (str == null || str.equals("none") || str.length() == 0) {
            return q.b.f47436b;
        }
        throw new RuntimeException("Invalid resize mode: '" + str + "'");
    }
}
