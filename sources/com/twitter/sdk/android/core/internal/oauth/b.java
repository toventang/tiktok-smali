package com.twitter.sdk.android.core.internal.oauth;

import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import java.util.Map;

public final class b {
    static {
        Covode.recordClassIndex(103657);
    }

    private static c b(TwitterAuthConfig twitterAuthConfig, TwitterAuthToken twitterAuthToken, String str, String str2, String str3, Map<String, String> map) {
        return new c(twitterAuthConfig, twitterAuthToken, str, str2, str3, map);
    }

    public static String a(TwitterAuthConfig twitterAuthConfig, TwitterAuthToken twitterAuthToken, String str, String str2, String str3, Map<String, String> map) {
        return b(twitterAuthConfig, twitterAuthToken, str, str2, str3, map).a();
    }
}
