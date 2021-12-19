package com.bytedance.android.livesdkapi.g;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class n {
    static {
        Covode.recordClassIndex(13768);
    }

    public static Room a(long j2) {
        if (k.f23204a.f23205b == null || k.f23204a.f23205b.b() == null) {
            return null;
        }
        Room a2 = a(k.f23204a.f23205b.b(), j2);
        if (a2 == null) {
            return a(k.f23204a.f23205b.d(), j2);
        }
        return a2;
    }

    private static Room a(List<Room> list, long j2) {
        if (h.a(list)) {
            return null;
        }
        for (Room room : list) {
            if (room.getId() == j2) {
                return room;
            }
        }
        return null;
    }
}
