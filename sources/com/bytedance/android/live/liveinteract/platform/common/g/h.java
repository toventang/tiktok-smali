package com.bytedance.android.live.liveinteract.platform.common.g;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.aj;
import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.live.liveinteract.api.k;
import com.bytedance.android.live.liveinteract.api.m;
import com.bytedance.android.live.liveinteract.match.b.b.c;
import com.bytedance.android.live.liveinteract.multilive.b.a;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.c.g;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveMtInteractInviterCancelEnableSetting;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import java.util.Map;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f11964a;

    /* renamed from: b  reason: collision with root package name */
    public static String f11965b;

    /* renamed from: c  reason: collision with root package name */
    public static long f11966c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f11967d;

    /* renamed from: e  reason: collision with root package name */
    public static long f11968e;

    /* renamed from: f  reason: collision with root package name */
    public static long f11969f;

    /* renamed from: g  reason: collision with root package name */
    public static long f11970g;

    static {
        Covode.recordClassIndex(6535);
    }

    public static String a(int i2) {
        return i2 == 0 ? "multi_live_apply" : "multi_live_accept";
    }

    public static void a(DataChannel dataChannel) {
        HashMap hashMap = new HashMap();
        hashMap.put("connection_type", "anchor");
        b.a.a("connection_click").a((Map<String, String>) hashMap).d("live_detail").b("live").c("click").a(dataChannel).b();
    }

    public static void a(boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", z ? "connecton_icon" : "anchor_host_notice");
        hashMap.put("notice_type", z2 ? "random_notice" : "normal_notice");
        if (z2) {
            hashMap.put("connection_type", "anchor");
            hashMap.put("invitee_list", "random_match");
        }
        a.a(hashMap, (n) null);
        b("guest_connection_anchor", hashMap, "show");
    }

    public static void a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("request_page", str);
        b("guest_connection", hashMap, "show");
    }

    public static void a(String str, String str2, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("request_page", str);
        hashMap.put("notice_type", z ? "random_notice" : "normal_notice");
        hashMap.put("enter_from", str2);
        a("connection_icon_click", hashMap);
    }

    public static void a(boolean z, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("is_open", String.valueOf(z ? 1 : 0));
        hashMap.put("enter_from", str);
        a("anchor_connection_recommend_open", hashMap);
    }

    public static void a(m mVar, long j2, long j3, String str, long j4, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("connection_type", "anchor");
        w.a(hashMap, mVar, true);
        long currentTimeMillis = System.currentTimeMillis();
        f11969f = currentTimeMillis;
        hashMap.put("time_stamp", String.valueOf(currentTimeMillis));
        if (mVar == m.FOLLOW_INVITE || mVar == m.RECOMMEND_INVITE) {
            hashMap.put("show_to_decide_dur", String.valueOf(f11969f - f11970g));
        }
        hashMap.put("inviter_id", String.valueOf(j2));
        hashMap.put("invitee_id", String.valueOf(j3));
        hashMap.put("selection", str);
        hashMap.put("invited_room_id", String.valueOf(j4));
        hashMap.put("is_turn_off_invitation", z ? "1" : "0");
        String str2 = b.a.a().x;
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("request_id", str2);
        }
        a("connection_invited", hashMap);
    }

    public static void a(String str, Room room, int i2, com.bytedance.android.livesdk.chatroom.interact.model.h hVar) {
        if (room != null && room.getOwner() != null) {
            int i3 = (hVar == null || hVar.f15621f != 0) ? 0 : 1;
            String str2 = i2 == 1 ? "mutual_follow" : "recommend";
            HashMap hashMap = new HashMap();
            hashMap.put("connection_type", "anchor");
            hashMap.put("invitee_list", str2);
            hashMap.put("invitee_status", String.valueOf(i3));
            hashMap.put("invited_room_id", room.getIdStr());
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("request_id", str);
            }
            com.bytedance.android.live.liveinteract.api.a.b a2 = b.a.a();
            if (a2.V != null) {
                hashMap.put("enter_from", a2.V);
            }
            a("connection_invite_show", hashMap);
        }
    }

    public static void a(m mVar, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("invitee_list", w.a(mVar));
        hashMap.put("enter_from", b.a.a().V);
        hashMap.put("click_position", str);
        hashMap.put("selection", str2);
        hashMap.put("event_type", String.valueOf(b.a.a().p.getType()));
        a("cancel_connection_popup_click", hashMap);
    }

    public static void a(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("choose_type", z ? "dismiss" : "contact_us");
        b("guest_connection_underage_popup", hashMap, "click");
    }

    public static void a(String str, int i2) {
        String str2;
        HashMap hashMap = new HashMap();
        if (b.a.a().p == m.FOLLOW_INVITE) {
            str2 = "mutual_follow";
        } else {
            str2 = "recommend";
        }
        hashMap.put("invitee_list", str2);
        if (!(com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.a() != c.NORMAL)) {
            hashMap.put("connection_type", "anchor");
        } else {
            hashMap.put("connection_type", "manual_pk");
        }
        hashMap.put("selection", str);
        hashMap.put("is_dont_suggest", String.valueOf(i2));
        a("cancel_connection_select", hashMap);
    }

    public static void a(Room room, m mVar, String str) {
        com.bytedance.android.live.liveinteract.api.a.b a2 = b.a.a();
        HashMap hashMap = new HashMap();
        hashMap.put("connection_type", "anchor");
        w.a(hashMap, mVar, true);
        f11968e = System.currentTimeMillis();
        if (mVar != m.RANDOM_LINK_MIC_INVITE) {
            hashMap.put("invitee_id", room.getOwner().getIdStr());
            hashMap.put("invited_room_id", room.getIdStr());
            hashMap.put("time_stamp", String.valueOf(f11968e));
        }
        w.a(hashMap, mVar, true);
        hashMap.put("invite_scene", a());
        if (!TextUtils.isEmpty(a2.V)) {
            hashMap.put("enter_from", a2.V);
        }
        String str2 = a2.x;
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("request_id", str2);
        } else {
            hashMap.put("request_id", str);
        }
        hashMap.put("connection_inviter_id", String.valueOf(u.a().b().c()));
        hashMap.put("connection_invitee_id", String.valueOf(b.a.a().f9941f));
        w.a(hashMap);
        a("connection_invite", hashMap);
    }

    public static void a(String str, Map<String, String> map, String str2) {
        b.a.a(str).a().d(str2).a(map).b();
    }

    public static void a(String str, long j2) {
        b.a.a("livesdk_guest_connection_icon_show").a().a("request_page", str).a("anchor_relationship", j2).b();
    }

    public static void b() {
        String str;
        com.bytedance.android.livesdk.ab.b c2 = b.a.a("livesdk_guest_linkmic_ban").a().c("show");
        if (p.f()) {
            str = "anchor";
        } else {
            str = "guest";
        }
        c2.a("user_type", str).b();
    }

    public static String a() {
        boolean a2 = aj.a(((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).getCurrentLinkMode(), 2);
        boolean isInMultiGuest = ((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).isInMultiGuest();
        if (!a2) {
            return "guest_close";
        }
        if (isInMultiGuest) {
            return "guest";
        }
        return "guest_open";
    }

    public static void c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        a("guest_connection_unable_connect_toast", hashMap);
    }

    public static void b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("request_page", str);
        b("guest_connection", hashMap, "click");
    }

    public static g a(Room room) {
        com.bytedance.android.live.liveinteract.api.a.b a2 = b.a.a();
        g gVar = new g();
        gVar.a(a2.p.getType());
        if (a2.q) {
            gVar.f13515a = room.getOwner().getId();
            gVar.f13516b = a2.f9941f;
        } else {
            gVar.f13515a = a2.f9941f;
            gVar.f13516b = room.getOwner().getId();
        }
        gVar.f13521g = a2.f9940e;
        return gVar;
    }

    public static void a(n nVar) {
        String str;
        boolean booleanValue = com.bytedance.android.livesdk.ap.a.ck.a().booleanValue();
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_guest_connection_status").a();
        if (booleanValue) {
            str = "open";
        } else {
            str = "close";
        }
        a2.a("status", str).a("layout_setting", a.a(nVar).getFirst()).a("window_setting", a.a(nVar).getSecond()).b();
    }

    public static void a(String str, Map<String, String> map) {
        b.a.a(str).a().a(map).b();
    }

    public static void a(int i2, String str) {
        b.a.a("livesdk_appeal_popup_window_click").a("request_page", a(i2)).a("click_type", str).a().b();
    }

    public static void a(long j2, n nVar) {
        b.a.a("livesdk_anchor_invite_guest_connection").a().a("enter_from", com.bytedance.android.live.liveinteract.multiguest.a.c.c.a(j2)).a("live_type", "video_live").a("layout_setting", a.a(nVar).getFirst()).a("window_setting", a.a(nVar).getSecond()).b();
    }

    public static void b(String str, Map<String, String> map, String str2) {
        b.a.a(str).a().a(map).f(str2).b();
    }

    public static void a(int i2, int i3, long j2, int i4, n nVar) {
        String str;
        HashMap hashMap = new HashMap();
        if (i2 == 1) {
            str = "video";
        } else {
            str = "voice";
        }
        hashMap.put("guest_connection_type", str);
        hashMap.put("weight_decay_type", String.valueOf(i3));
        hashMap.put("anchor_relationship", String.valueOf(j2));
        if (!TextUtils.isEmpty(f11965b)) {
            hashMap.put("request_page", f11965b);
        }
        hashMap.put("connected_guest_cnt", String.valueOf(i4));
        hashMap.put("layout_setting", a.a(nVar).getFirst());
        hashMap.put("window_setting", a.a(nVar).getSecond());
        a("guest_connection_apply", hashMap, "live_take_detail");
    }

    public static void a(int i2, Room room, n nVar, boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        int i3 = Build.VERSION.SDK_INT;
        if (room == null || room.getMosaicStatus() == 1 || i2 != 4 || (!b.a.a().a(k.CONNECTION_START) && (b.a.a().b() != k.INVITING || !LiveMtInteractInviterCancelEnableSetting.INSTANCE.getValue()))) {
            str = "connection";
        } else {
            str = "cancel";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("click_type", str);
        hashMap.put("layout_setting", a.a(nVar).getFirst());
        hashMap.put("window_setting", a.a(nVar).getSecond());
        if (z) {
            str2 = "connection_icon";
        } else {
            str2 = "anchor_host_notice";
        }
        hashMap.put("enter_from", str2);
        if (z2) {
            str3 = "random_notice";
        } else {
            str3 = "normal_notice";
        }
        hashMap.put("notice_type", str3);
        if (z2) {
            hashMap.put("connection_type", "anchor");
            hashMap.put("invitee_list", "random_match");
        }
        b("guest_connection_anchor", hashMap, "click");
    }
}
