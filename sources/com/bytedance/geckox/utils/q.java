package com.bytedance.geckox.utils;

import android.os.Process;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.b.b;
import com.bytedance.geckox.buffer.a;
import com.bytedance.geckox.statistic.c;
import com.bytedance.zoin.zstd.ZstdInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class q {
    static {
        Covode.recordClassIndex(17511);
    }

    public static void a(a aVar, a aVar2) {
        ZstdInputStream zstdInputStream;
        Throwable th;
        com.bytedance.geckox.buffer.a.a aVar3 = new com.bytedance.geckox.buffer.a.a(aVar);
        try {
            zstdInputStream = new ZstdInputStream(aVar3);
            try {
                byte[] bArr = new byte[32768];
                while (true) {
                    int read = zstdInputStream.read(bArr);
                    if (read != -1) {
                        aVar2.a(bArr, 0, read);
                    } else {
                        c.a(aVar3);
                        c.a(zstdInputStream);
                        return;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                c.a(aVar3);
                c.a(zstdInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            zstdInputStream = null;
            c.a(aVar3);
            c.a(zstdInputStream);
            throw th;
        }
    }

    public static void a(InputStream inputStream, String str, String str2, int i2) {
        ZipInputStream zipInputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        long j2;
        String str3;
        int i3 = 8010;
        MethodCollector.i(8010);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            zipInputStream = new ZipInputStream(inputStream);
            boolean z = false;
            boolean z2 = true;
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry != null) {
                        String name = nextEntry.getName();
                        if (!name.startsWith("__MACOSX/")) {
                            try {
                                if (!name.equals(".DS_Store")) {
                                    if (!name.startsWith(str2 + File.separator)) {
                                        b.a(new File(canonicalPath));
                                        RuntimeException runtimeException = new RuntimeException("the zip package outermost folder is not named by channel:" + str2 + ",name:" + name);
                                        MethodCollector.o(8010);
                                        throw runtimeException;
                                    } else if (nextEntry.isDirectory()) {
                                        File file = new File(canonicalPath, name);
                                        if (file.getCanonicalPath().startsWith(canonicalPath)) {
                                            file.mkdirs();
                                        } else {
                                            RuntimeException runtimeException2 = new RuntimeException("directory traversal, dir:" + name + ", channel:" + str2);
                                            MethodCollector.o(i3);
                                            throw runtimeException2;
                                        }
                                    } else {
                                        String canonicalPath2 = new File(canonicalPath, name).getCanonicalPath();
                                        if (canonicalPath2.startsWith(canonicalPath)) {
                                            File file2 = new File(canonicalPath2);
                                            file2.getParentFile().mkdirs();
                                            try {
                                                fileOutputStream = new FileOutputStream(file2);
                                                try {
                                                    long a2 = e.a(zipInputStream, fileOutputStream);
                                                    long size = nextEntry.getSize();
                                                    if (file2.exists()) {
                                                        try {
                                                            j2 = file2.length();
                                                        } catch (Throwable th3) {
                                                            th2 = th3;
                                                            c.a(fileOutputStream);
                                                            MethodCollector.o(8010);
                                                            throw th2;
                                                        }
                                                    } else {
                                                        j2 = -1;
                                                    }
                                                    if (size != 0 && j2 <= 0) {
                                                        try {
                                                            com.bytedance.geckox.i.a.a("mmap+ZipInputStream unzip,dir:" + canonicalPath + ",channel:" + str2 + ",file[" + file2.getPath() + "] is size 0/retry count:" + i2);
                                                            str3 = "size 0";
                                                        } catch (Throwable th4) {
                                                            th2 = th4;
                                                            c.a(fileOutputStream);
                                                            MethodCollector.o(8010);
                                                            throw th2;
                                                        }
                                                    } else if (e.f(file2)) {
                                                        com.bytedance.geckox.i.a.a("mmap+ZipInputStream unzip,dir:" + canonicalPath + ",channel:" + str2 + ",file[" + file2.getPath() + "] is tasm broken(content 0)/retry count:" + i2);
                                                        str3 = "tasm broken";
                                                    } else {
                                                        str3 = null;
                                                    }
                                                    if (!TextUtils.isEmpty(str3)) {
                                                        if (z2) {
                                                            String str4 = "channel:" + str2 + ",file :" + name + ",entry size:" + size + ",local file size:" + j2 + ",stream size:" + a2 + ",pid:" + Process.myPid() + ",thread id:" + Thread.currentThread().getId();
                                                            com.bytedance.geckox.i.a.a("mmap+ZipInputStream unzip ".concat(String.valueOf(str3)), str4);
                                                            c.a(3, 31, str3 + "," + str4, "retry count:".concat(String.valueOf(i2)));
                                                            z2 = false;
                                                        }
                                                        if (!str3.contains("tasm")) {
                                                            com.bytedance.q.a.a aVar = new com.bytedance.q.a.a("unzip file ".concat(String.valueOf(str3)));
                                                            MethodCollector.o(8010);
                                                            throw aVar;
                                                        }
                                                    }
                                                    try {
                                                        c.a(fileOutputStream);
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        c.a(zipInputStream);
                                                        MethodCollector.o(8010);
                                                        throw th;
                                                    }
                                                } catch (Throwable th6) {
                                                    th2 = th6;
                                                    c.a(fileOutputStream);
                                                    MethodCollector.o(8010);
                                                    throw th2;
                                                }
                                            } catch (Throwable th7) {
                                                th2 = th7;
                                                fileOutputStream = null;
                                                c.a(fileOutputStream);
                                                MethodCollector.o(8010);
                                                throw th2;
                                            }
                                        } else {
                                            RuntimeException runtimeException3 = new RuntimeException("directory traversal, file name:".concat(String.valueOf(name)));
                                            MethodCollector.o(8010);
                                            throw runtimeException3;
                                        }
                                    }
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                c.a(zipInputStream);
                                MethodCollector.o(8010);
                                throw th;
                            }
                        }
                        i3 = 8010;
                        z = true;
                    } else if (z) {
                        c.a(zipInputStream);
                        com.bytedance.geckox.i.a.a("unzip success,channel:".concat(String.valueOf(str2)), "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                        MethodCollector.o(8010);
                        return;
                    } else {
                        inputStream.reset();
                        RuntimeException runtimeException4 = new RuntimeException("not zip file  channel:".concat(String.valueOf(str2)));
                        MethodCollector.o(8010);
                        throw runtimeException4;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    c.a(zipInputStream);
                    MethodCollector.o(8010);
                    throw th;
                }
            }
        } catch (Throwable th10) {
            th = th10;
            zipInputStream = null;
            c.a(zipInputStream);
            MethodCollector.o(8010);
            throw th;
        }
    }
}
