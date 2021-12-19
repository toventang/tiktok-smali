package com.bytedance.ies.d.a;

import com.bytedance.covode.number.Covode;
import h.f.b.ab;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f33253a = {new y(ab.a(v.class), "configMap", "getConfigMap()Ljava/util/concurrent/ConcurrentHashMap;"), new y(ab.a(v.class), "cacheMap", "getCacheMap()Ljava/util/concurrent/ConcurrentHashMap;")};

    /* renamed from: b  reason: collision with root package name */
    static final h f33254b = h.i.a((h.f.a.a) a.f33257a);

    /* renamed from: c  reason: collision with root package name */
    public static final v f33255c = new v();

    /* renamed from: d  reason: collision with root package name */
    private static final h f33256d = h.i.a((h.f.a.a) b.f33258a);

    static ConcurrentHashMap<String, ArrayList<ac>> a() {
        return (ConcurrentHashMap) f33256d.getValue();
    }

    private v() {
    }

    static final class a extends m implements h.f.a.a<ConcurrentHashMap<String, ah<String, y>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f33257a = new a();

        static {
            Covode.recordClassIndex(19871);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ConcurrentHashMap<String, ah<String, y>> invoke() {
            return new ConcurrentHashMap();
        }
    }

    static final class b extends m implements h.f.a.a<ConcurrentHashMap<String, ArrayList<ac>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f33258a = new b();

        static {
            Covode.recordClassIndex(19872);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ConcurrentHashMap<String, ArrayList<ac>> invoke() {
            return new ConcurrentHashMap();
        }
    }

    static {
        Covode.recordClassIndex(19870);
    }
}
