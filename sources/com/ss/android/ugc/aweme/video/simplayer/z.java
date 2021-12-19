package com.ss.android.ugc.aweme.video.simplayer;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.video.config.a;
import com.ss.android.ugc.playerkit.a.d;
import com.ss.android.ugc.playerkit.simapicommon.a.i;

/* access modifiers changed from: package-private */
public final /* synthetic */ class z implements d {

    /* renamed from: a  reason: collision with root package name */
    private final i f143961a;

    static {
        Covode.recordClassIndex(94188);
    }

    z(i iVar) {
        this.f143961a = iVar;
    }

    @Override // com.ss.android.ugc.playerkit.a.d
    public final Object a() {
        return Boolean.valueOf(a.C3820a.f143369a.a().isCache(this.f143961a));
    }
}
