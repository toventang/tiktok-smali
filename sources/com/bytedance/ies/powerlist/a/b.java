package com.bytedance.ies.powerlist.a;

import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.h;
import h.i;
import java.util.LinkedHashMap;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final h f34256a = i.a((h.f.a.a) a.f34257a);

    static {
        Covode.recordClassIndex(20468);
    }

    public final Map<Class<? extends a>, a> a() {
        return (Map) this.f34256a.getValue();
    }

    static final class a extends m implements h.f.a.a<Map<Class<? extends a>, a>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34257a = new a();

        static {
            Covode.recordClassIndex(20469);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<Class<? extends a>, a> invoke() {
            return new LinkedHashMap();
        }
    }
}
