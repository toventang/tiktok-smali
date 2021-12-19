package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.b.f;
import com.ss.ugc.effectplatform.model.e;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;

public final class am extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f153784c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.ugc.effectplatform.a f153785a;

    /* renamed from: b  reason: collision with root package name */
    public final String f153786b;

    /* renamed from: d  reason: collision with root package name */
    private final d.a.a.b<String, String> f153787d;

    static {
        Covode.recordClassIndex(102568);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(102569);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ am this$0;

        static {
            Covode.recordClassIndex(102570);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(am amVar) {
            super(0);
            this.this$0 = amVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f153785a.K.b(this.this$0.f153786b);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.b
    public final void b() {
        a(new b(this));
    }

    static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ e $e;
        final /* synthetic */ am this$0;

        static {
            Covode.recordClassIndex(102571);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(am amVar, e eVar) {
            super(0);
            this.this$0 = amVar;
            this.$e = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.ugc.effectplatform.h.e a2 = this.this$0.f153785a.K.a(this.this$0.f153786b);
            if (a2 != null) {
                a2.onFail(null, this.$e);
            }
            this.this$0.f153785a.K.b(this.this$0.f153786b);
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ am this$0;

        static {
            Covode.recordClassIndex(102572);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(am amVar) {
            super(0);
            this.this$0 = amVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.ugc.effectplatform.h.e a2 = this.this$0.f153785a.K.a(this.this$0.f153786b);
            if (a2 != null) {
                a2.onSuccess("");
            }
            this.this$0.f153785a.K.b(this.this$0.f153786b);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.b
    public final void a() {
        String convertObjToJson;
        f fVar;
        HashMap hashMap = new HashMap();
        d.a.a.b<String, String> bVar = this.f153787d;
        if (bVar != null) {
            hashMap.putAll(bVar);
        }
        try {
            com.ss.ugc.effectplatform.a.b.b bVar2 = this.f153785a.q;
            if (!(bVar2 == null || (convertObjToJson = bVar2.f153430a.convertObjToJson(hashMap)) == null || (fVar = (f) d.a.b.b.a(this.f153785a.w)) == null)) {
                fVar.a("updatetime", convertObjToJson);
            }
            a(new d(this));
        } catch (Exception e2) {
            a(new c(this, new e(e2)));
            d.a.e.b.a("WriteUpdateTagTask", String.valueOf(e2), null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public am(com.ss.ugc.effectplatform.a aVar, String str, d.a.a.b<String, String> bVar) {
        super(str);
        l.c(aVar, "");
        l.c(str, "");
        this.f153785a = aVar;
        this.f153786b = str;
        this.f153787d = bVar;
    }
}
