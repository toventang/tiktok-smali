package com.ss.android.ugc.tools.infosticker.a.b.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.tools.h.a.a.c;
import com.ss.android.ugc.tools.h.a.a.d;
import com.ss.android.ugc.tools.h.a.a.e;
import com.ss.android.ugc.tools.h.a.a.f;
import com.ss.android.ugc.tools.infosticker.a.a.d;
import com.ss.android.ugc.tools.infosticker.a.a.h;
import com.ss.android.ugc.tools.infosticker.a.a.q;
import f.a.d.g;
import f.a.t;
import f.a.v;
import f.a.w;
import f.a.x;
import h.f.b.l;
import java.util.concurrent.Callable;

public final class b extends com.ss.android.ugc.tools.h.b.c.a<EffectCategoryResponse, h> implements d {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.tools.infosticker.a.b.a f149385a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.tools.h.a.a.a f149386b;

    static {
        Covode.recordClassIndex(98373);
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.a.b.a.b$b  reason: collision with other inner class name */
    static final class CallableC4035b<V> implements Callable<x<? extends h>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f149389a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Effect f149390b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f149391c;

        static {
            Covode.recordClassIndex(98375);
        }

        CallableC4035b(b bVar, Effect effect, boolean z) {
            this.f149389a = bVar;
            this.f149390b = effect;
            this.f149391c = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ x<? extends h> call() {
            return this.f149389a.f149385a.a(this.f149390b, this.f149391c).d(new g<com.ss.android.ugc.tools.h.a.d<Effect, Effect>, h>(this) {
                /* class com.ss.android.ugc.tools.infosticker.a.b.a.b.CallableC4035b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ CallableC4035b f149392a;

                static {
                    Covode.recordClassIndex(98376);
                }

                {
                    this.f149392a = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // f.a.d.g
                public final /* synthetic */ h apply(com.ss.android.ugc.tools.h.a.d<Effect, Effect> dVar) {
                    q qVar;
                    com.ss.android.ugc.tools.h.a.d<Effect, Effect> dVar2 = dVar;
                    l.d(dVar2, "");
                    KEY key = dVar2.f149208b;
                    int i2 = c.f149393a[dVar2.f149207a.ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        qVar = new q(com.ss.android.ugc.tools.infosticker.a.a.l.INFO_STICKER_STATE_DOWNLOADING);
                    } else if (i2 == 3) {
                        qVar = new q(com.ss.android.ugc.tools.infosticker.a.a.l.INFO_STICKER_STATE_DOWNLOAD_SUCCESS);
                    } else if (i2 != 4) {
                        qVar = new q(com.ss.android.ugc.tools.infosticker.a.a.l.INFO_STICKER_STATE_UNKNOWN);
                    } else {
                        qVar = new q(com.ss.android.ugc.tools.infosticker.a.a.l.INFO_STICKER_STATE_DOWNLOAD_FAILED);
                    }
                    return new h(key, qVar, dVar2.f149211e, dVar2.f149210d);
                }
            });
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.ss.android.ugc.tools.h.a.a.d, com.ss.android.ugc.tools.h.b.c.a
    public final /* synthetic */ EffectCategoryResponse a(Effect effect) {
        l.d(effect, "");
        l.d(effect, "");
        return d.a.a(this, effect);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.ss.android.ugc.tools.h.a.a.d, com.ss.android.ugc.tools.h.b.c.a
    public final /* synthetic */ EffectCategoryResponse a(String str) {
        l.d(str, "");
        return this.f149348c.get(str);
    }

    static final class a<T> implements w<h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f149387a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Effect f149388b;

        static {
            Covode.recordClassIndex(98374);
        }

        a(b bVar, Effect effect) {
            this.f149387a = bVar;
            this.f149388b = effect;
        }

        @Override // f.a.w
        public final void subscribe(v<h> vVar) {
            l.d(vVar, "");
            if (this.f149387a.f149386b.a(this.f149388b)) {
                vVar.a(new h(this.f149388b, new q(com.ss.android.ugc.tools.infosticker.a.a.l.INFO_STICKER_STATE_DOWNLOAD_SUCCESS)));
            }
            vVar.a();
        }
    }

    @Override // com.ss.android.ugc.tools.h.a.a.d
    public final t<h> a(Effect effect, boolean z) {
        l.d(effect, "");
        t<h> d2 = t.a(new a(this, effect)).b(f.a.h.a.b(f.a.k.a.f158006c)).d(t.a(new CallableC4035b(this, effect, z)));
        l.b(d2, "");
        return d2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(c cVar, f<EffectCategoryResponse> fVar, com.ss.android.ugc.tools.h.a.a.b<Effect> bVar, e eVar, com.ss.android.ugc.tools.infosticker.a.b.a aVar, com.ss.android.ugc.tools.h.a.a.a aVar2) {
        super(cVar, fVar, bVar, eVar);
        l.d(cVar, "");
        l.d(fVar, "");
        l.d(bVar, "");
        l.d(eVar, "");
        l.d(aVar, "");
        l.d(aVar2, "");
        this.f149385a = aVar;
        this.f149386b = aVar2;
    }
}
