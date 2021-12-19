package com.ss.android.ugc.aweme.common.keyboard;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.utils.d.c;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class a {

    /* renamed from: c  reason: collision with root package name */
    private static final String f76459c = a.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    protected int f76460a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f76461b;

    /* renamed from: d  reason: collision with root package name */
    private int f76462d;

    /* renamed from: e  reason: collision with root package name */
    private long f76463e;

    /* renamed from: f  reason: collision with root package name */
    private List<c> f76464f;

    static {
        Covode.recordClassIndex(47206);
    }

    public final void b(c cVar) {
        List<c> list = this.f76464f;
        if (list != null) {
            list.remove(cVar);
        }
    }

    private boolean a(int i2) {
        int i3 = this.f76462d;
        if (i3 == 0) {
            this.f76462d = i2;
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

    public final void a(c cVar) {
        if (this.f76464f == null) {
            this.f76464f = new ArrayList();
        }
        this.f76464f.add(cVar);
    }

    /* access modifiers changed from: protected */
    public final boolean b(Context context, int i2) {
        if (!c.b()) {
            return false;
        }
        int a2 = a(context);
        if (i2 <= a2 && !a(a2)) {
            return false;
        }
        return true;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(4539);
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
                    MethodCollector.o(4539);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public void a(Context context, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        if (!b(context, size)) {
            int i3 = this.f76460a;
            if (i3 == 0) {
                this.f76460a = size;
            } else if (i3 != size) {
                int i4 = i3 - size;
                if (((float) Math.abs(i4)) >= n.b(context, 80.0f)) {
                    if (Build.VERSION.SDK_INT == 30) {
                        long nanoTime = System.nanoTime() / 1000000;
                        if (nanoTime - this.f76463e > 100) {
                            this.f76463e = nanoTime;
                        } else {
                            return;
                        }
                    }
                    if (i4 > 0) {
                        this.f76461b = true;
                    } else {
                        this.f76461b = false;
                    }
                    a(this.f76461b, Math.abs(i4));
                    this.f76460a = size;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z, int i2) {
        List<c> list = this.f76464f;
        if (list != null) {
            for (c cVar : list) {
                cVar.a(z, i2);
            }
        }
    }
}
