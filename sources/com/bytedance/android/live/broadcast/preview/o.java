package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.core.d.c;
import com.bytedance.android.livesdk.ab.c.h;
import com.bytedance.android.livesdk.ab.c.i;
import com.bytedance.android.livesdk.ab.c.j;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.a.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.f.b.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class o implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8265a = new a((byte) 0);

    static {
        Covode.recordClassIndex(4195);
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.a.g
    public final void onStartLive() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(4196);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.a.d
    public final void a() {
        c(0, null);
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.a.d
    public final void a(int i2) {
        c(i2, null);
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.a.d
    public final void b(int i2, DataChannel dataChannel) {
        l.d(dataChannel, "");
        c(i2, dataChannel);
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.a.d
    public final void a(int i2, DataChannel dataChannel) {
        l.d(dataChannel, "");
        c(i2, dataChannel);
    }

    private static void c(int i2, DataChannel dataChannel) {
        Room room;
        Long l2;
        Long l3;
        Integer num;
        String str;
        h hVar;
        JSONObject jSONObject = new JSONObject();
        try {
            f b2 = u.a().b();
            l.b(b2, "");
            jSONObject.put("user_id", b2.c());
            if (dataChannel == null || (hVar = (h) dataChannel.b(i.class)) == null || (room = hVar.f13527b) == null) {
                h hVar2 = (h) DataChannelGlobal.f34575d.b(j.class);
                if (hVar2 != null) {
                    room = hVar2.f13527b;
                } else {
                    room = null;
                }
            }
            if (room != null) {
                l2 = Long.valueOf(room.getId());
            } else {
                l2 = null;
            }
            jSONObject.put("room_id", l2);
            if (room != null) {
                l3 = Long.valueOf(room.getOwnerUserId());
            } else {
                l3 = null;
            }
            jSONObject.put("anchor_id", l3);
            if (room != null) {
                num = Integer.valueOf(room.liveRoomMode);
            } else {
                num = null;
            }
            jSONObject.put("live_mode", num);
            if (room != null) {
                str = room.getLabels();
            } else {
                str = null;
            }
            jSONObject.put("game_label", str);
            jSONObject.put("error_code", i2);
        } catch (JSONException e2) {
            c.a(e2, String.valueOf(e2));
        }
        com.bytedance.android.livesdkapi.session.d.a("livesdk_gamelive_start", null, null, jSONObject);
    }
}
