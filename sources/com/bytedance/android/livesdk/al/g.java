package com.bytedance.android.livesdk.al;

import android.os.SystemClock;
import com.bytedance.android.livesdk.j.bu;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import f.a.d.f;

final /* synthetic */ class g implements f {

    /* renamed from: a  reason: collision with root package name */
    static final f f13950a = new g();

    static {
        Covode.recordClassIndex(7737);
    }

    private g() {
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        DataChannelGlobal.f34575d.a(bu.class, Long.valueOf(SystemClock.elapsedRealtime()));
    }
}
