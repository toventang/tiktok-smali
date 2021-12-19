package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.kakao.usermgmt.StringSet;
import java.util.Arrays;

public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new l();

    /* renamed from: a  reason: collision with root package name */
    public final String f49946a;

    /* renamed from: b  reason: collision with root package name */
    private final int f49947b;

    /* renamed from: c  reason: collision with root package name */
    private final long f49948c;

    static {
        Covode.recordClassIndex(31177);
    }

    public final long a() {
        long j2 = this.f49948c;
        if (j2 == -1) {
            return (long) this.f49947b;
        }
        return j2;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49946a, Long.valueOf(a())});
    }

    public String toString() {
        return p.a(this).a(StringSet.name, this.f49946a).a("version", Long.valueOf(a())).toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            String str = this.f49946a;
            if (((str == null || !str.equals(feature.f49946a)) && (this.f49946a != null || feature.f49946a != null)) || a() != feature.a()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public Feature(String str, long j2) {
        this.f49946a = str;
        this.f49948c = j2;
        this.f49947b = -1;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        b.a(parcel, 1, this.f49946a);
        b.b(parcel, 2, this.f49947b);
        b.a(parcel, 3, a());
        b.b(parcel, a2);
    }

    public Feature(String str, int i2, long j2) {
        this.f49946a = str;
        this.f49947b = i2;
        this.f49948c = j2;
    }
}
