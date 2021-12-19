package com.bytedance.geckox.utils;

import android.os.Build;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.i.a;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public final class e {
    static {
        Covode.recordClassIndex(17491);
    }

    public static boolean c(File file) {
        String[] list;
        if (file.isDirectory()) {
            for (String str : file.list()) {
                if (!c(new File(file, str))) {
                    return false;
                }
            }
        }
        return h(file);
    }

    public static long d(File file) {
        if (file.isFile()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j2 = 0;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                j2 += d(file2);
            }
        }
        return j2;
    }

    public static void e(File file) {
        if (file.exists()) {
            if (file.isFile()) {
                throw new RuntimeException("create dir failed: path is a file");
            }
        } else if (!file.mkdirs()) {
            throw new RuntimeException("create dir failed: " + file.getPath());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        if (r1 != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean g(java.io.File r7) {
        /*
            r6 = 1
            if (r7 == 0) goto L_0x0009
            boolean r0 = r7.exists()
            if (r0 != 0) goto L_0x000a
        L_0x0009:
            return r6
        L_0x000a:
            boolean r0 = r7.isDirectory()
            r5 = 0
            if (r0 == 0) goto L_0x002e
            java.io.File[] r4 = r7.listFiles()
            if (r4 == 0) goto L_0x002e
            int r3 = r4.length
            r2 = 0
            r1 = 1
        L_0x001a:
            if (r2 >= r3) goto L_0x002c
            r0 = r4[r2]
            if (r1 == 0) goto L_0x002a
            boolean r0 = g(r0)
            if (r0 == 0) goto L_0x002a
            r1 = 1
        L_0x0027:
            int r2 = r2 + 1
            goto L_0x001a
        L_0x002a:
            r1 = 0
            goto L_0x0027
        L_0x002c:
            if (r1 == 0) goto L_0x0035
        L_0x002e:
            boolean r0 = h(r7)
            if (r0 == 0) goto L_0x0035
            return r6
        L_0x0035:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.utils.e.g(java.io.File):boolean");
    }

    public static boolean a(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        a.a("delete file，pid:", Integer.valueOf(Process.myPid()), ", thread:", Thread.currentThread().toString(), ", file:" + file.getAbsolutePath());
        return g(file);
    }

    public static List<File> b(File file) {
        File[] listFiles;
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length == 0) {
            return null;
        }
        List<File> asList = Arrays.asList(listFiles);
        final HashMap hashMap = new HashMap();
        for (File file2 : asList) {
            hashMap.put(file2, Long.valueOf(file2.lastModified()));
        }
        Collections.sort(asList, new Comparator<File>() {
            /* class com.bytedance.geckox.utils.e.AnonymousClass1 */

            static {
                Covode.recordClassIndex(17492);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(File file, File file2) {
                if (file == null) {
                    if (file2 == null) {
                        return 0;
                    }
                    return 1;
                } else if (file2 == null) {
                    return -1;
                } else {
                    int i2 = Build.VERSION.SDK_INT;
                    return Long.compare(((Long) hashMap.get(file)).longValue(), ((Long) hashMap.get(file2)).longValue());
                }
            }
        });
        return asList;
    }

    private static boolean h(File file) {
        MethodCollector.i(8479);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(8479);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(8479);
        return delete;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0113, code lost:
        if (r11 == null) goto L_0x0130;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e4 A[SYNTHETIC, Splitter:B:59:0x00e4] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean f(java.io.File r20) {
        /*
        // Method dump skipped, instructions count: 305
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.utils.e.f(java.io.File):boolean");
    }

    public static long a(InputStream inputStream, OutputStream outputStream) {
        MethodCollector.i(8485);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        byte[] bArr = new byte[1024];
        int i2 = 0;
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read != -1) {
                i2 += read;
                bufferedOutputStream.write(bArr, 0, read);
            } else {
                bufferedOutputStream.flush();
                long j2 = (long) i2;
                MethodCollector.o(8485);
                return j2;
            }
        }
    }
}
