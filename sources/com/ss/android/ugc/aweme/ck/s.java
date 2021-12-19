package com.ss.android.ugc.aweme.ck;

import com.bytedance.covode.number.Covode;
import com.bytedance.g.c;
import com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.compliance.api.a;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.friends.ui.InviteUserListActivity;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.ss.android.ugc.aweme.question.QuestionDetailActivity;
import com.ss.android.ugc.aweme.splash.SplashActivity;
import com.ss.android.ugc.trill.setting.PushSettingActivity;
import java.lang.reflect.Type;

public final class s implements t.a {
    static {
        Covode.recordClassIndex(43799);
    }

    @Override // com.ss.android.ugc.aweme.ck.t.a
    public final void a() {
        t.f71165d = ((Boolean) c.a("smart_router_enable", (Type) Boolean.class, (Object) true, false)).booleanValue();
        t.a("aweme://main", SplashActivity.class);
        t.a("aweme://push-setting", PushSettingActivity.class);
        t.a("aweme://profile_edit", ProfileEditActivity.class);
        t.a("aweme://draft_box", AVExternalServiceImpl.a().classnameService().getDraftBoxActivity());
        t.a("aweme://challenge/detail/:id", ChallengeDetailActivity.class);
        t.a("aweme://qna/detail/:id", QuestionDetailActivity.class);
        t.a("aweme://user/profile/:uid", UserProfileActivity.class);
        t.a("aweme://user/profile/:uid/:room_id/:room_owner_id/:request_id/:user_type", UserProfileActivity.class);
        t.a("aweme://aweme/detail/:id", DetailActivity.class);
        t.a("aweme://aweme/detaillist/:ids", DetailActivity.class);
        t.a("aweme://story/detail", DetailActivity.class);
        t.a("aweme://webview/", CrossPlatformActivity.class);
        t.a("aweme://reactnative/", CrossPlatformActivity.class);
        t.a("aweme://webview/", CrossPlatformActivity.class);
        t.a("aweme://friend/find", InviteUserListActivity.class);
        t.a();
        t.a("aweme://aweme/challenge/detail/", new q(e.f71130a));
        t.a();
        t.a("aweme://teen_protection", a.p().b());
        t.a();
        t.a("aweme://privacy/setting/modify/", a.p().c());
        t.a("aweme://studio/create", AVExternalServiceImpl.a().classnameService().getVideoRecordPermissionActivityClass());
        t.a("aweme://stickers/detail/:id", PropReuseServiceImpl.c().b());
    }
}
