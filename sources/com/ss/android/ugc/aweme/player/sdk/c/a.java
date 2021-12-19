package com.ss.android.ugc.aweme.player.sdk.c;

import android.os.HandlerThread;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.api.i;
import com.ss.android.ugc.aweme.player.sdk.c.c;
import com.ss.android.ugc.playerkit.model.m;

public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f115361a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f115362b;

    static {
        Covode.recordClassIndex(74086);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.c.c
    public final boolean b() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.c.c
    public final void a() {
        super.a();
        this.f115362b = true;
    }

    public a(m.e eVar, HandlerThread handlerThread, c.b bVar, i iVar, boolean z) {
        super(eVar, handlerThread, null, bVar, iVar, null, z);
    }
}
