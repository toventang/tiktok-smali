package com.bytedance.scene.d;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Objects;

public final class k {
    static {
        Covode.recordClassIndex(26269);
    }

    public static Drawable a(Context context) {
        if (!(context instanceof Activity)) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842836, typedValue, true);
            if (typedValue.type < 28 || typedValue.type > 31) {
                return context.getResources().getDrawable(typedValue.resourceId);
            }
            return new ColorDrawable(typedValue.data);
        }
        throw new IllegalArgumentException("Use Scene Context instead");
    }

    public static void a(View view) {
        MethodCollector.i(1851);
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        MethodCollector.o(1851);
    }

    public static boolean a(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return false;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (activity.isDestroyed()) {
            return false;
        }
        return true;
    }

    public static <T> T a(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    public static String a(Context context, int i2) {
        try {
            return context.getResources().getResourceName(i2);
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i2);
        }
    }

    public static String a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(str2);
    }

    public static void a(FragmentManager fragmentManager, FragmentTransaction fragmentTransaction, boolean z) {
        if (Build.VERSION.SDK_INT < 24) {
            fragmentTransaction.commitAllowingStateLoss();
            if (z) {
                fragmentManager.executePendingTransactions();
            }
        } else if (z) {
            fragmentTransaction.commitNowAllowingStateLoss();
        } else {
            fragmentTransaction.commitAllowingStateLoss();
        }
    }
}
