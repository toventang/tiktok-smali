package com.ss.android.ugc.aweme.video.simplayer.tt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.c.g;
import com.ss.android.ugc.aweme.video.config.a;
import com.ss.android.ugc.aweme.video.simplayer.f;
import com.ss.android.ugc.aweme.video.simplayer.l;
import com.ss.android.ugc.aweme.video.simplayer.r;

public final class d extends r {
    static {
        Covode.recordClassIndex(94177);
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.r
    public final f a() {
        com.ss.android.ugc.aweme.player.sdk.c.d iSimPlayerPlaySessionConfig = a.C3820a.f143369a.a().getISimPlayerPlaySessionConfig(this.f143934a);
        l.a aVar = new l.a();
        aVar.f143894a.f143893a = this.f143936c;
        return new c(new g(iSimPlayerPlaySessionConfig), this.f143935b, aVar.f143894a);
    }
}
