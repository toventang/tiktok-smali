package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.ss.android.ugc.aweme.feed.ui.k;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class y {
    static {
        Covode.recordClassIndex(60300);
    }

    public static final void a(Aweme aweme, k.a aVar, k.b bVar) {
        User user;
        String str;
        String str2;
        String str3;
        AwemeRelationRecommendModel relationRecommendInfo;
        String friendTypeStr;
        AwemeRelationRecommendModel relationRecommendInfo2;
        String str4 = "";
        l.d(aVar, str4);
        if (bVar != null) {
            new u();
            if (aweme != null) {
                user = aweme.getAuthor();
            } else {
                user = null;
            }
            d a2 = new d().a("enter_from", "homepage_hot").a("follow_type", u.b(user).getType());
            if (aweme == null || (relationRecommendInfo2 = aweme.getRelationRecommendInfo()) == null || (str = relationRecommendInfo2.getRecType()) == null) {
                str = str4;
            }
            d a3 = a2.a("rec_type", str);
            if (aweme == null || (str2 = aweme.getAuthorUid()) == null) {
                str2 = str4;
            }
            d a4 = a3.a("to_user_id", str2);
            if (aweme == null || (str3 = aweme.getRequestId()) == null) {
                str3 = str4;
            }
            d a5 = a4.a("req_id", str3).a("action_type", aVar.getType()).a("scene_type", u.c.ITEM.getType()).a("expand_reason", bVar.getType());
            if (!(aweme == null || (relationRecommendInfo = aweme.getRelationRecommendInfo()) == null || (friendTypeStr = relationRecommendInfo.getFriendTypeStr()) == null)) {
                str4 = friendTypeStr;
            }
            r.a("expand_follow_button", a5.a("relation_type", str4).f66730a);
        }
    }
}
