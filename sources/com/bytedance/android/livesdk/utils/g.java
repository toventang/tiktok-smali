package com.bytedance.android.livesdk.utils;

import android.content.Context;
import android.net.Uri;
import c.b.a;
import c.b.d;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class g {
    static {
        Covode.recordClassIndex(13180);
    }

    public static String a() {
        try {
            a a2 = d.a("y+2X0b3qfIqkZDbYHfFiN/8XI5fyqrwX5dCdfGk=");
            if (!a2.exists()) {
                a2.mkdirs();
            }
            return a2.getAbsolutePath();
        } catch (IOException unused) {
            return "";
        }
    }

    public static boolean b(File file) {
        if (!file.isDirectory()) {
            return c(file);
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return c(file);
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                b(file2);
            } else {
                c(file2);
            }
        }
        return c(file);
    }

    public static byte[] a(File file) {
        MethodCollector.i(11918);
        if (!file.exists()) {
            MethodCollector.o(11918);
            return null;
        }
        try {
            byte[] a2 = a(new FileInputStream(file));
            MethodCollector.o(11918);
            return a2;
        } catch (FileNotFoundException unused) {
            MethodCollector.o(11918);
            return null;
        }
    }

    private static boolean c(File file) {
        MethodCollector.i(12376);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(12376);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(12376);
        return delete;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0034 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] a(java.io.InputStream r6) {
        /*
            r5 = 12071(0x2f27, float:1.6915E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r5)
            r4 = 0
            if (r6 != 0) goto L_0x000c
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r4
        L_0x000c:
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0034, all -> 0x002c }
            r3.<init>()     // Catch:{ IOException -> 0x0034, all -> 0x002c }
            r0 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r0]     // Catch:{ IOException -> 0x0034, all -> 0x002c }
        L_0x0015:
            int r1 = r6.read(r2)     // Catch:{ IOException -> 0x0034, all -> 0x002c }
            r0 = -1
            if (r1 == r0) goto L_0x0021
            r0 = 0
            r3.write(r2, r0, r1)     // Catch:{ IOException -> 0x0034, all -> 0x002c }
            goto L_0x0015
        L_0x0021:
            byte[] r0 = r3.toByteArray()     // Catch:{ IOException -> 0x0034, all -> 0x002c }
            r6.close()     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r0
        L_0x002c:
            r0 = move-exception
            r6.close()     // Catch:{ IOException -> 0x0030 }
        L_0x0030:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            throw r0
        L_0x0034:
            r6.close()     // Catch:{ IOException -> 0x0037 }
        L_0x0037:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.utils.g.a(java.io.InputStream):byte[]");
    }

    public static byte[] a(Context context, Uri uri) {
        MethodCollector.i(12065);
        if (context == null || uri == null) {
            MethodCollector.o(12065);
            return null;
        }
        try {
            byte[] a2 = a(context.getContentResolver().openInputStream(uri));
            MethodCollector.o(12065);
            return a2;
        } catch (FileNotFoundException unused) {
            MethodCollector.o(12065);
            return null;
        }
    }

    public static void a(String str, String str2) {
        MethodCollector.i(12227);
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(str)));
        String str3 = ".." + File.separator;
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null) {
                String name = nextEntry.getName();
                if (!m.a(name) && name.contains(str3)) {
                    IOException iOException = new IOException("Unzip maybe be unsafe.");
                    MethodCollector.o(12227);
                    throw iOException;
                } else if (nextEntry.isDirectory()) {
                    new File(str2 + File.separator + name).mkdirs();
                } else {
                    File file = new File(str2 + File.separator + name);
                    if (file.exists()) {
                        c(file);
                    } else {
                        file.getParentFile().mkdirs();
                    }
                    file.createNewFile();
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int read = zipInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        bufferedOutputStream.write(bArr, 0, read);
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                }
            } else {
                zipInputStream.close();
                MethodCollector.o(12227);
                return;
            }
        }
    }
}
