package com.ss.android.ugc.tools.h.b.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.c.g;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import com.ss.android.ugc.tools.b.a.d;
import f.a.ab;
import f.a.ad;
import f.a.af;
import h.f.b.l;

public class f extends e {

    /* renamed from: i  reason: collision with root package name */
    public final String f149309i;

    static {
        Covode.recordClassIndex(98325);
    }

    static final class a<T> implements af<com.bytedance.jedi.a.c.f<? extends ProviderEffectModel>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f149310a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f149311b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f149312c;

        static {
            Covode.recordClassIndex(98326);
        }

        a(f fVar, l lVar, int i2) {
            this.f149310a = fVar;
            this.f149311b = lVar;
            this.f149312c = i2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [f.a.ad<com.bytedance.jedi.a.c.f<com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel>>] */
        @Override // f.a.af
        public final void subscribe(final ad<com.bytedance.jedi.a.c.f<? extends ProviderEffectModel>> adVar) {
            l.d(adVar, "");
            this.f149310a.f149301f.invoke().a(this.f149310a.f149309i, this.f149310a.f149302g, this.f149310a.f149303h, this.f149311b.f149334a, this.f149312c, (IFetchProviderEffect) new IFetchProviderEffect() {
                /* class com.ss.android.ugc.tools.h.b.b.f.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(98327);
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
            }, false);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.tools.h.b.b.e
    public final ab<com.bytedance.jedi.a.c.f<ProviderEffectModel>> a(int i2, l lVar) {
        l.d(lVar, "");
        ab<com.bytedance.jedi.a.c.f<ProviderEffectModel>> a2 = ab.a((af) new a(this, lVar, i2));
        l.b(a2, "");
        return a2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(h.f.a.a<? extends d> aVar, String str, String str2, String str3, l lVar) {
        super(aVar, str, str2, lVar);
        l.d(aVar, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(lVar, "");
        this.f149309i = str3;
    }
}
