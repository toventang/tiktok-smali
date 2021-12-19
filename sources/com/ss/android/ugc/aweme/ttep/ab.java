package com.ss.android.ugc.aweme.ttep;

import android.app.Application;
import android.content.Context;
import com.bytedance.als.ApiCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.b.c;
import com.bytedance.o.p;
import com.ss.android.ugc.aweme.filter.repository.internal.main.l;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.a.r;
import com.ss.android.ugc.aweme.sticker.presenter.q;
import com.ss.android.ugc.aweme.sticker.repository.a.t;
import com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.ss.android.ugc.aweme.ttep.a;
import com.ss.android.ugc.aweme.ttep.filter.TTEPFilterLogicComponent;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.gamora.recorder.sticker.c.a.c;
import com.zhiliaoapp.musically.R;
import h.z;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class ab {

    static final class m extends h.f.b.m implements h.f.a.b<com.bytedance.creativex.recorder.filter.a.b, com.bytedance.creativex.recorder.filter.a.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f141245a = new m();

        static {
            Covode.recordClassIndex(92244);
        }

        m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.creativex.recorder.filter.a.b invoke(com.bytedance.creativex.recorder.filter.a.b bVar) {
            h.f.b.l.d(bVar, "");
            return bVar;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f141246a = new n();

        static {
            Covode.recordClassIndex(92245);
        }

        n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(92212);
    }

    static final class k extends h.f.b.m implements h.f.a.b<com.bytedance.o.n, z> {
        final /* synthetic */ TTEPEffectPreviewActivity $this_bindComponents;

        static {
            Covode.recordClassIndex(92226);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(TTEPEffectPreviewActivity tTEPEffectPreviewActivity) {
            super(1);
            this.$this_bindComponents = tTEPEffectPreviewActivity;
        }

        public static final class m extends p<com.ss.android.ugc.aweme.sticker.m.h> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k f141242a;

            static {
                Covode.recordClassIndex(92240);
            }

            static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.recorder.sticker.c.j> {
                final /* synthetic */ com.bytedance.o.f $it;

                static {
                    Covode.recordClassIndex(92241);
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

            public m(k kVar) {
                this.f141242a = kVar;
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.sticker.m.h get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                ShortVideoContext shortVideoContext = this.f141242a.$this_bindComponents.f141209g;
                h.f.b.l.b(shortVideoContext, "");
                return new com.ss.android.ugc.aweme.sticker.m.b(shortVideoContext, new a(fVar));
            }
        }

        public static final class j extends p<com.ss.android.ugc.gamora.recorder.sticker.c.d> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k f141241a;

            static {
                Covode.recordClassIndex(92236);
            }

            static final class a extends h.f.b.m implements h.f.a.a<c.a> {
                final /* synthetic */ j this$0;

                static {
                    Covode.recordClassIndex(92237);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                a(j jVar) {
                    super(0);
                    this.this$0 = jVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ c.a invoke() {
                    return new c.a(this.this$0.f141241a.$this_bindComponents.p, this.this$0.f141241a.$this_bindComponents.q, this.this$0.f141241a.$this_bindComponents.n, this.this$0.f141241a.$this_bindComponents.f141215m, !this.this$0.f141241a.$this_bindComponents.w);
                }
            }

            public j(k kVar) {
                this.f141241a = kVar;
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.gamora.recorder.sticker.c.d get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                com.ss.android.ugc.aweme.shortvideo.l.a aVar = this.f141241a.$this_bindComponents.r;
                h.f.b.l.b(aVar, "");
                return new com.ss.android.ugc.gamora.recorder.sticker.c.a.d(fVar, aVar, new a(this));
            }
        }

        public static final class a extends p<TTEPEffectPreviewActivity> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k f141236a;

            static {
                Covode.recordClassIndex(92227);
            }

            public a(k kVar) {
                this.f141236a = kVar;
            }

            @Override // com.bytedance.o.p
            public final TTEPEffectPreviewActivity get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return this.f141236a.$this_bindComponents;
            }
        }

        public static final class f extends p<ShortVideoContext> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k f141237a;

            static {
                Covode.recordClassIndex(92232);
            }

            public f(k kVar) {
                this.f141237a = kVar;
            }

            @Override // com.bytedance.o.p
            public final ShortVideoContext get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return this.f141237a.$this_bindComponents.f141209g;
            }
        }

        public static final class g extends p<com.ss.android.ugc.aweme.adaptation.b> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k f141238a;

            static {
                Covode.recordClassIndex(92233);
            }

            public g(k kVar) {
                this.f141238a = kVar;
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.adaptation.b get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return this.f141238a.$this_bindComponents;
            }
        }

        public static final class h extends p<ApiCenter> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k f141239a;

            static {
                Covode.recordClassIndex(92234);
            }

            public h(k kVar) {
                this.f141239a = kVar;
            }

            @Override // com.bytedance.o.p
            public final ApiCenter get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return ApiCenter.a.a(this.f141239a.$this_bindComponents);
            }
        }

        public static final class i extends p<androidx.lifecycle.m> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k f141240a;

            static {
                Covode.recordClassIndex(92235);
            }

            public i(k kVar) {
                this.f141240a = kVar;
            }

            @Override // com.bytedance.o.p
            public final androidx.lifecycle.m get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return this.f141240a.$this_bindComponents;
            }
        }

        public static final class l extends p<com.ss.android.ugc.aweme.sticker.p.d> {
            static {
                Covode.recordClassIndex(92239);
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.sticker.p.d get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return com.ss.android.ugc.aweme.ah.c.f66314a;
            }
        }

        public static final class b extends p<com.ss.android.ugc.aweme.sticker.favorite.b> {
            static {
                Covode.recordClassIndex(92228);
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.sticker.favorite.b get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return new com.ss.android.ugc.aweme.sticker.favorite.c(fVar);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ttep.ab$k$k  reason: collision with other inner class name */
        public static final class C3742k extends p<com.ss.android.ugc.aweme.shortvideo.ui.creationflow.c> {
            static {
                Covode.recordClassIndex(92238);
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.shortvideo.ui.creationflow.c get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return new com.ss.android.ugc.aweme.shortvideo.ui.creationflow.c();
            }
        }

        static final class n extends h.f.b.m implements h.f.a.b<EffectPlatformBuilder, z> {

            /* renamed from: a  reason: collision with root package name */
            public static final n f141243a = new n();

            static {
                Covode.recordClassIndex(92242);
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
                Covode.recordClassIndex(92229);
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.tools.b.a.d get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                Application application = com.ss.android.ugc.aweme.port.in.i.f115645a;
                h.f.b.l.b(application, "");
                com.ss.android.ugc.aweme.effectplatform.f a2 = com.ss.android.ugc.aweme.effectplatform.c.a(application, n.f141243a);
                h.f.b.l.d(a2, "");
                return new a.C3741a(a2);
            }
        }

        public static final class d extends p<StickerPreferences> {
            static {
                Covode.recordClassIndex(92230);
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
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ttep.ab.k.d.get(com.bytedance.o.f):java.lang.Object");
            }
        }

        public static final class e extends p<com.ss.android.ugc.aweme.sticker.panel.guide.j> {
            static {
                Covode.recordClassIndex(92231);
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
            h.f.b.l.b(nVar2.a(TTEPEffectPreviewActivity.class, (String) null, (p) new a(this)), "");
            h.f.b.l.b(nVar2.a(ShortVideoContext.class, (String) null, (p) new f(this)), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.adaptation.b.class, (String) null, (p) new g(this)), "");
            h.f.b.l.b(nVar2.a(ApiCenter.class, (String) null, (p) new h(this)), "");
            h.f.b.l.b(nVar2.a(androidx.lifecycle.m.class, (String) null, (p) new i(this)), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.gamora.recorder.sticker.c.d.class, (String) null, (p) new j(this)), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.shortvideo.ui.creationflow.c.class, (String) null, (p) new C3742k()), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.sticker.p.d.class, (String) null, (p) new l()), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.sticker.m.h.class, (String) null, (p) new m(this)), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.sticker.favorite.b.class, (String) null, (p) new b()), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.tools.b.a.d.class, (String) null, (p) new c()), "");
            h.f.b.l.b(nVar2.a(StickerPreferences.class, (String) null, (p) new d()), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.sticker.panel.guide.j.class, (String) null, (p) new e()), "");
            return z.f158842a;
        }
    }

    public static final class e extends p<com.ss.android.ugc.gamora.recorder.sticker.c.h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141228a;

        static {
            Covode.recordClassIndex(92217);
        }

        static final class a extends h.f.b.m implements h.f.a.a<q> {
            final /* synthetic */ String $panel;

            static {
                Covode.recordClassIndex(92218);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(0);
                this.$panel = str;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ q invoke() {
                String str = this.$panel;
                h.f.b.l.b(str, "");
                return new q(str, true, false);
            }
        }

        public e(com.bytedance.als.dsl.d dVar) {
            this.f141228a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.sticker.c.h get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            com.ss.android.ugc.aweme.port.in.g.a().w();
            h.f.b.l.b("default", "");
            return com.ss.android.ugc.aweme.sticker.l.a("default", fVar, null, new com.ss.android.ugc.aweme.ttep.a.a(), new a("default"), new b(fVar), 4);
        }

        static final class b extends h.f.b.m implements h.f.a.m<q, t, h.f.a.a<? extends com.ss.android.ugc.aweme.sticker.presenter.h>> {
            final /* synthetic */ com.bytedance.o.f $container;

            static {
                Covode.recordClassIndex(92219);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(com.bytedance.o.f fVar) {
                super(2);
                this.$container = fVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final /* synthetic */ h.f.a.a<? extends com.ss.android.ugc.aweme.sticker.presenter.h> invoke(q qVar, t tVar) {
                final q qVar2 = qVar;
                final t tVar2 = tVar;
                h.f.b.l.d(qVar2, "");
                h.f.b.l.d(tVar2, "");
                return new h.f.a.a<com.ss.android.ugc.aweme.sticker.presenter.h>(this) {
                    /* class com.ss.android.ugc.aweme.ttep.ab.e.b.AnonymousClass1 */
                    final /* synthetic */ b this$0;

                    static {
                        Covode.recordClassIndex(92220);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ com.ss.android.ugc.aweme.sticker.presenter.h invoke() {
                        androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) this.this$0.$container.a((Type) androidx.appcompat.app.d.class, (String) null);
                        q qVar = qVar2;
                        t tVar = tVar2;
                        com.ss.android.ugc.tools.b.a.d dVar2 = (com.ss.android.ugc.tools.b.a.d) this.this$0.$container.a((Type) com.ss.android.ugc.tools.b.a.d.class, (String) null);
                        String string = ((Context) this.this$0.$container.a((Type) androidx.appcompat.app.d.class, (String) null)).getString(R.string.p);
                        h.f.b.l.b(string, "");
                        ArrayList arrayList = new ArrayList();
                        for (String str : h.a.n.a(string)) {
                            EffectCategoryModel effectCategoryModel = new EffectCategoryModel(null, 1, null);
                            effectCategoryModel.setName(str);
                            arrayList.add(effectCategoryModel);
                        }
                        return com.ss.android.ugc.aweme.sticker.l.a(dVar, qVar, tVar, dVar2, arrayList);
                    }
                };
            }
        }
    }

    public static final class a extends p<com.ss.android.ugc.gamora.recorder.sticker.a.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141224a;

        static {
            Covode.recordClassIndex(92213);
        }

        public a(com.bytedance.als.dsl.d dVar) {
            this.f141224a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.sticker.a.a get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.recorder.sticker.a.a(fVar);
        }
    }

    public static final class b extends p<com.bytedance.creativex.recorder.filter.b.c<com.bytedance.creativex.recorder.filter.a.a>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141225a;

        static {
            Covode.recordClassIndex(92214);
        }

        public b(com.bytedance.als.dsl.d dVar) {
            this.f141225a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.bytedance.creativex.recorder.filter.b.c<com.bytedance.creativex.recorder.filter.a.a> get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            h.f.b.l.d(fVar, "");
            m mVar = m.f141245a;
            n nVar = n.f141246a;
            return new TTEPFilterLogicComponent(fVar, (androidx.appcompat.app.d) fVar.a(androidx.appcompat.app.d.class, (String) null), new c.a(com.ss.android.ugc.aweme.port.in.g.a().r().d(), l.a.a("TTEPEffectPreviewActivity"), new com.ss.android.ugc.aweme.shortvideo.i.d(com.ss.android.ugc.aweme.shortvideo.i.j.a())), mVar, nVar, l.f141244a);
        }
    }

    public static final class c extends p<com.bytedance.creativex.recorder.filter.d.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141226a;

        static {
            Covode.recordClassIndex(92215);
        }

        public c(com.bytedance.als.dsl.d dVar) {
            this.f141226a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.bytedance.creativex.recorder.filter.d.a get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.bytedance.creativex.recorder.filter.d.a(fVar);
        }
    }

    public static final class d extends p<com.bytedance.creativex.recorder.a.i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141227a;

        static {
            Covode.recordClassIndex(92216);
        }

        public d(com.bytedance.als.dsl.d dVar) {
            this.f141227a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.bytedance.creativex.recorder.a.i get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return com.ss.android.ugc.aweme.shortvideo.beauty.a.a(fVar, true);
        }
    }

    public static final class f extends p<com.ss.android.ugc.aweme.shortvideo.ui.a.h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141229a;

        static {
            Covode.recordClassIndex(92221);
        }

        public f(com.bytedance.als.dsl.d dVar) {
            this.f141229a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.ui.a.h get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.shortvideo.ui.a.h(fVar);
        }
    }

    public static final class g extends p<com.ss.android.ugc.aweme.shortvideo.ui.a.j> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141230a;

        static {
            Covode.recordClassIndex(92222);
        }

        public g(com.bytedance.als.dsl.d dVar) {
            this.f141230a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.ui.a.j get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.shortvideo.ui.a.j(fVar);
        }
    }

    public static final class h extends p<com.ss.android.ugc.aweme.shortvideo.ui.a.e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141231a;

        static {
            Covode.recordClassIndex(92223);
        }

        public h(com.bytedance.als.dsl.d dVar) {
            this.f141231a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.ui.a.e get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.shortvideo.ui.a.e(fVar);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<com.bytedance.creativex.recorder.filter.b.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f141244a = new l();

        static {
            Covode.recordClassIndex(92243);
        }

        l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.creativex.recorder.filter.b.a aVar) {
            com.bytedance.creativex.recorder.filter.b.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.f28239a = false;
            return z.f158842a;
        }
    }

    public static final class i extends p<r> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141232a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TTEPEffectPreviewActivity f141233b;

        static {
            Covode.recordClassIndex(92224);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ r get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new r(fVar, this.f141233b.f141209g.f124757b, this.f141233b.f141209g.q);
        }

        public i(com.bytedance.als.dsl.d dVar, TTEPEffectPreviewActivity tTEPEffectPreviewActivity) {
            this.f141232a = dVar;
            this.f141233b = tTEPEffectPreviewActivity;
        }
    }

    public static final class j extends p<com.ss.android.ugc.aweme.shortvideo.w.n> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f141234a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TTEPEffectPreviewActivity f141235b;

        static {
            Covode.recordClassIndex(92225);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.w.n get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            ShortVideoContext shortVideoContext = this.f141235b.f141209g;
            h.f.b.l.b(shortVideoContext, "");
            return com.ss.android.ugc.aweme.shortvideo.w.i.a(fVar, shortVideoContext);
        }

        public j(com.bytedance.als.dsl.d dVar, TTEPEffectPreviewActivity tTEPEffectPreviewActivity) {
            this.f141234a = dVar;
            this.f141235b = tTEPEffectPreviewActivity;
        }
    }
}
