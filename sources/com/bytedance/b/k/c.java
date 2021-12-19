package com.bytedance.b.k;

import android.os.Build;
import android.os.StatFs;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class c {
    static {
        Covode.recordClassIndex(15285);
    }

    public static long a(String str) {
        StatFs statFs = new StatFs(str);
        int i2 = Build.VERSION.SDK_INT;
        return statFs.getTotalBytes();
    }

    public static void b(File file) {
        if (file != null && file.exists()) {
            try {
                c(file);
            } catch (Throwable unused) {
            }
        }
    }

    public static byte[] a(File file) {
        Throwable th;
        BufferedInputStream bufferedInputStream;
        FileNotFoundException e2;
        IOException e3;
        BufferedInputStream bufferedInputStream2 = null;
        if (file == null || !file.exists()) {
            return null;
        }
        int length = (int) file.length();
        byte[] bArr = new byte[length];
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                bufferedInputStream.read(bArr, 0, length);
                bufferedInputStream.close();
                d.a(bufferedInputStream);
                return bArr;
            } catch (FileNotFoundException e4) {
                e2 = e4;
                e2.printStackTrace();
                d.a(bufferedInputStream);
                return null;
            } catch (IOException e5) {
                e3 = e5;
                try {
                    e3.printStackTrace();
                    d.a(bufferedInputStream);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream2 = bufferedInputStream;
                }
            }
        } catch (FileNotFoundException e6) {
            e2 = e6;
            bufferedInputStream = null;
            e2.printStackTrace();
            d.a(bufferedInputStream);
            return null;
        } catch (IOException e7) {
            e3 = e7;
            bufferedInputStream = null;
            e3.printStackTrace();
            d.a(bufferedInputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            d.a(bufferedInputStream2);
            throw th;
        }
    }

    private static boolean c(File file) {
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                return false;
            }
        } catch (Throwable unused) {
        }
        return file.delete();
    }
}
