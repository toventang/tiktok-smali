package net.openid.appauth;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.openid.appauth.c.b;
import org.json.JSONObject;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f159633a = Collections.unmodifiableSet(new HashSet(Arrays.asList("client_id", "code_challenge", "code_challenge_method", "display", "login_hint", "prompt", "redirect_uri", "response_mode", "response_type", "scope", "state")));

    /* renamed from: b  reason: collision with root package name */
    public final i f159634b;

    /* renamed from: c  reason: collision with root package name */
    public final String f159635c;

    /* renamed from: d  reason: collision with root package name */
    public final String f159636d;

    /* renamed from: e  reason: collision with root package name */
    public final String f159637e;

    /* renamed from: f  reason: collision with root package name */
    public final String f159638f;

    /* renamed from: g  reason: collision with root package name */
    public final String f159639g;

    /* renamed from: h  reason: collision with root package name */
    public final Uri f159640h;

    /* renamed from: i  reason: collision with root package name */
    public final String f159641i;

    /* renamed from: j  reason: collision with root package name */
    public final String f159642j;

    /* renamed from: k  reason: collision with root package name */
    public final String f159643k;

    /* renamed from: l  reason: collision with root package name */
    public final String f159644l;

    /* renamed from: m  reason: collision with root package name */
    public final String f159645m;
    public final String n;
    public final Map<String, String> o;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        String f159646a;

        /* renamed from: b  reason: collision with root package name */
        String f159647b;

        /* renamed from: c  reason: collision with root package name */
        String f159648c;

        /* renamed from: d  reason: collision with root package name */
        String f159649d;

        /* renamed from: e  reason: collision with root package name */
        String f159650e;

        /* renamed from: f  reason: collision with root package name */
        String f159651f;

        /* renamed from: g  reason: collision with root package name */
        String f159652g;

        /* renamed from: h  reason: collision with root package name */
        Map<String, String> f159653h = new HashMap();

        /* renamed from: i  reason: collision with root package name */
        private i f159654i;

        /* renamed from: j  reason: collision with root package name */
        private String f159655j;

        /* renamed from: k  reason: collision with root package name */
        private String f159656k;

        /* renamed from: l  reason: collision with root package name */
        private Uri f159657l;

        /* renamed from: m  reason: collision with root package name */
        private String f159658m;
        private String n;

        static {
            Covode.recordClassIndex(106080);
        }

        public final f a() {
            return new f(this.f159654i, this.f159655j, this.f159656k, this.f159657l, this.f159646a, this.f159647b, this.f159648c, this.f159658m, this.n, this.f159649d, this.f159650e, this.f159651f, this.f159652g, Collections.unmodifiableMap(new HashMap(this.f159653h)), (byte) 0);
        }

        public final a a(Iterable<String> iterable) {
            this.f159658m = c.a(iterable);
            return this;
        }

        public final a a(String str) {
            this.n = p.b(str, "state cannot be empty if defined");
            return this;
        }

        public a(i iVar, String str, String str2, Uri uri) {
            this.f159654i = (i) p.a(iVar, "configuration cannot be null");
            this.f159655j = p.a(str, (Object) "client ID cannot be null or empty");
            this.f159656k = p.a(str2, (Object) "expected response type cannot be null or empty");
            this.f159657l = (Uri) p.a(uri, "redirect URI cannot be null or empty");
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            a(Base64.encodeToString(bArr, 11));
            SecureRandom secureRandom = new SecureRandom();
            p.a(secureRandom, "entropySource cannot be null");
            p.a(true, (Object) "entropyBytes is less than the minimum permitted");
            p.a(true, (Object) "entropyBytes is greater than the maximum permitted");
            byte[] bArr2 = new byte[64];
            secureRandom.nextBytes(bArr2);
            String encodeToString = Base64.encodeToString(bArr2, 11);
            if (encodeToString != null) {
                m.a(encodeToString);
                this.f159649d = encodeToString;
                this.f159650e = m.b(encodeToString);
                this.f159651f = m.a();
                return;
            }
            this.f159649d = null;
            this.f159650e = null;
            this.f159651f = null;
        }
    }

    static {
        Covode.recordClassIndex(106079);
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        i iVar = this.f159634b;
        JSONObject jSONObject2 = new JSONObject();
        n.a(jSONObject2, "authorizationEndpoint", iVar.f159688a.toString());
        n.a(jSONObject2, "tokenEndpoint", iVar.f159689b.toString());
        if (iVar.f159690c != null) {
            n.a(jSONObject2, "registrationEndpoint", iVar.f159690c.toString());
        }
        if (iVar.f159691d != null) {
            n.a(jSONObject2, "discoveryDoc", iVar.f159691d.J);
        }
        n.a(jSONObject, "configuration", jSONObject2);
        n.a(jSONObject, "clientId", this.f159635c);
        n.a(jSONObject, "responseType", this.f159639g);
        n.a(jSONObject, "redirectUri", this.f159640h.toString());
        n.b(jSONObject, "display", this.f159636d);
        n.b(jSONObject, "login_hint", this.f159637e);
        n.b(jSONObject, "scope", this.f159641i);
        n.b(jSONObject, "prompt", this.f159638f);
        n.b(jSONObject, "state", this.f159642j);
        n.b(jSONObject, "codeVerifier", this.f159643k);
        n.b(jSONObject, "codeVerifierChallenge", this.f159644l);
        n.b(jSONObject, "codeVerifierChallengeMethod", this.f159645m);
        n.b(jSONObject, "responseMode", this.n);
        n.a(jSONObject, "additionalParameters", n.a(this.o));
        return jSONObject;
    }

    public final Uri a() {
        Uri.Builder appendQueryParameter = this.f159634b.f159688a.buildUpon().appendQueryParameter("redirect_uri", this.f159640h.toString()).appendQueryParameter("client_id", this.f159635c).appendQueryParameter("response_type", this.f159639g);
        b.a(appendQueryParameter, "display", this.f159636d);
        b.a(appendQueryParameter, "login_hint", this.f159637e);
        b.a(appendQueryParameter, "prompt", this.f159638f);
        b.a(appendQueryParameter, "state", this.f159642j);
        b.a(appendQueryParameter, "scope", this.f159641i);
        b.a(appendQueryParameter, "response_mode", this.n);
        if (this.f159643k != null) {
            appendQueryParameter.appendQueryParameter("code_challenge", this.f159644l).appendQueryParameter("code_challenge_method", this.f159645m);
        }
        for (Map.Entry<String, String> entry : this.o.entrySet()) {
            appendQueryParameter.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return appendQueryParameter.build();
    }

    public static f a(String str) {
        p.a((Object) str, (Object) "json string cannot be null");
        return a(new JSONObject(str));
    }

    public static f a(JSONObject jSONObject) {
        boolean z;
        LinkedHashSet linkedHashSet;
        p.a(jSONObject, "json cannot be null");
        a aVar = new a(i.a(jSONObject.getJSONObject("configuration")), n.a(jSONObject, "clientId"), n.a(jSONObject, "responseType"), n.c(jSONObject, "redirectUri"));
        aVar.f159646a = p.b(n.b(jSONObject, "display"), "display must be null or not empty");
        aVar.f159647b = p.b(n.b(jSONObject, "login_hint"), "login hint must be null or not empty");
        aVar.f159648c = p.b(n.b(jSONObject, "prompt"), "prompt must be null or non-empty");
        a a2 = aVar.a(n.b(jSONObject, "state"));
        String b2 = n.b(jSONObject, "codeVerifier");
        String b3 = n.b(jSONObject, "codeVerifierChallenge");
        String b4 = n.b(jSONObject, "codeVerifierChallengeMethod");
        if (b2 != null) {
            m.a(b2);
            p.a(b3, (Object) "code verifier challenge cannot be null or empty if verifier is set");
            p.a(b4, (Object) "code verifier challenge method cannot be null or empty if verifier is set");
        } else {
            boolean z2 = true;
            if (b3 == null) {
                z = true;
            } else {
                z = false;
            }
            p.a(z, "code verifier challenge must be null if verifier is null");
            if (b4 != null) {
                z2 = false;
            }
            p.a(z2, "code verifier challenge method must be null if verifier is null");
        }
        a2.f159649d = b2;
        a2.f159650e = b3;
        a2.f159651f = b4;
        String b5 = n.b(jSONObject, "responseMode");
        p.b(b5, "responseMode must not be empty");
        a2.f159652g = b5;
        a2.f159653h = a.a(n.f(jSONObject, "additionalParameters"), f159633a);
        if (jSONObject.has("scope")) {
            String a3 = n.a(jSONObject, "scope");
            if (a3 == null) {
                linkedHashSet = null;
            } else {
                List asList = Arrays.asList(TextUtils.split(a3, " "));
                linkedHashSet = new LinkedHashSet(asList.size());
                linkedHashSet.addAll(asList);
            }
            a2.a(linkedHashSet);
        }
        return a2.a();
    }

    private f(i iVar, String str, String str2, Uri uri, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Map<String, String> map) {
        this.f159634b = iVar;
        this.f159635c = str;
        this.f159639g = str2;
        this.f159640h = uri;
        this.o = map;
        this.f159636d = str3;
        this.f159637e = str4;
        this.f159638f = str5;
        this.f159641i = str6;
        this.f159642j = str7;
        this.f159643k = str8;
        this.f159644l = str9;
        this.f159645m = str10;
        this.n = str11;
    }

    /* synthetic */ f(i iVar, String str, String str2, Uri uri, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Map map, byte b2) {
        this(iVar, str, str2, uri, str3, str4, str5, str6, str7, str8, str9, str10, str11, map);
    }
}
