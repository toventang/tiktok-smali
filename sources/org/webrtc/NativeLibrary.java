package org.webrtc;

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
    private static Object lock = new Object();

    /* access modifiers changed from: package-private */
    public static class DefaultLoader implements NativeLibraryLoader {
        static {
            Covode.recordClassIndex(106632);
        }

        DefaultLoader() {
        }

        public static void org_webrtc_NativeLibrary$DefaultLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            Librarian.a(str, false, (Context) null);
            m.a(uptimeMillis, str);
        }

        @Override // org.webrtc.NativeLibraryLoader
        public boolean load(String str) {
            Logging.i(NativeLibrary.TAG, "Loading library: ".concat(String.valueOf(str)));
            try {
                org_webrtc_NativeLibrary$DefaultLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(str);
                return true;
            } catch (UnsatisfiedLinkError e2) {
                Logging.e(NativeLibrary.TAG, "Failed to load native library: ".concat(String.valueOf(str)), e2);
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
        Covode.recordClassIndex(106631);
    }

    static boolean isLoaded() {
        boolean z;
        MethodCollector.i(8275);
        synchronized (lock) {
            try {
                z = libraryLoaded;
            } finally {
                MethodCollector.o(8275);
            }
        }
        return z;
    }

    static void setLoadListener(NativeLibraryLoadListener nativeLibraryLoadListener) {
        loadListener = nativeLibraryLoadListener;
    }

    static void initialize(NativeLibraryLoader nativeLibraryLoader, String str) {
        MethodCollector.i(8219);
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
                MethodCollector.o(8219);
            } finally {
                MethodCollector.o(8219);
            }
        }
    }
}
