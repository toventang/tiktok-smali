package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.e;
import com.facebook.internal.g;
import com.facebook.internal.y;
import com.facebook.login.LoginClient;
import com.facebook.m;
import java.util.List;

class KatanaProxyLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Parcelable.Creator<KatanaProxyLoginMethodHandler> CREATOR = new Parcelable.Creator<KatanaProxyLoginMethodHandler>() {
        /* class com.facebook.login.KatanaProxyLoginMethodHandler.AnonymousClass1 */

        static {
            Covode.recordClassIndex(29430);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ KatanaProxyLoginMethodHandler[] newArray(int i2) {
            return new KatanaProxyLoginMethodHandler[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ KatanaProxyLoginMethodHandler createFromParcel(Parcel parcel) {
            return new KatanaProxyLoginMethodHandler(parcel);
        }
    };

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    public final String a() {
        return "katana_proxy_auth";
    }

    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final boolean e() {
        return true;
    }

    static {
        Covode.recordClassIndex(29429);
    }

    KatanaProxyLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    KatanaProxyLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.NativeAppLoginMethodHandler, com.facebook.login.LoginMethodHandler
    public final int a(LoginClient.Request request) {
        boolean z;
        d dVar = request.f48811a;
        if (!m.f48924j || g.a() == null || !dVar.allowsCustomTabAuth) {
            z = false;
        } else {
            z = true;
        }
        String e2 = LoginClient.e();
        this.f48844c.f48801c.getActivity();
        List<Intent> a2 = y.a(request.f48814d, request.f48812b, e2, request.a(), request.f48813c, a(request.f48815e), request.f48818h, z);
        a("e2e", e2);
        for (int i2 = 0; i2 < a2.size(); i2++) {
            if (a(a2.get(i2), e.b.Login.toRequestCode())) {
                return i2 + 1;
            }
        }
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
    }
}
