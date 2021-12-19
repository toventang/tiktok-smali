package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.h;
import com.google.android.gms.internal.g.g;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;

/* access modifiers changed from: package-private */
public final class l implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    final URL f54619a;

    /* renamed from: b  reason: collision with root package name */
    h<Bitmap> f54620b;

    /* renamed from: c  reason: collision with root package name */
    private volatile InputStream f54621c;

    static {
        Covode.recordClassIndex(33892);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            InputStream inputStream = this.f54621c;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    try {
                        g.f50605a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", (Throwable) e2);
                    } catch (IOException e3) {
                        throw new AssertionError(e3);
                    }
                }
            }
        } catch (NullPointerException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] a() {
        /*
        // Method dump skipped, instructions count: 180
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.l.a():byte[]");
    }

    private l(URL url) {
        this.f54619a = url;
    }

    public static l a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new l(new URL(str));
        } catch (MalformedURLException unused) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Not downloading image, bad URL: ".concat(valueOf);
            } else {
                new String("Not downloading image, bad URL: ");
            }
            return null;
        }
    }
}
