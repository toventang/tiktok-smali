package com.bytedance.android.live.common.keyboard;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.android.livesdk.utils.ap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.deviceregister.d.d;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.List;

public class a {

    /* renamed from: d  reason: collision with root package name */
    private static final String f8825d = a.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    protected int f8826a;

    /* renamed from: b  reason: collision with root package name */
    public List<c> f8827b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8828c;

    /* renamed from: e  reason: collision with root package name */
    private int f8829e;

    static {
        Covode.recordClassIndex(4515);
    }

    private boolean a(int i2) {
        int i3 = this.f8829e;
        if (i3 == 0) {
            this.f8829e = i2;
            return false;
        } else if (i3 != i2) {
            return true;
        } else {
            return false;
        }
    }

    private static int a(Context context) {
        Point point = new Point();
        ((WindowManager) a(context, "window")).getDefaultDisplay().getSize(point);
        return point.y;
    }

    /* access modifiers changed from: protected */
    public final boolean b(Context context, int i2) {
        if (!d.a()) {
            return false;
        }
        int a2 = a(context);
        if (i2 <= a2 && !a(a2)) {
            return false;
        }
        return true;
    }

    public void a(Context context, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        if (!b(context, size)) {
            int i3 = this.f8826a;
            if (i3 == 0) {
                this.f8826a = size;
            } else if (i3 != size) {
                int i4 = i3 - size;
                if (((float) Math.abs(i4)) >= ap.a(context, 80.0f)) {
                    if (i4 > 0) {
                        this.f8828c = true;
                    } else {
                        this.f8828c = false;
                    }
                    a(this.f8828c, Math.abs(i4));
                    this.f8826a = size;
                }
            }
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(12378);
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
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(12378);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z, int i2) {
        List<c> list = this.f8827b;
        if (list != null) {
            for (c cVar : list) {
                cVar.a(z, i2);
            }
        }
    }
}
