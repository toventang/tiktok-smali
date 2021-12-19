package com.bytedance.common.wschannel.client;

import android.content.Context;
import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.client.j;
import com.bytedance.common.wschannel.model.IntegerParcelable;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.server.f;
import com.bytedance.covode.number.Covode;

public final class l implements j {
    static {
        Covode.recordClassIndex(16030);
    }

    @Override // com.bytedance.common.wschannel.client.j
    public final void a(Context context, boolean z) {
    }

    @Override // com.bytedance.common.wschannel.client.j
    public final void a(Context context) {
        b(context, 1);
    }

    @Override // com.bytedance.common.wschannel.client.j
    public final void b(Context context) {
        b(context, 2);
    }

    private static void a(Context context, j.a aVar) {
        Message obtain = Message.obtain();
        obtain.what = aVar.f27188c;
        obtain.getData().putParcelable(aVar.f27186a, aVar.f27187b);
        f.a(context).handleMsg(obtain);
    }

    @Override // com.bytedance.common.wschannel.client.j
    public final void b(Context context, SsWsApp ssWsApp) {
        if (com.bytedance.common.wschannel.l.a(context).a()) {
            j.a aVar = new j.a();
            aVar.f27186a = "ws_app";
            aVar.f27187b = ssWsApp;
            aVar.f27188c = 4;
            a(context, aVar);
        }
    }

    private static void b(Context context, int i2) {
        if (context != null && i2 > 0 && i2 <= 3) {
            Logger.debug();
            if (com.bytedance.common.wschannel.l.a(context).a()) {
                Message message = new Message();
                message.what = 2;
                message.arg1 = i2;
                f.a(context).handleMsg(message);
            }
        }
    }

    @Override // com.bytedance.common.wschannel.client.j
    public final void a(Context context, int i2) {
        j.a aVar = new j.a();
        aVar.f27186a = "ws_app";
        aVar.f27187b = new IntegerParcelable(i2);
        aVar.f27188c = 1;
        a(context, aVar);
    }

    @Override // com.bytedance.common.wschannel.client.j
    public final void a(Context context, SsWsApp ssWsApp) {
        j.a aVar = new j.a();
        aVar.f27186a = "ws_app";
        aVar.f27187b = ssWsApp;
        aVar.f27188c = 0;
        a(context, aVar);
    }

    @Override // com.bytedance.common.wschannel.client.j
    public final void a(Context context, WsChannelMsg wsChannelMsg) {
        j.a aVar = new j.a();
        aVar.f27186a = "payload";
        aVar.f27187b = wsChannelMsg;
        aVar.f27188c = 5;
        a(context, aVar);
    }
}
