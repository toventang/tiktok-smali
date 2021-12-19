package com.bytedance.geckox.statistic.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.sdkmonitor.k;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class a {

    /* renamed from: c  reason: collision with root package name */
    private static a f30046c;

    /* renamed from: a  reason: collision with root package name */
    public k f30047a;

    /* renamed from: b  reason: collision with root package name */
    public AtomicBoolean f30048b = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(17452);
    }

    private a() {
    }

    public static a a() {
        MethodCollector.i(7408);
        if (f30046c == null) {
            synchronized (a.class) {
                try {
                    if (f30046c == null) {
                        f30046c = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7408);
                    throw th;
                }
            }
        }
        a aVar = f30046c;
        MethodCollector.o(7408);
        return aVar;
    }

    public final void a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (this.f30048b.get()) {
            k kVar = this.f30047a;
            if (kVar != null) {
                kVar.a(str, jSONObject, jSONObject2, (JSONObject) null);
                return;
            }
            return;
        }
        throw new IllegalStateException("Please init MonitorManager first");
    }
}
