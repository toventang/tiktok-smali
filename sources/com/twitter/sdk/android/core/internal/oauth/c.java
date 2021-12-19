package com.twitter.sdk.android.core.internal.oauth;

import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.a.f;
import com.twitter.sdk.android.core.k;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import k.i;

/* access modifiers changed from: package-private */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final SecureRandom f156009a = new SecureRandom();

    /* renamed from: b  reason: collision with root package name */
    private final TwitterAuthConfig f156010b;

    /* renamed from: c  reason: collision with root package name */
    private final TwitterAuthToken f156011c;

    /* renamed from: d  reason: collision with root package name */
    private final String f156012d;

    /* renamed from: e  reason: collision with root package name */
    private final String f156013e;

    /* renamed from: f  reason: collision with root package name */
    private final String f156014f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, String> f156015g;

    static {
        Covode.recordClassIndex(103658);
    }

    private static String c() {
        return Long.toString(System.currentTimeMillis() / 1000);
    }

    public final String a() {
        String b2 = b();
        String c2 = c();
        return a(b2, c2, a(a(b2, c2)));
    }

    private static String b() {
        return String.valueOf(System.nanoTime()) + String.valueOf(Math.abs(f156009a.nextLong()));
    }

    private String a(String str) {
        String str2;
        try {
            TwitterAuthToken twitterAuthToken = this.f156011c;
            if (twitterAuthToken != null) {
                str2 = twitterAuthToken.f155895c;
            } else {
                str2 = null;
            }
            String str3 = f.a(this.f156010b.f155893b) + '&' + f.a(str2);
            byte[] bytes = str.getBytes("UTF8");
            SecretKeySpec secretKeySpec = new SecretKeySpec(str3.getBytes("UTF8"), "HmacSHA1");
            Mac instance = Mac.getInstance("HmacSHA1");
            instance.init(secretKeySpec);
            byte[] doFinal = instance.doFinal(bytes);
            return i.of(doFinal, 0, doFinal.length).base64();
        } catch (InvalidKeyException unused) {
            k.c().a();
            return "";
        } catch (NoSuchAlgorithmException unused2) {
            k.c().a();
            return "";
        } catch (UnsupportedEncodingException unused3) {
            k.c().a();
            return "";
        }
    }

    private static String a(TreeMap<String, String> treeMap) {
        StringBuilder sb = new StringBuilder();
        int size = treeMap.size();
        int i2 = 0;
        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            sb.append(f.b(f.b(entry.getKey()))).append("%3D").append(f.b(f.b(entry.getValue())));
            i2++;
            if (i2 < size) {
                sb.append("%26");
            }
        }
        return sb.toString();
    }

    private String a(String str, String str2) {
        URI create = URI.create(this.f156014f);
        TreeMap<String, String> a2 = f.a(create, true);
        Map<String, String> map = this.f156015g;
        if (map != null) {
            a2.putAll(map);
        }
        String str3 = this.f156012d;
        if (str3 != null) {
            a2.put("oauth_callback", str3);
        }
        a2.put("oauth_consumer_key", this.f156010b.f155892a);
        a2.put("oauth_nonce", str);
        a2.put("oauth_signature_method", "HMAC-SHA1");
        a2.put("oauth_timestamp", str2);
        TwitterAuthToken twitterAuthToken = this.f156011c;
        if (!(twitterAuthToken == null || twitterAuthToken.f155894b == null)) {
            a2.put("oauth_token", this.f156011c.f155894b);
        }
        a2.put("oauth_version", "1.0");
        return this.f156013e.toUpperCase(Locale.ENGLISH) + '&' + f.b(create.getScheme() + "://" + create.getHost() + create.getPath()) + '&' + a(a2);
    }

    private static void a(StringBuilder sb, String str, String str2) {
        if (str2 != null) {
            sb.append(' ').append(f.b(str)).append("=\"").append(f.b(str2)).append("\",");
        }
    }

    private String a(String str, String str2, String str3) {
        String str4;
        StringBuilder sb = new StringBuilder("OAuth");
        a(sb, "oauth_callback", this.f156012d);
        a(sb, "oauth_consumer_key", this.f156010b.f155892a);
        a(sb, "oauth_nonce", str);
        a(sb, "oauth_signature", str3);
        a(sb, "oauth_signature_method", "HMAC-SHA1");
        a(sb, "oauth_timestamp", str2);
        TwitterAuthToken twitterAuthToken = this.f156011c;
        if (twitterAuthToken != null) {
            str4 = twitterAuthToken.f155894b;
        } else {
            str4 = null;
        }
        a(sb, "oauth_token", str4);
        a(sb, "oauth_version", "1.0");
        return sb.substring(0, sb.length() - 1);
    }

    c(TwitterAuthConfig twitterAuthConfig, TwitterAuthToken twitterAuthToken, String str, String str2, String str3, Map<String, String> map) {
        this.f156010b = twitterAuthConfig;
        this.f156011c = twitterAuthToken;
        this.f156012d = str;
        this.f156013e = str2;
        this.f156014f = str3;
        this.f156015g = map;
    }
}
