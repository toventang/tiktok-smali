package com.ss.android.ugc.aweme.account.login.v2.a.a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import h.f.b.l;
import org.json.JSONObject;

public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final a f64158b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f64159a;

    /* renamed from: c  reason: collision with root package name */
    private final String f64160c;

    /* renamed from: d  reason: collision with root package name */
    private final String f64161d;

    /* renamed from: e  reason: collision with root package name */
    private final String f64162e;

    /* renamed from: f  reason: collision with root package name */
    private final String f64163f;

    static {
        Covode.recordClassIndex(39536);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39537);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final k a() {
        if (l.a((Object) this.f64161d, (Object) "mobile")) {
            return k.PHONE_SMS_CHANGE_PASSWORD;
        }
        return k.EMAIL_SMS_CHANGE_PASSWORD;
    }

    public final Bundle b() {
        String str;
        Bundle bundle = new Bundle();
        if (l.a((Object) this.f64161d, (Object) "mobile")) {
            str = "phone";
        } else {
            str = "email";
        }
        bundle.putString("platForm", str);
        String str2 = this.f64160c;
        if (str2 == null) {
            l.b();
        }
        bundle.putString("conditional_login_ticket", str2);
        bundle.putString("otp_type", this.f64161d);
        if (l.a((Object) this.f64161d, (Object) "mobile")) {
            bundle.putString("args_string_phone_number", this.f64162e);
        } else {
            bundle.putString("args_email", this.f64163f);
        }
        return bundle;
    }

    public g(JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        boolean z;
        boolean z2;
        String str4 = null;
        if (jSONObject != null) {
            str = jSONObject.optString("mobile", "");
        } else {
            str = null;
        }
        this.f64162e = str;
        if (jSONObject != null) {
            str2 = jSONObject.optString("email", "");
        } else {
            str2 = null;
        }
        this.f64163f = str2;
        if (jSONObject != null) {
            str3 = jSONObject.optString("conditional_login_ticket");
        } else {
            str3 = null;
        }
        this.f64160c = str3;
        str4 = jSONObject != null ? jSONObject.optString("otp_type") : str4;
        this.f64161d = str4;
        boolean z3 = true;
        if (str3 == null || str3.length() <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (str4 == null || str4.length() <= 0 || (!l.a((Object) str4, (Object) "email") && !l.a((Object) str4, (Object) "mobile"))) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f64159a = (!z || !z2) ? false : z3;
    }
}
