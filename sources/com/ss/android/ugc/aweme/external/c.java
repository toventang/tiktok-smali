package com.ss.android.ugc.aweme.external;

import android.content.Context;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.external.IAVScreenAdaptService;
import com.ss.android.ugc.aweme.shortvideo.dh;
import h.f.b.l;
import h.z;
import java.util.concurrent.Callable;

public final class c implements IAVScreenAdaptService {
    static {
        Covode.recordClassIndex(56724);
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f90374a;

        static {
            Covode.recordClassIndex(56725);
        }

        a(Context context) {
            this.f90374a = context;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            int d2 = dh.d(this.f90374a);
            if (d2 != com.ss.android.ugc.aweme.adaptation.a.f66177a.b()) {
                com.ss.android.ugc.aweme.adaptation.a.f66177a.a(d2);
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVScreenAdaptService
    public final void calculateAdaptPlan(Context context) {
        l.d(context, "");
        i.b(new a(context), i.f4824a);
    }
}
