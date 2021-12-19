package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.facebook.c;
import com.facebook.internal.ad;
import com.facebook.internal.af;
import com.facebook.internal.k;
import com.facebook.j;
import com.facebook.login.LoginClient;

class WebViewLoginMethodHandler extends WebLoginMethodHandler {
    public static final Parcelable.Creator<WebViewLoginMethodHandler> CREATOR = new Parcelable.Creator<WebViewLoginMethodHandler>() {
        /* class com.facebook.login.WebViewLoginMethodHandler.AnonymousClass2 */

        static {
            Covode.recordClassIndex(29453);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ WebViewLoginMethodHandler[] newArray(int i2) {
            return new WebViewLoginMethodHandler[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ WebViewLoginMethodHandler createFromParcel(Parcel parcel) {
            return new WebViewLoginMethodHandler(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private af f48846a;

    /* renamed from: d  reason: collision with root package name */
    private String f48847d;

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    public final String a() {
        return "web_view";
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    public final boolean f() {
        return true;
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.WebLoginMethodHandler
    public final c b() {
        return c.WEB_VIEW;
    }

    static {
        Covode.recordClassIndex(29451);
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    public final void v_() {
        af afVar = this.f48846a;
        if (afVar != null) {
            afVar.cancel();
            this.f48846a = null;
        }
    }

    static class a extends af.a {

        /* renamed from: f  reason: collision with root package name */
        String f48850f;

        /* renamed from: g  reason: collision with root package name */
        String f48851g;

        /* renamed from: h  reason: collision with root package name */
        String f48852h = "fbconnect://success";

        /* renamed from: i  reason: collision with root package name */
        d f48853i = d.NATIVE_WITH_FALLBACK;

        static {
            Covode.recordClassIndex(29454);
        }

        @Override // com.facebook.internal.af.a
        public final af a() {
            Bundle bundle = this.f48548e;
            bundle.putString("redirect_uri", this.f48852h);
            bundle.putString("client_id", this.f48545b);
            bundle.putString("e2e", this.f48850f);
            bundle.putString("response_type", "token,signed_request,graph_domain");
            bundle.putString("return_scopes", "true");
            bundle.putString("auth_type", this.f48851g);
            bundle.putString("login_behavior", this.f48853i.name());
            return af.a(this.f48544a, "oauth", bundle, this.f48546c, this.f48547d);
        }

        public a(Context context, String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
        }
    }

    WebViewLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    WebViewLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f48847d = parcel.readString();
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    public final int a(final LoginClient.Request request) {
        String str;
        Bundle b2 = b(request);
        AnonymousClass1 r3 = new af.c() {
            /* class com.facebook.login.WebViewLoginMethodHandler.AnonymousClass1 */

            static {
                Covode.recordClassIndex(29452);
            }

            @Override // com.facebook.internal.af.c
            public final void a(Bundle bundle, j jVar) {
                WebViewLoginMethodHandler.this.b(request, bundle, jVar);
            }
        };
        String e2 = LoginClient.e();
        this.f48847d = e2;
        a("e2e", e2);
        e activity = this.f48844c.f48801c.getActivity();
        boolean d2 = ad.d(activity);
        a aVar = new a(activity, request.f48814d, b2);
        aVar.f48850f = this.f48847d;
        if (d2) {
            str = "fbconnect://chrome_os_success";
        } else {
            str = "fbconnect://success";
        }
        aVar.f48852h = str;
        aVar.f48851g = request.f48818h;
        aVar.f48853i = request.f48811a;
        aVar.f48547d = r3;
        this.f48846a = aVar.a();
        k kVar = new k();
        kVar.setRetainInstance(true);
        kVar.f48611a = this.f48846a;
        kVar.show(activity.getSupportFragmentManager(), "FacebookDialogFragment");
        return 1;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.f48847d);
    }

    /* access modifiers changed from: package-private */
    public final void b(LoginClient.Request request, Bundle bundle, j jVar) {
        super.a(request, bundle, jVar);
    }
}
