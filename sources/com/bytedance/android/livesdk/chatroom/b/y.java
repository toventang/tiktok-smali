package com.bytedance.android.livesdk.chatroom.b;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.a.a.a.c;
import com.bytedance.android.live.network.response.b;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.chatroom.model.e;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.g.n;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class y implements f {

    /* renamed from: a  reason: collision with root package name */
    private final f f14986a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f14987b;

    /* renamed from: c  reason: collision with root package name */
    private final long f14988c;

    static {
        Covode.recordClassIndex(8323);
    }

    y(f fVar, Handler handler, long j2) {
        this.f14986a = fVar;
        this.f14987b = handler;
        this.f14988c = j2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v3, resolved type: com.bytedance.android.livesdk.chatroom.model.e */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.a.d.f
    public final void accept(Object obj) {
        f fVar = this.f14986a;
        Handler handler = this.f14987b;
        long j2 = this.f14988c;
        Throwable th = (Throwable) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(4);
            Room a2 = n.a(j2);
            boolean z = th instanceof c;
            Throwable th2 = th;
            th2 = th;
            if (z && a2 != null) {
                c cVar = (c) th;
                if (cVar.getResponse() == null || cVar.getResponse().extra == null || cVar.getResponse().statusCode != 0) {
                    obtainMessage.obj = th;
                    handler.sendMessage(obtainMessage);
                }
                e eVar = new e();
                b response = cVar.getResponse();
                eVar.f15757a = a2;
                eVar.f15758b = (EnterRoomExtra) response.extra;
                if (eVar.f15757a != null) {
                    eVar.f15757a.nowTime = ((EnterRoomExtra) response.extra).now / 1000;
                }
                fVar.f14959b = u.a().b().e();
                th2 = eVar;
            }
            obtainMessage.obj = th2;
            handler.sendMessage(obtainMessage);
        }
    }
}
