package com.bytedance.android.livesdk.chatroom.detail;

import com.bytedance.android.live.core.d.c;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.g.d;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final v f15322a;

    static {
        Covode.recordClassIndex(8467);
    }

    w(v vVar) {
        this.f15322a = vVar;
    }

    public final void run() {
        long j2;
        long j3;
        v vVar = this.f15322a;
        JSONObject jSONObject = new JSONObject();
        HashMap hashMap = new HashMap(40);
        if (vVar.f15317c != null) {
            v.a(jSONObject, "room_id", Long.valueOf(vVar.f15317c.f6841g));
            v.a(jSONObject, "enter_room_type", vVar.f15317c.f6836b);
            v.a(jSONObject, "enter_room_merge_type", vVar.f15317c.f6837c);
            v.a(jSONObject, "enter_room_method_type", vVar.f15317c.f6838d);
            v.a(jSONObject, "enterRoomStage", Integer.valueOf(vVar.f15317c.f6835a));
            v.a(jSONObject, "playerStatus", Integer.valueOf(vVar.f15317c.f6840f));
            v.a(jSONObject, "enter_room_sub_type", vVar.f15317c.f6839e);
            hashMap.put("room_id", String.valueOf(vVar.f15317c.f6841g));
            hashMap.put("enter_room_type", String.valueOf(vVar.f15317c.f6836b));
            hashMap.put("enter_room_merge_type", String.valueOf(vVar.f15317c.f6837c));
            hashMap.put("enter_room_method_type", String.valueOf(vVar.f15317c.f6838d));
            hashMap.put("enterRoomStage", String.valueOf(vVar.f15317c.f6835a));
            hashMap.put("playerStatus", String.valueOf(vVar.f15317c.f6840f));
            hashMap.put("enter_room_sub_type", String.valueOf(vVar.f15317c.f6839e));
            vVar.a("play_container_build", Long.valueOf(vVar.f15317c.f6844j));
        }
        v.a(jSONObject, "has_warmed_up", Integer.valueOf(vVar.f15318d ? 1 : 0));
        hashMap.put("has_warmed_up", String.valueOf(vVar.f15318d ? 1 : 0));
        v.a(jSONObject, "is_share_player", Integer.valueOf(vVar.f15319e ? 1 : 0));
        hashMap.put("is_share_player", String.valueOf(vVar.f15319e ? 1 : 0));
        v.a(jSONObject, "is_pre_create_surface", Integer.valueOf(vVar.f15320f ? 1 : 0));
        hashMap.put("is_pre_create_surface", String.valueOf(vVar.f15320f ? 1 : 0));
        for (Map.Entry<String, Long> entry : vVar.f15315a.entrySet()) {
            v.a(jSONObject, entry.getKey(), entry.getValue());
            hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        hashMap.put("duration", String.valueOf(vVar.b()));
        v.a(jSONObject, "duration", String.valueOf(vVar.b()));
        Long l2 = vVar.f15315a.get("start");
        Long l3 = vVar.f15315a.get("sdk_player_first_frame");
        if (l2 == null || l3 == null) {
            j2 = 0;
        } else {
            j2 = l3.longValue() - l2.longValue();
            if (j2 < 0) {
                j2 = -1;
            }
        }
        if (vVar.f15319e && j2 < 0) {
            j2 = 0;
        }
        hashMap.put("first_frame_duration", String.valueOf(j2));
        v.a(jSONObject, "first_frame_duration", String.valueOf(j2));
        if (((IHostContext) a.a(IHostContext.class)).isOffline()) {
            StringBuilder sb = new StringBuilder();
            sb.append(hashMap.toString()).append("\n");
            for (Map.Entry<String, Long> entry2 : vVar.f15315a.entrySet()) {
                v.a(jSONObject, entry2.getKey(), entry2.getValue());
                hashMap.put(entry2.getKey(), String.valueOf(entry2.getValue()));
                StringBuilder append = sb.append(entry2.getKey()).append(": ");
                String key = entry2.getKey();
                Long l4 = vVar.f15315a.get("start");
                Long l5 = vVar.f15315a.get(key);
                if (l4 == null || l5 == null) {
                    j3 = 0;
                } else {
                    j3 = l5.longValue() - l4.longValue();
                }
                append.append(j3).append(" <--> " + entry2.getValue() + " - " + vVar.b("start") + "  ").append("\n");
            }
            d.a("RoomPlayerLogger_TAG", sb.toString());
        }
        c.a("ttlive_enter_room_full_link_monitor", 0, 0, jSONObject);
        b.a.a("livesdk_enter_room_duration").a((Map<String, String>) hashMap).a().b();
        vVar.f15321g = true;
        vVar.f15315a.clear();
        vVar.f15317c = null;
        vVar.f15316b = null;
        vVar.f15318d = false;
        vVar.f15319e = false;
        vVar.f15320f = false;
    }
}
