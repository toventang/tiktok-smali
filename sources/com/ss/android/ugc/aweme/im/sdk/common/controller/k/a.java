package com.ss.android.ugc.aweme.im.sdk.common.controller.k;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.j.b;
import com.bytedance.im.core.d.bd;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.j;
import h.f.b.l;
import h.m.d;

public final class a implements com.bytedance.ies.im.core.api.j.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f102341a = new a();

    @Override // com.bytedance.ies.im.core.api.j.a
    public final void a(String str) {
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(65489);
    }

    @Override // com.bytedance.ies.im.core.api.j.a
    public final void a(b bVar) {
        l.d(bVar, "");
        l.d(bVar, "");
    }

    @Override // com.bytedance.ies.im.core.api.j.a
    public final void a(WsChannelMsg wsChannelMsg, bd bdVar) {
        l.d(wsChannelMsg, "");
        if (wsChannelMsg.f27297f != 1015 || wsChannelMsg.f27298g != 1) {
            return;
        }
        if (!c.a()) {
            com.ss.android.ugc.aweme.im.service.m.a.e("IMBizWsBridge", "onReceivedMsg but not login");
            return;
        }
        try {
            byte[] a2 = wsChannelMsg.a();
            l.b(a2, "");
            b bVar = (b) j.a(new String(a2, d.f158808a), b.class);
            if (bVar == null) {
                com.ss.android.ugc.aweme.im.service.m.a.e("IMBizWsBridge", "onReceivedMsg payload null");
                return;
            }
            com.ss.android.ugc.aweme.im.service.m.a.c("IMBizWsBridge", "onReceivedMsg: " + bVar.getAction());
            if (bVar.getAction() != 1) {
                com.ss.android.ugc.aweme.im.service.m.a.e("IMBizWsBridge", "Unknown action: " + bVar.getAction());
            } else {
                com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.b.a(com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.a.WS_DIFF, false);
            }
        } catch (Throwable th) {
            com.ss.android.ugc.aweme.im.service.m.a.a("IMBizWsBridge", th);
        }
    }
}
