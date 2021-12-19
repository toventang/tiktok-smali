package com.bytedance.android.livesdk.chatroom.api;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.network.response.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import java.util.ArrayList;
import java.util.List;

public final /* synthetic */ class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f14931a;

    static {
        Covode.recordClassIndex(8287);
    }

    public b(Handler handler) {
        this.f14931a = handler;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        Handler handler = this.f14931a;
        a aVar = (a) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(22);
            try {
                List<Room> list = aVar.f12145b;
                if (list == null) {
                    list = new ArrayList(1);
                }
                for (Room room : list) {
                    try {
                        room.setRequestId(((com.bytedance.android.live.base.model.c.a) aVar.f12146c).f7383f);
                        room.setLog_pb(((com.bytedance.android.live.base.model.c.a) aVar.f12146c).a().toString());
                    } catch (Exception unused) {
                    }
                }
                obtainMessage.obj = list;
            } catch (Exception unused2) {
            }
            handler.sendMessage(obtainMessage);
        }
    }
}
