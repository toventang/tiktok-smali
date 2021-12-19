package com.bytedance.android.live.core.f;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import java.util.Locale;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static int f9119a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static int[] f9120b = {0, 0};

    /* renamed from: c  reason: collision with root package name */
    public static boolean f9121c;

    public static boolean f() {
        if (f9119a == 1) {
            return true;
        }
        return false;
    }

    public static int c() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    static {
        Covode.recordClassIndex(4672);
    }

    public static int b() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static Context e() {
        IHostContext iHostContext = (IHostContext) a.a(IHostContext.class);
        if (iHostContext != null) {
            return iHostContext.context();
        }
        return null;
    }

    public static Resources a() {
        Context e2 = e();
        if (e2 == null) {
            return null;
        }
        return e2.getResources();
    }

    public static final int d() {
        int identifier;
        Context e2 = e();
        if (e2 != null && (identifier = e2.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            return e2.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static boolean g() {
        boolean z;
        boolean z2;
        int i2 = Build.VERSION.SDK_INT;
        if (e() != null) {
            if ((e().getApplicationInfo().flags & 4194304) == 4194304) {
                z = true;
            } else {
                z = false;
            }
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z || !z2) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static int a(float f2) {
        return (int) ((f2 * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static float b(float f2) {
        return TypedValue.applyDimension(2, f2, Resources.getSystem().getDisplayMetrics());
    }

    public static float e(int i2) {
        return ((float) i2) / Resources.getSystem().getDisplayMetrics().density;
    }

    public static Drawable c(int i2) {
        Context e2 = e();
        if (e2 == null || e2.getResources() == null) {
            return null;
        }
        return e2.getResources().getDrawable(i2);
    }

    public static int d(int i2) {
        Context e2 = e();
        if (e2 == null || e2.getResources() == null) {
            return 0;
        }
        return (int) e2.getResources().getDimension(i2);
    }

    public static String[] f(int i2) {
        Context e2 = e();
        if (e2 == null) {
            return new String[0];
        }
        return e2.getResources().getStringArray(i2);
    }

    public static int b(int i2) {
        Context e2 = e();
        if (e2 == null || e2.getResources() == null) {
            return 0;
        }
        return e2.getResources().getColor(i2);
    }

    public static DisplayMetrics a(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        int i2 = Build.VERSION.SDK_INT;
        activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    public static String a(int i2) {
        Context e2 = e();
        if (e2 == null) {
            return null;
        }
        return e2.getString(i2);
    }

    public static int a(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return i2;
        }
        try {
            if (!str.startsWith("#")) {
                str = "#".concat(String.valueOf(str));
            }
            return Color.parseColor(str);
        } catch (IllegalArgumentException unused) {
            return i2;
        }
    }

    public static String a(int i2, int i3) {
        Context e2 = e();
        if (e2 == null) {
            return null;
        }
        return e2.getResources().getQuantityString(i2, i3);
    }

    public static String a(int i2, Object... objArr) {
        Context e2 = e();
        if (e2 == null) {
            return null;
        }
        return e2.getString(i2, objArr);
    }

    public static String a(int i2, int i3, Object... objArr) {
        Context e2 = e();
        if (e2 == null) {
            return null;
        }
        return e2.getResources().getQuantityString(i2, i3, objArr);
    }
}
