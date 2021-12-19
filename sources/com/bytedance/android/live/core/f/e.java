package com.bytedance.android.live.core.f;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.android.live.core.c.a;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class e {
    static {
        Covode.recordClassIndex(4638);
    }

    public static boolean b() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a() {
        String str;
        try {
            str = Environment.getExternalStorageState();
        } catch (Exception unused) {
            str = null;
        }
        if ("mounted".equals(str) || "mounted_ro".equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean a(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.exists();
    }

    private static File b(Context context) {
        if (d.f107193a != null && d.f107197e) {
            return d.f107193a;
        }
        File externalCacheDir = context.getExternalCacheDir();
        d.f107193a = externalCacheDir;
        return externalCacheDir;
    }

    public static File a(Context context) {
        if (!a() || !b() || b(context) == null) {
            return null;
        }
        File file = new File(b(context).getPath());
        a(file);
        a.a(3, "file_path", "cache path:" + file.getAbsolutePath());
        return file;
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    private static boolean b(File file) {
        MethodCollector.i(12043);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(12043);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(12043);
        return delete;
    }

    public static void a(String str, String str2) {
        MethodCollector.i(12045);
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(str)));
        String str3 = ".." + File.separator;
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null) {
                String name = nextEntry.getName();
                if (!m.a(name) && name.contains(str3)) {
                    IOException iOException = new IOException("Unzip maybe be unsafe.");
                    MethodCollector.o(12045);
                    throw iOException;
                } else if (nextEntry.isDirectory()) {
                    new File(str2 + File.separator + name).mkdirs();
                } else {
                    File file = new File(str2 + File.separator + name);
                    if (file.exists()) {
                        b(file);
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
                MethodCollector.o(12045);
                return;
            }
        }
    }
}
