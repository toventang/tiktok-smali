package com.ss.android.ugc.aweme.arch.widgets.base;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class DataCenter extends ac {

    /* renamed from: a  reason: collision with root package name */
    protected m f66996a;

    /* renamed from: b  reason: collision with root package name */
    public AtomicInteger f66997b = new AtomicInteger(0);

    /* renamed from: c  reason: collision with root package name */
    private Map<String, Object> f66998c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private Map<String, c<b>> f66999d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private Thread f67000e;

    /* renamed from: f  reason: collision with root package name */
    private Handler f67001f = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(41295);
    }

    @Override // androidx.lifecycle.ac
    public void onCleared() {
        this.f66998c.clear();
        this.f66999d.clear();
        this.f66996a = null;
    }

    public final DataCenter a(u<b> uVar) {
        for (c<b> cVar : this.f66999d.values()) {
            cVar.removeObserver(uVar);
        }
        return this;
    }

    public final c<b> b(String str) {
        c<b> cVar = this.f66999d.get(str);
        if (cVar == null) {
            cVar = new c<>();
            if (this.f66998c.containsKey(str)) {
                cVar.setValue(new b(str, this.f66998c.get(str)));
            }
            this.f66999d.put(str, cVar);
        }
        return cVar;
    }

    public final <T> T a(String str) {
        T t = (T) this.f66998c.get(str);
        if (t != null) {
            return t;
        }
        return null;
    }

    public final DataCenter a(String str, u<b> uVar) {
        return a(str, uVar, false);
    }

    public static DataCenter a(ad adVar, m mVar) {
        DataCenter dataCenter = (DataCenter) adVar.a(DataCenter.class);
        dataCenter.f66996a = mVar;
        return dataCenter;
    }

    public final <T> T b(String str, T t) {
        return !this.f66998c.containsKey(str) ? t : (T) a(str);
    }

    public final DataCenter b(String str, u<b> uVar) {
        c<b> cVar;
        if (!TextUtils.isEmpty(str) && (cVar = this.f66999d.get(str)) != null) {
            cVar.removeObserver(uVar);
        }
        return this;
    }

    public final DataCenter a(final String str, final Object obj) {
        MethodCollector.i(14210);
        if (this.f67000e == null) {
            this.f67000e = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == this.f67000e) {
            while (this.f66997b.get() > 0) {
                try {
                    Thread.sleep(2);
                } catch (InterruptedException unused) {
                }
            }
            synchronized (this) {
                try {
                    this.f66998c.put(str, obj);
                    c<b> cVar = this.f66999d.get(str);
                    if (cVar != null) {
                        cVar.setValue(new b(str, obj));
                    }
                } finally {
                    MethodCollector.o(14210);
                }
            }
            return this;
        }
        this.f67001f.post(new Runnable() {
            /* class com.ss.android.ugc.aweme.arch.widgets.base.DataCenter.AnonymousClass1 */

            static {
                Covode.recordClassIndex(41296);
            }

            public final void run() {
                DataCenter.this.a(str, obj);
            }
        });
        MethodCollector.o(14210);
        return this;
    }

    public final DataCenter a(String str, u<b> uVar, boolean z) {
        if (!TextUtils.isEmpty(str) && uVar != null) {
            b(str).a(this.f66996a, uVar, z);
        }
        return this;
    }
}
