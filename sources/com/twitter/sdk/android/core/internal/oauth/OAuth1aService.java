package com.twitter.sdk.android.core.internal.oauth;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.h;
import com.twitter.sdk.android.core.internal.a.f;
import com.twitter.sdk.android.core.n;
import com.twitter.sdk.android.core.q;
import com.twitter.sdk.android.core.s;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;
import l.b;
import l.b.i;
import l.b.o;
import l.b.t;
import okhttp3.ResponseBody;

public final class OAuth1aService extends d {

    /* renamed from: a  reason: collision with root package name */
    public OAuthApi f155995a = ((OAuthApi) this.f156019e.a(OAuthApi.class));

    public interface OAuthApi {
        static {
            Covode.recordClassIndex(103647);
        }

        @o(a = "/oauth/access_token")
        b<ResponseBody> getAccessToken(@i(a = "Authorization") String str, @t(a = "oauth_verifier") String str2);

        @o(a = "/oauth/request_token")
        b<ResponseBody> getTempToken(@i(a = "Authorization") String str);
    }

    static {
        Covode.recordClassIndex(103645);
    }

    public final com.twitter.sdk.android.core.b<ResponseBody> a(final com.twitter.sdk.android.core.b<OAuthResponse> bVar) {
        return new com.twitter.sdk.android.core.b<ResponseBody>() {
            /* class com.twitter.sdk.android.core.internal.oauth.OAuth1aService.AnonymousClass1 */

            static {
                Covode.recordClassIndex(103646);
            }

            @Override // com.twitter.sdk.android.core.b
            public final void a(s sVar) {
                bVar.a(sVar);
            }

            @Override // com.twitter.sdk.android.core.b
            public final void a(h<ResponseBody> hVar) {
                Throwable th;
                MethodCollector.i(13451);
                StringBuilder sb = new StringBuilder();
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(hVar.f155911a.byteStream()));
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                sb.append(readLine);
                            } else {
                                try {
                                    break;
                                } catch (IOException e2) {
                                    bVar.a(new n(e2.getMessage(), e2));
                                    MethodCollector.o(13451);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader.close();
                            MethodCollector.o(13451);
                            throw th;
                        }
                    }
                    bufferedReader.close();
                    String sb2 = sb.toString();
                    OAuthResponse a2 = OAuth1aService.a(sb2);
                    if (a2 == null) {
                        bVar.a(new n("Failed to parse auth response: ".concat(String.valueOf(sb2))));
                        MethodCollector.o(13451);
                        return;
                    }
                    bVar.a(new h(a2, null));
                    MethodCollector.o(13451);
                } catch (Throwable th3) {
                    th = th3;
                    MethodCollector.o(13451);
                    throw th;
                }
            }
        };
    }

    public static String a(TwitterAuthConfig twitterAuthConfig) {
        return Uri.parse("twittersdk://callback").buildUpon().appendQueryParameter("version", "3.2.0.11").appendQueryParameter("app", twitterAuthConfig.f155892a).build().toString();
    }

    public static OAuthResponse a(String str) {
        long j2;
        TreeMap<String, String> a2 = f.a(str, false);
        String str2 = a2.get("oauth_token");
        String str3 = a2.get("oauth_token_secret");
        String str4 = a2.get("screen_name");
        if (a2.containsKey("user_id")) {
            j2 = Long.parseLong(a2.get("user_id"));
        } else {
            j2 = 0;
        }
        if (str2 == null || str3 == null) {
            return null;
        }
        return new OAuthResponse(new TwitterAuthToken(str2, str3), str4, j2);
    }

    public OAuth1aService(q qVar, com.twitter.sdk.android.core.internal.q qVar2) {
        super(qVar, qVar2);
    }
}
