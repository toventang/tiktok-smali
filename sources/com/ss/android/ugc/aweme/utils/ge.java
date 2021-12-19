package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import c.d.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.video.e;
import h.e.c;
import h.f.b.l;
import h.m.p;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public final class ge {

    /* renamed from: a  reason: collision with root package name */
    public static final ge f142986a = new ge();

    private ge() {
    }

    static {
        Covode.recordClassIndex(93569);
    }

    private static String a(Uri uri) {
        String path;
        if (uri == null || (path = uri.getPath()) == null) {
            return null;
        }
        l.b(path, "");
        int b2 = p.b((CharSequence) path, '/');
        if (b2 == -1) {
            return null;
        }
        Objects.requireNonNull(path, "null cannot be cast to non-null type java.lang.String");
        String substring = path.substring(b2 + 1);
        l.b(substring, "");
        return substring;
    }

    private static String b(Context context, Uri uri) {
        String a2 = a.a(context, uri);
        com.ss.android.ugc.aweme.framework.a.a.a("SystemShareActivity getDataColumn convertUriToPath = ".concat(String.valueOf(a2)));
        if (a2 == null || a2.length() == 0) {
            return c(context, uri);
        }
        return a2;
    }

    private static String c(Context context, Uri uri) {
        String a2 = a(uri);
        com.ss.android.ugc.aweme.framework.a.a.a("SystemShareActivity getFilePathFromURI fileName = ".concat(String.valueOf(a2)));
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        if (!e.b(com.ss.android.ugc.aweme.share.c.a.f123421e)) {
            e.a(com.ss.android.ugc.aweme.share.c.a.f123421e, false);
        }
        File file = new File(com.ss.android.ugc.aweme.share.c.a.f123421e + File.separator + a2);
        a(context, uri, file);
        return file.getAbsolutePath();
    }

    private static void a(InputStream inputStream, FileOutputStream fileOutputStream) {
        MethodCollector.i(13281);
        l.d(inputStream, "");
        l.d(fileOutputStream, "");
        byte[] bArr = new byte[2048];
        try {
            InputStream inputStream2 = inputStream;
            try {
                FileOutputStream fileOutputStream2 = fileOutputStream;
                while (true) {
                    int read = inputStream2.read(bArr);
                    if (read > 0) {
                        fileOutputStream2.write(bArr, 0, read);
                    } else {
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                        c.a(fileOutputStream, null);
                        c.a(inputStream, null);
                        inputStream.close();
                        MethodCollector.o(13281);
                        return;
                    }
                }
            } catch (Throwable th) {
                c.a(fileOutputStream, th);
                MethodCollector.o(13281);
                throw th;
            }
        } catch (Throwable th2) {
            c.a(inputStream, th);
            MethodCollector.o(13281);
            throw th2;
        }
    }

    public final String a(Context context, Uri uri) {
        l.d(context, "");
        l.d(uri, "");
        if (p.a("content", uri.getScheme(), true)) {
            return b(context, uri);
        }
        if (p.a("file", uri.getScheme(), true)) {
            return uri.getPath();
        }
        return null;
    }

    private static void a(Context context, Uri uri, File file) {
        MethodCollector.i(13206);
        l.d(context, "");
        l.d(file, "");
        if (uri != null) {
            try {
                InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                if (openInputStream == null) {
                    MethodCollector.o(13206);
                    return;
                }
                l.b(openInputStream, "");
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                a(openInputStream, fileOutputStream);
                openInputStream.close();
                fileOutputStream.close();
                MethodCollector.o(13206);
            } catch (IOException e2) {
                e2.printStackTrace();
                MethodCollector.o(13206);
            }
        } else {
            MethodCollector.o(13206);
        }
    }
}
