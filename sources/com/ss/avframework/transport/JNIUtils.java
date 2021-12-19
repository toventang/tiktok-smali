package com.ss.avframework.transport;

import com.bytedance.covode.number.Covode;

public class JNIUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static ClassLoader sJniClassLoader;
    private static Boolean sSelectiveJniRegistrationEnabled;

    static {
        Covode.recordClassIndex(100569);
    }

    public static void enableSelectiveJniRegistration() {
        sSelectiveJniRegistrationEnabled = true;
    }

    public static Object getClassLoader() {
        ClassLoader classLoader = sJniClassLoader;
        if (classLoader == null) {
            return JNIUtils.class.getClassLoader();
        }
        return classLoader;
    }

    public static boolean isSelectiveJniRegistrationEnabled() {
        if (sSelectiveJniRegistrationEnabled == null) {
            sSelectiveJniRegistrationEnabled = false;
        }
        return sSelectiveJniRegistrationEnabled.booleanValue();
    }

    public static void setClassLoader(ClassLoader classLoader) {
        sJniClassLoader = classLoader;
    }
}
