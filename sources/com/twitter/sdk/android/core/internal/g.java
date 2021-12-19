package com.twitter.sdk.android.core.internal;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.twitter.sdk.android.core.k;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f155965a;

    static {
        Covode.recordClassIndex(103633);
    }

    public static void a(Context context) {
        if (b(context)) {
            k.c().e();
        }
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                k.c().a();
            }
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    private static boolean b(Context context) {
        if (f155965a == null) {
            f155965a = Boolean.valueOf(a(context, "com.twitter.sdk.android.TRACE_ENABLED", false));
        }
        return f155965a.booleanValue();
    }

    public static void b(Context context, String str) {
        if (b(context)) {
            k.c().d();
        }
    }

    public static void a(Context context, String str) {
        if (b(context)) {
            k.c().b();
        }
    }

    public static void a(String str, String str2) {
        if (!k.b()) {
            k.c().c();
            return;
        }
        throw new IllegalStateException(str2);
    }

    public static String a(Context context, String str, String str2) {
        Resources resources;
        int b2;
        if (context == null || (resources = context.getResources()) == null || (b2 = b(context, str, "string")) <= 0) {
            return str2;
        }
        return resources.getString(b2);
    }

    private static int b(Context context, String str, String str2) {
        String packageName;
        Resources resources = context.getResources();
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        int i2 = applicationContext.getApplicationInfo().icon;
        if (i2 > 0) {
            packageName = context.getResources().getResourcePackageName(i2);
        } else {
            packageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, packageName);
    }

    public static void a(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        MethodCollector.i(11027);
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                MethodCollector.o(11027);
                return;
            }
        }
    }

    public static boolean a(Context context, String str, boolean z) {
        Resources resources;
        if (!(context == null || (resources = context.getResources()) == null)) {
            int b2 = b(context, str, "bool");
            if (b2 > 0) {
                return resources.getBoolean(b2);
            }
            int b3 = b(context, str, "string");
            if (b3 > 0) {
                return Boolean.parseBoolean(context.getString(b3));
            }
        }
        return z;
    }
}
