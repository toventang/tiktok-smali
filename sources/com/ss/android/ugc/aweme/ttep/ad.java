package com.ss.android.ugc.aweme.ttep;

import androidx.fragment.app.Fragment;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.als.ApiCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel;
import com.bytedance.creativex.recorder.sticker.panel.RecordStickerPanelViewModel;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.services.mvtemplate.MvTemplateDependentsImpl;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ch;
import com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.ss.android.ugc.aweme.ttep.ttepcomponent.TTEPPreviewEffectLogicComponent;
import com.ss.android.ugc.aweme.ttep.ttepcomponent.bottomtab.TTEPRecordBottomTabComponent;
import com.ss.android.ugc.aweme.ttep.ttepcomponent.choosemusic.TTEPRecordChooseMusicComponent;
import com.ss.android.ugc.aweme.ttep.ttepcomponent.dockbar.TTEPRecordDockBarComponent;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.TTEPPageFactory;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class ad implements TTEPPageFactory {
    static {
        Covode.recordClassIndex(92247);
    }

    static final class z extends h.f.b.m implements h.f.a.b<com.bytedance.o.n, h.z> {
        final /* synthetic */ ch $planC;
        final /* synthetic */ com.bytedance.scene.group.b $this_create;

        static {
            Covode.recordClassIndex(92273);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(com.bytedance.scene.group.b bVar, ch chVar) {
            super(1);
            this.$this_create = bVar;
            this.$planC = chVar;
        }

        public static final class d extends com.bytedance.o.p<com.ss.android.ugc.aweme.sticker.types.lock.a> {
            static {
                Covode.recordClassIndex(92277);
            }

            public static final class a implements com.ss.android.ugc.aweme.sticker.types.lock.a {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ com.bytedance.o.f f141315a;

                /* renamed from: b  reason: collision with root package name */
                private final com.ss.android.ugc.aweme.sticker.panel.j f141316b;

                static {
                    Covode.recordClassIndex(92278);
                }

                @Override // com.ss.android.ugc.aweme.sticker.types.lock.a
                public final boolean isLockStickerEnable() {
                    return this.f141316b.f135221i;
                }

                @Override // com.ss.android.ugc.aweme.sticker.types.lock.a
                public final boolean reallyLockedSticker(Effect effect) {
                    return com.ss.android.ugc.aweme.sticker.types.lock.b.b(effect);
                }

                a(com.bytedance.o.f fVar) {
                    this.f141315a = fVar;
                    this.f141316b = (com.ss.android.ugc.aweme.sticker.panel.j) fVar.a(com.ss.android.ugc.aweme.sticker.panel.j.class, (String) null);
                }
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.sticker.types.lock.a get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return new a(fVar);
            }
        }

        public static final class a extends com.bytedance.o.p<ch> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ z f141313a;

            static {
                Covode.recordClassIndex(92274);
            }

            public a(z zVar) {
                this.f141313a = zVar;
            }

            @Override // com.bytedance.o.p
            public final ch get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return this.f141313a.$planC;
            }
        }

        public static final class b extends com.bytedance.o.p<ApiCenter> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ z f141314a;

            static {
                Covode.recordClassIndex(92275);
            }

            public b(z zVar) {
                this.f141314a = zVar;
            }

            @Override // com.bytedance.o.p
            public final ApiCenter get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return ApiCenter.a.a(com.bytedance.scene.ktx.c.b(this.f141314a.$this_create));
            }
        }

        public static final class f extends com.bytedance.o.p<com.ss.android.ugc.aweme.tools.mvtemplate.c.a> {
            static {
                Covode.recordClassIndex(92280);
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.tools.mvtemplate.c.a get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return new MvTemplateDependentsImpl();
            }
        }

        public static final class c extends com.bytedance.o.p<com.ss.android.ugc.aweme.sticker.panel.j> {
            static {
                Covode.recordClassIndex(92276);
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.sticker.panel.j get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return com.ss.android.ugc.aweme.ah.f.a((androidx.fragment.app.e) fVar.a(androidx.fragment.app.e.class, (String) null), (com.bytedance.creativex.recorder.b.a.d) fVar.a(com.bytedance.creativex.recorder.b.a.d.class, (String) null), !com.ss.android.ugc.aweme.port.in.g.a().A().a(), false, 16);
            }
        }

        public static final class e extends com.bytedance.o.p<com.ss.android.ugc.aweme.sticker.view.a.b<com.ss.android.ugc.tools.view.style.j, Fragment>> {
            static {
                Covode.recordClassIndex(92279);
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.sticker.view.a.b<com.ss.android.ugc.tools.view.style.j, Fragment> get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                com.ss.android.ugc.aweme.sticker.view.internal.main.c cVar = new com.ss.android.ugc.aweme.sticker.view.internal.main.c((byte) 0);
                cVar.a("sticker_category:favorite", new com.ss.android.ugc.aweme.sticker.view.internal.pager.b.b((androidx.lifecycle.m) fVar.a(androidx.lifecycle.m.class, (String) null), (com.ss.android.ugc.aweme.sticker.favorite.b) fVar.a(com.ss.android.ugc.aweme.sticker.favorite.b.class, (String) null), ((com.ss.android.ugc.gamora.recorder.sticker.c.j) fVar.a(com.ss.android.ugc.gamora.recorder.sticker.c.j.class, (String) null)).t(), (StickerPreferences) fVar.a(StickerPreferences.class, (String) null)));
                return cVar;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.o.n nVar) {
            com.bytedance.o.n nVar2 = nVar;
            h.f.b.l.d(nVar2, "");
            h.f.b.l.b(nVar2.a(ch.class, (String) null, (com.bytedance.o.p) new a(this)), "");
            h.f.b.l.b(nVar2.a(ApiCenter.class, (String) null, (com.bytedance.o.p) new b(this)), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.sticker.panel.j.class, (String) null, (com.bytedance.o.p) new c()), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.sticker.types.lock.a.class, (String) null, (com.bytedance.o.p) new d()), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.sticker.view.a.b.class, (String) null, (com.bytedance.o.p) new e()), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.tools.mvtemplate.c.a.class, (String) null, (com.bytedance.o.p) new f()), "");
            return h.z.f158842a;
        }
    }

    public static final class a extends com.bytedance.o.p<com.ss.android.ugc.aweme.shortvideo.n.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141247a;

        static {
            Covode.recordClassIndex(92248);
        }

        public a(com.bytedance.als.dsl.d dVar) {
            this.f141247a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.n.d get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.shortvideo.n.d(fVar);
        }
    }

    public static final class b extends com.bytedance.o.p<com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141248a;

        static {
            Covode.recordClassIndex(92249);
        }

        public b(com.bytedance.als.dsl.d dVar) {
            this.f141248a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c(fVar);
        }
    }

    public static final class c extends com.bytedance.o.p<com.ss.android.ugc.gamora.recorder.sticker.support.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141249a;

        static {
            Covode.recordClassIndex(92250);
        }

        public c(com.bytedance.als.dsl.d dVar) {
            this.f141249a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.sticker.support.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.recorder.sticker.support.b(fVar);
        }
    }

    public static final class d extends com.bytedance.o.p<com.ss.android.ugc.aweme.shortvideo.ui.a.l> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141250a;

        static {
            Covode.recordClassIndex(92251);
        }

        public d(com.bytedance.als.dsl.d dVar) {
            this.f141250a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.ui.a.l get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.shortvideo.ui.a.l(fVar);
        }
    }

    public static final class e extends com.bytedance.o.p<TTEPPreviewEffectLogicComponent> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141251a;

        static {
            Covode.recordClassIndex(92252);
        }

        public e(com.bytedance.als.dsl.d dVar) {
            this.f141251a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ TTEPPreviewEffectLogicComponent get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new TTEPPreviewEffectLogicComponent(fVar);
        }
    }

    public static final class f extends com.bytedance.o.p<com.bytedance.creativex.recorder.gesture.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141252a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f141253b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f141254c;

        static {
            Covode.recordClassIndex(92253);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.bytedance.creativex.recorder.gesture.c get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.bytedance.creativex.recorder.gesture.c(this.f141253b, fVar, R.id.bah);
        }

        public f(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f141252a = dVar;
            this.f141253b = bVar;
            this.f141254c = fVar;
        }
    }

    public static final class g extends com.bytedance.o.p<com.ss.android.ugc.aweme.ttep.ttepcomponent.b.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141255a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f141256b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f141257c;

        static {
            Covode.recordClassIndex(92254);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.ttep.ttepcomponent.b.a get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.ttep.ttepcomponent.b.a(this.f141256b, fVar);
        }

        public g(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f141255a = dVar;
            this.f141256b = bVar;
            this.f141257c = fVar;
        }
    }

    public static final class h extends com.bytedance.o.p<TTEPRecordDockBarComponent> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141258a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f141259b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f141260c;

        static {
            Covode.recordClassIndex(92255);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ TTEPRecordDockBarComponent get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new TTEPRecordDockBarComponent(this.f141259b, fVar);
        }

        public h(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f141258a = dVar;
            this.f141259b = bVar;
            this.f141260c = fVar;
        }
    }

    public static final class j extends com.bytedance.o.p<com.ss.android.ugc.gamora.recorder.d.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141264a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f141265b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f141266c;

        static {
            Covode.recordClassIndex(92257);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.d.c get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.recorder.d.c(this.f141265b, fVar);
        }

        public j(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f141264a = dVar;
            this.f141265b = bVar;
            this.f141266c = fVar;
        }
    }

    public static final class k extends com.bytedance.o.p<com.bytedance.creativex.recorder.filter.panel.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141267a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f141268b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f141269c;

        static {
            Covode.recordClassIndex(92258);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.bytedance.creativex.recorder.filter.panel.a get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return com.ss.android.ugc.aweme.ah.d.a(this.f141268b, fVar);
        }

        public k(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f141267a = dVar;
            this.f141268b = bVar;
            this.f141269c = fVar;
        }
    }

    public static final class l extends com.bytedance.o.p<com.bytedance.creativex.recorder.filter.c.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141270a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f141271b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f141272c;

        static {
            Covode.recordClassIndex(92259);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.bytedance.creativex.recorder.filter.c.a get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.bytedance.creativex.recorder.filter.c.a(this.f141271b, fVar);
        }

        public l(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f141270a = dVar;
            this.f141271b = bVar;
            this.f141272c = fVar;
        }
    }

    public static final class m extends com.bytedance.o.p<com.ss.android.ugc.gamora.recorder.j.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141273a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f141274b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f141275c;

        static {
            Covode.recordClassIndex(92260);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.j.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.recorder.j.b(this.f141274b, fVar);
        }

        public m(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f141273a = dVar;
            this.f141274b = bVar;
            this.f141275c = fVar;
        }
    }

    public static final class n extends com.bytedance.o.p<com.ss.android.ugc.aweme.shortvideo.countdown.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141276a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f141277b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f141278c;

        static {
            Covode.recordClassIndex(92261);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.countdown.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.shortvideo.countdown.b(this.f141277b, fVar);
        }

        public n(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f141276a = dVar;
            this.f141277b = bVar;
            this.f141278c = fVar;
        }
    }

    public static final class o extends com.bytedance.o.p<com.ss.android.ugc.aweme.shortvideo.h.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141279a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f141280b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f141281c;

        static {
            Covode.recordClassIndex(92262);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.h.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.shortvideo.h.b(this.f141280b, fVar, null);
        }

        public o(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f141279a = dVar;
            this.f141280b = bVar;
            this.f141281c = fVar;
        }
    }

    public static final class p extends com.bytedance.o.p<com.ss.android.ugc.aweme.shortvideo.duet.z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141282a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f141283b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f141284c;

        static {
            Covode.recordClassIndex(92263);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.duet.z get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.shortvideo.duet.z(this.f141283b, fVar);
        }

        public p(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f141282a = dVar;
            this.f141283b = bVar;
            this.f141284c = fVar;
        }
    }

    public static final class q extends com.bytedance.o.p<com.ss.android.ugc.gamora.recorder.i.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141285a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f141286b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f141287c;

        static {
            Covode.recordClassIndex(92264);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.i.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.recorder.i.b(this.f141286b, fVar);
        }

        public q(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f141285a = dVar;
            this.f141286b = bVar;
            this.f141287c = fVar;
        }
    }

    public static final class r extends com.bytedance.o.p<com.ss.android.ugc.aweme.z.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141288a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentVideoModel f141289b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f141290c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f141291d;

        static {
            Covode.recordClassIndex(92265);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.z.d get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.z.d(this.f141290c, fVar, this.f141289b);
        }

        public r(com.bytedance.als.dsl.d dVar, CommentVideoModel commentVideoModel, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f141288a = dVar;
            this.f141289b = commentVideoModel;
            this.f141290c = bVar;
            this.f141291d = fVar;
        }
    }

    public static final class s extends com.bytedance.o.p<com.bytedance.creativex.recorder.a.k> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141292a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f141293b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f141294c;

        static {
            Covode.recordClassIndex(92266);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.bytedance.creativex.recorder.a.k get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return com.ss.android.ugc.gamora.recorder.a.a.a(this.f141293b, fVar);
        }

        public s(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f141292a = dVar;
            this.f141293b = bVar;
            this.f141294c = fVar;
        }
    }

    public static final class t extends com.bytedance.o.p<com.ss.android.ugc.gamora.recorder.g.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141295a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f141296b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f141297c;

        static {
            Covode.recordClassIndex(92267);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.g.c get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.recorder.g.c(this.f141296b, fVar);
        }

        public t(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f141295a = dVar;
            this.f141296b = bVar;
            this.f141297c = fVar;
        }
    }

    public static final class u extends com.bytedance.o.p<TTEPRecordChooseMusicComponent> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141298a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f141299b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f141300c;

        static {
            Covode.recordClassIndex(92268);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ TTEPRecordChooseMusicComponent get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new TTEPRecordChooseMusicComponent(this.f141299b, fVar);
        }

        public u(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f141298a = dVar;
            this.f141299b = bVar;
            this.f141300c = fVar;
        }
    }

    public static final class x extends com.bytedance.o.p<com.bytedance.creativex.recorder.sticker.panel.g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141307a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f141308b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f141309c;

        static {
            Covode.recordClassIndex(92271);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.bytedance.creativex.recorder.sticker.panel.g get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return com.ss.android.ugc.aweme.sticker.k.a(fVar, this.f141308b);
        }

        public x(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f141307a = dVar;
            this.f141308b = bVar;
            this.f141309c = fVar;
        }
    }

    public static final class i extends com.bytedance.o.p<TTEPRecordBottomTabComponent> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141261a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f141262b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f141263c;

        static {
            Covode.recordClassIndex(92256);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ TTEPRecordBottomTabComponent get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            com.bytedance.scene.group.b bVar = this.f141262b;
            h.f.b.l.d(fVar, "");
            return new TTEPRecordBottomTabComponent(bVar, fVar, new ArrayList());
        }

        public i(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f141261a = dVar;
            this.f141262b = bVar;
            this.f141263c = fVar;
        }
    }

    public static final class v extends com.bytedance.o.p<com.ss.android.ugc.gamora.recorder.n.a.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141301a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f141302b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f141303c;

        static {
            Covode.recordClassIndex(92269);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.n.a.f get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.cy.b().a(this.f141302b, fVar, new com.ss.android.ugc.aweme.ttep.d.a());
        }

        public v(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f141301a = dVar;
            this.f141302b = bVar;
            this.f141303c = fVar;
        }
    }

    public static final class w extends com.bytedance.o.p<com.ss.android.ugc.gamora.recorder.l.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141304a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f141305b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f141306c;

        static {
            Covode.recordClassIndex(92270);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.l.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.recorder.l.b(this.f141305b, fVar, new com.ss.android.ugc.aweme.ttep.c.a());
        }

        public w(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f141304a = dVar;
            this.f141305b = bVar;
            this.f141306c = fVar;
        }
    }

    public static final class y extends com.bytedance.o.p<com.ss.android.ugc.gamora.recorder.k.g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141310a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f141311b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f141312c;

        static {
            Covode.recordClassIndex(92272);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.k.g get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.recorder.k.g(fVar, this.f141311b, new com.ss.android.ugc.aweme.ttep.ttepcomponent.a.b());
        }

        public y(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
            this.f141310a = dVar;
            this.f141311b = bVar;
            this.f141312c = fVar;
        }
    }

    @Override // com.ss.android.ugc.gamora.TTEPPageFactory
    public final void a(com.bytedance.scene.group.b bVar) {
        h.f.b.l.d(bVar, "");
        com.bytedance.o.f a2 = com.bytedance.als.dsl.g.a(bVar, new z(bVar, (ch) bVar));
        com.bytedance.als.dsl.b bVar2 = new com.bytedance.als.dsl.b(com.bytedance.als.dsl.c.a(bVar));
        com.bytedance.als.dsl.d dVar = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer = bVar2.f6461a;
        alsLogicContainer.f6437d.a(com.bytedance.creativex.recorder.gesture.c.class, (String) null, (com.bytedance.o.p) new f(dVar, bVar, a2));
        alsLogicContainer.a(com.bytedance.creativex.recorder.gesture.api.b.class, com.bytedance.creativex.recorder.gesture.c.class);
        com.bytedance.als.dsl.d dVar2 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer2 = bVar2.f6461a;
        alsLogicContainer2.f6437d.a(com.ss.android.ugc.gamora.recorder.i.b.class, (String) null, (com.bytedance.o.p) new q(dVar2, bVar, a2));
        alsLogicContainer2.a(com.ss.android.ugc.gamora.recorder.i.a.class, com.ss.android.ugc.gamora.recorder.i.b.class);
        com.bytedance.als.dsl.d dVar3 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer3 = bVar2.f6461a;
        alsLogicContainer3.f6437d.a(com.bytedance.creativex.recorder.a.k.class, (String) null, (com.bytedance.o.p) new s(dVar3, bVar, a2));
        alsLogicContainer3.a(com.bytedance.creativex.recorder.a.a.e.class, com.bytedance.creativex.recorder.a.k.class);
        com.bytedance.als.dsl.d dVar4 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer4 = bVar2.f6461a;
        alsLogicContainer4.f6437d.a(com.ss.android.ugc.gamora.recorder.g.c.class, (String) null, (com.bytedance.o.p) new t(dVar4, bVar, a2));
        alsLogicContainer4.a(com.ss.android.ugc.gamora.recorder.g.a.class, com.ss.android.ugc.gamora.recorder.g.c.class);
        com.bytedance.als.dsl.d dVar5 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer5 = bVar2.f6461a;
        alsLogicContainer5.f6437d.a(TTEPRecordChooseMusicComponent.class, (String) null, (com.bytedance.o.p) new u(dVar5, bVar, a2));
        alsLogicContainer5.a(com.ss.android.ugc.gamora.recorder.choosemusic.a.class, TTEPRecordChooseMusicComponent.class);
        com.bytedance.als.dsl.d dVar6 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer6 = bVar2.f6461a;
        alsLogicContainer6.f6437d.a(com.ss.android.ugc.gamora.recorder.n.a.f.class, (String) null, (com.bytedance.o.p) new v(dVar6, bVar, a2));
        alsLogicContainer6.a(com.ss.android.ugc.gamora.recorder.n.a.e.class, com.ss.android.ugc.gamora.recorder.n.a.f.class);
        com.bytedance.als.dsl.d dVar7 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer7 = bVar2.f6461a;
        alsLogicContainer7.f6437d.a(com.ss.android.ugc.gamora.recorder.l.b.class, (String) null, (com.bytedance.o.p) new w(dVar7, bVar, a2));
        alsLogicContainer7.a(com.ss.android.ugc.gamora.recorder.l.f.class, com.ss.android.ugc.gamora.recorder.l.b.class);
        com.bytedance.als.dsl.d dVar8 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer8 = bVar2.f6461a;
        alsLogicContainer8.f6437d.a(com.bytedance.creativex.recorder.sticker.panel.g.class, (String) null, (com.bytedance.o.p) new x(dVar8, bVar, a2));
        alsLogicContainer8.a(RecordStickerPanelViewModel.class, com.bytedance.creativex.recorder.sticker.panel.g.class);
        com.bytedance.als.dsl.d dVar9 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer9 = bVar2.f6461a;
        alsLogicContainer9.f6437d.a(com.ss.android.ugc.gamora.recorder.k.g.class, (String) null, (com.bytedance.o.p) new y(dVar9, bVar, a2));
        alsLogicContainer9.a(com.ss.android.ugc.gamora.recorder.k.a.class, com.ss.android.ugc.gamora.recorder.k.g.class);
        com.bytedance.als.dsl.d dVar10 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer10 = bVar2.f6461a;
        alsLogicContainer10.f6437d.a(com.ss.android.ugc.aweme.ttep.ttepcomponent.b.a.class, (String) null, (com.bytedance.o.p) new g(dVar10, bVar, a2));
        alsLogicContainer10.a(com.ss.android.ugc.gamora.recorder.m.a.class, com.ss.android.ugc.aweme.ttep.ttepcomponent.b.a.class);
        com.bytedance.als.dsl.d dVar11 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer11 = bVar2.f6461a;
        alsLogicContainer11.f6437d.a(TTEPRecordDockBarComponent.class, (String) null, (com.bytedance.o.p) new h(dVar11, bVar, a2));
        alsLogicContainer11.a(com.ss.android.ugc.gamora.recorder.e.a.class, TTEPRecordDockBarComponent.class);
        com.bytedance.als.dsl.d dVar12 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer12 = bVar2.f6461a;
        alsLogicContainer12.f6437d.a(TTEPRecordBottomTabComponent.class, (String) null, (com.bytedance.o.p) new i(dVar12, bVar, a2));
        alsLogicContainer12.a(com.ss.android.ugc.gamora.recorder.b.b.class, TTEPRecordBottomTabComponent.class);
        com.bytedance.als.dsl.d dVar13 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer13 = bVar2.f6461a;
        alsLogicContainer13.f6437d.a(com.ss.android.ugc.gamora.recorder.d.c.class, (String) null, (com.bytedance.o.p) new j(dVar13, bVar, a2));
        alsLogicContainer13.a(com.ss.android.ugc.gamora.recorder.d.a.class, com.ss.android.ugc.gamora.recorder.d.c.class);
        com.bytedance.als.dsl.d dVar14 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer14 = bVar2.f6461a;
        alsLogicContainer14.f6437d.a(com.bytedance.creativex.recorder.filter.panel.a.class, (String) null, (com.bytedance.o.p) new k(dVar14, bVar, a2));
        alsLogicContainer14.a(FilterPanelViewModel.class, com.bytedance.creativex.recorder.filter.panel.a.class);
        com.bytedance.als.dsl.d dVar15 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer15 = bVar2.f6461a;
        alsLogicContainer15.f6437d.a(com.bytedance.creativex.recorder.filter.c.a.class, (String) null, (com.bytedance.o.p) new l(dVar15, bVar, a2));
        alsLogicContainer15.a(com.bytedance.creativex.recorder.filter.a.c.class, com.bytedance.creativex.recorder.filter.c.a.class);
        com.bytedance.als.dsl.d dVar16 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer16 = bVar2.f6461a;
        alsLogicContainer16.f6437d.a(com.ss.android.ugc.gamora.recorder.j.b.class, (String) null, (com.bytedance.o.p) new m(dVar16, bVar, a2));
        alsLogicContainer16.a(com.ss.android.ugc.gamora.recorder.j.a.class, com.ss.android.ugc.gamora.recorder.j.b.class);
        com.bytedance.als.dsl.d dVar17 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer17 = bVar2.f6461a;
        alsLogicContainer17.f6437d.a(com.ss.android.ugc.aweme.shortvideo.countdown.b.class, (String) null, (com.bytedance.o.p) new n(dVar17, bVar, a2));
        alsLogicContainer17.a(com.ss.android.ugc.aweme.shortvideo.countdown.a.class, com.ss.android.ugc.aweme.shortvideo.countdown.b.class);
        com.bytedance.als.dsl.d dVar18 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer18 = bVar2.f6461a;
        alsLogicContainer18.f6437d.a(com.ss.android.ugc.aweme.shortvideo.h.b.class, (String) null, (com.bytedance.o.p) new o(dVar18, bVar, a2));
        alsLogicContainer18.a(com.ss.android.ugc.aweme.shortvideo.h.a.class, com.ss.android.ugc.aweme.shortvideo.h.b.class);
        com.bytedance.als.dsl.d dVar19 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer19 = bVar2.f6461a;
        alsLogicContainer19.f6437d.a(com.ss.android.ugc.aweme.shortvideo.n.d.class, (String) null, (com.bytedance.o.p) new a(dVar19));
        alsLogicContainer19.a(com.ss.android.ugc.aweme.shortvideo.n.a.class, com.ss.android.ugc.aweme.shortvideo.n.d.class);
        com.bytedance.als.dsl.d dVar20 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer20 = bVar2.f6461a;
        alsLogicContainer20.f6437d.a(com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c.class, (String) null, (com.bytedance.o.p) new b(dVar20));
        alsLogicContainer20.a(com.ss.android.ugc.gamora.recorder.choosemusic.recommend.a.class, com.ss.android.ugc.gamora.recorder.choosemusic.recommend.c.class);
        Object a3 = a2.a((Type) ShortVideoContext.class, (String) null);
        h.f.b.l.b(a3, "");
        if (com.ss.android.ugc.aweme.shortvideo.duet.a.a((ShortVideoContext) a3)) {
            com.bytedance.als.dsl.d dVar21 = new com.bytedance.als.dsl.d();
            AlsLogicContainer alsLogicContainer21 = bVar2.f6461a;
            alsLogicContainer21.f6437d.a(com.ss.android.ugc.aweme.shortvideo.duet.z.class, (String) null, (com.bytedance.o.p) new p(dVar21, bVar, a2));
            alsLogicContainer21.a(DuetLayoutModeViewModel.class, com.ss.android.ugc.aweme.shortvideo.duet.z.class);
        }
        CommentVideoModel commentVideoModel = ((ShortVideoContext) a2.a((Type) ShortVideoContext.class, (String) null)).f124767l;
        if (CommentUtils.isDataValid(commentVideoModel)) {
            com.bytedance.als.dsl.d dVar22 = new com.bytedance.als.dsl.d();
            AlsLogicContainer alsLogicContainer22 = bVar2.f6461a;
            alsLogicContainer22.f6437d.a(com.ss.android.ugc.aweme.z.d.class, (String) null, (com.bytedance.o.p) new r(dVar22, commentVideoModel, bVar, a2));
            alsLogicContainer22.a(com.ss.android.ugc.aweme.z.a.class, com.ss.android.ugc.aweme.z.d.class);
        }
        com.bytedance.als.dsl.d dVar23 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer23 = bVar2.f6461a;
        alsLogicContainer23.f6437d.a(com.ss.android.ugc.gamora.recorder.sticker.support.b.class, (String) null, (com.bytedance.o.p) new c(dVar23));
        alsLogicContainer23.a(com.ss.android.ugc.gamora.recorder.sticker.support.a.class, com.ss.android.ugc.gamora.recorder.sticker.support.b.class);
        com.bytedance.als.dsl.d dVar24 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer24 = bVar2.f6461a;
        alsLogicContainer24.f6437d.a(com.ss.android.ugc.aweme.shortvideo.ui.a.l.class, (String) null, (com.bytedance.o.p) new d(dVar24));
        alsLogicContainer24.a(com.ss.android.ugc.aweme.shortvideo.ui.a.k.class, com.ss.android.ugc.aweme.shortvideo.ui.a.l.class);
        com.bytedance.als.dsl.d dVar25 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer25 = bVar2.f6461a;
        alsLogicContainer25.f6437d.a(TTEPPreviewEffectLogicComponent.class, (String) null, (com.bytedance.o.p) new e(dVar25));
        alsLogicContainer25.a(com.ss.android.ugc.aweme.ttep.ttepcomponent.a.class, TTEPPreviewEffectLogicComponent.class);
        bVar2.a();
    }
}
