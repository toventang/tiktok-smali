package com.ss.android.ugc.aweme.video.simplayer;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.b.c;
import com.ss.android.ugc.aweme.video.config.a;
import com.ss.android.ugc.playerkit.a.d;

public final /* synthetic */ class y implements d {

    /* renamed from: a  reason: collision with root package name */
    private final String f143959a;

    /* renamed from: b  reason: collision with root package name */
    private final c f143960b;

    static {
        Covode.recordClassIndex(94187);
    }

    public y(String str, c cVar) {
        this.f143959a = str;
        this.f143960b = cVar;
    }

    @Override // com.ss.android.ugc.playerkit.a.d
    public final Object a() {
        return a.C3820a.f143369a.a().getProperResolution(this.f143959a, this.f143960b);
    }
}
