package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.h.e;
import com.ss.ugc.effectplatform.model.Effect;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class n extends b {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.ugc.effectplatform.a f153874a;

    /* renamed from: b  reason: collision with root package name */
    public final Effect f153875b;

    /* renamed from: c  reason: collision with root package name */
    public final String f153876c;

    static {
        Covode.recordClassIndex(102628);
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(102630);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(n nVar) {
            super(0);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f153874a.K.b(this.this$0.f153876c);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.b
    public final void b() {
        a(new b(this));
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ Effect $effect;
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(102629);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(n nVar, Effect effect) {
            super(0);
            this.this$0 = nVar;
            this.$effect = effect;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            e a2 = this.this$0.f153874a.K.a(this.this$0.f153876c);
            if (a2 != null) {
                a2.onSuccess(this.$effect);
            }
            this.this$0.f153874a.K.b(this.this$0.f153876c);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ com.ss.ugc.effectplatform.model.e $e;
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(102631);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(n nVar, com.ss.ugc.effectplatform.model.e eVar) {
            super(0);
            this.this$0 = nVar;
            this.$e = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            e a2 = this.this$0.f153874a.K.a(this.this$0.f153876c);
            if (a2 != null) {
                a2.onFail(this.this$0.f153875b, this.$e);
            }
            this.this$0.f153874a.K.b(this.this$0.f153876c);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        if (r5.e(r3.getId() + "_trans_" + r2) != false) goto L_0x0068;
     */
    @Override // com.ss.ugc.effectplatform.task.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.task.n.a():void");
    }

    private final void a(com.ss.ugc.effectplatform.model.e eVar) {
        a(new c(this, eVar));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(com.ss.ugc.effectplatform.a aVar, Effect effect, String str) {
        super(str);
        l.c(aVar, "");
        l.c(str, "");
        this.f153874a = aVar;
        this.f153875b = effect;
        this.f153876c = str;
    }
}
