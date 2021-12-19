package com.bytedance.monitor.a.a;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.librarian.Librarian;
import com.bytedance.monitor.a.c;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.lancet.d;
import com.ss.android.ugc.aweme.lancet.m;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static List<String> f41359a = new ArrayList();

    static {
        Covode.recordClassIndex(25349);
    }

    private static File a(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }

    private static boolean a(File file) {
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

    public static synchronized boolean a(Context context, String str) {
        synchronized (b.class) {
            if (f41359a.contains(str)) {
                return true;
            }
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                Librarian.a(str);
                m.a(uptimeMillis, str);
                f41359a.add(str);
            } catch (UnsatisfiedLinkError e2) {
                String mapLibraryName = System.mapLibraryName(str);
                if (context == null || a(context) == null) {
                    return false;
                }
                File file = new File(a(context), "libso");
                if (!file.exists()) {
                    new File(file.getAbsolutePath()).mkdirs();
                }
                File file2 = new File(file, mapLibraryName);
                if (file2.exists()) {
                    a(file2);
                }
                if (a(context, str, file2) != null) {
                    e2.getMessage();
                    return false;
                }
                String absolutePath = file2.getAbsolutePath();
                long uptimeMillis2 = SystemClock.uptimeMillis();
                System.load(absolutePath);
                m.a(uptimeMillis2, absolutePath);
                f41359a.add(str);
            } catch (Throwable unused) {
                return false;
            }
            return true;
        }
    }

    private static String a(Context context, String str, File file) {
        ZipFile zipFile;
        String str2;
        InputStream inputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            zipFile = new ZipFile(new File(context.getApplicationInfo().sourceDir), 1);
            try {
                ZipEntry entry = zipFile.getEntry("lib/" + Build.CPU_ABI + "/" + System.mapLibraryName(str));
                if (entry == null) {
                    int indexOf = Build.CPU_ABI.indexOf(45);
                    StringBuilder sb = new StringBuilder("lib/");
                    String str3 = Build.CPU_ABI;
                    if (indexOf <= 0) {
                        indexOf = Build.CPU_ABI.length();
                    }
                    String sb2 = sb.append(str3.substring(0, indexOf)).append("/").append(System.mapLibraryName(str)).toString();
                    entry = zipFile.getEntry(sb2);
                    if (entry == null) {
                        str2 = "Library entry not found:".concat(String.valueOf(sb2));
                        c.a((Closeable) null);
                        c.a((Closeable) null);
                        c.a(zipFile);
                        return str2;
                    }
                }
                file.createNewFile();
                inputStream = zipFile.getInputStream(entry);
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        str2 = th.getMessage();
                        c.a(fileOutputStream2);
                        c.a(inputStream);
                        c.a(zipFile);
                        return str2;
                    } catch (Throwable th3) {
                        c.a(fileOutputStream2);
                        c.a(inputStream);
                        c.a(zipFile);
                        throw th3;
                    }
                }
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read > 0) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            a.a("android.os.FileUtils", "setPermissions", file.getAbsolutePath(), 493, -1, -1);
                            c.a(fileOutputStream);
                            c.a(inputStream);
                            c.a(zipFile);
                            return null;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    fileOutputStream2 = fileOutputStream;
                    str2 = th.getMessage();
                    c.a(fileOutputStream2);
                    c.a(inputStream);
                    c.a(zipFile);
                    return str2;
                }
            } catch (Throwable th5) {
                th = th5;
                inputStream = null;
                str2 = th.getMessage();
                c.a(fileOutputStream2);
                c.a(inputStream);
                c.a(zipFile);
                return str2;
            }
        } catch (Throwable th6) {
            th = th6;
            inputStream = null;
            zipFile = null;
            str2 = th.getMessage();
            c.a(fileOutputStream2);
            c.a(inputStream);
            c.a(zipFile);
            return str2;
        }
    }
}
