package com.ss.android.ugc.aweme.live.livehostimpl;

import com.bytedance.android.livesdkapi.depend.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import f.a.d.f;

final /* synthetic */ class j implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f108485a;

    static {
        Covode.recordClassIndex(69517);
    }

    j(b bVar) {
        this.f108485a = bVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        b bVar = this.f108485a;
        f.a aVar = (f.a) obj;
        if (aVar != null) {
            bVar.onActivityCreated(aVar.f34639a, aVar.f34640b);
        }
    }
}
