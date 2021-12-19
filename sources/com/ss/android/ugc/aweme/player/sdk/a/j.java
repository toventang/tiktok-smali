package com.ss.android.ugc.aweme.player.sdk.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.playerkit.model.p;

final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final i f115262a;

    /* renamed from: b  reason: collision with root package name */
    private final p f115263b;

    static {
        Covode.recordClassIndex(74030);
    }

    j(i iVar, p pVar) {
        this.f115262a = iVar;
        this.f115263b = pVar;
    }

    public final void run() {
        i iVar = this.f115262a;
        p pVar = this.f115263b;
        if (iVar.v != null) {
            iVar.v.onPreparePlay(pVar.f148803j);
        }
    }
}
