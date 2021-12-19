package com.bd.cu.fp;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

public class NativeUtils {
    public static native byte[] crypt(long j2, byte[] bArr);

    public static native long nativeInit(String str);

    public static native void release(long j2);

    static {
        Covode.recordClassIndex(2819);
        com_bd_cu_fp_NativeUtils_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("fileprotect");
    }

    public static void com_bd_cu_fp_NativeUtils_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }
}
