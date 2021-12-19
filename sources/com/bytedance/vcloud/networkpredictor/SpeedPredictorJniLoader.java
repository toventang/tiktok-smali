package com.bytedance.vcloud.networkpredictor;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

public class SpeedPredictorJniLoader {
    public static volatile String exception = "";
    public static volatile boolean isLibraryLoaded;
    private static LibraryLoaderProxy mLibraryLoader;

    /* renamed from: com.bytedance.vcloud.networkpredictor.SpeedPredictorJniLoader$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static {
            Covode.recordClassIndex(28044);
        }
    }

    static class DefaultLoader implements LibraryLoaderProxy {
        static {
            Covode.recordClassIndex(28045);
        }

        private DefaultLoader() {
        }

        /* synthetic */ DefaultLoader(AnonymousClass1 r1) {
            this();
        }

        @Override // com.bytedance.vcloud.networkpredictor.LibraryLoaderProxy
        public boolean loadLibrary(String str) {
            try {
                com_bytedance_vcloud_networkpredictor_SpeedPredictorJniLoader$DefaultLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(str);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        public static void com_bytedance_vcloud_networkpredictor_SpeedPredictorJniLoader$DefaultLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            Librarian.a(str, false, (Context) null);
            m.a(uptimeMillis, str);
        }
    }

    static {
        Covode.recordClassIndex(28043);
    }

    public static synchronized boolean loadLibrary() {
        boolean z;
        synchronized (SpeedPredictorJniLoader.class) {
            MethodCollector.i(226);
            try {
                if (!isLibraryLoaded) {
                    LibraryLoaderProxy libraryLoaderProxy = mLibraryLoader;
                    if (libraryLoaderProxy == null) {
                        libraryLoaderProxy = new DefaultLoader(null);
                    }
                    isLibraryLoaded = libraryLoaderProxy.loadLibrary("networkpredictor");
                }
            } catch (Throwable th) {
                exception = th.toString();
                isLibraryLoaded = false;
            }
            z = isLibraryLoaded;
            MethodCollector.o(226);
        }
        return z;
    }

    public static void setLoadProxy(LibraryLoaderProxy libraryLoaderProxy) {
        mLibraryLoader = libraryLoaderProxy;
    }
}
