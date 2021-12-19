package net.openid.appauth;

import android.content.Intent;
import android.net.Uri;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.Collections;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class e extends Exception {
    public final int code;
    public final String error;
    public final String errorDescription;
    public final Uri errorUri;
    public final int type;

    static {
        Covode.recordClassIndex(106075);
    }

    public final int hashCode() {
        return ((this.type + 31) * 31) + this.code;
    }

    public final Intent toIntent() {
        Intent intent = new Intent();
        intent.putExtra("net.openid.appauth.AuthorizationException", toJsonString());
        return intent;
    }

    public final String toJsonString() {
        return toJson().toString();
    }

    public final String toString() {
        return "AuthorizationException: " + toJsonString();
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final e f159616a = e.generalEx(0, "Invalid discovery document");

        /* renamed from: b  reason: collision with root package name */
        public static final e f159617b = e.generalEx(1, "User cancelled flow");

        /* renamed from: c  reason: collision with root package name */
        public static final e f159618c = e.generalEx(2, "Flow cancelled programmatically");

        /* renamed from: d  reason: collision with root package name */
        public static final e f159619d = e.generalEx(3, "Network error");

        /* renamed from: e  reason: collision with root package name */
        public static final e f159620e = e.generalEx(4, "Server error");

        /* renamed from: f  reason: collision with root package name */
        public static final e f159621f = e.generalEx(5, "JSON deserialization error");

        /* renamed from: g  reason: collision with root package name */
        public static final e f159622g = e.generalEx(6, "Token response construction error");

        /* renamed from: h  reason: collision with root package name */
        public static final e f159623h = e.generalEx(7, "Invalid registration response");

        static {
            Covode.recordClassIndex(106077);
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final e f159624a;

        /* renamed from: b  reason: collision with root package name */
        public static final e f159625b;

        /* renamed from: c  reason: collision with root package name */
        public static final e f159626c;

        /* renamed from: d  reason: collision with root package name */
        public static final e f159627d;

        /* renamed from: e  reason: collision with root package name */
        public static final e f159628e;

        /* renamed from: f  reason: collision with root package name */
        public static final e f159629f;

        /* renamed from: g  reason: collision with root package name */
        public static final e f159630g;

        /* renamed from: h  reason: collision with root package name */
        public static final e f159631h;

        /* renamed from: i  reason: collision with root package name */
        static final Map<String, e> f159632i;

        static {
            Covode.recordClassIndex(106078);
            e eVar = e.tokenEx(LiveNetAdaptiveHurryTimeSetting.DEFAULT, "invalid_request");
            f159624a = eVar;
            e eVar2 = e.tokenEx(2001, "invalid_client");
            f159625b = eVar2;
            e eVar3 = e.tokenEx(2002, "invalid_grant");
            f159626c = eVar3;
            e eVar4 = e.tokenEx(2003, "unauthorized_client");
            f159627d = eVar4;
            e eVar5 = e.tokenEx(2004, "unsupported_grant_type");
            f159628e = eVar5;
            e eVar6 = e.tokenEx(2005, "invalid_scope");
            f159629f = eVar6;
            e eVar7 = e.tokenEx(2006, null);
            f159630g = eVar7;
            e eVar8 = e.tokenEx(2007, null);
            f159631h = eVar8;
            f159632i = e.exceptionMapByString(eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8);
        }
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        n.a(jSONObject, StringSet.type, this.type);
        n.a(jSONObject, "code", this.code);
        n.b(jSONObject, "error", this.error);
        n.b(jSONObject, "errorDescription", this.errorDescription);
        Uri uri = this.errorUri;
        p.a(jSONObject, "json must not be null");
        p.a((Object) "errorUri", (Object) "field must not be null");
        if (uri != null) {
            try {
                jSONObject.put("errorUri", uri.toString());
            } catch (JSONException e2) {
                throw new IllegalStateException("JSONException thrown in violation of contract", e2);
            }
        }
        return jSONObject;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final e f159605a;

        /* renamed from: b  reason: collision with root package name */
        public static final e f159606b;

        /* renamed from: c  reason: collision with root package name */
        public static final e f159607c;

        /* renamed from: d  reason: collision with root package name */
        public static final e f159608d;

        /* renamed from: e  reason: collision with root package name */
        public static final e f159609e;

        /* renamed from: f  reason: collision with root package name */
        public static final e f159610f;

        /* renamed from: g  reason: collision with root package name */
        public static final e f159611g;

        /* renamed from: h  reason: collision with root package name */
        public static final e f159612h;

        /* renamed from: i  reason: collision with root package name */
        public static final e f159613i;

        /* renamed from: j  reason: collision with root package name */
        public static final e f159614j = e.generalEx(9, "Response state param did not match request state");

        /* renamed from: k  reason: collision with root package name */
        static final Map<String, e> f159615k;

        static {
            Covode.recordClassIndex(106076);
            e authEx = e.authEx(1000, "invalid_request");
            f159605a = authEx;
            e authEx2 = e.authEx(1001, "unauthorized_client");
            f159606b = authEx2;
            e authEx3 = e.authEx(1002, "access_denied");
            f159607c = authEx3;
            e authEx4 = e.authEx(1003, "unsupported_response_type");
            f159608d = authEx4;
            e authEx5 = e.authEx(1004, "invalid_scope");
            f159609e = authEx5;
            e authEx6 = e.authEx(1005, "server_error");
            f159610f = authEx6;
            e authEx7 = e.authEx(1006, "temporarily_unavailable");
            f159611g = authEx7;
            e authEx8 = e.authEx(1007, null);
            f159612h = authEx8;
            e authEx9 = e.authEx(1008, null);
            f159613i = authEx9;
            f159615k = e.exceptionMapByString(authEx, authEx2, authEx3, authEx4, authEx5, authEx6, authEx7, authEx8, authEx9);
        }
    }

    public static e fromJson(String str) {
        p.a(str, (Object) "jsonStr cannot be null or empty");
        return fromJson(new JSONObject(str));
    }

    public static e fromIntent(Intent intent) {
        p.a(intent);
        if (!intent.hasExtra("net.openid.appauth.AuthorizationException")) {
            return null;
        }
        try {
            return fromJson(net_openid_appauth_AuthorizationException_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "net.openid.appauth.AuthorizationException"));
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Intent contains malformed exception data", e2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof e)) {
            e eVar = (e) obj;
            if (this.type == eVar.type && this.code == eVar.code) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static Map<String, e> exceptionMapByString(e... eVarArr) {
        int i2;
        if (eVarArr != null) {
            i2 = eVarArr.length;
        } else {
            i2 = 0;
        }
        androidx.c.a aVar = new androidx.c.a(i2);
        if (eVarArr != null) {
            for (e eVar : eVarArr) {
                String str = eVar.error;
                if (str != null) {
                    aVar.put(str, eVar);
                }
            }
        }
        return Collections.unmodifiableMap(aVar);
    }

    public static e fromJson(JSONObject jSONObject) {
        p.a(jSONObject, "json cannot be null");
        return new e(jSONObject.getInt(StringSet.type), jSONObject.getInt("code"), n.b(jSONObject, "error"), n.b(jSONObject, "errorDescription"), n.d(jSONObject, "errorUri"), null);
    }

    public static e fromOAuthRedirect(Uri uri) {
        Uri uri2;
        String queryParameter = uri.getQueryParameter("error");
        String queryParameter2 = uri.getQueryParameter("error_description");
        String queryParameter3 = uri.getQueryParameter("error_uri");
        e eVar = a.f159615k.get(queryParameter);
        if (eVar == null) {
            eVar = a.f159613i;
        }
        int i2 = eVar.type;
        int i3 = eVar.code;
        if (queryParameter2 == null) {
            queryParameter2 = eVar.errorDescription;
        }
        if (queryParameter3 != null) {
            uri2 = Uri.parse(queryParameter3);
        } else {
            uri2 = eVar.errorUri;
        }
        return new e(i2, i3, queryParameter, queryParameter2, uri2, null);
    }

    public static String net_openid_appauth_AuthorizationException_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static e authEx(int i2, String str) {
        return new e(1, i2, str, null, null, null);
    }

    public static e fromTemplate(e eVar, Throwable th) {
        return new e(eVar.type, eVar.code, eVar.error, eVar.errorDescription, eVar.errorUri, th);
    }

    public static e generalEx(int i2, String str) {
        return new e(0, i2, null, str, null, null);
    }

    public static e registrationEx(int i2, String str) {
        return new e(4, i2, str, null, null, null);
    }

    public static e tokenEx(int i2, String str) {
        return new e(2, i2, str, null, null, null);
    }

    public static e fromOAuthTemplate(e eVar, String str, String str2, Uri uri) {
        String str3 = str;
        String str4 = str2;
        Uri uri2 = uri;
        int i2 = eVar.type;
        int i3 = eVar.code;
        if (str3 == null) {
            str3 = eVar.error;
        }
        if (str4 == null) {
            str4 = eVar.errorDescription;
        }
        if (uri2 == null) {
            uri2 = eVar.errorUri;
        }
        return new e(i2, i3, str3, str4, uri2, null);
    }

    public e(int i2, int i3, String str, String str2, Uri uri, Throwable th) {
        super(str2, th);
        this.type = i2;
        this.code = i3;
        this.error = str;
        this.errorDescription = str2;
        this.errorUri = uri;
    }
}
