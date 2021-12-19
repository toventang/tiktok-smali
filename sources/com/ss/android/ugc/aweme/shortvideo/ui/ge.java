package com.ss.android.ugc.aweme.shortvideo.ui;

import android.app.Application;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.als.ApiCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.b.c;
import com.bytedance.creativex.recorder.sticker.b.f;
import com.ss.android.ugc.aweme.filter.repository.internal.main.l;
import com.ss.android.ugc.aweme.filter.repository.internal.main.r;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.ui.a.ad;
import com.ss.android.ugc.aweme.shortvideo.ui.a.r;
import com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.ss.android.ugc.gamora.recorder.sticker.c.a.c;
import h.z;
import java.lang.reflect.Type;
import org.json.JSONObject;

public final class ge {

    /* access modifiers changed from: package-private */
    public static final class p extends h.f.b.m implements h.f.a.b<com.bytedance.creativex.recorder.filter.a.b, com.bytedance.creativex.recorder.filter.a.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f131811a = new p();

        static {
            Covode.recordClassIndex(86357);
        }

        p() {
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

    /* access modifiers changed from: package-private */
    public static final class q extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f131812a = new q();

        static {
            Covode.recordClassIndex(86358);
        }

        q() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return true;
        }
    }

    static {
        Covode.recordClassIndex(86324);
    }

    static final class m extends h.f.b.m implements h.f.a.b<com.bytedance.o.n, z> {
        final /* synthetic */ VideoRecordNewActivity $this_bindComponents;

        static {
            Covode.recordClassIndex(86337);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(VideoRecordNewActivity videoRecordNewActivity) {
            super(1);
            this.$this_bindComponents = videoRecordNewActivity;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$m$m  reason: collision with other inner class name */
        public static final class C3423m extends com.bytedance.o.p<com.ss.android.ugc.aweme.sticker.m.h> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ m f131806a;

            static {
                Covode.recordClassIndex(86351);
            }

            /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$m$m$a */
            static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.recorder.sticker.c.j> {
                final /* synthetic */ com.bytedance.o.f $it;

                static {
                    Covode.recordClassIndex(86352);
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

            public C3423m(m mVar) {
                this.f131806a = mVar;
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.sticker.m.h get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                ShortVideoContext shortVideoContext = this.f131806a.$this_bindComponents.f131228g;
                h.f.b.l.b(shortVideoContext, "");
                return new com.ss.android.ugc.aweme.sticker.m.b(shortVideoContext, new a(fVar));
            }
        }

        public static final class j extends com.bytedance.o.p<com.ss.android.ugc.gamora.recorder.sticker.c.d> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ m f131805a;

            static {
                Covode.recordClassIndex(86347);
            }

            static final class a extends h.f.b.m implements h.f.a.a<c.a> {
                final /* synthetic */ j this$0;

                static {
                    Covode.recordClassIndex(86348);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                a(j jVar) {
                    super(0);
                    this.this$0 = jVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ c.a invoke() {
                    return new c.a(this.this$0.f131805a.$this_bindComponents.r, this.this$0.f131805a.$this_bindComponents.s, this.this$0.f131805a.$this_bindComponents.o, this.this$0.f131805a.$this_bindComponents.n, !this.this$0.f131805a.$this_bindComponents.y);
                }
            }

            public j(m mVar) {
                this.f131805a = mVar;
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.gamora.recorder.sticker.c.d get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                com.ss.android.ugc.aweme.shortvideo.l.a aVar = this.f131805a.$this_bindComponents.t;
                h.f.b.l.b(aVar, "");
                return new com.ss.android.ugc.gamora.recorder.sticker.c.a.d(fVar, aVar, new a(this));
            }
        }

        public static final class a extends com.bytedance.o.p<VideoRecordNewActivity> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ m f131800a;

            static {
                Covode.recordClassIndex(86338);
            }

            public a(m mVar) {
                this.f131800a = mVar;
            }

            @Override // com.bytedance.o.p
            public final VideoRecordNewActivity get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return this.f131800a.$this_bindComponents;
            }
        }

        public static final class f extends com.bytedance.o.p<ShortVideoContext> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ m f131801a;

            static {
                Covode.recordClassIndex(86343);
            }

            public f(m mVar) {
                this.f131801a = mVar;
            }

            @Override // com.bytedance.o.p
            public final ShortVideoContext get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return this.f131801a.$this_bindComponents.f131228g;
            }
        }

        public static final class g extends com.bytedance.o.p<com.ss.android.ugc.aweme.adaptation.b> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ m f131802a;

            static {
                Covode.recordClassIndex(86344);
            }

            public g(m mVar) {
                this.f131802a = mVar;
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.adaptation.b get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return this.f131802a.$this_bindComponents;
            }
        }

        public static final class h extends com.bytedance.o.p<ApiCenter> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ m f131803a;

            static {
                Covode.recordClassIndex(86345);
            }

            public h(m mVar) {
                this.f131803a = mVar;
            }

            @Override // com.bytedance.o.p
            public final ApiCenter get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return ApiCenter.a.a(this.f131803a.$this_bindComponents);
            }
        }

        public static final class i extends com.bytedance.o.p<androidx.lifecycle.m> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ m f131804a;

            static {
                Covode.recordClassIndex(86346);
            }

            public i(m mVar) {
                this.f131804a = mVar;
            }

            @Override // com.bytedance.o.p
            public final androidx.lifecycle.m get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return this.f131804a.$this_bindComponents;
            }
        }

        public static final class l extends com.bytedance.o.p<com.ss.android.ugc.aweme.sticker.p.d> {
            static {
                Covode.recordClassIndex(86350);
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.sticker.p.d get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return com.ss.android.ugc.aweme.ah.c.f66314a;
            }
        }

        public static final class b extends com.bytedance.o.p<com.ss.android.ugc.aweme.sticker.favorite.b> {
            static {
                Covode.recordClassIndex(86339);
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.sticker.favorite.b get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return new com.ss.android.ugc.aweme.sticker.favorite.c(fVar);
            }
        }

        public static final class k extends com.bytedance.o.p<com.ss.android.ugc.aweme.shortvideo.ui.creationflow.c> {
            static {
                Covode.recordClassIndex(86349);
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.shortvideo.ui.creationflow.c get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return new com.ss.android.ugc.aweme.shortvideo.ui.creationflow.c();
            }
        }

        static final class n extends h.f.b.m implements h.f.a.b<EffectPlatformBuilder, z> {

            /* renamed from: a  reason: collision with root package name */
            public static final n f131807a = new n();

            static {
                Covode.recordClassIndex(86353);
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

        public static final class c extends com.bytedance.o.p<com.ss.android.ugc.tools.b.a.d> {
            static {
                Covode.recordClassIndex(86340);
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.tools.b.a.d get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                Application application = com.ss.android.ugc.aweme.port.in.i.f115645a;
                h.f.b.l.b(application, "");
                return com.ss.android.ugc.aweme.effectplatform.c.a(application, n.f131807a);
            }
        }

        public static final class d extends com.bytedance.o.p<StickerPreferences> {
            static {
                Covode.recordClassIndex(86341);
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
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.ge.m.d.get(com.bytedance.o.f):java.lang.Object");
            }
        }

        public static final class e extends com.bytedance.o.p<com.ss.android.ugc.aweme.sticker.panel.guide.j> {
            static {
                Covode.recordClassIndex(86342);
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
            h.f.b.l.b(nVar2.a(VideoRecordNewActivity.class, (String) null, (com.bytedance.o.p) new a(this)), "");
            h.f.b.l.b(nVar2.a(ShortVideoContext.class, (String) null, (com.bytedance.o.p) new f(this)), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.adaptation.b.class, (String) null, (com.bytedance.o.p) new g(this)), "");
            h.f.b.l.b(nVar2.a(ApiCenter.class, (String) null, (com.bytedance.o.p) new h(this)), "");
            h.f.b.l.b(nVar2.a(androidx.lifecycle.m.class, (String) null, (com.bytedance.o.p) new i(this)), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.gamora.recorder.sticker.c.d.class, (String) null, (com.bytedance.o.p) new j(this)), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.shortvideo.ui.creationflow.c.class, (String) null, (com.bytedance.o.p) new k()), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.sticker.p.d.class, (String) null, (com.bytedance.o.p) new l()), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.sticker.m.h.class, (String) null, (com.bytedance.o.p) new C3423m(this)), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.sticker.favorite.b.class, (String) null, (com.bytedance.o.p) new b()), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.tools.b.a.d.class, (String) null, (com.bytedance.o.p) new c()), "");
            h.f.b.l.b(nVar2.a(StickerPreferences.class, (String) null, (com.bytedance.o.p) new d()), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.sticker.panel.guide.j.class, (String) null, (com.bytedance.o.p) new e()), "");
            return z.f158842a;
        }
    }

    public static final class a extends com.bytedance.o.p<com.ss.android.ugc.gamora.recorder.sticker.a.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f131786a;

        static {
            Covode.recordClassIndex(86325);
        }

        public a(com.bytedance.als.dsl.d dVar) {
            this.f131786a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.sticker.a.a get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.recorder.sticker.a.a(fVar);
        }
    }

    public static final class b extends com.bytedance.o.p<com.ss.android.ugc.aweme.shortvideo.ui.a.g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f131787a;

        static {
            Covode.recordClassIndex(86326);
        }

        public b(com.bytedance.als.dsl.d dVar) {
            this.f131787a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.ui.a.g get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.shortvideo.ui.a.g(fVar);
        }
    }

    public static final class c extends com.bytedance.o.p<ad> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f131788a;

        static {
            Covode.recordClassIndex(86327);
        }

        public c(com.bytedance.als.dsl.d dVar) {
            this.f131788a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ ad get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return ge.a(fVar);
        }
    }

    public static final class d extends com.bytedance.o.p<com.bytedance.creativex.recorder.filter.d.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f131789a;

        static {
            Covode.recordClassIndex(86328);
        }

        public d(com.bytedance.als.dsl.d dVar) {
            this.f131789a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.bytedance.creativex.recorder.filter.d.a get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.bytedance.creativex.recorder.filter.d.a(fVar);
        }
    }

    public static final class e extends com.bytedance.o.p<com.bytedance.creativex.recorder.a.i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f131790a;

        static {
            Covode.recordClassIndex(86329);
        }

        public e(com.bytedance.als.dsl.d dVar) {
            this.f131790a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.bytedance.creativex.recorder.a.i get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return com.ss.android.ugc.aweme.shortvideo.beauty.a.a(fVar, true);
        }
    }

    public static final class f extends com.bytedance.o.p<com.ss.android.ugc.gamora.recorder.sticker.c.h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f131791a;

        static {
            Covode.recordClassIndex(86330);
        }

        public f(com.bytedance.als.dsl.d dVar) {
            this.f131791a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.sticker.c.h get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            com.ss.android.ugc.aweme.port.in.g.a().w();
            h.f.b.l.b("default", "");
            return com.ss.android.ugc.aweme.sticker.l.a("default", fVar, n.f131808a, null, null, null, 56);
        }
    }

    public static final class g extends com.bytedance.o.p<com.ss.android.ugc.aweme.shortvideo.ui.a.h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f131792a;

        static {
            Covode.recordClassIndex(86331);
        }

        public g(com.bytedance.als.dsl.d dVar) {
            this.f131792a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.ui.a.h get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.shortvideo.ui.a.h(fVar);
        }
    }

    public static final class h extends com.bytedance.o.p<com.ss.android.ugc.aweme.shortvideo.ui.a.j> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f131793a;

        static {
            Covode.recordClassIndex(86332);
        }

        public h(com.bytedance.als.dsl.d dVar) {
            this.f131793a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.ui.a.j get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.shortvideo.ui.a.j(fVar);
        }
    }

    public static final class i extends com.bytedance.o.p<com.ss.android.ugc.aweme.shortvideo.ui.a.e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f131794a;

        static {
            Covode.recordClassIndex(86333);
        }

        public i(com.bytedance.als.dsl.d dVar) {
            this.f131794a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.ui.a.e get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.shortvideo.ui.a.e(fVar);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<com.bytedance.als.dsl.e, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f131799a = new l();

        static {
            Covode.recordClassIndex(86336);
        }

        l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.als.dsl.e eVar) {
            com.bytedance.als.dsl.e eVar2 = eVar;
            h.f.b.l.d(eVar2, "");
            eVar2.f6462a = com.ss.android.ugc.aweme.setting.i.f.a();
            return z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<f.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f131808a = new n();

        static {
            Covode.recordClassIndex(86354);
        }

        n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(f.a aVar) {
            f.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.f28406b = AnonymousClass1.f131809a;
            return z.f158842a;
        }
    }

    public static final class j extends com.bytedance.o.p<r> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f131795a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoRecordNewActivity f131796b;

        static {
            Covode.recordClassIndex(86334);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ r get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new r(fVar, this.f131796b.f131228g.f124757b, this.f131796b.f131228g.q);
        }

        public j(com.bytedance.als.dsl.d dVar, VideoRecordNewActivity videoRecordNewActivity) {
            this.f131795a = dVar;
            this.f131796b = videoRecordNewActivity;
        }
    }

    public static final class k extends com.bytedance.o.p<com.ss.android.ugc.aweme.shortvideo.w.n> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f131797a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoRecordNewActivity f131798b;

        static {
            Covode.recordClassIndex(86335);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.w.n get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            ShortVideoContext shortVideoContext = this.f131798b.f131228g;
            h.f.b.l.b(shortVideoContext, "");
            return com.ss.android.ugc.aweme.shortvideo.w.i.a(fVar, shortVideoContext);
        }

        public k(com.bytedance.als.dsl.d dVar, VideoRecordNewActivity videoRecordNewActivity) {
            this.f131797a = dVar;
            this.f131798b = videoRecordNewActivity;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o extends h.f.b.m implements h.f.a.b<com.bytedance.creativex.recorder.filter.b.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f131810a = new o();

        static {
            Covode.recordClassIndex(86356);
        }

        o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.creativex.recorder.filter.b.a aVar) {
            com.bytedance.creativex.recorder.filter.b.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            boolean z = true;
            if (!com.bytedance.ies.abmock.b.a().a(true, "disable_use_last_used_filter", false) || com.ss.android.ugc.aweme.port.in.g.a().A().a()) {
                z = false;
            }
            aVar2.f28239a = z;
            return z.f158842a;
        }
    }

    public static final ad a(com.bytedance.o.f fVar) {
        com.ss.android.ugc.aweme.filter.repository.a.n a2;
        com.bytedance.creativex.recorder.filter.a.j eVar;
        h.f.b.l.d(fVar, "");
        p pVar = p.f131811a;
        q qVar = q.f131812a;
        if (!com.ss.android.ugc.aweme.filter.b.b.a()) {
            a2 = l.a.a("VideoRecordNewActivity");
        } else {
            a2 = r.a.a("VideoRecordNewActivity");
        }
        if (!com.ss.android.ugc.aweme.filter.b.b.a()) {
            eVar = new com.ss.android.ugc.aweme.shortvideo.i.d(com.ss.android.ugc.aweme.shortvideo.i.j.a());
        } else {
            eVar = new com.ss.android.ugc.aweme.shortvideo.i.e(com.ss.android.ugc.aweme.shortvideo.i.j.b());
        }
        return new ad(fVar, (androidx.appcompat.app.d) fVar.a(androidx.appcompat.app.d.class, (String) null), new c.a(com.ss.android.ugc.aweme.port.in.g.a().r().d(), a2, eVar), pVar, qVar, o.f131810a);
    }

    public static final JSONObject a(androidx.fragment.app.e eVar) {
        h.f.b.l.d(eVar, "");
        ac a2 = ae.a(eVar, (ad.b) null).a(ShortVideoContextViewModel.class);
        h.f.b.l.b(a2, "");
        ShortVideoContextViewModel shortVideoContextViewModel = (ShortVideoContextViewModel) a2;
        ShortVideoContext shortVideoContext = shortVideoContextViewModel.f124769a;
        if (shortVideoContext == null) {
            JSONObject a3 = new ar().a();
            h.f.b.l.b(a3, "");
            return a3;
        }
        String str = "1";
        ar a4 = new ar().a("creation_id", shortVideoContext.q).a("shoot_way", shortVideoContext.r).a("route", str);
        if (!shortVideoContextViewModel.a()) {
            str = "0";
        }
        ar a5 = a4.a("is_photo", str).a("position", "shoot_page");
        h.f.b.l.b(a5, "");
        JSONObject a6 = a5.a();
        h.f.b.l.b(a6, "");
        return a6;
    }
}
