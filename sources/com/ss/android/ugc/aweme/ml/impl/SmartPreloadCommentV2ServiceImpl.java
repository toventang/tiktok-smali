package com.ss.android.ugc.aweme.ml.impl;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service;
import com.ss.android.ugc.aweme.ml.api.SmartPreloadCommentV2Service;
import com.ss.android.ugc.aweme.ml.c.a;
import com.ss.android.ugc.b;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class SmartPreloadCommentV2ServiceImpl extends SmartPreloadCommentV2Service {

    /* renamed from: a  reason: collision with root package name */
    public static final a f110572a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private boolean f110573b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f110574c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f110575d;

    static {
        Covode.recordClassIndex(70952);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(70953);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service
    public final boolean ensureEvaluatorAvailable() {
        boolean z = true;
        if (this.f110575d) {
            return true;
        }
        com.ss.android.ugc.aweme.ml.c.a aVar = a.C2824a.f110423a;
        if (aVar.f110421a == null || !aVar.f110421a.b()) {
            z = false;
        }
        this.f110575d = z;
        return z;
    }

    public static ISmartPreloadCommentV2Service a() {
        MethodCollector.i(9655);
        Object a2 = b.a(ISmartPreloadCommentV2Service.class, false);
        if (a2 != null) {
            ISmartPreloadCommentV2Service iSmartPreloadCommentV2Service = (ISmartPreloadCommentV2Service) a2;
            MethodCollector.o(9655);
            return iSmartPreloadCommentV2Service;
        }
        if (b.cH == null) {
            synchronized (ISmartPreloadCommentV2Service.class) {
                try {
                    if (b.cH == null) {
                        b.cH = new SmartPreloadCommentV2ServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9655);
                    throw th;
                }
            }
        }
        SmartPreloadCommentV2Service smartPreloadCommentV2Service = (SmartPreloadCommentV2Service) b.cH;
        MethodCollector.o(9655);
        return smartPreloadCommentV2Service;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service
    public final float smartJudge(Aweme aweme, Map<String, Object> map, Map<String, Object> map2) {
        float f2;
        l.d(map, "");
        l.d(map2, "");
        float f3 = -1.0f;
        if (aweme == null) {
            return -1.0f;
        }
        if (SmartPreloadCommentV2Service.debug) {
            aweme.getAid();
        }
        if (a.C2824a.f110423a.f110422b != null) {
            this.f110573b = true;
            this.f110574c = false;
            try {
                if (SmartPreloadCommentV2Service.debug) {
                    System.currentTimeMillis();
                }
                if (SmartPreloadCommentV2Service.debug) {
                    System.currentTimeMillis();
                }
                com.ss.android.ugc.aweme.ml.c.a aVar = a.C2824a.f110423a;
                if (aVar.f110421a != null) {
                    com.ss.android.ugc.aweme.ml.c.b bVar = aVar.f110421a;
                    try {
                        if (!bVar.c() || map == null || map.isEmpty() || !bVar.b()) {
                            SmartPreloadCommentV2Service.getDebug();
                        } else {
                            if (SmartPreloadCommentV2Service.getDebug()) {
                                for (String str : map.keySet()) {
                                    map.get(str);
                                }
                            }
                            Map<String, Float> hashMap = new HashMap<>();
                            List<String> a2 = bVar.f59875b.a(map, bVar.a(), bVar.f59877d.output, bVar.f59877d.feature_list, hashMap);
                            if (SmartPreloadCommentV2Service.getDebug()) {
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
                if (SmartPreloadCommentV2Service.debug) {
                    System.currentTimeMillis();
                }
                if (map2.containsKey("label")) {
                    long j2 = 0;
                    if (SmartPreloadCommentV2Service.debug) {
                        j2 = System.currentTimeMillis();
                    }
                    Object obj = map2.get("label");
                    if (obj != null) {
                        String str4 = (String) obj;
                        Object obj2 = map2.get("probability");
                        if (SmartPreloadCommentV2Service.debug) {
                            new StringBuilder("SmartPreloadCommentV2Service aid:").append(aweme.getAid()).append(" out:").append(str4).append(" probability:").append(obj2).append(" outCost:").append(System.currentTimeMillis() - j2);
                        }
                        if (obj2 instanceof Float) {
                            f3 = ((Number) obj2).floatValue();
                        }
                        this.f110573b = false;
                        return f3;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                this.f110574c = true;
                if (SmartPreloadCommentV2Service.debug) {
                    System.currentTimeMillis();
                    aweme.getAid();
                }
                this.f110573b = false;
            } catch (Throwable unused) {
            }
        }
        return -1.0f;
    }
}
