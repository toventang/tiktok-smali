package com.bytedance.vcloud.strategy;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

public class StrategyCenterJniLoader {
    public static volatile String exception = "";
    public static volatile boolean isLibraryLoaded;

    public static int com_bytedance_vcloud_strategy_StrategyCenterJniLoader_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    static {
        Covode.recordClassIndex(28061);
    }

    public static synchronized void loadLibrary() {
        synchronized (StrategyCenterJniLoader.class) {
            MethodCollector.i(2147);
            try {
                if (!isLibraryLoaded) {
                    com_bytedance_vcloud_strategy_StrategyCenterJniLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("preload");
                    isLibraryLoaded = true;
                }
                MethodCollector.o(2147);
            } catch (Throwable th) {
                exception = th.toString();
                com_bytedance_vcloud_strategy_StrategyCenterJniLoader_com_ss_android_ugc_aweme_lancet_LogLancet_i("VCStrategy", "load so fail. " + exception);
                MethodCollector.o(2147);
            }
        }
    }

    public static void com_bytedance_vcloud_strategy_StrategyCenterJniLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }
}
