package com.bytedance.android.livesdk.chatroom.b;

import android.os.Message;
import com.bytedance.android.live.n.o;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdkapi.depend.model.live.ContinueRoomResponse;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

public final /* synthetic */ class u implements f {

    /* renamed from: a  reason: collision with root package name */
    private final o.a f14980a;

    static {
        Covode.recordClassIndex(8319);
    }

    public u(o.a aVar) {
        this.f14980a = aVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        o.a aVar = this.f14980a;
        d dVar = (d) obj;
        if ((dVar == null || !(dVar.statusCode != 0 || dVar.data == null || ((ContinueRoomResponse) dVar.data).room == null)) && aVar.f12086a != null) {
            Message obtainMessage = aVar.f12086a.obtainMessage(aVar.f12093h);
            obtainMessage.obj = ((ContinueRoomResponse) dVar.data).room;
            aVar.f12086a.sendMessage(obtainMessage);
        }
    }
}
