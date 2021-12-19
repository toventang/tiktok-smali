package com.ss.android.ugc.aweme.effect;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class ClipsModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<ClipsModel> CREATOR = new a();
    @c(a = "duration")
    private final float duration;
    @c(a = "i")

    /* renamed from: i  reason: collision with root package name */
    private final double f88719i;
    @c(a = "o")
    private final double o;
    @c(a = "xPoints")
    private final List<Float> xPoints;
    @c(a = "yPoints")
    private final List<Float> yPoints;

    static {
        Covode.recordClassIndex(55815);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.effect.ClipsModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ClipsModel copy$default(ClipsModel clipsModel, double d2, double d3, float f2, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d2 = clipsModel.f88719i;
        }
        if ((i2 & 2) != 0) {
            d3 = clipsModel.o;
        }
        if ((i2 & 4) != 0) {
            f2 = clipsModel.duration;
        }
        if ((i2 & 8) != 0) {
            list = clipsModel.xPoints;
        }
        if ((i2 & 16) != 0) {
            list2 = clipsModel.yPoints;
        }
        return clipsModel.copy(d2, d3, f2, list, list2);
    }

    public final double component1() {
        return this.f88719i;
    }

    public final double component2() {
        return this.o;
    }

    public final float component3() {
        return this.duration;
    }

    public final List<Float> component4() {
        return this.xPoints;
    }

    public final List<Float> component5() {
        return this.yPoints;
    }

    public final ClipsModel copy(double d2, double d3, float f2, List<Float> list, List<Float> list2) {
        l.d(list, "");
        l.d(list2, "");
        return new ClipsModel(d2, d3, f2, list, list2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsModel)) {
            return false;
        }
        ClipsModel clipsModel = (ClipsModel) obj;
        return Double.compare(this.f88719i, clipsModel.f88719i) == 0 && Double.compare(this.o, clipsModel.o) == 0 && Float.compare(this.duration, clipsModel.duration) == 0 && l.a(this.xPoints, clipsModel.xPoints) && l.a(this.yPoints, clipsModel.yPoints);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f88719i);
        int i2 = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.o);
        int floatToIntBits = (((i2 + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.duration)) * 31;
        List<Float> list = this.xPoints;
        int i3 = 0;
        int hashCode = (floatToIntBits + (list != null ? list.hashCode() : 0)) * 31;
        List<Float> list2 = this.yPoints;
        if (list2 != null) {
            i3 = list2.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "ClipsModel(i=" + this.f88719i + ", o=" + this.o + ", duration=" + this.duration + ", xPoints=" + this.xPoints + ", yPoints=" + this.yPoints + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeDouble(this.f88719i);
        parcel.writeDouble(this.o);
        parcel.writeFloat(this.duration);
        List<Float> list = this.xPoints;
        parcel.writeInt(list.size());
        for (Float f2 : list) {
            parcel.writeFloat(f2.floatValue());
        }
        List<Float> list2 = this.yPoints;
        parcel.writeInt(list2.size());
        for (Float f3 : list2) {
            parcel.writeFloat(f3.floatValue());
        }
    }

    public final float getDuration() {
        return this.duration;
    }

    public final double getI() {
        return this.f88719i;
    }

    public final double getO() {
        return this.o;
    }

    public final List<Float> getXPoints() {
        return this.xPoints;
    }

    public final List<Float> getYPoints() {
        return this.yPoints;
    }

    public static class a implements Parcelable.Creator<ClipsModel> {
        static {
            Covode.recordClassIndex(55816);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ClipsModel[] newArray(int i2) {
            return new ClipsModel[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ClipsModel createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            double readDouble = parcel.readDouble();
            double readDouble2 = parcel.readDouble();
            float readFloat = parcel.readFloat();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(Float.valueOf(parcel.readFloat()));
                readInt--;
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (readInt2 != 0) {
                arrayList2.add(Float.valueOf(parcel.readFloat()));
                readInt2--;
            }
            return new ClipsModel(readDouble, readDouble2, readFloat, arrayList, arrayList2);
        }
    }

    public ClipsModel(double d2, double d3, float f2, List<Float> list, List<Float> list2) {
        l.d(list, "");
        l.d(list2, "");
        this.f88719i = d2;
        this.o = d3;
        this.duration = f2;
        this.xPoints = list;
        this.yPoints = list2;
    }
}
