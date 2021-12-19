package com.bytedance.creativex.recorder.filter.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.a.k;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(16592);
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.e.a$a  reason: collision with other inner class name */
    public static final class C0603a implements k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.asve.recorder.effect.a f28279a;

        static {
            Covode.recordClassIndex(16593);
        }

        C0603a(com.ss.android.ugc.asve.recorder.effect.a aVar) {
            this.f28279a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.filter.repository.a.k
        public final float a(FilterBean filterBean) {
            l.d(filterBean, "");
            float c2 = com.ss.android.ugc.aweme.filter.repository.internal.utils.a.c(filterBean);
            if (c2 != 0.0f) {
                return c2;
            }
            com.ss.android.ugc.asve.recorder.effect.a aVar = this.f28279a;
            String filterFolder = filterBean.getFilterFolder();
            l.b(filterFolder, "");
            return aVar.b(filterFolder);
        }
    }

    public static final k a(com.ss.android.ugc.asve.recorder.effect.a aVar) {
        l.d(aVar, "");
        return new C0603a(aVar);
    }
}
