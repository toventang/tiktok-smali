package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new g();

    /* renamed from: a  reason: collision with root package name */
    public GoogleSignInAccount f49838a;

    /* renamed from: b  reason: collision with root package name */
    private String f49839b;

    /* renamed from: c  reason: collision with root package name */
    private String f49840c;

    static {
        Covode.recordClassIndex(31103);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        b.a(parcel, 4, this.f49839b);
        b.a(parcel, 7, this.f49838a, i2);
        b.a(parcel, 8, this.f49840c);
        b.b(parcel, a2);
    }

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f49838a = googleSignInAccount;
        this.f49839b = r.a(str, (Object) "8.3 and 8.4 SDKs require non-null email");
        this.f49840c = r.a(str2, (Object) "8.3 and 8.4 SDKs require non-null userId");
    }
}
