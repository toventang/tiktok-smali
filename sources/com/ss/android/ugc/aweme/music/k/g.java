package com.ss.android.ugc.aweme.music.k;

import com.bytedance.common.utility.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final String f111553a = (AVExternalServiceImpl.a().configService().cacheConfig().musicDir() + "rhythm/");

    static {
        Covode.recordClassIndex(71649);
    }

    public static String a(String str) {
        return f111553a + b(str);
    }

    public static String b(String str) {
        return d.b(str) + ".json";
    }
}
