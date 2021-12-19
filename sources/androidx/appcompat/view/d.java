package androidx.appcompat.view;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;

public final class d extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public int f1066a;

    /* renamed from: b  reason: collision with root package name */
    private Resources.Theme f1067b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f1068c;

    /* renamed from: d  reason: collision with root package name */
    private Configuration f1069d;

    /* renamed from: e  reason: collision with root package name */
    private Resources f1070e;

    static {
        Covode.recordClassIndex(311);
    }

    public d() {
        super(null);
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f1067b;
        if (theme != null) {
            return theme;
        }
        if (this.f1066a == 0) {
            this.f1066a = R.style.l6;
        }
        a();
        return this.f1067b;
    }

    private void a() {
        if (this.f1067b == null) {
            this.f1067b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1067b.setTo(theme);
            }
        }
        this.f1067b.applyStyle(this.f1066a, true);
    }

    public final Resources getResources() {
        if (this.f1070e == null) {
            if (this.f1069d == null) {
                this.f1070e = super.getResources();
            } else {
                int i2 = Build.VERSION.SDK_INT;
                this.f1070e = createConfigurationContext(this.f1069d).getResources();
            }
        }
        return this.f1070e;
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void setTheme(int i2) {
        if (this.f1066a != i2) {
            this.f1066a = i2;
            a();
        }
    }

    @Override // android.content.Context, android.content.ContextWrapper
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return a(getBaseContext(), str);
        }
        if (this.f1068c == null) {
            this.f1068c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f1068c;
    }

    public d(Context context, int i2) {
        super(context);
        this.f1066a = i2;
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
                        com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                i.f107219a = false;
            }
            return systemService;
        }
    }
}
