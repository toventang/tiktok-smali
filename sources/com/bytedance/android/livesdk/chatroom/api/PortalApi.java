package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.t;

public interface PortalApi {
    static {
        Covode.recordClassIndex(8278);
    }

    @h(a = "/webcast/gift/portal/ping/")
    t<d<Object>> ping(@z(a = "room_id") long j2, @z(a = "portal_id") long j3, @z(a = "ping_type") a aVar);

    @h(a = "/webcast/gift/portal/user_portals/")
    t<d<Object>> stats(@z(a = "room_id") long j2);

    public enum a {
        WAIT_REWARD(0),
        RECEIVE_INVITATION(1),
        CLICK_INVITATION(2),
        JUMP_TO_ROOM(3);
        
        private int value;

        public final String toString() {
            return String.valueOf(this.value);
        }

        static {
            Covode.recordClassIndex(8279);
        }

        private a(int i2) {
            this.value = i2;
        }
    }
}
