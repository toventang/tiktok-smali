package com.bytedance.android.livesdk.wishlist.c;

import android.text.TextUtils;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.model.message.b.j;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.a.e;
import com.bytedance.android.livesdkapi.depend.model.live.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.f.b.l;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public final class b {
    static {
        Covode.recordClassIndex(13478);
    }

    public static final void a() {
        long j2;
        boolean z;
        p linkMicInfo;
        e eVar;
        j jVar;
        f b2;
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        long j3 = 0;
        if (room != null) {
            j2 = room.getOwnerUserId();
        } else {
            j2 = 0;
        }
        u a2 = u.a();
        if (!(a2 == null || (b2 = a2.b()) == null)) {
            j3 = b2.c();
        }
        boolean z2 = false;
        if (j2 == j3) {
            z = true;
        } else {
            z = false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!z) {
            Room room2 = (Room) DataChannelGlobal.f34575d.b(ac.class);
            if (!(room2 == null || (linkMicInfo = room2.getLinkMicInfo()) == null || (eVar = linkMicInfo.f23169e) == null || (jVar = eVar.f23074c) == null || jVar.f19275e <= 0)) {
                z2 = true;
            }
            if (z2) {
                linkedHashMap.put("connection_type", "manual_pk");
            } else if (room2 != null) {
                if (room2.getLinkMicInfo() != null) {
                    linkedHashMap.put("connection_type", "anchor");
                } else if (room2 != null && room2.isWithLinkMic()) {
                    linkedHashMap.put("connection_type", "audience");
                }
            }
        }
        b.a.a("livesdk_wishlist_entrance_show").a().a(a(true)).a((Map<String, String>) linkedHashMap).b();
    }

    public static final void a(int i2) {
        b.a.a("livesdk_wishlist_all_finished").a().a("support_user", i2).b();
    }

    public static final Map<String, String> a(boolean z) {
        long j2;
        boolean z2;
        String str;
        String str2;
        f b2;
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        long j3 = 0;
        if (room != null) {
            j2 = room.getOwnerUserId();
        } else {
            j2 = 0;
        }
        u a2 = u.a();
        if (!(a2 == null || (b2 = a2.b()) == null)) {
            j3 = b2.c();
        }
        HashMap hashMap = new HashMap();
        if (j2 == j3) {
            z2 = true;
            str = "anchor";
        } else {
            z2 = false;
            str = "user";
        }
        hashMap.put("user_type", str);
        hashMap.put("user_id", String.valueOf(j3));
        String b3 = b(z);
        com.bytedance.android.live.liveinteract.api.b bVar = (com.bytedance.android.live.liveinteract.api.b) a.a(com.bytedance.android.live.liveinteract.api.b.class);
        if (bVar == null || (str2 = bVar.getCurrentInviteeList()) == null) {
            str2 = "";
        }
        hashMap.put("connection_type", b3);
        if (z2 && (!l.a((Object) b3, (Object) "normal")) && !TextUtils.isEmpty(str2)) {
            hashMap.put("invitee_list", str2);
        }
        return hashMap;
    }

    private static final String b(boolean z) {
        long j2;
        long j3;
        f b2;
        if (z) {
            Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
            if (room != null) {
                j2 = room.getOwnerUserId();
            } else {
                j2 = 0;
            }
            u a2 = u.a();
            if (a2 == null || (b2 = a2.b()) == null) {
                j3 = 0;
            } else {
                j3 = b2.c();
            }
            if (!(j2 == j3 || room == null || room.getLinkMicInfo() == null)) {
                p linkMicInfo = room.getLinkMicInfo();
                l.b(linkMicInfo, "");
                if (linkMicInfo.f23165a <= 0 || linkMicInfo.f23166b <= 0) {
                    if (linkMicInfo.f23168d == null || linkMicInfo.f23168d.size() <= 0) {
                        return "normal";
                    }
                    return "audience";
                } else if (linkMicInfo.f23169e != null) {
                    return "manual_pk";
                } else {
                    return "anchor";
                }
            }
            return "normal";
        }
        com.bytedance.android.live.liveinteract.api.b bVar = (com.bytedance.android.live.liveinteract.api.b) a.a(com.bytedance.android.live.liveinteract.api.b.class);
        if (bVar != null) {
            if (bVar.isBattling()) {
                return "manual_pk";
            }
            if (bVar.getLinkedGuestNum() > 0) {
                return "audience";
            }
            if (bVar.isInCoHost()) {
                return "anchor";
            }
        }
        return "normal";
    }
}
