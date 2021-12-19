package com.bytedance.android.livesdk.list;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class a implements f {

    /* renamed from: a  reason: collision with root package name */
    private final MultiPlusFeedRoomListProvider f18630a;

    /* renamed from: b  reason: collision with root package name */
    private final int f18631b;

    /* renamed from: c  reason: collision with root package name */
    private final long[] f18632c;

    static {
        Covode.recordClassIndex(10436);
    }

    a(MultiPlusFeedRoomListProvider multiPlusFeedRoomListProvider, int i2, long[] jArr) {
        this.f18630a = multiPlusFeedRoomListProvider;
        this.f18631b = i2;
        this.f18632c = jArr;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        MultiPlusFeedRoomListProvider multiPlusFeedRoomListProvider = this.f18630a;
        int i2 = this.f18631b;
        long[] jArr = this.f18632c;
        d dVar = (d) obj;
        if (!(dVar == null || dVar.data == null)) {
            Map map = (Map) dVar.data;
            String str = multiPlusFeedRoomListProvider.f18613c.f23298b.f23309a;
            String str2 = multiPlusFeedRoomListProvider.f18613c.f23298b.f23315g;
            for (int i3 = i2; i3 < jArr.length + i2; i3++) {
                long j2 = multiPlusFeedRoomListProvider.o[i3];
                if (map.containsKey(Long.toString(j2))) {
                    multiPlusFeedRoomListProvider.n.add(Long.valueOf(j2));
                    Room room = (Room) map.get(Long.toString(j2));
                    room.setLog_pb(str2);
                    room.setRequestId(str);
                    multiPlusFeedRoomListProvider.f18611a.set(i3, room);
                    multiPlusFeedRoomListProvider.f18612b.set(i3, com.bytedance.android.livesdkapi.g.a.a(room, false));
                } else {
                    multiPlusFeedRoomListProvider.f18611a.set(i3, null);
                }
            }
            multiPlusFeedRoomListProvider.f18615e = false;
        }
    }
}
