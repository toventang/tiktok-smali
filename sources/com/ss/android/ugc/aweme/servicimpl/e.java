package com.ss.android.ugc.aweme.servicimpl;

import androidx.c.a;
import com.bytedance.apm.k.a.b;
import com.bytedance.apm.k.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.performance.c;
import com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService;
import com.ss.android.ugc.aweme.services.performance.LagDataCallback;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class e implements ICreativePerformanceMonitorService {

    /* renamed from: a  reason: collision with root package name */
    private final a<String, com.ss.android.ugc.aweme.performance.a> f121873a = new a<>();

    /* renamed from: b  reason: collision with root package name */
    private final a<String, c> f121874b = new a<>();

    static {
        Covode.recordClassIndex(79914);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
    public final Map<String, Double> getCpuRate() {
        HashMap hashMap = new HashMap();
        com.bytedance.apm.k.a.a a2 = d.a();
        hashMap.put("cpu_rate", Double.valueOf(a2.f25059a));
        hashMap.put("cpu_speed", Double.valueOf(a2.f25060b));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
    public final Map<String, Long> getMemory() {
        HashMap hashMap = new HashMap();
        b a2 = d.a(com.bytedance.ies.ugc.appcontext.d.a());
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

    @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
    public final void stopBlockMonitor(String str) {
        l.d(str, "");
        com.ss.android.ugc.aweme.performance.a aVar = this.f121873a.get(str);
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
    public final void stopFpsMonitor(String str) {
        l.d(str, "");
        c cVar = this.f121874b.get(str);
        if (cVar != null) {
            cVar.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
    public final void startFpsMonitor(String str, LagDataCallback lagDataCallback) {
        l.d(str, "");
        startFpsMonitor(str, -1, lagDataCallback);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
    public final void startBlockMonitor(String str, int i2, LagDataCallback lagDataCallback) {
        l.d(str, "");
        startBlockMonitor(str, i2, -1, lagDataCallback);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
    public final void startFpsMonitor(String str, long j2, LagDataCallback lagDataCallback) {
        l.d(str, "");
        c cVar = this.f121874b.get(str);
        if (cVar != null) {
            cVar.a(lagDataCallback);
            if (j2 == -1) {
                cVar.a();
            } else {
                cVar.a(j2);
            }
        } else {
            c cVar2 = new c(str);
            this.f121874b.put(str, cVar2);
            cVar2.a(lagDataCallback);
            if (j2 == -1) {
                cVar2.a();
            } else {
                cVar2.a(j2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
    public final void startBlockMonitor(String str, int i2, long j2, LagDataCallback lagDataCallback) {
        l.d(str, "");
        com.ss.android.ugc.aweme.performance.a aVar = this.f121873a.get(str);
        if (aVar != null) {
            aVar.f114763f = i2;
            aVar.a(lagDataCallback);
            if (j2 == -1) {
                aVar.a();
            } else {
                aVar.a(j2);
            }
        } else {
            com.ss.android.ugc.aweme.performance.a aVar2 = new com.ss.android.ugc.aweme.performance.a(str);
            this.f121873a.put(str, aVar2);
            aVar2.a(lagDataCallback);
            if (j2 == -1) {
                aVar2.a();
            } else {
                aVar2.a(j2);
            }
        }
    }
}
