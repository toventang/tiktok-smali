package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.facebook.CustomTabMainActivity;
import com.facebook.c;
import com.facebook.internal.ad;
import com.facebook.internal.f;
import com.facebook.internal.g;
import com.facebook.login.LoginClient;
import com.facebook.m;
import org.json.JSONException;
import org.json.JSONObject;

public class CustomTabLoginMethodHandler extends WebLoginMethodHandler {
    public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new Parcelable.Creator() {
        /* class com.facebook.login.CustomTabLoginMethodHandler.AnonymousClass1 */

        static {
            Covode.recordClassIndex(29410);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
            return new CustomTabLoginMethodHandler[i2];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new CustomTabLoginMethodHandler(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public static boolean f48756a;

    /* renamed from: d  reason: collision with root package name */
    private String f48757d;

    /* renamed from: e  reason: collision with root package name */
    private String f48758e;

    /* renamed from: f  reason: collision with root package name */
    private String f48759f;

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    public final String a() {
        return "custom_tab";
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.login.WebLoginMethodHandler
    public final String d() {
        return "chrome_custom_tab";
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.WebLoginMethodHandler
    public final c b() {
        return c.CHROME_CUSTOM_TAB;
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.login.WebLoginMethodHandler
    public final String c() {
        return this.f48759f;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final /* bridge */ /* synthetic */ boolean e() {
        return super.e();
    }

    static {
        Covode.recordClassIndex(29409);
    }

    CustomTabLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f48759f = "";
        this.f48758e = parcel.readString();
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.login.LoginMethodHandler
    public final void a(JSONObject jSONObject) {
        jSONObject.put("7_challenge", this.f48758e);
    }

    CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.f48759f = "";
        this.f48758e = ad.b();
        f48756a = false;
        this.f48759f = g.a(super.c());
    }

    private boolean a(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string == null) {
                return false;
            }
            return new JSONObject(string).getString("7_challenge").equals(this.f48758e);
        } catch (JSONException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    public final int a(LoginClient.Request request) {
        if (this.f48759f.isEmpty()) {
            return 0;
        }
        Bundle a2 = a(b(request), request);
        if (f48756a) {
            a2.putString("cct_over_app_switch", "1");
        }
        if (m.f48923i) {
            a.a(f.a("oauth", a2));
        }
        Intent intent = new Intent(this.f48844c.f48801c.getActivity(), CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f46509a, "oauth");
        intent.putExtra(CustomTabMainActivity.f46510b, a2);
        String str = CustomTabMainActivity.f46511c;
        String str2 = this.f48757d;
        if (str2 == null) {
            str2 = g.a();
            this.f48757d = str2;
        }
        intent.putExtra(str, str2);
        this.f48844c.f48801c.startActivityForResult(intent, 1);
        return 1;
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.f48758e);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d2  */
    @Override // com.facebook.login.LoginMethodHandler
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r11, int r12, android.content.Intent r13) {
        /*
        // Method dump skipped, instructions count: 233
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.CustomTabLoginMethodHandler.a(int, int, android.content.Intent):boolean");
    }
}
