package com.ss.android.ugc.tools.utils;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import h.e.c;
import h.f.b.l;
import h.m.p;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final u f150017a = new u();

    private u() {
    }

    private static boolean a(ZipEntry zipEntry) {
        String name;
        if (!(zipEntry == null || (name = zipEntry.getName()) == null || name.length() == 0)) {
            String name2 = zipEntry.getName();
            l.b(name2, "");
            if (!p.e((CharSequence) name2, (CharSequence) (".." + File.separator))) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(File file) {
        MethodCollector.i(2111);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.b(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(2111);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(2111);
        return delete;
    }

    static {
        Covode.recordClassIndex(98764);
    }

    public static final String a(File file, File file2) {
        MethodCollector.i(2108);
        l.d(file, "");
        l.d(file2, "");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            String absolutePath = file2.getAbsolutePath();
            l.b(absolutePath, "");
            a(fileInputStream, absolutePath);
            String absolutePath2 = file2.getAbsolutePath();
            l.b(absolutePath2, "");
            MethodCollector.o(2108);
            return absolutePath2;
        } catch (Exception e2) {
            a(file2);
            if (!(e2 instanceof IOException)) {
                IOException iOException = new IOException("Error when decompressing zip file.", e2);
                MethodCollector.o(2108);
                throw iOException;
            }
            MethodCollector.o(2108);
            throw e2;
        }
    }

    public static final String a(String str, List<String> list) {
        l.d(str, "");
        l.d(list, "");
        return a(str, "ame-extract-frames" + System.currentTimeMillis() + ".zip", list);
    }

    public static final void a(InputStream inputStream, String str) {
        MethodCollector.i(2133);
        l.d(inputStream, "");
        l.d(str, "");
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        try {
            ZipInputStream zipInputStream2 = zipInputStream;
            while (true) {
                ZipEntry nextEntry = zipInputStream2.getNextEntry();
                if (nextEntry == null) {
                    c.a(zipInputStream, null);
                    MethodCollector.o(2133);
                    return;
                } else if (a(nextEntry)) {
                    if (nextEntry.isDirectory()) {
                        new File(str + File.separator + nextEntry.getName()).mkdirs();
                    } else {
                        File file = new File(str + File.separator + nextEntry.getName());
                        File parentFile = file.getParentFile();
                        if (!parentFile.exists()) {
                            parentFile.mkdirs();
                        } else if (file.exists()) {
                            a(file);
                        } else {
                            file.createNewFile();
                        }
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                        try {
                            BufferedOutputStream bufferedOutputStream2 = bufferedOutputStream;
                            byte[] bArr = new byte[2048];
                            while (true) {
                                int read = zipInputStream2.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                bufferedOutputStream2.write(bArr, 0, read);
                            }
                            bufferedOutputStream2.flush();
                            c.a(bufferedOutputStream, null);
                        } catch (Throwable th) {
                            c.a(bufferedOutputStream, th);
                            MethodCollector.o(2133);
                            throw th;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            c.a(zipInputStream, th);
            MethodCollector.o(2133);
            throw th2;
        }
    }

    private static String a(String str, String str2, List<String> list) {
        MethodCollector.i(2106);
        l.d(str, "");
        l.d(str2, "");
        l.d(list, "");
        String str3 = null;
        if (list.isEmpty()) {
            MethodCollector.o(2106);
            return null;
        }
        try {
            File file = new File(str + File.separator + str2);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            try {
                ZipOutputStream zipOutputStream2 = zipOutputStream;
                for (String str4 : list) {
                    File file2 = new File(str4);
                    if (file2.exists()) {
                        if (file2.isDirectory()) {
                            f150017a.a(zipOutputStream2, file2, file2.getName() + File.separator);
                        } else {
                            f150017a.a(zipOutputStream2, file2, "");
                        }
                    }
                }
                zipOutputStream2.flush();
                String absolutePath = file.getAbsolutePath();
                c.a(zipOutputStream, null);
                str3 = absolutePath;
                MethodCollector.o(2106);
                return str3;
            } catch (Throwable th) {
                c.a(zipOutputStream, th);
                MethodCollector.o(2106);
                throw th;
            }
        } catch (Exception unused) {
        }
    }

    public static final void a(Context context, int i2, String str) {
        MethodCollector.i(2115);
        l.d(context, "");
        l.d(str, "");
        if (i2 == 0 || TextUtils.isEmpty(str)) {
            MethodCollector.o(2115);
            return;
        }
        Resources resources = context.getResources();
        if (resources != null) {
            InputStream openRawResource = resources.openRawResource(i2);
            l.b(openRawResource, "");
            a(openRawResource, str);
            MethodCollector.o(2115);
            return;
        }
        MethodCollector.o(2115);
    }

    private final void a(ZipOutputStream zipOutputStream, File file, String str) {
        MethodCollector.i(2162);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                if (file2 != null) {
                    if (file2.isDirectory()) {
                        a(zipOutputStream, file2, file.getName() + File.separator + file2.getName() + File.separator);
                    } else {
                        a(zipOutputStream, file2, str);
                    }
                }
            }
            MethodCollector.o(2162);
            return;
        }
        byte[] bArr = new byte[2048];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        try {
            BufferedInputStream bufferedInputStream2 = bufferedInputStream;
            zipOutputStream.putNextEntry(new ZipEntry(str + file.getName()));
            while (true) {
                int read = bufferedInputStream2.read(bArr);
                if (read != -1) {
                    zipOutputStream.write(bArr, 0, read);
                } else {
                    c.a(bufferedInputStream, null);
                    MethodCollector.o(2162);
                    return;
                }
            }
        } catch (Throwable th) {
            c.a(bufferedInputStream, th);
            MethodCollector.o(2162);
            throw th;
        }
    }
}
