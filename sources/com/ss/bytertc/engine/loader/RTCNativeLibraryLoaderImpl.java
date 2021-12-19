package com.ss.bytertc.engine.loader;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

public class RTCNativeLibraryLoaderImpl implements RTCNativeLibraryLoader {
    static {
        Covode.recordClassIndex(101002);
    }

    public static int com_ss_bytertc_engine_loader_RTCNativeLibraryLoaderImpl_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    public static int com_ss_bytertc_engine_loader_RTCNativeLibraryLoaderImpl_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    public static void com_ss_bytertc_engine_loader_RTCNativeLibraryLoaderImpl_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }

    @Override // com.ss.bytertc.engine.loader.RTCNativeLibraryLoader, org.webrtc.NativeLibraryLoader
    public boolean load(String str) {
        com_ss_bytertc_engine_loader_RTCNativeLibraryLoaderImpl_com_ss_android_ugc_aweme_lancet_LogLancet_i("RtcNativeLibraryLoaderImpl", "Loading library: ".concat(String.valueOf(str)));
        try {
            com_ss_bytertc_engine_loader_RTCNativeLibraryLoaderImpl_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(str);
            return true;
        } catch (UnsatisfiedLinkError e2) {
            com_ss_bytertc_engine_loader_RTCNativeLibraryLoaderImpl_com_ss_android_ugc_aweme_lancet_LogLancet_e("RtcNativeLibraryLoaderImpl", "Failed to load native library: ".concat(String.valueOf(str)), e2);
            return false;
        }
    }
}
