package com.bytedance.android.live.liveinteract.platform.common.g;

import com.bytedance.android.live.e;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.a.c;
import com.bytedance.android.live.liveinteract.api.k;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.b.a.g;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.livesetting.linkmic.GuestCountDownTimeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.GuestPushStreamTimeAndroidSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveGuestLinkPreInitEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveLinkListOptiEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostNeedWaitRtcJoinChannelSucceed;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LinkServerAutoJoinChannel;
import com.bytedance.android.livesdk.model.message.aj;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.an;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ttnet.TTNetInit;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class d extends com.bytedance.android.live.core.d.a {

    /* renamed from: h  reason: collision with root package name */
    public static final a f11957h = new a((byte) 0);

    static {
        Covode.recordClassIndex(6530);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(6531);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    protected static void a(boolean z, JSONObject jSONObject) {
        Object value;
        l.d(jSONObject, "");
        for (Map.Entry<String, Object> entry : b(z).entrySet()) {
            if (!jSONObject.has(entry.getKey()) && (value = entry.getValue()) != null) {
                a(jSONObject, entry.getKey(), value);
            }
        }
        c(jSONObject);
    }

    public static void a(JSONObject jSONObject, Throwable th) {
        int i2;
        l.d(jSONObject, "");
        String th2 = th != null ? th.toString() : null;
        if (th instanceof com.bytedance.android.live.a.a.b.a) {
            com.bytedance.android.live.a.a.b.a aVar = (com.bytedance.android.live.a.a.b.a) th;
            i2 = aVar.getErrorCode();
            th2 = aVar.getErrorMsg();
        } else if (th instanceof com.bytedance.android.live.base.model.b.a) {
            i2 = ((com.bytedance.android.live.base.model.b.a) th).statusCode;
            th2 = th.getMessage();
        } else {
            i2 = 100001;
        }
        com.bytedance.android.live.core.d.a.a(jSONObject, "error_msg", (long) i2);
        com.bytedance.android.live.core.d.a.a(jSONObject, "error_detail", th2);
        if (th != null) {
            com.bytedance.android.live.core.d.a.a(jSONObject, "error_class", th.getClass().getName());
        }
    }

    public static HashMap<String, Object> d() {
        String str;
        String str2;
        long j2;
        String str3;
        HashMap<String, Object> hashMap = new HashMap<>();
        b a2 = b.a.a();
        hashMap.put("channel_id", Long.valueOf(a2.f9940e));
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        String str4 = "0";
        if (Room.isValid(room)) {
            if (room == null) {
                l.b();
            }
            str = room.getIdStr();
        } else {
            str = str4;
        }
        hashMap.put("room_id", str);
        hashMap.put("vendor", String.valueOf(a2.d().getValue()));
        if (a2.q) {
            str2 = "inviter";
        } else {
            str2 = "invitee";
        }
        hashMap.put("role_type", str2);
        long j3 = 0;
        if (Room.isValid(room)) {
            if (room == null) {
                l.b();
            }
            j2 = room.getOwnerUserId();
        } else {
            j2 = 0;
        }
        hashMap.put("user_id", Long.valueOf(j2));
        hashMap.put("guest_user_id", Long.valueOf(a2.f9941f));
        hashMap.put("link_mic_id", a2.L);
        if (a2.w) {
            j3 = 1;
        }
        hashMap.put("rtc_join_channel_advance", Long.valueOf(j3));
        hashMap.put("server_auto_joinchannel", Boolean.valueOf(LinkServerAutoJoinChannel.INSTANCE.getValue()));
        k b2 = a2.b();
        if (b2 != null) {
            str3 = b2.name();
        } else {
            str3 = null;
        }
        hashMap.put("link_state", str3);
        hashMap.put("device_score", Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
        hashMap.put("network_type", Long.valueOf((long) TTNetInit.getEffectiveConnectionType()));
        if (hashMap.get("invitee_list") == null) {
            hashMap.put("invitee_list", w.a(b.a.a().p));
        }
        if (CoHostNeedWaitRtcJoinChannelSucceed.INSTANCE.getValue()) {
            str4 = "1";
        }
        hashMap.put("need_wait_rtc_joinchannel_succeed", str4);
        return hashMap;
    }

    public static void b(JSONObject jSONObject) {
        Object value;
        l.d(jSONObject, "");
        for (Map.Entry<String, Object> entry : d().entrySet()) {
            if (!jSONObject.has(entry.getKey()) && (value = entry.getValue()) != null) {
                a(jSONObject, entry.getKey(), value);
            }
        }
        c(jSONObject);
    }

    public static void c(JSONObject jSONObject) {
        l.d(jSONObject, "");
        if (!jSONObject.has("server_timestamp")) {
            com.bytedance.android.live.core.d.a.a(jSONObject, "server_timestamp", System.currentTimeMillis() + an.f22242a);
        }
        if (!jSONObject.has("client_and_server_diff_time")) {
            com.bytedance.android.live.core.d.a.a(jSONObject, "client_and_server_diff_time", an.f22242a);
        }
        if (!jSONObject.has("client_timestamp")) {
            com.bytedance.android.live.core.d.a.a(jSONObject, "client_timestamp", System.currentTimeMillis());
        }
    }

    public static HashMap<String, Object> b(boolean z) {
        String str;
        long j2;
        String str2;
        String str3;
        HashMap<String, Object> hashMap = new HashMap<>();
        com.bytedance.android.livesdk.b.a.d a2 = com.bytedance.android.livesdk.b.a.d.a();
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (Room.isValid(room)) {
            if (room == null) {
                l.b();
            }
            str = room.getIdStr();
        } else {
            str = "0";
        }
        long j3 = 0;
        if (Room.isValid(room)) {
            if (room == null) {
                l.b();
            }
            j2 = room.getOwnerUserId();
        } else {
            j2 = 0;
        }
        hashMap.put("room_id", str);
        hashMap.put("anchor_id", Long.valueOf(j2));
        hashMap.put("in_rtc_room", Boolean.valueOf(a2.y));
        if (z) {
            str2 = "anchor";
        } else {
            str2 = "guest";
        }
        hashMap.put("role_type", str2);
        l.b(a2, "");
        Config.Vendor fromValue = Config.Vendor.fromValue(a2.f14186g);
        l.b(fromValue, "");
        hashMap.put("vendor", String.valueOf(fromValue.getValue()));
        hashMap.put("link_mic_id", a2.f14185f);
        f b2 = u.a().b();
        if (b2 != null) {
            j3 = b2.c();
        }
        hashMap.put("current_user_id", Long.valueOf(j3));
        hashMap.put("current_linkmic_id", g.a.f14199a.a(j3));
        if (z || c.a().f9959k != 2) {
            str3 = "video";
        } else {
            str3 = DataType.AUDIO;
        }
        hashMap.put("link_type", str3);
        hashMap.put("device_score", Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
        hashMap.put("network_type", Long.valueOf((long) TTNetInit.getEffectiveConnectionType()));
        if (!z) {
            hashMap.put("rtc_init_advance", Boolean.valueOf(LiveGuestLinkPreInitEnableSetting.INSTANCE.getValue()));
        }
        hashMap.put("list_opti_enable", Boolean.valueOf(LiveLinkListOptiEnableSetting.INSTANCE.getValue()));
        hashMap.put("guest_count_down_time", Integer.valueOf(GuestCountDownTimeSetting.INSTANCE.getValue()));
        hashMap.put("guest_push_stream_time_android", Double.valueOf(GuestPushStreamTimeAndroidSetting.INSTANCE.getValue()));
        return hashMap;
    }

    public static void a(JSONObject jSONObject, long j2) {
        l.d(jSONObject, "");
        if (!jSONObject.has("channel_id")) {
            com.bytedance.android.live.core.d.a.a(jSONObject, "channel_id", j2);
        }
    }

    public static <T> void a(JSONObject jSONObject, com.bytedance.android.live.network.response.d<T> dVar) {
        l.d(jSONObject, "");
        l.d(dVar, "");
        com.bytedance.android.live.core.d.a.a(jSONObject, "request_type", String.valueOf(dVar.requestType));
        com.bytedance.android.live.core.d.a.a(jSONObject, "response", e.a.f9628b.b(dVar));
    }

    public static void a(JSONObject jSONObject, aj ajVar) {
        l.d(jSONObject, "");
        l.d(ajVar, "");
        com.bytedance.android.live.core.d.a.a(jSONObject, "channel_id", ajVar.f19140f);
        com.bytedance.android.live.core.d.a.a(jSONObject, "message_from", String.valueOf(ajVar.getMessageFrom()));
        com.bytedance.android.live.core.d.a.a(jSONObject, "message_create_time", ajVar.O.f23209a);
        com.bytedance.android.live.core.d.a.a(jSONObject, "message_fetch_time", ajVar.M);
        com.bytedance.android.live.core.d.a.a(jSONObject, "transfer_extra", ajVar.v);
        com.bytedance.android.live.core.d.a.a(jSONObject, "delay_time", ajVar.d());
        long currentTimeMillis = System.currentTimeMillis() + an.f22242a;
        com.bytedance.android.live.core.d.a.a(jSONObject, "server_timestamp", currentTimeMillis);
        com.bytedance.android.live.core.d.a.a(jSONObject, "fetch_delay_time", currentTimeMillis - ajVar.M);
        com.bytedance.android.live.core.d.a.a(jSONObject, "message", e.a.f9628b.b(ajVar));
    }

    public static void a(Throwable th, JSONObject jSONObject) {
        String str;
        long j2;
        l.d(jSONObject, "");
        if (th != null) {
            if (th instanceof com.bytedance.android.live.a.a.b.a) {
                com.bytedance.android.live.core.d.a.a(jSONObject, "error_type", "api_error");
                com.bytedance.android.live.a.a.b.a aVar = (com.bytedance.android.live.a.a.b.a) th;
                com.bytedance.android.live.core.d.a.a(jSONObject, "error_code", (long) aVar.getErrorCode());
                com.bytedance.android.live.core.d.a.a(jSONObject, "error_msg", aVar.getErrorMsg());
            } else if (th instanceof com.bytedance.android.live.base.model.b.a) {
                com.bytedance.android.live.core.d.a.a(jSONObject, "error_type", "net_error");
                com.bytedance.android.live.core.d.a.a(jSONObject, "error_code", (long) ((com.bytedance.android.live.base.model.b.a) th).statusCode);
                com.bytedance.android.live.core.d.a.a(jSONObject, "error_msg", th.getMessage());
            } else {
                com.bytedance.android.live.core.d.a.a(jSONObject, "error_type", "unknow");
                com.bytedance.android.live.core.d.a.a(jSONObject, "error_code", -1L);
                com.bytedance.android.live.core.d.a.a(jSONObject, "error_msg", th.getClass().getName());
            }
        }
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (Room.isValid(room)) {
            if (room == null) {
                l.b();
            }
            str = room.getIdStr();
        } else {
            str = "0";
        }
        if (Room.isValid(room)) {
            if (room == null) {
                l.b();
            }
            j2 = room.getOwnerUserId();
        } else {
            j2 = 0;
        }
        com.bytedance.android.live.core.d.a.a(jSONObject, "room_id", str);
        com.bytedance.android.live.core.d.a.a(jSONObject, "anchor_id", j2);
    }

    public static void a(JSONObject jSONObject, com.bytedance.android.livesdk.model.message.an anVar) {
        l.d(jSONObject, "");
        l.d(anVar, "");
        com.bytedance.android.live.core.d.a.a(jSONObject, "battle_id", anVar.f19165a);
        com.bytedance.android.live.core.d.a.a(jSONObject, "message_create_time", anVar.O.f23209a);
        com.bytedance.android.live.core.d.a.a(jSONObject, "message_fetch_time", anVar.M);
        com.bytedance.android.live.core.d.a.a(jSONObject, "message", e.a.f9628b.b(anVar));
    }

    protected static void a(int i2, boolean z, JSONObject jSONObject) {
        String str;
        long j2;
        String str2;
        boolean z2;
        String str3 = "";
        l.d(jSONObject, str3);
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (Room.isValid(room)) {
            if (room == null) {
                l.b();
            }
            str = room.getIdStr();
        } else {
            str = "0";
        }
        long j3 = 0;
        if (Room.isValid(room)) {
            if (room == null) {
                l.b();
            }
            j2 = room.getOwnerUserId();
        } else {
            j2 = 0;
        }
        if (i2 == 2) {
            str2 = str;
        } else if (i2 != 4) {
            str2 = str3;
        } else {
            str2 = String.valueOf(b.a.a().f9940e);
        }
        com.bytedance.android.live.core.d.a.a(jSONObject, "channel_id", str2);
        com.bytedance.android.live.core.d.a.a(jSONObject, "room_id", str);
        com.bytedance.android.live.core.d.a.a(jSONObject, "anchor_id", j2);
        if (i2 != 4) {
            z2 = false;
        } else {
            z2 = b.a.a().ae;
        }
        int i3 = z2 ? 1 : 0;
        int i4 = z2 ? 1 : 0;
        int i5 = z2 ? 1 : 0;
        com.bytedance.android.live.core.d.a.a(jSONObject, "is_mute", String.valueOf(i3));
        f b2 = u.a().b();
        if (b2 != null) {
            j3 = b2.c();
        }
        com.bytedance.android.live.core.d.a.a(jSONObject, "current_user_id", j3);
        if (i2 != 2) {
            if (i2 == 4) {
                if (!z) {
                    str3 = "audience";
                } else if (b.a.a().q) {
                    str3 = "inviter";
                } else {
                    str3 = "invitee";
                }
            }
        } else if (z) {
            str3 = "anchor";
        } else {
            str3 = "guest";
        }
        com.bytedance.android.live.core.d.a.a(jSONObject, "role_type", str3);
        com.bytedance.android.live.core.d.a.a(jSONObject, "mode", (long) i2);
        c(jSONObject);
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        l.d(jSONObject, "");
        l.d(str, "");
        if (obj != null) {
            if (obj instanceof Long) {
                com.bytedance.android.live.core.d.a.a(jSONObject, str, ((Number) obj).longValue());
            } else if (obj instanceof Float) {
                com.bytedance.android.live.core.d.a.a(jSONObject, str, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                com.bytedance.android.live.core.d.a.a(jSONObject, str, ((Number) obj).doubleValue());
            } else if (obj instanceof JSONObject) {
                com.bytedance.android.live.core.d.a.a(jSONObject, str, (JSONObject) obj);
            } else if (obj instanceof String) {
                com.bytedance.android.live.core.d.a.a(jSONObject, str, (String) obj);
            } else {
                com.bytedance.android.live.core.d.a.a(jSONObject, str, obj.toString());
            }
        }
    }
}
