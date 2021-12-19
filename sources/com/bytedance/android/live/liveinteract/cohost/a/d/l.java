package com.bytedance.android.live.liveinteract.cohost.a.d;

import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.platform.common.g.w;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.e;
import com.bytedance.android.livesdk.an.a;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

public final /* synthetic */ class l implements f {

    /* renamed from: a  reason: collision with root package name */
    private final d f10141a;

    static {
        Covode.recordClassIndex(5322);
    }

    public l(d dVar) {
        this.f10141a = dVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        d dVar = this.f10141a;
        a.a().a(new com.bytedance.android.livesdkapi.depend.b.a((com.bytedance.android.livesdkapi.depend.model.b.a) obj));
        String a2 = w.a(dVar.f10120d.p);
        b a3 = b.a.a("livesdk_follow");
        a3.a("channel_id", dVar.f10120d.f9940e);
        if (((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).isRoomInBattle()) {
            a3.a("connection_type", "manual_pk");
            a3.a("pk_id", ((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).getBattleId());
            if (dVar.f10118b && com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.f10679c) {
                a3.a("pk_inviter_id", dVar.f10117a.getOwnerUserId());
                a3.a("pk_invitee_id", b.a.a().f9941f);
            } else if (dVar.f10118b && !com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.f10679c) {
                a3.a("pk_invitee_id", dVar.f10117a.getOwnerUserId());
                a3.a("pk_inviter_id", b.a.a().f9941f);
            }
        } else {
            a3.a("connection_type", "anchor");
        }
        if (dVar.f10118b) {
            if (b.a.a().q) {
                a3.a("connection_inviter_id", dVar.f10117a.getOwnerUserId());
                a3.a("connection_invitee_id", b.a.a().f9941f);
            } else {
                a3.a("connection_inviter_id", b.a.a().f9941f);
                a3.a("connection_invitee_id", dVar.f10117a.getOwnerUserId());
            }
        }
        a3.a("anchor_type", "opposite");
        a3.a(dVar.w).a("request_page", dVar.f10118b ? "live_anchor_c_anchor" : "live_audience_c_anchor").a("enter_from_merge", e.a()).a("enter_method", e.d()).a("action_type", e.e()).a("anchor_id", dVar.f10117a.getOwnerUserId()).a("room_id", dVar.f10117a.getId()).a("request_id", dVar.f10117a.getRequestId()).a("log_pb", dVar.f10117a.getLog_pb()).a("click_user_position", "follow_icon").a("to_user_id", dVar.f10120d.f9941f).a("live_type", "video_live").a("invitee_list", a2).b();
    }
}
