package com.bytedance.monitor.a;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.util.zip.ZipFile;

public final class c {
    static {
        Covode.recordClassIndex(25370);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (Throwable unused) {
            }
        }
    }
}
