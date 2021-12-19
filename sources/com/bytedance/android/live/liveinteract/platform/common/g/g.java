package com.bytedance.android.live.liveinteract.platform.common.g;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.live.liveinteract.multilive.b.a;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.e;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static long f11961a;

    /* renamed from: b  reason: collision with root package name */
    public static String f11962b = "";

    /* renamed from: c  reason: collision with root package name */
    public static final g f11963c = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(6534);
    }

    public static final void a(String str, n nVar) {
        l.d(str, "");
        if (f11961a > 0) {
            b(str, nVar);
        }
    }

    private static void b(String str, n nVar) {
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            l.b(idStr, "");
            hashMap.put("room_id", idStr);
            hashMap.put("duration", String.valueOf((System.currentTimeMillis() - f11961a) / 1000));
            hashMap.put("live_type", "video_live");
            hashMap.put("connection_over_type", str);
            User owner = room.getOwner();
            l.b(owner, "");
            FollowInfo followInfo = owner.getFollowInfo();
            l.b(followInfo, "");
            hashMap.put("anchor_relationship", String.valueOf(followInfo.getFollowStatus()));
            hashMap.put("guest_invite_type", f11962b);
            hashMap.put("enter_method", e.d());
            hashMap.put("enter_from_merge", e.a());
            hashMap.put("action_type", e.e());
            hashMap.put("layout_setting", a.a(nVar).getFirst());
            hashMap.put("window_setting", a.a(nVar).getSecond());
            hashMap.put("permission_type", com.bytedance.android.live.liveinteract.multilive.a.d());
            b.a.a("livesdk_guest_connection_over").a((Map<String, String>) hashMap).b();
        }
        f11961a = 0;
    }
}
