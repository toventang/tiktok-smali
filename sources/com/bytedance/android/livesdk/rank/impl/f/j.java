package com.bytedance.android.livesdk.rank.impl.f;

import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.rank.api.model.b;
import com.bytedance.android.livesdk.rank.impl.f.c;
import com.bytedance.android.livesdkapi.depend.b.a;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements f {

    /* renamed from: a  reason: collision with root package name */
    private final c.a f20718a;

    static {
        Covode.recordClassIndex(12252);
    }

    j(c.a aVar) {
        this.f20718a = aVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        c.a aVar = this.f20718a;
        a aVar2 = (a) obj;
        aVar.c().f20593a.setFollowStatus(aVar2.f22946a.f23023e);
        if (aVar2.f22946a.b()) {
            aVar.a();
            b c2 = aVar.c();
            l.d(c2, "");
            b.a.a("follow").a().a(l.a(c2)).b();
            return;
        }
        aVar.b();
    }
}
