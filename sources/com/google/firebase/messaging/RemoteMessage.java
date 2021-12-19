package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.Map;

public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new p();

    /* renamed from: a  reason: collision with root package name */
    public Bundle f54596a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, String> f54597b;

    static {
        Covode.recordClassIndex(33874);
    }

    public RemoteMessage(Bundle bundle) {
        this.f54596a = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        b.a(parcel, 2, this.f54596a);
        b.b(parcel, a2);
    }
}
