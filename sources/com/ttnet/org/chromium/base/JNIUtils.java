package com.ttnet.org.chromium.base;

import com.bytedance.covode.number.Covode;

public class JNIUtils {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f155150a = true;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f155151b;

    /* renamed from: c  reason: collision with root package name */
    private static ClassLoader f155152c;

    static {
        Covode.recordClassIndex(103263);
    }

    public static Object getClassLoader() {
        ClassLoader classLoader = f155152c;
        if (classLoader == null) {
            return JNIUtils.class.getClassLoader();
        }
        return classLoader;
    }

    public static boolean isSelectiveJniRegistrationEnabled() {
        if (f155151b == null) {
            f155151b = false;
        }
        return f155151b.booleanValue();
    }
}
