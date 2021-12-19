package com.ss.android.ugc.aweme.im.sdk.chatlist.controller.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.k.c;
import com.ss.android.ugc.aweme.im.service.k.e;

public final class d {
    static {
        Covode.recordClassIndex(65196);
    }

    public static final com.ss.android.ugc.aweme.im.service.k.d a(int i2) {
        if (i2 == 0) {
            return new com.ss.android.ugc.aweme.im.service.k.d(e.RIGHT_DOT, c.RED, false, 4);
        }
        if (i2 != 2) {
            return new com.ss.android.ugc.aweme.im.service.k.d(e.RIGHT_DOT, c.GREY, false, 4);
        }
        return new com.ss.android.ugc.aweme.im.service.k.d(e.LEFT_DOT, c.GREY, false, 4);
    }

    public static final com.ss.android.ugc.aweme.im.service.k.d b(boolean z, int i2) {
        com.ss.android.ugc.aweme.im.service.k.d a2 = a(z, i2);
        if (i2 != 4) {
            return a2;
        }
        return com.ss.android.ugc.aweme.im.service.k.d.a(a2, e.RIGHT_DOT);
    }

    public static final com.ss.android.ugc.aweme.im.service.k.d a(boolean z, int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                return new com.ss.android.ugc.aweme.im.service.k.d(e.RIGHT_DOT, null, false, 6);
            }
            if (i2 == 2) {
                return new com.ss.android.ugc.aweme.im.service.k.d(e.LEFT_DOT, null, true, 2);
            }
            if (i2 == 3) {
                return new com.ss.android.ugc.aweme.im.service.k.d(e.RIGHT_DOT, null, true, 2);
            }
            if (i2 != 4) {
                return new com.ss.android.ugc.aweme.im.service.k.d(null, null, false, 7);
            }
            if (z) {
                return new com.ss.android.ugc.aweme.im.service.k.d(e.RIGHT_DOT, c.BLUE, true);
            }
            return new com.ss.android.ugc.aweme.im.service.k.d(e.RIGHT_NUMBER, c.BLUE, true);
        } else if (z) {
            return new com.ss.android.ugc.aweme.im.service.k.d(e.RIGHT_DOT, null, false, 6);
        } else {
            return new com.ss.android.ugc.aweme.im.service.k.d(e.RIGHT_NUMBER, null, false, 6);
        }
    }
}
