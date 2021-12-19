package com.ss.android.ugc.tools.infosticker.a.b.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import com.ss.android.ugc.tools.h.a.j;
import com.ss.android.ugc.tools.infosticker.a.a.k;
import com.ss.android.ugc.tools.infosticker.a.a.m;
import com.ss.android.ugc.tools.infosticker.a.a.n;
import com.ss.android.ugc.tools.infosticker.a.b.d;
import com.ss.android.ugc.tools.infosticker.a.b.f;
import com.ss.android.ugc.tools.infosticker.a.b.g;
import f.a.t;
import f.a.v;
import f.a.w;
import f.a.x;
import h.f.b.l;
import java.util.concurrent.Callable;

public final class c implements com.ss.android.ugc.tools.infosticker.a.a.b {

    /* renamed from: a  reason: collision with root package name */
    public final d f149417a;

    /* renamed from: b  reason: collision with root package name */
    public final f f149418b;

    /* renamed from: c  reason: collision with root package name */
    private final com.ss.android.ugc.tools.infosticker.a.b.c f149419c;

    /* renamed from: d  reason: collision with root package name */
    private final g f149420d;

    static {
        Covode.recordClassIndex(98390);
    }

    @Override // com.ss.android.ugc.tools.infosticker.a.a.b
    public final j<ProviderEffect, ProviderEffectModel> a() {
        return this.f149419c.a();
    }

    static final class b<V> implements Callable<x<? extends k>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f149423a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ProviderEffect f149424b;

        static {
            Covode.recordClassIndex(98392);
        }

        b(c cVar, ProviderEffect providerEffect) {
            this.f149423a = cVar;
            this.f149424b = providerEffect;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ x<? extends k> call() {
            return this.f149423a.f149417a.a(this.f149424b, true).d(new f.a.d.g<com.ss.android.ugc.tools.h.a.d<ProviderEffect, String>, k>(this) {
                /* class com.ss.android.ugc.tools.infosticker.a.b.b.c.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f149425a;

                static {
                    Covode.recordClassIndex(98393);
                }

                {
                    this.f149425a = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // f.a.d.g
                public final /* synthetic */ k apply(com.ss.android.ugc.tools.h.a.d<ProviderEffect, String> dVar) {
                    m mVar;
                    com.ss.android.ugc.tools.h.a.d<ProviderEffect, String> dVar2 = dVar;
                    l.d(dVar2, "");
                    KEY key = dVar2.f149208b;
                    c cVar = this.f149425a.f149423a;
                    int i2 = d.f149426a[dVar2.f149207a.ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        mVar = new m(n.PROVIDER_STICKER_STATE_DOWNLOADING, "");
                    } else if (i2 == 3) {
                        RESULT result = dVar2.f149209c;
                        if (result == null) {
                            result = cVar.f149418b.a(dVar2.f149208b);
                        }
                        mVar = new m(n.PROVIDER_STICKER_STATE_DOWNLOAD_SUCCESS, result);
                    } else if (i2 != 4) {
                        mVar = new m(n.PROVIDER_STICKER_STATE_UNKNOWN, "");
                    } else {
                        mVar = new m(n.PROVIDER_STICKER_STATE_DOWNLOAD_FAILED, "");
                    }
                    return new k(key, mVar, dVar2.f149211e, dVar2.f149210d);
                }
            });
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.a.a.b
    public final j<ProviderEffect, ProviderEffectModel> a(String str) {
        l.d(str, "");
        return this.f149419c.a(str);
    }

    static final class a<T> implements w<k> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f149421a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ProviderEffect f149422b;

        static {
            Covode.recordClassIndex(98391);
        }

        a(c cVar, ProviderEffect providerEffect) {
            this.f149421a = cVar;
            this.f149422b = providerEffect;
        }

        @Override // f.a.w
        public final void subscribe(v<k> vVar) {
            l.d(vVar, "");
            if (this.f149421a.f149418b.b(this.f149422b)) {
                vVar.a(new k(this.f149422b, new m(n.PROVIDER_STICKER_STATE_DOWNLOAD_SUCCESS, this.f149421a.f149418b.a(this.f149422b))));
            }
            vVar.a();
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.a.a.b
    public final t<k> a(ProviderEffect providerEffect) {
        l.d(providerEffect, "");
        t<k> d2 = t.a(new a(this, providerEffect)).b(f.a.h.a.b(f.a.k.a.f158006c)).d(t.a(new b(this, providerEffect)));
        l.b(d2, "");
        return d2;
    }

    public c(com.ss.android.ugc.tools.infosticker.a.b.c cVar, g gVar, d dVar, f fVar) {
        l.d(cVar, "");
        l.d(gVar, "");
        l.d(dVar, "");
        l.d(fVar, "");
        this.f149419c = cVar;
        this.f149420d = gVar;
        this.f149417a = dVar;
        this.f149418b = fVar;
    }
}
