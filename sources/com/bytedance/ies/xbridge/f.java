package com.bytedance.ies.xbridge;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.LinkedHashMap;
import java.util.Map;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final h f35943a = i.a((h.f.a.a) b.f35958a);

    static {
        Covode.recordClassIndex(21489);
    }

    public final a a() {
        return (a) this.f35943a.getValue();
    }

    static final class b extends m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f35958a = new b();

        static {
            Covode.recordClassIndex(21491);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a();
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, c> f35944a = new LinkedHashMap();

        static {
            Covode.recordClassIndex(21490);
        }

        public final void a(String str, c cVar) {
            l.c(str, "");
            l.c(cVar, "");
            this.f35944a.put(str, cVar);
        }
    }

    public final void a(String str, c cVar) {
        l.c(str, "");
        l.c(cVar, "");
        a().a(str, cVar);
    }
}
