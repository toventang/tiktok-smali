package com.ss.android.ugc.aweme.record;

import androidx.fragment.app.Fragment;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.als.ApiCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel;
import com.bytedance.creativex.recorder.sticker.panel.RecordStickerPanelViewModel;
import com.ss.android.ugc.aweme.ay;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel;
import com.ss.android.ugc.aweme.experiment.fz;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.property.az;
import com.ss.android.ugc.aweme.property.bj;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.mvtemplate.MvTemplateDependentsImpl;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ch;
import com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.QaUtils;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.ss.android.ugc.aweme.sticker.view.a.l;
import com.ss.android.ugc.aweme.sticker.view.internal.search.TTSearchStickerViewModel;
import com.ss.android.ugc.aweme.tools.AVApi;
import com.ss.android.ugc.aweme.utils.ig;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.PageFactory;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public final class a implements PageFactory {
    static {
        Covode.recordClassIndex(78183);
    }

    static final class ai extends h.f.b.m implements h.f.a.b<com.bytedance.o.n, h.z> {
        final /* synthetic */ ch $planC;
        final /* synthetic */ com.bytedance.scene.group.b $this_create;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(78193);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ai(a aVar, com.bytedance.scene.group.b bVar, ch chVar) {
            super(1);
            this.this$0 = aVar;
            this.$this_create = bVar;
            this.$planC = chVar;
        }

        public static final class d extends com.bytedance.o.p<com.ss.android.ugc.aweme.sticker.types.lock.a> {
            static {
                Covode.recordClassIndex(78197);
            }

            /* renamed from: com.ss.android.ugc.aweme.record.a$ai$d$a  reason: collision with other inner class name */
            public static final class C3103a implements com.ss.android.ugc.aweme.sticker.types.lock.a {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ com.bytedance.o.f f120225a;

                /* renamed from: b  reason: collision with root package name */
                private final com.ss.android.ugc.aweme.sticker.panel.j f120226b;

                static {
                    Covode.recordClassIndex(78198);
                }

                @Override // com.ss.android.ugc.aweme.sticker.types.lock.a
                public final boolean isLockStickerEnable() {
                    return this.f120226b.f135221i;
                }

                @Override // com.ss.android.ugc.aweme.sticker.types.lock.a
                public final boolean reallyLockedSticker(Effect effect) {
                    return com.ss.android.ugc.aweme.sticker.types.lock.b.b(effect);
                }

                C3103a(com.bytedance.o.f fVar) {
                    this.f120225a = fVar;
                    this.f120226b = (com.ss.android.ugc.aweme.sticker.panel.j) fVar.a(com.ss.android.ugc.aweme.sticker.panel.j.class, (String) null);
                }
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.sticker.types.lock.a get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return new C3103a(fVar);
            }
        }

        public static final class f extends com.bytedance.o.p<com.ss.android.ugc.aweme.sticker.view.a.b<com.ss.android.ugc.tools.view.style.j, Fragment>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ai f120228a;

            static {
                Covode.recordClassIndex(78201);
            }

            /* renamed from: com.ss.android.ugc.aweme.record.a$ai$f$a  reason: collision with other inner class name */
            static final class C3105a extends h.f.b.m implements h.f.a.a<h.z> {
                final /* synthetic */ com.bytedance.o.f $container$inlined;
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(78202);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C3105a(com.bytedance.o.f fVar, f fVar2) {
                    super(0);
                    this.$container$inlined = fVar;
                    this.this$0 = fVar2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ h.z invoke() {
                    com.ss.android.ugc.aweme.sticker.panel.i v = ((com.ss.android.ugc.gamora.recorder.sticker.c.j) this.$container$inlined.a((Type) com.ss.android.ugc.gamora.recorder.sticker.c.j.class, (String) null)).v();
                    if (v != null) {
                        v.l();
                    }
                    return h.z.f158842a;
                }
            }

            public f(ai aiVar) {
                this.f120228a = aiVar;
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.sticker.view.a.b<com.ss.android.ugc.tools.view.style.j, Fragment> get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                com.ss.android.ugc.aweme.sticker.view.internal.main.c cVar = new com.ss.android.ugc.aweme.sticker.view.internal.main.c((byte) 0);
                cVar.a("sticker_category:favorite", new com.ss.android.ugc.aweme.sticker.view.internal.pager.b.b((androidx.lifecycle.m) fVar.a(androidx.lifecycle.m.class, (String) null), (com.ss.android.ugc.aweme.sticker.favorite.b) fVar.a(com.ss.android.ugc.aweme.sticker.favorite.b.class, (String) null), ((com.ss.android.ugc.gamora.recorder.sticker.c.j) fVar.a(com.ss.android.ugc.gamora.recorder.sticker.c.j.class, (String) null)).t(), (StickerPreferences) fVar.a(StickerPreferences.class, (String) null)));
                if (bj.a()) {
                    cVar.a("sticker_category:search", new com.ss.android.ugc.aweme.sticker.view.internal.search.j((androidx.fragment.app.e) fVar.a(androidx.fragment.app.e.class, (String) null), (com.ss.android.ugc.aweme.sticker.view.internal.search.a) fVar.a(com.ss.android.ugc.aweme.sticker.view.internal.search.a.class, (String) null), new l.b(((com.ss.android.ugc.gamora.recorder.sticker.c.j) fVar.a(com.ss.android.ugc.gamora.recorder.sticker.c.j.class, (String) null)).t(), ((com.ss.android.ugc.gamora.recorder.sticker.c.j) fVar.a(com.ss.android.ugc.gamora.recorder.sticker.c.j.class, (String) null)).u(), (com.ss.android.ugc.aweme.sticker.m.h) fVar.a(com.ss.android.ugc.aweme.sticker.m.h.class, (String) null), new com.ss.android.ugc.aweme.sticker.m.c(), new com.ss.android.ugc.aweme.sticker.view.internal.main.m((com.ss.android.ugc.tools.b.a.d) fVar.a(com.ss.android.ugc.tools.b.a.d.class, (String) null)), ((com.ss.android.ugc.aweme.sticker.panel.j) fVar.a(com.ss.android.ugc.aweme.sticker.panel.j.class, (String) null)).f135225m), (com.ss.android.ugc.aweme.sticker.panel.j) fVar.a(com.ss.android.ugc.aweme.sticker.panel.j.class, (String) null), new C3105a(fVar, this)));
                }
                return cVar;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.record.a$ai$a  reason: collision with other inner class name */
        public static final class C3102a extends com.bytedance.o.p<ch> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ai f120223a;

            static {
                Covode.recordClassIndex(78194);
            }

            public C3102a(ai aiVar) {
                this.f120223a = aiVar;
            }

            @Override // com.bytedance.o.p
            public final ch get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return this.f120223a.$planC;
            }
        }

        public static final class b extends com.bytedance.o.p<ApiCenter> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ai f120224a;

            static {
                Covode.recordClassIndex(78195);
            }

            public b(ai aiVar) {
                this.f120224a = aiVar;
            }

            @Override // com.bytedance.o.p
            public final ApiCenter get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return ApiCenter.a.a(com.bytedance.scene.ktx.c.b(this.f120224a.$this_create));
            }
        }

        public static final class g extends com.bytedance.o.p<com.ss.android.ugc.aweme.tools.mvtemplate.c.a> {
            static {
                Covode.recordClassIndex(78203);
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.tools.mvtemplate.c.a get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return new MvTemplateDependentsImpl();
            }
        }

        public static final class e extends com.bytedance.o.p<com.ss.android.ugc.aweme.sticker.view.internal.search.a> {
            static {
                Covode.recordClassIndex(78199);
            }

            /* renamed from: com.ss.android.ugc.aweme.record.a$ai$e$a  reason: collision with other inner class name */
            static final class C3104a<T> implements com.bytedance.als.m {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ TTSearchStickerViewModel f120227a;

                static {
                    Covode.recordClassIndex(78200);
                }

                C3104a(TTSearchStickerViewModel tTSearchStickerViewModel) {
                    this.f120227a = tTSearchStickerViewModel;
                }

                @Override // androidx.lifecycle.u, com.bytedance.als.m
                public final /* synthetic */ void onChanged(Object obj) {
                    if (h.f.b.l.a(obj, (Object) true)) {
                        this.f120227a.f136514i.setValue(true);
                    }
                }
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.sticker.view.internal.search.a get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                com.ss.android.ugc.aweme.sticker.presenter.o t = ((com.ss.android.ugc.gamora.recorder.sticker.c.j) fVar.a(com.ss.android.ugc.gamora.recorder.sticker.c.j.class, (String) null)).t();
                com.ss.android.ugc.aweme.sticker.d.d u = ((com.ss.android.ugc.gamora.recorder.sticker.c.j) fVar.a(com.ss.android.ugc.gamora.recorder.sticker.c.j.class, (String) null)).u();
                Object a2 = fVar.a(com.ss.android.ugc.tools.b.a.d.class);
                h.f.b.l.b(a2, "");
                TTSearchStickerViewModel tTSearchStickerViewModel = new TTSearchStickerViewModel((androidx.lifecycle.m) fVar.a(androidx.lifecycle.m.class, (String) null), t, u, new com.ss.android.ugc.aweme.sticker.view.internal.main.m((com.ss.android.ugc.tools.b.a.d) a2));
                AVApi b2 = AVApiImpl.b();
                h.f.b.l.b(b2, "");
                String a3 = b2.a();
                h.f.b.l.b(a3, "");
                tTSearchStickerViewModel.b(a3);
                ((com.ss.android.ugc.gamora.recorder.sticker.c.j) fVar.a(com.ss.android.ugc.gamora.recorder.sticker.c.j.class, (String) null)).A().a((androidx.lifecycle.m) fVar.a(androidx.lifecycle.m.class, (String) null), new C3104a(tTSearchStickerViewModel));
                return tTSearchStickerViewModel;
            }
        }

        public static final class c extends com.bytedance.o.p<com.ss.android.ugc.aweme.sticker.panel.j> {
            static {
                Covode.recordClassIndex(78196);
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.sticker.panel.j get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return com.ss.android.ugc.aweme.ah.f.a((androidx.fragment.app.e) fVar.a(androidx.fragment.app.e.class, (String) null), (com.bytedance.creativex.recorder.b.a.d) fVar.a(com.bytedance.creativex.recorder.b.a.d.class, (String) null), !com.ss.android.ugc.aweme.port.in.g.a().A().a(), false, 16);
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.o.n nVar) {
            com.bytedance.o.n nVar2 = nVar;
            h.f.b.l.d(nVar2, "");
            h.f.b.l.b(nVar2.a(ch.class, (String) null, (com.bytedance.o.p) new C3102a(this)), "");
            h.f.b.l.b(nVar2.a(ApiCenter.class, (String) null, (com.bytedance.o.p) new b(this)), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.sticker.panel.j.class, (String) null, (com.bytedance.o.p) new c()), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.sticker.types.lock.a.class, (String) null, (com.bytedance.o.p) new d()), "");
            if (bj.a()) {
                h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.sticker.view.internal.search.a.class, (String) null, (com.bytedance.o.p) new e()), "");
            }
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.sticker.view.a.b.class, (String) null, (com.bytedance.o.p) new f(this)), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.tools.mvtemplate.c.a.class, (String) null, (com.bytedance.o.p) new g()), "");
            return h.z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$a  reason: collision with other inner class name */
    public static final class C3101a extends com.bytedance.o.p<com.ss.android.ugc.aweme.shortvideo.n.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f120200a;

        static {
            Covode.recordClassIndex(78184);
        }

        public C3101a(com.bytedance.als.dsl.d dVar) {
            this.f120200a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.n.d get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.shortvideo.n.d(fVar);
        }
    }

    public static final class b extends com.bytedance.o.p<com.ss.android.ugc.gamora.recorder.sticker.support.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f120229a;

        static {
            Covode.recordClassIndex(78204);
        }

        public b(com.bytedance.als.dsl.d dVar) {
            this.f120229a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.sticker.support.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.recorder.sticker.support.b(fVar);
        }
    }

    public static final class c extends com.bytedance.o.p<com.ss.android.ugc.aweme.shortvideo.ui.a.l> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f120230a;

        static {
            Covode.recordClassIndex(78205);
        }

        public c(com.bytedance.als.dsl.d dVar) {
            this.f120230a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.ui.a.l get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.shortvideo.ui.a.l(fVar);
        }
    }

    public static final class d extends com.bytedance.o.p<com.ss.android.ugc.aweme.shortvideo.e.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f120231a;

        static {
            Covode.recordClassIndex(78206);
        }

        public d(com.bytedance.als.dsl.d dVar) {
            this.f120231a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.e.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.shortvideo.e.b(fVar);
        }
    }

    public static final class e extends com.bytedance.o.p<com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f120232a;

        static {
            Covode.recordClassIndex(78207);
        }

        public e(com.bytedance.als.dsl.d dVar) {
            this.f120232a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c(fVar);
        }
    }

    public static final class f extends com.bytedance.o.p<com.ss.android.ugc.gamora.recorder.permission.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f120233a;

        static {
            Covode.recordClassIndex(78208);
        }

        public f(com.bytedance.als.dsl.d dVar) {
            this.f120233a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.permission.a get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.recorder.permission.a(fVar);
        }
    }

    public static final class g extends com.bytedance.o.p<com.ss.android.ugc.gamora.recorder.choosemusic.a.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f120234a;

        static {
            Covode.recordClassIndex(78209);
        }

        public g(com.bytedance.als.dsl.d dVar) {
            this.f120234a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.choosemusic.a.c get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.recorder.choosemusic.a.c(fVar);
        }
    }

    public static final class aa extends com.bytedance.o.p<com.bytedance.creativex.recorder.a.k> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f120201a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f120202b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f120203c;

        static {
            Covode.recordClassIndex(78185);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.bytedance.creativex.recorder.a.k get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return com.ss.android.ugc.gamora.recorder.a.a.a(this.f120202b, fVar);
        }

        public aa(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f120201a = dVar;
            this.f120202b = bVar;
            this.f120203c = fVar;
        }
    }

    public static final class ab extends com.bytedance.o.p<com.ss.android.ugc.gamora.recorder.g.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f120204a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f120205b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f120206c;

        static {
            Covode.recordClassIndex(78186);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.g.c get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.recorder.g.c(this.f120205b, fVar);
        }

        public ab(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f120204a = dVar;
            this.f120205b = bVar;
            this.f120206c = fVar;
        }
    }

    public static final class af extends com.bytedance.o.p<com.ss.android.ugc.gamora.recorder.l.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f120216a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f120217b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f120218c;

        static {
            Covode.recordClassIndex(78190);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.l.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.recorder.l.b(this.f120217b, fVar);
        }

        public af(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f120216a = dVar;
            this.f120217b = bVar;
            this.f120218c = fVar;
        }
    }

    public static final class ag extends com.bytedance.o.p<com.bytedance.creativex.recorder.sticker.panel.g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f120219a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f120220b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f120221c;

        static {
            Covode.recordClassIndex(78191);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.bytedance.creativex.recorder.sticker.panel.g get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return com.ss.android.ugc.aweme.sticker.k.a(fVar, this.f120220b);
        }

        public ag(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f120219a = dVar;
            this.f120220b = bVar;
            this.f120221c = fVar;
        }
    }

    static final class ah extends h.f.b.m implements h.f.a.b<com.bytedance.als.dsl.e, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final ah f120222a = new ah();

        static {
            Covode.recordClassIndex(78192);
        }

        ah() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.als.dsl.e eVar) {
            com.bytedance.als.dsl.e eVar2 = eVar;
            h.f.b.l.d(eVar2, "");
            eVar2.f6462a = com.ss.android.ugc.aweme.setting.i.f.a();
            return h.z.f158842a;
        }
    }

    public static final class h extends com.bytedance.o.p<com.bytedance.creativex.recorder.gesture.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f120235a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f120236b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f120237c;

        static {
            Covode.recordClassIndex(78210);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.bytedance.creativex.recorder.gesture.c get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.bytedance.creativex.recorder.gesture.c(this.f120236b, fVar, R.id.bah);
        }

        public h(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f120235a = dVar;
            this.f120236b = bVar;
            this.f120237c = fVar;
        }
    }

    public static final class i extends com.bytedance.o.p<com.ss.android.ugc.gamora.recorder.k.e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f120238a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f120239b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f120240c;

        static {
            Covode.recordClassIndex(78211);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.k.e get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.recorder.k.e(fVar, this.f120239b);
        }

        public i(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f120238a = dVar;
            this.f120239b = bVar;
            this.f120240c = fVar;
        }
    }

    public static final class k extends com.bytedance.o.p<com.ss.android.ugc.gamora.recorder.m.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f120244a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f120245b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f120246c;

        static {
            Covode.recordClassIndex(78213);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.m.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.recorder.m.b(this.f120245b, fVar);
        }

        public k(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f120244a = dVar;
            this.f120245b = bVar;
            this.f120246c = fVar;
        }
    }

    public static final class l extends com.bytedance.o.p<com.ss.android.ugc.gamora.recorder.e.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f120247a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f120248b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f120249c;

        static {
            Covode.recordClassIndex(78214);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.e.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.recorder.e.b(this.f120248b, fVar);
        }

        public l(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f120247a = dVar;
            this.f120248b = bVar;
            this.f120249c = fVar;
        }
    }

    public static final class o extends com.bytedance.o.p<com.ss.android.ugc.gamora.recorder.d.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f120256a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f120257b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f120258c;

        static {
            Covode.recordClassIndex(78217);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.d.c get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.recorder.d.c(this.f120257b, fVar);
        }

        public o(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f120256a = dVar;
            this.f120257b = bVar;
            this.f120258c = fVar;
        }
    }

    public static final class p extends com.bytedance.o.p<com.bytedance.creativex.recorder.filter.panel.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f120259a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f120260b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f120261c;

        static {
            Covode.recordClassIndex(78218);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.bytedance.creativex.recorder.filter.panel.a get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return com.ss.android.ugc.aweme.ah.d.a(this.f120260b, fVar);
        }

        public p(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f120259a = dVar;
            this.f120260b = bVar;
            this.f120261c = fVar;
        }
    }

    public static final class q extends com.bytedance.o.p<com.bytedance.creativex.recorder.filter.c.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f120262a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f120263b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f120264c;

        static {
            Covode.recordClassIndex(78219);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.bytedance.creativex.recorder.filter.c.a get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.bytedance.creativex.recorder.filter.c.a(this.f120263b, fVar);
        }

        public q(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f120262a = dVar;
            this.f120263b = bVar;
            this.f120264c = fVar;
        }
    }

    public static final class r extends com.bytedance.o.p<com.ss.android.ugc.gamora.recorder.j.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f120265a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f120266b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f120267c;

        static {
            Covode.recordClassIndex(78220);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.j.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.recorder.j.b(this.f120266b, fVar);
        }

        public r(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f120265a = dVar;
            this.f120266b = bVar;
            this.f120267c = fVar;
        }
    }

    public static final class s extends com.bytedance.o.p<com.ss.android.ugc.gamora.recorder.i.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f120268a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f120269b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f120270c;

        static {
            Covode.recordClassIndex(78221);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.i.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.recorder.i.b(this.f120269b, fVar);
        }

        public s(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f120268a = dVar;
            this.f120269b = bVar;
            this.f120270c = fVar;
        }
    }

    public static final class t extends com.bytedance.o.p<com.ss.android.ugc.aweme.shortvideo.countdown.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f120271a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f120272b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f120273c;

        static {
            Covode.recordClassIndex(78222);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.countdown.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.shortvideo.countdown.b(this.f120272b, fVar);
        }

        public t(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f120271a = dVar;
            this.f120272b = bVar;
            this.f120273c = fVar;
        }
    }

    public static final class v extends com.bytedance.o.p<com.ss.android.ugc.aweme.shortvideo.duet.z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f120277a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f120278b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f120279c;

        static {
            Covode.recordClassIndex(78224);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.duet.z get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.shortvideo.duet.z(this.f120278b, fVar);
        }

        public v(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f120277a = dVar;
            this.f120278b = bVar;
            this.f120279c = fVar;
        }
    }

    public static final class w extends com.bytedance.o.p<com.ss.android.ugc.aweme.z.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f120280a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentVideoModel f120281b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f120282c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f120283d;

        static {
            Covode.recordClassIndex(78225);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.z.d get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.z.d(this.f120282c, fVar, this.f120281b);
        }

        public w(com.bytedance.als.dsl.d dVar, CommentVideoModel commentVideoModel, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f120280a = dVar;
            this.f120281b = commentVideoModel;
            this.f120282c = bVar;
            this.f120283d = fVar;
        }
    }

    public static final class y extends com.bytedance.o.p<com.ss.android.ugc.gamora.recorder.quickupload.k> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f120288a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f120289b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f120290c;

        static {
            Covode.recordClassIndex(78227);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.quickupload.k get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.recorder.quickupload.k(this.f120289b, fVar);
        }

        public y(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f120288a = dVar;
            this.f120289b = bVar;
            this.f120290c = fVar;
        }
    }

    public static final class z extends com.bytedance.o.p<com.ss.android.ugc.gamora.recorder.quickupload.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f120291a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f120292b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f120293c;

        static {
            Covode.recordClassIndex(78228);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.quickupload.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.recorder.quickupload.b(this.f120292b, fVar);
        }

        public z(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f120291a = dVar;
            this.f120292b = bVar;
            this.f120293c = fVar;
        }
    }

    public static final class ac extends com.bytedance.o.p<com.ss.android.ugc.gamora.recorder.choosemusic.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f120207a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f120208b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f120209c;

        static {
            Covode.recordClassIndex(78187);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.choosemusic.d get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            com.bytedance.scene.group.b bVar = this.f120208b;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.recorder.choosemusic.d(bVar, fVar);
        }

        public ac(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f120207a = dVar;
            this.f120208b = bVar;
            this.f120209c = fVar;
        }
    }

    public static final class ad extends com.bytedance.o.p<com.ss.android.ugc.gamora.recorder.c.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f120210a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f120211b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f120212c;

        static {
            Covode.recordClassIndex(78188);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.c.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            com.bytedance.scene.group.b bVar = this.f120211b;
            Object a2 = this.f120212c.a(ShortVideoContext.class);
            h.f.b.l.b(a2, "");
            return new com.ss.android.ugc.gamora.recorder.c.b(bVar, fVar, (ShortVideoContext) a2);
        }

        public ad(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f120210a = dVar;
            this.f120211b = bVar;
            this.f120212c = fVar;
        }
    }

    public static final class ae extends com.bytedance.o.p<com.ss.android.ugc.gamora.recorder.n.a.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f120213a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f120214b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f120215c;

        static {
            Covode.recordClassIndex(78189);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.n.a.f get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.cy.b().a(this.f120214b, fVar, new com.ss.android.ugc.aweme.cy.d());
        }

        public ae(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f120213a = dVar;
            this.f120214b = bVar;
            this.f120215c = fVar;
        }
    }

    public static final class j extends com.bytedance.o.p<com.ss.android.ugc.gamora.recorder.k.g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f120241a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f120242b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f120243c;

        static {
            Covode.recordClassIndex(78212);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.k.g get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.recorder.k.g(fVar, this.f120242b, new com.ss.android.ugc.gamora.recorder.k.i());
        }

        public j(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f120241a = dVar;
            this.f120242b = bVar;
            this.f120243c = fVar;
        }
    }

    public static final class n extends com.bytedance.o.p<com.ss.android.ugc.gamora.recorder.b.i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f120253a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f120254b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f120255c;

        static {
            Covode.recordClassIndex(78216);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.b.i get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.recorder.b.i(this.f120254b, fVar, ay.a().a(fVar));
        }

        public n(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f120253a = dVar;
            this.f120254b = bVar;
            this.f120255c = fVar;
        }
    }

    public static final class u extends com.bytedance.o.p<com.ss.android.ugc.aweme.shortvideo.h.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f120274a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f120275b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f120276c;

        static {
            Covode.recordClassIndex(78223);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.h.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.shortvideo.h.b(this.f120275b, fVar, Integer.valueOf((int) R.id.dj9));
        }

        public u(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f120274a = dVar;
            this.f120275b = bVar;
            this.f120276c = fVar;
        }
    }

    public static final class x extends com.bytedance.o.p<com.ss.android.ugc.aweme.cg.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f120284a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ QaStruct f120285b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f120286c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f120287d;

        static {
            Covode.recordClassIndex(78226);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.cg.b get(com.bytedance.o.f fVar) {
            QaStruct qaStruct;
            h.f.b.l.d(fVar, "");
            com.bytedance.scene.group.b bVar = this.f120286c;
            if (QaUtils.isDataValid(this.f120285b)) {
                qaStruct = this.f120285b;
            } else {
                qaStruct = null;
            }
            return new com.ss.android.ugc.aweme.cg.b(bVar, fVar, qaStruct);
        }

        public x(com.bytedance.als.dsl.d dVar, QaStruct qaStruct, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f120284a = dVar;
            this.f120285b = qaStruct;
            this.f120286c = bVar;
            this.f120287d = fVar;
        }
    }

    public static final class m extends com.bytedance.o.p<com.ss.android.ugc.gamora.recorder.b.h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f120250a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f120251b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f120252c;

        static {
            Covode.recordClassIndex(78215);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.b.h get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            com.bytedance.scene.group.b bVar = this.f120251b;
            List<com.ss.android.ugc.gamora.recorder.b.a> a2 = ay.a().a(fVar);
            com.ss.android.ugc.aweme.servicimpl.h hVar = new com.ss.android.ugc.aweme.servicimpl.h();
            h.f.b.l.d(fVar, "");
            ArrayList arrayList = new ArrayList();
            Object a3 = fVar.a(ShortVideoContext.class);
            h.f.b.l.b(a3, "");
            hVar.f121883a = (ShortVideoContext) a3;
            if (hVar.c()) {
                arrayList.add(new com.ss.android.ugc.aweme.servicimpl.y(ig.a(com.ss.android.ugc.aweme.servicimpl.ad.RECORD_LIGHTENING_PHOTO.getNameResId()), ig.a(com.ss.android.ugc.aweme.servicimpl.ad.PHOTO_SHORT.getTagResId()), "quick_photo", false, false, fVar));
            }
            if (hVar.b()) {
                arrayList.add(new com.ss.android.ugc.aweme.servicimpl.u(ig.a(com.ss.android.ugc.aweme.servicimpl.ad.RECORD_LIGHTENING_VIDEO.getNameResId()), ig.a(com.ss.android.ugc.aweme.servicimpl.ad.RECORD_LIGHTENING_VIDEO.getTagResId()), "quick_video", false, fVar));
            }
            return new com.ss.android.ugc.gamora.recorder.b.h(bVar, fVar, a2, arrayList);
        }

        public m(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f120250a = dVar;
            this.f120251b = bVar;
            this.f120252c = fVar;
        }
    }

    @Override // com.ss.android.ugc.gamora.PageFactory
    public final void a(com.bytedance.scene.group.b bVar) {
        h.f.b.l.d(bVar, "");
        com.bytedance.als.dsl.f.a(bVar, ah.f120222a);
        com.bytedance.o.f a2 = com.bytedance.als.dsl.g.a(bVar, new ai(this, bVar, (ch) bVar));
        com.bytedance.als.dsl.b bVar2 = new com.bytedance.als.dsl.b(com.bytedance.als.dsl.c.a(bVar));
        com.bytedance.als.dsl.d dVar = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer = bVar2.f6461a;
        alsLogicContainer.f6437d.a(com.bytedance.creativex.recorder.gesture.c.class, (String) null, (com.bytedance.o.p) new h(dVar, bVar, a2));
        alsLogicContainer.a(com.bytedance.creativex.recorder.gesture.api.b.class, com.bytedance.creativex.recorder.gesture.c.class);
        com.bytedance.als.dsl.d dVar2 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer2 = bVar2.f6461a;
        alsLogicContainer2.f6437d.a(com.ss.android.ugc.gamora.recorder.i.b.class, (String) null, (com.bytedance.o.p) new s(dVar2, bVar, a2));
        alsLogicContainer2.a(com.ss.android.ugc.gamora.recorder.i.a.class, com.ss.android.ugc.gamora.recorder.i.b.class);
        com.bytedance.als.dsl.d dVar3 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer3 = bVar2.f6461a;
        alsLogicContainer3.f6437d.a(com.bytedance.creativex.recorder.a.k.class, (String) null, (com.bytedance.o.p) new aa(dVar3, bVar, a2));
        alsLogicContainer3.a(com.bytedance.creativex.recorder.a.a.e.class, com.bytedance.creativex.recorder.a.k.class);
        com.bytedance.als.dsl.d dVar4 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer4 = bVar2.f6461a;
        alsLogicContainer4.f6437d.a(com.ss.android.ugc.gamora.recorder.g.c.class, (String) null, (com.bytedance.o.p) new ab(dVar4, bVar, a2));
        alsLogicContainer4.a(com.ss.android.ugc.gamora.recorder.g.a.class, com.ss.android.ugc.gamora.recorder.g.c.class);
        com.bytedance.als.dsl.d dVar5 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer5 = bVar2.f6461a;
        alsLogicContainer5.f6437d.a(com.ss.android.ugc.gamora.recorder.choosemusic.d.class, (String) null, (com.bytedance.o.p) new ac(dVar5, bVar, a2));
        alsLogicContainer5.a(com.ss.android.ugc.gamora.recorder.choosemusic.a.class, com.ss.android.ugc.gamora.recorder.choosemusic.d.class);
        com.bytedance.als.dsl.d dVar6 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer6 = bVar2.f6461a;
        alsLogicContainer6.f6437d.a(com.ss.android.ugc.gamora.recorder.c.b.class, (String) null, (com.bytedance.o.p) new ad(dVar6, bVar, a2));
        alsLogicContainer6.a(CommentAndQuestionAndQuestionStickerPanelViewModel.class, com.ss.android.ugc.gamora.recorder.c.b.class);
        com.bytedance.als.dsl.d dVar7 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer7 = bVar2.f6461a;
        alsLogicContainer7.f6437d.a(com.ss.android.ugc.gamora.recorder.n.a.f.class, (String) null, (com.bytedance.o.p) new ae(dVar7, bVar, a2));
        alsLogicContainer7.a(com.ss.android.ugc.gamora.recorder.n.a.e.class, com.ss.android.ugc.gamora.recorder.n.a.f.class);
        com.bytedance.als.dsl.d dVar8 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer8 = bVar2.f6461a;
        alsLogicContainer8.f6437d.a(com.ss.android.ugc.gamora.recorder.l.b.class, (String) null, (com.bytedance.o.p) new af(dVar8, bVar, a2));
        alsLogicContainer8.a(com.ss.android.ugc.gamora.recorder.l.f.class, com.ss.android.ugc.gamora.recorder.l.b.class);
        com.bytedance.als.dsl.d dVar9 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer9 = bVar2.f6461a;
        alsLogicContainer9.f6437d.a(com.ss.android.ugc.gamora.recorder.choosemusic.a.c.class, (String) null, (com.bytedance.o.p) new g(dVar9));
        alsLogicContainer9.a(com.ss.android.ugc.gamora.recorder.choosemusic.a.a.class, com.ss.android.ugc.gamora.recorder.choosemusic.a.c.class);
        com.bytedance.als.dsl.d dVar10 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer10 = bVar2.f6461a;
        alsLogicContainer10.f6437d.a(com.bytedance.creativex.recorder.sticker.panel.g.class, (String) null, (com.bytedance.o.p) new ag(dVar10, bVar, a2));
        alsLogicContainer10.a(RecordStickerPanelViewModel.class, com.bytedance.creativex.recorder.sticker.panel.g.class);
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        h.f.b.l.b(createIAVServiceProxybyMonsterPlugin, "");
        if (createIAVServiceProxybyMonsterPlugin.getStoryService().e()) {
            com.bytedance.als.dsl.d dVar11 = new com.bytedance.als.dsl.d();
            AlsLogicContainer alsLogicContainer11 = bVar2.f6461a;
            alsLogicContainer11.f6437d.a(com.ss.android.ugc.gamora.recorder.k.e.class, (String) null, (com.bytedance.o.p) new i(dVar11, bVar, a2));
            alsLogicContainer11.a(com.ss.android.ugc.gamora.recorder.k.d.class, com.ss.android.ugc.gamora.recorder.k.e.class);
        } else {
            com.bytedance.als.dsl.d dVar12 = new com.bytedance.als.dsl.d();
            AlsLogicContainer alsLogicContainer12 = bVar2.f6461a;
            alsLogicContainer12.f6437d.a(com.ss.android.ugc.gamora.recorder.k.g.class, (String) null, (com.bytedance.o.p) new j(dVar12, bVar, a2));
            alsLogicContainer12.a(com.ss.android.ugc.gamora.recorder.k.a.class, com.ss.android.ugc.gamora.recorder.k.g.class);
        }
        com.bytedance.als.dsl.d dVar13 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer13 = bVar2.f6461a;
        alsLogicContainer13.f6437d.a(com.ss.android.ugc.gamora.recorder.m.b.class, (String) null, (com.bytedance.o.p) new k(dVar13, bVar, a2));
        alsLogicContainer13.a(com.ss.android.ugc.gamora.recorder.m.a.class, com.ss.android.ugc.gamora.recorder.m.b.class);
        com.bytedance.als.dsl.d dVar14 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer14 = bVar2.f6461a;
        alsLogicContainer14.f6437d.a(com.ss.android.ugc.gamora.recorder.e.b.class, (String) null, (com.bytedance.o.p) new l(dVar14, bVar, a2));
        alsLogicContainer14.a(com.ss.android.ugc.gamora.recorder.e.a.class, com.ss.android.ugc.gamora.recorder.e.b.class);
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin2 = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        h.f.b.l.b(createIAVServiceProxybyMonsterPlugin2, "");
        if (createIAVServiceProxybyMonsterPlugin2.getStoryService().e()) {
            com.bytedance.als.dsl.d dVar15 = new com.bytedance.als.dsl.d();
            AlsLogicContainer alsLogicContainer15 = bVar2.f6461a;
            alsLogicContainer15.f6437d.a(com.ss.android.ugc.gamora.recorder.b.h.class, (String) null, (com.bytedance.o.p) new m(dVar15, bVar, a2));
            alsLogicContainer15.a(com.ss.android.ugc.gamora.recorder.b.b.class, com.ss.android.ugc.gamora.recorder.b.h.class);
        } else {
            com.bytedance.als.dsl.d dVar16 = new com.bytedance.als.dsl.d();
            AlsLogicContainer alsLogicContainer16 = bVar2.f6461a;
            alsLogicContainer16.f6437d.a(com.ss.android.ugc.gamora.recorder.b.i.class, (String) null, (com.bytedance.o.p) new n(dVar16, bVar, a2));
            alsLogicContainer16.a(com.ss.android.ugc.gamora.recorder.b.b.class, com.ss.android.ugc.gamora.recorder.b.i.class);
        }
        com.bytedance.als.dsl.d dVar17 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer17 = bVar2.f6461a;
        alsLogicContainer17.f6437d.a(com.ss.android.ugc.gamora.recorder.d.c.class, (String) null, (com.bytedance.o.p) new o(dVar17, bVar, a2));
        alsLogicContainer17.a(com.ss.android.ugc.gamora.recorder.d.a.class, com.ss.android.ugc.gamora.recorder.d.c.class);
        com.bytedance.als.dsl.d dVar18 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer18 = bVar2.f6461a;
        alsLogicContainer18.f6437d.a(com.bytedance.creativex.recorder.filter.panel.a.class, (String) null, (com.bytedance.o.p) new p(dVar18, bVar, a2));
        alsLogicContainer18.a(FilterPanelViewModel.class, com.bytedance.creativex.recorder.filter.panel.a.class);
        com.bytedance.als.dsl.d dVar19 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer19 = bVar2.f6461a;
        alsLogicContainer19.f6437d.a(com.bytedance.creativex.recorder.filter.c.a.class, (String) null, (com.bytedance.o.p) new q(dVar19, bVar, a2));
        alsLogicContainer19.a(com.bytedance.creativex.recorder.filter.a.c.class, com.bytedance.creativex.recorder.filter.c.a.class);
        com.bytedance.als.dsl.d dVar20 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer20 = bVar2.f6461a;
        alsLogicContainer20.f6437d.a(com.ss.android.ugc.gamora.recorder.j.b.class, (String) null, (com.bytedance.o.p) new r(dVar20, bVar, a2));
        alsLogicContainer20.a(com.ss.android.ugc.gamora.recorder.j.a.class, com.ss.android.ugc.gamora.recorder.j.b.class);
        com.bytedance.als.dsl.d dVar21 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer21 = bVar2.f6461a;
        alsLogicContainer21.f6437d.a(com.ss.android.ugc.aweme.shortvideo.countdown.b.class, (String) null, (com.bytedance.o.p) new t(dVar21, bVar, a2));
        alsLogicContainer21.a(com.ss.android.ugc.aweme.shortvideo.countdown.a.class, com.ss.android.ugc.aweme.shortvideo.countdown.b.class);
        com.bytedance.als.dsl.d dVar22 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer22 = bVar2.f6461a;
        alsLogicContainer22.f6437d.a(com.ss.android.ugc.aweme.shortvideo.h.b.class, (String) null, (com.bytedance.o.p) new u(dVar22, bVar, a2));
        alsLogicContainer22.a(com.ss.android.ugc.aweme.shortvideo.h.a.class, com.ss.android.ugc.aweme.shortvideo.h.b.class);
        com.bytedance.als.dsl.d dVar23 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer23 = bVar2.f6461a;
        alsLogicContainer23.f6437d.a(com.ss.android.ugc.aweme.shortvideo.n.d.class, (String) null, (com.bytedance.o.p) new C3101a(dVar23));
        alsLogicContainer23.a(com.ss.android.ugc.aweme.shortvideo.n.a.class, com.ss.android.ugc.aweme.shortvideo.n.d.class);
        Object a3 = a2.a((Type) ShortVideoContext.class, (String) null);
        h.f.b.l.b(a3, "");
        if (com.ss.android.ugc.aweme.shortvideo.duet.a.a((ShortVideoContext) a3)) {
            com.bytedance.als.dsl.d dVar24 = new com.bytedance.als.dsl.d();
            AlsLogicContainer alsLogicContainer24 = bVar2.f6461a;
            alsLogicContainer24.f6437d.a(com.ss.android.ugc.aweme.shortvideo.duet.z.class, (String) null, (com.bytedance.o.p) new v(dVar24, bVar, a2));
            alsLogicContainer24.a(DuetLayoutModeViewModel.class, com.ss.android.ugc.aweme.shortvideo.duet.z.class);
        }
        CommentVideoModel commentVideoModel = ((ShortVideoContext) a2.a((Type) ShortVideoContext.class, (String) null)).f124767l;
        com.bytedance.als.dsl.d dVar25 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer25 = bVar2.f6461a;
        alsLogicContainer25.f6437d.a(com.ss.android.ugc.aweme.z.d.class, (String) null, (com.bytedance.o.p) new w(dVar25, commentVideoModel, bVar, a2));
        alsLogicContainer25.a(com.ss.android.ugc.aweme.z.a.class, com.ss.android.ugc.aweme.z.d.class);
        QaStruct qaStruct = ((ShortVideoContext) a2.a((Type) ShortVideoContext.class, (String) null)).f124768m;
        com.bytedance.als.dsl.d dVar26 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer26 = bVar2.f6461a;
        alsLogicContainer26.f6437d.a(com.ss.android.ugc.aweme.cg.b.class, (String) null, (com.bytedance.o.p) new x(dVar26, qaStruct, bVar, a2));
        alsLogicContainer26.a(com.ss.android.ugc.aweme.cg.a.class, com.ss.android.ugc.aweme.cg.b.class);
        com.bytedance.als.dsl.d dVar27 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer27 = bVar2.f6461a;
        alsLogicContainer27.f6437d.a(com.ss.android.ugc.gamora.recorder.sticker.support.b.class, (String) null, (com.bytedance.o.p) new b(dVar27));
        alsLogicContainer27.a(com.ss.android.ugc.gamora.recorder.sticker.support.a.class, com.ss.android.ugc.gamora.recorder.sticker.support.b.class);
        com.bytedance.als.dsl.d dVar28 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer28 = bVar2.f6461a;
        alsLogicContainer28.f6437d.a(com.ss.android.ugc.aweme.shortvideo.ui.a.l.class, (String) null, (com.bytedance.o.p) new c(dVar28));
        alsLogicContainer28.a(com.ss.android.ugc.aweme.shortvideo.ui.a.k.class, com.ss.android.ugc.aweme.shortvideo.ui.a.l.class);
        if (fz.a() != 0) {
            com.bytedance.als.dsl.d dVar29 = new com.bytedance.als.dsl.d();
            AlsLogicContainer alsLogicContainer29 = bVar2.f6461a;
            alsLogicContainer29.f6437d.a(com.ss.android.ugc.aweme.shortvideo.e.b.class, (String) null, (com.bytedance.o.p) new d(dVar29));
            alsLogicContainer29.a(com.ss.android.ugc.aweme.shortvideo.e.a.class, com.ss.android.ugc.aweme.shortvideo.e.b.class);
        }
        com.bytedance.als.dsl.d dVar30 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer30 = bVar2.f6461a;
        alsLogicContainer30.f6437d.a(com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c.class, (String) null, (com.bytedance.o.p) new e(dVar30));
        alsLogicContainer30.a(com.ss.android.ugc.gamora.recorder.choosemusic.recommend.a.class, com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c.class);
        com.bytedance.als.dsl.d dVar31 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer31 = bVar2.f6461a;
        alsLogicContainer31.f6437d.a(com.ss.android.ugc.gamora.recorder.permission.a.class, (String) null, (com.bytedance.o.p) new f(dVar31));
        alsLogicContainer31.a(com.bytedance.als.b.class, com.ss.android.ugc.gamora.recorder.permission.a.class);
        if (az.b() || az.c()) {
            com.bytedance.als.dsl.d dVar32 = new com.bytedance.als.dsl.d();
            AlsLogicContainer alsLogicContainer32 = bVar2.f6461a;
            alsLogicContainer32.f6437d.a(com.ss.android.ugc.gamora.recorder.quickupload.k.class, (String) null, (com.bytedance.o.p) new y(dVar32, bVar, a2));
            alsLogicContainer32.a(com.ss.android.ugc.gamora.recorder.quickupload.j.class, com.ss.android.ugc.gamora.recorder.quickupload.k.class);
            com.bytedance.als.dsl.d dVar33 = new com.bytedance.als.dsl.d();
            AlsLogicContainer alsLogicContainer33 = bVar2.f6461a;
            alsLogicContainer33.f6437d.a(com.ss.android.ugc.gamora.recorder.quickupload.b.class, (String) null, (com.bytedance.o.p) new z(dVar33, bVar, a2));
            alsLogicContainer33.a(com.ss.android.ugc.gamora.recorder.quickupload.a.class, com.ss.android.ugc.gamora.recorder.quickupload.b.class);
        }
        bVar2.a();
    }
}
