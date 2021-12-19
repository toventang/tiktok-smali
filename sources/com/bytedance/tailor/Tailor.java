package com.bytedance.tailor;

import android.content.Context;
import android.os.Build;
import android.os.Debug;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.application.o;
import java.io.RandomAccessFile;

public class Tailor {
    private static native void closeTailor();

    private static native void openTailor(String str, boolean z);

    public static native void tailorHprof(String str, String str2);

    private Tailor() {
    }

    static {
        Covode.recordClassIndex(27031);
        com_bytedance_tailor_Tailor_com_ss_android_ugc_aweme_lancet_LibrarianLanect_loadLibrary("tailor");
    }

    public static void com_bytedance_tailor_Tailor_com_ss_android_ugc_aweme_lancet_LibrarianLanect_loadLibrary(String str) {
        if (o.f66957b.get(str) == null) {
            Librarian.a(str, false, (Context) null);
        }
    }

    public static boolean isHprofValid(String str) {
        boolean z = false;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
            try {
                randomAccessFile.seek(randomAccessFile.length() - 9);
                if (randomAccessFile.readByte() == 44) {
                    z = true;
                }
                try {
                    randomAccessFile.close();
                } catch (Throwable unused) {
                }
                return z;
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
            return false;
        }
    }

    public static void dumpHprofData(String str, boolean z) {
        MethodCollector.i(2625);
        if (Build.VERSION.SDK_INT > 19) {
            openTailor(str, z);
            Debug.dumpHprofData(str);
            closeTailor();
            MethodCollector.o(2625);
            return;
        }
        Debug.dumpHprofData(str);
        MethodCollector.o(2625);
    }
}
