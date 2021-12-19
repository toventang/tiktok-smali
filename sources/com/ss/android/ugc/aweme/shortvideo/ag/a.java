package com.ss.android.ugc.aweme.shortvideo.ag;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class a {
    static {
        Covode.recordClassIndex(82080);
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private static boolean a(InputStream inputStream, OutputStream outputStream) {
        MethodCollector.i(10648);
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    outputStream.flush();
                    a(inputStream);
                    a(outputStream);
                    MethodCollector.o(10648);
                    return true;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                a(inputStream);
                a(outputStream);
                MethodCollector.o(10648);
                return false;
            } catch (Throwable th) {
                a(inputStream);
                a(outputStream);
                MethodCollector.o(10648);
                throw th;
            }
        }
    }

    public static boolean a(Context context, String str, File file) {
        MethodCollector.i(10646);
        try {
            boolean a2 = a(context.getAssets().open(str), new FileOutputStream(file));
            MethodCollector.o(10646);
            return a2;
        } catch (IOException e2) {
            e2.printStackTrace();
            MethodCollector.o(10646);
            return false;
        }
    }
}
