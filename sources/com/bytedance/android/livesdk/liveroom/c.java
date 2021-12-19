package com.bytedance.android.livesdk.liveroom;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements f {

    /* renamed from: a  reason: collision with root package name */
    private final RoomStatusController f18698a;

    static {
        Covode.recordClassIndex(10491);
    }

    c(RoomStatusController roomStatusController) {
        this.f18698a = roomStatusController;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        this.f18698a.lambda$refreshRoomStats$1$RoomStatusController((Room) obj);
    }
}
