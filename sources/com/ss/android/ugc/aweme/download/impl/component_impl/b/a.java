package com.ss.android.ugc.aweme.download.impl.component_impl.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import h.e.c;
import h.f.b.l;
import h.m.p;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f83117a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(51821);
    }

    private static boolean a(File file) {
        MethodCollector.i(6770);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(6770);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(6770);
        return delete;
    }

    public static final String a(File file, File file2) {
        MethodCollector.i(6765);
        l.d(file, "");
        l.d(file2, "");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            String absolutePath = file2.getAbsolutePath();
            l.b(absolutePath, "");
            a(fileInputStream, absolutePath);
            String absolutePath2 = file2.getAbsolutePath();
            l.b(absolutePath2, "");
            MethodCollector.o(6765);
            return absolutePath2;
        } catch (Exception e2) {
            a(file2);
            if (!(e2 instanceof IOException)) {
                IOException iOException = new IOException("Error when decompressing zip file.", e2);
                MethodCollector.o(6765);
                throw iOException;
            }
            MethodCollector.o(6765);
            throw e2;
        }
    }

    private static void a(InputStream inputStream, String str) {
        MethodCollector.i(6781);
        l.d(inputStream, "");
        l.d(str, "");
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        try {
            ZipInputStream zipInputStream2 = zipInputStream;
            while (true) {
                ZipEntry nextEntry = zipInputStream2.getNextEntry();
                if (nextEntry != null) {
                    String name = nextEntry.getName();
                    if (name != null) {
                        if (name.length() != 0) {
                            String name2 = nextEntry.getName();
                            l.b(name2, "");
                            if (!p.e((CharSequence) name2, (CharSequence) (".." + File.separator))) {
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
                                        MethodCollector.o(6781);
                                        throw th;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    c.a(zipInputStream, null);
                    MethodCollector.o(6781);
                    return;
                }
            }
        } catch (Throwable th2) {
            c.a(zipInputStream, th);
            MethodCollector.o(6781);
            throw th2;
        }
    }
}
