package com.ss.ttm.player;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

public final class q {
    static {
        Covode.recordClassIndex(101366);
    }

    public static void a(String str) {
        File file = new File(str);
        if (file.exists()) {
            a(file);
        }
    }

    private static boolean a(File file) {
        MethodCollector.i(1870);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(1870);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(1870);
        return delete;
    }

    private static void a(InputStream inputStream, OutputStream outputStream) {
        MethodCollector.i(1881);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        byte[] bArr = new byte[10240];
        while (true) {
            int read = inputStream.read(bArr, 0, 10240);
            if (read != -1) {
                gZIPOutputStream.write(bArr, 0, read);
            } else {
                gZIPOutputStream.flush();
                gZIPOutputStream.finish();
                gZIPOutputStream.close();
                MethodCollector.o(1881);
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d A[SYNTHETIC, Splitter:B:25:0x006d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.Context r8, java.lang.String r9, java.lang.StringBuilder r10) {
        /*
        // Method dump skipped, instructions count: 137
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.q.a(android.content.Context, java.lang.String, java.lang.StringBuilder):java.lang.String");
    }
}
