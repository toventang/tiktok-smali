package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.Arrays;

public final class Status extends AbstractSafeParcelable implements p, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new w();

    /* renamed from: a  reason: collision with root package name */
    public static final Status f49960a = new Status(0);

    /* renamed from: b  reason: collision with root package name */
    public static final Status f49961b = new Status(14);

    /* renamed from: c  reason: collision with root package name */
    public static final Status f49962c = new Status(8);

    /* renamed from: d  reason: collision with root package name */
    public static final Status f49963d = new Status(15);

    /* renamed from: e  reason: collision with root package name */
    public static final Status f49964e = new Status(16);

    /* renamed from: f  reason: collision with root package name */
    public static final Status f49965f = new Status(18);

    /* renamed from: j  reason: collision with root package name */
    private static final Status f49966j = new Status(17);

    /* renamed from: g  reason: collision with root package name */
    public final int f49967g;

    /* renamed from: h  reason: collision with root package name */
    public final String f49968h;

    /* renamed from: i  reason: collision with root package name */
    public final PendingIntent f49969i;

    /* renamed from: k  reason: collision with root package name */
    private final int f49970k;

    @Override // com.google.android.gms.common.api.p
    public final Status D_() {
        return this;
    }

    public final boolean b() {
        if (this.f49969i != null) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f49967g <= 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f49970k), Integer.valueOf(this.f49967g), this.f49968h, this.f49969i});
    }

    public final String toString() {
        p.a a2 = p.a(this);
        String str = this.f49968h;
        if (str == null) {
            str = g.a(this.f49967g);
        }
        return a2.a("statusCode", str).a("resolution", this.f49969i).toString();
    }

    static {
        Covode.recordClassIndex(31185);
    }

    public Status(int i2) {
        this(i2, null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f49970k != status.f49970k || this.f49967g != status.f49967g || !p.a(this.f49968h, status.f49968h) || !p.a(this.f49969i, status.f49969i)) {
            return false;
        }
        return true;
    }

    public Status(int i2, String str) {
        this(1, i2, str, null);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        b.b(parcel, 1, this.f49967g);
        b.a(parcel, 2, this.f49968h);
        b.a(parcel, 3, this.f49969i, i2);
        b.b(parcel, 1000, this.f49970k);
        b.b(parcel, a2);
    }

    public Status(int i2, String str, PendingIntent pendingIntent) {
        this(1, i2, str, pendingIntent);
    }

    Status(int i2, int i3, String str, PendingIntent pendingIntent) {
        this.f49970k = i2;
        this.f49967g = i3;
        this.f49968h = str;
        this.f49969i = pendingIntent;
    }
}
