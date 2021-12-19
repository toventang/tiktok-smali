package com.ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.commercialize.utils.b.b;
import h.f.b.l;

public final class GPOpenRouter implements IRouteAction {
    static {
        Covode.recordClassIndex(46589);
    }

    public static int com_ss_android_ugc_aweme_commercialize_utils_GPOpenRouter_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        com_ss_android_ugc_aweme_commercialize_utils_GPOpenRouter_com_ss_android_ugc_aweme_lancet_LogLancet_d("message_winter", "url = " + str + "   extra = " + bundle);
        String queryParameter = Uri.parse(str).getQueryParameter("package_name");
        if (queryParameter == null) {
            return false;
        }
        l.b(queryParameter, "");
        return Boolean.valueOf(b.a(context, queryParameter));
    }
}
