package com.ss.android.ugc.aweme.awemeservice;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static a f67618a;

    /* renamed from: b  reason: collision with root package name */
    Map<String, Aweme> f67619b = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(41630);
    }

    public static a a() {
        if (f67618a == null) {
            f67618a = new a();
        }
        return f67618a;
    }

    public final Aweme a(String str) {
        if (TextUtils.isEmpty(str) || "0".equals(str) || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f67619b.get(str);
    }

    public final AwemeStatistics b(String str) {
        Aweme a2;
        if (TextUtils.isEmpty(str) || (a2 = a(str)) == null) {
            return null;
        }
        AwemeStatistics statistics = a2.getStatistics();
        if (statistics != null) {
            return statistics;
        }
        AwemeStatistics awemeStatistics = new AwemeStatistics();
        a2.setStatistics(awemeStatistics);
        return awemeStatistics;
    }

    public final Aweme a(Aweme aweme) {
        String str;
        if (aweme != null && !TextUtils.isEmpty(aweme.getAid())) {
            if (aweme.getVideo() != null && aweme.isAd()) {
                if (b.B(aweme)) {
                    str = "topview";
                } else {
                    str = "is_ads";
                }
                aweme.getVideo().setVideoAdTag(str);
            }
            Aweme aweme2 = this.f67619b.get(aweme.getAid());
            if (aweme2 != null) {
                aweme2.update(aweme);
                return aweme2;
            }
            this.f67619b.put(aweme.getAid(), aweme);
        }
        return aweme;
    }
}
