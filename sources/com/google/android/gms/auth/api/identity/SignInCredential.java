package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.Arrays;

public final class SignInCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInCredential> CREATOR = new g();

    /* renamed from: a  reason: collision with root package name */
    public final String f49787a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49788b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49789c;

    /* renamed from: d  reason: collision with root package name */
    public final String f49790d;

    /* renamed from: e  reason: collision with root package name */
    public final Uri f49791e;

    /* renamed from: f  reason: collision with root package name */
    public final String f49792f;

    /* renamed from: g  reason: collision with root package name */
    public final String f49793g;

    static {
        Covode.recordClassIndex(31087);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49787a, this.f49788b, this.f49789c, this.f49790d, this.f49791e, this.f49792f, this.f49793g});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        if (!p.a(this.f49787a, signInCredential.f49787a) || !p.a(this.f49788b, signInCredential.f49788b) || !p.a(this.f49789c, signInCredential.f49789c) || !p.a(this.f49790d, signInCredential.f49790d) || !p.a(this.f49791e, signInCredential.f49791e) || !p.a(this.f49792f, signInCredential.f49792f) || !p.a(this.f49793g, signInCredential.f49793g)) {
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        b.a(parcel, 1, this.f49787a);
        b.a(parcel, 2, this.f49788b);
        b.a(parcel, 3, this.f49789c);
        b.a(parcel, 4, this.f49790d);
        b.a(parcel, 5, this.f49791e, i2);
        b.a(parcel, 6, this.f49792f);
        b.a(parcel, 7, this.f49793g);
        b.b(parcel, a2);
    }

    public SignInCredential(String str, String str2, String str3, String str4, Uri uri, String str5, String str6) {
        this.f49787a = r.a(str);
        this.f49788b = str2;
        this.f49789c = str3;
        this.f49790d = str4;
        this.f49791e = uri;
        this.f49792f = str5;
        this.f49793g = str6;
    }
}
