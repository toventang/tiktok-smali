package com.ss.android.ad.splash.f;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public final class d {
    static {
        Covode.recordClassIndex(36470);
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long a(String str) {
        File file = new File(str);
        if (!file.exists() || !file.isFile()) {
            return 0;
        }
        return file.length() / 1024;
    }

    public static boolean c(String str) {
        if (!TextUtils.isEmpty(str) && new File(str).exists()) {
            return true;
        }
        return false;
    }

    public static long a(File file) {
        long j2 = 0;
        if (file == null) {
            return 0;
        }
        if (!file.isDirectory() || file.listFiles() == null) {
            return file.length() / 1024;
        }
        for (File file2 : file.listFiles()) {
            j2 += a(file2);
        }
        return j2;
    }

    public static String b(String str) {
        FileInputStream fileInputStream;
        Throwable th;
        MethodCollector.i(3639);
        File file = new File(str);
        String str2 = null;
        str2 = null;
        FileInputStream fileInputStream2 = null;
        if (!file.exists()) {
            MethodCollector.o(3639);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                str2 = a((InputStream) fileInputStream);
            } catch (Exception unused) {
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                a((Closeable) fileInputStream2);
                MethodCollector.o(3639);
                throw th;
            }
        } catch (Exception unused2) {
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            a((Closeable) fileInputStream2);
            MethodCollector.o(3639);
            throw th;
        }
        a((Closeable) fileInputStream);
        MethodCollector.o(3639);
        return str2;
    }

    private static String a(InputStream inputStream) {
        MethodCollector.i(3636);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine).append("\n");
            } catch (Exception e2) {
                g.e("Exception:".concat(String.valueOf(e2)));
            } catch (Throwable th) {
                a(bufferedReader);
                MethodCollector.o(3636);
                throw th;
            }
        }
        a(bufferedReader);
        String sb2 = sb.toString();
        MethodCollector.o(3636);
        return sb2;
    }

    public static void a(String str, String str2, String str3) {
        Throwable th;
        Exception e2;
        MethodCollector.i(3632);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            MethodCollector.o(3632);
            return;
        }
        File file = new File(str2);
        if (file.exists() || file.mkdir()) {
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(str2 + str3, false);
                try {
                    fileOutputStream2.write(str.getBytes());
                    fileOutputStream2.flush();
                    a(fileOutputStream2);
                } catch (Exception e3) {
                    e2 = e3;
                    fileOutputStream = fileOutputStream2;
                    try {
                        g.e("Exception:".concat(String.valueOf(e2)));
                        a(fileOutputStream);
                        MethodCollector.o(3632);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        a(fileOutputStream);
                        MethodCollector.o(3632);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                    a(fileOutputStream);
                    MethodCollector.o(3632);
                    throw th;
                }
            } catch (Exception e4) {
                e2 = e4;
                g.e("Exception:".concat(String.valueOf(e2)));
                a(fileOutputStream);
                MethodCollector.o(3632);
                return;
            }
            MethodCollector.o(3632);
            return;
        }
        MethodCollector.o(3632);
    }
}
