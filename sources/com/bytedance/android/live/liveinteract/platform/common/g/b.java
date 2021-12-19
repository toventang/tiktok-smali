package com.bytedance.android.live.liveinteract.platform.common.g;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.e;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.b.j;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.a.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.f.b.l;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static long f11947a;

    /* renamed from: b  reason: collision with root package name */
    public static long f11948b;

    /* renamed from: c  reason: collision with root package name */
    public static final b f11949c = new b();

    /* renamed from: d  reason: collision with root package name */
    private static long f11950d;

    /* renamed from: e  reason: collision with root package name */
    private static final HashSet<Long> f11951e = new HashSet<>();

    public enum a {
        POSITIVE_OVER("positive_over"),
        NEGATIVE_OVER("negative_over"),
        TIME_OUT("time_out");
        
        private final String type;

        public final String getType() {
            return this.type;
        }

        static {
            Covode.recordClassIndex(6526);
        }

        private a(String str) {
            this.type = str;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.platform.common.g.b$b  reason: collision with other inner class name */
    public enum EnumC0251b {
        PK_ICON("pk_icon"),
        PK_GUIDE("pk_guide");
        
        private final String value;

        public final String getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(6527);
        }

        private EnumC0251b(String str) {
            this.value = str;
        }
    }

    public enum c {
        ANCHOR("anchor"),
        MANUAL_PK("manual_pk");
        
        private final String type;

        public final String getType() {
            return this.type;
        }

        static {
            Covode.recordClassIndex(6528);
        }

        private c(String str) {
            this.type = str;
        }
    }

    private b() {
    }

    public static void a(boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        String str = b.a.a().aj;
        if (str == null) {
            str = "";
        }
        hashMap.put("request_from", str);
        hashMap.put("invitee_list", w.a(b.a.a().p));
        hashMap.put("anchor_type", b.a.a().q ? "inviter" : "invitee");
        a(hashMap);
        b(hashMap);
        a(true, false, (Map<String, String>) hashMap);
        hashMap.put("status", z2 ? "turn_on" : "close");
        hashMap.put("is_dont_show_again", z ? "1" : "0");
        a("livesdk_no_gift_reminder_click", hashMap);
    }

    public static void a(boolean z, int i2, EnumC0251b bVar) {
        HashMap hashMap = new HashMap();
        a(hashMap);
        b(hashMap);
        a(true, z, (Map<String, String>) hashMap);
        if (bVar != null) {
            hashMap.put("request_from", bVar.getValue());
        }
        hashMap.put("invitee_id", String.valueOf(b.a.a().f9941f));
        hashMap.put("invitee_status", String.valueOf(i2));
        long currentTimeMillis = System.currentTimeMillis();
        f11947a = currentTimeMillis;
        hashMap.put("time_stamp", String.valueOf(currentTimeMillis));
        w.a(hashMap, b.a.a().p, false);
        w.a(hashMap);
        a("livesdk_connection_invite", hashMap);
    }

    public static void a(boolean z, d dVar) {
        if (dVar != null) {
            HashMap hashMap = new HashMap();
            Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
            hashMap.put("connection_type", "manual_pk");
            int i2 = c.f11955a[b.a.a().p.ordinal()];
            int i3 = 2;
            hashMap.put("invitee_list", i2 != 1 ? i2 != 2 ? i2 != 3 ? "none" : "random_match" : "recommend" : "manual_follow");
            hashMap.put("user_type", z ? "anchor" : "user");
            hashMap.put("pk_id", String.valueOf(com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.b()));
            hashMap.put("channel_id", String.valueOf(b.a.a().f9940e));
            if (room != null) {
                String idStr = room.getIdStr();
                l.b(idStr, "");
                hashMap.put("room_id", idStr);
            }
            hashMap.put("win_status", String.valueOf(dVar.f23068c));
            if (room != null) {
                if (dVar.f23066a == room.getOwnerUserId()) {
                    i3 = 1;
                }
                hashMap.put("anchor_type", String.valueOf(i3));
            }
            a("connection_win_click", hashMap);
        }
    }

    public static void a(Map<String, String> map) {
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            l.b(idStr, "");
            map.put("room_id", idStr);
            map.put("enter_method", e.d());
            map.put("enter_from_merge", e.a());
            map.put("action_type", e.e());
            String str = b.a.a().x;
            if (!TextUtils.isEmpty(str)) {
                if (str == null) {
                    l.b();
                }
                map.put("request_id", str);
            }
        }
    }

    public static void a(boolean z, boolean z2, Map<String, String> map) {
        com.bytedance.android.live.liveinteract.match.b.b.b bVar;
        String valueOf;
        map.put("connection_type", "manual_pk");
        if (z2) {
            bVar = com.bytedance.android.live.liveinteract.match.b.b.a.f10675b;
        } else {
            bVar = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a;
        }
        Integer num = null;
        if (z) {
            j jVar = bVar.f10677a;
            if (jVar == null || jVar.f19274d <= 0) {
                valueOf = String.valueOf(LiveInteractBattleDurationSetting.INSTANCE.getValue());
            } else {
                j jVar2 = bVar.f10677a;
                if (jVar2 != null) {
                    num = Integer.valueOf(jVar2.f19274d);
                }
                valueOf = String.valueOf(num);
            }
        } else {
            j jVar3 = bVar.f10677a;
            if (jVar3 != null) {
                num = Integer.valueOf(jVar3.f19274d);
            }
            valueOf = String.valueOf(num);
        }
        map.put("pk_time", valueOf);
        if (z) {
            map.put("is_oncemore", String.valueOf(bVar.f10678b ? 1 : 0));
        }
        map.put("channel_id", String.valueOf(b.a.a().f9940e));
        map.put("pk_id", String.valueOf(bVar.b()));
    }

    static {
        Covode.recordClassIndex(6525);
    }

    public static void a() {
        HashMap hashMap = new HashMap();
        a(hashMap);
        hashMap.put("invitee_list", w.a(b.a.a().p));
        w.a(hashMap);
        a("livesdk_pk_icon_click", hashMap);
    }

    public static void b() {
        HashMap hashMap = new HashMap();
        a(hashMap);
        a(false, false, (Map<String, String>) hashMap);
        hashMap.put("right_user_id", String.valueOf(b.a.a().f9941f));
        a("livesdk_pk_transform", hashMap);
    }

    public static void c() {
        HashMap hashMap = new HashMap();
        a(hashMap);
        b(hashMap);
        a(true, false, (Map<String, String>) hashMap);
        f b2 = u.a().b();
        l.b(b2, "");
        long c2 = b2.c();
        hashMap.put("right_user_id", String.valueOf(b.a.a().f9941f));
        w.a(hashMap, b.a.a().p, false);
        hashMap.put("connection_inviter_id", String.valueOf(c2));
        hashMap.put("connection_invitee_id", String.valueOf(b.a.a().f9941f));
        a("livesdk_pk_oncemore_click", hashMap);
    }

    public static final void b(String str) {
        l.d(str, "");
        HashMap hashMap = new HashMap();
        hashMap.put("action_type", "click");
        hashMap.put("invite_entrance", str);
        com.bytedance.android.live.liveinteract.multilive.b.a.b(hashMap);
        a("livesdk_anchor_guest_connection_entrance_click", hashMap);
    }

    public static final void c(String str) {
        l.d(str, "");
        HashMap hashMap = new HashMap();
        a(hashMap);
        hashMap.put("open_method", str);
        a("livesdk_anchor_guest_connection_open", hashMap);
    }

    public static final void d(String str) {
        l.d(str, "");
        HashMap hashMap = new HashMap();
        a(hashMap);
        hashMap.put("end_reason", str);
        a("livesdk_anchor_guest_connection_close", hashMap);
    }

    public static void a(String str) {
        l.d(str, "");
        com.bytedance.android.live.core.c.a.a(4, "BattleWatchTAG", "logBattleWatchDuration, source = ".concat(String.valueOf(str)));
        long j2 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.o;
        if (j2 > 0) {
            HashMap hashMap = new HashMap();
            a(hashMap);
            a(false, false, (Map<String, String>) hashMap);
            hashMap.put("right_user_id", String.valueOf(b.a.a().f9941f));
            hashMap.put("watch_connection_duration", String.valueOf((System.currentTimeMillis() - j2) / 1000));
            a("livesdk_connection_watch_duration", hashMap);
        }
    }

    public static final void a(n nVar) {
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = "";
            }
            hashMap.put("room_id", idStr);
            hashMap.put("enter_method", e.d());
            hashMap.put("enter_from_merge", e.a());
            hashMap.put("action_type", e.e());
            User owner = room.getOwner();
            l.b(owner, "");
            FollowInfo followInfo = owner.getFollowInfo();
            l.b(followInfo, "");
            hashMap.put("anchor_relationship", String.valueOf(followInfo.getFollowStatus()));
            hashMap.put("layout_setting", com.bytedance.android.live.liveinteract.multilive.b.a.a(nVar).getFirst());
            hashMap.put("window_setting", com.bytedance.android.live.liveinteract.multilive.b.a.a(nVar).getSecond());
            a("livesdk_guest_connection_apply_withdraw", hashMap);
        }
    }

    public static void b(a aVar) {
        String str;
        l.d(aVar, "");
        long j2 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.p;
        if (j2 > 0) {
            HashMap hashMap = new HashMap();
            a(hashMap);
            a(true, false, (Map<String, String>) hashMap);
            b(hashMap);
            if (!TextUtils.isEmpty(b.a.a().aj)) {
                String str2 = b.a.a().aj;
                if (str2 == null) {
                    l.b();
                }
                hashMap.put("request_from", str2);
            }
            hashMap.put("right_user_id", String.valueOf(b.a.a().f9941f));
            hashMap.put("over_type", aVar.getType());
            if (com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.f10679c) {
                str = "inviter";
            } else {
                str = "invitee";
            }
            hashMap.put("anchor_type", str);
            hashMap.put("connection_time", String.valueOf((System.currentTimeMillis() - j2) / 1000));
            w.a(hashMap, b.a.a().p, false);
            if (b.a.a().R) {
                hashMap.put("is_live_end", "1");
            }
            a("livesdk_punish_end", hashMap);
        }
    }

    public static final void a(a aVar) {
        String str;
        String str2;
        String valueOf;
        String str3;
        String valueOf2;
        l.d(aVar, "");
        long j2 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.o;
        if (j2 > 0) {
            HashSet<Long> hashSet = f11951e;
            if (!hashSet.contains(Long.valueOf(com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.b()))) {
                hashSet.add(Long.valueOf(com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.b()));
                HashMap hashMap = new HashMap();
                a(hashMap);
                b(hashMap);
                a(true, false, (Map<String, String>) hashMap);
                hashMap.put("over_type", aVar.getType());
                hashMap.put("right_user_id", String.valueOf(b.a.a().f9941f));
                hashMap.put("connection_time", String.valueOf((System.currentTimeMillis() - j2) / 1000));
                w.a(hashMap, b.a.a().p, false);
                if (b.a.a().R) {
                    hashMap.put("is_live_end", "1");
                }
                if (!TextUtils.isEmpty(b.a.a().aj)) {
                    String str4 = b.a.a().aj;
                    if (str4 == null) {
                        l.b();
                    }
                    hashMap.put("request_from", str4);
                }
                if (com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.f10679c) {
                    str = "inviter";
                } else {
                    str = "invitee";
                }
                hashMap.put("anchor_type", str);
                f b2 = u.a().b();
                l.b(b2, "");
                long c2 = b2.c();
                String str5 = "0";
                if (com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.f10679c) {
                    Long l2 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.t.get(Long.valueOf(c2));
                    if (l2 == null || (str3 = String.valueOf(l2.longValue())) == null) {
                        str3 = str5;
                    }
                    hashMap.put("inviter_pk_score", str3);
                    Long l3 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.t.get(Long.valueOf(b.a.a().f9941f));
                    if (!(l3 == null || (valueOf2 = String.valueOf(l3.longValue())) == null)) {
                        str5 = valueOf2;
                    }
                    hashMap.put("invitee_pk_score", str5);
                } else {
                    Long l4 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.t.get(Long.valueOf(c2));
                    if (l4 == null || (str2 = String.valueOf(l4.longValue())) == null) {
                        str2 = str5;
                    }
                    hashMap.put("invitee_pk_score", str2);
                    Long l5 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.t.get(Long.valueOf(b.a.a().f9941f));
                    if (!(l5 == null || (valueOf = String.valueOf(l5.longValue())) == null)) {
                        str5 = valueOf;
                    }
                    hashMap.put("inviter_pk_score", str5);
                }
                d dVar = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.f10682f;
                if (dVar != null) {
                    hashMap.put("win_status", String.valueOf(dVar.f23068c));
                }
                w.a(hashMap);
                a("livesdk_pk_end", hashMap);
            }
        }
    }

    public static void b(Map<String, String> map) {
        Long l2;
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            l2 = Long.valueOf(room.getOwnerUserId());
        } else {
            l2 = null;
        }
        f b2 = u.a().b();
        l.b(b2, "");
        long c2 = b2.c();
        if (l2 != null && l2.longValue() == c2) {
            if (b.a.a().q) {
                map.put("connection_inviter_id", String.valueOf(c2));
                map.put("connection_invitee_id", String.valueOf(b.a.a().f9941f));
            } else {
                map.put("connection_inviter_id", String.valueOf(b.a.a().f9941f));
                map.put("connection_invitee_id", String.valueOf(c2));
            }
            if (com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.f10679c) {
                map.put("pk_inviter_id", String.valueOf(c2));
                map.put("pk_invitee_id", String.valueOf(b.a.a().f9941f));
                return;
            }
            map.put("pk_inviter_id", String.valueOf(b.a.a().f9941f));
            map.put("pk_invitee_id", String.valueOf(c2));
        }
    }

    public static void a(String str, Map<String, String> map) {
        b.a.a(str).a().a(map).b();
    }

    public static final void a(c cVar, boolean z) {
        String str;
        l.d(cVar, "");
        HashMap hashMap = new HashMap();
        a(hashMap);
        b(hashMap);
        hashMap.put("connection_type", cVar.getType());
        if (cVar == c.MANUAL_PK) {
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put("is_oncemore", str);
        }
        w.a(hashMap, b.a.a().p, false);
        a("livesdk_connection_invited_received", hashMap);
    }

    public static final void b(String str, long j2) {
        String str2 = "";
        l.d(str, str2);
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            String idStr = room.getIdStr();
            if (idStr != null) {
                str2 = idStr;
            }
            hashMap.put("room_id", str2);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            hashMap.put("action_type", str);
            hashMap.put("anchor_relationship", String.valueOf(j2));
            a("livesdk_anchor_refuse_guest_connection", hashMap);
        }
    }

    public static void a(EnumC0251b bVar, boolean z) {
        String str;
        l.d(bVar, "");
        f b2 = u.a().b();
        l.b(b2, "");
        long c2 = b2.c();
        HashMap hashMap = new HashMap();
        a(hashMap);
        b(hashMap);
        hashMap.put("request_from", bVar.getValue());
        w.a(hashMap, b.a.a().p, false);
        String str2 = "1";
        if (z) {
            str = str2;
        } else {
            str = "0";
        }
        hashMap.put("is_effective", str);
        hashMap.put("channel_id", String.valueOf(b.a.a().f9940e));
        hashMap.put("pk_inviter_id", String.valueOf(c2));
        hashMap.put("pk_invitee_id", String.valueOf(b.a.a().f9941f));
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
            l.b(roomAuthStatus, "");
            if (!roomAuthStatus.isEnableGift()) {
                str2 = "0";
            }
            hashMap.put("is_from_gift_permission", str2);
        }
        a("livesdk_pk_click", hashMap);
    }

    public static void b(boolean z, d dVar) {
        String str;
        String str2;
        if (dVar != null) {
            HashMap hashMap = new HashMap();
            Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
            hashMap.put("connection_type", "manual_pk");
            int i2 = c.f11956b[b.a.a().p.ordinal()];
            int i3 = 2;
            if (i2 == 1) {
                str = "manual_follow";
            } else if (i2 == 2) {
                str = "recommend";
            } else if (i2 != 3) {
                str = "none";
            } else {
                str = "random_match";
            }
            hashMap.put("invitee_list", str);
            if (z) {
                str2 = "anchor";
            } else {
                str2 = "user";
            }
            hashMap.put("user_type", str2);
            hashMap.put("pk_id", String.valueOf(com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.b()));
            hashMap.put("channel_id", String.valueOf(b.a.a().f9940e));
            if (room != null) {
                String idStr = room.getIdStr();
                l.b(idStr, "");
                hashMap.put("room_id", idStr);
            }
            hashMap.put("win_status", String.valueOf(dVar.f23068c));
            if (room != null) {
                if (dVar.f23066a == room.getOwnerUserId()) {
                    i3 = 1;
                }
                hashMap.put("anchor_type", String.valueOf(i3));
            }
            a("livesdk_connection_win_show", hashMap);
        }
    }

    public static final void a(String str, long j2) {
        l.d(str, "");
        HashMap hashMap = new HashMap();
        a(hashMap);
        hashMap.put("request_page", str);
        hashMap.put("anchor_relationship", String.valueOf(j2));
        a("livesdk_guest_connection_icon_click", hashMap);
    }

    public static void b(boolean z, boolean z2) {
        String str;
        HashMap hashMap = new HashMap();
        a(hashMap);
        b(hashMap);
        a(true, z, (Map<String, String>) hashMap);
        hashMap.put("inviter_id", String.valueOf(b.a.a().f9941f));
        if (z2) {
            str = "accept";
        } else {
            str = "reject";
        }
        hashMap.put("selection", str);
        w.a(hashMap, b.a.a().p, false);
        long currentTimeMillis = System.currentTimeMillis();
        f11950d = currentTimeMillis;
        hashMap.put("time_stamp", String.valueOf(currentTimeMillis));
        hashMap.put("show_to_decide_dur", String.valueOf(f11950d - f11948b));
        w.a(hashMap);
        a("livesdk_connection_invited", hashMap);
    }
}
