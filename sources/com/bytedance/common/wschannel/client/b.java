package com.bytedance.common.wschannel.client;

import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.client.c;
import com.bytedance.covode.number.Covode;

public abstract class b implements d {

    /* renamed from: a  reason: collision with root package name */
    protected final c.a f27183a;

    static {
        Covode.recordClassIndex(16013);
    }

    public b(c.a aVar) {
        this.f27183a = aVar;
    }

    /* access modifiers changed from: protected */
    public final com.bytedance.common.wschannel.b.c a(int i2, int i3) {
        com.bytedance.common.wschannel.b.c cVar = com.bytedance.common.wschannel.b.c.CONNECTION_UNKNOWN;
        if (i3 == 0) {
            cVar = com.bytedance.common.wschannel.b.c.CONNECTION_UNKNOWN;
        } else if (i3 == 1) {
            cVar = com.bytedance.common.wschannel.b.c.CONNECTING;
        } else if (i3 == 2) {
            cVar = com.bytedance.common.wschannel.b.c.CONNECT_FAILED;
        } else if (i3 == 3) {
            cVar = com.bytedance.common.wschannel.b.c.CONNECT_CLOSED;
        } else if (i3 == 4) {
            cVar = com.bytedance.common.wschannel.b.c.CONNECTED;
        }
        Logger.debug();
        this.f27183a.a(i2, cVar);
        return cVar;
    }
}
