package com.bytedance.android.live.core.f;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.e;
import com.bytedance.android.live.core.f.b.a;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class d {
    static {
        Covode.recordClassIndex(4637);
    }

    public static boolean a(Context context) {
        if (b(context) || new a(context).f9052a || c(context)) {
            return true;
        }
        return false;
    }

    private static boolean c(Context context) {
        String string;
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
            if (identifier <= 0 || (string = resources.getString(identifier)) == null || TextUtils.isEmpty(string)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }

    private static boolean b(Context context) {
        e a2 = p.a(context);
        if (a2 == null || Build.VERSION.SDK_INT < 28) {
            return false;
        }
        View decorView = a2.getWindow().getDecorView();
        try {
            Object invoke = decorView.getClass().getMethod("getRootWindowInsets", new Class[0]).invoke(decorView, new Object[0]);
            Object invoke2 = invoke.getClass().getDeclaredMethod("getDisplayCutout", new Class[0]).invoke(invoke, new Object[0]);
            List list = (List) invoke2.getClass().getMethod("getBoundingRects", new Class[0]).invoke(invoke2, new Object[0]);
            if (list == null || list.size() <= 0) {
                return false;
            }
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }
}
