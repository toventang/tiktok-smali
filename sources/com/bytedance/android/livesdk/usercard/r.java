package com.bytedance.android.livesdk.usercard;

import com.bytedance.android.livesdkapi.depend.b.a;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class r implements f {

    /* renamed from: a  reason: collision with root package name */
    private final p f21876a;

    static {
        Covode.recordClassIndex(12879);
    }

    r(p pVar) {
        this.f21876a = pVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        p pVar = this.f21876a;
        a aVar = (a) obj;
        if (!aVar.f22946a.b()) {
            n.a(pVar.x, 8);
        } else if (aVar.f22946a.f23019a == pVar.f21864g.getOwnerUserId()) {
            n.a(pVar.x, 0);
        }
    }
}
