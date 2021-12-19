package com.ss.android.ugc.aweme.ftc;

import android.app.Application;
import com.bytedance.als.ApiCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.p;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.a.ad;
import com.ss.android.ugc.aweme.shortvideo.ui.a.r;
import com.ss.android.ugc.aweme.shortvideo.ui.ge;
import com.ss.android.ugc.aweme.shortvideo.w.n;
import com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.ss.android.ugc.gamora.recorder.sticker.c.a.c;
import h.z;
import java.lang.reflect.Type;

public final class ab {
    static {
        Covode.recordClassIndex(61891);
    }

    static final class l extends h.f.b.m implements h.f.a.b<com.bytedance.o.n, z> {
        final /* synthetic */ FTCVideoRecordNewActivity $this_bindComponents;

        static {
            Covode.recordClassIndex(61903);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(FTCVideoRecordNewActivity fTCVideoRecordNewActivity) {
            super(1);
            this.$this_bindComponents = fTCVideoRecordNewActivity;
        }

        public static final class m extends p<com.ss.android.ugc.aweme.sticker.m.h> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l f97443a;

            static {
                Covode.recordClassIndex(61917);
            }

            static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.recorder.sticker.c.j> {
                final /* synthetic */ com.bytedance.o.f $it;

                static {
                    Covode.recordClassIndex(61918);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                a(com.bytedance.o.f fVar) {
                    super(0);
                    this.$it = fVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ com.ss.android.ugc.gamora.recorder.sticker.c.j invoke() {
                    return this.$it.a((Type) com.ss.android.ugc.gamora.recorder.sticker.c.j.class, (String) null);
                }
            }

            public m(l lVar) {
                this.f97443a = lVar;
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.sticker.m.h get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                ShortVideoContext shortVideoContext = this.f97443a.$this_bindComponents.f97381g;
                h.f.b.l.b(shortVideoContext, "");
                return new com.ss.android.ugc.aweme.sticker.m.b(shortVideoContext, new a(fVar));
            }
        }

        public static final class j extends p<com.ss.android.ugc.gamora.recorder.sticker.c.d> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l f97442a;

            static {
                Covode.recordClassIndex(61913);
            }

            static final class a extends h.f.b.m implements h.f.a.a<c.a> {
                final /* synthetic */ j this$0;

                static {
                    Covode.recordClassIndex(61914);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                a(j jVar) {
                    super(0);
                    this.this$0 = jVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ c.a invoke() {
                    return new c.a(this.this$0.f97442a.$this_bindComponents.q, this.this$0.f97442a.$this_bindComponents.r, this.this$0.f97442a.$this_bindComponents.o, this.this$0.f97442a.$this_bindComponents.n, !this.this$0.f97442a.$this_bindComponents.w);
                }
            }

            public j(l lVar) {
                this.f97442a = lVar;
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.gamora.recorder.sticker.c.d get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                com.ss.android.ugc.aweme.shortvideo.l.a aVar = this.f97442a.$this_bindComponents.s;
                h.f.b.l.b(aVar, "");
                return new com.ss.android.ugc.gamora.recorder.sticker.c.a.d(fVar, aVar, new a(this));
            }
        }

        public static final class a extends p<FTCVideoRecordNewActivity> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l f97437a;

            static {
                Covode.recordClassIndex(61904);
            }

            public a(l lVar) {
                this.f97437a = lVar;
            }

            @Override // com.bytedance.o.p
            public final FTCVideoRecordNewActivity get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return this.f97437a.$this_bindComponents;
            }
        }

        public static final class f extends p<ShortVideoContext> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l f97438a;

            static {
                Covode.recordClassIndex(61909);
            }

            public f(l lVar) {
                this.f97438a = lVar;
            }

            @Override // com.bytedance.o.p
            public final ShortVideoContext get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return this.f97438a.$this_bindComponents.f97381g;
            }
        }

        public static final class g extends p<com.ss.android.ugc.aweme.adaptation.b> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l f97439a;

            static {
                Covode.recordClassIndex(61910);
            }

            public g(l lVar) {
                this.f97439a = lVar;
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.adaptation.b get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return this.f97439a.$this_bindComponents;
            }
        }

        public static final class h extends p<ApiCenter> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l f97440a;

            static {
                Covode.recordClassIndex(61911);
            }

            public h(l lVar) {
                this.f97440a = lVar;
            }

            @Override // com.bytedance.o.p
            public final ApiCenter get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return ApiCenter.a.a(this.f97440a.$this_bindComponents);
            }
        }

        public static final class i extends p<androidx.lifecycle.m> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l f97441a;

            static {
                Covode.recordClassIndex(61912);
            }

            public i(l lVar) {
                this.f97441a = lVar;
            }

            @Override // com.bytedance.o.p
            public final androidx.lifecycle.m get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return this.f97441a.$this_bindComponents;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.ab$l$l  reason: collision with other inner class name */
        public static final class C2345l extends p<com.ss.android.ugc.aweme.sticker.p.d> {
            static {
                Covode.recordClassIndex(61916);
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.sticker.p.d get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return com.ss.android.ugc.aweme.ah.c.f66314a;
            }
        }

        public static final class b extends p<com.ss.android.ugc.aweme.sticker.favorite.b> {
            static {
                Covode.recordClassIndex(61905);
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.sticker.favorite.b get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return new com.ss.android.ugc.aweme.sticker.favorite.c(fVar);
            }
        }

        public static final class k extends p<com.ss.android.ugc.aweme.shortvideo.ui.creationflow.c> {
            static {
                Covode.recordClassIndex(61915);
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.shortvideo.ui.creationflow.c get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return new com.ss.android.ugc.aweme.shortvideo.ui.creationflow.c();
            }
        }

        static final class n extends h.f.b.m implements h.f.a.b<EffectPlatformBuilder, z> {

            /* renamed from: a  reason: collision with root package name */
            public static final n f97444a = new n();

            static {
                Covode.recordClassIndex(61919);
            }

            n() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(EffectPlatformBuilder effectPlatformBuilder) {
                EffectPlatformBuilder effectPlatformBuilder2 = effectPlatformBuilder;
                h.f.b.l.d(effectPlatformBuilder2, "");
                effectPlatformBuilder2.setEnableKNEffectPlatform(true);
                return z.f158842a;
            }
        }

        public static final class c extends p<com.ss.android.ugc.tools.b.a.d> {
            static {
                Covode.recordClassIndex(61906);
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.tools.b.a.d get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                Application application = com.ss.android.ugc.aweme.port.in.i.f115645a;
                h.f.b.l.b(application, "");
                return com.ss.android.ugc.aweme.effectplatform.c.a(application, n.f97444a);
            }
        }

        public static final class d extends p<StickerPreferences> {
            static {
                Covode.recordClassIndex(61907);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences, java.lang.Object] */
            /* JADX WARNING: Unknown variable types count: 1 */
            @Override // com.bytedance.o.p
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences get(com.bytedance.o.f r5) {
                /*
                    r4 = this;
                    java.lang.String r3 = ""
                    h.f.b.l.d(r5, r3)
                    com.bytedance.cukaie.closet.a r2 = new com.bytedance.cukaie.closet.a
                    com.bytedance.cukaie.closet.internal.d r0 = new com.bytedance.cukaie.closet.internal.d
                    r0.<init>()
                    r2.<init>(r0)
                    android.app.Application r1 = com.ss.android.ugc.aweme.port.in.i.f115645a
                    h.f.b.l.b(r1, r3)
                    java.lang.Class<com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences> r0 = com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences.class
                    java.lang.Object r0 = r2.a(r1, r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.ab.l.d.get(com.bytedance.o.f):java.lang.Object");
            }
        }

        public static final class e extends p<com.ss.android.ugc.aweme.sticker.panel.guide.j> {
            static {
                Covode.recordClassIndex(61908);
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.sticker.panel.guide.j get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return com.ss.android.ugc.aweme.sticker.k.a((ShortVideoContext) fVar.a(ShortVideoContext.class, (String) null));
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.o.n nVar) {
            com.bytedance.o.n nVar2 = nVar;
            h.f.b.l.d(nVar2, "");
            h.f.b.l.b(nVar2.a(FTCVideoRecordNewActivity.class, (String) null, (p) new a(this)), "");
            h.f.b.l.b(nVar2.a(ShortVideoContext.class, (String) null, (p) new f(this)), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.adaptation.b.class, (String) null, (p) new g(this)), "");
            h.f.b.l.b(nVar2.a(ApiCenter.class, (String) null, (p) new h(this)), "");
            h.f.b.l.b(nVar2.a(androidx.lifecycle.m.class, (String) null, (p) new i(this)), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.gamora.recorder.sticker.c.d.class, (String) null, (p) new j(this)), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.shortvideo.ui.creationflow.c.class, (String) null, (p) new k()), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.sticker.p.d.class, (String) null, (p) new C2345l()), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.sticker.m.h.class, (String) null, (p) new m(this)), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.sticker.favorite.b.class, (String) null, (p) new b()), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.tools.b.a.d.class, (String) null, (p) new c()), "");
            h.f.b.l.b(nVar2.a(StickerPreferences.class, (String) null, (p) new d()), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.sticker.panel.guide.j.class, (String) null, (p) new e()), "");
            return z.f158842a;
        }
    }

    public static final class a extends p<com.ss.android.ugc.gamora.recorder.sticker.a.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f97424a;

        static {
            Covode.recordClassIndex(61892);
        }

        public a(com.bytedance.als.dsl.d dVar) {
            this.f97424a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.sticker.a.a get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.recorder.sticker.a.a(fVar);
        }
    }

    public static final class b extends p<com.ss.android.ugc.aweme.shortvideo.ui.a.g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f97425a;

        static {
            Covode.recordClassIndex(61893);
        }

        public b(com.bytedance.als.dsl.d dVar) {
            this.f97425a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.ui.a.g get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.shortvideo.ui.a.g(fVar);
        }
    }

    public static final class c extends p<ad> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f97426a;

        static {
            Covode.recordClassIndex(61894);
        }

        public c(com.bytedance.als.dsl.d dVar) {
            this.f97426a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ ad get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return ge.a(fVar);
        }
    }

    public static final class d extends p<com.bytedance.creativex.recorder.filter.d.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f97427a;

        static {
            Covode.recordClassIndex(61895);
        }

        public d(com.bytedance.als.dsl.d dVar) {
            this.f97427a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.bytedance.creativex.recorder.filter.d.a get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.bytedance.creativex.recorder.filter.d.a(fVar);
        }
    }

    public static final class e extends p<com.bytedance.creativex.recorder.a.i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f97428a;

        static {
            Covode.recordClassIndex(61896);
        }

        public e(com.bytedance.als.dsl.d dVar) {
            this.f97428a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.bytedance.creativex.recorder.a.i get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return com.ss.android.ugc.aweme.shortvideo.beauty.a.a(fVar, true);
        }
    }

    public static final class f extends p<com.ss.android.ugc.gamora.recorder.sticker.c.h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f97429a;

        static {
            Covode.recordClassIndex(61897);
        }

        public f(com.bytedance.als.dsl.d dVar) {
            this.f97429a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.sticker.c.h get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            com.ss.android.ugc.aweme.port.in.g.a().w();
            h.f.b.l.b("default", "");
            return com.ss.android.ugc.aweme.sticker.l.a("default", fVar, null, null, null, null, 60);
        }
    }

    public static final class g extends p<com.ss.android.ugc.aweme.shortvideo.ui.a.h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f97430a;

        static {
            Covode.recordClassIndex(61898);
        }

        public g(com.bytedance.als.dsl.d dVar) {
            this.f97430a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.ui.a.h get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.shortvideo.ui.a.h(fVar);
        }
    }

    public static final class h extends p<com.ss.android.ugc.aweme.shortvideo.ui.a.j> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f97431a;

        static {
            Covode.recordClassIndex(61899);
        }

        public h(com.bytedance.als.dsl.d dVar) {
            this.f97431a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.ui.a.j get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.shortvideo.ui.a.j(fVar);
        }
    }

    public static final class i extends p<com.ss.android.ugc.aweme.shortvideo.ui.a.e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f97432a;

        static {
            Covode.recordClassIndex(61900);
        }

        public i(com.bytedance.als.dsl.d dVar) {
            this.f97432a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.ui.a.e get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.shortvideo.ui.a.e(fVar);
        }
    }

    public static final class j extends p<r> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f97433a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FTCVideoRecordNewActivity f97434b;

        static {
            Covode.recordClassIndex(61901);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ r get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new r(fVar, this.f97434b.f97381g.f124757b, this.f97434b.f97381g.q);
        }

        public j(com.bytedance.als.dsl.d dVar, FTCVideoRecordNewActivity fTCVideoRecordNewActivity) {
            this.f97433a = dVar;
            this.f97434b = fTCVideoRecordNewActivity;
        }
    }

    public static final class k extends p<n> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f97435a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FTCVideoRecordNewActivity f97436b;

        static {
            Covode.recordClassIndex(61902);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ n get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            ShortVideoContext shortVideoContext = this.f97436b.f97381g;
            h.f.b.l.b(shortVideoContext, "");
            return com.ss.android.ugc.aweme.shortvideo.w.i.a(fVar, shortVideoContext);
        }

        public k(com.bytedance.als.dsl.d dVar, FTCVideoRecordNewActivity fTCVideoRecordNewActivity) {
            this.f97435a = dVar;
            this.f97436b = fTCVideoRecordNewActivity;
        }
    }
}
