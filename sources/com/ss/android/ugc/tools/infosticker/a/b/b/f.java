package com.ss.android.ugc.tools.infosticker.a.b.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.f.d;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.tools.h.a.i;
import com.ss.android.ugc.tools.infosticker.a.a.m;
import com.ss.android.ugc.tools.infosticker.a.a.n;
import com.ss.android.ugc.tools.infosticker.a.b.g;
import f.a.t;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class f extends d<List<? extends ProviderEffect>, List<? extends m>> implements g {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.tools.infosticker.a.b.d f149438a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.tools.infosticker.a.b.f f149439b;

    static {
        Covode.recordClassIndex(98397);
    }

    static final class a<V> implements Callable<List<? extends m>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f149440a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f149441b;

        static {
            Covode.recordClassIndex(98398);
        }

        a(f fVar, List list) {
            this.f149440a = fVar;
            this.f149441b = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ List<? extends m> call() {
            n nVar;
            List<ProviderEffect> list = this.f149441b;
            ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list, 10));
            for (ProviderEffect providerEffect : list) {
                String a2 = this.f149440a.f149439b.a(providerEffect);
                if (i.a(this.f149440a.f149438a, providerEffect)) {
                    nVar = n.PROVIDER_STICKER_STATE_DOWNLOADING;
                } else if (this.f149440a.f149439b.b(providerEffect)) {
                    nVar = n.PROVIDER_STICKER_STATE_DOWNLOAD_SUCCESS;
                } else {
                    nVar = n.PROVIDER_STICKER_STATE_NOT_DOWNLOAD;
                }
                arrayList.add(new m(nVar, a2));
            }
            return arrayList;
        }
    }

    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t a(Object obj) {
        List list = (List) obj;
        l.d(list, "");
        t c2 = t.c(new a(this, list));
        l.b(c2, "");
        return c2;
    }

    public f(com.ss.android.ugc.tools.infosticker.a.b.d dVar, com.ss.android.ugc.tools.infosticker.a.b.f fVar) {
        l.d(dVar, "");
        l.d(fVar, "");
        this.f149438a = dVar;
        this.f149439b = fVar;
    }
}
