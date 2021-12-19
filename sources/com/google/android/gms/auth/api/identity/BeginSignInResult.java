package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

public final class BeginSignInResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInResult> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    public final PendingIntent f49786a;

    static {
        Covode.recordClassIndex(31086);
    }

    public BeginSignInResult(PendingIntent pendingIntent) {
        this.f49786a = (PendingIntent) r.a(pendingIntent);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        b.a(parcel, 1, this.f49786a, i2);
        b.b(parcel, a2);
    }
}
