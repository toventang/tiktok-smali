package com.ss.android.ugc.aweme.lancet.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.Request;
import java.util.concurrent.atomic.AtomicBoolean;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static AtomicBoolean f107185a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public static AtomicBoolean f107186b = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(68565);
    }

    public static int a(Request request) {
        if (request == null) {
            return -1;
        }
        String path = request.getPath();
        if (TextUtils.isEmpty(path)) {
            return -1;
        }
        if (path.contains("/aweme/v1/feed/")) {
            return 1;
        }
        if (path.contains("/aweme/v2/feed/")) {
            return 2;
        }
        return -1;
    }
}
