package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.b.f;
import com.ss.ugc.effectplatform.model.EffectChannelModel;
import com.ss.ugc.effectplatform.model.EffectChannelResponse;
import com.ss.ugc.effectplatform.model.e;
import com.ss.ugc.effectplatform.util.g;
import d.a.d.a.k;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class u extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f153902c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.ugc.effectplatform.a f153903a;

    /* renamed from: b  reason: collision with root package name */
    public final String f153904b;

    /* renamed from: d  reason: collision with root package name */
    private final String f153905d;

    static {
        Covode.recordClassIndex(102644);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(102645);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ u this$0;

        static {
            Covode.recordClassIndex(102646);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(u uVar) {
            super(0);
            this.this$0 = uVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f153903a.K.b(this.this$0.f153904b);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.b
    public final void b() {
        a(new b(this));
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ e $exceptionResult;
        final /* synthetic */ u this$0;

        static {
            Covode.recordClassIndex(102647);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(u uVar, e eVar) {
            super(0);
            this.this$0 = uVar;
            this.$exceptionResult = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.ugc.effectplatform.h.e a2 = this.this$0.f153903a.K.a(this.this$0.f153904b);
            if (a2 != null) {
                a2.onFail(null, this.$exceptionResult);
            }
            this.this$0.f153903a.K.b(this.this$0.f153904b);
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ EffectChannelResponse $result;
        final /* synthetic */ u this$0;

        static {
            Covode.recordClassIndex(102648);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(u uVar, EffectChannelResponse effectChannelResponse) {
            super(0);
            this.this$0 = uVar;
            this.$result = effectChannelResponse;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.ugc.effectplatform.h.e a2 = this.this$0.f153903a.K.a(this.this$0.f153904b);
            if (a2 != null) {
                a2.onSuccess(this.$result);
            }
            this.this$0.f153903a.K.b(this.this$0.f153904b);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.b
    public final void a() {
        d.a.d.a.c cVar;
        f fVar = (f) d.a.b.b.a(this.f153903a.w);
        EffectChannelModel effectChannelModel = null;
        if (fVar != null) {
            cVar = fVar.c(g.a(this.f153903a.f153406f, this.f153905d));
        } else {
            cVar = null;
        }
        if (cVar == null) {
            a(new e(10004));
            return;
        }
        try {
            String str = d.a.d.a.d.a(cVar, d.a.d.a.b.Utf8);
            com.ss.ugc.effectplatform.a.b.b bVar = this.f153903a.q;
            if (bVar != null) {
                effectChannelModel = (EffectChannelModel) bVar.f153430a.convertJsonToObj(str, EffectChannelModel.class);
            }
        } catch (Exception e2) {
            d.a.e.b.a("FetchPanelEffectListCacheTask", "Json Parse Exception: ".concat(String.valueOf(e2)), null);
            f fVar2 = (f) d.a.b.b.a(this.f153903a.w);
            if (fVar2 != null) {
                fVar2.d(g.a(this.f153903a.f153406f, this.f153905d));
            }
        } catch (Throwable th) {
            d.a.d.a.d.a((k) cVar);
            throw th;
        }
        d.a.d.a.d.a((k) cVar);
        if (effectChannelModel == null || !effectChannelModel.checkValued()) {
            a(new e(10004));
        } else {
            a(new d(this, new com.ss.ugc.effectplatform.model.a.a(this.f153905d, this.f153903a.f153409i, true).a(effectChannelModel)));
        }
    }

    private final void a(e eVar) {
        a(new c(this, eVar));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(com.ss.ugc.effectplatform.a aVar, String str, String str2) {
        super(str2);
        l.c(aVar, "");
        l.c(str, "");
        l.c(str2, "");
        this.f153903a = aVar;
        this.f153905d = str;
        this.f153904b = str2;
    }
}
