package com.facebook.common.d;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final Logger f47069a = Logger.getLogger(b.class.getName());

    private b() {
    }

    static {
        Covode.recordClassIndex(28630);
    }

    public static void a(InputStream inputStream) {
        try {
            a((Closeable) inputStream);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                f47069a.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e2);
            }
        }
    }
}
