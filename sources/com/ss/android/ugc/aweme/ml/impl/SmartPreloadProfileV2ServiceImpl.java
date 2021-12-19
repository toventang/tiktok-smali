package com.ss.android.ugc.aweme.ml.impl;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.api.ISmartPreloadProfileV2Service;
import com.ss.android.ugc.aweme.ml.api.SmartPreloadProfileV2Service;
import com.ss.android.ugc.aweme.ml.c.c;
import com.ss.android.ugc.aweme.ml.c.d;
import com.ss.android.ugc.b;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class SmartPreloadProfileV2ServiceImpl extends SmartPreloadProfileV2Service {

    /* renamed from: a  reason: collision with root package name */
    public static final a f110576a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private boolean f110577b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f110578c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f110579d;

    static {
        Covode.recordClassIndex(70954);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(70955);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartPreloadProfileV2Service
    public final boolean ensureEvaluatorAvailable() {
        boolean z = true;
        if (this.f110579d) {
            return true;
        }
        c cVar = c.a.f110426a;
        if (cVar.f110424a == null || !cVar.f110424a.b()) {
            z = false;
        }
        this.f110579d = z;
        return z;
    }

    public static ISmartPreloadProfileV2Service a() {
        MethodCollector.i(6308);
        Object a2 = b.a(ISmartPreloadProfileV2Service.class, false);
        if (a2 != null) {
            ISmartPreloadProfileV2Service iSmartPreloadProfileV2Service = (ISmartPreloadProfileV2Service) a2;
            MethodCollector.o(6308);
            return iSmartPreloadProfileV2Service;
        }
        if (b.cI == null) {
            synchronized (ISmartPreloadProfileV2Service.class) {
                try {
                    if (b.cI == null) {
                        b.cI = new SmartPreloadProfileV2ServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6308);
                    throw th;
                }
            }
        }
        SmartPreloadProfileV2Service smartPreloadProfileV2Service = (SmartPreloadProfileV2Service) b.cI;
        MethodCollector.o(6308);
        return smartPreloadProfileV2Service;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartPreloadProfileV2Service
    public final float smartJudge(Aweme aweme, Map<String, Object> map, Map<String, Object> map2) {
        float f2;
        l.d(map, "");
        l.d(map2, "");
        float f3 = -1.0f;
        if (aweme == null) {
            return -1.0f;
        }
        if (SmartPreloadProfileV2Service.debug) {
            aweme.getAid();
        }
        if (c.a.f110426a.f110425b != null) {
            this.f110577b = true;
            this.f110578c = false;
            try {
                if (SmartPreloadProfileV2Service.debug) {
                    System.currentTimeMillis();
                }
                if (SmartPreloadProfileV2Service.debug) {
                    System.currentTimeMillis();
                }
                c cVar = c.a.f110426a;
                if (cVar.f110424a != null) {
                    d dVar = cVar.f110424a;
                    try {
                        if (!dVar.c() || map == null || map.isEmpty() || !dVar.b()) {
                            SmartPreloadProfileV2Service.getDebug();
                        } else {
                            if (SmartPreloadProfileV2Service.getDebug()) {
                                for (String str : map.keySet()) {
                                    map.get(str);
                                }
                            }
                            Map<String, Float> hashMap = new HashMap<>();
                            List<String> a2 = dVar.f59875b.a(map, dVar.a(), dVar.f59877d.output, dVar.f59877d.feature_list, hashMap);
                            if (SmartPreloadProfileV2Service.getDebug()) {
                                for (String str2 : hashMap.keySet()) {
                                    hashMap.get(str2);
                                }
                            }
                            if (map2 != null && a2.size() > 0) {
                                String str3 = a2.get(0);
                                boolean equals = TextUtils.equals(str3, "leave");
                                Float f4 = hashMap.get(str3);
                                map2.put("label", a2.get(0));
                                if (f4 == null) {
                                    f2 = -1.0f;
                                } else if (equals) {
                                    f2 = 1.0f - f4.floatValue();
                                } else {
                                    f2 = f4.floatValue();
                                }
                                map2.put("probability", Float.valueOf(f2));
                            }
                        }
                    } catch (Exception e2) {
                        com.bytedance.c.a.a.a.b.a(e2);
                    }
                }
                if (SmartPreloadProfileV2Service.debug) {
                    System.currentTimeMillis();
                }
                if (map2.containsKey("label")) {
                    long j2 = 0;
                    if (SmartPreloadProfileV2Service.debug) {
                        j2 = System.currentTimeMillis();
                    }
                    Object obj = map2.get("label");
                    if (obj != null) {
                        String str4 = (String) obj;
                        Object obj2 = map2.get("probability");
                        if (SmartPreloadProfileV2Service.debug) {
                            new StringBuilder("SmartPreloadProfileV2Service aid:").append(aweme.getAid()).append(" out:").append(str4).append(" probability:").append(obj2).append(" outCost:").append(System.currentTimeMillis() - j2);
                        }
                        if (obj2 instanceof Float) {
                            f3 = ((Number) obj2).floatValue();
                        }
                        this.f110577b = false;
                        return f3;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                this.f110578c = true;
                if (SmartPreloadProfileV2Service.debug) {
                    System.currentTimeMillis();
                    aweme.getAid();
                }
                this.f110577b = false;
            } catch (Throwable unused) {
            }
        }
        return -1.0f;
    }
}
