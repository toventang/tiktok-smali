package com.bytedance.android.livesdk.chatroom.b;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.service.b;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class n implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f14973a;

    static {
        Covode.recordClassIndex(8312);
    }

    n(b bVar) {
        this.f14973a = bVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        b bVar = this.f14973a;
        d dVar = (d) obj;
        if (dVar.data != null) {
            bVar.a((Room) dVar.data);
        } else {
            bVar.a();
        }
    }
}
