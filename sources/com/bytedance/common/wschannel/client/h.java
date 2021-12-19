package com.bytedance.common.wschannel.client;

import android.content.Intent;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.client.c;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.model.a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class h extends b {
    static {
        Covode.recordClassIndex(16021);
    }

    public h(c.a aVar) {
        super(aVar);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.common.wschannel.client.d
    public final void a(Intent intent, a aVar) {
        intent.setExtrasClassLoader(WsChannelMsg.class.getClassLoader());
        a(intent, "payload_md5");
        intent.getBooleanExtra("send_result", true);
        Logger.debug();
    }
}
