package com.ss.android.ugc.aweme.video.simplayer;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.video.config.a;
import com.ss.android.ugc.playerkit.a.d;
import com.ss.android.ugc.playerkit.model.s;

/* access modifiers changed from: package-private */
public final /* synthetic */ class v implements d {

    /* renamed from: a  reason: collision with root package name */
    private final com.ss.android.ugc.playerkit.simapicommon.a.d f143954a;

    static {
        Covode.recordClassIndex(94184);
    }

    v(com.ss.android.ugc.playerkit.simapicommon.a.d dVar) {
        this.f143954a = dVar;
    }

    @Override // com.ss.android.ugc.playerkit.a.d
    public final Object a() {
        s sVar;
        com.ss.android.ugc.playerkit.simapicommon.a.d dVar = this.f143954a;
        if (s.f143939c != null && (sVar = s.f143939c.get(dVar)) != null) {
            return sVar;
        }
        if (a.C3820a.f143369a.a().isPlayerPreferchTtsAudio()) {
            return a.C3820a.f143369a.a().createAudioUrlProcessor().a(dVar);
        }
        return a.C3820a.f143369a.a().createAudioUrlProcessor().b(dVar);
    }
}
