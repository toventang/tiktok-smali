package com.bytedance.android.livesdk.r;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f20561a;

    /* renamed from: b  reason: collision with root package name */
    private final DataChannel f20562b;

    static {
        Covode.recordClassIndex(12141);
    }

    e(a aVar, DataChannel dataChannel) {
        this.f20561a = aVar;
        this.f20562b = dataChannel;
    }

    public final void run() {
        a aVar = this.f20561a;
        aVar.f20549a = new k(aVar, this.f20562b);
    }
}
