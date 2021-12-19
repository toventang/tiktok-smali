package com.ss.android.ugc.gamora.recorder.localmedia;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class LocalMediaArgument implements Parcelable {
    public static final a CREATOR = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f148033a;

    /* renamed from: b  reason: collision with root package name */
    public final int f148034b;

    /* renamed from: c  reason: collision with root package name */
    public final int f148035c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f148036d;

    /* renamed from: e  reason: collision with root package name */
    public final int f148037e;

    /* renamed from: f  reason: collision with root package name */
    public final long f148038f;

    /* renamed from: g  reason: collision with root package name */
    public final int f148039g;

    /* renamed from: h  reason: collision with root package name */
    public final int f148040h;

    /* renamed from: i  reason: collision with root package name */
    public final int f148041i;

    /* renamed from: j  reason: collision with root package name */
    public final int f148042j;

    static {
        Covode.recordClassIndex(97587);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalMediaArgument)) {
            return false;
        }
        LocalMediaArgument localMediaArgument = (LocalMediaArgument) obj;
        return this.f148033a == localMediaArgument.f148033a && this.f148034b == localMediaArgument.f148034b && this.f148035c == localMediaArgument.f148035c && this.f148036d == localMediaArgument.f148036d && this.f148037e == localMediaArgument.f148037e && this.f148038f == localMediaArgument.f148038f && this.f148039g == localMediaArgument.f148039g && this.f148040h == localMediaArgument.f148040h && this.f148041i == localMediaArgument.f148041i && this.f148042j == localMediaArgument.f148042j;
    }

    public final String toString() {
        return "LocalMediaArgument(chooseRequestCode=" + this.f148033a + ", requestCode=" + this.f148034b + ", supportFlag=" + this.f148035c + ", enableMultiVideo=" + this.f148036d + ", chooseScene=" + this.f148037e + ", minDuration=" + this.f148038f + ", minPhotoCount=" + this.f148039g + ", maxPhotoCount=" + this.f148040h + ", minVideoCount=" + this.f148041i + ", maxVideoCount=" + this.f148042j + ")";
    }

    public static final class a implements Parcelable.Creator<LocalMediaArgument> {
        static {
            Covode.recordClassIndex(97588);
        }

        private a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LocalMediaArgument[] newArray(int i2) {
            return new LocalMediaArgument[i2];
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LocalMediaArgument createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new LocalMediaArgument(parcel);
        }
    }

    public final int hashCode() {
        int i2 = ((((this.f148033a * 31) + this.f148034b) * 31) + this.f148035c) * 31;
        boolean z = this.f148036d;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        long j2 = this.f148038f;
        return ((((((((((((i2 + i3) * 31) + this.f148037e) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f148039g) * 31) + this.f148040h) * 31) + this.f148041i) * 31) + this.f148042j;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LocalMediaArgument(android.os.Parcel r13) {
        /*
            r12 = this;
            java.lang.String r0 = ""
            h.f.b.l.d(r13, r0)
            int r1 = r13.readInt()
            int r2 = r13.readInt()
            int r3 = r13.readInt()
            byte r0 = r13.readByte()
            if (r0 == 0) goto L_0x0036
            r0 = 1
            r4 = 1
        L_0x0019:
            int r5 = r13.readInt()
            long r6 = r13.readLong()
            int r8 = r13.readInt()
            int r9 = r13.readInt()
            int r10 = r13.readInt()
            int r11 = r13.readInt()
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9, r10, r11)
            return
        L_0x0036:
            r0 = 0
            r4 = 0
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.localmedia.LocalMediaArgument.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeInt(this.f148033a);
        parcel.writeInt(this.f148034b);
        parcel.writeInt(this.f148035c);
        parcel.writeByte(this.f148036d ? (byte) 1 : 0);
        parcel.writeInt(this.f148037e);
        parcel.writeLong(this.f148038f);
        parcel.writeInt(this.f148039g);
        parcel.writeInt(this.f148040h);
        parcel.writeInt(this.f148041i);
        parcel.writeInt(this.f148042j);
    }

    public LocalMediaArgument(int i2, int i3, int i4, boolean z, int i5, long j2, int i6, int i7, int i8, int i9) {
        this.f148033a = i2;
        this.f148034b = i3;
        this.f148035c = i4;
        this.f148036d = z;
        this.f148037e = i5;
        this.f148038f = j2;
        this.f148039g = i6;
        this.f148040h = i7;
        this.f148041i = i8;
        this.f148042j = i9;
    }
}
