package com.ss.android.ugc.aweme.notice.api.e;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;
import com.ss.android.websocket.internal.a;
import h.f.b.l;

public final class v implements a {

    /* renamed from: a  reason: collision with root package name */
    public final WsChannelMsg f112764a;

    static {
        Covode.recordClassIndex(72473);
    }

    @Override // com.ss.android.websocket.internal.a
    public final int getMethod() {
        return this.f112764a.f27298g;
    }

    @Override // com.ss.android.websocket.internal.a
    public final int getService() {
        return this.f112764a.f27297f;
    }

    @Override // com.ss.android.websocket.internal.a
    public final byte[] getPayload() {
        byte[] a2 = this.f112764a.a();
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.websocket.internal.a
    public final String getPayloadEncoding() {
        String str = this.f112764a.f27300i;
        l.b(str, "");
        return str;
    }

    @Override // com.ss.android.websocket.internal.a
    public final String getPayloadType() {
        String str = this.f112764a.f27301j;
        l.b(str, "");
        return str;
    }

    public v(WsChannelMsg wsChannelMsg) {
        l.d(wsChannelMsg, "");
        this.f112764a = wsChannelMsg;
    }
}
