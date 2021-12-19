package com.ss.android.ugc.asve.recorder;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class RecorderConcatResult implements Parcelable {
    public static final a CREATOR = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f62105a;

    /* renamed from: b  reason: collision with root package name */
    public final String f62106b;

    /* renamed from: c  reason: collision with root package name */
    public final String f62107c;

    static {
        Covode.recordClassIndex(38169);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecorderConcatResult)) {
            return false;
        }
        RecorderConcatResult recorderConcatResult = (RecorderConcatResult) obj;
        return this.f62105a == recorderConcatResult.f62105a && l.a(this.f62106b, recorderConcatResult.f62106b) && l.a(this.f62107c, recorderConcatResult.f62107c);
    }

    public final int hashCode() {
        int i2 = this.f62105a * 31;
        String str = this.f62106b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f62107c;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "RecorderConcatResult(ret=" + this.f62105a + ", videoPath=" + this.f62106b + ", audioPath=" + this.f62107c + ")";
    }

    public static final class a implements Parcelable.Creator<RecorderConcatResult> {
        static {
            Covode.recordClassIndex(38170);
        }

        private a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RecorderConcatResult[] newArray(int i2) {
            return new RecorderConcatResult[i2];
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RecorderConcatResult createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new RecorderConcatResult(parcel);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RecorderConcatResult(android.os.Parcel r5) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            h.f.b.l.d(r5, r3)
            int r2 = r5.readInt()
            java.lang.String r1 = r5.readString()
            if (r1 != 0) goto L_0x0012
            h.f.b.l.b()
        L_0x0012:
            h.f.b.l.b(r1, r3)
            java.lang.String r0 = r5.readString()
            if (r0 != 0) goto L_0x001e
            h.f.b.l.b()
        L_0x001e:
            h.f.b.l.b(r0, r3)
            r4.<init>(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.asve.recorder.RecorderConcatResult.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeInt(this.f62105a);
        parcel.writeString(this.f62106b);
        parcel.writeString(this.f62107c);
    }

    public RecorderConcatResult(int i2, String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f62105a = i2;
        this.f62106b = str;
        this.f62107c = str2;
    }
}
