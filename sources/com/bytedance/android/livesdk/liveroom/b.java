package com.bytedance.android.livesdk.liveroom;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import f.a.d.k;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements k {

    /* renamed from: a  reason: collision with root package name */
    private final Map f18697a;

    static {
        Covode.recordClassIndex(10490);
    }

    b(Map map) {
        this.f18697a = map;
    }

    @Override // f.a.d.k
    public final boolean a(Object obj) {
        return RoomStatusController.lambda$refreshRoomStats$0$RoomStatusController(this.f18697a, (Room) obj);
    }
}
