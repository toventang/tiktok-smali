package com.facebook.soloader;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

public final class j {
    static {
        Covode.recordClassIndex(30770);
    }

    /* access modifiers changed from: package-private */
    public static final class a {
        static {
            Covode.recordClassIndex(30771);
        }

        public static String[] getSupportedAbis() {
            return Build.SUPPORTED_ABIS;
        }

        public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j2) {
            try {
                Os.posix_fallocate(fileDescriptor, 0, j2);
            } catch (ErrnoException e2) {
                if (e2.errno != OsConstants.EOPNOTSUPP && e2.errno != OsConstants.ENOSYS && e2.errno != OsConstants.EINVAL) {
                    throw new IOException(e2.toString(), e2);
                }
            }
        }
    }

    public static String[] a() {
        if (Build.VERSION.SDK_INT >= 21) {
            return a.getSupportedAbis();
        }
        return new String[]{Build.CPU_ABI, Build.CPU_ABI2};
    }

    public static int a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                return packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void b(java.io.File r4) {
        /*
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L_0x0029
            java.io.File[] r2 = r4.listFiles()
            if (r2 == 0) goto L_0x0019
            r1 = 0
        L_0x000d:
            int r0 = r2.length
            if (r1 >= r0) goto L_0x0018
            r0 = r2[r1]
            b(r0)
            int r1 = r1 + 1
            goto L_0x000d
        L_0x0018:
            return
        L_0x0019:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "cannot list directory "
            java.lang.String r0 = r0.concat(r1)
            r2.<init>(r0)
            throw r2
        L_0x0029:
            java.lang.String r1 = r4.getPath()
            java.lang.String r0 = "_lock"
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L_0x0053
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile
            java.lang.String r0 = "r"
            r3.<init>(r4, r0)
            java.io.FileDescriptor r0 = r3.getFD()     // Catch:{ all -> 0x0047 }
            r0.sync()     // Catch:{ all -> 0x0047 }
            r3.close()
            return
        L_0x0047:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x004e }
            goto L_0x0052
        L_0x004e:
            r0 = move-exception
            r2.addSuppressed(r0)
        L_0x0052:
            throw r1
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.j.b(java.io.File):void");
    }

    private static boolean c(File file) {
        MethodCollector.i(6244);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(6244);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(6244);
        return delete;
    }

    public static void a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    a(file2);
                }
            } else {
                return;
            }
        }
        if (!c(file) && file.exists()) {
            throw new IOException("could not delete: ".concat(String.valueOf(file)));
        }
    }

    public static int a(String[] strArr, String str) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (strArr[i2] != null && str.equals(strArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    static int a(RandomAccessFile randomAccessFile, InputStream inputStream, byte[] bArr) {
        int read;
        MethodCollector.i(6253);
        int i2 = 0;
        while (i2 < Integer.MAX_VALUE && (read = inputStream.read(bArr, 0, Math.min(32768, Integer.MAX_VALUE - i2))) != -1) {
            randomAccessFile.write(bArr, 0, read);
            i2 += read;
        }
        MethodCollector.o(6253);
        return i2;
    }
}
