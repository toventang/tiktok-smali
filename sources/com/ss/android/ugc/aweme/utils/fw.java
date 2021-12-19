package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.property.bh;
import com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService;
import com.ss.android.ugc.aweme.services.performance.LagDataCallback;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import org.json.JSONObject;

public final class fw {

    /* renamed from: a  reason: collision with root package name */
    public static final fw f142957a = new fw();

    /* renamed from: b  reason: collision with root package name */
    private static final h f142958b = i.a((h.f.a.a) a.f142959a);

    private static final ICreativePerformanceMonitorService a() {
        return (ICreativePerformanceMonitorService) f142958b.getValue();
    }

    public static final class b implements LagDataCallback {
        static {
            Covode.recordClassIndex(93553);
        }

        b() {
        }

        @Override // com.ss.android.ugc.aweme.services.performance.LagDataCallback
        public final void onDataAvailable(JSONObject jSONObject) {
            l.d(jSONObject, "");
            r.a("tool_performance_block_info", jSONObject);
        }
    }

    public static final class c implements LagDataCallback {
        static {
            Covode.recordClassIndex(93554);
        }

        c() {
        }

        @Override // com.ss.android.ugc.aweme.services.performance.LagDataCallback
        public final void onDataAvailable(JSONObject jSONObject) {
            l.d(jSONObject, "");
            r.a("tool_performance_fps_info", jSONObject);
        }
    }

    private fw() {
    }

    static final class a extends m implements h.f.a.a<ICreativePerformanceMonitorService> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f142959a = new a();

        static {
            Covode.recordClassIndex(93552);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ICreativePerformanceMonitorService invoke() {
            return AVExternalServiceImpl.a().performanceMonitorService();
        }
    }

    static {
        Covode.recordClassIndex(93551);
    }

    public static final void a(String str) {
        l.d(str, "");
        if (bh.a()) {
            a().stopBlockMonitor(str);
            a().stopFpsMonitor(str);
        }
    }

    public static final void a(String str, int i2, long j2) {
        l.d(str, "");
        if (bh.a()) {
            a().startBlockMonitor(str, i2, j2, new b());
            a().startFpsMonitor(str, j2, new c());
        }
    }
}
