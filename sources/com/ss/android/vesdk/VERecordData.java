package com.ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;

public class VERecordData implements Parcelable {
    public static final Parcelable.Creator<VERecordData> CREATOR = new Parcelable.Creator<VERecordData>() {
        /* class com.ss.android.vesdk.VERecordData.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99200);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VERecordData[] newArray(int i2) {
            return new VERecordData[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VERecordData createFromParcel(Parcel parcel) {
            return new VERecordData(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    static final String f150787a = VERecordData.class.getSimpleName();

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f150788f = {"counts", "audioLengths", "speeds", "musicStartTime", "encodeMode", "offset", "videoQuality", "random", "duatStartTime", "audioEffects", "newSync", "encodeMethod", "videoLengths"};

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f150789g = {"_frag_v", "_frag_a"};

    /* renamed from: b  reason: collision with root package name */
    public List<VERecordSegmentData> f150790b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f150791c;

    /* renamed from: d  reason: collision with root package name */
    public String f150792d;

    /* renamed from: e  reason: collision with root package name */
    public String f150793e;

    public int describeContents() {
        return 0;
    }

    private VERecordData() {
    }

    public static final class VERecordSegmentData implements Parcelable {
        public static final Parcelable.Creator<VERecordSegmentData> CREATOR = new Parcelable.Creator<VERecordSegmentData>() {
            /* class com.ss.android.vesdk.VERecordData.VERecordSegmentData.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99202);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ VERecordSegmentData[] newArray(int i2) {
                return new VERecordSegmentData[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ VERecordSegmentData createFromParcel(Parcel parcel) {
                return new VERecordSegmentData(parcel);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public String f150794a;

        /* renamed from: b  reason: collision with root package name */
        public String f150795b;

        /* renamed from: c  reason: collision with root package name */
        public long f150796c;

        /* renamed from: d  reason: collision with root package name */
        public long f150797d;

        /* renamed from: e  reason: collision with root package name */
        public float f150798e;

        /* renamed from: f  reason: collision with root package name */
        public float f150799f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public ROTATE_DEGREE f150800g;

        /* renamed from: h  reason: collision with root package name */
        public long f150801h;

        /* renamed from: i  reason: collision with root package name */
        public long f150802i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f150803j;

        /* renamed from: k  reason: collision with root package name */
        public long f150804k;

        /* renamed from: l  reason: collision with root package name */
        public long f150805l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f150806m;

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(99201);
        }

        protected VERecordSegmentData(Parcel parcel) {
            boolean z;
            this.f150794a = parcel.readString();
            this.f150795b = parcel.readString();
            this.f150796c = parcel.readLong();
            this.f150797d = parcel.readLong();
            this.f150799f = parcel.readFloat();
            this.f150798e = parcel.readFloat();
            this.f150800g = (ROTATE_DEGREE) parcel.readParcelable(ROTATE_DEGREE.class.getClassLoader());
            this.f150801h = parcel.readLong();
            this.f150802i = parcel.readLong();
            boolean z2 = true;
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f150803j = z;
            this.f150804k = parcel.readLong();
            this.f150805l = parcel.readLong();
            this.f150806m = parcel.readByte() == 0 ? false : z2;
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f150794a);
            parcel.writeString(this.f150795b);
            parcel.writeLong(this.f150796c);
            parcel.writeLong(this.f150797d);
            parcel.writeFloat(this.f150799f);
            parcel.writeFloat(this.f150798e);
            parcel.writeParcelable(this.f150800g, i2);
            parcel.writeLong(this.f150801h);
            parcel.writeLong(this.f150802i);
            parcel.writeByte(this.f150803j ? (byte) 1 : 0);
            parcel.writeLong(this.f150804k);
            parcel.writeLong(this.f150805l);
            parcel.writeByte(this.f150806m ? (byte) 1 : 0);
        }

        public VERecordSegmentData(String str, long j2, String str2, long j3, float f2, long j4, long j5, boolean z) {
            this.f150794a = str;
            this.f150795b = str2;
            this.f150796c = j2;
            this.f150797d = j3;
            this.f150798e = f2;
            this.f150801h = j4;
            this.f150804k = j4;
            this.f150802i = j5;
            this.f150805l = j5;
            this.f150803j = z;
        }
    }

    static {
        Covode.recordClassIndex(99199);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
        // Method dump skipped, instructions count: 149
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VERecordData.a():boolean");
    }

    protected VERecordData(Parcel parcel) {
        boolean z;
        this.f150790b = parcel.createTypedArrayList(VERecordSegmentData.CREATOR);
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f150791c = z;
        this.f150792d = parcel.readString();
        this.f150793e = parcel.readString();
    }

    public VERecordData(List<VERecordSegmentData> list, boolean z) {
        this.f150790b = list;
        this.f150791c = z;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.f150790b);
        parcel.writeByte(this.f150791c ? (byte) 1 : 0);
        parcel.writeString(this.f150792d);
        parcel.writeString(this.f150793e);
    }

    public final VERecordSegmentData a(int i2, VERecordData vERecordData) {
        List<VERecordSegmentData> list;
        String str = f150787a;
        an.a(str, "replaceSegmentData...");
        if (i2 < 0 || i2 >= this.f150790b.size() || (list = vERecordData.f150790b) == null || list.size() == 0) {
            an.d(str, "Parameter error");
            return null;
        }
        VERecordSegmentData remove = this.f150790b.remove(i2);
        long j2 = remove.f150796c;
        Iterator<VERecordSegmentData> it = vERecordData.f150790b.iterator();
        long j3 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            VERecordSegmentData next = it.next();
            if ((next.f150796c + j3) - j2 >= 0) {
                long j4 = j2 - j3;
                next.f150797d = j4;
                next.f150796c = j4;
                next.f150805l = j4;
                next.f150802i = j4;
                this.f150790b.add(i2, next);
                break;
            }
            this.f150790b.add(i2, next);
            j3 += next.f150796c;
            i2++;
        }
        return remove;
    }

    public final int a(long j2, long j3) {
        an.a(f150787a, "setTimeRange, start: " + j2 + " end: " + j3);
        if (j3 <= j2) {
            return -100;
        }
        long j4 = 0;
        for (VERecordSegmentData vERecordSegmentData : this.f150790b) {
            long j5 = vERecordSegmentData.f150802i - vERecordSegmentData.f150801h;
            if (j4 < j2 || j4 + j5 > j3) {
                if (j4 + j5 <= j2 || j4 >= j3) {
                    vERecordSegmentData.f150804k = 0;
                    vERecordSegmentData.f150805l = 0;
                    vERecordSegmentData.f150803j = false;
                } else {
                    long j6 = (j2 - j4) + vERecordSegmentData.f150801h;
                    long j7 = (j3 - j4) + vERecordSegmentData.f150801h;
                    if (j6 <= vERecordSegmentData.f150801h) {
                        j6 = vERecordSegmentData.f150801h;
                    }
                    vERecordSegmentData.f150804k = j6;
                    if (j7 > vERecordSegmentData.f150802i) {
                        j7 = vERecordSegmentData.f150802i;
                    }
                    vERecordSegmentData.f150805l = j7;
                }
            }
            j4 += j5;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0180, code lost:
        if (r0 <= 0) goto L_0x0182;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.vesdk.VERecordData a(com.ss.android.vesdk.runtime.e r30, boolean r31) {
        /*
        // Method dump skipped, instructions count: 544
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VERecordData.a(com.ss.android.vesdk.runtime.e, boolean):com.ss.android.vesdk.VERecordData");
    }
}
