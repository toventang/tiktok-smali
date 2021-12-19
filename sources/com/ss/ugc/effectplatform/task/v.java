package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.b.f;
import com.ss.ugc.effectplatform.model.PanelInfoModel;
import com.ss.ugc.effectplatform.model.e;
import com.ss.ugc.effectplatform.model.net.PanelInfoResponse;
import com.ss.ugc.effectplatform.util.g;
import d.a.d.a.k;
import h.a.ag;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class v extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f153906c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.ugc.effectplatform.a f153907a;

    /* renamed from: b  reason: collision with root package name */
    public final String f153908b;

    /* renamed from: d  reason: collision with root package name */
    private final String f153909d;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f153910f;

    /* renamed from: g  reason: collision with root package name */
    private final String f153911g;

    /* renamed from: h  reason: collision with root package name */
    private final int f153912h;

    /* renamed from: i  reason: collision with root package name */
    private final int f153913i;

    static {
        Covode.recordClassIndex(102649);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(102650);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ v this$0;

        static {
            Covode.recordClassIndex(102651);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(v vVar) {
            super(0);
            this.this$0 = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f153907a.K.b(this.this$0.f153908b);
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
        final /* synthetic */ v this$0;

        static {
            Covode.recordClassIndex(102652);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(v vVar, e eVar) {
            super(0);
            this.this$0 = vVar;
            this.$exceptionResult = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.ugc.effectplatform.h.e a2 = this.this$0.f153907a.K.a(this.this$0.f153908b);
            if (a2 != null) {
                a2.onFail(null, this.$exceptionResult);
            }
            this.this$0.f153907a.K.b(this.this$0.f153908b);
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ PanelInfoModel $panelInfoModel;
        final /* synthetic */ v this$0;

        static {
            Covode.recordClassIndex(102653);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(v vVar, PanelInfoModel panelInfoModel) {
            super(0);
            this.this$0 = vVar;
            this.$panelInfoModel = panelInfoModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.ugc.effectplatform.h.e a2 = this.this$0.f153907a.K.a(this.this$0.f153908b);
            if (a2 != null) {
                a2.onSuccess(this.$panelInfoModel);
            }
            this.this$0.f153907a.K.b(this.this$0.f153908b);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.b
    public final void a() {
        d.a.d.a.c cVar;
        long currentTimeMillis = System.currentTimeMillis();
        f fVar = (f) d.a.b.b.a(this.f153907a.w);
        PanelInfoResponse panelInfoResponse = null;
        if (fVar != null) {
            cVar = fVar.c(g.a(this.f153907a.f153406f, this.f153909d, this.f153910f, this.f153911g, this.f153913i, this.f153912h));
        } else {
            cVar = null;
        }
        if (cVar == null) {
            a(new e(10004));
            return;
        }
        try {
            String str = d.a.d.a.d.a(cVar, d.a.d.a.b.Utf8);
            com.ss.ugc.effectplatform.a.b.b bVar = this.f153907a.q;
            if (bVar != null) {
                panelInfoResponse = (PanelInfoResponse) bVar.f153430a.convertJsonToObj(str, PanelInfoResponse.class);
            }
        } catch (Exception e2) {
            d.a.e.b.a("FetchPanelInfoCacheTask", "Json Parse Exception: ".concat(String.valueOf(e2)), null);
        } catch (Throwable th) {
            d.a.d.a.d.a((k) cVar);
            throw th;
        }
        d.a.d.a.d.a((k) cVar);
        long currentTimeMillis2 = System.currentTimeMillis();
        if (panelInfoResponse == null || !panelInfoResponse.checkValue()) {
            long j2 = currentTimeMillis2 - currentTimeMillis;
            V v = this.f153907a.s.f156544a;
            if (v != null) {
                com.ss.ugc.effectplatform.i.b.a(v, true, this.f153907a, this.f153909d, ag.a(h.v.a("duration", Long.valueOf(j2)), h.v.a("from_cache", "true")), "");
            }
            a(new e(10004));
            return;
        }
        PanelInfoModel data = panelInfoResponse.getData();
        if (data != null) {
            a(new d(this, data));
        }
    }

    private final void a(e eVar) {
        d.a.e.b.a("FetchPanelInfoCacheTask", "Failed: ".concat(String.valueOf(eVar)), null);
        a(new c(this, eVar));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(com.ss.ugc.effectplatform.a aVar, String str, String str2, boolean z, String str3, int i2, int i3) {
        super(str2);
        l.c(aVar, "");
        l.c(str, "");
        l.c(str2, "");
        this.f153907a = aVar;
        this.f153909d = str;
        this.f153908b = str2;
        this.f153910f = z;
        this.f153911g = str3;
        this.f153912h = i2;
        this.f153913i = i3;
    }
}
