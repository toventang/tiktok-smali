package com.bytedance.helios.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.api.config.RuleInfo;
import com.bytedance.helios.api.config.b;
import h.f.b.l;
import h.w;
import java.util.Map;

public abstract class a {
    public static final C0641a Companion = new C0641a((byte) 0);
    public static a INSTANCE;

    static {
        Covode.recordClassIndex(17796);
    }

    public static final a get() {
        return C0641a.a();
    }

    public abstract void init(b bVar, com.bytedance.helios.api.config.a aVar);

    public abstract boolean isEnabled();

    public abstract void recordRegionEvent(Map<String, Object> map);

    public abstract void ruleChangeNotify(RuleInfo ruleInfo);

    public abstract void ruleChangeNotify(String str, boolean z);

    /* renamed from: com.bytedance.helios.api.a$a  reason: collision with other inner class name */
    public static final class C0641a {
        static {
            Covode.recordClassIndex(17797);
        }

        private C0641a() {
        }

        public static a a() {
            a aVar;
            MethodCollector.i(13267);
            if (a.INSTANCE == null) {
                synchronized (a.class) {
                    try {
                        if (a.INSTANCE != null) {
                            a aVar2 = a.INSTANCE;
                            if (aVar2 == null) {
                                l.a();
                            }
                            return aVar2;
                        }
                        try {
                            Class<?> cls = Class.forName("com.bytedance.helios.sdk.HeliosEnvImpl");
                            Object obj = cls.getField("INSTANCE").get(cls);
                            if (obj != null) {
                                aVar = (a) obj;
                                a.INSTANCE = aVar;
                            } else {
                                w wVar = new w("null cannot be cast to non-null type");
                                MethodCollector.o(13267);
                                throw wVar;
                            }
                        } catch (Throwable unused) {
                            aVar = new b();
                        }
                    } finally {
                        MethodCollector.o(13267);
                    }
                }
            }
            a aVar3 = a.INSTANCE;
            if (aVar3 == null) {
                l.a();
            }
            MethodCollector.o(13267);
            return aVar3;
        }

        public /* synthetic */ C0641a(byte b2) {
            this();
        }
    }
}
