package com.ss.android.ugc.aweme.dg;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.live.LiveHostOuterService;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static b f80072a;

    static {
        Covode.recordClassIndex(49845);
    }

    public static void a(Activity activity, String str) {
        if (LiveHostOuterService.q() != null) {
            LiveHostOuterService.q().b(activity, str);
        }
    }
}
