package com.bytedance.android.livesdk.chatroom.b;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.network.response.b;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.chatroom.model.e;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.g.n;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class x implements f {

    /* renamed from: a  reason: collision with root package name */
    private final f f14983a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f14984b;

    /* renamed from: c  reason: collision with root package name */
    private final long f14985c;

    static {
        Covode.recordClassIndex(8322);
    }

    x(f fVar, Handler handler, long j2) {
        this.f14983a = fVar;
        this.f14984b = handler;
        this.f14985c = j2;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        f fVar = this.f14983a;
        Handler handler = this.f14984b;
        long j2 = this.f14985c;
        b bVar = (b) obj;
        if (handler != null) {
            e eVar = new e();
            eVar.f15757a = bVar.data;
            if (eVar.f15757a == null || eVar.f15757a.getId() == 0) {
                eVar.f15757a = n.a(j2);
            }
            eVar.f15758b = (EnterRoomExtra) bVar.extra;
            if (eVar.f15757a != null) {
                eVar.f15757a.nowTime = ((EnterRoomExtra) bVar.extra).now / 1000;
            }
            fVar.f14959b = u.a().b().e();
            Message obtainMessage = handler.obtainMessage(4);
            obtainMessage.obj = eVar;
            handler.sendMessage(obtainMessage);
        }
    }
}
