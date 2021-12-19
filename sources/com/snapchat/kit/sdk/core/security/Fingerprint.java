package com.snapchat.kit.sdk.core.security;

import android.content.Context;
import android.os.SystemClock;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

public class Fingerprint {
    private final String mPackageName;

    static {
        Covode.recordClassIndex(35805);
    }

    private native String sign(String str);

    private String generateFingerprintPayload() {
        return a.a("%s:%d", new Object[]{this.mPackageName, Long.valueOf(System.currentTimeMillis())});
    }

    public synchronized String getEncryptedFingerprint() {
        String sign;
        MethodCollector.i(5961);
        sign = sign(generateFingerprintPayload());
        MethodCollector.o(5961);
        return sign;
    }

    public Fingerprint(Context context) {
        com_snapchat_kit_sdk_core_security_Fingerprint_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("pruneau");
        this.mPackageName = context.getPackageName();
    }

    public static void com_snapchat_kit_sdk_core_security_Fingerprint_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }
}
