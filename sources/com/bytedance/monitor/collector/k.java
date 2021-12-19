package com.bytedance.monitor.collector;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.a.a.b;
import com.bytedance.monitor.collector.e;
import com.bytedance.monitor.collector.g;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f41545a;
    private static volatile k q;

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f41546b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f41547c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f41548d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f41549e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f41550f;

    /* renamed from: g  reason: collision with root package name */
    public volatile boolean f41551g;

    /* renamed from: h  reason: collision with root package name */
    public BinderMonitor f41552h;

    /* renamed from: i  reason: collision with root package name */
    public l f41553i;

    /* renamed from: j  reason: collision with root package name */
    public c f41554j;

    /* renamed from: k  reason: collision with root package name */
    public IOMonitor f41555k;

    /* renamed from: l  reason: collision with root package name */
    public g f41556l;

    /* renamed from: m  reason: collision with root package name */
    public e f41557m;
    public f n;
    public j o;
    public d p;
    private volatile boolean r;
    private Runnable s = new Runnable() {
        /* class com.bytedance.monitor.collector.k.AnonymousClass1 */

        static {
            Covode.recordClassIndex(25422);
        }

        public final void run() {
            k.this.a(false);
        }
    };

    public interface a {
        static {
            Covode.recordClassIndex(25425);
        }

        void a(List<String> list);
    }

    static {
        Covode.recordClassIndex(25421);
    }

    public final e.a b() {
        e eVar = this.f41557m;
        if (eVar == null) {
            return null;
        }
        return eVar.a();
    }

    public final g.c d() {
        g gVar = this.f41556l;
        if (gVar == null) {
            return null;
        }
        return gVar.f41463f;
    }

    public final g.e e() {
        g gVar = this.f41556l;
        if (gVar == null) {
            return null;
        }
        return gVar.d();
    }

    private k() {
        ActivityLifeObserver.getInstance().register(new com.bytedance.services.apm.api.d() {
            /* class com.bytedance.monitor.collector.k.AnonymousClass2 */

            static {
                Covode.recordClassIndex(25423);
            }

            @Override // com.bytedance.services.apm.api.d
            public final void a(Activity activity, Bundle bundle) {
            }

            @Override // com.bytedance.services.apm.api.d
            public final void c(Activity activity) {
            }

            @Override // com.bytedance.services.apm.api.d
            public final void l_() {
            }

            @Override // com.bytedance.services.apm.api.d
            public final void a(Activity activity) {
                k kVar = k.this;
                if (kVar.n != null) {
                    boolean z = kVar.f41551g;
                }
            }

            @Override // com.bytedance.services.apm.api.d
            public final void b(Activity activity) {
                k kVar = k.this;
                if (kVar.n != null) {
                    boolean z = kVar.f41551g;
                }
            }
        });
    }

    public static k a() {
        if (q == null) {
            synchronized (k.class) {
                if (q == null) {
                    q = new k();
                }
            }
        }
        return q;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        for (int i2 = 0; i2 < this.f41546b.size(); i2++) {
            try {
                Pair<String, ?> c2 = this.f41546b.get(i2).c();
                jSONObject.put((String) c2.first, c2.second);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return jSONObject;
    }

    public static synchronized boolean a(Context context) {
        boolean z;
        synchronized (k.class) {
            if (!f41545a) {
                f41545a = b.a(context, "monitorcollector-lib");
                ByteHook.a();
            }
            z = f41545a;
        }
        return z;
    }

    public final void a(boolean z) {
        if (this.r) {
            try {
                if (f41545a) {
                    d dVar = this.p;
                    if (dVar != null) {
                        if (z) {
                            dVar.b(this.s);
                            dVar.a(this.s, 10000);
                        } else {
                            dVar.b(this.s);
                        }
                    }
                    MonitorJni.doSetRecordSwitch(z);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final JSONObject a(long j2, long j3) {
        JSONObject jSONObject = new JSONObject();
        for (int i2 = 0; i2 < this.f41546b.size(); i2++) {
            try {
                Pair<String, ?> a2 = this.f41546b.get(i2).a(j2, j3);
                jSONObject.put((String) a2.first, a2.second);
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }
}
