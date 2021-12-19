package com.bytedance.android.livesdk.watch.chatroom;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.ab.c.a;
import com.bytedance.android.livesdk.ab.c.c;
import com.bytedance.android.livesdk.ab.c.h;
import com.bytedance.android.livesdk.ab.c.j;
import com.bytedance.android.livesdk.ab.e;
import com.bytedance.android.livesdk.chatroom.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.f.b.l;
import java.util.LinkedHashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f22423a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(13239);
    }

    private static String a(Room room) {
        if (room.isLiveTypeAudio()) {
            return "audio_live";
        }
        return "video_type";
    }

    private static String b(Room room) {
        FollowInfo followInfo;
        User owner = room.getOwner();
        if (owner == null || (followInfo = owner.getFollowInfo()) == null) {
            return "0";
        }
        long followStatus = followInfo.getFollowStatus();
        if (followStatus == 1 || followStatus == 2) {
            return "1";
        }
        return "0";
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.bytedance.android.livesdkapi.depend.model.live.Room r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 145
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.watch.chatroom.b.a(com.bytedance.android.livesdkapi.depend.model.live.Room, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static void a(LinkedHashMap<String, String> linkedHashMap, Room room, String str, String str2, String str3) {
        String str4;
        a aVar;
        String str5;
        c cVar;
        String str6;
        l.d(linkedHashMap, "");
        l.d(room, "");
        l.d(str, "");
        l.d(str3, "");
        if (room.isLiveTypeAudio()) {
            str4 = "audio_live";
        } else {
            str4 = "video_live";
        }
        linkedHashMap.put("live_type", str4);
        String str7 = "1";
        linkedHashMap.put("growth_deepevent", str7);
        linkedHashMap.put("live_window_mode", "");
        h hVar = (h) DataChannelGlobal.f34575d.b(j.class);
        if (!(hVar == null || (cVar = hVar.f13529d) == null || (str6 = cVar.f13483d) == null)) {
            linkedHashMap.put("live_window_mode", str6);
        }
        if (!TextUtils.isEmpty(str3)) {
            linkedHashMap.put("request_page", str3);
        }
        linkedHashMap.put("room_type", a(room));
        linkedHashMap.put("action_type", "click");
        h hVar2 = (h) DataChannelGlobal.f34575d.b(j.class);
        if (!(hVar2 == null || (aVar = hVar2.f13530e) == null || (str5 = aVar.n) == null)) {
            linkedHashMap.put("action_type", str5);
        }
        String requestId = room.getRequestId();
        if (requestId == null) {
            requestId = "";
        }
        linkedHashMap.put("request_id", requestId);
        User owner = room.getOwner();
        l.b(owner, "");
        FollowInfo followInfo = owner.getFollowInfo();
        l.b(followInfo, "");
        linkedHashMap.put("follow_status", String.valueOf(followInfo.getFollowStatus()));
        linkedHashMap.put("is_fans", b(room));
        User owner2 = room.getOwner();
        l.b(owner2, "");
        linkedHashMap.put("anchor_id", String.valueOf(owner2.getId()));
        User owner3 = room.getOwner();
        l.b(owner3, "");
        linkedHashMap.put("to_user_id", String.valueOf(owner3.getId()));
        linkedHashMap.put("room_id", String.valueOf(room.getId()));
        try {
            d a2 = d.a();
            l.b(a2, "");
            String e2 = a2.e();
            l.b(e2, "");
            linkedHashMap.put("enter_live_method", e2);
        } catch (Exception unused) {
            linkedHashMap.put("enter_live_method", "");
        }
        linkedHashMap.put("enter_from_merge", str);
        if (str2 != null) {
            linkedHashMap.put("enter_method", str2);
        }
        linkedHashMap.put("live_reason", "");
        String str8 = "homepage_hot";
        if (!l.a((Object) str, (Object) str8)) {
            if (e.a().length() > 0) {
                str8 = e.a();
            }
            linkedHashMap.put("enter_from_merge", str8);
        } else {
            linkedHashMap.put("enter_from_merge", str8);
        }
        f fVar = f.a.f23366a;
        l.b(fVar, "");
        EnterRoomLinkSession a3 = fVar.a();
        l.b(a3, "");
        if (!a3.f23354b.f23299c.aw) {
            str7 = "0";
        }
        linkedHashMap.put("is_return", str7);
    }
}
