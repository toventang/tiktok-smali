package com.ss.android.ugc.aweme.story.h.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class a {
    static {
        Covode.recordClassIndex(90141);
    }

    public static FileInputStream a(File file) {
        FileInputStream fileInputStream;
        MethodCollector.i(2689);
        try {
            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException unused) {
            fileInputStream = null;
        }
        MethodCollector.o(2689);
        return fileInputStream;
    }

    private static boolean a(Closeable closeable) {
        if (closeable == null) {
            return false;
        }
        try {
            closeable.close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        MethodCollector.i(2691);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        if (inputStream != null) {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream(524288);
                try {
                    byte[] bArr = new byte[524288];
                    if (!(inputStream instanceof BufferedInputStream)) {
                        inputStream = new BufferedInputStream(inputStream, 524288);
                    }
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(byteArrayOutputStream, 524288);
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        bufferedOutputStream.write(bArr, 0, read);
                        bufferedOutputStream.flush();
                    }
                } catch (IOException e2) {
                    MethodCollector.o(2691);
                    throw e2;
                } catch (Throwable th2) {
                    a((Closeable) inputStream);
                    MethodCollector.o(2691);
                    throw th2;
                }
                try {
                    a((Closeable) inputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    a(byteArrayOutputStream);
                    MethodCollector.o(2691);
                    return byteArray;
                } catch (IOException unused) {
                    a(byteArrayOutputStream);
                    MethodCollector.o(2691);
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    a(byteArrayOutputStream2);
                    MethodCollector.o(2691);
                    throw th;
                }
            } catch (IOException unused2) {
                byteArrayOutputStream = null;
                a(byteArrayOutputStream);
                MethodCollector.o(2691);
                return null;
            } catch (Throwable th4) {
                th = th4;
                a(byteArrayOutputStream2);
                MethodCollector.o(2691);
                throw th;
            }
        }
        MethodCollector.o(2691);
        return null;
    }
}
