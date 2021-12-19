package com.bytedance.android.livesdk.model.utils.adapter;

import com.bytedance.android.live.e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import java.lang.reflect.Type;

public class RoomTypeAdapter implements k<Room> {
    static {
        Covode.recordClassIndex(11723);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.k
    public final /* synthetic */ Room a(l lVar, Type type, j jVar) {
        Room room = (Room) e.a.f9629c.a(lVar, type);
        room.init();
        return room;
    }
}
