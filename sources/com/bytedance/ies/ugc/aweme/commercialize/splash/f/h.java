package com.bytedance.ies.ugc.aweme.commercialize.splash.f;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.app.b.a;
import com.ss.android.ugc.aweme.lancet.c.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f34784a = new h();

    private h() {
    }

    static {
        Covode.recordClassIndex(20869);
    }

    public static boolean b(Activity activity) {
        Bundle bundle;
        try {
            activity.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil").getMethod("hasNotchInScreen", new Class[0]);
            try {
                ApplicationInfo a2 = a(activity.getPackageManager(), activity.getPackageName());
                l.b(a2, "");
                if (a2 == null || (bundle = a2.metaData) == null || a(bundle, "android.notch_support") == null) {
                    return false;
                }
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        } catch (Exception unused2) {
            return d(activity);
        }
    }

    public static boolean c(Activity activity) {
        Bundle bundle;
        if (a.a("ro.miui.notch", activity) != 1) {
            return d(activity);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        try {
            ApplicationInfo a2 = a(activity.getPackageManager(), activity.getPackageName());
            l.b(a2, "");
            if (a2 == null || (bundle = a2.metaData) == null || a(bundle, "notch.config") == null) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean d(Activity activity) {
        if (Build.VERSION.SDK_INT < 28) {
            return true;
        }
        Window window = activity.getWindow();
        l.b(window, "");
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (attributes.layoutInDisplayCutoutMode == 1) {
            return true;
        }
        if (attributes.layoutInDisplayCutoutMode != 0 || e(activity)) {
            return false;
        }
        return true;
    }

    private static boolean e(Activity activity) {
        TypedValue typedValue = new TypedValue();
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(R.style.mc, new int[]{16843277});
        l.b(obtainStyledAttributes, "");
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.getValue(0, typedValue);
            obtainStyledAttributes.recycle();
        }
        if (typedValue.type != 18 || typedValue.data == 0) {
            return false;
        }
        return true;
    }

    public static boolean a(Activity activity) {
        Bundle bundle;
        if (!activity.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism")) {
            return d(activity);
        }
        try {
            ApplicationInfo a2 = a(activity.getPackageManager(), activity.getPackageName());
            l.b(a2, "");
            if (a2 == null || (bundle = a2.metaData) == null || a(bundle, "android.max_aspect") == null) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    private static ApplicationInfo a(PackageManager packageManager, String str) {
        if (!TextUtils.equals(str, d.a().getPackageName())) {
            return packageManager.getApplicationInfo(str, 128);
        }
        if (b.f107191a == null) {
            b.f107191a = packageManager.getApplicationInfo(str, 128);
        }
        return b.f107191a;
    }
}
