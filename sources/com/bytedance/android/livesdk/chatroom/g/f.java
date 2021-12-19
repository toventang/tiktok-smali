package com.bytedance.android.livesdk.chatroom.g;

import android.os.SystemClock;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.b.a.e;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.i;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.h.b;
import com.bytedance.android.livesdkapi.session.d;
import com.bytedance.android.message.IMessageService;
import com.bytedance.android.message.c;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class f implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final e f15526a = new e();

    /* renamed from: b  reason: collision with root package name */
    public static Room f15527b;

    /* renamed from: c  reason: collision with root package name */
    public static final f f15528c;

    private f() {
    }

    static {
        Covode.recordClassIndex(8582);
        f fVar = new f();
        f15528c = fVar;
        ((IMessageService) a.a(IMessageService.class)).addOnMessageParsedListener(fVar);
    }

    public static void a() {
        int i2;
        Long l2;
        Long l3;
        RoomAuthStatus roomAuthStatus;
        RoomAuthStatus roomAuthStatus2;
        JSONObject jSONObject = new JSONObject();
        try {
            Room room = f15527b;
            int i3 = 0;
            if (room == null || (roomAuthStatus2 = room.getRoomAuthStatus()) == null || roomAuthStatus2.enableChat) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("chat_state", i2);
            Room room2 = f15527b;
            if (!(room2 == null || (roomAuthStatus = room2.getRoomAuthStatus()) == null)) {
                i3 = roomAuthStatus.getPublicScreenAuth();
            }
            jSONObject.put("public_screen_state", i3);
            com.bytedance.android.livesdk.at.f b2 = u.a().b();
            l.b(b2, "");
            jSONObject.put("user_id", b2.c());
            Room room3 = f15527b;
            if (room3 != null) {
                l2 = Long.valueOf(room3.getId());
            } else {
                l2 = null;
            }
            jSONObject.put("room_id", l2);
            Room room4 = f15527b;
            if (room4 != null) {
                l3 = Long.valueOf(room4.getOwnerUserId());
            } else {
                l3 = null;
            }
            jSONObject.put("anchor_id", l3);
        } catch (JSONException unused) {
        }
        d.a("ttlive_message_link_overall_state", null, null, jSONObject);
    }

    public static void a(int i2) {
        Long l2;
        Long l3;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("send_precondition_error_code", i2);
            com.bytedance.android.livesdk.at.f b2 = u.a().b();
            l.b(b2, "");
            jSONObject.put("user_id", b2.c());
            Room room = f15527b;
            if (room != null) {
                l2 = Long.valueOf(room.getId());
            } else {
                l2 = null;
            }
            jSONObject.put("room_id", l2);
            Room room2 = f15527b;
            if (room2 != null) {
                l3 = Long.valueOf(room2.getOwnerUserId());
            } else {
                l3 = null;
            }
            jSONObject.put("anchor_id", l3);
        } catch (JSONException unused) {
        }
        d.a("ttlive_chat", null, null, jSONObject);
    }

    @Override // com.bytedance.android.message.c
    public final void a(i iVar) {
        long j2;
        Long l2;
        Long l3;
        Long l4;
        l.d(iVar, "");
        e eVar = f15526a;
        b bVar = iVar.O;
        if (bVar != null) {
            j2 = bVar.f23212d;
        } else {
            j2 = 0;
        }
        Long valueOf = Long.valueOf(eVar.a(j2));
        if (valueOf.longValue() > 0 && 1 != 0 && valueOf != null) {
            long longValue = valueOf.longValue();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("message_send_receive_duration", SystemClock.uptimeMillis() - longValue);
                com.bytedance.android.livesdk.at.f b2 = u.a().b();
                l.b(b2, "");
                jSONObject.put("user_id", b2.c());
                Room room = f15527b;
                if (room != null) {
                    l2 = Long.valueOf(room.getId());
                } else {
                    l2 = null;
                }
                jSONObject.put("room_id", l2);
                Room room2 = f15527b;
                if (room2 != null) {
                    l3 = Long.valueOf(room2.getOwnerUserId());
                } else {
                    l3 = null;
                }
                jSONObject.put("anchor_id", l3);
                b bVar2 = iVar.O;
                if (bVar2 != null) {
                    l4 = Long.valueOf(bVar2.f23212d);
                } else {
                    l4 = null;
                }
                jSONObject.put("msg_id", l4);
            } catch (JSONException unused) {
            }
            d.a("ttlive_chat_message_metrics", null, null, jSONObject);
        }
    }
}
