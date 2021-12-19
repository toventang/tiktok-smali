package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class VEAudioSamiFilterParam extends VEBaseAudioFilterParam {
    public static final Parcelable.Creator<VEAudioSamiFilterParam> CREATOR = new Parcelable.Creator<VEAudioSamiFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VEAudioSamiFilterParam.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99461);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEAudioSamiFilterParam[] newArray(int i2) {
            return new VEAudioSamiFilterParam[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEAudioSamiFilterParam createFromParcel(Parcel parcel) {
            return new VEAudioSamiFilterParam(parcel);
        }
    };
    public boolean enable = true;
    public String samiModelPath;
    public String samiParam;
    public int samiType;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99460);
    }

    public VEAudioSamiFilterParam() {
        this.filterName = "audio sami filter";
        this.samiModelPath = "";
        this.samiParam = "";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public String toString() {
        return "VEAudioSamiFilterParam{filterType=" + this.filterType + ", filterName='" + this.filterName + ", filterDurationType=" + this.filterDurationType + ", samiModelPath=" + this.samiModelPath + ", samiType=" + this.samiType + ", samiParam=" + this.samiParam + ", enable=" + this.enable + '}';
    }

    protected VEAudioSamiFilterParam(Parcel parcel) {
        super(parcel);
        boolean z = true;
        this.samiModelPath = parcel.readString();
        this.samiType = parcel.readInt();
        this.samiParam = parcel.readString();
        this.enable = parcel.readByte() == 0 ? false : z;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.samiModelPath);
        parcel.writeInt(this.samiType);
        parcel.writeString(this.samiParam);
        parcel.writeByte(this.enable ? (byte) 1 : 0);
    }
}
