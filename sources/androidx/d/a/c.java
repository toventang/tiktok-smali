package androidx.d.a;

import android.content.ClipboardManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public abstract class c extends a {

    /* renamed from: a  reason: collision with root package name */
    private LayoutInflater f2680a;

    /* renamed from: k  reason: collision with root package name */
    public int f2681k;

    /* renamed from: l  reason: collision with root package name */
    public int f2682l;

    static {
        Covode.recordClassIndex(922);
    }

    public c(Context context, int i2) {
        super(context);
        this.f2682l = i2;
        this.f2681k = i2;
        this.f2680a = (LayoutInflater) a(context, "layout_inflater");
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

    @Override // androidx.d.a.a
    public View a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return a.a(this.f2680a, this.f2681k, viewGroup, false);
    }

    @Override // androidx.d.a.a
    public final View b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return a.a(this.f2680a, this.f2682l, viewGroup, false);
    }
}
