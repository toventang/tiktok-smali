package com.ss.android.ugc.aweme.deeplink.actions;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.IPreLoginHandleService;
import com.ss.android.ugc.aweme.account.PreLoginHandleService;
import com.ss.android.ugc.aweme.deeplink.actions.a.b;
import com.ss.android.ugc.tiktok.security.a.a;
import h.f.b.l;
import h.p;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public final class ImFansAction extends b<z> {
    static {
        Covode.recordClassIndex(49337);
    }

    public static void com_ss_android_ugc_aweme_deeplink_actions_ImFansAction_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(Context context, Intent intent) {
        a.a(intent, context);
        context.startActivity(intent);
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
        boolean z;
        l.d(context, "");
        l.d(str, "");
        l.d(hashMap, "");
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("multi_account_push_uid");
        String queryParameter2 = parse.getQueryParameter("is_from_notification");
        if (queryParameter2 != null) {
            Objects.requireNonNull(queryParameter2, "null cannot be cast to non-null type kotlin.Boolean");
            z = ((Boolean) queryParameter2).booleanValue();
        } else {
            z = false;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.ss.android.ugc.aweme.splash.SplashActivity");
        intent.setFlags(335544320);
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
        intent.putExtra("from_where", 0);
        String queryParameter3 = parse.getQueryParameter("label");
        com.ss.android.ugc.aweme.launcher.service.mob.a.f107296a.a(queryParameter3, parse, z);
        if (TextUtils.equals(queryParameter3, "check_profile")) {
            intent.putExtra("push", true);
        }
        if (!(context instanceof Activity)) {
            return false;
        }
        IPreLoginHandleService a2 = PreLoginHandleService.a();
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (!g2.isLogin()) {
            a2.a((Activity) context, intent, queryParameter);
            return false;
        }
        com_ss_android_ugc_aweme_deeplink_actions_ImFansAction_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(context, intent);
        return true;
    }
}
