package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new w();

    /* renamed from: a  reason: collision with root package name */
    public GoogleSignInOptions f49847a;

    /* renamed from: b  reason: collision with root package name */
    private final String f49848b;

    static {
        Covode.recordClassIndex(31112);
    }

    public final int hashCode() {
        return new a().a(this.f49848b).a(this.f49847a).f49857a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f49848b.equals(signInConfiguration.f49848b)) {
            GoogleSignInOptions googleSignInOptions = this.f49847a;
            if (googleSignInOptions == null) {
                if (signInConfiguration.f49847a == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(signInConfiguration.f49847a)) {
                return true;
            }
        }
        return false;
    }

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f49848b = r.a(str);
        this.f49847a = googleSignInOptions;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        b.a(parcel, 2, this.f49848b);
        b.a(parcel, 5, this.f49847a, i2);
        b.b(parcel, a2);
    }
}
