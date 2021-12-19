package com.ss.android.ugc.aweme.ad.preload;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;

public interface d {
    static {
        Covode.recordClassIndex(40647);
    }

    long a(long j2, long j3);

    void a();

    void a(Aweme aweme, List<String> list, String str, String str2);

    void a(AwemeRawAd awemeRawAd);

    void a(String str, String str2, String str3);

    void a(List<? extends Aweme> list);

    void a(List<String> list, String str, String str2);

    boolean a(String str, String str2);
}
