package com.ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public final class dh {

    /* renamed from: a  reason: collision with root package name */
    static boolean f142821a = false;

    /* renamed from: b  reason: collision with root package name */
    private static Map<String, Field> f142822b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private static Map<String, Method> f142823c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private static Map<String, Constructor> f142824d = new HashMap();

    static {
        Covode.recordClassIndex(93433);
    }

    static <T> void a(T t, String str) {
        if (t == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static Field a(Class<?> cls, String str) {
        Field field;
        MethodCollector.i(6379);
        a((Object) cls, "The class must not be null !!!");
        if (!TextUtils.isEmpty(str)) {
            String str2 = cls.getName() + "#" + str;
            synchronized (f142822b) {
                try {
                    field = f142822b.get(str2);
                } finally {
                    MethodCollector.o(6379);
                }
            }
            if (field != null) {
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                return field;
            }
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (declaredField != null && !declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                if (declaredField != null) {
                    synchronized (f142822b) {
                        try {
                            f142822b.put(str2, declaredField);
                        } finally {
                            MethodCollector.o(6379);
                        }
                    }
                }
                return declaredField;
            } catch (Throwable unused) {
                MethodCollector.o(6379);
                return null;
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The field name must not be blank !!!");
            MethodCollector.o(6379);
            throw illegalArgumentException;
        }
    }
}
