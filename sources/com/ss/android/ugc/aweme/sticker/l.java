package com.ss.android.ugc.aweme.sticker;

import android.app.Application;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.sticker.b.f;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.dm;
import com.ss.android.ugc.aweme.sticker.e.e;
import com.ss.android.ugc.aweme.sticker.p.f;
import com.ss.android.ugc.aweme.sticker.panel.j;
import com.ss.android.ugc.aweme.sticker.presenter.h;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.presenter.q;
import com.ss.android.ugc.aweme.sticker.repository.a.t;
import com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.ss.android.ugc.aweme.utils.bj;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import h.f.b.m;
import h.z;
import java.lang.reflect.Type;
import java.util.List;

public final class l {

    public static final class d extends m implements h.f.a.a<Boolean> {

        /* renamed from: a */
        public static final d f134947a = new d();

        static {
            Covode.recordClassIndex(88217);
        }

        d() {
            super(0);
        }

        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return true;
        }
    }

    static {
        Covode.recordClassIndex(88209);
    }

    public static final class a extends m implements h.f.a.a<q> {
        final /* synthetic */ String $panel;

        static {
            Covode.recordClassIndex(88210);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.$panel = str;
        }

        @Override // h.f.a.a
        public final /* synthetic */ q invoke() {
            return new q(this.$panel);
        }
    }

    public static final t a() {
        if (g.a().A().a()) {
            return c.f134724a;
        }
        return o.f134974a;
    }

    public static final class c extends m implements h.f.a.b<f.a, z> {
        final /* synthetic */ h.f.a.b $componentConfigBuilder;
        final /* synthetic */ h.f.a.m $defaultStickerDataManagerFactoryProvider;
        final /* synthetic */ com.bytedance.o.f $diContainer;
        final /* synthetic */ h.f.a.a $stickerManagerConfigureProvider;

        static {
            Covode.recordClassIndex(88213);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(h.f.a.a aVar, com.bytedance.o.f fVar, h.f.a.m mVar, h.f.a.b bVar) {
            super(1);
            this.$stickerManagerConfigureProvider = aVar;
            this.$diContainer = fVar;
            this.$defaultStickerDataManagerFactoryProvider = mVar;
            this.$componentConfigBuilder = bVar;
        }

        @Override // h.f.a.b
        public final /* synthetic */ z invoke(f.a aVar) {
            h.f.a.a<? extends h> aVar2;
            final f.a aVar3 = aVar;
            h.f.b.l.d(aVar3, "");
            q qVar = (q) this.$stickerManagerConfigureProvider.invoke();
            h.f.b.l.d(qVar, "");
            aVar3.f28410f = qVar;
            aVar3.f28408d = bj.f142677a;
            aVar3.f28407c = AnonymousClass1.f134945a;
            aVar3.f28409e = AnonymousClass2.f134946a;
            if (dm.c((ShortVideoContext) this.$diContainer.b(ShortVideoContext.class, null))) {
                aVar2 = new h.f.a.a<h>(this) {
                    /* class com.ss.android.ugc.aweme.sticker.l.c.AnonymousClass3 */
                    final /* synthetic */ c this$0;

                    static {
                        Covode.recordClassIndex(88216);
                    }

                    {
                        this.this$0 = r2;
                    }

                    @Override // h.f.a.a
                    public final /* synthetic */ h invoke() {
                        androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) this.this$0.$diContainer.a((Type) androidx.appcompat.app.d.class, (String) null);
                        q qVar = aVar3.f28410f;
                        t a2 = l.a();
                        com.ss.android.ugc.tools.b.a.d dVar2 = (com.ss.android.ugc.tools.b.a.d) this.this$0.$diContainer.a((Type) com.ss.android.ugc.tools.b.a.d.class, (String) null);
                        List<EffectCategoryModel> a3 = f.a.a(dVar);
                        h.f.b.l.b(a3, "");
                        h.f.b.l.d(dVar, "");
                        h.f.b.l.d(qVar, "");
                        h.f.b.l.d(a2, "");
                        h.f.b.l.d(dVar2, "");
                        h.f.b.l.d(a3, "");
                        w wVar = new w(dVar, qVar, a2, dVar2, a3);
                        wVar.a(new e());
                        wVar.a(new com.ss.android.ugc.aweme.sticker.e.d());
                        return wVar;
                    }
                };
            } else {
                aVar2 = (h.f.a.a) this.$defaultStickerDataManagerFactoryProvider.invoke(aVar3.f28410f, l.a());
            }
            aVar3.f28411g = aVar2;
            aVar3.f28413i = true;
            h.f.a.b bVar = this.$componentConfigBuilder;
            if (bVar != null) {
                bVar.invoke(aVar3);
            }
            return z.f158842a;
        }
    }

    public static final class b extends m implements h.f.a.m<q, t, h.f.a.a<? extends com.ss.android.ugc.aweme.sticker.presenter.c>> {
        final /* synthetic */ com.bytedance.o.f $diContainer;

        static {
            Covode.recordClassIndex(88211);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(com.bytedance.o.f fVar) {
            super(2);
            this.$diContainer = fVar;
        }

        @Override // h.f.a.m
        public final /* synthetic */ h.f.a.a<? extends com.ss.android.ugc.aweme.sticker.presenter.c> invoke(q qVar, t tVar) {
            final q qVar2 = qVar;
            final t tVar2 = tVar;
            h.f.b.l.d(qVar2, "");
            h.f.b.l.d(tVar2, "");
            return new h.f.a.a<com.ss.android.ugc.aweme.sticker.presenter.c>(this) {
                /* class com.ss.android.ugc.aweme.sticker.l.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(88212);
                }

                {
                    this.this$0 = r2;
                }

                @Override // h.f.a.a
                public final /* synthetic */ com.ss.android.ugc.aweme.sticker.presenter.c invoke() {
                    return l.a((androidx.appcompat.app.d) this.this$0.$diContainer.a((Type) androidx.appcompat.app.d.class, (String) null), qVar2, tVar2, (com.ss.android.ugc.tools.b.a.d) this.this$0.$diContainer.a((Type) com.ss.android.ugc.tools.b.a.d.class, (String) null));
                }
            };
        }
    }

    public static /* synthetic */ com.ss.android.ugc.aweme.sticker.presenter.c a(androidx.appcompat.app.d dVar, q qVar, t tVar, com.ss.android.ugc.tools.b.a.d dVar2) {
        List<EffectCategoryModel> a2 = f.a.a(dVar);
        h.f.b.l.b(a2, "");
        return a(dVar, qVar, tVar, dVar2, a2);
    }

    public static final com.ss.android.ugc.aweme.sticker.presenter.c a(androidx.appcompat.app.d dVar, q qVar, t tVar, com.ss.android.ugc.tools.b.a.d dVar2, List<EffectCategoryModel> list) {
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(qVar, "");
        h.f.b.l.d(tVar, "");
        h.f.b.l.d(dVar2, "");
        h.f.b.l.d(list, "");
        com.ss.android.ugc.aweme.sticker.presenter.c cVar = new com.ss.android.ugc.aweme.sticker.presenter.c(dVar, qVar, tVar, dVar2, list);
        cVar.a(new e());
        cVar.a(new com.ss.android.ugc.aweme.sticker.e.d());
        return cVar;
    }

    private static com.ss.android.ugc.gamora.recorder.sticker.c.h a(String str, com.bytedance.o.f fVar, h.f.a.b<? super f.a, z> bVar, com.ss.android.ugc.gamora.recorder.sticker.c.b bVar2, h.f.a.a<q> aVar, h.f.a.m<? super q, ? super t, ? extends h.f.a.a<? extends h>> mVar) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(bVar2, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(mVar, "");
        return new com.ss.android.ugc.gamora.recorder.sticker.c.h(fVar, bVar2, new c(aVar, fVar, mVar, bVar));
    }

    public static final com.ss.android.ugc.aweme.sticker.panel.b.a a(j jVar, o oVar, com.ss.android.ugc.aweme.sticker.d.d dVar, com.ss.android.ugc.tools.b.a.d dVar2, com.ss.android.ugc.aweme.sticker.m.h hVar, com.bytedance.o.f fVar) {
        StickerPreferences stickerPreferences;
        com.ss.android.ugc.aweme.sticker.view.internal.a.a aVar;
        com.ss.android.ugc.aweme.sticker.view.internal.search.a aVar2;
        com.ss.android.ugc.aweme.sticker.p.d dVar3;
        h.f.b.l.d(jVar, "");
        h.f.b.l.d(oVar, "");
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(dVar2, "");
        h.f.b.l.d(hVar, "");
        if (fVar == null || (stickerPreferences = (StickerPreferences) fVar.b(StickerPreferences.class, null)) == null) {
            com.bytedance.cukaie.closet.a aVar3 = new com.bytedance.cukaie.closet.a(new com.bytedance.cukaie.closet.internal.d());
            Application application = i.f115645a;
            h.f.b.l.b(application, "");
            stickerPreferences = (StickerPreferences) aVar3.a(application, StickerPreferences.class);
        }
        com.ss.android.ugc.aweme.sticker.panel.b.a aVar4 = new com.ss.android.ugc.aweme.sticker.panel.b.a(jVar, oVar, dVar, hVar, new com.ss.android.ugc.aweme.sticker.m.c(), new com.ss.android.ugc.aweme.sticker.view.internal.main.m(dVar2));
        bj bjVar = bj.f142677a;
        h.f.b.l.d(bjVar, "");
        aVar4.f135024c = bjVar;
        com.ss.android.ugc.aweme.sticker.panel.a.c cVar = new com.ss.android.ugc.aweme.sticker.panel.a.c(oVar, stickerPreferences, d.f134947a);
        h.f.b.l.d(cVar, "");
        aVar4.f135028g.add(cVar);
        com.ss.android.ugc.aweme.sticker.view.a.i[] iVarArr = new com.ss.android.ugc.aweme.sticker.view.a.i[2];
        iVarArr[0] = new com.ss.android.ugc.aweme.sticker.view.internal.a.b(oVar, hVar);
        if (fVar == null || (dVar3 = (com.ss.android.ugc.aweme.sticker.p.d) fVar.b(com.ss.android.ugc.aweme.sticker.p.d.class, null)) == null) {
            aVar = null;
        } else {
            aVar = new com.ss.android.ugc.aweme.sticker.view.internal.a.a(dVar3);
        }
        iVarArr[1] = aVar;
        com.ss.android.ugc.aweme.sticker.view.a.i a2 = com.ss.android.ugc.aweme.sticker.view.a.j.a(iVarArr);
        h.f.b.l.d(a2, "");
        aVar4.f135022a = a2;
        if (fVar != null) {
            com.ss.android.ugc.aweme.sticker.types.lock.a aVar5 = (com.ss.android.ugc.aweme.sticker.types.lock.a) fVar.b(com.ss.android.ugc.aweme.sticker.types.lock.a.class, null);
            if (aVar5 != null) {
                h.f.b.l.d(aVar5, "");
                aVar4.f135023b = aVar5;
            }
            com.ss.android.ugc.aweme.sticker.view.a.b<com.ss.android.ugc.tools.view.style.j, Fragment> bVar = (com.ss.android.ugc.aweme.sticker.view.a.b) fVar.b(com.ss.android.ugc.aweme.sticker.view.a.b.class, null);
            if (bVar != null) {
                h.f.b.l.d(bVar, "");
                aVar4.f135026e = bVar;
            }
        }
        if (!(!com.ss.android.ugc.aweme.property.bj.a() || fVar == null || (aVar2 = (com.ss.android.ugc.aweme.sticker.view.internal.search.a) fVar.b(com.ss.android.ugc.aweme.sticker.view.internal.search.a.class, null)) == null)) {
            h.f.b.l.d(aVar2, "");
            aVar4.f135027f = aVar2;
        }
        return aVar4;
    }

    public static /* synthetic */ com.ss.android.ugc.gamora.recorder.sticker.c.h a(String str, com.bytedance.o.f fVar, h.f.a.b bVar, com.ss.android.ugc.gamora.recorder.sticker.c.b bVar2, h.f.a.a aVar, h.f.a.m mVar, int i2) {
        if ((i2 & 4) != 0) {
            bVar = null;
        }
        if ((i2 & 8) != 0) {
            bVar2 = new com.ss.android.ugc.gamora.recorder.sticker.c.i();
        }
        if ((i2 & 16) != 0) {
            aVar = new a(str);
        }
        if ((i2 & 32) != 0) {
            mVar = new b(fVar);
        }
        return a(str, fVar, bVar, bVar2, aVar, mVar);
    }
}
