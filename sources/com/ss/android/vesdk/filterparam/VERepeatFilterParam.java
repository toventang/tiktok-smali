package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class VERepeatFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VERepeatFilterParam> CREATOR = new Parcelable.Creator<VERepeatFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VERepeatFilterParam.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99493);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VERepeatFilterParam[] newArray(int i2) {
            return new VERepeatFilterParam[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VERepeatFilterParam createFromParcel(Parcel parcel) {
            return new VERepeatFilterParam(parcel);
        }
    };
    public int repeatDuration;
    public int repeatTime;
    public int seqIn;
    public int seqOut;
    public int timeMode;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99492);
    }

    public VERepeatFilterParam() {
        this.filterName = "new repeat effect";
        this.filterType = 25;
        this.filterDurationType = 1;
        this.seqIn = -1;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VERepeatFilterParam{seqIn=" + this.seqIn + ", seqOut=" + this.seqOut + ", repeatTime=" + this.repeatTime + ", repeatDuration=" + this.repeatDuration + ", timeMode=" + this.timeMode + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VERepeatFilterParam(Parcel parcel) {
        super(parcel);
        this.seqIn = parcel.readInt();
        this.seqOut = parcel.readInt();
        this.repeatTime = parcel.readInt();
        this.repeatDuration = parcel.readInt();
        this.timeMode = parcel.readInt();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.seqIn);
        parcel.writeInt(this.seqOut);
        parcel.writeInt(this.repeatTime);
        parcel.writeInt(this.repeatDuration);
        parcel.writeInt(this.timeMode);
    }
}
