package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class VETransitionFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VETransitionFilterParam> CREATOR = new Parcelable.Creator<VETransitionFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VETransitionFilterParam.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99500);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VETransitionFilterParam[] newArray(int i2) {
            return new VETransitionFilterParam[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VETransitionFilterParam createFromParcel(Parcel parcel) {
            return new VETransitionFilterParam(parcel);
        }
    };
    public int tranDuration;
    public int tranType;
    public String transName;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99499);
    }

    public VETransitionFilterParam() {
        this.filterName = "tran filter";
        this.filterType = 14;
        this.transName = "";
        this.tranType = a.TransitionType_DEFAULT.ordinal();
        this.tranDuration = 500;
    }

    public enum a {
        TransitionType_DEFAULT,
        TransitionType_VARIABLE_TIME,
        TransitionType_SINGLE;

        static {
            Covode.recordClassIndex(99501);
        }
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VETransitionFilterParam{transName='" + this.transName + '\'' + ", tranType=" + this.tranType + ", tranDuration=" + this.tranDuration + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VETransitionFilterParam(Parcel parcel) {
        super(parcel);
        this.transName = parcel.readString();
        this.tranType = parcel.readInt();
        this.tranDuration = parcel.readInt();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.transName);
        parcel.writeInt(this.tranType);
        parcel.writeInt(this.tranDuration);
    }
}
