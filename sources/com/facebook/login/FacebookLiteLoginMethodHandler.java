package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.e;
import com.facebook.internal.y;
import com.facebook.login.LoginClient;

class FacebookLiteLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Parcelable.Creator<FacebookLiteLoginMethodHandler> CREATOR = new Parcelable.Creator<FacebookLiteLoginMethodHandler>() {
        /* class com.facebook.login.FacebookLiteLoginMethodHandler.AnonymousClass1 */

        static {
            Covode.recordClassIndex(29424);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FacebookLiteLoginMethodHandler[] newArray(int i2) {
            return new FacebookLiteLoginMethodHandler[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FacebookLiteLoginMethodHandler createFromParcel(Parcel parcel) {
            return new FacebookLiteLoginMethodHandler(parcel);
        }
    };

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    public final String a() {
        return "fb_lite_login";
    }

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(29423);
    }

    FacebookLiteLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    FacebookLiteLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.NativeAppLoginMethodHandler, com.facebook.login.LoginMethodHandler
    public final int a(LoginClient.Request request) {
        String e2 = LoginClient.e();
        Intent a2 = y.a(this.f48844c.f48801c.getActivity(), request.f48814d, request.f48812b, e2, request.a(), request.f48813c, a(request.f48815e), request.f48818h);
        a("e2e", e2);
        if (a(a2, e.b.Login.toRequestCode())) {
            return 1;
        }
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
    }
}
