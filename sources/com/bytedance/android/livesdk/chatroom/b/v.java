package com.bytedance.android.livesdk.chatroom.b;

import android.os.Message;
import com.bytedance.android.live.n.o;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

public final /* synthetic */ class v implements f {

    /* renamed from: a  reason: collision with root package name */
    private final o.a f14981a;

    static {
        Covode.recordClassIndex(8320);
    }

    public v(o.a aVar) {
        this.f14981a = aVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        o.a aVar = this.f14981a;
        if (aVar.f12086a != null) {
            Message obtainMessage = aVar.f12086a.obtainMessage(aVar.f12093h);
            obtainMessage.obj = obj;
            aVar.f12086a.sendMessage(obtainMessage);
        }
    }
}
