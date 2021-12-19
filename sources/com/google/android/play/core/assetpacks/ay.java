package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class ay {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Double> f52860a = new HashMap();

    static {
        Covode.recordClassIndex(32690);
    }

    ay() {
    }

    /* access modifiers changed from: package-private */
    public final synchronized double a(String str, bo boVar) {
        double d2;
        MethodCollector.i(7206);
        double d3 = (double) ((ar) boVar).f52819e;
        Double.isNaN(d3);
        double d4 = (double) ((ar) boVar).f52820f;
        Double.isNaN(d4);
        d2 = (d3 + 1.0d) / d4;
        this.f52860a.put(str, Double.valueOf(d2));
        MethodCollector.o(7206);
        return d2;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(String str) {
        MethodCollector.i(7080);
        this.f52860a.put(str, Double.valueOf(0.0d));
        MethodCollector.o(7080);
    }

    /* access modifiers changed from: package-private */
    public final synchronized double b(String str) {
        MethodCollector.i(7132);
        Double d2 = this.f52860a.get(str);
        if (d2 == null) {
            MethodCollector.o(7132);
            return 0.0d;
        }
        double doubleValue = d2.doubleValue();
        MethodCollector.o(7132);
        return doubleValue;
    }
}
