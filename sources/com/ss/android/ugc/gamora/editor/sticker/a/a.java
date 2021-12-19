package com.ss.android.ugc.gamora.editor.sticker.a;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.k;
import com.bytedance.jedi.arch.t;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.gamora.editor.EditCommentStickerViewModel;
import com.ss.android.ugc.gamora.editor.sticker.qa.EditPageQaStickerViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import h.i;
import h.m;
import h.z;
import java.util.Objects;

public final class a extends com.ss.android.ugc.aweme.commentStickerPanel.a {

    /* renamed from: c  reason: collision with root package name */
    public boolean f146381c;

    /* renamed from: d  reason: collision with root package name */
    public EditCommentStickerViewModel f146382d;

    /* renamed from: e  reason: collision with root package name */
    public EditPageQaStickerViewModel f146383e;

    /* renamed from: f  reason: collision with root package name */
    public final VideoPublishEditModel f146384f;

    /* renamed from: k  reason: collision with root package name */
    private final h f146385k = i.a(m.NONE, new C3917a(this));

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.o.f f146386l;

    /* renamed from: m  reason: collision with root package name */
    private final com.bytedance.scene.group.b f146387m;
    private final int n;

    static {
        Covode.recordClassIndex(96235);
    }

    private final com.ss.android.ugc.aweme.shortvideo.preview.a o() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.f146385k.getValue();
    }

    @Override // com.bytedance.ui_component.b, com.ss.android.ugc.aweme.commentStickerPanel.a
    public final com.bytedance.scene.group.b e() {
        return this.f146387m;
    }

    @Override // com.bytedance.o.a, com.ss.android.ugc.aweme.commentStickerPanel.a
    public final com.bytedance.o.f getDiContainer() {
        return this.f146386l;
    }

    @Override // com.ss.android.ugc.aweme.commentStickerPanel.a
    public final int m() {
        return this.n;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.a.a$a  reason: collision with other inner class name */
    public static final class C3917a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.preview.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96236);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3917a(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.shortvideo.preview.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.ss.android.ugc.aweme.shortvideo.preview.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.a.a.C3917a.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.bytedance.ui_component.b, com.ss.android.ugc.aweme.commentStickerPanel.a
    public final void c() {
        o().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, false, false);
        EditCommentStickerViewModel editCommentStickerViewModel = this.f146382d;
        if (editCommentStickerViewModel == null) {
            l.a("commentStickerViewModel");
        }
        editCommentStickerViewModel.a(0.3137255f);
        super.c();
    }

    @Override // com.bytedance.ui_component.b, com.ss.android.ugc.aweme.commentStickerPanel.a
    public final void d() {
        o().a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, false, true);
        EditCommentStickerViewModel editCommentStickerViewModel = this.f146382d;
        if (editCommentStickerViewModel == null) {
            l.a("commentStickerViewModel");
        }
        editCommentStickerViewModel.a(1.0f);
        super.d();
    }

    @Override // com.bytedance.ui_component.b, com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        Activity b2 = com.bytedance.als.dsl.g.b(this);
        Objects.requireNonNull(b2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = t.a((androidx.fragment.app.e) b2).a(EditCommentStickerViewModel.class);
        l.b(a2, "");
        EditCommentStickerViewModel editCommentStickerViewModel = (EditCommentStickerViewModel) a2;
        this.f146382d = editCommentStickerViewModel;
        if (editCommentStickerViewModel == null) {
            l.a("commentStickerViewModel");
        }
        Activity b3 = com.bytedance.als.dsl.g.b(this);
        Objects.requireNonNull(b3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        f.a.b.b unused = editCommentStickerViewModel.b((androidx.fragment.app.e) b3, b.f146390a, new ah(), new d(this));
        f().a();
        a().f73178i.a(this, new e(this));
        b.a.b(this, f(), c.f146391a, new f(this));
        b.a.b(this, f(), d.f146392a, new g(this));
    }

    public static final /* synthetic */ EditPageQaStickerViewModel a(a aVar) {
        EditPageQaStickerViewModel editPageQaStickerViewModel = aVar.f146383e;
        if (editPageQaStickerViewModel == null) {
            l.a("qaStickerViewModel");
        }
        return editPageQaStickerViewModel;
    }

    static final class d extends h.f.b.m implements h.f.a.b<k, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(96243);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(k kVar) {
            boolean z;
            T t;
            k kVar2 = kVar;
            a aVar = this.this$0;
            if (kVar2 == null || (t = kVar2.f39404b) == null) {
                z = false;
            } else {
                z = t.booleanValue();
            }
            aVar.f146381c = z;
            return z.f158842a;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ EditPageQaStickerViewModel $qaStickerViewModel;
        final /* synthetic */ int $qaToComment = 2;
        final /* synthetic */ CommentVideoModel $selectedStickerModel;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(96237);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, EditPageQaStickerViewModel editPageQaStickerViewModel, CommentVideoModel commentVideoModel) {
            super(1);
            this.this$0 = aVar;
            this.$qaStickerViewModel = editPageQaStickerViewModel;
            this.$selectedStickerModel = commentVideoModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            String string = com.bytedance.als.dsl.g.c(this.this$0).getString(R.string.f3e);
            l.b(string, "");
            bVar2.a(string, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.gamora.editor.sticker.a.a.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(96238);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    this.this$0.$qaStickerViewModel.k().d().d();
                    CommentAndQuestionAndQuestionStickerPanelViewModel f2 = this.this$0.this$0.f();
                    f2.a(this.this$0.$selectedStickerModel);
                    f2.j();
                    f2.a(this.this$0.$selectedStickerModel, f2.f73092c.getTabName(), "replace");
                    f2.a("replace", this.this$0.$qaToComment);
                    return z.f158842a;
                }
            });
            String string2 = com.bytedance.als.dsl.g.c(this.this$0).getString(R.string.f3f);
            l.b(string2, "");
            bVar2.b(string2, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.gamora.editor.sticker.a.a.b.AnonymousClass2 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(96239);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    EditPageQaStickerViewModel editPageQaStickerViewModel = this.this$0.$qaStickerViewModel;
                    int i2 = this.this$0.$qaToComment;
                    l.d("cancel", "");
                    com.ss.android.ugc.aweme.qasticker.a aVar2 = editPageQaStickerViewModel.f146782b;
                    l.d("cancel", "");
                    VideoPublishEditModel videoPublishEditModel = aVar2.f119162b;
                    if (videoPublishEditModel != null) {
                        r.a("replace_question_confirm", new com.ss.android.ugc.tools.f.b().a("creation_id", videoPublishEditModel.creationId).a("enter_from", "video_edit_page").a("shoot_way", videoPublishEditModel.mShootWay).a("target", "cancel").a(StringSet.type, i2).f149193a);
                    }
                    this.this$0.this$0.f().a(this.this$0.$selectedStickerModel, this.this$0.this$0.f().f73092c.getTabName(), "cancel");
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ QaStruct $selectedStickerModel;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(96240);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, QaStruct qaStruct) {
            super(1);
            this.this$0 = aVar;
            this.$selectedStickerModel = qaStruct;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            String string = com.bytedance.als.dsl.g.c(this.this$0).getString(R.string.f3e);
            l.b(string, "");
            bVar2.a(string, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.gamora.editor.sticker.a.a.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(96241);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    a.a(this.this$0.this$0).k().d().d();
                    CommentAndQuestionAndQuestionStickerPanelViewModel f2 = this.this$0.this$0.f();
                    f2.k();
                    EditCommentStickerViewModel editCommentStickerViewModel = this.this$0.this$0.f146382d;
                    if (editCommentStickerViewModel == null) {
                        l.a("commentStickerViewModel");
                    }
                    editCommentStickerViewModel.g();
                    a.a(this.this$0.this$0).a(this.this$0.$selectedStickerModel);
                    f2.b();
                    return z.f158842a;
                }
            });
            String string2 = com.bytedance.als.dsl.g.c(this.this$0).getString(R.string.f3f);
            l.b(string2, "");
            bVar2.b(string2, AnonymousClass2.f146388a);
            return z.f158842a;
        }
    }

    static final class e<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f146389a;

        static {
            Covode.recordClassIndex(96244);
        }

        e(a aVar) {
            this.f146389a = aVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f146389a.f146384f.commentVideoModel = this.f146389a.a().d();
            this.f146389a.f146384f.commentVideoModel.setShootWay("edit_panel");
            this.f146389a.f().f73097l.setValue(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.commentStickerPanel.a
    public final void a(CommentVideoModel commentVideoModel) {
        l.d(commentVideoModel, "");
        Activity b2 = com.bytedance.als.dsl.g.b(this);
        Objects.requireNonNull(b2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = t.a((androidx.fragment.app.e) b2).a(EditPageQaStickerViewModel.class);
        l.b(a2, "");
        EditPageQaStickerViewModel editPageQaStickerViewModel = (EditPageQaStickerViewModel) a2;
        if (editPageQaStickerViewModel.k().d().b()) {
            CommentAndQuestionAndQuestionStickerPanelViewModel f2 = f();
            f2.a(commentVideoModel, f2.f73092c.getTabName());
            f2.a(2);
            com.bytedance.tux.dialog.b.c.a(new com.bytedance.tux.dialog.b(com.bytedance.als.dsl.g.c(this)).b(com.bytedance.als.dsl.g.c(this).getString(R.string.f6q)).d(com.bytedance.als.dsl.g.c(this).getString(R.string.f6p)), new b(this, editPageQaStickerViewModel, commentVideoModel)).a().b().show();
            return;
        }
        super.a(commentVideoModel);
    }

    @Override // com.ss.android.ugc.aweme.commentStickerPanel.a
    public final void a(QaStruct qaStruct) {
        l.d(qaStruct, "");
        Activity b2 = com.bytedance.als.dsl.g.b(this);
        Objects.requireNonNull(b2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = t.a((androidx.fragment.app.e) b2).a(EditPageQaStickerViewModel.class);
        l.b(a2, "");
        EditPageQaStickerViewModel editPageQaStickerViewModel = (EditPageQaStickerViewModel) a2;
        this.f146383e = editPageQaStickerViewModel;
        if (editPageQaStickerViewModel == null) {
            l.a("qaStickerViewModel");
        }
        if (editPageQaStickerViewModel.k().d().b()) {
            EditPageQaStickerViewModel editPageQaStickerViewModel2 = this.f146383e;
            if (editPageQaStickerViewModel2 == null) {
                l.a("qaStickerViewModel");
            }
            editPageQaStickerViewModel2.k().d().d();
            EditPageQaStickerViewModel editPageQaStickerViewModel3 = this.f146383e;
            if (editPageQaStickerViewModel3 == null) {
                l.a("qaStickerViewModel");
            }
            editPageQaStickerViewModel3.a(qaStruct);
            f().b();
        } else if (this.f146381c) {
            com.bytedance.tux.dialog.b.c.a(new com.bytedance.tux.dialog.b(com.bytedance.als.dsl.g.c(this)).b(com.bytedance.als.dsl.g.c(this).getString(R.string.f6q)).d(com.bytedance.als.dsl.g.c(this).getString(R.string.f6p)), new c(this, qaStruct)).a().b().show();
        } else {
            EditPageQaStickerViewModel editPageQaStickerViewModel4 = this.f146383e;
            if (editPageQaStickerViewModel4 == null) {
                l.a("qaStickerViewModel");
            }
            editPageQaStickerViewModel4.a(qaStruct);
            f().b();
        }
    }

    static final class f extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, CommentVideoModel, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(96245);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, CommentVideoModel commentVideoModel) {
            CommentVideoModel commentVideoModel2 = commentVideoModel;
            l.d(bVar, "");
            l.d(commentVideoModel2, "");
            this.this$0.a(commentVideoModel2);
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, QaStruct, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(96246);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, QaStruct qaStruct) {
            QaStruct qaStruct2 = qaStruct;
            l.d(bVar, "");
            l.d(qaStruct2, "");
            this.this$0.a(qaStruct2);
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(com.bytedance.o.f fVar, com.bytedance.scene.group.b bVar, int i2, VideoPublishEditModel videoPublishEditModel) {
        super(fVar, bVar, i2, videoPublishEditModel.commentVideoModel, new com.ss.android.ugc.aweme.commentStickerPanel.k(null, videoPublishEditModel, false, 1));
        l.d(fVar, "");
        l.d(bVar, "");
        l.d(videoPublishEditModel, "");
        this.f146386l = fVar;
        this.f146387m = bVar;
        this.n = i2;
        this.f146384f = videoPublishEditModel;
        com.ss.android.ugc.aweme.commentStickerPanel.net.a.f73278f = videoPublishEditModel.creationId;
    }
}
