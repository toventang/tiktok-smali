package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class i extends b {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.ugc.effectplatform.a f153840a;

    /* renamed from: b  reason: collision with root package name */
    public final ProviderEffect f153841b;

    /* renamed from: c  reason: collision with root package name */
    public final String f153842c;

    static {
        Covode.recordClassIndex(102605);
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(102607);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f153840a.K.b(this.this$0.f153842c);
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
        final /* synthetic */ com.ss.ugc.effectplatform.model.e $e;
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(102608);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(i iVar, com.ss.ugc.effectplatform.model.e eVar) {
            super(0);
            this.this$0 = iVar;
            this.$e = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.ugc.effectplatform.h.e a2 = this.this$0.f153840a.K.a(this.this$0.f153842c);
            if (a2 != null) {
                a2.onFail(this.this$0.f153841b, this.$e);
            }
            this.this$0.f153840a.K.b(this.this$0.f153842c);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ long $contentLength;
        final /* synthetic */ int $progress;
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(102609);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(i iVar, int i2, long j2) {
            super(0);
            this.this$0 = iVar;
            this.$progress = i2;
            this.$contentLength = j2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.ugc.effectplatform.h.e a2 = this.this$0.f153840a.K.a(this.this$0.f153842c);
            if (!(a2 instanceof com.ss.ugc.effectplatform.h.d)) {
                a2 = null;
            }
            com.ss.ugc.effectplatform.h.d dVar = (com.ss.ugc.effectplatform.h.d) a2;
            if (dVar != null) {
                dVar.onProgress(this.this$0.f153841b, this.$progress, this.$contentLength);
            }
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.a<z> {
        final /* synthetic */ ProviderEffect $data;
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(102610);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(i iVar, ProviderEffect providerEffect) {
            super(0);
            this.this$0 = iVar;
            this.$data = providerEffect;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.ugc.effectplatform.h.e a2 = this.this$0.f153840a.K.a(this.this$0.f153842c);
            if (a2 != null) {
                a2.onSuccess(this.$data);
            }
            this.this$0.f153840a.K.b(this.this$0.f153842c);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ba A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d0 A[SYNTHETIC] */
    @Override // com.ss.ugc.effectplatform.task.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
        // Method dump skipped, instructions count: 215
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.task.i.a():void");
    }

    private final void a(com.ss.ugc.effectplatform.model.e eVar) {
        a(new c(this, eVar));
    }

    static final class a extends m implements h.f.a.m<Integer, Long, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(102606);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar) {
            super(2);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Integer num, Long l2) {
            this.this$0.a(num.intValue(), l2.longValue());
            return z.f158842a;
        }
    }

    public final void a(int i2, long j2) {
        a(new d(this, i2, j2));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(com.ss.ugc.effectplatform.a aVar, ProviderEffect providerEffect, String str) {
        super(str);
        l.c(aVar, "");
        l.c(providerEffect, "");
        l.c(str, "");
        this.f153840a = aVar;
        this.f153841b = providerEffect;
        this.f153842c = str;
    }
}
