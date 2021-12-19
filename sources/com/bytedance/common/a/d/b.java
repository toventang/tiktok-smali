package com.bytedance.common.a.d;

import android.os.Build;
import com.bytedance.common.a.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import dalvik.system.BaseDexClassLoader;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static byte[] f26730a = {80, 75, 3, 4};

    /* renamed from: b  reason: collision with root package name */
    private static byte[] f26731b = {80, 75, 5, 6};

    static {
        Covode.recordClassIndex(15764);
    }

    public static boolean c(File file) {
        if (file == null || !file.exists() || file.length() == 0) {
            return false;
        }
        return true;
    }

    public static boolean d(File file) {
        if (file.exists()) {
            return true;
        }
        try {
            file.getParentFile().mkdirs();
            return file.createNewFile();
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static long a(String str) {
        File file = new File(str);
        long j2 = 0;
        if (!file.exists() || Build.VERSION.SDK_INT < 26) {
            return 0;
        }
        try {
            j2 = Files.readAttributes(file.toPath(), BasicFileAttributes.class, new LinkOption[0]).creationTime().toMillis();
            return j2;
        } catch (IOException e2) {
            e2.printStackTrace();
            return j2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        if (r1 == null) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.io.File r6) {
        /*
            r5 = 4956(0x135c, float:6.945E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r5)
            boolean r0 = r6.isDirectory()
            r4 = 0
            if (r0 == 0) goto L_0x0010
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r4
        L_0x0010:
            r1 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x003b }
            r3.<init>(r6)     // Catch:{ IOException -> 0x003b }
            r2 = 4
            byte[] r1 = new byte[r2]     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            int r0 = r3.read(r1, r4, r2)     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            if (r0 != r2) goto L_0x0031
            byte[] r0 = com.bytedance.common.a.d.b.f26730a     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            boolean r0 = java.util.Arrays.equals(r0, r1)     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            if (r0 != 0) goto L_0x002f
            byte[] r0 = com.bytedance.common.a.d.b.f26731b     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            boolean r0 = java.util.Arrays.equals(r0, r1)     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            if (r0 == 0) goto L_0x0031
        L_0x002f:
            r0 = 1
            r4 = 1
        L_0x0031:
            r3.close()     // Catch:{ IOException -> 0x004f }
            goto L_0x004f
        L_0x0035:
            r0 = move-exception
            r1 = r3
            goto L_0x0043
        L_0x0038:
            r0 = move-exception
            r1 = r3
            goto L_0x003c
        L_0x003b:
            r0 = move-exception
        L_0x003c:
            r0.printStackTrace()     // Catch:{ all -> 0x0040 }
            goto L_0x004a
        L_0x0040:
            r0 = move-exception
            if (r1 == 0) goto L_0x0046
        L_0x0043:
            r1.close()     // Catch:{ IOException -> 0x0046 }
        L_0x0046:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            throw r0
        L_0x004a:
            if (r1 == 0) goto L_0x004f
            r1.close()
        L_0x004f:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.a.d.b.a(java.io.File):boolean");
    }

    public static byte[] b(File file) {
        MethodCollector.i(4965);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        try {
            byte[] bArr = new byte[512];
            while (true) {
                int read = bufferedInputStream.read(bArr, 0, 512);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    bufferedInputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    MethodCollector.o(4965);
                    return byteArray;
                }
            }
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            MethodCollector.o(4965);
            throw th;
        }
    }

    public static File b(String str) {
        File file = new File(a.a().getApplicationInfo().nativeLibraryDir + File.separator + System.mapLibraryName(str));
        if (file.exists()) {
            return file;
        }
        try {
            ClassLoader classLoader = com.bytedance.common.a.b.class.getClassLoader();
            while (!(classLoader instanceof BaseDexClassLoader) && classLoader.getParent() != null) {
                classLoader = classLoader.getParent();
            }
            if (!(classLoader instanceof BaseDexClassLoader)) {
                return file;
            }
            Field declaredField = BaseDexClassLoader.class.getDeclaredField("pathList");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(classLoader);
            Field declaredField2 = obj.getClass().getDeclaredField("nativeLibraryDirectories");
            declaredField2.setAccessible(true);
            for (File file2 : (List) declaredField2.get(obj)) {
                File file3 = new File(file2, System.mapLibraryName(str));
                try {
                    if (file3.exists()) {
                        return file3;
                    }
                    file = file3;
                } catch (Throwable unused) {
                    return file3;
                }
            }
            return file;
        } catch (Throwable unused2) {
            return file;
        }
    }
}
