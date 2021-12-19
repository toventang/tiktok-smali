package com.bytedance.android.livesdk.service.c.g;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.livesdk.ab.a.b;
import com.bytedance.android.livesdk.ab.d.d;
import com.bytedance.android.livesdk.ab.e;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.Map;

public final class a {
    static {
        Covode.recordClassIndex(12611);
    }

    public static void a(Throwable th) {
        HashMap hashMap = new HashMap();
        User user = (User) u.a().b().a();
        if (user != null) {
            hashMap.put("user_id", Long.valueOf(user.getId()));
        }
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            hashMap.put("anchor_id", Long.valueOf(room.getOwnerUserId()));
            hashMap.put("room_id", Long.valueOf(room.getId()));
        }
        if (th != null) {
            if (th instanceof com.bytedance.android.live.a.a.a) {
                hashMap.put("error_code", Integer.valueOf(((com.bytedance.android.live.a.a.a) th).getErrorCode()));
            } else {
                hashMap.put("error_code", 0);
            }
            hashMap.put("error_msg", th.getMessage());
        }
        if (room != null && room.getRoomAuthStatus() != null && !room.getRoomAuthStatus().isEnableGift()) {
            c.a(d.a("ttlive_gift_disable_but_sent"), 1, 0, hashMap);
            c.a(d.b("ttlive_gift_disable_but_sent"), 1, hashMap);
            com.bytedance.android.livesdk.ab.a.a.a();
            com.bytedance.android.livesdk.ab.a.a.a(b.Gift.info, "ttlive_gift_disable_but_sent", hashMap);
        }
    }

    public static void a(Map<String, Object> map) {
        map.put("enter_from_merge", e.a());
        map.put("enter_method", e.d());
        map.put("action_type", e.e());
        map.put("video_id", e.f());
        map.put("anchor_id", Long.valueOf(e.h()));
        map.put("room_id", Long.valueOf(e.i()));
        map.put("log_pb", e.j());
        map.put("request_id", e.k());
        map.put("user_id", String.valueOf(u.a().b().c()));
    }

    public static void a(long j2, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("gift_id", Long.valueOf(j2));
        hashMap.put("gift_icon_url", str);
        c.a(d.a("ttlive_gift_icon_load_status"), 0, hashMap);
    }

    public static void a(long j2, long j3, Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", Long.valueOf(j3));
        hashMap.put("gift_id", Long.valueOf(j2));
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            hashMap.put("anchor_id", Long.valueOf(room.getOwnerUserId()));
        }
        if (th instanceof com.bytedance.android.live.a.a.a) {
            hashMap.put("error_code", Integer.valueOf(((com.bytedance.android.live.a.a.a) th).getErrorCode()));
        } else {
            hashMap.put("error_code", 0);
        }
        if (th != null) {
            hashMap.put("error_msg", th.getMessage());
        }
        c.a(d.a("ttlive_gift_send_status"), 1, 0, hashMap);
        c.a(d.b("ttlive_gift_send_status"), 1, hashMap);
        com.bytedance.android.livesdk.ab.a.a.a();
        com.bytedance.android.livesdk.ab.a.a.a(b.Gift.info, "ttlive_gift_send_status", hashMap);
    }

    public static void a(long j2, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("gift_id", Long.valueOf(j2));
        hashMap.put("gift_icon_url", str);
        hashMap.put("error_msg", str2);
        c.a(d.a("ttlive_gift_icon_load_status"), 1, hashMap);
        c.a(d.b("ttlive_gift_icon_load_status"), 1, hashMap);
        com.bytedance.android.livesdk.ab.a.a.a();
        com.bytedance.android.livesdk.ab.a.a.a(b.Gift.info, "ttlive_gift_icon_load_status", hashMap);
    }

    public static void a(long j2, long j3, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("gift_id", Long.valueOf(j2));
        a(hashMap);
        if (str2 != null) {
            hashMap.put("live_type", str2);
        }
        hashMap.put("event_module", "bottom_tab");
        if (m.a(str)) {
            str = "direct_gift_tab";
        }
        hashMap.put("gift_enter_from", str);
        c.a(d.a("ttlive_gift_send_status"), 0, j3, hashMap);
    }

    public static void a(long j2, int i2, long j3, int i3, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("asset_id", Long.valueOf(j2));
        hashMap.put("asset_type", Integer.valueOf(i2));
        hashMap.put("download_assets_from", Long.valueOf(j3));
        hashMap.put("error_code", Integer.valueOf(i3));
        hashMap.put("error_msg", str);
        c.a(d.a("ttlive_gift_asset_download_status"), 1, hashMap);
        c.a(d.b("ttlive_gift_asset_download_status"), 1, hashMap);
        com.bytedance.android.livesdk.ab.a.a.a();
        com.bytedance.android.livesdk.ab.a.a.a(b.Gift.info, "ttlive_gift_asset_download_status", hashMap);
    }
}
