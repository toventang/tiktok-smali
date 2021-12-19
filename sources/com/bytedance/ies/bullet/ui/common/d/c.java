package com.bytedance.ies.bullet.ui.common.d;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import h.w;
import java.lang.reflect.Field;

public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static final a f33095c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f33096a;

    /* renamed from: b  reason: collision with root package name */
    public ViewTreeObserver.OnGlobalLayoutListener f33097b;

    static {
        Covode.recordClassIndex(19762);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(19763);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f33098a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f33099b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Rect f33100c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f33101d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ View f33102e;

        static {
            Covode.recordClassIndex(19764);
        }

        public b(c cVar, View view, Rect rect, int i2, View view2) {
            this.f33098a = cVar;
            this.f33099b = view;
            this.f33100c = rect;
            this.f33101d = i2;
            this.f33102e = view2;
        }

        public final void onGlobalLayout() {
            this.f33099b.getWindowVisibleDisplayFrame(this.f33100c);
            if (this.f33098a.f33096a == 0) {
                this.f33098a.f33096a = this.f33100c.bottom;
            }
            if (this.f33098a.f33096a != this.f33100c.bottom && this.f33101d == 1) {
                int max = Math.max(0, this.f33098a.f33096a - this.f33100c.bottom);
                ViewGroup.LayoutParams layoutParams = this.f33102e.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = max;
                    this.f33102e.setLayoutParams(marginLayoutParams);
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            }
            this.f33098a.f33096a = this.f33100c.bottom;
        }
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(12042);
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
                            com.bytedance.crash.c.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(12042);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
