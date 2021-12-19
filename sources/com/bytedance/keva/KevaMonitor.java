package com.bytedance.keva;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

public class KevaMonitor {
    static {
        Covode.recordClassIndex(24512);
    }

    public static int com_bytedance_keva_KevaMonitor_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void logDebug(String str) {
    }

    public void onLoadRepo(String str, int i2) {
    }

    /* access modifiers changed from: protected */
    public void reportWarning(int i2, String str, String str2, Object obj, String str3) {
    }

    /* access modifiers changed from: protected */
    public void loadLibrary(String str) {
        com_bytedance_keva_KevaMonitor_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(str);
    }

    public static void com_bytedance_keva_KevaMonitor_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }

    /* access modifiers changed from: protected */
    public void reportThrowable(int i2, String str, String str2, Object obj, Throwable th) {
        com_bytedance_keva_KevaMonitor_com_ss_android_ugc_aweme_lancet_LogLancet_e("Keva", "action: [" + i2 + "], repo: [" + str + "], key: [" + str2 + "], value: [" + obj + "], msg: " + th.getMessage(), th);
    }
}
