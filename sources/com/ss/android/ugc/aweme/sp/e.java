package com.ss.android.ugc.aweme.sp;

import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.Executor;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static Field f133993a;

    /* renamed from: b  reason: collision with root package name */
    public static Field f133994b;

    /* renamed from: c  reason: collision with root package name */
    public static Class f133995c;

    /* renamed from: d  reason: collision with root package name */
    public static Class f133996d;

    /* renamed from: e  reason: collision with root package name */
    static volatile Executor f133997e = null;

    /* renamed from: f  reason: collision with root package name */
    private static volatile Executor f133998f = null;

    static {
        Covode.recordClassIndex(87666);
        try {
            Class<?> cls = Class.forName("android.content.ContextWrapper");
            f133995c = cls;
            f133993a = cls.getDeclaredField("mBase");
        } catch (Throwable unused) {
        }
        try {
            Class<?> cls2 = Class.forName("android.content.ContextImpl");
            f133996d = cls2;
            f133994b = cls2.getDeclaredField("mSharedPrefsPaths");
        } catch (Throwable unused2) {
        }
    }

    public static Context a(Context context) {
        Field field = f133993a;
        if (field == null) {
            return null;
        }
        try {
            if (context instanceof ContextWrapper) {
                return (Context) field.get(context);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static Map<String, File> b(Context context) {
        Field field = f133994b;
        if (field == null) {
            return null;
        }
        try {
            if (context instanceof ContextWrapper) {
                return (Map) field.get(context);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    static Executor a(int i2) {
        if (f133998f == null) {
            l.a a2 = l.a(o.FIXED);
            a2.f79173b = "SharedPreferencesImpl-load";
            a2.f79174c = i2;
            f133998f = g.a(a2.a());
        }
        return f133998f;
    }
}
