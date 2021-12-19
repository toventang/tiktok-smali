package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.b.f;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import com.ss.ugc.effectplatform.model.e;
import com.ss.ugc.effectplatform.model.net.CategoryEffectListResponse;
import com.ss.ugc.effectplatform.util.g;
import d.a.d.a.k;
import h.a.ag;
import h.f.b.m;
import h.v;
import h.z;

public final class l extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f153862c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.ugc.effectplatform.a f153863a;

    /* renamed from: b  reason: collision with root package name */
    public final String f153864b;

    /* renamed from: d  reason: collision with root package name */
    private final String f153865d;

    /* renamed from: f  reason: collision with root package name */
    private final String f153866f;

    /* renamed from: g  reason: collision with root package name */
    private final int f153867g;

    /* renamed from: h  reason: collision with root package name */
    private final int f153868h;

    /* renamed from: i  reason: collision with root package name */
    private final int f153869i;

    static {
        Covode.recordClassIndex(102618);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(102619);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(102620);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f153863a.K.b(this.this$0.f153864b);
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
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(102621);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(l lVar, e eVar) {
            super(0);
            this.this$0 = lVar;
            this.$exceptionResult = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.ugc.effectplatform.h.e a2 = this.this$0.f153863a.K.a(this.this$0.f153864b);
            if (a2 != null) {
                a2.onFail(null, this.$exceptionResult);
            }
            this.this$0.f153863a.K.b(this.this$0.f153864b);
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ CategoryPageModel $categoryPageModel;
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(102622);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(l lVar, CategoryPageModel categoryPageModel) {
            super(0);
            this.this$0 = lVar;
            this.$categoryPageModel = categoryPageModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.ugc.effectplatform.h.e a2 = this.this$0.f153863a.K.a(this.this$0.f153864b);
            if (a2 != null) {
                a2.onSuccess(this.$categoryPageModel);
            }
            this.this$0.f153863a.K.b(this.this$0.f153864b);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.b
    public final void a() {
        d.a.d.a.c cVar;
        long currentTimeMillis = System.currentTimeMillis();
        f fVar = (f) d.a.b.b.a(this.f153863a.w);
        CategoryEffectListResponse categoryEffectListResponse = null;
        if (fVar != null) {
            cVar = fVar.c(g.a(this.f153865d, this.f153866f, this.f153867g, this.f153868h, this.f153869i));
        } else {
            cVar = null;
        }
        if (cVar == null) {
            a(new e(10004));
            return;
        }
        try {
            String str = d.a.d.a.d.a(cVar, d.a.d.a.b.Utf8);
            com.ss.ugc.effectplatform.a.b.b bVar = this.f153863a.q;
            if (bVar != null) {
                categoryEffectListResponse = (CategoryEffectListResponse) bVar.f153430a.convertJsonToObj(str, CategoryEffectListResponse.class);
            }
        } catch (Exception e2) {
            d.a.e.b.a("FetchCategoryEffectCacheTask", "Json Parse Exception: ".concat(String.valueOf(e2)), null);
        } catch (Throwable th) {
            d.a.d.a.d.a((k) cVar);
            throw th;
        }
        d.a.d.a.d.a((k) cVar);
        long currentTimeMillis2 = System.currentTimeMillis();
        if (categoryEffectListResponse == null || !categoryEffectListResponse.checkValue()) {
            long j2 = currentTimeMillis2 - currentTimeMillis;
            V v = this.f153863a.s.f156544a;
            if (v != null) {
                com.ss.ugc.effectplatform.a aVar = this.f153863a;
                String str2 = this.f153865d;
                String str3 = this.f153866f;
                if (str3 == null) {
                    str3 = "";
                }
                com.ss.ugc.effectplatform.i.b.a(v, true, aVar, str2, str3, ag.a(v.a("duration", Long.valueOf(j2)), v.a("from_cache", "true")), "");
            }
            a(new e(10004));
            return;
        }
        CategoryPageModel data = categoryEffectListResponse.getData();
        if (data != null) {
            a(new d(this, data));
        }
    }

    private final void a(e eVar) {
        a(new c(this, eVar));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(com.ss.ugc.effectplatform.a aVar, String str, String str2, String str3, int i2, int i3, int i4) {
        super(str2);
        h.f.b.l.c(aVar, "");
        h.f.b.l.c(str, "");
        h.f.b.l.c(str2, "");
        this.f153863a = aVar;
        this.f153865d = str;
        this.f153864b = str2;
        this.f153866f = str3;
        this.f153867g = i2;
        this.f153868h = i3;
        this.f153869i = i4;
    }
}
