package com.ss.android.ugc.aweme.tools.policysecurity;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class OriginalSoundUploadTask implements Parcelable {
    public static final Parcelable.Creator<OriginalSoundUploadTask> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f140992a;

    /* renamed from: b  reason: collision with root package name */
    public final String f140993b;

    /* renamed from: c  reason: collision with root package name */
    public final String f140994c;

    /* renamed from: d  reason: collision with root package name */
    public final long f140995d;

    /* renamed from: e  reason: collision with root package name */
    public final String f140996e;

    /* renamed from: f  reason: collision with root package name */
    public transient String f140997f;

    /* renamed from: g  reason: collision with root package name */
    public int f140998g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f140999h;

    /* renamed from: i  reason: collision with root package name */
    public int f141000i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f141001j;

    /* renamed from: k  reason: collision with root package name */
    public int f141002k;

    static {
        Covode.recordClassIndex(92046);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OriginalSoundUploadTask)) {
            return false;
        }
        OriginalSoundUploadTask originalSoundUploadTask = (OriginalSoundUploadTask) obj;
        return l.a(this.f140992a, originalSoundUploadTask.f140992a) && l.a(this.f140993b, originalSoundUploadTask.f140993b) && l.a(this.f140994c, originalSoundUploadTask.f140994c) && this.f140995d == originalSoundUploadTask.f140995d && l.a(this.f140996e, originalSoundUploadTask.f140996e) && l.a(this.f140997f, originalSoundUploadTask.f140997f) && this.f140998g == originalSoundUploadTask.f140998g && this.f140999h == originalSoundUploadTask.f140999h && this.f141000i == originalSoundUploadTask.f141000i && this.f141001j == originalSoundUploadTask.f141001j && this.f141002k == originalSoundUploadTask.f141002k;
    }

    public final String toString() {
        return "OriginalSoundUploadTask(awemeId=" + this.f140992a + ", vid=" + this.f140993b + ", originalSoundPath=" + this.f140994c + ", updateTime=" + this.f140995d + ", unionId=" + this.f140996e + ", audioVid=" + this.f140997f + ", matchFactors=" + this.f140998g + ", isDraft=" + this.f140999h + ", origin=" + this.f141000i + ", isBackup=" + this.f141001j + ", queryTimes=" + this.f141002k + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f140992a);
        parcel.writeString(this.f140993b);
        parcel.writeString(this.f140994c);
        parcel.writeLong(this.f140995d);
        parcel.writeString(this.f140996e);
        parcel.writeString(this.f140997f);
        parcel.writeInt(this.f140998g);
        parcel.writeInt(this.f140999h ? 1 : 0);
        parcel.writeInt(this.f141000i);
        parcel.writeInt(this.f141001j ? 1 : 0);
        parcel.writeInt(this.f141002k);
    }

    public static class a implements Parcelable.Creator<OriginalSoundUploadTask> {
        static {
            Covode.recordClassIndex(92047);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OriginalSoundUploadTask[] newArray(int i2) {
            return new OriginalSoundUploadTask[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OriginalSoundUploadTask createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            long readLong = parcel.readLong();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            int readInt = parcel.readInt();
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            int readInt2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new OriginalSoundUploadTask(readString, readString2, readString3, readLong, readString4, readString5, readInt, z2, readInt2, z, parcel.readInt());
        }
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        String str = this.f140992a;
        int i6 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = i2 * 31;
        String str2 = this.f140993b;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str3 = this.f140994c;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        long j2 = this.f140995d;
        int i9 = (((i8 + i4) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str4 = this.f140996e;
        if (str4 != null) {
            i5 = str4.hashCode();
        } else {
            i5 = 0;
        }
        int i10 = (i9 + i5) * 31;
        String str5 = this.f140997f;
        if (str5 != null) {
            i6 = str5.hashCode();
        }
        int i11 = (((i10 + i6) * 31) + this.f140998g) * 31;
        boolean z = this.f140999h;
        int i12 = 1;
        if (z) {
            z = true;
        }
        int i13 = z ? 1 : 0;
        int i14 = z ? 1 : 0;
        int i15 = z ? 1 : 0;
        int i16 = (((i11 + i13) * 31) + this.f141000i) * 31;
        if (!this.f141001j) {
            i12 = 0;
        }
        return ((i16 + i12) * 31) + this.f141002k;
    }

    public /* synthetic */ OriginalSoundUploadTask(String str, String str2, String str3, long j2, String str4, int i2, boolean z, int i3, boolean z2, int i4) {
        this(str, str2, str3, j2, str4, null, i2, z, i3, z2, i4);
    }

    public OriginalSoundUploadTask(String str, String str2, String str3, long j2, String str4, String str5, int i2, boolean z, int i3, boolean z2, int i4) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f140992a = str;
        this.f140993b = str2;
        this.f140994c = str3;
        this.f140995d = j2;
        this.f140996e = str4;
        this.f140997f = str5;
        this.f140998g = i2;
        this.f140999h = z;
        this.f141000i = i3;
        this.f141001j = z2;
        this.f141002k = i4;
    }
}
