package com.ss.android.ugc.aweme.im.sdk.share.b.b;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.m.a;
import com.ss.android.ugc.aweme.im.service.model.m;

final /* synthetic */ class c implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    static final Handler.Callback f103364a = new c();

    static {
        Covode.recordClassIndex(66245);
    }

    private c() {
    }

    public final boolean handleMessage(Message message) {
        if (message == null || message.what != 100 || !(message.obj instanceof e)) {
            return false;
        }
        e eVar = (e) message.obj;
        if (eVar.f103365a != m.SENDING) {
            return false;
        }
        a.b("ShareHelper", "realSendShareMsg because reach to time");
        a.a(eVar);
        return false;
    }
}
