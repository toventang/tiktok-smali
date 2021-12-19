package com.ss.android.ugc.aweme.ad.preload;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import org.json.JSONObject;

public interface IAdLandPagePreloadService {
    static {
        Covode.recordClassIndex(40641);
    }

    long a(long j2, long j3);

    e a();

    String a(Long l2);

    void a(AwemeRawAd awemeRawAd);

    void a(Long l2, String str);

    void a(String str);

    String b();

    String b(Long l2);

    JSONObject b(String str);

    int c(String str);

    void c();

    void d(String str);

    boolean d();

    String e();

    void e(String str);

    String f(String str);

    String g(String str);
}
