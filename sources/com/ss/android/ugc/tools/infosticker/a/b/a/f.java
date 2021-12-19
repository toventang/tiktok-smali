package com.ss.android.ugc.tools.infosticker.a.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.f.d;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.h.a.a.e;
import com.ss.android.ugc.tools.h.a.c;
import com.ss.android.ugc.tools.h.a.i;
import f.a.t;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class f extends d<List<? extends Effect>, List<? extends c>> implements e {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.tools.h.a.a.a f149404a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.tools.infosticker.a.b.a f149405b;

    static {
        Covode.recordClassIndex(98382);
    }

    static final class a<V> implements Callable<List<? extends c>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f149406a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f149407b;

        static {
            Covode.recordClassIndex(98383);
        }

        a(f fVar, List list) {
            this.f149406a = fVar;
            this.f149407b = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ List<? extends c> call() {
            c cVar;
            List<Effect> list = this.f149407b;
            ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
            for (Effect effect : list) {
                if (i.a(this.f149406a.f149405b, effect)) {
                    cVar = c.DOWNLOADING;
                } else if (this.f149406a.f149404a.a(effect)) {
                    cVar = c.DOWNLOAD_SUCCESS;
                } else {
                    cVar = c.NOT_DOWNLOAD;
                }
                arrayList.add(cVar);
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

    public f(com.ss.android.ugc.tools.h.a.a.a aVar, com.ss.android.ugc.tools.infosticker.a.b.a aVar2) {
        l.d(aVar, "");
        l.d(aVar2, "");
        this.f149404a = aVar;
        this.f149405b = aVar2;
    }
}
