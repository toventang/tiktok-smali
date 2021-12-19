package com.ss.android.ugc.aweme.sticker.repository.internals.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.repository.a.aa;
import com.ss.android.ugc.aweme.sticker.repository.a.ad;
import com.ss.android.ugc.aweme.sticker.repository.a.e;
import com.ss.android.ugc.aweme.sticker.repository.a.o;
import com.ss.android.ugc.aweme.sticker.repository.a.q;
import com.ss.android.ugc.aweme.sticker.repository.a.r;
import com.ss.android.ugc.aweme.sticker.repository.a.u;
import com.ss.android.ugc.aweme.sticker.repository.a.v;
import com.ss.android.ugc.aweme.sticker.repository.a.y;
import com.ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ISearchEffectListenerV2;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.android.ugc.effectmanager.effect.model.net.SearchEffectResponseV2;
import com.ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse;
import f.a.t;
import h.a.ag;
import h.f.b.m;
import h.p;
import h.z;

public final class d implements com.ss.android.ugc.aweme.sticker.repository.internals.b {

    /* renamed from: a  reason: collision with root package name */
    public final f.a.l.b<aa<?>> f135591a;

    /* renamed from: b  reason: collision with root package name */
    public final f.a.l.b<aa<?>> f135592b;

    /* renamed from: c  reason: collision with root package name */
    public final f.a.l.b<aa<?>> f135593c;

    /* renamed from: d  reason: collision with root package name */
    public final f.a.l.b<aa<?>> f135594d;

    /* renamed from: e  reason: collision with root package name */
    public final f.a.l.b<p<String, aa<?>>> f135595e;

    /* renamed from: f  reason: collision with root package name */
    public final f.a.l.c<e.a> f135596f;

    /* renamed from: g  reason: collision with root package name */
    public final com.ss.android.ugc.tools.b.a.d f135597g;

    /* renamed from: h  reason: collision with root package name */
    private final h.h f135598h = h.i.a((h.f.a.a) new a(this));

    /* renamed from: i  reason: collision with root package name */
    private final f.a.b.a f135599i;

    /* renamed from: j  reason: collision with root package name */
    private final String f135600j;

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.jedi.a.f.b<z, CategoryEffectModel, com.ss.android.ugc.aweme.sticker.repository.c.a, CategoryEffectModel> f135601k;

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.jedi.a.f.b<z, PanelInfoModel, com.ss.android.ugc.aweme.sticker.repository.c.d, PanelInfoModel> f135602l;

    /* renamed from: m  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.sticker.repository.internals.c f135603m;
    private final h.h<com.ss.android.ugc.aweme.sticker.repository.internals.a> n;
    private final h.h<o> o;
    private final h.h<com.ss.android.ugc.aweme.sticker.repository.a.l> p;
    private final com.ss.android.ugc.aweme.sticker.repository.a.p q;
    private final h.h<r> r;
    private final h.h<v> s;
    private final h.h<com.ss.android.ugc.aweme.sticker.repository.a.j> t;

    static {
        Covode.recordClassIndex(88617);
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.w
    public final com.ss.android.ugc.aweme.sticker.repository.a.p e() {
        return this.q;
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.w
    public final y j() {
        return this.f135603m;
    }

    static final class a extends m implements h.f.a.a<a> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(88618);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a(this.this$0.f135596f);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.w
    public final com.ss.android.ugc.aweme.sticker.repository.a.l c() {
        return this.p.getValue();
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.w
    public final o d() {
        return this.o.getValue();
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.w
    public final com.ss.android.ugc.aweme.sticker.repository.a.h f() {
        return this.n.getValue();
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.w
    public final q g() {
        return this.r.getValue();
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.w
    public final u h() {
        return this.s.getValue();
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.w
    public final com.ss.android.ugc.aweme.sticker.repository.a.j i() {
        return this.t.getValue();
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.internals.b
    public final t<aa<?>> k() {
        t<aa<?>> c2 = this.f135594d.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.internals.b
    public final t<p<String, aa<?>>> l() {
        t<p<String, aa<?>>> c2 = this.f135595e.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.internals.b
    public final t<aa<?>> m() {
        t<aa<?>> c2 = this.f135591a.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.internals.b
    public final t<aa<?>> n() {
        t<aa<?>> c2 = this.f135592b.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.internals.b
    public final t<aa<?>> o() {
        t<aa<?>> c2 = this.f135593c.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.internals.b
    public final t<e.a> p() {
        t<e.a> c2 = this.f135596f.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.w
    public final void a() {
        this.f135592b.onNext(com.ss.android.ugc.aweme.sticker.repository.a.z.f135474a);
        this.f135597g.a(new j(this));
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.w
    public final void b() {
        this.f135597g.destroy();
        this.f135603m.h();
        h.h<com.ss.android.ugc.aweme.sticker.repository.internals.a> hVar = this.n;
        if (hVar.isInitialized()) {
            hVar.getValue().d();
        }
        h.h<com.ss.android.ugc.aweme.sticker.repository.a.j> hVar2 = this.t;
        if (hVar2.isInitialized()) {
            hVar2.getValue().b();
        }
        this.f135599i.dispose();
    }

    static final class i<T> implements f.a.d.f<aa<?>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f135613a;

        static {
            Covode.recordClassIndex(88626);
        }

        i(d dVar) {
            this.f135613a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(aa<?> aaVar) {
            this.f135613a.f135594d.onNext(aaVar);
        }
    }

    public static final class j implements com.ss.ugc.effectplatform.h.e<RecommendSearchWordsResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f135614a;

        static {
            Covode.recordClassIndex(88627);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(d dVar) {
            this.f135614a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.ugc.effectplatform.h.e
        public final /* synthetic */ void onSuccess(RecommendSearchWordsResponse recommendSearchWordsResponse) {
            h.f.b.l.d(recommendSearchWordsResponse, "");
            this.f135614a.f135592b.onNext(new ad(recommendSearchWordsResponse));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
        @Override // com.ss.ugc.effectplatform.h.e
        public final /* synthetic */ void onFail(RecommendSearchWordsResponse recommendSearchWordsResponse, com.ss.ugc.effectplatform.model.e eVar) {
            h.f.b.l.d(eVar, "");
            f.a.l.b<aa<?>> bVar = this.f135614a.f135592b;
            Exception exc = eVar.f153653c;
            if (exc == null) {
                exc = new Exception("search sticker error ,msg :" + eVar.f153652b);
            }
            bVar.onNext(new com.ss.android.ugc.aweme.sticker.repository.a.a(exc));
        }
    }

    public static final class k implements ISearchEffectListenerV2 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f135615a;

        static {
            Covode.recordClassIndex(88628);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(d dVar) {
            this.f135615a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(SearchEffectResponseV2 searchEffectResponseV2) {
            h.f.b.l.d(searchEffectResponseV2, "");
            this.f135615a.f135591a.onNext(new ad(searchEffectResponseV2));
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.ISearchEffectListenerV2
        public final void onFail(ExceptionResult exceptionResult) {
            Exception statusCodeException;
            h.f.b.l.d(exceptionResult, "");
            if (exceptionResult.getException() != null) {
                statusCodeException = exceptionResult.getException();
            } else {
                statusCodeException = new StatusCodeException(exceptionResult.getErrorCode(), "search stickers failed");
            }
            f.a.l.b<aa<?>> bVar = this.f135615a.f135591a;
            h.f.b.l.b(statusCodeException, "");
            bVar.onNext(new com.ss.android.ugc.aweme.sticker.repository.a.a(statusCodeException));
        }
    }

    public static final class l implements ISearchEffectListenerV2 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f135616a;

        static {
            Covode.recordClassIndex(88629);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        l(d dVar) {
            this.f135616a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(SearchEffectResponseV2 searchEffectResponseV2) {
            h.f.b.l.d(searchEffectResponseV2, "");
            this.f135616a.f135591a.onNext(new ad(searchEffectResponseV2));
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.ISearchEffectListenerV2
        public final void onFail(ExceptionResult exceptionResult) {
            Exception statusCodeException;
            h.f.b.l.d(exceptionResult, "");
            if (exceptionResult.getException() != null) {
                statusCodeException = exceptionResult.getException();
            } else {
                statusCodeException = new StatusCodeException(exceptionResult.getErrorCode(), "search stickers failed");
            }
            f.a.l.b<aa<?>> bVar = this.f135616a.f135591a;
            h.f.b.l.b(statusCodeException, "");
            bVar.onNext(new com.ss.android.ugc.aweme.sticker.repository.a.a(statusCodeException));
        }
    }

    static final class c<T, R> implements f.a.d.g<CategoryEffectModel, aa<?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f135606a = new c();

        static {
            Covode.recordClassIndex(88620);
        }

        c() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ aa<?> apply(CategoryEffectModel categoryEffectModel) {
            h.f.b.l.d(categoryEffectModel, "");
            return new ad(categoryEffectModel);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.d$d  reason: collision with other inner class name */
    static final class C3534d<T, R> implements f.a.d.g<Throwable, aa<?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3534d f135607a = new C3534d();

        static {
            Covode.recordClassIndex(88621);
        }

        C3534d() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ aa<?> apply(Throwable th) {
            Throwable th2 = th;
            h.f.b.l.d(th2, "");
            return new com.ss.android.ugc.aweme.sticker.repository.a.a(th2);
        }
    }

    static final class e<T> implements f.a.d.f<aa<?>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f135608a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.repository.c.a f135609b;

        static {
            Covode.recordClassIndex(88622);
        }

        e(d dVar, com.ss.android.ugc.aweme.sticker.repository.c.a aVar) {
            this.f135608a = dVar;
            this.f135609b = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(aa<?> aaVar) {
            this.f135608a.f135595e.onNext(h.v.a(this.f135609b.f135475a, aaVar));
        }
    }

    static final class f<T> implements f.a.d.f<f.a.b.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f135610a;

        static {
            Covode.recordClassIndex(88623);
        }

        f(d dVar) {
            this.f135610a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(f.a.b.b bVar) {
            this.f135610a.f135594d.onNext(com.ss.android.ugc.aweme.sticker.repository.a.z.f135474a);
        }
    }

    static final class g<T, R> implements f.a.d.g<PanelInfoModel, aa<?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f135611a = new g();

        static {
            Covode.recordClassIndex(88624);
        }

        g() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ aa<?> apply(PanelInfoModel panelInfoModel) {
            h.f.b.l.d(panelInfoModel, "");
            return new ad(panelInfoModel);
        }
    }

    static final class h<T, R> implements f.a.d.g<Throwable, aa<?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f135612a = new h();

        static {
            Covode.recordClassIndex(88625);
        }

        h() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ aa<?> apply(Throwable th) {
            Throwable th2 = th;
            h.f.b.l.d(th2, "");
            return new com.ss.android.ugc.aweme.sticker.repository.a.a(th2);
        }
    }

    static final class b<T> implements f.a.d.f<f.a.b.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f135604a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.repository.c.a f135605b;

        static {
            Covode.recordClassIndex(88619);
        }

        b(d dVar, com.ss.android.ugc.aweme.sticker.repository.c.a aVar) {
            this.f135604a = dVar;
            this.f135605b = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(f.a.b.b bVar) {
            this.f135604a.f135595e.onNext(h.v.a(this.f135605b.f135475a, com.ss.android.ugc.aweme.sticker.repository.a.z.f135474a));
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.w
    public final void a(com.ss.android.ugc.aweme.sticker.repository.c.a aVar) {
        h.f.b.l.d(aVar, "");
        this.f135599i.a(this.f135601k.c(aVar).b(f.a.h.a.b(f.a.k.a.f158006c)).c(new b(this, aVar)).d(c.f135606a).f(C3534d.f135607a).d(new e(this, aVar)));
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.w
    public final void a(com.ss.android.ugc.aweme.sticker.repository.c.c cVar) {
        h.f.b.l.d(cVar, "");
        this.f135591a.onNext(com.ss.android.ugc.aweme.sticker.repository.a.z.f135474a);
        this.f135597g.a(cVar.f135485a, cVar.f135486b, cVar.f135487c, cVar.f135488d, cVar.f135489e, new l(this));
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.w
    public final void b(com.ss.android.ugc.aweme.sticker.repository.c.c cVar) {
        h.f.b.l.d(cVar, "");
        this.f135591a.onNext(com.ss.android.ugc.aweme.sticker.repository.a.z.f135474a);
        this.f135597g.a(cVar.f135491g, cVar.f135485a, "word", cVar.f135486b, cVar.f135487c, cVar.f135488d, ag.a(), new k(this));
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.w
    public final void a(com.ss.android.ugc.aweme.sticker.repository.c.d dVar) {
        h.f.b.l.d(dVar, "");
        this.f135599i.a(this.f135602l.c(dVar).b(f.a.h.a.b(f.a.k.a.f158006c)).c(new f(this)).d(g.f135611a).f(h.f135612a).d(new i(this)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.h<? extends com.ss.android.ugc.aweme.sticker.repository.internals.a> */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: h.h<? extends com.ss.android.ugc.aweme.sticker.repository.a.o> */
    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: h.h<? extends com.ss.android.ugc.aweme.sticker.repository.a.l> */
    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: h.h<? extends com.ss.android.ugc.aweme.sticker.repository.a.r> */
    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: h.h<? extends com.ss.android.ugc.aweme.sticker.repository.a.v> */
    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: h.h<? extends com.ss.android.ugc.aweme.sticker.repository.a.j> */
    /* JADX WARN: Multi-variable type inference failed */
    public d(String str, com.ss.android.ugc.tools.b.a.d dVar, com.bytedance.jedi.a.f.b<z, CategoryEffectModel, com.ss.android.ugc.aweme.sticker.repository.c.a, CategoryEffectModel> bVar, com.bytedance.jedi.a.f.b<z, PanelInfoModel, com.ss.android.ugc.aweme.sticker.repository.c.d, PanelInfoModel> bVar2, com.ss.android.ugc.aweme.sticker.repository.internals.c cVar, h.h<? extends com.ss.android.ugc.aweme.sticker.repository.internals.a> hVar, h.h<? extends o> hVar2, h.h<? extends com.ss.android.ugc.aweme.sticker.repository.a.l> hVar3, com.ss.android.ugc.aweme.sticker.repository.a.p pVar, h.h<? extends r> hVar4, h.h<? extends v> hVar5, h.h<? extends com.ss.android.ugc.aweme.sticker.repository.a.j> hVar6) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(bVar2, "");
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(hVar, "");
        h.f.b.l.d(hVar2, "");
        h.f.b.l.d(hVar3, "");
        h.f.b.l.d(pVar, "");
        h.f.b.l.d(hVar4, "");
        h.f.b.l.d(hVar5, "");
        h.f.b.l.d(hVar6, "");
        this.f135600j = str;
        this.f135597g = dVar;
        this.f135601k = bVar;
        this.f135602l = bVar2;
        this.f135603m = cVar;
        this.n = hVar;
        this.o = hVar2;
        this.p = hVar3;
        this.q = pVar;
        this.r = hVar4;
        this.s = hVar5;
        this.t = hVar6;
        f.a.l.b<aa<?>> bVar3 = new f.a.l.b<>();
        h.f.b.l.b(bVar3, "");
        this.f135591a = bVar3;
        f.a.l.b<aa<?>> bVar4 = new f.a.l.b<>();
        h.f.b.l.b(bVar4, "");
        this.f135592b = bVar4;
        f.a.l.b<aa<?>> bVar5 = new f.a.l.b<>();
        h.f.b.l.b(bVar5, "");
        this.f135593c = bVar5;
        f.a.l.b<aa<?>> bVar6 = new f.a.l.b<>();
        h.f.b.l.b(bVar6, "");
        this.f135594d = bVar6;
        f.a.l.b<p<String, aa<?>>> bVar7 = new f.a.l.b<>();
        h.f.b.l.b(bVar7, "");
        this.f135595e = bVar7;
        f.a.l.c<e.a> cVar2 = new f.a.l.c<>();
        h.f.b.l.b(cVar2, "");
        this.f135596f = cVar2;
        cVar.a(this);
        ((v) hVar5.getValue()).a(this);
        this.f135599i = new f.a.b.a();
    }
}
