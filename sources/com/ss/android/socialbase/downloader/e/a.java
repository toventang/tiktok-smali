package com.ss.android.socialbase.downloader.e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static int f60494a = 4;

    /* renamed from: b  reason: collision with root package name */
    private static AbstractC1330a f60495b;

    /* renamed from: com.ss.android.socialbase.downloader.e.a$a  reason: collision with other inner class name */
    public static abstract class AbstractC1330a {
        static {
            Covode.recordClassIndex(37375);
        }
    }

    static {
        Covode.recordClassIndex(37374);
    }

    public static boolean a() {
        if (f60494a <= 3) {
            return true;
        }
        return false;
    }

    public static void a(String str) {
        if (f60494a <= 6) {
            b(str);
        }
        if (f60495b != null) {
            b(str);
        }
    }

    private static String b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return "Downloader-".concat(String.valueOf(str));
        }
        return "DownloaderLogger";
    }

    public static void a(String str, String str2) {
        if (str2 != null && f60495b != null) {
            b(str);
        }
    }

    public static void c(String str, String str2) {
        if (str2 != null) {
            if (f60494a <= 4) {
                b(str);
            }
            if (f60495b != null) {
                b(str);
            }
        }
    }

    public static void d(String str, String str2) {
        if (str2 != null) {
            if (f60494a <= 5) {
                b(str);
            }
            if (f60495b != null) {
                b(str);
            }
        }
    }

    public static void e(String str, String str2) {
        if (str2 != null) {
            if (f60494a <= 6) {
                b(str);
            }
            if (f60495b != null) {
                b(str);
            }
        }
    }

    public static void b(String str, String str2) {
        if (str2 != null) {
            if (f60494a <= 3) {
                b(str);
            }
            if (f60495b != null) {
                b(str);
            }
        }
    }
}
