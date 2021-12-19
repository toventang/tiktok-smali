package com.ss.android.ugc.aweme.live.livehostimpl;

import android.content.Context;
import com.bytedance.android.livesdkapi.host.h;
import com.bytedance.apm.k.d;
import com.bytedance.apm.trace.b.b;
import com.bytedance.common.graphics.GraphicsMonitor;
import com.bytedance.covode.number.Covode;
import com.ss.b.c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class y implements h {

    /* renamed from: a  reason: collision with root package name */
    public double f108511a;

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f108512b;

    /* renamed from: c  reason: collision with root package name */
    com.bytedance.android.livesdkapi.host.a f108513c;

    /* renamed from: d  reason: collision with root package name */
    private b f108514d = new b("live_frs_tracer", true);

    /* renamed from: e  reason: collision with root package name */
    private b.d f108515e = new b.d() {
        /* class com.ss.android.ugc.aweme.live.livehostimpl.y.AnonymousClass1 */

        static {
            Covode.recordClassIndex(69541);
        }

        @Override // com.bytedance.apm.trace.b.b.d
        public final void a(double d2) {
            y.this.f108511a = d2;
        }
    };

    /* renamed from: f  reason: collision with root package name */
    private b.c f108516f = new b.c() {
        /* class com.ss.android.ugc.aweme.live.livehostimpl.y.AnonymousClass2 */

        static {
            Covode.recordClassIndex(69542);
        }

        @Override // com.bytedance.apm.trace.b.b.c
        public final void a(JSONObject jSONObject) {
            y.this.f108512b = jSONObject;
            y yVar = y.this;
            if (yVar.f108513c != null) {
                yVar.f108513c.a(yVar.f108511a, yVar.f108512b);
                yVar.f108511a = 0.0d;
                yVar.f108512b = null;
            }
        }
    };

    static {
        Covode.recordClassIndex(69540);
    }

    @Override // com.bytedance.android.live.base.a
    public final void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.h
    public final void d() {
        GraphicsMonitor.init();
    }

    static class a implements h.c {

        /* renamed from: a  reason: collision with root package name */
        private final b f108519a;

        static {
            Covode.recordClassIndex(69543);
        }

        @Override // com.bytedance.android.livesdkapi.host.h.c
        public final void a() {
            this.f108519a.a();
        }

        @Override // com.bytedance.android.livesdkapi.host.h.c
        public final void b() {
            this.f108519a.b();
        }

        @Override // com.bytedance.android.livesdkapi.host.h.c
        public final void a(h.a aVar) {
            b bVar = this.f108519a;
            aVar.getClass();
            bVar.a(new z(aVar));
        }

        @Override // com.bytedance.android.livesdkapi.host.h.c
        public final void a(h.b bVar) {
            b bVar2 = this.f108519a;
            bVar.getClass();
            bVar2.a(new aa(bVar));
        }

        private a(String str, boolean z) {
            this.f108519a = new b(str, !z);
        }

        /* synthetic */ a(String str, boolean z, byte b2) {
            this(str, z);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.h
    public final double f() {
        return GraphicsMonitor.getByteGpu();
    }

    @Override // com.bytedance.android.livesdkapi.host.h
    public final void e() {
        try {
            GraphicsMonitor.start();
        } catch (Throwable th) {
            com.bytedance.android.live.core.c.a.a("ALogger", th);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.h
    public final Map<String, Double> a() {
        HashMap hashMap = new HashMap();
        com.bytedance.apm.k.a.a a2 = d.a();
        hashMap.put("cpu_rate", Double.valueOf(a2.f25059a));
        hashMap.put("cpu_speed", Double.valueOf(a2.f25060b));
        return hashMap;
    }

    @Override // com.bytedance.android.livesdkapi.host.h
    public final void c() {
        try {
            this.f108514d.a();
        } catch (Throwable unused) {
        }
        this.f108514d.a(this.f108515e);
        this.f108514d.a(this.f108516f);
    }

    @Override // com.bytedance.android.livesdkapi.host.h
    public final void g() {
        try {
            if (GraphicsMonitor.isStart()) {
                GraphicsMonitor.stop();
            }
        } catch (Throwable th) {
            com.bytedance.android.live.core.c.a.a("ALogger", th);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.h
    public final Map<String, Long> b() {
        HashMap hashMap = new HashMap();
        com.bytedance.apm.k.a.b a2 = d.a(com.bytedance.ies.ugc.appcontext.d.a());
        hashMap.put("mem_java_total", Long.valueOf(a2.f25061a));
        hashMap.put("mem_java_free", Long.valueOf(a2.f25062b));
        hashMap.put("mem_java_used", Long.valueOf(a2.f25063c));
        hashMap.put("mem_pss_dalvik", Long.valueOf(a2.f25064d));
        hashMap.put("mem_pss_native", Long.valueOf(a2.f25065e));
        hashMap.put("mem_pss_total", Long.valueOf(a2.f25066f));
        hashMap.put("mem_graphics", Long.valueOf(a2.f25067g));
        hashMap.put("mem_vmsize", Long.valueOf(a2.f25068h));
        return hashMap;
    }

    @Override // com.bytedance.android.livesdkapi.host.h
    public final void a(com.bytedance.android.livesdkapi.host.a aVar) {
        this.f108513c = aVar;
        this.f108514d.b();
    }

    @Override // com.bytedance.android.livesdkapi.host.h
    public final Map<String, String> a(Context context) {
        HashMap hashMap = new HashMap(4);
        if (context == null) {
            return hashMap;
        }
        hashMap.put("thor_galvanic_now", String.valueOf(c.c(context)));
        float longProperty = (float) c.a(context).getLongProperty(3);
        if (com.ss.b.d.b() || com.ss.b.d.c()) {
            if (longProperty < -1.0E7f || longProperty > 1.0E7f) {
                longProperty = -1.0f;
            } else {
                if (longProperty < -10000.0f) {
                    longProperty /= 1000.0f;
                }
                longProperty = -longProperty;
            }
        } else if (!com.ss.b.d.a() || longProperty > 10000.0f) {
            longProperty /= 1000.0f;
        }
        hashMap.put("thor_galvanic_avg", String.valueOf(longProperty));
        double c2 = (double) c.c(context);
        Double.isNaN(c2);
        hashMap.put("thor_use_battery", String.valueOf((c2 * 0.5d) / 3600.0d));
        double longProperty2 = (double) c.a(context).getLongProperty(5);
        Double.isNaN(longProperty2);
        hashMap.put("thor_energy", String.valueOf((longProperty2 / 1.0E9d) / 1000.0d));
        return hashMap;
    }

    @Override // com.bytedance.android.livesdkapi.host.h
    public final h.c a(String str, boolean z) {
        return new a(str, z, (byte) 0);
    }
}
