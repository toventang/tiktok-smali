package com.ss.android.ugc.aweme.feed.api;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.Request;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static volatile long f91942a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile String f91943b;

    static {
        Covode.recordClassIndex(57894);
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.contains("/aweme/v1/feed/") || str.contains("/aweme/v2/feed/")) {
            return true;
        }
        return false;
    }

    public static boolean a(Request request) {
        if (request == null) {
            return false;
        }
        String path = request.getPath();
        if (TextUtils.isEmpty(path) || (!path.contains("/aweme/v1/feed/") && !path.contains("/aweme/v2/feed/"))) {
            return false;
        }
        return true;
    }
}
