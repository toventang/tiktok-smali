package com.bytedance.vcloud.mlcomponent_api;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

public class MLEngineImpLoader {
    public static volatile String exception = "";
    public static volatile boolean isPredictTFEngineLibraryLoaded;

    static {
        Covode.recordClassIndex(28029);
    }

    public static synchronized void loadPredictTFEngineLibrary() {
        synchronized (MLEngineImpLoader.class) {
            MethodCollector.i(5323);
            try {
                if (!isPredictTFEngineLibraryLoaded) {
                    try {
                        com_bytedance_vcloud_mlcomponent_api_MLEngineImpLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("tensorflowlite");
                        com_bytedance_vcloud_mlcomponent_api_MLEngineImpLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("networkpredict_tfengine");
                        isPredictTFEngineLibraryLoaded = true;
                    } catch (Throwable th) {
                        exception = th.toString();
                        MethodCollector.o(5323);
                        return;
                    }
                }
                MethodCollector.o(5323);
            } catch (Throwable th2) {
                exception = th2.toString();
                MethodCollector.o(5323);
            }
        }
    }

    public static void com_bytedance_vcloud_mlcomponent_api_MLEngineImpLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }
}
