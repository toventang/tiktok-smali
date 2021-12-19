package com.ss.android.ugc.aweme.deeplink.actions;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.deeplink.actions.a.b;
import com.ss.android.ugc.aweme.deeplink.q;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import h.f.b.l;
import h.p;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;

public final class OpenChatInviteAction extends b<z> {
    static {
        Covode.recordClassIndex(49338);
    }

    public static int com_ss_android_ugc_aweme_deeplink_actions_OpenChatInviteAction_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.actions.a.b
    public final p<String, HashMap<String, Object>> buildInnerUrl(String str, HashMap<String, Object> hashMap) {
        l.d(str, "");
        l.d(hashMap, "");
        Uri parse = Uri.parse(str);
        l.b(parse, "");
        return new p<>(l.a(parse.getHost(), (Object) parse.getPath()), hashMap);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.actions.a.a
    public final boolean doRealOpen(Context context, String str, HashMap<String, Object> hashMap, ArrayList<Integer> arrayList) {
        l.d(context, "");
        l.d(str, "");
        l.d(hashMap, "");
        String queryParameter = getOriginalUri().getQueryParameter("invite_id");
        if (queryParameter == null) {
            queryParameter = "";
        }
        if (queryParameter.length() > 0) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (g2.isLogin() && (context instanceof Activity)) {
                if (!q.a.a()) {
                    com_ss_android_ugc_aweme_deeplink_actions_OpenChatInviteAction_com_ss_android_ugc_aweme_lancet_LogLancet_d("UG-deeplink-refactor", "App is cold launch, open MAIN as default in openChatInviteAction");
                    SmartRouter.buildRoute(context, "//main").open();
                }
                IMService.createIIMServicebyMonsterPlugin(false).handleGroupInvite((Activity) context, queryParameter);
                return true;
            }
        }
        return false;
    }
}
