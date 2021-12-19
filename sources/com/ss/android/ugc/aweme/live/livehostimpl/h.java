package com.ss.android.ugc.aweme.live.livehostimpl;

import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bg;
import com.ss.android.ugc.aweme.ttlive.a;

final /* synthetic */ class h implements bg {

    /* renamed from: a  reason: collision with root package name */
    private final IHostAction.a f108471a;

    /* renamed from: b  reason: collision with root package name */
    private final a f108472b;

    static {
        Covode.recordClassIndex(69511);
    }

    h(IHostAction.a aVar, a aVar2) {
        this.f108471a = aVar;
        this.f108472b = aVar2;
    }

    @Override // com.ss.android.ugc.aweme.bg
    public final void a(String str, boolean z) {
        IHostAction.a aVar = this.f108471a;
        a aVar2 = this.f108472b;
        if (z) {
            aVar.a(str, aVar2.f141458d);
        } else {
            aVar.a("");
        }
    }
}
