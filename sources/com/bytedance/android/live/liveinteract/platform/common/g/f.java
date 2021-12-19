package com.bytedance.android.live.liveinteract.platform.common.g;

import com.bytedance.android.live.base.model.user.b;
import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.live.liveinteract.multilive.b.a;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.e;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class f {

    /* renamed from: a */
    public static long f11958a;

    /* renamed from: b */
    public static final HashMap<Long, String> f11959b = new HashMap<>();

    /* renamed from: c */
    public static final f f11960c = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(6533);
    }

    private static String a(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1143858661) {
            if (hashCode == 0 && str.equals("")) {
                return "guest_apply_anchor";
            }
            return "anchor_invite_guest";
        } else if (str.equals("liveEnd&turnOff")) {
            return "";
        } else {
            return "anchor_invite_guest";
        }
    }

    public static void a(String str, long j2, long j3, n nVar, String str2) {
        b bVar;
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        if (b2 != null) {
            bVar = b2.a();
        } else {
            bVar = null;
        }
        if (room == null) {
            throw new IllegalStateException("Required value was null.".toString());
        } else if (bVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("room_id", String.valueOf(room.getId()));
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            hashMap.put("channel_id", String.valueOf(room.getId()));
            hashMap.put("duration", String.valueOf((System.currentTimeMillis() - f11958a) / 1000));
            hashMap.put("live_type", "video_live");
            hashMap.put("connection_over_type", str);
            if (j3 >= 0) {
                hashMap.put("anchor_relationship", String.valueOf(j3));
            }
            hashMap.put("enter_method", e.d());
            hashMap.put("enter_from_merge", e.a());
            hashMap.put("action_type", e.e());
            hashMap.put("layout_setting", a.a(nVar).getFirst());
            hashMap.put("window_setting", a.a(nVar).getSecond());
            hashMap.put("guest_invite_type", a(str2));
            if (l.a((Object) str2, (Object) "liveEnd&turnOff")) {
                str2 = "";
            }
            hashMap.put("enter_from", str2);
            hashMap.put("guest_id", String.valueOf(j2));
            hashMap.put("permission_type", com.bytedance.android.live.liveinteract.multilive.a.d());
            b.a.a("livesdk_anchor_guest_connection_over").a((Map<String, String>) hashMap).b();
        } else {
            try {
                throw new IllegalStateException("Required value was null.".toString());
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static /* synthetic */ void a(String str, long j2, long j3, n nVar, String str2, int i2) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        if ((i2 & 4) != 0) {
            j3 = -1;
        }
        if ((i2 & 16) != 0) {
            str2 = "liveEnd&turnOff";
        }
        a(str, j2, j3, nVar, str2);
    }
}
