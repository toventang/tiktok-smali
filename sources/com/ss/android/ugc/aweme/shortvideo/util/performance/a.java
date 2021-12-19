package com.ss.android.ugc.aweme.shortvideo.util.performance;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService;
import com.ss.android.ugc.aweme.shortvideo.util.v;
import h.a.ag;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f132345a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final h f132346b = i.a((h.f.a.a) e.f132355a);

    /* renamed from: c  reason: collision with root package name */
    private static final h f132347c = i.a((h.f.a.a) C3432a.f132350a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f132348d = i.a((h.f.a.a) c.f132353a);

    /* renamed from: e  reason: collision with root package name */
    private static final h f132349e = i.a((h.f.a.a) d.f132354a);

    static ICreativePerformanceMonitorService a() {
        return (ICreativePerformanceMonitorService) f132347c.getValue();
    }

    private static Handler b() {
        return (Handler) f132346b.getValue();
    }

    private static long c() {
        return ((Number) f132348d.getValue()).longValue();
    }

    private static boolean d() {
        return ((Boolean) f132349e.getValue()).booleanValue();
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.performance.a$a  reason: collision with other inner class name */
    static final class C3432a extends m implements h.f.a.a<ICreativePerformanceMonitorService> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3432a f132350a = new C3432a();

        static {
            Covode.recordClassIndex(86667);
        }

        C3432a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ICreativePerformanceMonitorService invoke() {
            return AVExternalServiceImpl.a().performanceMonitorService();
        }
    }

    static final class e extends m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f132355a = new e();

        static {
            Covode.recordClassIndex(86671);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(v.a());
        }
    }

    static final class c extends m implements h.f.a.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f132353a = new c();

        static {
            Covode.recordClassIndex(86669);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Long invoke() {
            return Long.valueOf(com.bytedance.ies.abmock.b.a().a(true, "creative_tools_monitor_performance_interval", 1000L));
        }
    }

    static final class d extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f132354a = new d();

        static {
            Covode.recordClassIndex(86670);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(com.bytedance.ies.abmock.b.a().a(true, "creative_tools_open_monitor_performance", false));
        }
    }

    static {
        Covode.recordClassIndex(86666);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f132351a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f132352b;

        static {
            Covode.recordClassIndex(86668);
        }

        b(String str, Map map) {
            this.f132351a = str;
            this.f132352b = map;
        }

        public final void run() {
            String str = this.f132351a;
            Map map = this.f132352b;
            Map<String, Double> cpuRate = a.a().getCpuRate();
            LinkedHashMap linkedHashMap = new LinkedHashMap(ag.a(cpuRate.size()));
            for (T t : cpuRate.entrySet()) {
                linkedHashMap.put(t.getKey(), String.valueOf(((Number) t.getValue()).doubleValue()));
            }
            map.putAll(linkedHashMap);
            Map<String, Long> memory = a.a().getMemory();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(ag.a(memory.size()));
            for (T t2 : memory.entrySet()) {
                linkedHashMap2.put(t2.getKey(), String.valueOf(((Number) t2.getValue()).longValue()));
            }
            map.putAll(linkedHashMap2);
            com.ss.android.ugc.aweme.utils.d.a(str, map);
        }
    }

    public static void a(String str, Map<String, String> map) {
        l.d(str, "");
        l.d(map, "");
        if (d()) {
            b().postDelayed(new b(str, map), c());
        } else {
            com.ss.android.ugc.aweme.utils.d.a(str, map);
        }
    }
}
