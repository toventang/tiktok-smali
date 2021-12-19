package com.bytedance.android.live.liveinteract.cohost.a.d;

import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.cohost.a.a.f;
import com.bytedance.android.live.liveinteract.cohost.a.c.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

public final class y implements f.a {

    /* renamed from: a  reason: collision with root package name */
    public f.b f10157a;

    /* renamed from: b  reason: collision with root package name */
    public final DataChannel f10158b;

    static {
        Covode.recordClassIndex(5336);
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.f.a
    public final void a() {
        b.a.a().Q = true;
        a.a(a.b.DISCONNECT);
        f.b bVar = this.f10157a;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.f.a
    public final void b() {
        b.a.a().Q = true;
        a.a(a.b.CHANGE_PAIRING);
        f.b bVar = this.f10157a;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    public y(DataChannel dataChannel) {
        this.f10158b = dataChannel;
    }
}
