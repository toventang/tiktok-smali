package com.lynx.tasm.ui.image;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.base.c;
import java.util.LinkedList;
import java.util.List;

public class e extends HandlerThread {

    /* renamed from: e  reason: collision with root package name */
    private static volatile e f56976e;

    /* renamed from: a  reason: collision with root package name */
    List<Runnable> f56977a;

    /* renamed from: b  reason: collision with root package name */
    List<Runnable> f56978b;

    /* renamed from: c  reason: collision with root package name */
    Handler f56979c;

    /* renamed from: d  reason: collision with root package name */
    Handler f56980d;

    static {
        Covode.recordClassIndex(35442);
    }

    private e() {
        super("Lynx_image");
        start();
    }

    /* access modifiers changed from: protected */
    public void onLooperPrepared() {
        super.onLooperPrepared();
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            /* class com.lynx.tasm.ui.image.e.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35443);
            }

            public final void run() {
                e eVar = e.this;
                eVar.f56980d = new Handler(eVar.getLooper());
                eVar.f56979c = new Handler(Looper.myLooper());
                if (eVar.f56977a != null && !eVar.f56977a.isEmpty()) {
                    for (Runnable runnable : eVar.f56977a) {
                        eVar.f56979c.post(runnable);
                    }
                    eVar.f56977a.clear();
                }
                if (!(eVar.f56978b == null || eVar.f56978b.isEmpty())) {
                    for (Runnable runnable2 : eVar.f56978b) {
                        eVar.f56980d.post(runnable2);
                    }
                    eVar.f56978b.clear();
                }
            }
        });
    }

    public static e a() {
        MethodCollector.i(2822);
        if (f56976e == null) {
            synchronized (e.class) {
                try {
                    if (f56976e == null) {
                        f56976e = new e();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2822);
                    throw th;
                }
            }
        }
        e eVar = f56976e;
        MethodCollector.o(2822);
        return eVar;
    }

    public final void a(Runnable runnable) {
        boolean z;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            z = true;
        } else {
            z = false;
        }
        c.a(z);
        Handler handler = this.f56980d;
        if (handler == null) {
            if (this.f56978b == null) {
                this.f56978b = new LinkedList();
            }
            this.f56978b.add(runnable);
            return;
        }
        handler.post(runnable);
    }
}
