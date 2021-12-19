package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = new j();

    /* renamed from: a  reason: collision with root package name */
    public final String f49763a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49764b;

    static {
        Covode.recordClassIndex(31065);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        if (!p.a(this.f49763a, idToken.f49763a) || !p.a(this.f49764b, idToken.f49764b)) {
            return false;
        }
        return true;
    }

    public IdToken(String str, String str2) {
        r.b(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        r.b(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.f49763a = str;
        this.f49764b = str2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        b.a(parcel, 1, this.f49763a);
        b.a(parcel, 2, this.f49764b);
        b.b(parcel, a2);
    }
}
