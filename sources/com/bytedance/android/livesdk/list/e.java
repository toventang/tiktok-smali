package com.bytedance.android.livesdk.list;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements f {

    /* renamed from: a  reason: collision with root package name */
    private final MultiRoomIdListProvider f18636a;

    /* renamed from: b  reason: collision with root package name */
    private final List f18637b;

    static {
        Covode.recordClassIndex(10440);
    }

    e(MultiRoomIdListProvider multiRoomIdListProvider, List list) {
        this.f18636a = multiRoomIdListProvider;
        this.f18637b = list;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        String str;
        MultiRoomIdListProvider multiRoomIdListProvider = this.f18636a;
        List list = this.f18637b;
        d dVar = (d) obj;
        if (!(dVar == null || dVar.data == null)) {
            Map map = (Map) dVar.data;
            ArrayList<Room> arrayList = new ArrayList();
            boolean z = false;
            String str2 = "";
            if (multiRoomIdListProvider.f18625b != null) {
                str2 = multiRoomIdListProvider.f18625b.f23298b.f23309a;
                str = multiRoomIdListProvider.f18625b.f23298b.f23315g;
            } else {
                str = str2;
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                RoomInfo roomInfo = (RoomInfo) it.next();
                if (roomInfo == null || !map.containsKey(String.valueOf(roomInfo.getRoomId()))) {
                    z = true;
                } else {
                    arrayList.add(map.get(String.valueOf(roomInfo.getRoomId())));
                }
            }
            z = true;
            for (Room room : arrayList) {
                room.setLog_pb(str);
                room.setRequestId(str2);
            }
            if (!z) {
                multiRoomIdListProvider.f18624a = new ArrayList(arrayList);
                multiRoomIdListProvider.a(multiRoomIdListProvider.f18624a);
            }
        }
    }
}
