package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import com.bytedance.covode.number.Covode;

public class VEVideoLensOneKeyHdrParam extends VEBaseFilterParam {
    public int asf_mode;
    public int disable_denoise = 1;
    public int hdr_mode;
    public String kernel_path;
    public String model_path;
    public int power_level = 3;
    public int scene_case = 20001;

    static {
        Covode.recordClassIndex(99506);
    }

    public VEVideoLensOneKeyHdrParam() {
        this.filterName = "lens one key hdr";
        this.filterType = 35;
        this.filterDurationType = 1;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VEVideoAjustmentFilterParam{, model_path=" + this.model_path + ", kernel_path=" + this.kernel_path + ", power_level=" + this.power_level + ", scene_case=" + this.scene_case + ", disable_denoise=" + this.disable_denoise + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
    }
}
