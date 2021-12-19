package com.apiguard3.internal;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

class setHasTransientState {
    private static int AGRequest;
    private static int getBody;
    private static int getMethod = 1;

    setHasTransientState() {
    }

    static {
        Covode.recordClassIndex(2595);
        AGRequest = 1;
        com_apiguard3_internal_setHasTransientState_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("e489");
        int i2 = ((getMethod + 118) - 1) % 2;
        int i3 = getBody;
        if (i2 != 0) {
            int i4 = i3 + 15;
            AGRequest = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        int i6 = i3 + 41;
        AGRequest = i6 % 128;
        int i7 = i6 % 2;
    }

    public static void com_apiguard3_internal_setHasTransientState_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }
}
