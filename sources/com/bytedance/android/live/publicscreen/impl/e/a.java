package com.bytedance.android.live.publicscreen.impl.e;

import com.bytedance.android.live.publicscreen.a.d.h;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.android.live.publicscreen.a.e;
import com.bytedance.android.live.publicscreen.impl.model.p;
import com.bytedance.android.live.publicscreen.impl.model.q;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.model.ba;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.concurrent.TimeUnit;

public final class a extends f {
    static {
        Covode.recordClassIndex(6774);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.e.g
    public final void a() {
        b.a.a("livesdk_message_show_monitor").a(e().f12208l).a("msg_comment_cnt", this.f12327f).a("msg_comment_chathead_loaded", this.p).a("admin_type", g()).a("hot_duration", TimeUnit.MILLISECONDS.toSeconds(this.v)).a("folded_show_msg_cnt", this.q).a("unfolded_show_msg_cnt", this.r).a("show_msg_cnt", this.q + this.r).a("msg_like_cnt", this.f12328g).a("msg_gift_cnt", this.f12329h).a("msg_share_cnt", this.f12330i).a("msg_follow_cnt", this.f12331j).a("drop_like_cnt", this.f12332k).a("drop_gift_cnt", this.f12333l).a("drop_share_cnt", this.f12334m).a("drop_follow_cnt", this.n).a("drop_comment_cnt", this.o).a("msg_member_enter_cnt", this.s).a("drop_member_enter_cnt", this.t).b();
    }

    @Override // com.bytedance.android.live.publicscreen.impl.e.c, com.bytedance.android.live.publicscreen.impl.e.b, com.bytedance.android.live.publicscreen.impl.e.g, com.bytedance.android.live.publicscreen.impl.e.f
    public final void a(h hVar, long j2) {
        com.bytedance.android.livesdk.model.message.c.b bVar;
        String str;
        String str2;
        l.d(hVar, "");
        super.a(hVar, j2);
        if (j2 == 0) {
            b a2 = b.a.a("livesdk_public_screen_metrics").a(e().f12208l);
            if (e().f12205i) {
                Long startStreamingTimestamp = ((e) com.bytedance.android.live.t.a.a(e.class)).getStartStreamingTimestamp(e().f12197a);
                if (startStreamingTimestamp != null) {
                    long longValue = startStreamingTimestamp.longValue();
                    a2.a("public_screen_load_duration", ((f) this).f12320b - longValue).a("public_screen_first_message_total_duration", this.f12322d - longValue);
                }
            } else {
                f fVar = f.a.f23366a;
                l.b(fVar, "");
                EnterRoomLinkSession a3 = fVar.a();
                l.b(a3, "");
                EnterRoomConfig.TimeStamp timeStamp = a3.f23354b.f23299c.af;
                if (timeStamp != null) {
                    long j3 = timeStamp.f23351a;
                    a2.a("public_screen_load_duration", ((f) this).f12320b - j3).a("public_screen_first_message_total_duration", this.f12322d - j3);
                }
            }
            a2.a("public_screen_first_message_receive_duration", ((f) this).f12321c - ((f) this).f12320b).a("public_screen_first_message_show_duration", this.f12322d - ((f) this).f12321c).b();
        }
        if (hVar instanceof p) {
            p pVar = (p) hVar;
            if (!pVar.f12489e) {
                b.a.a("livesdk_share_capsule_show").a(e().f12208l).b();
                pVar.f12489e = true;
            }
        }
        if ((hVar instanceof q) && hVar.d().f12179a == 1) {
            MESSAGE message = ((k) hVar).f12190d;
            l.b(message, "");
            com.bytedance.android.livesdkapi.h.b bVar2 = message.O;
            if (bVar2 != null && (bVar = bVar2.f23218j) != null && (str = bVar.f19421a) != null) {
                if (e().f12205i) {
                    str2 = "anchor";
                } else {
                    com.bytedance.android.livesdk.at.f b2 = u.a().b();
                    l.b(b2, "");
                    com.bytedance.android.live.base.model.user.b a4 = b2.a();
                    l.b(a4, "");
                    ba userAttr = a4.getUserAttr();
                    if (userAttr == null || !userAttr.f19030b) {
                        str2 = "user";
                    } else {
                        str2 = "admin";
                    }
                }
                switch (str.hashCode()) {
                    case -1660150875:
                        if (!str.equals("pm_mt_guidance_host_10_share")) {
                            return;
                        }
                        b.a.a("livesdk_enhanced_share_info").a(e().f12208l).a("msg_type", "to_more_than_10_users").a("admin_type", str2).b();
                        return;
                    case -1130060071:
                        if (!str.equals("pm_mt_guidance_viewer_5_share")) {
                            return;
                        }
                        b.a.a("livesdk_enhanced_share_info").a(e().f12208l).a("msg_type", "to_more_than_5_users").a("admin_type", str2).b();
                        return;
                    case -686828615:
                        if (str.equals("pm_mt_guidance_host_share")) {
                            b.a.a("livesdk_anchor_share_notify_notice").a(e().f12208l).a("msg_type", "encourage_user_share").b();
                            return;
                        }
                        return;
                    case 188624603:
                        if (str.equals("pm_mt_guidance_host_more_share")) {
                            b.a.a("livesdk_anchor_share_notify_notice").a(e().f12208l).a("msg_type", "first_user_share").b();
                            return;
                        }
                        return;
                    case 1621337787:
                        if (!str.equals("pm_mt_guidance_viewer_10_share")) {
                            return;
                        }
                        b.a.a("livesdk_enhanced_share_info").a(e().f12208l).a("msg_type", "to_more_than_10_users").a("admin_type", str2).b();
                        return;
                    case 1950674095:
                        if (!str.equals("pm_mt_guidance_host_5_share")) {
                            return;
                        }
                        b.a.a("livesdk_enhanced_share_info").a(e().f12208l).a("msg_type", "to_more_than_5_users").a("admin_type", str2).b();
                        return;
                    default:
                        return;
                }
            }
        }
    }
}
