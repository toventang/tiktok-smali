package com.ss.android.ugc.musicprovider;

import android.text.TextUtils;
import com.bytedance.common.utility.d;
import com.bytedance.covode.number.Covode;
import java.io.File;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final char[] f148537a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        Covode.recordClassIndex(97912);
    }

    public static File a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            d(file.getPath());
        }
        return file;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    public static String c(String str) {
        return d.b(str) + ".mp3";
    }

    private static void d(String str) {
        try {
            File file = new File(str);
            if (file.getParentFile().exists()) {
                file.mkdir();
                return;
            }
            d(file.getParent());
            file.mkdir();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
