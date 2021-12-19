package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new v();

    /* renamed from: a  reason: collision with root package name */
    public final String f49958a;

    /* renamed from: b  reason: collision with root package name */
    private final int f49959b;

    public final String toString() {
        return this.f49958a;
    }

    public final int hashCode() {
        return this.f49958a.hashCode();
    }

    static {
        Covode.recordClassIndex(31184);
    }

    public Scope(String str) {
        this(1, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f49958a.equals(((Scope) obj).f49958a);
    }

    Scope(int i2, String str) {
        r.a(str, (Object) "scopeUri must not be null or empty");
        this.f49959b = i2;
        this.f49958a = str;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        b.b(parcel, 1, this.f49959b);
        b.a(parcel, 2, this.f49958a);
        b.b(parcel, a2);
    }
}
