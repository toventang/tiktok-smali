package com.ss.android.ugc.aweme.setting.serverpush.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.be.h;
import com.ss.android.ugc.aweme.setting.serverpush.ui.g;
import f.a.d.f;

final /* synthetic */ class l implements f {

    /* renamed from: a  reason: collision with root package name */
    private final g f122637a;

    static {
        Covode.recordClassIndex(80466);
    }

    l(g gVar) {
        this.f122637a = gVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        g gVar = this.f122637a;
        g.a aVar = (g.a) ((h) ((n) obj).f79368m).f68603g;
        String str = aVar.f122630a;
        gVar.G.a(str, Integer.valueOf(aVar.f122631b ? 1 : 0));
        if (gVar.I != null) {
            gVar.I.put(aVar.f122630a, aVar.f122631b ? 1 : 0);
        }
    }
}
