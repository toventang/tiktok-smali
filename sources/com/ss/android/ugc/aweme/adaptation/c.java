package com.ss.android.ugc.aweme.adaptation;

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
import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.common.util.f;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f66191a;

    /* renamed from: b  reason: collision with root package name */
    public static int f66192b = 49;

    /* renamed from: c  reason: collision with root package name */
    public static final int f66193c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f66194d = com.bytedance.ies.abmock.b.a().a(true, "enable_full_screen_read_adaption", true);

    /* renamed from: e  reason: collision with root package name */
    public static final int f66195e;

    /* renamed from: f  reason: collision with root package name */
    public static final int f66196f = n.a(8.0d);

    /* renamed from: m  reason: collision with root package name */
    public static int f66197m;
    public static int n;
    static final t<Integer> o;
    public static LiveData<Integer> p;
    private static int u = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f66198g;

    /* renamed from: h  reason: collision with root package name */
    public int f66199h;

    /* renamed from: i  reason: collision with root package name */
    public int f66200i;

    /* renamed from: j  reason: collision with root package name */
    public int f66201j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f66202k;

    /* renamed from: l  reason: collision with root package name */
    public a f66203l;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;

    /* renamed from: com.ss.android.ugc.aweme.adaptation.c$c  reason: collision with other inner class name */
    public interface AbstractC1481c {
        static {
            Covode.recordClassIndex(40698);
        }

        void d();
    }

    public interface d {
        static {
            Covode.recordClassIndex(40699);
        }

        void a();
    }

    public interface e {
        static {
            Covode.recordClassIndex(40700);
        }

        void bm_();
    }

    static boolean b() {
        int i2 = Build.VERSION.SDK_INT;
        return true;
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static c f66221a = new c((byte) 0);

        static {
            Covode.recordClassIndex(40697);
        }
    }

    private c() {
        this.f66203l = new a();
    }

    public static int a() {
        double d2;
        if (f66194d) {
            d2 = (double) f66193c;
        } else {
            d2 = 47.0d;
        }
        return n.a(d2);
    }

    static {
        boolean z;
        int i2;
        Covode.recordClassIndex(40694);
        Display defaultDisplay = ((WindowManager) a(com.bytedance.ies.ugc.appcontext.d.a(), "window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (b()) {
            try {
                defaultDisplay.getRealMetrics(displayMetrics);
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            }
        } else {
            defaultDisplay.getMetrics(displayMetrics);
        }
        if (((int) (((float) displayMetrics.heightPixels) / displayMetrics.density)) <= 640) {
            z = true;
        } else {
            z = false;
        }
        f66191a = z;
        if (z) {
            i2 = f66192b;
        } else {
            i2 = 58;
        }
        f66193c = i2;
        f66195e = n.a((double) (i2 - 47));
        t<Integer> tVar = new t<>();
        o = tVar;
        p = tVar;
    }

    /* synthetic */ c(byte b2) {
        this();
    }

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f66215a;

        /* renamed from: b  reason: collision with root package name */
        public int f66216b;

        /* renamed from: c  reason: collision with root package name */
        public int f66217c;

        /* renamed from: d  reason: collision with root package name */
        public int f66218d;

        /* renamed from: e  reason: collision with root package name */
        public Rect f66219e;

        static {
            Covode.recordClassIndex(40696);
        }

        public a() {
        }
    }

    public static int d(Context context) {
        if (f.a()) {
            return c(context);
        }
        return com.bytedance.common.utility.n.e(context);
    }

    public static boolean b(Context context) {
        if (!f.a()) {
            return false;
        }
        if (context == null || Settings.Secure.getInt(context.getContentResolver(), "display_notch_status", 0) == 0) {
            return true;
        }
        return false;
    }

    public static int c(Context context) {
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
        WindowManager windowManager = (WindowManager) a(com.bytedance.ies.ugc.appcontext.d.a(), "window");
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

    public static boolean a(Context context) {
        if (context == null || !b() || Settings.Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0) != 1) {
            return false;
        }
        return true;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(2275);
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
                    MethodCollector.o(2275);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static void a(View view, View view2, View view3) {
        a(2, view, view2, view3, false, null);
    }

    public static void a(int i2, View view, View view2, View view3, boolean z, d dVar) {
        if (f66194d && view != null && view2 != null) {
            com.ss.android.b.a.a.a.b(new f(i2, view2, view, z, view3, dVar));
        }
    }
}
