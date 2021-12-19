package com.bytedance.apm.q;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.a.c;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final String f25247a = e.class.getSimpleName();

    static {
        Covode.recordClassIndex(14701);
    }

    public static long a(File file) {
        if (!file.exists()) {
            return -1;
        }
        if (file.isFile()) {
            return file.length();
        }
        long j2 = 0;
        if (!file.isDirectory()) {
            return -1;
        }
        for (File file2 : file.listFiles()) {
            j2 += a(file2);
        }
        return j2;
    }

    public static File a(Context context) {
        File file = null;
        if (context == null) {
            return null;
        }
        try {
            if (!TextUtils.isEmpty(null)) {
                file = context.getExternalFilesDir(null);
            } else {
                if (d.f107196d == null || !d.f107197e) {
                    d.f107196d = context.getExternalFilesDir(null);
                }
                file = d.f107196d;
            }
            do {
                file = file.getParentFile();
            } while (file.getAbsolutePath().contains("/Android"));
        } catch (Throwable unused) {
        }
        return file;
    }

    public static void a(String str, String... strArr) {
        FileOutputStream fileOutputStream;
        CheckedOutputStream checkedOutputStream;
        ZipOutputStream zipOutputStream;
        Throwable th;
        Exception e2;
        try {
            fileOutputStream = new FileOutputStream(new File(str));
            try {
                checkedOutputStream = new CheckedOutputStream(fileOutputStream, new CRC32());
                try {
                    zipOutputStream = new ZipOutputStream(checkedOutputStream);
                    int i2 = 0;
                    while (true) {
                        try {
                            String str2 = strArr[0];
                            File file = new File(str2);
                            if (file.exists()) {
                                a(file, zipOutputStream, "");
                                i2++;
                                if (i2 > 0) {
                                    c.a(zipOutputStream);
                                    c.a(checkedOutputStream);
                                    c.a(fileOutputStream);
                                    return;
                                }
                            } else {
                                throw new RuntimeException(str2 + "not exist！");
                            }
                        } catch (Exception e3) {
                            e2 = e3;
                            try {
                                throw new RuntimeException(e2);
                            } catch (Throwable th2) {
                                th = th2;
                                c.a(zipOutputStream);
                                c.a(checkedOutputStream);
                                c.a(fileOutputStream);
                                throw th;
                            }
                        }
                    }
                } catch (Exception e4) {
                    e2 = e4;
                    zipOutputStream = null;
                    throw new RuntimeException(e2);
                } catch (Throwable th3) {
                    th = th3;
                    zipOutputStream = null;
                    c.a(zipOutputStream);
                    c.a(checkedOutputStream);
                    c.a(fileOutputStream);
                    throw th;
                }
            } catch (Exception e5) {
                e2 = e5;
                checkedOutputStream = null;
                zipOutputStream = null;
                throw new RuntimeException(e2);
            } catch (Throwable th4) {
                th = th4;
                checkedOutputStream = null;
                zipOutputStream = null;
                c.a(zipOutputStream);
                c.a(checkedOutputStream);
                c.a(fileOutputStream);
                throw th;
            }
        } catch (Exception e6) {
            e2 = e6;
            checkedOutputStream = null;
            fileOutputStream = null;
            zipOutputStream = null;
            throw new RuntimeException(e2);
        } catch (Throwable th5) {
            th = th5;
            checkedOutputStream = null;
            fileOutputStream = null;
            zipOutputStream = null;
            c.a(zipOutputStream);
            c.a(checkedOutputStream);
            c.a(fileOutputStream);
            throw th;
        }
    }

    public static void a(List<String> list, String str) {
        Throwable th;
        ZipOutputStream zipOutputStream = null;
        try {
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(str));
            try {
                for (String str2 : list) {
                    File file = new File(str2);
                    a(zipOutputStream2, file, file.getName());
                }
                c.a(zipOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                zipOutputStream = zipOutputStream2;
                c.a(zipOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            c.a(zipOutputStream);
            throw th;
        }
    }

    private static void b(File file, ZipOutputStream zipOutputStream, String str) {
        File[] listFiles;
        if (file.exists()) {
            for (File file2 : file.listFiles()) {
                a(file2, zipOutputStream, str);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v5, resolved type: java.io.BufferedInputStream */
    /* JADX WARN: Multi-variable type inference failed */
    private static void c(File file, ZipOutputStream zipOutputStream, String str) {
        FileInputStream fileInputStream;
        Throwable th;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3;
        Exception e2;
        FileInputStream fileInputStream4;
        BufferedInputStream bufferedInputStream;
        if (file.exists()) {
            FileInputStream fileInputStream5 = null;
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    bufferedInputStream = new BufferedInputStream(fileInputStream);
                } catch (Exception e3) {
                    e2 = e3;
                    fileInputStream4 = null;
                    fileInputStream5 = fileInputStream;
                    fileInputStream3 = fileInputStream4;
                    try {
                        throw new RuntimeException(e2);
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream5;
                        fileInputStream2 = fileInputStream3;
                        fileInputStream5 = fileInputStream2;
                        c.a(fileInputStream5);
                        c.a(fileInputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c.a(fileInputStream5);
                    c.a(fileInputStream);
                    throw th;
                }
                try {
                    zipOutputStream.putNextEntry(new ZipEntry(str + file.getName()));
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = bufferedInputStream.read(bArr, 0, 8192);
                        if (read != -1) {
                            zipOutputStream.write(bArr, 0, read);
                        } else {
                            c.a(bufferedInputStream);
                            c.a(fileInputStream);
                            return;
                        }
                    }
                } catch (Exception e4) {
                    e2 = e4;
                    fileInputStream4 = bufferedInputStream;
                    fileInputStream5 = fileInputStream;
                    fileInputStream3 = fileInputStream4;
                    throw new RuntimeException(e2);
                } catch (Throwable th4) {
                    th = th4;
                    fileInputStream2 = bufferedInputStream;
                    fileInputStream5 = fileInputStream2;
                    c.a(fileInputStream5);
                    c.a(fileInputStream);
                    throw th;
                }
            } catch (Exception e5) {
                e2 = e5;
                fileInputStream3 = null;
                throw new RuntimeException(e2);
            } catch (Throwable th5) {
                th = th5;
                fileInputStream = null;
                c.a(fileInputStream5);
                c.a(fileInputStream);
                throw th;
            }
        }
    }

    private static void a(File file, ZipOutputStream zipOutputStream, String str) {
        if (file.isDirectory()) {
            b(file, zipOutputStream, str + file.getName() + File.separator);
            return;
        }
        System.out.println("compress：" + str + file.getName());
        c(file, zipOutputStream, str);
    }

    private static void a(ZipOutputStream zipOutputStream, File file, String str) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            zipOutputStream.putNextEntry(new ZipEntry(str + "/"));
            String str2 = str.length() == 0 ? "" : str + "/";
            for (int i2 = 0; i2 < listFiles.length; i2++) {
                a(zipOutputStream, listFiles[i2], str2 + listFiles[i2].getName());
            }
            return;
        }
        zipOutputStream.putNextEntry(new ZipEntry(str));
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            int read = fileInputStream.read();
            if (read != -1) {
                zipOutputStream.write(read);
            } else {
                return;
            }
        }
    }
}
