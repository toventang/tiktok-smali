package com.bytedance.w.a;

import com.bytedance.apm.q.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.news.common.service.manager.c;
import com.bytedance.services.slardar.config.IConfigManager;
import com.bytedance.services.slardar.config.a;
import org.json.JSONObject;

public class b implements a {

    /* renamed from: e  reason: collision with root package name */
    private static volatile b f45891e;

    /* renamed from: a  reason: collision with root package name */
    boolean f45892a = true;

    /* renamed from: b  reason: collision with root package name */
    JSONObject f45893b;

    /* renamed from: c  reason: collision with root package name */
    JSONObject f45894c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f45895d;

    static {
        Covode.recordClassIndex(28063);
    }

    @Override // com.bytedance.services.slardar.config.a
    public final void d() {
    }

    private b() {
    }

    public static b a() {
        MethodCollector.i(4296);
        if (f45891e == null) {
            synchronized (b.class) {
                try {
                    if (f45891e == null) {
                        f45891e = new b();
                        ((IConfigManager) c.a(IConfigManager.class)).registerConfigListener(f45891e);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4296);
                    throw th;
                }
            }
        }
        b bVar = f45891e;
        MethodCollector.o(4296);
        return bVar;
    }

    @Override // com.bytedance.services.slardar.config.a
    public final void a(JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject;
        boolean optBoolean;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("tracing")) == null) {
            optBoolean = true;
        } else {
            optBoolean = optJSONObject.optBoolean("enable_open", true);
        }
        this.f45892a = optBoolean;
        if (!this.f45895d) {
            this.f45893b = g.a(jSONObject, "tracing", "allow_service_list");
            this.f45894c = g.a(jSONObject, "tracing", "allow_error_list");
            this.f45895d = true;
        }
    }
}
