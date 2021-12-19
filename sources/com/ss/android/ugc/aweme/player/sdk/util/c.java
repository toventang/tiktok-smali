package com.ss.android.ugc.aweme.player.sdk.util;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.playerkit.exp.b;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public Handler f115447a;

    /* renamed from: b  reason: collision with root package name */
    public e f115448b;

    static {
        Covode.recordClassIndex(74111);
    }

    public final void a(Runnable runnable) {
        e eVar = this.f115448b;
        if (eVar != null) {
            eVar.a(runnable);
        } else {
            this.f115447a.post(runnable);
        }
    }

    public c(Looper looper) {
        if (((Boolean) b.p.getValue()).booleanValue()) {
            this.f115448b = new e(looper);
        } else {
            this.f115447a = new Handler(looper);
        }
    }
}
