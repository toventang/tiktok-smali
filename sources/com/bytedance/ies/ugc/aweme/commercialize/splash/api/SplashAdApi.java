package com.bytedance.ies.ugc.aweme.commercialize.splash.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.ad;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.f;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.k;
import com.bytedance.retrofit2.b.o;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.Map;

public interface SplashAdApi {
    static {
        Covode.recordClassIndex(20827);
    }

    @h
    b<String> executeGet(@o int i2, @ag String str);

    @h
    @ad(a = "vas_ad_track")
    b<String> executeGet(@o int i2, @ag String str, @k(a = "User-Agent") String str2);

    @t
    b<String> executePost(@o int i2, @ag String str, @com.bytedance.retrofit2.b.b TypedOutput typedOutput);

    @t
    @g
    b<String> executePost(@o int i2, @ag String str, @e(a = "ad_status") String str2);

    @t
    @g
    b<String> executePost(@o int i2, @ag String str, @f Map<String, String> map);
}
