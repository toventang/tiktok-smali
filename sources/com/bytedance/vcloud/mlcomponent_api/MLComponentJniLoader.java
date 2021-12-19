package com.bytedance.vcloud.mlcomponent_api;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

public class MLComponentJniLoader {
    public static volatile String exception = "";
    public static volatile boolean isLibraryLoaded;

    static {
        Covode.recordClassIndex(28026);
    }

    public static synchronized void loadLibrary() {
        synchronized (MLComponentJniLoader.class) {
            MethodCollector.i(6552);
            try {
                if (!isLibraryLoaded) {
                    com_bytedance_vcloud_mlcomponent_api_MLComponentJniLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("mlcomponent");
                    isLibraryLoaded = true;
                }
                MethodCollector.o(6552);
            } catch (Throwable th) {
                exception = th.toString();
                MethodCollector.o(6552);
            }
        }
    }

    public static void com_bytedance_vcloud_mlcomponent_api_MLComponentJniLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }
}
