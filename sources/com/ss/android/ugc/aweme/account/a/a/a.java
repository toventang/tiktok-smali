package com.ss.android.ugc.aweme.account.a.a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(38508);
    }

    public static boolean a() {
        if (!TextUtils.equals("vivo", Build.BRAND.toLowerCase())) {
            return false;
        }
        try {
            Class<?> cls = Class.forName("android.util.FtFeature");
            return ((Boolean) cls.getDeclaredMethod("isFeatureSupport", Integer.TYPE).invoke(cls, 32)).booleanValue();
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean a(Context context) {
        if (!TextUtils.equals("huawei", Build.BRAND.toLowerCase())) {
            return false;
        }
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
        } catch (ClassNotFoundException | Exception | NoSuchMethodException unused) {
            return false;
        }
    }
}
