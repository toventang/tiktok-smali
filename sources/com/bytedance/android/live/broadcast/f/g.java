package com.bytedance.android.live.broadcast.f;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class g implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f7868a;

    static {
        Covode.recordClassIndex(3893);
    }

    g(a aVar) {
        this.f7868a = aVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        a aVar = this.f7868a;
        if (aVar.f7854c != null) {
            Message obtainMessage = aVar.f7854c.obtainMessage(34);
            obtainMessage.obj = obj;
            aVar.f7854c.sendMessage(obtainMessage);
        }
    }
}
