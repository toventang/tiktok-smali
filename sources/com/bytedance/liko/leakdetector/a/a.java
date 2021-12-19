package com.bytedance.liko.leakdetector.a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.d;
import h.f.b.l;
import java.io.File;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f40096a;

    static {
        Covode.recordClassIndex(24712);
    }

    private static File b(Context context) {
        File file = new File(c(context), "leakcanary");
        if (a(file)) {
            return file;
        }
        l.c("Could not create heap dump directory in app storage: [${storageDirectory.absolutePath}]", "");
        return null;
    }

    private static File c(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }

    private static boolean d(Context context) {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 23 || f40096a) {
            return true;
        }
        if (context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            z = false;
        }
        f40096a = z;
        return z;
    }

    private static File a(Context context) {
        File file = new File(a(context, "liko"), "leakcanary-" + context.getPackageName());
        if (a(file)) {
            return file;
        }
        l.c("Could not create heap dump directory in externalStorageDirectory: [${externalStorageDirectory.absolutePath}]", "");
        return null;
    }

    private static boolean a(File file) {
        if ((file.mkdirs() || file.exists()) && file.canWrite()) {
            return true;
        }
        return false;
    }

    private static File a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            return context.getExternalFilesDir(str);
        }
        if (d.f107196d != null && d.f107197e) {
            return d.f107196d;
        }
        File externalFilesDir = context.getExternalFilesDir(str);
        d.f107196d = externalFilesDir;
        return externalFilesDir;
    }

    public static File a(boolean z, Context context) {
        File file;
        if (z || !d(context)) {
            file = b(context);
        } else {
            file = a(context);
        }
        if (file != null) {
            return new File(file, ".dump.hporf");
        }
        return null;
    }
}
