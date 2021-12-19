package com.ss.android.agilelogger.c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;

public final class a {
    static {
        Covode.recordClassIndex(36550);
    }

    public static File a(Context context) {
        File file = new File(c(context), "logs");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private static File c(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }

    public static String b(Context context) {
        File c2 = c(context);
        if (c2 == null) {
            return null;
        }
        File file = new File(c2.getAbsolutePath(), "ALOG");
        if (!file.exists()) {
            file.mkdir();
        }
        return file.getAbsolutePath();
    }
}
