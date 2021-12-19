package com.ss.android.ugc.aweme.discover.mixfeed.d;

import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.h;
import h.i;
import java.util.LinkedHashMap;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f81724a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final h f81725b = i.a((h.f.a.a) a.f81726a);

    public static Map<Integer, Map<Integer, Integer>> a() {
        return (Map) f81725b.getValue();
    }

    private d() {
    }

    static final class a extends m implements h.f.a.a<Map<Integer, Map<Integer, Integer>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f81726a = new a();

        static {
            Covode.recordClassIndex(50770);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<Integer, Map<Integer, Integer>> invoke() {
            return new LinkedHashMap();
        }
    }

    static {
        Covode.recordClassIndex(50769);
    }

    public static void a(int i2) {
        Map<Integer, Integer> map = a().get(Integer.valueOf(i2));
        if (map == null) {
            map = null;
        }
        Map<Integer, Integer> map2 = map;
        if (map2 != null) {
            map2.size();
            map2.clear();
        }
    }
}
