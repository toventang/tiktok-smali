package com.bytedance.android.livesdk.chatroom.backroom.a;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public Room f14999a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, String> f15000b;

    static {
        Covode.recordClassIndex(8329);
    }

    public a(Room room, byte b2) {
        this(room);
    }

    private /* synthetic */ a(Room room) {
        this(room, new HashMap());
    }

    private a(Room room, Map<String, String> map) {
        l.d(map, "");
        this.f14999a = room;
        this.f15000b = map;
    }
}
