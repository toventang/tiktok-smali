package com.bytedance.crash.g;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.runtime.q;
import com.bytedance.crash.util.j;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.UUID;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile UUID f27589a;

    /* renamed from: b  reason: collision with root package name */
    private static String f27590b = "";

    static {
        Covode.recordClassIndex(16197);
    }

    public static synchronized String a(Context context) {
        String str;
        synchronized (a.class) {
            MethodCollector.i(9982);
            if (TextUtils.isEmpty(f27590b)) {
                new a(context);
                UUID uuid = f27589a;
                if (uuid != null) {
                    f27590b = uuid.toString();
                }
            }
            str = f27590b;
            MethodCollector.o(9982);
        }
        return str;
    }

    private a(Context context) {
        String string;
        MethodCollector.i(10304);
        if (f27589a == null) {
            synchronized (a.class) {
                try {
                    if (f27589a == null) {
                        String c2 = q.a().c();
                        if (!TextUtils.isEmpty(c2)) {
                            try {
                                f27589a = UUID.fromString(c2);
                            } catch (Throwable unused) {
                                f27589a = UUID.randomUUID();
                            }
                        } else {
                            try {
                                string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                            } catch (Throwable unused2) {
                            }
                            if (string != null) {
                                try {
                                    f27589a = UUID.nameUUIDFromBytes(string.getBytes("utf8"));
                                } catch (Throwable unused3) {
                                    f27589a = UUID.randomUUID();
                                }
                            } else {
                                f27589a = UUID.randomUUID();
                            }
                            q a2 = q.a();
                            try {
                                j.a(a2.f27943c, String.valueOf(f27589a), false);
                            } catch (Throwable unused4) {
                            }
                        }
                    }
                } finally {
                    MethodCollector.o(10304);
                }
            }
            return;
        }
        MethodCollector.o(10304);
    }
}
