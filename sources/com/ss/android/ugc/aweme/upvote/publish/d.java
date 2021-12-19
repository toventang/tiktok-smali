package com.ss.android.ugc.aweme.upvote.publish;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.emoji.i.b.b;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import h.a.ag;
import h.f.b.l;
import h.p;
import h.v;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f142303a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(93073);
    }

    public static void a(String str, String str2, UpvotePublishMobParam upvotePublishMobParam) {
        String str3;
        String str4;
        String str5;
        String str6;
        l.d(str, "");
        l.d(str2, "");
        p[] pVarArr = new p[6];
        String str7 = null;
        if (upvotePublishMobParam != null) {
            str3 = upvotePublishMobParam.f142213a;
        } else {
            str3 = null;
        }
        pVarArr[0] = v.a("enter_from", str3);
        if (upvotePublishMobParam != null) {
            str4 = upvotePublishMobParam.f142215c;
        } else {
            str4 = null;
        }
        pVarArr[1] = v.a("group_id", str4);
        if (upvotePublishMobParam != null) {
            str5 = upvotePublishMobParam.f142216d;
        } else {
            str5 = null;
        }
        pVarArr[2] = v.a("author_id", str5);
        if (upvotePublishMobParam != null) {
            str7 = upvotePublishMobParam.f142217e;
        }
        pVarArr[3] = v.a("follow_status", str7);
        pVarArr[4] = v.a("recommendation_id", str);
        pVarArr[5] = v.a("enter_method", "button");
        Map b2 = ag.b(pVarArr);
        com.bytedance.ies.ugc.appcontext.d.a();
        int c2 = b.c(str2);
        if (c2 == 0) {
            str6 = "text";
        } else if (c2 != 1) {
            str6 = "text_emoji";
        } else {
            str6 = "emoji";
        }
        b2.put("message_type", str6);
        r.a("add_recommendation_finish_success", b2);
    }
}
