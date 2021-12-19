package com.bytedance.android.livesdk.live.data;

import android.text.TextUtils;
import androidx.lifecycle.t;
import com.bytedance.android.live.network.e;
import com.bytedance.android.livesdk.live.api.RoomStatApi;
import com.bytedance.android.livesdk.live.model.c;
import com.bytedance.android.livesdk.util.rxutils.RxViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import f.a.h.a;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class RoomStatsViewModel extends RxViewModel {

    /* renamed from: a  reason: collision with root package name */
    public final t<Map<String, c>> f18675a = new t<>();

    static {
        Covode.recordClassIndex(10460);
    }

    public final void a(List<Room> list) {
        if (h.a(list)) {
            this.f18675a.setValue(new HashMap());
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (Room room : list) {
            if (room != null) {
                linkedList.add(Long.valueOf(room.getId()));
            }
        }
        ((RoomStatApi) e.a().a(RoomStatApi.class)).checkRoom(TextUtils.join(",", linkedList)).b(a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new a(this), new b(this));
    }
}
