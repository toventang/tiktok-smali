package com.ss.android.ugc.gamora.recorder.c;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.b;
import com.bytedance.tux.dialog.a;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel;
import com.ss.android.ugc.aweme.commentStickerPanel.k;
import com.ss.android.ugc.aweme.commentStickerPanel.net.CommentStickerPanelRequestApi;
import com.ss.android.ugc.aweme.setting.EoyHighlightConfig;
import com.ss.android.ugc.aweme.setting.t;
import com.ss.android.ugc.aweme.setting.x;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.utils.hk;
import com.ss.android.ugc.aweme.view.b;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.z;

public final class b extends com.ss.android.ugc.aweme.commentStickerPanel.a {

    /* renamed from: c  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f147489c = {new y(b.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new y(b.class, "recordControlProgressComponent", "getRecordControlProgressComponent()Lcom/ss/android/ugc/gamora/recorder/progress/ControlProgressApiComponent;", 0), new y(b.class, "recordBottomTabComponent", "getRecordBottomTabComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new y(b.class, "recordQaStickerApi", "getRecordQaStickerApi()Lcom/ss/android/ugc/aweme/qa_sticker/RecordQaStickerApi;", 0), new y(b.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0)};

    /* renamed from: d  reason: collision with root package name */
    public boolean f147490d;

    /* renamed from: e  reason: collision with root package name */
    public final ShortVideoContext f147491e;

    /* renamed from: f  reason: collision with root package name */
    private final h.h.d f147492f;

    /* renamed from: k  reason: collision with root package name */
    private final h.h.d f147493k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h.d f147494l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h.d f147495m;
    private final h.h.d n;
    private boolean o;
    private final h.h p;
    private final com.bytedance.scene.group.b q;
    private final com.bytedance.o.f r;
    private final int s = R.id.dj5;

    static {
        Covode.recordClassIndex(97182);
    }

    private final com.ss.android.ugc.aweme.shortvideo.h.a r() {
        return (com.ss.android.ugc.aweme.shortvideo.h.a) this.f147492f.a(this, f147489c[0]);
    }

    private final com.ss.android.ugc.gamora.recorder.k.a s() {
        return (com.ss.android.ugc.gamora.recorder.k.a) this.f147493k.a(this, f147489c[1]);
    }

    private final com.ss.android.ugc.gamora.recorder.b.b t() {
        return (com.ss.android.ugc.gamora.recorder.b.b) this.f147494l.a(this, f147489c[2]);
    }

    public final com.ss.android.ugc.aweme.cg.a o() {
        return (com.ss.android.ugc.aweme.cg.a) this.f147495m.a(this, f147489c[3]);
    }

    public final j p() {
        return (j) this.n.a(this, f147489c[4]);
    }

    public final com.ss.android.ugc.aweme.view.b q() {
        return (com.ss.android.ugc.aweme.view.b) this.p.getValue();
    }

    @Override // com.bytedance.ui_component.b, com.ss.android.ugc.aweme.commentStickerPanel.a
    public final com.bytedance.scene.group.b e() {
        return this.q;
    }

    @Override // com.bytedance.o.a, com.ss.android.ugc.aweme.commentStickerPanel.a
    public final com.bytedance.o.f getDiContainer() {
        return this.r;
    }

    @Override // com.ss.android.ugc.aweme.commentStickerPanel.a
    public final int m() {
        return this.s;
    }

    static final class f extends m implements h.f.a.a<com.ss.android.ugc.aweme.view.b> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(97194);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.view.b invoke() {
            return new com.ss.android.ugc.aweme.view.b(com.bytedance.als.dsl.g.b(this.this$0), b.a.VISIBLE_AFTER_5S, (byte) 0);
        }
    }

    @Override // com.bytedance.ui_component.b, com.ss.android.ugc.aweme.commentStickerPanel.a
    public final void d() {
        r().a(true, false);
        s().c(true);
        t().showBottomTab(true);
        if (this.o) {
            t().showComplexTab(0, null);
            this.o = false;
        }
        super.d();
    }

    @Override // com.bytedance.ui_component.b, com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        a().f73178i.a(this, new g(this));
        b.a.b(this, f(), c.f147501a, new h(this));
        b.a.b(this, f(), d.f147502a, new i(this));
        f().a();
    }

    @Override // com.bytedance.ui_component.b, com.bytedance.als.j
    public final void onDestroy() {
        com.ss.android.ugc.aweme.commentStickerPanel.net.a.f73274b.clear();
        com.ss.android.ugc.aweme.commentStickerPanel.net.a.f73275c.clear();
        com.ss.android.ugc.aweme.commentStickerPanel.net.a.f73276d = false;
        com.ss.android.ugc.aweme.commentStickerPanel.net.a.f73277e.a((Boolean) false);
        com.ss.android.ugc.aweme.commentStickerPanel.net.a.f73278f = null;
        com.ss.android.ugc.aweme.commentStickerPanel.net.a.f73273a = new CommentStickerPanelRequestApi();
        super.onDestroy();
    }

    private final void u() {
        if (!com.bytedance.als.dsl.g.b(this).isFinishing()) {
            com.ss.android.ugc.aweme.view.b q2 = q();
            q2.setCancelable(false);
            q2.setOnCancelListener(new d(this));
            q2.show();
            this.f147490d = false;
            a aVar = new a(p());
            EoyHighlightConfig eoyHighlightConfig = x.f123067b;
            if (eoyHighlightConfig == null) {
                l.b();
            }
            String effectId = eoyHighlightConfig.getEffectId();
            if (effectId == null) {
                l.b();
            }
            Object a2 = getDiContainer().a(androidx.appcompat.app.d.class);
            l.b(a2, "");
            aVar.a(effectId, new com.ss.android.ugc.gamora.recorder.sticker.c.b.b((androidx.appcompat.app.d) a2, this.f147491e, p()).f(), new e(this));
        }
    }

    @Override // com.bytedance.ui_component.b, com.ss.android.ugc.aweme.commentStickerPanel.a
    public final void c() {
        T value;
        r().a(false, true);
        s().c(false);
        t().showBottomTab(false);
        com.bytedance.als.l<Integer> complexTabVisibility = t().getComplexTabVisibility();
        if (!(complexTabVisibility == null || (value = complexTabVisibility.f6468a.getValue()) == null || value.intValue() != 0)) {
            t().showComplexTab(8, null);
            this.o = true;
        }
        t().showComplexTab(8, null);
        super.c();
    }

    /* access modifiers changed from: package-private */
    public static final class d implements DialogInterface.OnCancelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f147498a;

        static {
            Covode.recordClassIndex(97192);
        }

        d(b bVar) {
            this.f147498a = bVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            this.f147498a.f147490d = true;
        }
    }

    public static final class e implements IEffectDownloadProgressListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f147499a;

        static {
            Covode.recordClassIndex(97193);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(b bVar) {
            this.f147499a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            this.f147499a.q().dismiss();
            if (effect != null && !this.f147499a.f147490d) {
                this.f147499a.f147491e.W = true;
                FaceStickerBean.sCurPropSource = "qa_prop";
                this.f147499a.p().f(true);
                com.ss.android.ugc.aweme.sticker.f.e.a(this.f147499a.p(), n.a(effect), true, true, null, 0, null, 1016);
            }
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            l.d(exceptionResult, "");
            this.f147499a.q().dismiss();
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
        public final void onProgress(Effect effect, int i2, long j2) {
            this.f147499a.q().setProgress(i2);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.b$b  reason: collision with other inner class name */
    static final class C3960b extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ QaStruct $selectedStickerModel;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(97186);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3960b(b bVar, QaStruct qaStruct) {
            super(1);
            this.this$0 = bVar;
            this.$selectedStickerModel = qaStruct;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(R.string.f6o, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.gamora.recorder.c.b.C3960b.AnonymousClass1 */
                final /* synthetic */ C3960b this$0;

                static {
                    Covode.recordClassIndex(97187);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    com.ss.android.ugc.aweme.cg.a o = this.this$0.this$0.o();
                    if (o != null) {
                        o.b();
                    }
                    com.ss.android.ugc.aweme.cg.a o2 = this.this$0.this$0.o();
                    if (o2 != null) {
                        o2.a(this.this$0.$selectedStickerModel);
                    }
                    this.this$0.this$0.f().b();
                    this.this$0.this$0.b(this.this$0.$selectedStickerModel);
                    return z.f158842a;
                }
            });
            bVar2.b(R.string.a9e, AnonymousClass2.f147496a);
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ QaStruct $selectedStickerModel;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(97189);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, QaStruct qaStruct) {
            super(1);
            this.this$0 = bVar;
            this.$selectedStickerModel = qaStruct;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(R.string.f6o, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.gamora.recorder.c.b.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f147497a;

                static {
                    Covode.recordClassIndex(97190);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f147497a = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    this.f147497a.this$0.f().b();
                    this.f147497a.this$0.f().k();
                    this.f147497a.this$0.f().c(CommentAndQuestionAndQuestionStickerPanelViewModel.n.f73103a);
                    this.f147497a.this$0.f147491e.f124767l = null;
                    com.ss.android.ugc.aweme.cg.a o = this.f147497a.this$0.o();
                    if (o != null) {
                        o.a(this.f147497a.$selectedStickerModel);
                    }
                    this.f147497a.this$0.b(this.f147497a.$selectedStickerModel);
                    return z.f158842a;
                }
            });
            bVar2.b(R.string.a9e, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>() {
                /* class com.ss.android.ugc.gamora.recorder.c.b.c.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(97191);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class a extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ CommentVideoModel $selectedStickerModel;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(97183);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, CommentVideoModel commentVideoModel) {
            super(1);
            this.this$0 = bVar;
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
                /* class com.ss.android.ugc.gamora.recorder.c.b.a.AnonymousClass1 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(97184);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    com.ss.android.ugc.aweme.cg.a o = this.this$0.this$0.o();
                    if (o != null) {
                        o.b();
                    }
                    CommentAndQuestionAndQuestionStickerPanelViewModel f2 = this.this$0.this$0.f();
                    f2.a(this.this$0.$selectedStickerModel);
                    f2.j();
                    this.this$0.this$0.b(null);
                    f2.a(this.this$0.$selectedStickerModel, f2.f73092c.getTabName(), "replace");
                    return z.f158842a;
                }
            });
            String string2 = com.bytedance.als.dsl.g.c(this.this$0).getString(R.string.f3f);
            l.b(string2, "");
            bVar2.b(string2, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.gamora.recorder.c.b.a.AnonymousClass2 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(97185);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    this.this$0.this$0.f().a(this.this$0.$selectedStickerModel, this.this$0.this$0.f().f73092c.getTabName(), "cancel");
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class g<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f147500a;

        static {
            Covode.recordClassIndex(97195);
        }

        g(b bVar) {
            this.f147500a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f147500a.f147491e.f124767l = this.f147500a.a().d();
            CommentVideoModel commentVideoModel = this.f147500a.f147491e.f124767l;
            if (commentVideoModel != null) {
                commentVideoModel.setShootWay("record_panel");
            }
            this.f147500a.f().f73097l.setValue(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.commentStickerPanel.a
    public final void a(CommentVideoModel commentVideoModel) {
        Boolean bool;
        l.d(commentVideoModel, "");
        com.ss.android.ugc.aweme.cg.a o2 = o();
        if (o2 != null) {
            bool = o2.a();
        } else {
            bool = null;
        }
        if (l.a((Object) bool, (Object) true)) {
            f().a(commentVideoModel, f().f73092c.getTabName());
            com.bytedance.tux.dialog.b.c.a(new com.bytedance.tux.dialog.b(com.bytedance.als.dsl.g.c(this)).b(com.bytedance.als.dsl.g.c(this).getString(R.string.f6q)).d(com.bytedance.als.dsl.g.c(this).getString(R.string.f6p)), new a(this, commentVideoModel)).a().b().show();
            return;
        }
        super.a(commentVideoModel);
    }

    public final void b(QaStruct qaStruct) {
        String str;
        EoyHighlightConfig eoyHighlightConfig;
        String effectId;
        if (qaStruct == null || !t.a(qaStruct.getQuestionContent())) {
            FaceStickerBean i2 = p().i();
            if (i2 != null) {
                str = i2.getPropSource();
            } else {
                str = null;
            }
            if (l.a((Object) str, (Object) "qa_prop")) {
                p().f(false);
                com.ss.android.ugc.aweme.sticker.f.e.a(p(), (Effect) null);
            }
        } else if (com.ss.android.ugc.aweme.sticker.f.e.a(p()) == null && (eoyHighlightConfig = x.f123067b) != null && (effectId = eoyHighlightConfig.getEffectId()) != null && hk.a(effectId)) {
            u();
        }
    }

    @Override // com.ss.android.ugc.aweme.commentStickerPanel.a
    public final void a(QaStruct qaStruct) {
        l.d(qaStruct, "");
        if (this.f147491e.f124768m != null) {
            com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) a.C1094a.a(com.bytedance.als.dsl.g.c(this)).b(com.bytedance.als.dsl.g.c(this).getResources().getString(R.string.f6q)).b(R.string.f6l), new C3960b(this, qaStruct)).a().b().show();
        } else if (this.f147491e.f124767l != null) {
            com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) a.C1094a.a(com.bytedance.als.dsl.g.c(this)).b(com.bytedance.als.dsl.g.c(this).getResources().getString(R.string.f6q)).b(R.string.f2x), new c(this, qaStruct)).a().b().show();
        } else {
            com.ss.android.ugc.aweme.cg.a o2 = o();
            if (o2 != null) {
                o2.a(qaStruct);
            }
            f().b();
            b(qaStruct);
        }
    }

    static final class h extends m implements h.f.a.m<com.bytedance.jedi.arch.b, CommentVideoModel, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(97196);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(2);
            this.this$0 = bVar;
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

    static final class i extends m implements h.f.a.m<com.bytedance.jedi.arch.b, QaStruct, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(97197);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar) {
            super(2);
            this.this$0 = bVar;
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
    public b(com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar, ShortVideoContext shortVideoContext) {
        super(fVar, bVar, R.id.dj5, shortVideoContext.f124767l, new k(shortVideoContext, null, true, 2));
        l.d(bVar, "");
        l.d(fVar, "");
        l.d(shortVideoContext, "");
        this.q = bVar;
        this.r = fVar;
        this.f147491e = shortVideoContext;
        this.f147492f = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.h.a.class);
        this.f147493k = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.k.a.class);
        this.f147494l = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.b.b.class);
        this.f147495m = com.bytedance.o.b.a.b(getDiContainer(), com.ss.android.ugc.aweme.cg.a.class);
        this.n = com.bytedance.o.b.a.a(getDiContainer(), j.class);
        this.p = h.i.a((h.f.a.a) new f(this));
        com.ss.android.ugc.aweme.commentStickerPanel.net.a.f73278f = shortVideoContext.q;
    }
}
