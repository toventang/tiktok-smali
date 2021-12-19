package com.bytedance.android.live.liveinteract.platform.common.g;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.e;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.c.e;
import com.bytedance.android.livesdk.ab.i;
import com.bytedance.android.livesdk.b.a.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f11946a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(6524);
    }

    public static final void a(String str) {
        l.d(str, "");
        a(str, "");
    }

    public static final void b(String str) {
        l.d(str, "");
        b(str, "");
    }

    private static void b(Map<String, Object> map) {
        d a2 = d.a();
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = (com.bytedance.android.live.liveinteract.multiguest.opt.a.a) e.f10014a.a("MULTI_GUEST_DATA_HOLDER");
        l.b(a2, "");
        map.put("opened", a2.n);
        map.put("anchorLinkMicId", a2.f14184e);
        map.put("linkMicId", a2.f14185f);
        Config.Vendor fromValue = Config.Vendor.fromValue(a2.f14186g);
        l.b(fromValue, "");
        map.put("linkMicVendor", Integer.valueOf(fromValue.getValue()));
        if (aVar == null || !aVar.f11298h) {
            map.put("rtcExtInfo", a2.f14187h);
            return;
        }
        String str = aVar.r;
        if (str == null) {
            str = a2.f14187h;
        }
        map.put("rtcExtInfo", str);
    }

    private static void a(Map<String, ? extends Object> map) {
        l.d(map, "");
        i.b().a("ttlive_interact", map);
    }

    public static final void a(String str, Room room) {
        l.d(str, "");
        l.d(room, "");
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        a(hashMap, room);
        a(hashMap);
    }

    public static final void b(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        hashMap.put("extra", str2);
        b(hashMap);
        a(hashMap);
    }

    public static final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        hashMap.put("extra", str2);
        a(hashMap);
    }

    public static final void a(String str, boolean z) {
        l.d(str, "");
        a(str, z, "");
    }

    private static void a(Map<String, Object> map, Room room) {
        Integer num;
        map.put("roomId", Long.valueOf(room.getId()));
        map.put("owner_user_id", Long.valueOf(room.getOwnerUserId()));
        User owner = room.getOwner();
        if (owner != null) {
            num = Integer.valueOf(owner.getLinkMicStats());
        } else {
            num = null;
        }
        map.put("link_mic_stats", num);
        map.put("with_linkmic", Boolean.valueOf(room.isWithLinkMic()));
        map.put("linkmic_info", e.a.f9628b.b(room.getLinkMicInfo()));
    }

    private static void a(boolean z, Map<String, Object> map) {
        String str;
        b a2 = b.a.a();
        if (!z) {
            str = "audience";
        } else if (a2.q) {
            str = "inviter";
        } else {
            str = "invitee";
        }
        map.put("role", str);
        map.put("inviteType", Integer.valueOf(a2.p.getType()));
        map.put("channelId", Long.valueOf(a2.f9940e));
        map.put("fromRoomId", Long.valueOf(a2.f9943h));
        map.put("currentRoomId", Long.valueOf(a2.am));
        map.put("linkMicId", a2.L);
        map.put("guestLinkMicId", a2.M);
        map.put("guestUserId", Long.valueOf(a2.f9941f));
        map.put("linkMicVendor", Integer.valueOf(a2.d().getValue()));
        map.put("rtcExtInfo", a2.v);
        map.put("duration", Integer.valueOf(a2.r));
    }

    public static final void a(String str, boolean z, String str2) {
        l.d(str, "");
        l.d(str2, "");
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        hashMap.put("extra", str2);
        a(z, hashMap);
        a(hashMap);
    }
}
