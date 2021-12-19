package com.google.ar.core;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.ResourceExhaustedException;
import com.google.ar.core.exceptions.UnavailableApkTooOldException;
import com.google.ar.core.exceptions.UnavailableArcoreNotInstalledException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableSdkTooOldException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import java.util.HashMap;
import java.util.Map;

class ArCoreApkJniAdapter {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Class<? extends Throwable>, Integer> f53391a;

    ArCoreApkJniAdapter() {
    }

    static {
        Covode.recordClassIndex(32989);
        HashMap hashMap = new HashMap();
        f53391a = hashMap;
        hashMap.put(IllegalArgumentException.class, Integer.valueOf(g.ERROR_INVALID_ARGUMENT.G));
        hashMap.put(ResourceExhaustedException.class, Integer.valueOf(g.ERROR_RESOURCE_EXHAUSTED.G));
        hashMap.put(UnavailableArcoreNotInstalledException.class, Integer.valueOf(g.UNAVAILABLE_ARCORE_NOT_INSTALLED.G));
        hashMap.put(UnavailableDeviceNotCompatibleException.class, Integer.valueOf(g.UNAVAILABLE_DEVICE_NOT_COMPATIBLE.G));
        hashMap.put(UnavailableApkTooOldException.class, Integer.valueOf(g.UNAVAILABLE_APK_TOO_OLD.G));
        hashMap.put(UnavailableSdkTooOldException.class, Integer.valueOf(g.UNAVAILABLE_SDK_TOO_OLD.G));
        hashMap.put(UnavailableUserDeclinedInstallationException.class, Integer.valueOf(g.UNAVAILABLE_USER_DECLINED_INSTALLATION.G));
    }

    private static int a(Throwable th) {
        Class<?> cls = th.getClass();
        Map<Class<? extends Throwable>, Integer> map = f53391a;
        if (map.containsKey(cls)) {
            return map.get(cls).intValue();
        }
        return g.ERROR_FATAL.G;
    }

    static int checkAvailability(Context context) {
        try {
            return ArCoreApk.getInstance().checkAvailability(context).nativeCode;
        } catch (Throwable th) {
            a(th);
            return ArCoreApk.Availability.UNKNOWN_ERROR.nativeCode;
        }
    }

    static int requestInstall(Activity activity, boolean z, int[] iArr) {
        try {
            iArr[0] = ArCoreApk.getInstance().requestInstall(activity, z).nativeCode;
            return g.SUCCESS.G;
        } catch (Throwable th) {
            return a(th);
        }
    }

    static int requestInstallCustom(Activity activity, boolean z, int i2, int i3, int[] iArr) {
        try {
            iArr[0] = ArCoreApk.getInstance().requestInstall(activity, z, ArCoreApk.InstallBehavior.forNumber(i2), ArCoreApk.UserMessageType.forNumber(i3)).nativeCode;
            return g.SUCCESS.G;
        } catch (Throwable th) {
            return a(th);
        }
    }
}
