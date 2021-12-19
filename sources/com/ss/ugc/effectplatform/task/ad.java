package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.b.f;
import com.ss.ugc.effectplatform.model.e;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;

public final class ad extends b {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.ugc.effectplatform.a f153741a;

    /* renamed from: b  reason: collision with root package name */
    public final String f153742b;

    static {
        Covode.recordClassIndex(102552);
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ ad this$0;

        static {
            Covode.recordClassIndex(102553);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ad adVar) {
            super(0);
            this.this$0 = adVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f153741a.K.b(this.this$0.f153742b);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.b
    public final void b() {
        a(new a(this));
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ e $e;
        final /* synthetic */ ad this$0;

        static {
            Covode.recordClassIndex(102554);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ad adVar, e eVar) {
            super(0);
            this.this$0 = adVar;
            this.$e = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.ugc.effectplatform.h.e a2 = this.this$0.f153741a.K.a(this.this$0.f153742b);
            if (a2 != null) {
                a2.onFail(null, this.$e);
            }
            this.this$0.f153741a.K.b(this.this$0.f153742b);
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ HashMap $tagsCacheMap;
        final /* synthetic */ ad this$0;

        static {
            Covode.recordClassIndex(102555);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ad adVar, HashMap hashMap) {
            super(0);
            this.this$0 = adVar;
            this.$tagsCacheMap = hashMap;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.ugc.effectplatform.h.e a2 = this.this$0.f153741a.K.a(this.this$0.f153742b);
            if (a2 != null) {
                a2.onSuccess(this.$tagsCacheMap);
            }
            this.this$0.f153741a.K.b(this.this$0.f153742b);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.b
    public final void a() {
        String b2;
        HashMap hashMap;
        f fVar = (f) d.a.b.b.a(this.f153741a.w);
        if (fVar == null || (b2 = fVar.b("updatetime")) == null) {
            a(new e(10009));
            return;
        }
        try {
            com.ss.ugc.effectplatform.a.b.b bVar = this.f153741a.q;
            if (bVar == null || (hashMap = (HashMap) bVar.f153430a.convertJsonToObj(b2, HashMap.class)) == null) {
                a(new e(new IllegalStateException("local file destroy")));
            } else {
                a(new c(this, hashMap));
            }
        } catch (Exception e2) {
            a(new e(e2));
        }
    }

    private final void a(e eVar) {
        a(new b(this, eVar));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ad(com.ss.ugc.effectplatform.a aVar, String str) {
        super(str);
        l.c(aVar, "");
        l.c(str, "");
        this.f153741a = aVar;
        this.f153742b = str;
    }
}
