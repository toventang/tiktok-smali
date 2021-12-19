package com.bytedance.ies.powerpreload.b;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.c.a;
import com.bytedance.ies.powerpreload.d;
import com.bytedance.ies.powerpreload.task.c;
import com.bytedance.ies.powerpreload.task.f;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import h.f.b.l;

public final class j implements c {

    /* renamed from: a  reason: collision with root package name */
    public IRetrofitFactory f34502a;

    /* renamed from: b  reason: collision with root package name */
    public c f34503b;

    static {
        Covode.recordClassIndex(20636);
    }

    @Override // com.bytedance.ies.powerpreload.task.c
    public final f<d> a(d dVar, d dVar2, Bundle bundle) {
        f<d> a2;
        l.c(dVar, "");
        l.c(dVar2, "");
        c cVar = this.f34503b;
        if (cVar != null && (a2 = cVar.a(dVar, dVar2, bundle)) != null) {
            return a2;
        }
        if (dVar instanceof c) {
            if (this.f34502a == null) {
                return new f.b(dVar, dVar2, bundle);
            }
            c cVar2 = (c) dVar;
            IRetrofitFactory iRetrofitFactory = this.f34502a;
            if (iRetrofitFactory == null) {
                l.a();
            }
            return new a(cVar2, dVar2, bundle, iRetrofitFactory);
        } else if (dVar instanceof b) {
            return new com.bytedance.ies.powerpreload.task.a((b) dVar, dVar2, bundle);
        } else {
            return new f.b((b) dVar, dVar2, bundle);
        }
    }
}
