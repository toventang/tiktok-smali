package com.fcm.a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.f;
import com.fcm.FcmPushAdapter;

public final class a {
    static {
        Covode.recordClassIndex(30817);
    }

    public static void a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            f.b().a(context, FcmPushAdapter.getFcmPush(), str);
        } else {
            f.d().a(FcmPushAdapter.getFcmPush(), 102, "0", "token is empty");
        }
    }
}
