package com.ss.android.ugc.aweme.draft.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class DraftVideoSegment implements Parcelable {
    public static final Parcelable.Creator<DraftVideoSegment> CREATOR = new a();
    @c(a = "width")

    /* renamed from: a  reason: collision with root package name */
    public int f83150a;
    @c(a = "height")

    /* renamed from: b  reason: collision with root package name */
    public int f83151b;
    @c(a = "start")

    /* renamed from: c  reason: collision with root package name */
    public int f83152c;
    @c(a = "end")

    /* renamed from: d  reason: collision with root package name */
    public int f83153d;
    @c(a = "duration")

    /* renamed from: e  reason: collision with root package name */
    public int f83154e;
    @c(a = "speed")

    /* renamed from: f  reason: collision with root package name */
    public float f83155f;
    @c(a = "roatete")

    /* renamed from: g  reason: collision with root package name */
    public int f83156g;
    @c(a = "video_path")

    /* renamed from: h  reason: collision with root package name */
    public String f83157h;
    @c(a = "audio_path")

    /* renamed from: i  reason: collision with root package name */
    public String f83158i;
    @c(a = "reverse_path")

    /* renamed from: j  reason: collision with root package name */
    public String f83159j;
    @c(a = "temp_path")

    /* renamed from: k  reason: collision with root package name */
    public String f83160k;

    static {
        Covode.recordClassIndex(51861);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftVideoSegment)) {
            return false;
        }
        DraftVideoSegment draftVideoSegment = (DraftVideoSegment) obj;
        return this.f83150a == draftVideoSegment.f83150a && this.f83151b == draftVideoSegment.f83151b && this.f83152c == draftVideoSegment.f83152c && this.f83153d == draftVideoSegment.f83153d && this.f83154e == draftVideoSegment.f83154e && Float.compare(this.f83155f, draftVideoSegment.f83155f) == 0 && this.f83156g == draftVideoSegment.f83156g && l.a(this.f83157h, draftVideoSegment.f83157h) && l.a(this.f83158i, draftVideoSegment.f83158i) && l.a(this.f83159j, draftVideoSegment.f83159j) && l.a(this.f83160k, draftVideoSegment.f83160k);
    }

    public final String toString() {
        return "DraftVideoSegment(width=" + this.f83150a + ", height=" + this.f83151b + ", start=" + this.f83152c + ", end=" + this.f83153d + ", duration=" + this.f83154e + ", speed=" + this.f83155f + ", rotate=" + this.f83156g + ", videoPath=" + this.f83157h + ", audioPath=" + this.f83158i + ", reversePath=" + this.f83159j + ", tempVideoPath=" + this.f83160k + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeInt(this.f83150a);
        parcel.writeInt(this.f83151b);
        parcel.writeInt(this.f83152c);
        parcel.writeInt(this.f83153d);
        parcel.writeInt(this.f83154e);
        parcel.writeFloat(this.f83155f);
        parcel.writeInt(this.f83156g);
        parcel.writeString(this.f83157h);
        parcel.writeString(this.f83158i);
        parcel.writeString(this.f83159j);
        parcel.writeString(this.f83160k);
    }

    public static class a implements Parcelable.Creator<DraftVideoSegment> {
        static {
            Covode.recordClassIndex(51862);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DraftVideoSegment[] newArray(int i2) {
            return new DraftVideoSegment[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DraftVideoSegment createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new DraftVideoSegment(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    private /* synthetic */ DraftVideoSegment() {
        this(0, 0, 0, 0, 0, 1.0f, 0, "", null, null, null);
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int floatToIntBits = ((((((((((((this.f83150a * 31) + this.f83151b) * 31) + this.f83152c) * 31) + this.f83153d) * 31) + this.f83154e) * 31) + Float.floatToIntBits(this.f83155f)) * 31) + this.f83156g) * 31;
        String str = this.f83157h;
        int i5 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (floatToIntBits + i2) * 31;
        String str2 = this.f83158i;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        String str3 = this.f83159j;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i8 = (i7 + i4) * 31;
        String str4 = this.f83160k;
        if (str4 != null) {
            i5 = str4.hashCode();
        }
        return i8 + i5;
    }

    public DraftVideoSegment(int i2, int i3, int i4, int i5, int i6, float f2, int i7, String str, String str2, String str3, String str4) {
        l.d(str, "");
        this.f83150a = i2;
        this.f83151b = i3;
        this.f83152c = i4;
        this.f83153d = i5;
        this.f83154e = i6;
        this.f83155f = f2;
        this.f83156g = i7;
        this.f83157h = str;
        this.f83158i = str2;
        this.f83159j = str3;
        this.f83160k = str4;
    }
}
