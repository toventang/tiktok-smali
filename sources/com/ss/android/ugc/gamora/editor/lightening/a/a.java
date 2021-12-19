package com.ss.android.ugc.gamora.editor.lightening.a;

import android.text.TextUtils;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
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
import com.bytedance.jedi.arch.t;
import com.bytedance.jedi.arch.v;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.property.ec;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c;
import com.ss.android.ugc.gamora.editor.music.EditMusicViewModel;
import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import com.ss.android.ugc.gamora.editor.z;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.y;

public final class a extends com.bytedance.als.j<com.bytedance.als.b> implements com.bytedance.als.b, com.bytedance.jedi.arch.b, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f146014a = {new y(a.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0), new y(a.class, "compileStickers", "getCompileStickers()Lcom/ss/android/ugc/gamora/editor/ICompileStickers;", 0), new y(a.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new y(a.class, "lighteningPublishApiComponent", "getLighteningPublishApiComponent()Lcom/ss/android/ugc/gamora/editor/lightening/publish/LighteningPublishApiComponent;", 0), new y(a.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0)};

    /* renamed from: b  reason: collision with root package name */
    final h.h.d f146015b = com.bytedance.o.b.a.a(getDiContainer(), z.class);

    /* renamed from: c  reason: collision with root package name */
    final h.h.d f146016c = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.editor.lightening.c.b.class);

    /* renamed from: d  reason: collision with root package name */
    public final com.bytedance.als.l<Boolean> f146017d;

    /* renamed from: e  reason: collision with root package name */
    public final com.bytedance.als.l<Boolean> f146018e;

    /* renamed from: f  reason: collision with root package name */
    public final c f146019f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f146020g;

    /* renamed from: h  reason: collision with root package name */
    public final com.bytedance.scene.group.b f146021h;

    /* renamed from: i  reason: collision with root package name */
    private final com.bytedance.als.b f146022i = this;

    /* renamed from: j  reason: collision with root package name */
    private final SafeHandler f146023j = new SafeHandler(this);

    /* renamed from: k  reason: collision with root package name */
    private final h.h f146024k = h.i.a((h.f.a.a) new C3897a(this));

    /* renamed from: l  reason: collision with root package name */
    private EditMusicViewModel f146025l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h.d f146026m = com.bytedance.o.b.a.a(getDiContainer(), androidx.fragment.app.e.class);
    private final h.h.d n = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);
    private final h.h.d o = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.preview.a.class);
    private final com.bytedance.als.l<Boolean> p;
    private final d q;
    private final com.bytedance.o.f r;
    private final int s = R.id.v9;

    static {
        Covode.recordClassIndex(95964);
    }

    private final EditToolbarViewModel h() {
        return (EditToolbarViewModel) this.f146024k.getValue();
    }

    public final androidx.fragment.app.e a() {
        return (androidx.fragment.app.e) this.f146026m.a(this, f146014a[0]);
    }

    public final VideoPublishEditModel b() {
        return (VideoPublishEditModel) this.n.a(this, f146014a[2]);
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.shortvideo.preview.a c() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.o.a(this, f146014a[4]);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.bytedance.als.j
    public final com.bytedance.als.b getApiComponent() {
        return this.f146022i;
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.r;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    static final class g implements com.ss.android.ugc.aweme.shortvideo.mvtemplate.b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f146031a;

        static {
            Covode.recordClassIndex(95971);
        }

        g(a aVar) {
            this.f146031a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.b.a
        public final void a() {
            this.f146031a.d();
        }
    }

    static final class i implements com.ss.android.ugc.aweme.shortvideo.mvtemplate.b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f146033a;

        static {
            Covode.recordClassIndex(95973);
        }

        i(a aVar) {
            this.f146033a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.b.a
        public final void a() {
            this.f146033a.d();
        }
    }

    @Override // com.bytedance.jedi.arch.v
    public final m getLifecycleOwner() {
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

    static final /* synthetic */ class l extends h.f.b.j implements h.f.a.a<h.z> {
        static {
            Covode.recordClassIndex(95977);
        }

        l(a aVar) {
            super(0, aVar, a.class, "next", "next()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            ((a) this.receiver).c().N();
            return h.z.f158842a;
        }
    }

    public final void d() {
        this.f146023j.post(new j(this));
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.asve.editor.g e() {
        return c().C().getValue();
    }

    @Override // com.bytedance.als.j
    public final void onResume() {
        super.onResume();
        if (cr.a().f125295a != null) {
            f();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.a.a$a  reason: collision with other inner class name */
    static final class C3897a extends h.f.b.m implements h.f.a.a<EditToolbarViewModel> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(95965);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3897a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditToolbarViewModel invoke() {
            JediViewModel a2 = t.a(this.this$0.a()).a(EditToolbarViewModel.class);
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f146034a;

        static {
            Covode.recordClassIndex(95974);
        }

        j(a aVar) {
            this.f146034a = aVar;
        }

        public final void run() {
            a aVar = this.f146034a;
            ((z) aVar.f146015b.a(aVar, a.f146014a[1])).a(new Runnable(this) {
                /* class com.ss.android.ugc.gamora.editor.lightening.a.a.j.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ j f146035a;

                static {
                    Covode.recordClassIndex(95975);
                }

                {
                    this.f146035a = r1;
                }

                public final void run() {
                    a aVar = this.f146035a.f146034a;
                    ((com.ss.android.ugc.gamora.editor.lightening.c.b) aVar.f146016c.a(aVar, a.f146014a[3])).a();
                }
            });
        }
    }

    public final void f() {
        this.f146017d.b(Boolean.valueOf(com.ss.android.ugc.gamora.editor.lightening.a.b(b())));
    }

    public final void g() {
        if (ec.a()) {
            this.p.b(Boolean.valueOf(i()));
        }
    }

    private final boolean i() {
        if (b().mIsFromDraft || !this.f146017d.f6468a.getValue().booleanValue()) {
            return false;
        }
        if (n.b("slide_right", "click_upper_left_camera", "click_west_window_camera", "click_head_plus", "click_story_bottom_camera", "click_intro", "click_fullscreen_intro", "click_story_label").contains(b().shootEnterMethod)) {
            return true;
        }
        if (!h.f.b.l.a((Object) es.e(b()), (Object) "fast_shoot") || b().mOrigin != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        JediViewModel a2 = t.a(a()).a(EditMusicViewModel.class);
        h.f.b.l.b(a2, "");
        this.f146025l = (EditMusicViewModel) a2;
        this.f146021h.a(this.s, this.f146019f, "StoryEditBottomBarScene");
        g();
        this.f146017d.a(this, new b(this));
        h().j().observe(this, new c(this));
        EditMusicViewModel editMusicViewModel = this.f146025l;
        if (editMusicViewModel == null) {
            h.f.b.l.a("musicViewModel");
        }
        subscribeMultiEvent(editMusicViewModel, b.f146036a, new ah(), new d(this));
        f();
        h().g().observe(this, new e(this));
    }

    static final /* synthetic */ class k extends h.f.b.j implements h.f.a.a<h.z> {
        static {
            Covode.recordClassIndex(95976);
        }

        k(a aVar) {
            super(0, aVar, a.class, "publish", "publish()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            String str;
            a aVar = (a) this.receiver;
            if (com.ss.android.ugc.aweme.port.in.g.a().o().e()) {
                AVExternalServiceImpl.a().storyService().showPublishingToast(aVar.a());
            } else if (!aVar.f146020g) {
                aVar.f146020g = true;
                com.ss.android.ugc.asve.editor.g value = aVar.c().C().getValue();
                if (value != null) {
                    aVar.b().getPreviewInfo().setPreviewVideoLength(value.j());
                }
                if (aVar.b().mIsFromDraft && aVar.b().isDraftMusicIllegal && cr.a().f125295a != null) {
                    aVar.b().isDraftMusicIllegal = false;
                }
                if (aVar.b().isMvThemeVideoType()) {
                    if (TextUtils.isEmpty(aVar.b().mvCreateVideoData.videoCoverImgPath)) {
                        aVar.b().mvCreateVideoData.videoCoverImgPath = com.ss.android.ugc.aweme.port.in.l.f115658a.d().a().a();
                    }
                    new com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c(aVar.e(), aVar.b().mvCreateVideoData.videoCoverImgPath, aVar.b().mvCreateVideoData.videoCoverStartTime, new f(aVar), new g(aVar));
                } else if (!aVar.b().isMultiVideoEdit() || !es.j(aVar.b())) {
                    aVar.d();
                } else {
                    MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = aVar.b().multiEditVideoRecordData;
                    if (multiEditVideoStatusRecordData != null && ((str = multiEditVideoStatusRecordData.coverImagePath) == null || str.length() == 0)) {
                        multiEditVideoStatusRecordData.coverImagePath = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d.a();
                    }
                    new com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c(aVar.e(), aVar.b().multiEditVideoRecordData.coverImagePath, (int) aVar.b().getMultiEditVideoStartTime(), new h(aVar), new i(aVar));
                }
            }
            return h.z.f158842a;
        }
    }

    static final class b<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f146027a;

        static {
            Covode.recordClassIndex(95966);
        }

        b(a aVar) {
            this.f146027a = aVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f146027a.g();
        }
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class e<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f146029a;

        static {
            Covode.recordClassIndex(95969);
        }

        e(a aVar) {
            this.f146029a = aVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                this.f146029a.f146018e.b(Boolean.valueOf(bool.booleanValue()));
            }
        }
    }

    static final class f implements c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f146030a;

        static {
            Covode.recordClassIndex(95970);
        }

        f(a aVar) {
            this.f146030a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c.b
        public final void a(String str) {
            com.ss.android.ugc.aweme.port.in.g.a().I().a(str);
            this.f146030a.f146020g = false;
        }
    }

    static final class h implements c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f146032a;

        static {
            Covode.recordClassIndex(95972);
        }

        h(a aVar) {
            this.f146032a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c.b
        public final void a(String str) {
            com.ss.android.ugc.aweme.port.in.g.a().I().a(str);
            this.f146032a.f146020g = false;
        }
    }

    static final class c<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f146028a;

        static {
            Covode.recordClassIndex(95967);
        }

        c(a aVar) {
            this.f146028a = aVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                return;
            }
            if (bool.booleanValue()) {
                this.f146028a.f146021h.e(this.f146028a.f146019f);
            } else {
                this.f146028a.f146021h.d(this.f146028a.f146019f);
            }
        }
    }

    static final class d extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.ss.android.ugc.aweme.shortvideo.c, h.z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(95968);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, com.ss.android.ugc.aweme.shortvideo.c cVar) {
            h.f.b.l.d(bVar, "");
            this.this$0.f();
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    public a(com.bytedance.o.f fVar, com.bytedance.scene.group.b bVar) {
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(bVar, "");
        this.r = fVar;
        this.f146021h = bVar;
        com.bytedance.als.l<Boolean> lVar = new com.bytedance.als.l<>(true);
        this.f146017d = lVar;
        com.bytedance.als.l<Boolean> lVar2 = new com.bytedance.als.l<>(true);
        this.f146018e = lVar2;
        com.bytedance.als.l<Boolean> lVar3 = new com.bytedance.als.l<>(false);
        this.p = lVar3;
        d dVar = new d();
        h.f.b.l.d(lVar, "");
        dVar.f146054a = lVar;
        h.f.b.l.d(lVar2, "");
        dVar.f146055b = lVar2;
        h.f.b.l.d(lVar3, "");
        dVar.f146056c = lVar3;
        k kVar = new k(this);
        h.f.b.l.d(kVar, "");
        dVar.f146057d = kVar;
        l lVar4 = new l(this);
        h.f.b.l.d(lVar4, "");
        dVar.f146058e = lVar4;
        this.q = dVar;
        this.f146019f = new c(dVar, getDiContainer());
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends ac<? extends A>> kVar, ah<ak<ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, h.z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, h.z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, h.z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, h.z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
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
