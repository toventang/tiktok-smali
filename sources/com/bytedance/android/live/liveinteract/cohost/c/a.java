package com.bytedance.android.live.liveinteract.cohost.c;

import android.text.TextUtils;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.live.e;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.c.f;
import com.bytedance.android.live.liveinteract.api.m;
import com.bytedance.android.live.liveinteract.platform.b.b;
import com.bytedance.android.live.liveinteract.platform.common.g.e;
import com.bytedance.android.live.liveinteract.platform.common.g.h;
import com.bytedance.android.live.liveinteract.platform.common.g.p;
import com.bytedance.android.live.liveinteract.platform.common.g.v;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

@f(a = "LINK_LOGGER")
public final class a extends b {
    static {
        Covode.recordClassIndex(5369);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.b.b, com.bytedance.android.live.liveinteract.platform.a.a
    public final void a(Throwable th) {
        p.a(p.f11999b, th);
        JSONObject jSONObject = new JSONObject();
        com.bytedance.android.live.core.d.a.a(jSONObject, "error_code", 102L);
        b.a(jSONObject, th);
        com.bytedance.android.live.core.d.a.a(jSONObject, "cost", System.currentTimeMillis() - b.f10208c);
        b.a("join_channel_failed", jSONObject, 1);
        v.a(e.a(jSONObject));
        com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkCross_JoinChannel_Failed", "throwable:".concat(String.valueOf(th)));
    }

    @Override // com.bytedance.android.live.liveinteract.platform.b.b, com.bytedance.android.live.liveinteract.platform.a.a
    public final void c(Map<String, Object> map) {
        l.d(map, "");
        com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkCross_JoinChannel", "channelId:" + map.get("channel_id"));
        b.a(b.f10210e, "join_channel_request", new JSONObject());
        b.f10208c = System.currentTimeMillis();
    }

    @Override // com.bytedance.android.live.liveinteract.platform.b.b, com.bytedance.android.live.liveinteract.platform.a.a
    public final void d(Map<String, Object> map) {
        d dVar;
        l.d(map, "");
        com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkCross_JoinChannel_Success");
        com.bytedance.android.live.liveinteract.platform.a.c.a aVar = (com.bytedance.android.live.liveinteract.platform.a.c.a) map.get("response");
        if (aVar != null && (dVar = (d) aVar.f11883a) != null) {
            l.d(dVar, "");
            JSONObject jSONObject = new JSONObject();
            b.a(jSONObject, dVar);
            com.bytedance.android.live.core.d.a.a(jSONObject, "cost", System.currentTimeMillis() - b.f10208c);
            b.a("join_channel_succeed", jSONObject, 0);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.b.b, com.bytedance.android.live.liveinteract.platform.a.a
    public final void e(Map<String, Object> map) {
        l.d(map, "");
        Object obj = map.get("to_room_id");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((Long) obj).longValue();
        JSONObject jSONObject = new JSONObject();
        com.bytedance.android.live.core.d.a.a(jSONObject, "invite_room_id", longValue);
        b.a(b.f10210e, "invite_request", jSONObject);
        b.f10206a = System.currentTimeMillis();
    }

    @Override // com.bytedance.android.live.liveinteract.platform.b.b, com.bytedance.android.live.liveinteract.platform.a.a
    public final void f(Map<String, Object> map) {
        String str;
        l.d(map, "");
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            com.bytedance.android.live.liveinteract.api.a.b a2 = b.a.a();
            if (a2.p == m.FOLLOW_INVITE) {
                str = "mutual_follow";
            } else {
                str = "recommend";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            hashMap.put("room_id", room.getIdStr());
            hashMap.put("invitee_id", String.valueOf(a2.f9941f));
            hashMap.put("invitee_list", str);
            hashMap.put("invite_scene", h.a());
            if (a2.V != null) {
                hashMap.put("enter_from", a2.V);
            }
            String str2 = a2.x;
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put("request_id", str2);
            }
            h.a("livesdk_anchor_connection_invite_success", hashMap);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.b.b, com.bytedance.android.live.liveinteract.platform.a.a
    public final void g(Map<String, Object> map) {
        l.d(map, "");
        Integer num = (Integer) map.get("finishCode");
        if (num != null) {
            int intValue = num.intValue();
            Object obj = map.get("channel_id");
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Long");
            long longValue = ((Long) obj).longValue();
            com.bytedance.android.live.liveinteract.platform.common.g.a.a("FINISH_CROSS", "finishCode = ".concat(String.valueOf(intValue)));
            JSONObject jSONObject = new JSONObject();
            b.a(jSONObject, longValue);
            com.bytedance.android.live.core.d.a.a(jSONObject, "finish_code", String.valueOf(intValue));
            b.a("finish_request", jSONObject, 0);
            c.a("ttlive_client_linkmic_anchor_finish", 0, e.a(jSONObject));
            b.f10209d = System.currentTimeMillis();
            com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkCross_Finish", "channelId:".concat(String.valueOf(longValue)));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.b.b, com.bytedance.android.live.liveinteract.platform.a.a
    public final void h(Map<String, Object> map) {
        l.d(map, "");
        Integer num = (Integer) map.get("finishCode");
        if (num != null) {
            int intValue = num.intValue();
            Object obj = map.get("channel_id");
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Long");
            long longValue = ((Long) obj).longValue();
            com.bytedance.android.live.liveinteract.platform.a.c.a aVar = (com.bytedance.android.live.liveinteract.platform.a.c.a) map.get("response");
            if (aVar != null) {
                d dVar = (d) aVar.f11883a;
                if (dVar != null) {
                    l.d(dVar, "");
                    JSONObject jSONObject = new JSONObject();
                    b.a(jSONObject, dVar);
                    b.a(jSONObject, longValue);
                    com.bytedance.android.live.core.d.a.a(jSONObject, "finish_code", String.valueOf(intValue));
                    com.bytedance.android.live.core.d.a.a(jSONObject, "cost", System.currentTimeMillis() - b.f10209d);
                    b.a("finish_succeed", jSONObject, 0);
                }
                com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkCross_Finish_Success");
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.b.b, com.bytedance.android.live.liveinteract.platform.a.a
    public final void a(Map<String, Object> map) {
        l.d(map, "");
        Integer num = (Integer) map.get("reply_status");
        if (num != null) {
            num.intValue();
            if (num.intValue() == 1) {
                b.a(num.intValue(), (Map<String, ? extends Object>) null);
            } else {
                b.a(num.intValue(), map);
            }
            com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkCross_Reply", "channelId:" + map.get("channel_id") + "; roomId:" + map.get("room_id") + "; replyStatus:" + num + "; guestUserId:" + map.get("guest_user_id"));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.b.b, com.bytedance.android.live.liveinteract.platform.a.a
    public final void b(Map<String, Object> map) {
        l.d(map, "");
        com.bytedance.android.live.liveinteract.platform.a.c.a aVar = (com.bytedance.android.live.liveinteract.platform.a.c.a) map.get("response");
        if (aVar != null) {
            if (aVar.f11883a instanceof com.bytedance.android.livesdk.chatroom.model.b.f) {
                Object obj = aVar.f11883a;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.bytedance.android.livesdk.chatroom.model.interact.LinkReplyResult");
                if (obj != null) {
                    String b2 = e.a.f9628b.b(obj);
                    l.b(b2, "");
                    com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkCross_Reply_Success", b2);
                }
            }
            d dVar = (d) aVar.f11883a;
            if (dVar != null) {
                Object obj2 = map.get("reply_status");
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                b.a(((Integer) obj2).intValue(), dVar, map);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.b.b, com.bytedance.android.live.liveinteract.platform.a.a
    public final void a(Throwable th, Map<String, Object> map) {
        Integer num;
        if (!(map == null || (num = (Integer) map.get("reply_status")) == null)) {
            num.intValue();
            int intValue = num.intValue();
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.core.d.a.a(jSONObject, "error_code", 101L);
            b.a(jSONObject, th);
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                b.a(jSONObject, entry.getKey(), entry.getValue());
            }
            com.bytedance.android.live.core.d.a.a(jSONObject, "answer", String.valueOf(intValue));
            com.bytedance.android.live.core.d.a.a(jSONObject, "cost", System.currentTimeMillis() - b.f10207b);
            b.a("reply_failed", jSONObject, 1);
            if (intValue == 1) {
                v.a(com.bytedance.android.live.liveinteract.platform.common.g.e.a(jSONObject));
            }
        }
        com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkCross_Reply_Failed", "throwable:".concat(String.valueOf(th)));
    }

    @Override // com.bytedance.android.live.liveinteract.platform.b.b, com.bytedance.android.live.liveinteract.platform.a.a
    public final void b(Throwable th, Map<String, Object> map) {
        Integer num;
        long j2;
        if (map != null && (num = (Integer) map.get("finishCode")) != null) {
            int intValue = num.intValue();
            Long l2 = (Long) map.get("channel_id");
            if (l2 != null) {
                j2 = l2.longValue();
            } else {
                j2 = 0;
            }
            JSONObject jSONObject = new JSONObject();
            b.a(jSONObject, j2);
            com.bytedance.android.live.core.d.a.a(jSONObject, "finish_code", String.valueOf(intValue));
            b.a(jSONObject, th);
            com.bytedance.android.live.core.d.a.a(jSONObject, "cost", System.currentTimeMillis() - b.f10209d);
            b.a("finish_failed", jSONObject, 1);
            com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkCross_Finish_Failed", "throwable:".concat(String.valueOf(th)));
        }
    }
}
