package com.bytedance.scene.e;

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
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.bytedance.scene.d.k;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public class d extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private Resources.Theme f42790a;

    /* renamed from: b  reason: collision with root package name */
    public int f42791b;

    /* renamed from: c  reason: collision with root package name */
    public Configuration f42792c;

    /* renamed from: d  reason: collision with root package name */
    private LayoutInflater f42793d;

    /* renamed from: e  reason: collision with root package name */
    private Resources f42794e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f42795f;

    static {
        Covode.recordClassIndex(26277);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f42790a;
        if (theme != null) {
            return theme;
        }
        a();
        return this.f42790a;
    }

    private void a() {
        if (this.f42790a == null) {
            this.f42790a = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f42790a.setTo(theme);
            }
        }
        this.f42790a.applyStyle(this.f42791b, true);
    }

    public Resources getResources() {
        if (this.f42794e == null) {
            if (this.f42792c == null) {
                this.f42794e = super.getResources();
            } else {
                int i2 = Build.VERSION.SDK_INT;
                this.f42794e = createConfigurationContext(this.f42792c).getResources();
            }
        }
        return this.f42794e;
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public void setTheme(int i2) {
        if (this.f42791b != i2) {
            this.f42791b = i2;
            if (this.f42795f) {
                this.f42790a = null;
                this.f42794e = null;
            }
            a();
        }
    }

    @Override // android.content.Context, android.content.ContextWrapper
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return a(getBaseContext(), str);
        }
        if (this.f42793d == null) {
            this.f42793d = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f42793d;
    }

    public d(Context context, int i2) {
        super(context);
        this.f42791b = i2;
        if (i2 == 0) {
            throw new IllegalArgumentException("themeResId can't be zero");
        }
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f42790a = (Resources.Theme) k.a(theme, "theme can't be null");
        this.f42795f = true;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(3553);
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
                    MethodCollector.o(3553);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
