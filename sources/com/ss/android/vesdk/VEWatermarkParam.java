package com.ss.android.vesdk;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class VEWatermarkParam implements Parcelable {
    public static final Parcelable.Creator<VEWatermarkParam> CREATOR = new Parcelable.Creator<VEWatermarkParam>() {
        /* class com.ss.android.vesdk.VEWatermarkParam.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99249);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEWatermarkParam[] newArray(int i2) {
            return new VEWatermarkParam[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEWatermarkParam createFromParcel(Parcel parcel) {
            return new VEWatermarkParam(parcel);
        }
    };
    public long duration = -1;
    private VEWatermarkEntity[] entities;
    public String extFile;
    public int height;
    public String[] images;
    public int interval;
    public VEWatermarkMask mask;
    public boolean needExtFile;
    public bk position = bk.TL_BR;
    public int rotation;
    public String[] secondHalfImages;
    public Bitmap waterMarkBitmap;
    public int width;
    public int xOffset;
    public int yOffset;

    public int describeContents() {
        return 0;
    }

    public static class VEWatermarkMask implements Parcelable {
        public static final Parcelable.Creator<VEWatermarkMask> CREATOR = new Parcelable.Creator<VEWatermarkMask>() {
            /* class com.ss.android.vesdk.VEWatermarkParam.VEWatermarkMask.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99253);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ VEWatermarkMask[] newArray(int i2) {
                return new VEWatermarkMask[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ VEWatermarkMask createFromParcel(Parcel parcel) {
                return new VEWatermarkMask(parcel);
            }
        };
        public int height;
        public String maskImage;
        public int width;
        public int xOffset;
        public int yOffset;

        public int describeContents() {
            return 0;
        }

        public VEWatermarkMask() {
        }

        static {
            Covode.recordClassIndex(99252);
        }

        protected VEWatermarkMask(Parcel parcel) {
            this.maskImage = parcel.readString();
            this.xOffset = parcel.readInt();
            this.yOffset = parcel.readInt();
            this.width = parcel.readInt();
            this.height = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.maskImage);
            parcel.writeInt(this.xOffset);
            parcel.writeInt(this.yOffset);
            parcel.writeInt(this.width);
            parcel.writeInt(this.height);
        }
    }

    public static class VEWatermarkEntity implements Parcelable {
        public static final Parcelable.Creator<VEWatermarkEntity> CREATOR = new Parcelable.Creator<VEWatermarkEntity>() {
            /* class com.ss.android.vesdk.VEWatermarkParam.VEWatermarkEntity.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99251);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ VEWatermarkEntity[] newArray(int i2) {
                return new VEWatermarkEntity[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ VEWatermarkEntity createFromParcel(Parcel parcel) {
                return new VEWatermarkEntity(parcel);
            }
        };
        public int height;
        public String[] images;
        public int interval;
        public bk position = bk.TL_BR;
        public int rotation;
        public long sequenceIn;
        public long sequenceOut;
        public int width;
        public int xOffset;
        public int yOffset;

        public int describeContents() {
            return 0;
        }

        public VEWatermarkEntity() {
        }

        public int getPosition() {
            return this.position.ordinal();
        }

        static {
            Covode.recordClassIndex(99250);
        }

        protected VEWatermarkEntity(Parcel parcel) {
            bk bkVar;
            this.images = parcel.createStringArray();
            this.interval = parcel.readInt();
            this.xOffset = parcel.readInt();
            this.yOffset = parcel.readInt();
            this.width = parcel.readInt();
            this.height = parcel.readInt();
            this.sequenceIn = parcel.readLong();
            this.sequenceOut = parcel.readLong();
            int readInt = parcel.readInt();
            if (readInt == -1) {
                bkVar = null;
            } else {
                bkVar = bk.values()[readInt];
            }
            this.position = bkVar;
            this.rotation = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            int ordinal;
            parcel.writeStringArray(this.images);
            parcel.writeInt(this.interval);
            parcel.writeInt(this.xOffset);
            parcel.writeInt(this.yOffset);
            parcel.writeInt(this.width);
            parcel.writeInt(this.height);
            parcel.writeLong(this.sequenceIn);
            parcel.writeLong(this.sequenceOut);
            bk bkVar = this.position;
            if (bkVar == null) {
                ordinal = -1;
            } else {
                ordinal = bkVar.ordinal();
            }
            parcel.writeInt(ordinal);
            parcel.writeInt(this.rotation);
        }
    }

    static {
        Covode.recordClassIndex(99248);
    }

    public VEWatermarkParam() {
    }

    public String toString() {
        return " needExtFile " + this.needExtFile;
    }

    public VEWatermarkEntity[] getEntities() {
        int i2;
        if (this.entities == null && this.images != null) {
            if (this.secondHalfImages != null) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            this.entities = new VEWatermarkEntity[i2];
            int i3 = 0;
            do {
                VEWatermarkEntity vEWatermarkEntity = new VEWatermarkEntity();
                vEWatermarkEntity.images = this.images;
                vEWatermarkEntity.interval = this.interval;
                vEWatermarkEntity.width = this.width;
                vEWatermarkEntity.height = this.height;
                vEWatermarkEntity.position = this.position;
                long j2 = (long) i2;
                vEWatermarkEntity.sequenceIn = (this.duration * ((long) i3)) / j2;
                int i4 = i3 + 1;
                vEWatermarkEntity.sequenceOut = (this.duration * ((long) i4)) / j2;
                vEWatermarkEntity.rotation = this.rotation;
                vEWatermarkEntity.xOffset = this.xOffset;
                vEWatermarkEntity.yOffset = this.yOffset;
                this.entities[i3] = vEWatermarkEntity;
                i3 = i4;
            } while (i3 < i2);
            if (i2 == 2) {
                this.entities[1].images = this.secondHalfImages;
            }
            if (this.position == bk.TL_BR && i2 == 2) {
                this.entities[0].position = bk.TL;
                this.entities[1].position = bk.BR;
            }
        }
        return this.entities;
    }

    public void setEntities(VEWatermarkEntity[] vEWatermarkEntityArr) {
        this.entities = vEWatermarkEntityArr;
    }

    protected VEWatermarkParam(Parcel parcel) {
        boolean z;
        bk bkVar;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.needExtFile = z;
        this.extFile = parcel.readString();
        this.entities = (VEWatermarkEntity[]) parcel.createTypedArray(VEWatermarkEntity.CREATOR);
        this.mask = (VEWatermarkMask) parcel.readParcelable(VEWatermarkMask.class.getClassLoader());
        this.images = parcel.createStringArray();
        this.waterMarkBitmap = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.secondHalfImages = parcel.createStringArray();
        this.interval = parcel.readInt();
        this.xOffset = parcel.readInt();
        this.yOffset = parcel.readInt();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.duration = parcel.readLong();
        int readInt = parcel.readInt();
        if (readInt == -1) {
            bkVar = null;
        } else {
            bkVar = bk.values()[readInt];
        }
        this.position = bkVar;
        this.rotation = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int ordinal;
        parcel.writeByte(this.needExtFile ? (byte) 1 : 0);
        parcel.writeString(this.extFile);
        parcel.writeTypedArray(this.entities, i2);
        parcel.writeParcelable(this.mask, i2);
        parcel.writeStringArray(this.images);
        parcel.writeParcelable(this.waterMarkBitmap, i2);
        parcel.writeStringArray(this.secondHalfImages);
        parcel.writeInt(this.interval);
        parcel.writeInt(this.xOffset);
        parcel.writeInt(this.yOffset);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeLong(this.duration);
        bk bkVar = this.position;
        if (bkVar == null) {
            ordinal = -1;
        } else {
            ordinal = bkVar.ordinal();
        }
        parcel.writeInt(ordinal);
        parcel.writeInt(this.rotation);
    }
}
