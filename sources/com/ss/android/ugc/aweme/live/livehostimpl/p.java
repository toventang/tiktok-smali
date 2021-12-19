package com.ss.android.ugc.aweme.live.livehostimpl;

import com.bytedance.android.livesdkapi.depend.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import f.a.d.f;

final /* synthetic */ class p implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f108491a;

    static {
        Covode.recordClassIndex(69523);
    }

    p(b bVar) {
        this.f108491a = bVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        b bVar = this.f108491a;
        f.b bVar2 = (f.b) obj;
        if (bVar2 != null) {
            bVar.a(bVar2.f34642b);
        }
    }
}
