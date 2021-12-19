package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    public int f49844a;

    /* renamed from: b  reason: collision with root package name */
    private final int f49845b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f49846c;

    static {
        Covode.recordClassIndex(31111);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        b.b(parcel, 1, this.f49845b);
        b.b(parcel, 2, this.f49844a);
        b.a(parcel, 3, this.f49846c);
        b.b(parcel, a2);
    }

    GoogleSignInOptionsExtensionParcelable(int i2, int i3, Bundle bundle) {
        this.f49845b = i2;
        this.f49844a = i3;
        this.f49846c = bundle;
    }
}
