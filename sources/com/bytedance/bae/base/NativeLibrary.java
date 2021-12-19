package com.bytedance.bae.base;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

class NativeLibrary {
    public static String TAG = "NativeLibrary";
    private static boolean libraryLoaded;
    private static NativeLibraryLoadListener loadListener;
    public static Object lock = new Object();

    static class DefaultLoader implements NativeLibraryLoader {
        static {
            Covode.recordClassIndex(15341);
        }

        DefaultLoader() {
        }

        public static void com_bytedance_bae_base_NativeLibrary$DefaultLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            Librarian.a(str, false, (Context) null);
            m.a(uptimeMillis, str);
        }

        @Override // com.bytedance.bae.base.NativeLibraryLoader
        public boolean load(String str) {
            MethodCollector.i(1982);
            Logging.i(NativeLibrary.TAG, "Loading library: ".concat(String.valueOf(str)));
            try {
                synchronized (NativeLibrary.lock) {
                    try {
                        com_bytedance_bae_base_NativeLibrary$DefaultLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(str);
                    } catch (Throwable th) {
                        MethodCollector.o(1982);
                        throw th;
                    }
                }
                MethodCollector.o(1982);
                return true;
            } catch (UnsatisfiedLinkError e2) {
                Logging.e(NativeLibrary.TAG, "Failed to load native library: ".concat(String.valueOf(str)), e2);
                MethodCollector.o(1982);
                return false;
            }
        }
    }

    NativeLibrary() {
    }

    static void disposeListener() {
        if (loadListener != null) {
            loadListener = null;
        }
    }

    static {
        Covode.recordClassIndex(15340);
    }

    static boolean isLoaded() {
        boolean z;
        MethodCollector.i(1989);
        synchronized (lock) {
            try {
                z = libraryLoaded;
            } finally {
                MethodCollector.o(1989);
            }
        }
        return z;
    }

    static void setLoadListener(NativeLibraryLoadListener nativeLibraryLoadListener) {
        loadListener = nativeLibraryLoadListener;
    }

    static void initialize(NativeLibraryLoader nativeLibraryLoader, String str) {
        MethodCollector.i(1987);
        synchronized (lock) {
            try {
                if (libraryLoaded) {
                    Logging.i(TAG, "Native library has already been loaded.");
                    NativeLibraryLoadListener nativeLibraryLoadListener = loadListener;
                    if (nativeLibraryLoadListener != null) {
                        nativeLibraryLoadListener.onLoadAlready(str);
                    }
                    return;
                }
                Logging.i(TAG, "Loading native library: ".concat(String.valueOf(str)));
                boolean load = nativeLibraryLoader.load(str);
                libraryLoaded = load;
                NativeLibraryLoadListener nativeLibraryLoadListener2 = loadListener;
                if (nativeLibraryLoadListener2 != null) {
                    if (load) {
                        nativeLibraryLoadListener2.onLoadSuccess(str);
                    } else {
                        nativeLibraryLoadListener2.onLoadError(str);
                    }
                }
                MethodCollector.o(1987);
            } finally {
                MethodCollector.o(1987);
            }
        }
    }
}
