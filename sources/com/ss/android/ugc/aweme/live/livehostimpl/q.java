package com.ss.android.ugc.aweme.live.livehostimpl;

import com.bytedance.android.livesdkapi.depend.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import f.a.d.f;

final /* synthetic */ class q implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f108492a;

    static {
        Covode.recordClassIndex(69524);
    }

    q(a aVar) {
        this.f108492a = aVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        a aVar = this.f108492a;
        f.b bVar = (f.b) obj;
        if (bVar == null) {
            return;
        }
        if (Boolean.TRUE.equals(Boolean.valueOf(bVar.f34642b))) {
            aVar.a();
        } else if (Boolean.FALSE.equals(Boolean.valueOf(bVar.f34642b))) {
            aVar.b();
        }
    }
}
