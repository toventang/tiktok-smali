package com.ss.ugc.effectplatform.e;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.b.a.a;
import com.ss.ugc.effectplatform.b.d;
import com.ss.ugc.effectplatform.b.e;
import com.ss.ugc.effectplatform.b.f;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.util.k;
import d.a.d.a.c;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class h implements j {

    /* renamed from: b  reason: collision with root package name */
    public static final a f153597b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Effect f153598a;

    static {
        Covode.recordClassIndex(102391);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(102392);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public h(Effect effect) {
        l.c(effect, "");
        this.f153598a = effect;
    }

    static final class b extends m implements h.f.a.m<Integer, Long, z> {
        final /* synthetic */ c $listener;

        static {
            Covode.recordClassIndex(102393);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(2);
            this.$listener = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Integer num, Long l2) {
            int intValue = num.intValue();
            long longValue = l2.longValue();
            c cVar = this.$listener;
            if (cVar != null) {
                cVar.a(intValue, longValue);
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.ugc.effectplatform.e.j
    public final String a(c cVar, long j2, c cVar2) {
        l.c(cVar, "");
        String b2 = k.b(this.f153598a.getZipPath());
        if (b2 == null) {
            return null;
        }
        f a2 = d.a(b2);
        if (a2 instanceof e) {
            Effect effect = this.f153598a;
            return ((e) a2).a(effect, cVar, effect.getFile_url().getUri(), j2, new b(cVar2));
        }
        String a3 = a.C4084a.a(this.f153598a.getId() + ".zip");
        if (a2 != null) {
            a2.a(a3, cVar);
        }
        return this.f153598a.getZipPath();
    }
}
