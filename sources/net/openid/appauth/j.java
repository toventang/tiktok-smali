package net.openid.appauth;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.openid.appauth.n;
import org.json.JSONObject;

public final class j {
    static final n.f A = a("service_documentation");
    static final n.e B = b("claims_locales_supported");
    static final n.e C = b("ui_locales_supported");
    static final n.a D = a("claims_parameter_supported", false);
    static final n.a E = a("request_parameter_supported", false);
    static final n.a F = a("request_uri_parameter_supported", true);
    static final n.a G = a("require_request_uri_registration", false);
    static final n.f H = a("op_policy_uri");
    static final n.f I = a("op_tos_uri");
    private static final List<String> K;

    /* renamed from: a  reason: collision with root package name */
    static final n.d f159696a;

    /* renamed from: b  reason: collision with root package name */
    static final n.f f159697b;

    /* renamed from: c  reason: collision with root package name */
    static final n.f f159698c = a("token_endpoint");

    /* renamed from: d  reason: collision with root package name */
    static final n.f f159699d = a("userinfo_endpoint");

    /* renamed from: e  reason: collision with root package name */
    static final n.f f159700e;

    /* renamed from: f  reason: collision with root package name */
    static final n.f f159701f = a("registration_endpoint");

    /* renamed from: g  reason: collision with root package name */
    static final n.e f159702g = b("scopes_supported");

    /* renamed from: h  reason: collision with root package name */
    static final n.e f159703h;

    /* renamed from: i  reason: collision with root package name */
    static final n.e f159704i = b("response_modes_supported");

    /* renamed from: j  reason: collision with root package name */
    static final n.e f159705j = a("grant_types_supported", Arrays.asList("authorization_code", "implicit"));

    /* renamed from: k  reason: collision with root package name */
    static final n.e f159706k = b("acr_values_supported");

    /* renamed from: l  reason: collision with root package name */
    static final n.e f159707l;

    /* renamed from: m  reason: collision with root package name */
    static final n.e f159708m;
    static final n.e n = b("id_token_encryption_enc_values_supported");
    static final n.e o = b("id_token_encryption_enc_values_supported");
    static final n.e p = b("userinfo_signing_alg_values_supported");
    static final n.e q = b("userinfo_encryption_alg_values_supported");
    static final n.e r = b("userinfo_encryption_enc_values_supported");
    static final n.e s = b("request_object_signing_alg_values_supported");
    static final n.e t = b("request_object_encryption_alg_values_supported");
    static final n.e u = b("request_object_encryption_enc_values_supported");
    static final n.e v = a("token_endpoint_auth_methods_supported", Collections.singletonList("client_secret_basic"));
    static final n.e w = b("token_endpoint_auth_signing_alg_values_supported");
    static final n.e x = b("display_values_supported");
    static final n.e y = a("claim_types_supported", Collections.singletonList("normal"));
    static final n.e z = b("claims_supported");
    public final JSONObject J;

    public static class a extends Exception {
        private String mMissingField;

        static {
            Covode.recordClassIndex(106090);
        }

        public final String getMissingField() {
            return this.mMissingField;
        }

        public a(String str) {
            super("Missing mandatory configuration field: ".concat(String.valueOf(str)));
            this.mMissingField = str;
        }
    }

    static {
        Covode.recordClassIndex(106089);
        n.d dVar = new n.d("issuer", (byte) 0);
        f159696a = dVar;
        n.f a2 = a("authorization_endpoint");
        f159697b = a2;
        n.f a3 = a("jwks_uri");
        f159700e = a3;
        n.e b2 = b("response_types_supported");
        f159703h = b2;
        n.e b3 = b("subject_types_supported");
        f159707l = b3;
        n.e b4 = b("id_token_signing_alg_values_supported");
        f159708m = b4;
        K = Arrays.asList(dVar.f159710a, a2.f159710a, a3.f159710a, b2.f159712a, b3.f159712a, b4.f159712a);
    }

    private static n.e b(String str) {
        return new n.e(str);
    }

    private static n.f a(String str) {
        return new n.f(str, (byte) 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j(org.json.JSONObject r4) {
        /*
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = net.openid.appauth.p.a(r4)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            r3.J = r0
            java.util.List<java.lang.String> r0 = net.openid.appauth.j.K
            java.util.Iterator r2 = r0.iterator()
        L_0x0011:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0034
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            org.json.JSONObject r0 = r3.J
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L_0x002e
            org.json.JSONObject r0 = r3.J
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x002e
            goto L_0x0011
        L_0x002e:
            net.openid.appauth.j$a r0 = new net.openid.appauth.j$a
            r0.<init>(r1)
            throw r0
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.openid.appauth.j.<init>(org.json.JSONObject):void");
    }

    /* access modifiers changed from: package-private */
    public final <T> T a(n.b<T> bVar) {
        return (T) n.a(this.J, bVar);
    }

    private static n.a a(String str, boolean z2) {
        return new n.a(str, z2);
    }

    private static n.e a(String str, List<String> list) {
        return new n.e(str, list);
    }
}
