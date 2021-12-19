package com.ss.android.ugc.aweme.z;

import com.bytedance.als.j;
import com.bytedance.als.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.creativex.recorder.b.a.t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ac;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.p;
import com.bytedance.jedi.arch.v;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.y;
import h.k.i;
import h.k.k;
import h.z;

public final class d extends j<a> implements com.bytedance.jedi.arch.b, com.bytedance.o.a, a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f145323a = {new y(d.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new y(d.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new y(d.class, "commentAndQuestionStickerPanelApi", "getCommentAndQuestionStickerPanelApi()Lcom/ss/android/ugc/aweme/commentStickerPanel/CommentAndQuestionStickerPanelApi;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public final a f145324b = this;

    /* renamed from: c  reason: collision with root package name */
    public final com.bytedance.scene.group.b f145325c;

    /* renamed from: d  reason: collision with root package name */
    private final l<Boolean> f145326d = new l<>(false);

    /* renamed from: e  reason: collision with root package name */
    private final h.h.d f145327e = com.bytedance.o.b.a.a(getDiContainer(), m.class);

    /* renamed from: f  reason: collision with root package name */
    private final h.h.d f145328f = com.bytedance.o.b.a.a(getDiContainer(), ShortVideoContext.class);

    /* renamed from: g  reason: collision with root package name */
    private final h.h.d f145329g = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.commentStickerPanel.d.class);

    /* renamed from: h  reason: collision with root package name */
    private f f145330h;

    /* renamed from: i  reason: collision with root package name */
    private final f f145331i;

    /* renamed from: j  reason: collision with root package name */
    private final CommentVideoModel f145332j;

    static {
        Covode.recordClassIndex(95018);
    }

    private final com.ss.android.ugc.aweme.commentStickerPanel.d b() {
        return (com.ss.android.ugc.aweme.commentStickerPanel.d) this.f145329g.a(this, f145323a[2]);
    }

    public final ShortVideoContext a() {
        return (ShortVideoContext) this.f145328f.a(this, f145323a[1]);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ a getApiComponent() {
        return this.f145324b;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f145331i;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return b.a.a(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        if (CommentUtils.isDataValid(this.f145332j)) {
            f fVar = new f(this.f145332j);
            this.f145330h = fVar;
            this.f145325c.a(R.id.dj5, fVar, "RecordCommentStickerScene");
            a(true);
        }
        this.f145326d.a(this, new a(this));
        ((m) this.f145327e.a(this, f145323a[0])).o().a(this, new b(this));
        CommentAndQuestionAndQuestionStickerPanelViewModel f2 = b().f();
        f2.f73097l.observe(this, new c(this, f2));
        f.a.b.b unused = selectSubscribe(b().f(), e.f145337a, new ah(), new C3864d(this));
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class a<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f145333a;

        static {
            Covode.recordClassIndex(95019);
        }

        a(d dVar) {
            this.f145333a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                com.bytedance.scene.ktx.a.a(this.f145333a.f145325c, "RecordCommentStickerScene");
            } else {
                com.bytedance.scene.ktx.a.b(this.f145333a.f145325c, "RecordCommentStickerScene");
            }
        }
    }

    static final class c<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f145335a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentAndQuestionAndQuestionStickerPanelViewModel f145336b;

        static {
            Covode.recordClassIndex(95021);
        }

        c(d dVar, CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel) {
            this.f145335a = dVar;
            this.f145336b = commentAndQuestionAndQuestionStickerPanelViewModel;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f145336b.b();
            d dVar = this.f145335a;
            dVar.a(dVar.a().f124767l);
        }
    }

    @Override // com.ss.android.ugc.aweme.z.a
    public final void a(boolean z) {
        this.f145326d.b(Boolean.valueOf(z));
    }

    static final class b<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f145334a;

        static {
            Covode.recordClassIndex(95020);
        }

        b(d dVar) {
            this.f145334a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            t tVar = (t) obj;
            if (tVar != null && tVar.f28205a.isEmpty() && tVar.f28206b == 0 && !this.f145334a.a().f124757b.f124714i && tVar.f28208d) {
                this.f145334a.a(true);
            }
        }
    }

    public final void a(CommentVideoModel commentVideoModel) {
        if (this.f145330h == null) {
            this.f145330h = new f(commentVideoModel);
        }
        f fVar = this.f145330h;
        if (fVar != null) {
            if (this.f145325c.f(fVar)) {
                com.bytedance.scene.group.b bVar = this.f145325c;
                f fVar2 = this.f145330h;
                if (fVar2 == null) {
                    h.f.b.l.b();
                }
                bVar.c(fVar2);
            }
            f fVar3 = new f(commentVideoModel);
            this.f145330h = fVar3;
            this.f145325c.a(R.id.dj5, fVar3, "RecordCommentStickerScene");
            a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.z.d$d  reason: collision with other inner class name */
    static final class C3864d extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, p, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(95022);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3864d(d dVar) {
            super(2);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, p pVar) {
            h.f.b.l.d(iVar, "");
            if (pVar != null) {
                this.this$0.a((CommentVideoModel) null);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    public d(com.bytedance.scene.group.b bVar, f fVar, CommentVideoModel commentVideoModel) {
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(fVar, "");
        this.f145325c = bVar;
        this.f145331i = fVar;
        this.f145332j = commentVideoModel;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, k<S, ? extends ac<? extends A>> kVar, ah<ak<ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
