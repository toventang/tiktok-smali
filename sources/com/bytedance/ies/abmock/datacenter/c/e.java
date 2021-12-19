package com.bytedance.ies.abmock.datacenter.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.google.gson.f;
import com.google.gson.l;
import com.google.gson.o;
import java.util.Map;
import java.util.Set;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f31819a = new e();

    /* renamed from: b  reason: collision with root package name */
    public Keva f31820b = Keva.getRepoSync("unregistered_config", 1);

    /* renamed from: c  reason: collision with root package name */
    private f f31821c;

    /* renamed from: d  reason: collision with root package name */
    private o f31822d;

    static {
        Covode.recordClassIndex(18605);
    }

    private f c() {
        if (this.f31821c == null) {
            this.f31821c = new f();
        }
        return this.f31821c;
    }

    public final Set<String> b() {
        o a2 = a();
        if (a2 != null) {
            return a2.f54898a.keySet();
        }
        return null;
    }

    private e() {
        System.nanoTime();
        System.nanoTime();
    }

    public final o a() {
        MethodCollector.i(4373);
        if (this.f31822d == null) {
            synchronized (e.class) {
                try {
                    if (this.f31822d == null) {
                        try {
                            this.f31822d = (o) c().a(this.f31820b.getString("key_unregistered_config", "{}"), o.class);
                            com.bytedance.ies.abmock.datacenter.f fVar = com.bytedance.ies.abmock.datacenter.e.a().f31826b;
                            if (fVar != null && fVar.e()) {
                                for (Map.Entry<String, l> entry : ((o) c().a(this.f31820b.getString("key_unregistered_config", "{}"), o.class)).f54898a.entrySet()) {
                                    this.f31822d.a(entry.getKey(), entry.getValue());
                                }
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4373);
                    throw th;
                }
            }
        }
        o oVar = this.f31822d;
        MethodCollector.o(4373);
        return oVar;
    }

    public final Object a(String str) {
        o a2 = a();
        if (a2 != null) {
            return a2.c(str);
        }
        return null;
    }

    public final synchronized void a(o oVar) {
        MethodCollector.i(3001);
        try {
            this.f31820b.storeString("key_unregistered_config", oVar.toString());
            this.f31822d = null;
            MethodCollector.o(3001);
        } catch (Exception e2) {
            e2.printStackTrace();
            MethodCollector.o(3001);
        }
    }

    public final synchronized void b(o oVar) {
        MethodCollector.i(3007);
        try {
            this.f31820b.storeString("key_unregistered_libra_config", oVar.toString());
            this.f31822d = null;
            MethodCollector.o(3007);
        } catch (Exception e2) {
            e2.printStackTrace();
            MethodCollector.o(3007);
        }
    }
}
