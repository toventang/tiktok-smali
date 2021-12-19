package net.openid.appauth;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import net.openid.appauth.c.b;
import net.openid.appauth.r;
import org.json.JSONException;
import org.json.JSONObject;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f159659a = Collections.unmodifiableSet(new HashSet(Arrays.asList("token_type", "state", "code", "access_token", "expires_in", "id_token", "scope")));

    /* renamed from: b  reason: collision with root package name */
    public final f f159660b;

    /* renamed from: c  reason: collision with root package name */
    public final String f159661c;

    /* renamed from: d  reason: collision with root package name */
    public final String f159662d;

    /* renamed from: e  reason: collision with root package name */
    public final String f159663e;

    /* renamed from: f  reason: collision with root package name */
    public final String f159664f;

    /* renamed from: g  reason: collision with root package name */
    public final Long f159665g;

    /* renamed from: h  reason: collision with root package name */
    public final String f159666h;

    /* renamed from: i  reason: collision with root package name */
    public final String f159667i;

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, String> f159668j;

    public final Intent a() {
        Intent intent = new Intent();
        intent.putExtra("net.openid.appauth.AuthorizationResponse", b().toString());
        return intent;
    }

    static {
        Covode.recordClassIndex(106081);
    }

    private JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        n.a(jSONObject, "request", this.f159660b.b());
        n.b(jSONObject, "state", this.f159661c);
        n.b(jSONObject, "token_type", this.f159662d);
        n.b(jSONObject, "code", this.f159663e);
        n.b(jSONObject, "access_token", this.f159664f);
        Long l2 = this.f159665g;
        p.a(jSONObject, "json must not be null");
        p.a((Object) "expires_at", (Object) "field must not be null");
        if (l2 != null) {
            try {
                jSONObject.put("expires_at", l2);
            } catch (JSONException e2) {
                throw new IllegalStateException("JSONException thrown in violation of contract", e2);
            }
        }
        n.b(jSONObject, "id_token", this.f159666h);
        n.b(jSONObject, "scope", this.f159667i);
        n.a(jSONObject, "additional_parameters", n.a(this.f159668j));
        return jSONObject;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        Long f159669a;

        /* renamed from: b  reason: collision with root package name */
        private f f159670b;

        /* renamed from: c  reason: collision with root package name */
        private String f159671c;

        /* renamed from: d  reason: collision with root package name */
        private String f159672d;

        /* renamed from: e  reason: collision with root package name */
        private String f159673e;

        /* renamed from: f  reason: collision with root package name */
        private String f159674f;

        /* renamed from: g  reason: collision with root package name */
        private String f159675g;

        /* renamed from: h  reason: collision with root package name */
        private String f159676h;

        /* renamed from: i  reason: collision with root package name */
        private Map<String, String> f159677i = new LinkedHashMap();

        static {
            Covode.recordClassIndex(106082);
        }

        public final g a() {
            return new g(this.f159670b, this.f159671c, this.f159672d, this.f159673e, this.f159674f, this.f159669a, this.f159675g, this.f159676h, Collections.unmodifiableMap(this.f159677i), (byte) 0);
        }

        private a a(Iterable<String> iterable) {
            this.f159676h = c.a(iterable);
            return this;
        }

        public final a b(String str) {
            p.b(str, "tokenType must not be empty");
            this.f159672d = str;
            return this;
        }

        public final a c(String str) {
            p.b(str, "authorizationCode must not be empty");
            this.f159673e = str;
            return this;
        }

        public final a d(String str) {
            p.b(str, "accessToken must not be empty");
            this.f159674f = str;
            return this;
        }

        public final a e(String str) {
            p.b(str, "idToken cannot be empty");
            this.f159675g = str;
            return this;
        }

        private a a(String... strArr) {
            if (strArr == null) {
                this.f159676h = null;
            } else {
                a(Arrays.asList(strArr));
            }
            return this;
        }

        public a(f fVar) {
            this.f159670b = (f) p.a(fVar, "authorization request cannot be null");
        }

        public final a f(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f159676h = null;
            } else {
                a(str.split(" +"));
            }
            return this;
        }

        public final a a(Uri uri) {
            return a(uri, q.f159715a);
        }

        public final a a(String str) {
            p.b(str, "state must not be empty");
            this.f159671c = str;
            return this;
        }

        public final a a(Map<String, String> map) {
            this.f159677i = a.a(map, g.f159659a);
            return this;
        }

        private a a(Long l2, l lVar) {
            if (l2 == null) {
                this.f159669a = null;
            } else {
                this.f159669a = Long.valueOf(lVar.a() + TimeUnit.SECONDS.toMillis(l2.longValue()));
            }
            return this;
        }

        private a a(Uri uri, l lVar) {
            a(uri.getQueryParameter("state"));
            b(uri.getQueryParameter("token_type"));
            c(uri.getQueryParameter("code"));
            d(uri.getQueryParameter("access_token"));
            a(b.a(uri, "expires_in"), lVar);
            e(uri.getQueryParameter("id_token"));
            f(uri.getQueryParameter("scope"));
            a(a.a(uri, g.f159659a));
            return this;
        }
    }

    public final r a(Map<String, String> map) {
        p.a(map, "additionalExchangeParameters cannot be null");
        if (this.f159663e != null) {
            return new r.a(this.f159660b.f159634b, this.f159660b.f159635c).a("authorization_code").a(this.f159660b.f159640h).e(this.f159660b.f159643k).c(this.f159663e).a(map).a();
        }
        throw new IllegalStateException("authorizationCode not available for exchange request");
    }

    public static g a(Intent intent) {
        p.a(intent, "dataIntent must not be null");
        if (!intent.hasExtra("net.openid.appauth.AuthorizationResponse")) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(a(intent, "net.openid.appauth.AuthorizationResponse"));
            if (jSONObject.has("request")) {
                a a2 = new a(f.a(jSONObject.getJSONObject("request"))).b(n.b(jSONObject, "token_type")).d(n.b(jSONObject, "access_token")).c(n.b(jSONObject, "code")).e(n.b(jSONObject, "id_token")).f(n.b(jSONObject, "scope")).a(n.b(jSONObject, "state"));
                a2.f159669a = n.e(jSONObject, "expires_at");
                return a2.a(n.f(jSONObject, "additional_parameters")).a();
            }
            throw new IllegalArgumentException("authorization request not provided and not found in JSON");
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Intent contains malformed auth response", e2);
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private g(f fVar, String str, String str2, String str3, String str4, Long l2, String str5, String str6, Map<String, String> map) {
        this.f159660b = fVar;
        this.f159661c = str;
        this.f159662d = str2;
        this.f159663e = str3;
        this.f159664f = str4;
        this.f159665g = l2;
        this.f159666h = str5;
        this.f159667i = str6;
        this.f159668j = map;
    }

    /* synthetic */ g(f fVar, String str, String str2, String str3, String str4, Long l2, String str5, String str6, Map map, byte b2) {
        this(fVar, str, str2, str3, str4, l2, str5, str6, map);
    }
}
