package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import com.bytedance.covode.number.Covode;

public class VEBaseAudioFilterParam extends VEBaseFilterParam {
    static {
        Covode.recordClassIndex(99464);
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    public VEBaseAudioFilterParam() {
        this.filterName = "audio filter";
        this.filterType = 1;
        this.filterDurationType = 1;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VEBaseAudioFilterParam{filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VEBaseAudioFilterParam(Parcel parcel) {
        super(parcel);
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
    }
}
