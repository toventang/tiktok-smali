package com.ss.android.ugc.aweme.im.sdk.common.controller.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f102170a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final int f102171b = b.a().a(true, "im_enable_video_cover_optimization", 0);

    private a() {
    }

    public static boolean a() {
        if (f102171b == 1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(65381);
    }
}
