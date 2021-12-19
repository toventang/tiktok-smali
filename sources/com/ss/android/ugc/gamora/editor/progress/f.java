package com.ss.android.ugc.gamora.editor.progress;

import com.bytedance.covode.number.Covode;

public final class f {
    static {
        Covode.recordClassIndex(96161);
    }

    public static final String a(float f2) {
        int i2 = (int) (f2 / 1000.0f);
        int i3 = i2 / 60;
        int i4 = i2 % 60;
        String valueOf = String.valueOf(i3);
        String valueOf2 = String.valueOf(i4);
        if (i4 < 10) {
            valueOf2 = "0".concat(String.valueOf(i4));
        }
        return valueOf + ":" + valueOf2;
    }
}
