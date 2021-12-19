package com.ss.android.ugc.aweme.social.widget.a;

import android.content.Context;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.friends.e;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.recommend.g;
import com.ss.android.ugc.aweme.utils.io;
import com.ss.android.ugc.aweme.views.MutualRelationView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(87473);
    }

    public static final int a(User user) {
        l.d(user, "");
        if (user.getFollowStatus() > 0) {
            return 0;
        }
        return 1;
    }

    public static final void a(TuxTextView tuxTextView, User user) {
        l.d(tuxTextView, "");
        l.d(user, "");
        tuxTextView.setText(user.getNickname());
        io.a(tuxTextView.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), tuxTextView);
    }

    public static final void a(SmartAvatarImageView smartAvatarImageView, UrlModel urlModel) {
        l.d(smartAvatarImageView, "");
        l.d(urlModel, "");
        v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(urlModel));
        a2.E = smartAvatarImageView;
        a2.a("SocialCard").c();
    }

    public static final void a(User user, TuxTextView tuxTextView, MutualRelationView mutualRelationView) {
        l.d(user, "");
        l.d(tuxTextView, "");
        l.d(mutualRelationView, "");
        if (user.getMutualStruct() != null) {
            tuxTextView.setVisibility(8);
            mutualRelationView.setVisibility(0);
            mutualRelationView.setTextColor(b.c(tuxTextView.getContext(), R.color.c5));
            mutualRelationView.a(user.getMutualStruct(), e.d());
            return;
        }
        mutualRelationView.setVisibility(8);
        tuxTextView.setVisibility(0);
        com.ss.android.ugc.aweme.social.ext.a.a(tuxTextView, user, null, null, 6);
    }

    private static void a(User user, Context context, String str, String str2, String str3, String str4) {
        l.d(user, "");
        l.d(context, "");
        l.d(str, "");
        l.d(str3, "");
        l.d(str4, "");
        SmartRouter.buildRoute(context, "aweme://user/profile/").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("enter_from", str).withParam("enter_method", str4).withParam("enter_from_request_id", user.getRequestId()).withParam("extra_previous_page_position", "card_head").withParam("need_track_compare_recommend_reason", 1).withParam("previous_recommend_reason", user.getRecommendReason()).withParam("recommend_from_type", "card").withParam("recommend_enter_profile_params", new g(str, str3, u.c.CARD, user.getRecType(), g.a.a(user), user.getUid(), null, null, user.getRequestId(), str2, user.getFriendTypeStr(), user.getSocialInfo())).open();
    }

    public static /* synthetic */ void a(User user, Context context, String str, String str2, String str3, String str4, int i2) {
        String str5 = str2;
        String str6 = str3;
        String str7 = "";
        if ((i2 & 4) != 0) {
            str5 = str7;
        }
        if ((i2 & 8) != 0) {
            str6 = str7;
        }
        if ((i2 & 16) == 0) {
            str7 = str4;
        }
        a(user, context, str, str5, str6, str7);
    }
}
