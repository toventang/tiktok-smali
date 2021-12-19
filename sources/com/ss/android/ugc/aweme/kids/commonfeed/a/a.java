package com.ss.android.ugc.aweme.kids.commonfeed.a;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.common.util.f;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f105956a = n.a(11.0d);

    /* renamed from: b  reason: collision with root package name */
    public static final int f105957b = n.a(8.0d);

    /* renamed from: h  reason: collision with root package name */
    static int f105958h;

    /* renamed from: i  reason: collision with root package name */
    static int f105959i;
    private static int n = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f105960c;

    /* renamed from: d  reason: collision with root package name */
    public int f105961d;

    /* renamed from: e  reason: collision with root package name */
    public int f105962e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f105963f;

    /* renamed from: g  reason: collision with root package name */
    public d f105964g;

    /* renamed from: j  reason: collision with root package name */
    public boolean f105965j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f105966k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f105967l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f105968m;

    public interface b {
        static {
            Covode.recordClassIndex(67806);
        }
    }

    static boolean a() {
        int i2 = Build.VERSION.SDK_INT;
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.a.a$a  reason: collision with other inner class name */
    public static class C2699a {

        /* renamed from: a  reason: collision with root package name */
        public static a f105969a = new a((byte) 0);

        static {
            Covode.recordClassIndex(67805);
        }
    }

    private a() {
        this.f105964g = new d();
    }

    static {
        Covode.recordClassIndex(67804);
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public static boolean a(Context context) {
        if (context == null || !a() || Settings.Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0) != 1) {
            return false;
        }
        return true;
    }

    public static int b(Context context) {
        if (!f.a()) {
            return 0;
        }
        int[] iArr = {0, 0};
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((int[]) loadClass.getMethod("getNotchSize", new Class[0]).invoke(loadClass, new Object[0]))[1];
        } catch (Throwable unused) {
            return iArr[1];
        }
    }

    public static int a(Activity activity) {
        int i2;
        WindowManager windowManager = (WindowManager) a(d.a(), "window");
        if (windowManager == null) {
            return 0;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            int i3 = displayMetrics.heightPixels;
            if (activity == null || !TextUtils.equals("OnePlus", Build.BRAND)) {
                i2 = defaultDisplay.getHeight();
            } else {
                View decorView = activity.getWindow().getDecorView();
                Rect rect = new Rect();
                decorView.getWindowVisibleDisplayFrame(rect);
                i2 = rect.bottom;
            }
            return i3 - i2;
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return 0;
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(7907);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(7907);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
