package com.ss.android.pushmanager;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f60092a = "https://i.isnssdk.com";

    static {
        Covode.recordClassIndex(37128);
    }

    public static String a(String str) {
        try {
            if (str.equals("/service/1/update_token/")) {
                str = "/cloudpush/update_token/";
            }
            if (str.equals("/cloudpush/update_sender/")) {
                str = "/cloudpush/update_sender/";
            }
            if (str.equals("/service/1/app_notice_status/")) {
                str = "/cloudpush/app_notice_status/";
            }
        } catch (Throwable unused) {
        }
        return "https://api-va.tiktokv.com".concat(String.valueOf(str));
    }
}
