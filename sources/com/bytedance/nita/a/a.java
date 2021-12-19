package com.bytedance.nita.a;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.b.l;
import h.w;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

public final class a extends ContextThemeWrapper {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Context> f41607a;

    static {
        Covode.recordClassIndex(25455);
    }

    public final Resources getResources() {
        Context context;
        Resources resources;
        WeakReference<Context> weakReference = this.f41607a;
        if (weakReference != null && (context = weakReference.get()) != null && (resources = context.getResources()) != null) {
            return resources;
        }
        Resources resources2 = super.getResources();
        l.a((Object) resources2, "");
        return resources2;
    }

    public final AssetManager getAssets() {
        Context context;
        Resources resources;
        AssetManager assets;
        WeakReference<Context> weakReference = this.f41607a;
        if (weakReference != null && (context = weakReference.get()) != null && (resources = context.getResources()) != null && (assets = resources.getAssets()) != null) {
            return assets;
        }
        AssetManager assets2 = super.getAssets();
        l.a((Object) assets2, "");
        return assets2;
    }

    public final void a(Context context) {
        l.c(context, "");
        this.f41607a = new WeakReference<>(context);
    }

    @Override // android.content.Context, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final Object getSystemService(String str) {
        l.c(str, "");
        return a(this, str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context, 0);
        l.c(context, "");
        this.f41607a = new WeakReference<>(context);
    }

    public final void startActivity(Intent intent) {
        Context context;
        WeakReference<Context> weakReference = this.f41607a;
        Context context2 = null;
        if (weakReference != null) {
            context2 = weakReference.get();
        }
        if (context2 instanceof Activity) {
            WeakReference<Context> weakReference2 = this.f41607a;
            if (weakReference2 == null || (context = weakReference2.get()) == null) {
                throw new w("null cannot be cast to non-null type");
            }
            Activity activity = (Activity) context;
            com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
            activity.startActivity(intent);
            return;
        }
        throw new com.bytedance.nita.b.a();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r3, int r4) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            h.f.b.l.c(r3, r0)
            android.content.Context r1 = r3.getApplicationContext()
            boolean r0 = com.ss.android.ugc.aweme.lancet.a.a.f107168c
            if (r0 != 0) goto L_0x0018
        L_0x000d:
            r2.<init>(r1, r4)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.f41607a = r0
            return
        L_0x0018:
            if (r1 == 0) goto L_0x001b
            goto L_0x000d
        L_0x001b:
            android.app.Application r1 = com.ss.android.ugc.aweme.lancet.a.a.f107166a
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.nita.a.a.<init>(android.content.Context, int):void");
    }

    private static Object a(ContextThemeWrapper contextThemeWrapper, String str) {
        Object obj;
        MethodCollector.i(8161);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    obj = super.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = super.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = super.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            c.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(8161);
                }
            }
        } else {
            obj = super.getSystemService(str);
        }
        return obj;
    }
}
