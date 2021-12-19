package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.Iterator;

public final class zzan extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzan> CREATOR = new o();

    /* renamed from: a  reason: collision with root package name */
    final Bundle f52060a;

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new n(this);
    }

    public final String toString() {
        return this.f52060a.toString();
    }

    static {
        Covode.recordClassIndex(32387);
    }

    public final Bundle a() {
        return new Bundle(this.f52060a);
    }

    zzan(Bundle bundle) {
        this.f52060a = bundle;
    }

    /* access modifiers changed from: package-private */
    public final String d(String str) {
        return this.f52060a.getString(str);
    }

    /* access modifiers changed from: package-private */
    public final Long b(String str) {
        return Long.valueOf(this.f52060a.getLong(str));
    }

    /* access modifiers changed from: package-private */
    public final Double c(String str) {
        return Double.valueOf(this.f52060a.getDouble(str));
    }

    /* access modifiers changed from: package-private */
    public final Object a(String str) {
        return a(this.f52060a, str);
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        b.a(parcel, 2, a());
        b.b(parcel, a2);
    }
}
