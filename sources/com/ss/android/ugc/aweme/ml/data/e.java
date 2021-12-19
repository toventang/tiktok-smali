package com.ss.android.ugc.aweme.ml.data;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ml.infra.FeatureTypeConfig;
import h.a.am;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class e extends a {

    /* renamed from: d  reason: collision with root package name */
    public static boolean f110471d = com.ss.android.ugc.aweme.ml.a.a.f110297a;

    /* renamed from: e  reason: collision with root package name */
    public static final Set<String> f110472e = am.a((Object[]) new String[]{"enter_homepage_familiar", "enter_homepage_hot", "enter_homepage_message", "enter_homepage_follow", "enter_homepage_fresh", "enter_personal_homepage", "shoot"});

    /* renamed from: f  reason: collision with root package name */
    public static final a f110473f = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    final ConcurrentHashMap<String, AtomicInteger> f110474c;

    public static final class a {
        static {
            Covode.recordClassIndex(70923);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        static e f110475a = new e((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        public static final b f110476b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(70924);
        }
    }

    private e() {
        this.f110474c = new ConcurrentHashMap<>();
    }

    static {
        Covode.recordClassIndex(70922);
    }

    public /* synthetic */ e(byte b2) {
        this();
    }

    public final boolean a(Map<String, Object> map, FeatureTypeConfig featureTypeConfig) {
        int i2;
        if (map == null || featureTypeConfig == null || !featureTypeConfig.getEnable()) {
            return false;
        }
        for (String str : f110472e) {
            AtomicInteger atomicInteger = this.f110474c.get(str);
            if (atomicInteger != null) {
                i2 = atomicInteger.intValue();
            } else {
                i2 = 0;
            }
            map.put("g_" + str + "_cnt", Integer.valueOf(i2));
        }
        return true;
    }
}
