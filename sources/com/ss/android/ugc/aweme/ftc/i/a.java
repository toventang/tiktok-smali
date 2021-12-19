package com.ss.android.ugc.aweme.ftc.i;

import androidx.fragment.app.Fragment;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.als.ApiCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel;
import com.bytedance.creativex.recorder.sticker.panel.RecordStickerPanelViewModel;
import com.ss.android.ugc.aweme.ftc.l.a;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.em;
import com.ss.android.ugc.aweme.shortvideo.ui.a.ab;
import com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.ss.android.ugc.aweme.utils.ig;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.PageFactory;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.ArrayList;

public final class a implements PageFactory {
    static {
        Covode.recordClassIndex(62694);
    }

    static final class r extends h.f.b.m implements h.f.a.b<com.bytedance.o.n, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.ftc.c $planC;
        final /* synthetic */ com.bytedance.scene.group.b $this_create;

        static {
            Covode.recordClassIndex(62712);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(com.bytedance.scene.group.b bVar, com.ss.android.ugc.aweme.ftc.c cVar) {
            super(1);
            this.$this_create = bVar;
            this.$planC = cVar;
        }

        public static final class d extends com.bytedance.o.p<com.ss.android.ugc.aweme.sticker.types.lock.a> {
            static {
                Covode.recordClassIndex(62716);
            }

            /* renamed from: com.ss.android.ugc.aweme.ftc.i.a$r$d$a  reason: collision with other inner class name */
            public static final class C2392a implements com.ss.android.ugc.aweme.sticker.types.lock.a {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ com.bytedance.o.f f98637a;

                /* renamed from: b  reason: collision with root package name */
                private final com.ss.android.ugc.aweme.sticker.panel.j f98638b;

                static {
                    Covode.recordClassIndex(62717);
                }

                @Override // com.ss.android.ugc.aweme.sticker.types.lock.a
                public final boolean isLockStickerEnable() {
                    return this.f98638b.f135221i;
                }

                @Override // com.ss.android.ugc.aweme.sticker.types.lock.a
                public final boolean reallyLockedSticker(Effect effect) {
                    return com.ss.android.ugc.aweme.sticker.types.lock.b.b(effect);
                }

                C2392a(com.bytedance.o.f fVar) {
                    this.f98637a = fVar;
                    this.f98638b = (com.ss.android.ugc.aweme.sticker.panel.j) fVar.a(com.ss.android.ugc.aweme.sticker.panel.j.class, (String) null);
                }
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.sticker.types.lock.a get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return new C2392a(fVar);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.i.a$r$a  reason: collision with other inner class name */
        public static final class C2391a extends com.bytedance.o.p<com.ss.android.ugc.aweme.ftc.c> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ r f98635a;

            static {
                Covode.recordClassIndex(62713);
            }

            public C2391a(r rVar) {
                this.f98635a = rVar;
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.ftc.c get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return this.f98635a.$planC;
            }
        }

        public static final class b extends com.bytedance.o.p<ApiCenter> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ r f98636a;

            static {
                Covode.recordClassIndex(62714);
            }

            public b(r rVar) {
                this.f98636a = rVar;
            }

            @Override // com.bytedance.o.p
            public final ApiCenter get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return ApiCenter.a.a(com.bytedance.scene.ktx.c.b(this.f98636a.$this_create));
            }
        }

        public static final class c extends com.bytedance.o.p<com.ss.android.ugc.aweme.sticker.panel.j> {
            static {
                Covode.recordClassIndex(62715);
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.sticker.panel.j get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return com.ss.android.ugc.aweme.ah.f.a((androidx.fragment.app.e) fVar.a(androidx.fragment.app.e.class, (String) null), (com.bytedance.creativex.recorder.b.a.d) fVar.a(com.bytedance.creativex.recorder.b.a.d.class, (String) null), false, false, 28);
            }
        }

        public static final class e extends com.bytedance.o.p<com.ss.android.ugc.aweme.sticker.view.a.b<com.ss.android.ugc.tools.view.style.j, Fragment>> {
            static {
                Covode.recordClassIndex(62718);
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
        public final /* synthetic */ z invoke(com.bytedance.o.n nVar) {
            com.bytedance.o.n nVar2 = nVar;
            h.f.b.l.d(nVar2, "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.ftc.c.class, (String) null, (com.bytedance.o.p) new C2391a(this)), "");
            h.f.b.l.b(nVar2.a(ApiCenter.class, (String) null, (com.bytedance.o.p) new b(this)), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.sticker.panel.j.class, (String) null, (com.bytedance.o.p) new c()), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.sticker.types.lock.a.class, (String) null, (com.bytedance.o.p) new d()), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.sticker.view.a.b.class, (String) null, (com.bytedance.o.p) new e()), "");
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.i.a$a  reason: collision with other inner class name */
    public static final class C2390a extends com.bytedance.o.p<com.ss.android.ugc.aweme.shortvideo.ui.a.l> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f98602a;

        static {
            Covode.recordClassIndex(62695);
        }

        public C2390a(com.bytedance.als.dsl.d dVar) {
            this.f98602a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.ui.a.l get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.shortvideo.ui.a.l(fVar);
        }
    }

    public static final class b extends com.bytedance.o.p<com.bytedance.creativex.recorder.gesture.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f98603a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f98604b;

        static {
            Covode.recordClassIndex(62696);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.bytedance.creativex.recorder.gesture.c get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.bytedance.creativex.recorder.gesture.c(this.f98604b, fVar, R.id.bah);
        }

        public b(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar) {
            this.f98603a = dVar;
            this.f98604b = bVar;
        }
    }

    public static final class c extends com.bytedance.o.p<com.ss.android.ugc.gamora.recorder.e.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f98605a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f98606b;

        static {
            Covode.recordClassIndex(62697);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.e.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.recorder.e.b(this.f98606b, fVar);
        }

        public c(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar) {
            this.f98605a = dVar;
            this.f98606b = bVar;
        }
    }

    public static final class e extends com.bytedance.o.p<com.bytedance.creativex.recorder.filter.panel.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f98609a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f98610b;

        static {
            Covode.recordClassIndex(62699);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.bytedance.creativex.recorder.filter.panel.a get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return com.ss.android.ugc.aweme.ah.d.a(this.f98610b, fVar);
        }

        public e(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar) {
            this.f98609a = dVar;
            this.f98610b = bVar;
        }
    }

    public static final class f extends com.bytedance.o.p<com.bytedance.creativex.recorder.filter.c.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f98611a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f98612b;

        static {
            Covode.recordClassIndex(62700);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.bytedance.creativex.recorder.filter.c.a get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.bytedance.creativex.recorder.filter.c.a(this.f98612b, fVar);
        }

        public f(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar) {
            this.f98611a = dVar;
            this.f98612b = bVar;
        }
    }

    public static final class g extends com.bytedance.o.p<com.ss.android.ugc.aweme.ftc.f.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f98613a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f98614b;

        static {
            Covode.recordClassIndex(62701);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.ftc.f.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.ftc.f.b(this.f98614b, fVar);
        }

        public g(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar) {
            this.f98613a = dVar;
            this.f98614b = bVar;
        }
    }

    public static final class h extends com.bytedance.o.p<com.ss.android.ugc.aweme.ftc.countdown.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f98615a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f98616b;

        static {
            Covode.recordClassIndex(62702);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.ftc.countdown.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.ftc.countdown.b(this.f98616b, fVar);
        }

        public h(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar) {
            this.f98615a = dVar;
            this.f98616b = bVar;
        }
    }

    public static final class i extends com.bytedance.o.p<com.ss.android.ugc.aweme.shortvideo.h.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f98617a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f98618b;

        static {
            Covode.recordClassIndex(62703);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.h.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.shortvideo.h.b(this.f98618b, fVar, null);
        }

        public i(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar) {
            this.f98617a = dVar;
            this.f98618b = bVar;
        }
    }

    public static final class j extends com.bytedance.o.p<com.ss.android.ugc.aweme.ftc.e.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f98619a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f98620b;

        static {
            Covode.recordClassIndex(62704);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.ftc.e.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.ftc.e.b(this.f98620b, fVar);
        }

        public j(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar) {
            this.f98619a = dVar;
            this.f98620b = bVar;
        }
    }

    public static final class k extends com.bytedance.o.p<com.bytedance.creativex.recorder.a.k> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f98621a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f98622b;

        static {
            Covode.recordClassIndex(62705);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.bytedance.creativex.recorder.a.k get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return com.ss.android.ugc.gamora.recorder.a.a.a(this.f98622b, fVar);
        }

        public k(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar) {
            this.f98621a = dVar;
            this.f98622b = bVar;
        }
    }

    public static final class l extends com.bytedance.o.p<com.ss.android.ugc.aweme.ftc.d.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f98623a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f98624b;

        static {
            Covode.recordClassIndex(62706);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.ftc.d.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.ftc.d.b(this.f98624b, fVar);
        }

        public l(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar) {
            this.f98623a = dVar;
            this.f98624b = bVar;
        }
    }

    public static final class m extends com.bytedance.o.p<com.ss.android.ugc.aweme.ftc.b.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f98625a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f98626b;

        static {
            Covode.recordClassIndex(62707);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.ftc.b.f get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.ftc.b.f(this.f98626b, fVar);
        }

        public m(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar) {
            this.f98625a = dVar;
            this.f98626b = bVar;
        }
    }

    public static final class o extends com.bytedance.o.p<com.ss.android.ugc.aweme.ftc.k.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f98629a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f98630b;

        static {
            Covode.recordClassIndex(62709);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.ftc.k.a get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.ftc.k.a(this.f98630b, fVar);
        }

        public o(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar) {
            this.f98629a = dVar;
            this.f98630b = bVar;
        }
    }

    public static final class p extends com.bytedance.o.p<com.bytedance.creativex.recorder.sticker.panel.g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f98631a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f98632b;

        static {
            Covode.recordClassIndex(62710);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.bytedance.creativex.recorder.sticker.panel.g get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return com.ss.android.ugc.aweme.sticker.k.a(fVar, this.f98632b);
        }

        public p(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar) {
            this.f98631a = dVar;
            this.f98632b = bVar;
        }
    }

    public static final class q extends com.bytedance.o.p<com.ss.android.ugc.aweme.ftc.h.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f98633a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f98634b;

        static {
            Covode.recordClassIndex(62711);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.ftc.h.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.ftc.h.b(fVar, this.f98634b);
        }

        public q(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar) {
            this.f98633a = dVar;
            this.f98634b = bVar;
        }
    }

    public static final class d extends com.bytedance.o.p<com.ss.android.ugc.aweme.ftc.a.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f98607a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f98608b;

        static {
            Covode.recordClassIndex(62698);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.ftc.a.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            com.bytedance.scene.group.b bVar = this.f98608b;
            h.f.b.l.d(fVar, "");
            ArrayList arrayList = new ArrayList();
            h.f.b.l.b(fVar.a(ShortVideoContext.class), "");
            arrayList.add(new com.ss.android.ugc.aweme.ftc.j.a(ig.a(com.ss.android.ugc.aweme.ftc.j.b.RECORD_COMBINE_60.getNameResId()), ig.a(com.ss.android.ugc.aweme.ftc.j.b.RECORD_COMBINE_60.getTagResId()), "video_60", false));
            arrayList.add(new com.ss.android.ugc.aweme.ftc.j.a(ig.a(com.ss.android.ugc.aweme.ftc.j.b.RECORD_COMBINE_15.getNameResId()), ig.a(com.ss.android.ugc.aweme.ftc.j.b.RECORD_COMBINE_15.getTagResId()), "video_15", true));
            return new com.ss.android.ugc.aweme.ftc.a.b(bVar, fVar, arrayList);
        }

        public d(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar) {
            this.f98607a = dVar;
            this.f98608b = bVar;
        }
    }

    public static final class n extends com.bytedance.o.p<com.ss.android.ugc.aweme.ftc.l.a.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f98627a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f98628b;

        static {
            Covode.recordClassIndex(62708);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.ftc.l.a.d get(com.bytedance.o.f fVar) {
            boolean z;
            h.f.b.l.d(fVar, "");
            com.ss.android.ugc.aweme.ftc.l.a aVar = new com.ss.android.ugc.aweme.ftc.l.a();
            com.bytedance.scene.group.b bVar = this.f98628b;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(fVar, "");
            Object a2 = fVar.a(com.bytedance.creativex.recorder.b.a.d.class, (String) null);
            h.f.b.l.b(a2, "");
            aVar.f98671b = (com.bytedance.creativex.recorder.b.a.d) a2;
            Object a3 = fVar.a(com.bytedance.creativex.recorder.b.a.m.class, (String) null);
            h.f.b.l.b(a3, "");
            aVar.f98672c = (com.bytedance.creativex.recorder.b.a.m) a3;
            Object a4 = fVar.a(ShortVideoContext.class, (String) null);
            h.f.b.l.b(a4, "");
            aVar.f98673d = (ShortVideoContext) a4;
            Object a5 = fVar.a(androidx.fragment.app.e.class, (String) null);
            h.f.b.l.b(a5, "");
            aVar.f98674e = (androidx.fragment.app.e) a5;
            androidx.fragment.app.e eVar = aVar.f98674e;
            if (eVar == null) {
                h.f.b.l.a("activity");
            }
            aVar.f98675f = em.a(eVar);
            com.ss.android.ugc.aweme.ftc.l.c cVar = new com.ss.android.ugc.aweme.ftc.l.c(fVar, aVar.f98675f);
            boolean a6 = com.ss.android.ugc.aweme.beauty.f.a();
            com.ss.android.ugc.aweme.shortvideo.i.h hVar = new com.ss.android.ugc.aweme.shortvideo.i.h(new ab());
            a.b bVar2 = aVar.f98670a;
            if (aVar.f98673d == null) {
                h.f.b.l.a("shortVideoContext");
            }
            if (hVar.a() == 1) {
                z = true;
            } else {
                z = false;
            }
            bVar2.f98682a = z;
            a.b bVar3 = aVar.f98670a;
            com.bytedance.creativex.recorder.b.a.d dVar = aVar.f98671b;
            if (dVar == null) {
                h.f.b.l.a("cameraApiComponent");
            }
            bVar3.f98683b = dVar.a(aVar.f98670a.f98682a, false);
            a.b bVar4 = aVar.f98670a;
            ShortVideoContext shortVideoContext = aVar.f98673d;
            if (shortVideoContext == null) {
                h.f.b.l.a("shortVideoContext");
            }
            bVar4.f98684c = shortVideoContext.f124757b.a();
            a.C2396a aVar2 = new a.C2396a();
            aVar2.a(cVar.a(), a.C2396a.C2397a.f98681a).a(cVar.b(), new a.c(aVar)).a(cVar.c(), new a.d(a6)).a(cVar.d(), a.C2396a.C2397a.f98681a).a(cVar.e(), new a.e(a6)).a(cVar.f(), new a.f(aVar)).a(cVar.i(), new a.g(aVar));
            boolean z2 = aVar.f98675f;
            try {
                Class<?> cls = Class.forName("com.ss.android.ugc.toolbar.IsModeo");
                cls.getDeclaredMethod("addIcons", a.C2396a.class, Boolean.TYPE).invoke(cls.newInstance(), aVar2, Boolean.valueOf(z2));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            com.bytedance.creativex.recorder.b.a.m mVar = aVar.f98672c;
            if (mVar == null) {
                h.f.b.l.a("recordControlApi");
            }
            ShortVideoContext shortVideoContext2 = aVar.f98673d;
            if (shortVideoContext2 == null) {
                h.f.b.l.a("shortVideoContext");
            }
            mVar.a(shortVideoContext2.f124757b.t, true);
            com.bytedance.creativex.recorder.b.a.d dVar2 = aVar.f98671b;
            if (dVar2 == null) {
                h.f.b.l.a("cameraApiComponent");
            }
            if (dVar2.P()) {
                com.bytedance.creativex.recorder.b.a.d dVar3 = aVar.f98671b;
                if (dVar3 == null) {
                    h.f.b.l.a("cameraApiComponent");
                }
                dVar3.b(5);
            }
            return new com.ss.android.ugc.aweme.ftc.l.a.d(bVar, fVar, aVar2.f98679a, cVar.h(), new a.h(aVar, bVar, fVar, cVar), com.ss.android.ugc.aweme.ftc.l.a.a());
        }

        public n(com.bytedance.als.dsl.d dVar, com.bytedance.scene.group.b bVar) {
            this.f98627a = dVar;
            this.f98628b = bVar;
        }
    }

    @Override // com.ss.android.ugc.gamora.PageFactory
    public final void a(com.bytedance.scene.group.b bVar) {
        h.f.b.l.d(bVar, "");
        com.bytedance.als.dsl.g.a(bVar, new r(bVar, (com.ss.android.ugc.aweme.ftc.c) bVar));
        com.bytedance.als.dsl.b bVar2 = new com.bytedance.als.dsl.b(com.bytedance.als.dsl.c.a(bVar));
        com.bytedance.als.dsl.d dVar = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer = bVar2.f6461a;
        alsLogicContainer.f6437d.a(com.bytedance.creativex.recorder.gesture.c.class, (String) null, (com.bytedance.o.p) new b(dVar, bVar));
        alsLogicContainer.a(com.bytedance.creativex.recorder.gesture.api.b.class, com.bytedance.creativex.recorder.gesture.c.class);
        com.bytedance.als.dsl.d dVar2 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer2 = bVar2.f6461a;
        alsLogicContainer2.f6437d.a(com.ss.android.ugc.aweme.ftc.e.b.class, (String) null, (com.bytedance.o.p) new j(dVar2, bVar));
        alsLogicContainer2.a(com.ss.android.ugc.aweme.ftc.e.a.class, com.ss.android.ugc.aweme.ftc.e.b.class);
        com.bytedance.als.dsl.d dVar3 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer3 = bVar2.f6461a;
        alsLogicContainer3.f6437d.a(com.bytedance.creativex.recorder.a.k.class, (String) null, (com.bytedance.o.p) new k(dVar3, bVar));
        alsLogicContainer3.a(com.bytedance.creativex.recorder.a.a.e.class, com.bytedance.creativex.recorder.a.k.class);
        com.bytedance.als.dsl.d dVar4 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer4 = bVar2.f6461a;
        alsLogicContainer4.f6437d.a(com.ss.android.ugc.aweme.ftc.d.b.class, (String) null, (com.bytedance.o.p) new l(dVar4, bVar));
        alsLogicContainer4.a(com.ss.android.ugc.aweme.ftc.d.a.class, com.ss.android.ugc.aweme.ftc.d.b.class);
        com.bytedance.als.dsl.d dVar5 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer5 = bVar2.f6461a;
        alsLogicContainer5.f6437d.a(com.ss.android.ugc.aweme.ftc.b.f.class, (String) null, (com.bytedance.o.p) new m(dVar5, bVar));
        alsLogicContainer5.a(com.ss.android.ugc.aweme.ftc.b.a.class, com.ss.android.ugc.aweme.ftc.b.f.class);
        com.bytedance.als.dsl.d dVar6 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer6 = bVar2.f6461a;
        alsLogicContainer6.f6437d.a(com.ss.android.ugc.aweme.ftc.l.a.d.class, (String) null, (com.bytedance.o.p) new n(dVar6, bVar));
        alsLogicContainer6.a(com.ss.android.ugc.aweme.ftc.l.a.c.class, com.ss.android.ugc.aweme.ftc.l.a.d.class);
        com.bytedance.als.dsl.d dVar7 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer7 = bVar2.f6461a;
        alsLogicContainer7.f6437d.a(com.ss.android.ugc.aweme.ftc.k.a.class, (String) null, (com.bytedance.o.p) new o(dVar7, bVar));
        alsLogicContainer7.a(com.ss.android.ugc.aweme.ftc.k.d.class, com.ss.android.ugc.aweme.ftc.k.a.class);
        com.bytedance.als.dsl.d dVar8 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer8 = bVar2.f6461a;
        alsLogicContainer8.f6437d.a(com.bytedance.creativex.recorder.sticker.panel.g.class, (String) null, (com.bytedance.o.p) new p(dVar8, bVar));
        alsLogicContainer8.a(RecordStickerPanelViewModel.class, com.bytedance.creativex.recorder.sticker.panel.g.class);
        com.bytedance.als.dsl.d dVar9 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer9 = bVar2.f6461a;
        alsLogicContainer9.f6437d.a(com.ss.android.ugc.aweme.ftc.h.b.class, (String) null, (com.bytedance.o.p) new q(dVar9, bVar));
        alsLogicContainer9.a(com.ss.android.ugc.aweme.ftc.h.a.class, com.ss.android.ugc.aweme.ftc.h.b.class);
        com.bytedance.als.dsl.d dVar10 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer10 = bVar2.f6461a;
        alsLogicContainer10.f6437d.a(com.ss.android.ugc.gamora.recorder.e.b.class, (String) null, (com.bytedance.o.p) new c(dVar10, bVar));
        alsLogicContainer10.a(com.ss.android.ugc.gamora.recorder.e.a.class, com.ss.android.ugc.gamora.recorder.e.b.class);
        com.bytedance.als.dsl.d dVar11 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer11 = bVar2.f6461a;
        alsLogicContainer11.f6437d.a(com.ss.android.ugc.aweme.ftc.a.b.class, (String) null, (com.bytedance.o.p) new d(dVar11, bVar));
        alsLogicContainer11.a(com.ss.android.ugc.aweme.ftc.a.a.class, com.ss.android.ugc.aweme.ftc.a.b.class);
        com.bytedance.als.dsl.d dVar12 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer12 = bVar2.f6461a;
        alsLogicContainer12.f6437d.a(com.bytedance.creativex.recorder.filter.panel.a.class, (String) null, (com.bytedance.o.p) new e(dVar12, bVar));
        alsLogicContainer12.a(FilterPanelViewModel.class, com.bytedance.creativex.recorder.filter.panel.a.class);
        com.bytedance.als.dsl.d dVar13 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer13 = bVar2.f6461a;
        alsLogicContainer13.f6437d.a(com.bytedance.creativex.recorder.filter.c.a.class, (String) null, (com.bytedance.o.p) new f(dVar13, bVar));
        alsLogicContainer13.a(com.bytedance.creativex.recorder.filter.a.c.class, com.bytedance.creativex.recorder.filter.c.a.class);
        com.bytedance.als.dsl.d dVar14 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer14 = bVar2.f6461a;
        alsLogicContainer14.f6437d.a(com.ss.android.ugc.aweme.ftc.f.b.class, (String) null, (com.bytedance.o.p) new g(dVar14, bVar));
        alsLogicContainer14.a(com.ss.android.ugc.aweme.ftc.f.a.class, com.ss.android.ugc.aweme.ftc.f.b.class);
        com.bytedance.als.dsl.d dVar15 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer15 = bVar2.f6461a;
        alsLogicContainer15.f6437d.a(com.ss.android.ugc.aweme.ftc.countdown.b.class, (String) null, (com.bytedance.o.p) new h(dVar15, bVar));
        alsLogicContainer15.a(com.ss.android.ugc.aweme.ftc.countdown.a.class, com.ss.android.ugc.aweme.ftc.countdown.b.class);
        com.bytedance.als.dsl.d dVar16 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer16 = bVar2.f6461a;
        alsLogicContainer16.f6437d.a(com.ss.android.ugc.aweme.shortvideo.h.b.class, (String) null, (com.bytedance.o.p) new i(dVar16, bVar));
        alsLogicContainer16.a(com.ss.android.ugc.aweme.shortvideo.h.a.class, com.ss.android.ugc.aweme.shortvideo.h.b.class);
        com.bytedance.als.dsl.d dVar17 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer17 = bVar2.f6461a;
        alsLogicContainer17.f6437d.a(com.ss.android.ugc.aweme.shortvideo.ui.a.l.class, (String) null, (com.bytedance.o.p) new C2390a(dVar17));
        alsLogicContainer17.a(com.ss.android.ugc.aweme.shortvideo.ui.a.k.class, com.ss.android.ugc.aweme.shortvideo.ui.a.l.class);
        bVar2.a();
    }
}
