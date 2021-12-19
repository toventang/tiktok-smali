package com.bytedance.geckox.policy.loop;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.e;
import com.bytedance.geckox.i.a;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.policy.loop.model.LoopInterval;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class b {

    /* renamed from: d  reason: collision with root package name */
    private static b f29989d;

    /* renamed from: a  reason: collision with root package name */
    public e f29990a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, c> f29991b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    private Map<String, Integer> f29992c = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private AtomicBoolean f29993e = new AtomicBoolean(true);

    static {
        Covode.recordClassIndex(17402);
    }

    public static b a() {
        MethodCollector.i(8457);
        if (f29989d == null) {
            synchronized (b.class) {
                try {
                    if (f29989d == null) {
                        f29989d = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8457);
                    throw th;
                }
            }
        }
        b bVar = f29989d;
        MethodCollector.o(8457);
        return bVar;
    }

    public final void b() {
        a.a("loop stop");
        for (String str : this.f29991b.keySet()) {
            c cVar = this.f29991b.get(str);
            if (cVar != null) {
                cVar.b();
            }
        }
    }

    private b() {
        this.f29992c.put(LoopInterval.a.lv_1.name(), 600);
        this.f29992c.put(LoopInterval.a.lv_2.name(), 1200);
        this.f29992c.put(LoopInterval.a.lv_3.name(), 1800);
    }

    private c a(OptionCheckUpdateParams optionCheckUpdateParams) {
        LoopInterval.a loopLevel = optionCheckUpdateParams.getLoopLevel();
        if (loopLevel == null) {
            return null;
        }
        String name = loopLevel.name();
        if (this.f29991b.get(name) != null) {
            return this.f29991b.get(name);
        }
        c cVar = new c(name, this.f29992c.get(name).intValue());
        cVar.f29996c = new d(this.f29990a, loopLevel);
        this.f29991b.put(loopLevel.name(), cVar);
        return cVar;
    }

    public final synchronized void b(Map<String, LoopInterval> map) {
        MethodCollector.i(8498);
        if (map == null) {
            MethodCollector.o(8498);
            return;
        }
        a.a("loop interval update", map);
        for (String str : map.keySet()) {
            c cVar = this.f29991b.get(str);
            LoopInterval loopInterval = map.get(str);
            if (!(cVar == null || loopInterval == null)) {
                cVar.a(loopInterval.getInterval());
                this.f29992c.put(str, Integer.valueOf(loopInterval.getInterval()));
            }
        }
        MethodCollector.o(8498);
    }

    public final void a(Map<String, GlobalConfigSettings.GeckoPollingConfig> map) {
        if (!(map == null || map.isEmpty())) {
            for (Map.Entry<String, GlobalConfigSettings.GeckoPollingConfig> entry : map.entrySet()) {
                String key = entry.getKey();
                int interval = entry.getValue().getInterval();
                c cVar = this.f29991b.get(key);
                if (cVar == null) {
                    cVar = new c(key, this.f29992c.get(key).intValue());
                    cVar.f29996c = new d(this.f29990a, LoopInterval.a.valueOf(key));
                    this.f29991b.put(key, cVar);
                }
                this.f29992c.put(key, Integer.valueOf(interval));
                cVar.a(entry.getValue().getCombine());
                if (this.f29993e.get()) {
                    cVar.a(interval);
                    cVar.a();
                }
            }
        }
    }

    public final void a(boolean z) {
        a.a("loop enable update", Boolean.valueOf(z));
        this.f29993e.set(z);
        if (!z) {
            b();
        }
    }

    public final void a(String str, List<String> list, Map<String, List<CheckRequestBodyModel.TargetChannel>> map, OptionCheckUpdateParams optionCheckUpdateParams) {
        c a2 = a(optionCheckUpdateParams);
        if (a2 != null) {
            a2.a(str, list, map, optionCheckUpdateParams.getCustomParam());
            if (this.f29993e.get()) {
                a2.a();
            }
        }
    }
}
