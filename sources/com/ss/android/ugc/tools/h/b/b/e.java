package com.ss.android.ugc.tools.h.b.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.c.f;
import com.bytedance.jedi.a.c.g;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate;
import com.ss.android.ugc.tools.b.a.d;
import f.a.ab;
import f.a.ad;
import f.a.af;
import f.a.t;
import h.a.z;
import h.f.b.l;
import h.p;
import h.v;
import java.util.List;

public class e extends a<ProviderEffect, l, ProviderEffectModel> {

    /* renamed from: f  reason: collision with root package name */
    public final h.f.a.a<d> f149301f;

    /* renamed from: g  reason: collision with root package name */
    public final String f149302g;

    /* renamed from: h  reason: collision with root package name */
    public final String f149303h;

    static {
        Covode.recordClassIndex(98321);
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements af<f<? extends ProviderEffectModel>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f149304a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f149305b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f149306c;

        static {
            Covode.recordClassIndex(98322);
        }

        a(e eVar, l lVar, int i2) {
            this.f149304a = eVar;
            this.f149305b = lVar;
            this.f149306c = i2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [f.a.ad<com.bytedance.jedi.a.c.f<com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel>>] */
        @Override // f.a.af
        public final void subscribe(final ad<f<? extends ProviderEffectModel>> adVar) {
            l.d(adVar, "");
            this.f149304a.f149301f.invoke().a(this.f149304a.f149302g, this.f149304a.f149303h, false, this.f149305b.f149334a, this.f149306c, (IFetchProviderEffect) new IFetchProviderEffect() {
                /* class com.ss.android.ugc.tools.h.b.b.e.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(98323);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect
                public final void onFail(ExceptionResult exceptionResult) {
                    adVar.b(com.ss.android.ugc.tools.b.a.a.a.a(exceptionResult));
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.ad */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final /* synthetic */ void onSuccess(ProviderEffectModel providerEffectModel) {
                    adVar.a(g.a(providerEffectModel));
                }
            });
        }
    }

    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t a(Object obj) {
        p pVar = (p) obj;
        l.d(pVar, "");
        int intValue = ((Number) pVar.component1()).intValue();
        l lVar = (l) pVar.component2();
        t<R> d2 = a(intValue, lVar).c(new b(lVar)).d();
        l.b(d2, "");
        return d2;
    }

    static final class b<T, R> implements f.a.d.g<f<? extends ProviderEffectModel>, p<? extends l, ? extends p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f149308a;

        static {
            Covode.recordClassIndex(98324);
        }

        b(l lVar) {
            this.f149308a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ p<? extends l, ? extends p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel>> apply(f<? extends ProviderEffectModel> fVar) {
            f<? extends ProviderEffectModel> fVar2 = fVar;
            l.d(fVar2, "");
            ProviderEffectModelTemplate providerEffectModelTemplate = (ProviderEffectModelTemplate) fVar2.a();
            if (providerEffectModelTemplate == null) {
                return v.a(new l(this.f149308a.f149334a, false), v.a(z.INSTANCE, null));
            }
            List<ProviderEffect> stickerList = providerEffectModelTemplate.getStickerList();
            if (stickerList == null || stickerList.isEmpty()) {
                return v.a(new l(this.f149308a.f149334a, false), v.a(z.INSTANCE, providerEffectModelTemplate));
            }
            return v.a(new l(providerEffectModelTemplate.getCursor(), providerEffectModelTemplate.hasMore()), v.a(providerEffectModelTemplate.getStickerList(), providerEffectModelTemplate));
        }
    }

    /* access modifiers changed from: protected */
    public ab<f<ProviderEffectModel>> a(int i2, l lVar) {
        l.d(lVar, "");
        ab<f<ProviderEffectModel>> a2 = ab.a((af) new a(this, lVar, i2));
        l.b(a2, "");
        return a2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.ss.android.ugc.tools.h.b.b.a
    public final /* synthetic */ boolean b(l lVar, l lVar2) {
        l lVar3 = lVar;
        l lVar4 = lVar2;
        l.d(lVar3, "");
        l.d(lVar4, "");
        if (lVar3.f149334a == lVar4.f149334a) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(h.f.a.a<? extends d> aVar, String str, String str2, l lVar) {
        super(lVar);
        l.d(aVar, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(lVar, "");
        this.f149301f = aVar;
        this.f149302g = str;
        this.f149303h = str2;
    }
}
