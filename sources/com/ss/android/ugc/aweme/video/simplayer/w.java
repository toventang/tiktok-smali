package com.ss.android.ugc.aweme.video.simplayer;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.video.config.a;
import com.ss.android.ugc.playerkit.a.d;
import com.ss.android.ugc.playerkit.model.t;
import com.ss.android.ugc.playerkit.simapicommon.a.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class w implements d {

    /* renamed from: a  reason: collision with root package name */
    private final a f143955a;

    static {
        Covode.recordClassIndex(94185);
    }

    w(a aVar) {
        this.f143955a = aVar;
    }

    @Override // com.ss.android.ugc.playerkit.a.d
    public final Object a() {
        t tVar;
        a aVar = this.f143955a;
        if (s.f143940d != null && (tVar = s.f143940d.get(aVar)) != null) {
            return tVar;
        }
        if (a.C3820a.f143369a.a().isPlayerPreferchCaption()) {
            return a.C3820a.f143369a.a().createSubUrlProcessor().a(aVar);
        }
        return a.C3820a.f143369a.a().createSubUrlProcessor().b(aVar);
    }
}
