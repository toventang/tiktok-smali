package com.bytedance.android.live.broadcast.f;

import android.os.Message;
import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class f implements f.a.d.f {

    /* renamed from: a  reason: collision with root package name */
    private final a f7867a;

    static {
        Covode.recordClassIndex(3892);
    }

    f(a aVar) {
        this.f7867a = aVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        a aVar = this.f7867a;
        d dVar = (d) obj;
        if (aVar.f7854c != null) {
            Message obtainMessage = aVar.f7854c.obtainMessage(34);
            obtainMessage.obj = dVar.data;
            aVar.f7854c.sendMessage(obtainMessage);
        }
    }
}
