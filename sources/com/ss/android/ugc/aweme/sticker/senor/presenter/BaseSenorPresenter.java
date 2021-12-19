package com.ss.android.ugc.aweme.sticker.senor.presenter;

import android.content.ClipboardManager;
import android.content.Context;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.c;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.sticker.senor.a.a;
import h.f.b.l;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class BaseSenorPresenter implements au, a {

    /* renamed from: a */
    public final SparseIntArray f135697a = new SparseIntArray();

    /* renamed from: b */
    private boolean f135698b;

    /* renamed from: c */
    private final SensorManager f135699c;

    /* renamed from: d */
    private final List<a> f135700d = new CopyOnWriteArrayList();

    /* renamed from: e */
    private final Handler f135701e;

    /* renamed from: f */
    private final Context f135702f;

    /* renamed from: g */
    private final Handler f135703g;

    static {
        Covode.recordClassIndex(88701);
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.presenter.a
    public void a() {
        this.f135698b = true;
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            unRegister();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.presenter.a
    public final boolean b() {
        return this.f135698b;
    }

    public final SensorManager c() {
        return this.f135699c;
    }

    public final Context d() {
        return this.f135702f;
    }

    public final Handler e() {
        return this.f135703g;
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.presenter.a
    public void unRegister() {
        this.f135698b = false;
        for (a aVar : this.f135700d) {
            this.f135699c.unregisterListener(aVar);
        }
    }

    public final void a(a aVar) {
        l.d(aVar, "");
        this.f135700d.add(aVar);
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.presenter.a
    public final void a(boolean z) {
        for (a aVar : this.f135700d) {
            aVar.f135676a = z;
        }
    }

    private static Object a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!com.ss.android.ugc.aweme.lancet.i.f107219a) {
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
                        c.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                com.ss.android.ugc.aweme.lancet.i.f107219a = false;
            }
            return systemService;
        }
    }

    public final int a(int i2, int i3, boolean z) {
        if (!z) {
            return this.f135697a.get(i2);
        }
        return this.f135697a.get(i2, i3);
    }

    public BaseSenorPresenter(Context context, final m mVar, Handler handler) {
        l.d(context, "");
        l.d(mVar, "");
        this.f135702f = context;
        this.f135703g = handler;
        Object a2 = a(context, "sensor");
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.hardware.SensorManager");
        this.f135699c = (SensorManager) a2;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.f135701e = handler2;
        handler2.post(new Runnable(this) {
            /* class com.ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter.AnonymousClass1 */

            /* renamed from: a */
            final /* synthetic */ BaseSenorPresenter f135704a;

            static {
                Covode.recordClassIndex(88702);
            }

            {
                this.f135704a = r1;
            }

            public final void run() {
                mVar.getLifecycle().a(this.f135704a);
            }
        });
    }
}
