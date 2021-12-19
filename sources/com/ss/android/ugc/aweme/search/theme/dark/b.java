package com.ss.android.ugc.aweme.search.theme.dark;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.concurrent.ConcurrentHashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f121734a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final h f121735b = i.a((h.f.a.a) a.f121736a);

    static ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, com.ss.android.ugc.aweme.search.j.a>> a() {
        return (ConcurrentHashMap) f121735b.getValue();
    }

    private b() {
    }

    static final class a extends m implements h.f.a.a<ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, com.ss.android.ugc.aweme.search.j.a>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f121736a = new a();

        static {
            Covode.recordClassIndex(79288);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, com.ss.android.ugc.aweme.search.j.a>> invoke() {
            return new ConcurrentHashMap();
        }
    }

    static {
        Covode.recordClassIndex(79287);
    }

    public static void a(Integer num, com.ss.android.ugc.aweme.search.j.a aVar) {
        ConcurrentHashMap<Integer, com.ss.android.ugc.aweme.search.j.a> putIfAbsent;
        if (aVar != null) {
            ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, com.ss.android.ugc.aweme.search.j.a>> a2 = a();
            ConcurrentHashMap<Integer, com.ss.android.ugc.aweme.search.j.a> concurrentHashMap = a2.get(num);
            if (concurrentHashMap == null && (putIfAbsent = a2.putIfAbsent(num, (concurrentHashMap = new ConcurrentHashMap<>()))) != null) {
                concurrentHashMap = putIfAbsent;
            }
            ConcurrentHashMap<Integer, com.ss.android.ugc.aweme.search.j.a> concurrentHashMap2 = concurrentHashMap;
            l.b(concurrentHashMap2, "");
            Integer valueOf = Integer.valueOf(aVar.hashCode());
            if (concurrentHashMap2.get(valueOf) == null) {
                aVar.hashCode();
                a().size();
                concurrentHashMap2.putIfAbsent(valueOf, aVar);
            }
        }
    }
}
