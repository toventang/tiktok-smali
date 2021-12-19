package net.openid.appauth;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f159716a = Collections.unmodifiableSet(new HashSet(Arrays.asList("client_id", "code", "code_verifier", "grant_type", "redirect_uri", "refresh_token", "scope")));

    /* renamed from: b  reason: collision with root package name */
    public final i f159717b;

    /* renamed from: c  reason: collision with root package name */
    public final String f159718c;

    /* renamed from: d  reason: collision with root package name */
    public final String f159719d;

    /* renamed from: e  reason: collision with root package name */
    public final Uri f159720e;

    /* renamed from: f  reason: collision with root package name */
    public final String f159721f;

    /* renamed from: g  reason: collision with root package name */
    public final String f159722g;

    /* renamed from: h  reason: collision with root package name */
    public final String f159723h;

    /* renamed from: i  reason: collision with root package name */
    public final String f159724i;

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, String> f159725j;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private i f159726a;

        /* renamed from: b  reason: collision with root package name */
        private String f159727b;

        /* renamed from: c  reason: collision with root package name */
        private String f159728c;

        /* renamed from: d  reason: collision with root package name */
        private Uri f159729d;

        /* renamed from: e  reason: collision with root package name */
        private String f159730e;

        /* renamed from: f  reason: collision with root package name */
        private String f159731f;

        /* renamed from: g  reason: collision with root package name */
        private String f159732g;

        /* renamed from: h  reason: collision with root package name */
        private String f159733h;

        /* renamed from: i  reason: collision with root package name */
        private Map<String, String> f159734i = new LinkedHashMap();

        static {
            Covode.recordClassIndex(106105);
        }

        private String b() {
            String str = this.f159728c;
            if (str != null) {
                return str;
            }
            if (this.f159731f != null) {
                return "authorization_code";
            }
            if (this.f159732g != null) {
                return "refresh_token";
            }
            throw new IllegalStateException("grant type not specified and cannot be inferred");
        }

        public final r a() {
            String b2 = b();
            if ("authorization_code".equals(b2)) {
                p.a((Object) this.f159731f, (Object) "authorization code must be specified for grant_type = authorization_code");
            }
            if ("refresh_token".equals(b2)) {
                p.a((Object) this.f159732g, (Object) "refresh token must be specified for grant_type = refresh_token");
            }
            if (!b2.equals("authorization_code") || this.f159729d != null) {
                return new r(this.f159726a, this.f159727b, b2, this.f159729d, this.f159730e, this.f159731f, this.f159732g, this.f159733h, Collections.unmodifiableMap(this.f159734i), (byte) 0);
            }
            throw new IllegalStateException("no redirect URI specified on token request for code exchange");
        }

        private a a(Iterable<String> iterable) {
            this.f159730e = c.a(iterable);
            return this;
        }

        public final a c(String str) {
            p.b(str, "authorization code must not be empty");
            this.f159731f = str;
            return this;
        }

        public final a e(String str) {
            if (str != null) {
                m.a(str);
            }
            this.f159733h = str;
            return this;
        }

        private a a(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            a(Arrays.asList(strArr));
            return this;
        }

        public final a d(String str) {
            if (str != null) {
                p.a(str, (Object) "refresh token cannot be empty if defined");
            }
            this.f159732g = str;
            return this;
        }

        public final a a(Uri uri) {
            if (uri != null) {
                p.a((Object) uri.getScheme(), (Object) "redirectUri must have a scheme");
            }
            this.f159729d = uri;
            return this;
        }

        public final a a(String str) {
            this.f159728c = p.a(str, (Object) "grantType cannot be null or empty");
            return this;
        }

        public final a b(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f159730e = null;
            } else {
                a(str.split(" +"));
            }
            return this;
        }

        public final a a(Map<String, String> map) {
            this.f159734i = a.a(map, r.f159716a);
            return this;
        }

        public a(i iVar, String str) {
            this.f159726a = (i) p.a(iVar);
            this.f159727b = p.a(str, (Object) "clientId cannot be null or empty");
        }
    }

    static {
        Covode.recordClassIndex(106104);
    }

    static void a(Map<String, String> map, String str, Object obj) {
        if (obj != null) {
            map.put(str, obj.toString());
        }
    }

    private r(i iVar, String str, String str2, Uri uri, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.f159717b = iVar;
        this.f159718c = str;
        this.f159719d = str2;
        this.f159720e = uri;
        this.f159722g = str3;
        this.f159721f = str4;
        this.f159723h = str5;
        this.f159724i = str6;
        this.f159725j = map;
    }

    /* synthetic */ r(i iVar, String str, String str2, Uri uri, String str3, String str4, String str5, String str6, Map map, byte b2) {
        this(iVar, str, str2, uri, str3, str4, str5, str6, map);
    }
}
