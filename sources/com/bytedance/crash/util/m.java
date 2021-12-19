package com.bytedance.crash.util;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.ZipFile;

public final class m {
    static {
        Covode.recordClassIndex(16390);
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
            } catch (IOException unused) {
            }
        }
    }
}
