package com.ss.mediakit.vcnlib;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

public class VcnlibloadWrapper {
    private static boolean isVcnload;
    private static boolean isVcnverifyLiteload;
    private static boolean isVcnverifyload;

    static {
        Covode.recordClassIndex(101175);
    }

    public static int com_ss_mediakit_vcnlib_VcnlibloadWrapper_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static boolean tryLoadVcnlib() {
        MethodCollector.i(4619);
        synchronized (VcnlibloadWrapper.class) {
            try {
                boolean z = true;
                if (isVcnload) {
                    return true;
                }
                try {
                    com_ss_mediakit_vcnlib_VcnlibloadWrapper_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("vcn");
                } catch (UnsatisfiedLinkError e2) {
                    com_ss_mediakit_vcnlib_VcnlibloadWrapper_com_ss_android_ugc_aweme_lancet_LogLancet_e("vcn", "Can't load vcn library: ".concat(String.valueOf(e2)));
                    z = false;
                }
                isVcnload = z;
                MethodCollector.o(4619);
                return z;
            } finally {
                MethodCollector.o(4619);
            }
        }
    }

    public static boolean tryLoadVcnverifyLitelib() {
        MethodCollector.i(4702);
        synchronized (VcnlibloadWrapper.class) {
            try {
                boolean z = true;
                if (isVcnverifyLiteload) {
                    return true;
                }
                try {
                    com_ss_mediakit_vcnlib_VcnlibloadWrapper_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("vcnverifylite");
                    com_ss_mediakit_vcnlib_VcnlibloadWrapper_com_ss_android_ugc_aweme_lancet_LogLancet_e("vcn", "load vcnverifylite suc");
                    CustomVerify.init();
                } catch (UnsatisfiedLinkError e2) {
                    com_ss_mediakit_vcnlib_VcnlibloadWrapper_com_ss_android_ugc_aweme_lancet_LogLancet_e("vcn", "Can't load vcnverifylite library: ".concat(String.valueOf(e2)));
                    z = false;
                }
                isVcnverifyLiteload = z;
                MethodCollector.o(4702);
                return z;
            } finally {
                MethodCollector.o(4702);
            }
        }
    }

    public static boolean tryLoadVcnverifylib() {
        boolean z;
        MethodCollector.i(4696);
        synchronized (VcnlibloadWrapper.class) {
            try {
                boolean z2 = true;
                if (isVcnverifyload) {
                    return true;
                }
                try {
                    com_ss_mediakit_vcnlib_VcnlibloadWrapper_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("vcnverify");
                    z = true;
                } catch (UnsatisfiedLinkError e2) {
                    com_ss_mediakit_vcnlib_VcnlibloadWrapper_com_ss_android_ugc_aweme_lancet_LogLancet_e("vcn", "Can't load vcnverify library: ".concat(String.valueOf(e2)));
                    z = false;
                }
                isVcnverifyload = z;
                if (!z && !tryLoadVcnverifyLitelib()) {
                    z2 = false;
                }
                MethodCollector.o(4696);
                return z2;
            } finally {
                MethodCollector.o(4696);
            }
        }
    }

    public static void com_ss_mediakit_vcnlib_VcnlibloadWrapper_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }
}
