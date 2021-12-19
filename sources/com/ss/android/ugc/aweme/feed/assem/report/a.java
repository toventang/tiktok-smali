package com.ss.android.ugc.aweme.feed.assem.report;

import android.app.Activity;
import android.view.View;
import com.bytedance.android.livesdkapi.model.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.a.e;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.c;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.report.b;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f92402a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(58467);
    }

    public static void a(Aweme aweme, View view) {
        l.d(aweme, "");
        l.d(view, "");
        Activity a2 = e.a(view.getContext());
        if (aweme.isAd() && aweme.getAwemeRawAd() != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd == null) {
                l.b();
            }
            l.b(awemeRawAd, "");
            if (awemeRawAd.isReportEnable()) {
                com.ss.android.ugc.aweme.compliance.api.a.a().b(a2, b.a(aweme, "creative", "ad"));
                return;
            }
        }
        if (aweme.isLive()) {
            ILiveOuterService s = LiveOuterService.s();
            l.b(s, "");
            c d2 = s.d();
            l.b(d2, "");
            LiveRoomStruct newLiveRoomData = aweme.getNewLiveRoomData();
            if (newLiveRoomData != null) {
                long j2 = 0;
                try {
                    User user = newLiveRoomData.owner;
                    l.b(user, "");
                    String uid = user.getUid();
                    l.b(uid, "");
                    j2 = Long.parseLong(uid);
                } catch (NumberFormatException e2) {
                    e2.printStackTrace();
                }
                long j3 = newLiveRoomData.id;
                User user2 = newLiveRoomData.owner;
                l.b(user2, "");
                d dVar = new d(j3, j2, j2, user2.getSecUid(), "fast_report", "homepage_hot", "live_cell", "click", "fast_report", "");
                dVar.f23274a = "full_screen";
                d2.a(view.getContext(), dVar);
                r.a("livesdk_live_user_report", new com.ss.android.ugc.aweme.app.f.d().a("anchor_id", j2).a("request_page", "fast_report").a("room_id", newLiveRoomData.id).a("action_type", "click").a("report_type", "report_user").a("admin_type", "viewer").a("request_id", aweme.getRequestId()).a("enter_method", "live_cell").a("enter_from_merge", "homepage_hot").f66730a);
                return;
            }
            return;
        }
        com.ss.android.ugc.aweme.compliance.api.a.a().a(a2, aweme);
    }
}
