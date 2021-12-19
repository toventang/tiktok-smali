package com.google.android.gms.common.stats;

import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class c {
    static {
        Covode.recordClassIndex(31453);
    }

    public static String a(PowerManager.WakeLock wakeLock, String str) {
        String valueOf = String.valueOf(String.valueOf((((long) Process.myPid()) << 32) | ((long) System.identityHashCode(wakeLock))));
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        String valueOf2 = String.valueOf(str);
        if (valueOf2.length() != 0) {
            return valueOf.concat(valueOf2);
        }
        return new String(valueOf);
    }
}
