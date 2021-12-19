package com.ss.android.ugc.aweme.ecommerce.address.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;

public final class Region implements Parcelable {
    public static final Parcelable.Creator<Region> CREATOR = new b();

    /* renamed from: d  reason: collision with root package name */
    public static final a f84319d = new a((byte) 0);
    @c(a = StringSet.name)

    /* renamed from: a  reason: collision with root package name */
    public final String f84320a;
    @c(a = "geoname_id")

    /* renamed from: b  reason: collision with root package name */
    public final String f84321b;
    @c(a = "code")

    /* renamed from: c  reason: collision with root package name */
    public final String f84322c;

    static {
        Covode.recordClassIndex(52572);
    }

    public Region() {
        this(null, null, null, 7);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Region)) {
            return false;
        }
        Region region = (Region) obj;
        return l.a(this.f84320a, region.f84320a) && l.a(this.f84321b, region.f84321b) && l.a(this.f84322c, region.f84322c);
    }

    public final int hashCode() {
        String str = this.f84320a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f84321b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f84322c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "Region(name=" + this.f84320a + ", geoNameId=" + this.f84321b + ", code=" + this.f84322c + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f84320a);
        parcel.writeString(this.f84321b);
        parcel.writeString(this.f84322c);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52573);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static boolean a(Region region, Region region2) {
            if (!(region == null || region2 == null)) {
                if (region.f84322c != null && l.a((Object) region.f84322c, (Object) region2.f84322c)) {
                    return true;
                }
                if (region.f84321b == null || !l.a((Object) region.f84321b, (Object) region2.f84321b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    public static class b implements Parcelable.Creator<Region> {
        static {
            Covode.recordClassIndex(52574);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Region[] newArray(int i2) {
            return new Region[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Region createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new Region(parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    public Region(String str, String str2, String str3) {
        this.f84320a = str;
        this.f84321b = str2;
        this.f84322c = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Region(String str, String str2, String str3, int i2) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3);
    }
}
