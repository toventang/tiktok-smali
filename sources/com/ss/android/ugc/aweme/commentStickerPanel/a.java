package com.ss.android.ugc.aweme.commentStickerPanel;

import android.content.Context;
import com.bytedance.als.dsl.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ac;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.t;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.commentStickerPanel.j;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.k.k;
import h.z;

public class a extends com.bytedance.ui_component.b<CommentAndQuestionAndQuestionStickerPanelViewModel> implements com.bytedance.jedi.arch.b, com.bytedance.o.a, d {

    /* renamed from: a  reason: collision with root package name */
    public final CommentVideoModel f73107a;

    /* renamed from: b  reason: collision with root package name */
    public final k f73108b;

    /* renamed from: c  reason: collision with root package name */
    private final h f73109c = i.a((h.f.a.a) new c(this));

    /* renamed from: d  reason: collision with root package name */
    private final h f73110d = i.a((h.f.a.a) new b(this));

    /* renamed from: e  reason: collision with root package name */
    private final h.f.a.a<CommentAndQuestionAndQuestionStickerPanelViewModel> f73111e = new d(this);

    /* renamed from: f  reason: collision with root package name */
    private final f f73112f;

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.scene.group.b f73113k;

    /* renamed from: l  reason: collision with root package name */
    private final int f73114l;

    static {
        Covode.recordClassIndex(45044);
    }

    private final CommentAndQuestionAndQuestionStickerPanelViewModel o() {
        return (CommentAndQuestionAndQuestionStickerPanelViewModel) this.f73110d.getValue();
    }

    public final g a() {
        return (g) this.f73109c.getValue();
    }

    public void a(QaStruct qaStruct) {
        l.d(qaStruct, "");
    }

    @Override // com.ss.android.ugc.aweme.commentStickerPanel.d
    public final void n() {
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<CommentAndQuestionAndQuestionStickerPanelViewModel> b() {
        return this.f73111e;
    }

    @Override // com.bytedance.ui_component.b
    public com.bytedance.scene.group.b e() {
        return this.f73113k;
    }

    @Override // com.ss.android.ugc.aweme.commentStickerPanel.d
    public final void g() {
        c();
    }

    @Override // com.bytedance.o.a
    public f getDiContainer() {
        return this.f73112f;
    }

    /* access modifiers changed from: protected */
    public int m() {
        return this.f73114l;
    }

    static final class c extends m implements h.f.a.a<g> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(45049);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ g invoke() {
            return new g(this.this$0.getDiContainer());
        }
    }

    @Override // com.bytedance.ui_component.b
    public void d() {
        a().a(false);
    }

    @Override // com.ss.android.ugc.aweme.commentStickerPanel.d
    public final CommentAndQuestionAndQuestionStickerPanelViewModel f() {
        CommentAndQuestionAndQuestionStickerPanelViewModel o = o();
        l.b(o, "");
        return o;
    }

    @Override // com.ss.android.ugc.aweme.commentStickerPanel.d
    public final boolean h() {
        return o().h();
    }

    @Override // com.ss.android.ugc.aweme.commentStickerPanel.d
    public final boolean i() {
        return o().i();
    }

    static final class b extends m implements h.f.a.a<CommentAndQuestionAndQuestionStickerPanelViewModel> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(45048);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ CommentAndQuestionAndQuestionStickerPanelViewModel invoke() {
            return t.a(com.bytedance.scene.ktx.c.b(this.this$0.e())).a(CommentAndQuestionAndQuestionStickerPanelViewModel.class);
        }
    }

    static final class d extends m implements h.f.a.a<CommentAndQuestionAndQuestionStickerPanelViewModel> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(45050);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ CommentAndQuestionAndQuestionStickerPanelViewModel invoke() {
            return new CommentAndQuestionAndQuestionStickerPanelViewModel(g.c(this.this$0), this.this$0.f73107a, this.this$0.f73108b);
        }
    }

    @Override // com.bytedance.ui_component.b
    public void c() {
        if (!e().f(a())) {
            e().a(m(), a(), "CommentStickerPanelScene");
        }
        a().a(true);
    }

    @Override // com.bytedance.jedi.arch.b
    public <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.a$a  reason: collision with other inner class name */
    static final class C1629a extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ CommentAndQuestionAndQuestionStickerPanelViewModel $commentStickerPanelViewModel;
        final /* synthetic */ int $commentToComment = 4;
        final /* synthetic */ Context $mContext;
        final /* synthetic */ CommentVideoModel $selectedStickerModel;

        static {
            Covode.recordClassIndex(45045);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1629a(Context context, CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel, CommentVideoModel commentVideoModel) {
            super(1);
            this.$mContext = context;
            this.$commentStickerPanelViewModel = commentAndQuestionAndQuestionStickerPanelViewModel;
            this.$selectedStickerModel = commentVideoModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            String string = this.$mContext.getString(R.string.f3e);
            l.b(string, "");
            bVar2.a(string, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.commentStickerPanel.a.C1629a.AnonymousClass1 */
                final /* synthetic */ C1629a this$0;

                static {
                    Covode.recordClassIndex(45046);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel = this.this$0.$commentStickerPanelViewModel;
                    commentAndQuestionAndQuestionStickerPanelViewModel.a(this.this$0.$selectedStickerModel);
                    commentAndQuestionAndQuestionStickerPanelViewModel.j();
                    commentAndQuestionAndQuestionStickerPanelViewModel.a("replace", this.this$0.$commentToComment);
                    return z.f158842a;
                }
            });
            String string2 = this.$mContext.getString(R.string.f3f);
            l.b(string2, "");
            bVar2.b(string2, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.commentStickerPanel.a.C1629a.AnonymousClass2 */
                final /* synthetic */ C1629a this$0;

                static {
                    Covode.recordClassIndex(45047);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    this.this$0.$commentStickerPanelViewModel.a("cancel", this.this$0.$commentToComment);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    public void a(CommentVideoModel commentVideoModel) {
        l.d(commentVideoModel, "");
        CommentAndQuestionAndQuestionStickerPanelViewModel a2 = a().a();
        if (!a2.f73095f || !j.a.a().getBoolean("comment_panel_first_replace", true)) {
            a2.a(commentVideoModel);
            a2.j();
            return;
        }
        j.a.a().storeBoolean("comment_panel_first_replace", false);
        Context c2 = g.c(this);
        a2.a(4);
        com.bytedance.tux.dialog.b.c.a(new com.bytedance.tux.dialog.b(g.c(this)).b(c2.getString(R.string.f3i)).d(c2.getString(R.string.f3g)), new C1629a(c2, a2, commentVideoModel)).a().b().show();
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, k<S, ? extends ac<? extends A>> kVar, ah<ak<ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    public a(f fVar, com.bytedance.scene.group.b bVar, int i2, CommentVideoModel commentVideoModel, k kVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        l.d(kVar, "");
        this.f73112f = fVar;
        this.f73113k = bVar;
        this.f73114l = i2;
        this.f73107a = commentVideoModel;
        this.f73108b = kVar;
    }
}
