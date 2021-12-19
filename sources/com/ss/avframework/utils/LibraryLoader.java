package com.ss.avframework.utils;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;
import java.io.File;

public class LibraryLoader {
    private static Loader sLoader;

    public interface Loader {
        static {
            Covode.recordClassIndex(100592);
        }

        boolean loadLibrary(String str);

        boolean loadLibraryFromPath(String str);
    }

    static {
        Covode.recordClassIndex(100591);
    }

    public static void com_ss_avframework_utils_LibraryLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }

    public static void com_ss_avframework_utils_LibraryLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_load(String str) {
        MethodCollector.i(13786);
        long uptimeMillis = SystemClock.uptimeMillis();
        System.load(str);
        m.a(uptimeMillis, str);
        MethodCollector.o(13786);
    }

    public static void setupLibraryLoader(Loader loader) {
        sLoader = loader;
        EarlyAVLog.println(5, "setupLibraryLoader", "loader ".concat(String.valueOf(loader)), null);
    }

    public static boolean loadLibrary(String str) {
        Loader loader = sLoader;
        if (TextUtils.isEmpty(str)) {
            throw new Exception("Invalid library name.");
        } else if (loader != null) {
            EarlyAVLog.println(5, "LibraryLoader", "Loading [" + str + "] with external loader " + loader, null);
            return loader.loadLibrary(str);
        } else {
            com_ss_avframework_utils_LibraryLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(str);
            return true;
        }
    }

    public static void loadLibraryFromPath(String str) {
        Loader loader = sLoader;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!file.exists()) {
                throw new Exception("Not found library '" + str + "' file.");
            } else if (loader != null) {
                EarlyAVLog.println(5, "LibraryLoader", "Loading [" + file.getAbsolutePath() + "] with external loader " + loader, null);
                loader.loadLibraryFromPath(file.getAbsolutePath());
            } else {
                com_ss_avframework_utils_LibraryLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_load(file.getAbsolutePath());
            }
        } else {
            throw new Exception("Invalid library name.");
        }
    }
}
