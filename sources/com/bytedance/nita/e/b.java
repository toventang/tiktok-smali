package com.bytedance.nita.e;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.lang.reflect.Field;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f41660a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static Field f41661b;

    private b() {
    }

    static {
        Covode.recordClassIndex(25492);
        try {
            f41661b = View.class.getDeclaredField("mContext");
        } catch (Exception e2) {
            e2.printStackTrace();
            f41661b = null;
        }
    }

    public static boolean a(Context context) {
        l.c(context, "");
        if (!(context instanceof e)) {
            return true;
        }
        int i2 = Build.VERSION.SDK_INT;
        e eVar = (e) context;
        if (eVar.isDestroyed() || eVar.isFinishing()) {
            return false;
        }
        return true;
    }

    public static void a(View view, Activity activity) {
        l.c(view, "");
        l.c(activity, "");
        System.currentTimeMillis();
        b(view, activity);
        System.currentTimeMillis();
    }

    private static void c(View view, Activity activity) {
        l.c(view, "");
        l.c(activity, "");
        try {
            Field field = f41661b;
            if (field != null) {
                field.setAccessible(true);
                field.set(view, activity);
                field.setAccessible(false);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static void b(View view, Activity activity) {
        MethodCollector.i(7878);
        synchronized (view) {
            try {
                if (!(view.getContext() instanceof Activity) || (!l.a(view.getContext(), activity))) {
                    c(view, activity);
                    if (view instanceof ViewGroup) {
                        int i2 = 0;
                        int childCount = ((ViewGroup) view).getChildCount() - 1;
                        if (childCount >= 0) {
                            while (true) {
                                View childAt = ((ViewGroup) view).getChildAt(i2);
                                l.a((Object) childAt, "");
                                b(childAt, activity);
                                if (i2 == childCount) {
                                    break;
                                }
                                i2++;
                            }
                        }
                    }
                }
            } finally {
                MethodCollector.o(7878);
            }
        }
    }
}
