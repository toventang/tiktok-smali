package com.ss.android.ugc.aweme.search.ecom.video;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.p;
import h.v;
import java.util.LinkedHashMap;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f121114a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final h f121115b = i.a((h.f.a.a) a.f121116a);

    private static Map<Integer, Map<p<String, String>, Boolean>> a() {
        return (Map) f121115b.getValue();
    }

    private b() {
    }

    static final class a extends m implements h.f.a.a<Map<Integer, Map<p<? extends String, ? extends String>, Boolean>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f121116a = new a();

        static {
            Covode.recordClassIndex(78890);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<Integer, Map<p<? extends String, ? extends String>, Boolean>> invoke() {
            return new LinkedHashMap();
        }
    }

    static {
        Covode.recordClassIndex(78889);
    }

    public static void a(int i2) {
        a().put(Integer.valueOf(i2), null);
    }

    public static boolean a(Integer num, String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        if (num != null) {
            int intValue = num.intValue();
            p<String, String> pVar = new p<>(str, str2);
            Map<p<String, String>, Boolean> map = a().get(Integer.valueOf(intValue));
            if (map == null) {
                a().put(Integer.valueOf(intValue), ag.b(v.a(pVar, true)));
                return false;
            }
            boolean z = map.get(pVar);
            if (z == null) {
                map.put(pVar, true);
                z = false;
            }
            return z.booleanValue();
        }
        throw new NullPointerException("Must provide fragment hash when tracking video anchor");
    }
}
