package androidx.appcompat.view.menu;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.o;
import androidx.core.h.e;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;

public class n {

    /* renamed from: a  reason: collision with root package name */
    public View f1251a;

    /* renamed from: b  reason: collision with root package name */
    public int f1252b;

    /* renamed from: c  reason: collision with root package name */
    public PopupWindow.OnDismissListener f1253c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f1254d;

    /* renamed from: e  reason: collision with root package name */
    private final h f1255e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f1256f;

    /* renamed from: g  reason: collision with root package name */
    private final int f1257g;

    /* renamed from: h  reason: collision with root package name */
    private final int f1258h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1259i;

    /* renamed from: j  reason: collision with root package name */
    private o.a f1260j;

    /* renamed from: k  reason: collision with root package name */
    private m f1261k;

    /* renamed from: l  reason: collision with root package name */
    private final PopupWindow.OnDismissListener f1262l;

    static {
        Covode.recordClassIndex(353);
    }

    public final void c() {
        if (e()) {
            this.f1261k.d();
        }
    }

    public void d() {
        this.f1261k = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1253c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final boolean e() {
        m mVar = this.f1261k;
        if (mVar == null || !mVar.e()) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        if (e()) {
            return true;
        }
        if (this.f1251a == null) {
            return false;
        }
        a(0, 0, false, false);
        return true;
    }

    public final m a() {
        m tVar;
        if (this.f1261k == null) {
            Display defaultDisplay = ((WindowManager) a(this.f1254d, "window")).getDefaultDisplay();
            Point point = new Point();
            int i2 = Build.VERSION.SDK_INT;
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= this.f1254d.getResources().getDimensionPixelSize(R.dimen.z)) {
                tVar = new e(this.f1254d, this.f1251a, this.f1257g, this.f1258h, this.f1256f);
            } else {
                tVar = new t(this.f1254d, this.f1255e, this.f1251a, this.f1257g, this.f1258h, this.f1256f);
            }
            tVar.a(this.f1255e);
            tVar.a(this.f1262l);
            tVar.a(this.f1251a);
            tVar.a(this.f1260j);
            tVar.b(this.f1259i);
            tVar.a(this.f1252b);
            this.f1261k = tVar;
        }
        return this.f1261k;
    }

    public final void a(o.a aVar) {
        this.f1260j = aVar;
        m mVar = this.f1261k;
        if (mVar != null) {
            mVar.a(aVar);
        }
    }

    public final void a(boolean z) {
        this.f1259i = z;
        m mVar = this.f1261k;
        if (mVar != null) {
            mVar.b(z);
        }
    }

    private static Object a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!i.f107219a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                    } catch (Exception e2) {
                        d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                i.f107219a = false;
            }
            return systemService;
        }
    }

    public n(Context context, h hVar, View view, boolean z) {
        this(context, hVar, view, z, R.attr.hq, 0);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3, boolean z, boolean z2) {
        m a2 = a();
        a2.c(z2);
        if (z) {
            if ((e.a(this.f1252b, v.e(this.f1251a)) & 7) == 5) {
                i2 -= this.f1251a.getWidth();
            }
            a2.b(i2);
            a2.c(i3);
            int i4 = (int) ((this.f1254d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f1250g = new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4);
        }
        a2.c();
    }

    public n(Context context, h hVar, View view, boolean z, int i2, int i3) {
        this.f1252b = 8388611;
        this.f1262l = new PopupWindow.OnDismissListener() {
            /* class androidx.appcompat.view.menu.n.AnonymousClass1 */

            static {
                Covode.recordClassIndex(354);
            }

            public final void onDismiss() {
                n.this.d();
            }
        };
        this.f1254d = context;
        this.f1255e = hVar;
        this.f1251a = view;
        this.f1256f = z;
        this.f1257g = i2;
        this.f1258h = i3;
    }
}
