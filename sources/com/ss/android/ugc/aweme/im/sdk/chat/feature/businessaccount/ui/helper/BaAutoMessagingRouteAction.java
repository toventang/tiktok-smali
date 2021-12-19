package com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.commerce.d;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.tiktok.security.a.a;

public final class BaAutoMessagingRouteAction implements IRouteAction {
    static {
        Covode.recordClassIndex(64252);
    }

    public static void com_ss_android_ugc_aweme_im_sdk_chat_feature_businessaccount_ui_helper_BaAutoMessagingRouteAction_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(Context context, Intent intent) {
        a.a(intent, context);
        context.startActivity(intent);
    }

    @Override // com.bytedance.router.route.IRouteAction
    public final Boolean open(Context context, String str, Bundle bundle) {
        User curUser;
        d bizAccountInfo;
        if (context == null) {
            return null;
        }
        IAccountUserService e2 = AccountService.a().e();
        if (e2 == null || (curUser = e2.getCurUser()) == null || (bizAccountInfo = curUser.getBizAccountInfo()) == null || !bizAccountInfo.enableAutoMsg()) {
            return false;
        }
        Intent intent = new Intent(context, BaMessageSettingActivity.class);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        com_ss_android_ugc_aweme_im_sdk_chat_feature_businessaccount_ui_helper_BaAutoMessagingRouteAction_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(context, intent);
        return true;
    }
}
