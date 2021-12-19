package com.bytedance.android.livesdk.usercard;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.b;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.c.e;
import com.bytedance.android.livesdk.chatroom.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    Context f21881a;

    /* renamed from: b  reason: collision with root package name */
    Room f21882b;

    /* renamed from: c  reason: collision with root package name */
    boolean f21883c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, String> f21884d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private long f21885e;

    static {
        Covode.recordClassIndex(12884);
    }

    public final void a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rid", this.f21882b.getId());
            jSONObject.put("request_id", this.f21882b.getRequestId());
            jSONObject.put("log_pb", this.f21882b.getLog_pb());
        } catch (Exception unused) {
        }
    }

    public w(Context context, Room room, long j2) {
        this.f21881a = context;
        this.f21882b = room;
        this.f21885e = j2;
    }

    public final void a(boolean z, long j2, String str, boolean z2, int i2, boolean z3, long j3, boolean z4) {
        String str2;
        String str3;
        Room room;
        String str4 = str;
        e eVar = new e("", this.f21885e);
        if (TextUtils.isEmpty(str4)) {
            str4 = null;
        }
        if (z2) {
            if (z3) {
                eVar.f13502a = "live_anchor_c_anchor";
                str4 = "live_anchor_c_anchor";
            } else {
                eVar.f13502a = "live_anchor_c_audience";
            }
            if (TextUtils.isEmpty(str4)) {
                eVar.f13502a = "live_anchor_c_audience";
                str4 = "live_anchor_c_audience";
            }
        } else if (i2 != 1) {
            eVar.f13502a = "live_audience_c_anchor";
            str4 = "live_audience_c_anchor";
        } else {
            if (z3) {
                eVar.f13502a = "live_audience_c_anchor";
            } else {
                eVar.f13502a = "live_audience_c_audience";
            }
            if (TextUtils.isEmpty(str4)) {
                eVar.f13502a = "live_audience_c_audience";
                str4 = "live_audience_c_audience";
            }
        }
        eVar.f13505d = z;
        HashMap hashMap = new HashMap();
        if (z3) {
            hashMap.put("invitee_list", ((b) a.a(b.class)).getCurrentInviteeList());
        }
        String valueOf = String.valueOf(j2);
        com.bytedance.android.live.j.a aVar = (com.bytedance.android.live.j.a) a.a(com.bytedance.android.live.j.a.class);
        if (!(aVar == null || (room = this.f21882b) == null || !aVar.isMicRoomForRoom(room) || this.f21882b.officialChannelInfo == null)) {
            if (this.f21882b.officialChannelInfo.f18978a.getId() == j2) {
                if (aVar.isMicAudience()) {
                    str4 = "carousel_audience_c_official_id";
                } else {
                    str4 = "loyal_audience_c_official_id";
                }
                valueOf = String.valueOf(this.f21882b.officialChannelInfo.f18978a.getId());
            } else if (j2 == this.f21882b.getOwner().getId()) {
                if (aVar.isMicAudience()) {
                    str4 = "carousel_audience_c_anchor";
                } else {
                    str4 = "loyal_audience_c_anchor";
                }
                valueOf = String.valueOf(this.f21882b.officialChannelInfo.f18978a.getId());
            }
        }
        hashMap.put("to_user_id", valueOf);
        hashMap.put("request_page", str4);
        hashMap.put("click_user_position", "profile_card");
        if (z) {
            hashMap.put("growth_deepevent", "1");
            long ownerUserId = this.f21882b.getOwnerUserId();
            long j4 = b.a.a().f9941f;
            if (((com.bytedance.android.live.liveinteract.api.b) a.a(com.bytedance.android.live.liveinteract.api.b.class)).isInCoHost()) {
                if (j2 == this.f21882b.getOwnerUserId()) {
                    hashMap.put("anchor_type", "current");
                }
                if (z3) {
                    hashMap.put("anchor_type", "opposite");
                }
                hashMap.put("connection_type", "anchor");
                hashMap.put("channel_id", String.valueOf(b.a.a().f9940e));
                hashMap.put("invitee_list", ((com.bytedance.android.live.liveinteract.api.b) a.a(com.bytedance.android.live.liveinteract.api.b.class)).getCurrentInviteeList());
                if (b.a.a().q) {
                    hashMap.put("connection_inviter_id", String.valueOf(ownerUserId));
                    hashMap.put("connection_invitee_id", String.valueOf(j4));
                } else {
                    hashMap.put("connection_invitee_id", String.valueOf(ownerUserId));
                    hashMap.put("connection_inviter_id", String.valueOf(j4));
                }
            }
            if (((com.bytedance.android.live.liveinteract.api.b) a.a(com.bytedance.android.live.liveinteract.api.b.class)).isRoomInBattle()) {
                hashMap.put("connection_type", "manual_pk");
                hashMap.put("pk_id", String.valueOf(b.a.a().ai));
                if (((com.bytedance.android.live.liveinteract.api.b) a.a(com.bytedance.android.live.liveinteract.api.b.class)).isBattleStarter()) {
                    hashMap.put("pk_inviter_id", String.valueOf(ownerUserId));
                    hashMap.put("pk_invitee_id", String.valueOf(j4));
                } else {
                    hashMap.put("pk_invitee_id", String.valueOf(ownerUserId));
                    hashMap.put("pk_inviter_id", String.valueOf(j4));
                }
            }
            if (((com.bytedance.android.live.liveinteract.api.b) a.a(com.bytedance.android.live.liveinteract.api.b.class)).isInMultiGuest()) {
                hashMap.put("connection_type", "audience");
            }
        }
        if (!m.a(d.a().e())) {
            hashMap.put("enter_live_method", d.a().e());
        }
        hashMap.put("follow_status", String.valueOf(j3));
        Map<String, String> map = this.f21884d;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                hashMap.put(entry.getKey().toString(), entry.getValue().toString());
            }
        }
        String g2 = com.bytedance.android.livesdk.ab.e.g();
        if (TextUtils.isEmpty(g2) || !"click_push_live_cd_user".equals(g2)) {
            hashMap.put("is_subscribe", "0");
        } else {
            hashMap.put("is_subscribe", "1");
        }
        if (z4) {
            str2 = "portrait";
        } else {
            str2 = "landscape";
        }
        hashMap.put("room_orientation", str2);
        if (z) {
            str3 = "follow";
        } else {
            str3 = "unfollow";
        }
        b.a.a(str3).a((Map<String, String>) hashMap).a(eVar).a().b("live_interact").d("live_detail").b();
    }
}
