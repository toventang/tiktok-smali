package com.bytedance.android.livesdk.s;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.a;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public class g extends a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f21108a;

    /* renamed from: b  reason: collision with root package name */
    private final WindowManager.LayoutParams f21109b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f21110c = true;

    /* renamed from: e  reason: collision with root package name */
    public final WindowManager f21111e;

    /* renamed from: f  reason: collision with root package name */
    public View f21112f;

    /* renamed from: g  reason: collision with root package name */
    public int f21113g;

    /* renamed from: h  reason: collision with root package name */
    public int f21114h;

    static {
        Covode.recordClassIndex(12468);
    }

    private static void a(WindowManager windowManager, View view) {
        if (!((Boolean) a.a(windowManager, new Object[]{view}, 102801, "void", false, null).first).booleanValue()) {
            windowManager.removeView(view);
            a.a(null, windowManager, new Object[]{view}, 102801, "com_bytedance_android_livesdk_floatwindow_LiveFloatView_android_view_WindowManager_removeView(Landroid/view/WindowManager;Landroid/view/View;)V");
        }
    }

    @Override // com.bytedance.android.livesdk.s.a
    public final View d() {
        return this.f21112f;
    }

    public final void f() {
        if (!this.f21110c) {
            a(this.f21111e, this.f21112f);
            this.f21110c = true;
        }
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f21109b.type = 2038;
        } else {
            this.f21109b.type = 2002;
        }
        WindowManager windowManager = this.f21111e;
        View view = this.f21112f;
        WindowManager.LayoutParams layoutParams = this.f21109b;
        if (!((Boolean) a.a(windowManager, new Object[]{view, layoutParams}, 102800, "void", false, null).first).booleanValue()) {
            windowManager.addView(view, layoutParams);
            a.a(null, windowManager, new Object[]{view, layoutParams}, 102800, "com_bytedance_android_livesdk_floatwindow_LiveFloatView_android_view_WindowManager_addView(Landroid/view/WindowManager;Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V");
        }
        this.f21110c = false;
    }

    @Override // com.bytedance.android.livesdk.s.a
    public final void a(int i2) {
        if (!this.f21110c) {
            this.f21109b.x = i2;
            this.f21113g = i2;
            this.f21111e.updateViewLayout(this.f21112f, this.f21109b);
        }
    }

    @Override // com.bytedance.android.livesdk.s.a
    public final void b(int i2) {
        if (!this.f21110c) {
            this.f21109b.y = i2;
            this.f21114h = i2;
            this.f21111e.updateViewLayout(this.f21112f, this.f21109b);
        }
    }

    public g(Context context) {
        this.f21108a = context;
        this.f21111e = (WindowManager) a(context, "window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f21109b = layoutParams;
        layoutParams.format = 1;
        layoutParams.flags = 552;
        layoutParams.windowAnimations = 0;
    }

    public final void b(int i2, int i3) {
        this.f21109b.width = i2;
        this.f21109b.height = i3;
    }

    public final void c(int i2, int i3) {
        this.f21109b.width = i2;
        this.f21109b.height = i3;
        this.f21111e.updateViewLayout(this.f21112f, this.f21109b);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(9192);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
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
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(9192);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // com.bytedance.android.livesdk.s.a
    public final void a(int i2, int i3) {
        if (!this.f21110c) {
            this.f21109b.x = i2;
            this.f21113g = i2;
            this.f21109b.y = i3;
            this.f21114h = i3;
            this.f21111e.updateViewLayout(this.f21112f, this.f21109b);
        }
    }

    public final void a(int i2, int i3, int i4) {
        this.f21109b.gravity = i2;
        this.f21109b.x = i3;
        this.f21113g = i3;
        this.f21109b.y = i4;
        this.f21114h = i4;
    }
}
