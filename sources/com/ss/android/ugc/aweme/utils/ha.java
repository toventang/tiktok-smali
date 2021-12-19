package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.f;
import com.ss.android.ugc.aweme.common.ad;
import com.ss.android.ugc.aweme.common.d;
import com.ss.android.ugc.aweme.openshare.Share;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;

public final class ha {
    static {
        Covode.recordClassIndex(93617);
    }

    public static void a() {
        for (Activity activity : ActivityStack.getActivityStack()) {
            activity.finish();
        }
    }

    static class a {
        @c(a = "create_by")

        /* renamed from: a  reason: collision with root package name */
        String f143051a;

        static {
            Covode.recordClassIndex(93618);
        }

        a(String str) {
            this.f143051a = str;
        }
    }

    private static Bundle c(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public static ad a(Intent intent) {
        Bundle d2 = d(intent);
        if (d2 == null) {
            return null;
        }
        return new ad(d2);
    }

    public static boolean b(String str) {
        if (str != null) {
            return str.startsWith("image/");
        }
        return false;
    }

    public static ad a(BaseShortVideoContext baseShortVideoContext) {
        if (baseShortVideoContext == null) {
            return null;
        }
        return AVExternalServiceImpl.a().infoService().shareContextInfo(baseShortVideoContext);
    }

    public static String c(String str) {
        int lastIndexOf;
        if (str == null || str.length() <= 0 || (lastIndexOf = str.lastIndexOf(46)) < 0 || lastIndexOf >= str.length() - 1) {
            return str;
        }
        return str.substring(lastIndexOf + 1);
    }

    private static Bundle d(Intent intent) {
        Bundle c2 = c(intent);
        if (c2 == null || !TextUtils.isEmpty(c2.getString("_aweme_open_sdk_params_client_key"))) {
            return c2;
        }
        return null;
    }

    public static Share.Request a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        Share.Request request = new Share.Request();
        request.fromBundle(bundle);
        return request;
    }

    public static ad b(Intent intent) {
        Bundle c2 = c(intent);
        if (c2 == null) {
            return null;
        }
        c2.putString("_open_platform_content_json", new f().b(new a("system_share")));
        return new ad(c2);
    }

    public static boolean a(d dVar) {
        if (dVar == null || TextUtils.isEmpty(dVar.mClientKey) || !dVar.mNeedShowDialog) {
            return false;
        }
        return true;
    }

    public static boolean a(String str) {
        if (str != null) {
            return str.startsWith("video/");
        }
        return false;
    }
}
