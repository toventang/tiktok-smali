package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.an;

public class VEComposerFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEComposerFilterParam> CREATOR = new Parcelable.Creator<VEComposerFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VEComposerFilterParam.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99479);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEComposerFilterParam[] newArray(int i2) {
            return new VEComposerFilterParam[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEComposerFilterParam createFromParcel(Parcel parcel) {
            return new VEComposerFilterParam(parcel);
        }
    };
    private int action;
    public boolean autoDump;
    private int mode;
    private String[] nodePaths;
    private String[] oldNodePaths;
    private int orderType;
    private String[] tags;
    private String[] updateNodeKeys;
    private float[] updateNodeValues;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    public boolean isOverallComposer() {
        return true;
    }

    static {
        Covode.recordClassIndex(99478);
    }

    public VEComposerFilterParam() {
        this.filterName = "composer filter";
        this.filterType = 18;
        this.filterDurationType = 1;
        reset();
    }

    private void reset() {
        this.mode = 0;
        this.orderType = 0;
        this.action = 0;
        this.oldNodePaths = null;
        this.nodePaths = null;
        this.tags = null;
        this.updateNodeKeys = null;
        this.updateNodeValues = null;
    }

    public boolean isValid() {
        String[] strArr;
        String[] strArr2;
        float[] fArr;
        String[] strArr3;
        String[] strArr4;
        int i2 = this.action;
        if (!(i2 == 1 || i2 == 4)) {
            if (i2 == 8) {
                String[] strArr5 = this.nodePaths;
                if (!(strArr5 == null || (strArr2 = this.updateNodeKeys) == null || (fArr = this.updateNodeValues) == null || strArr5.length != strArr2.length || strArr2.length != fArr.length)) {
                    return true;
                }
            } else if (i2 != 16) {
                if (i2 != 32) {
                    if (i2 != 64) {
                        return true;
                    }
                    if (!(this.oldNodePaths == null || (strArr3 = this.nodePaths) == null || (strArr4 = this.tags) == null || strArr3.length != strArr4.length)) {
                        return true;
                    }
                } else if (this.nodePaths != null) {
                    return true;
                }
            }
            an.d("VEComposerFilterParam", "isValid, action: " + this.action + ", param invalid");
            return false;
        }
        String[] strArr6 = this.nodePaths;
        if (!(strArr6 == null || (strArr = this.tags) == null || strArr6.length != strArr.length)) {
            return true;
        }
        an.d("VEComposerFilterParam", "isValid, action: " + this.action + ", param invalid");
        return false;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VEComposerFilterParam{mode=" + this.mode + ", orderType=" + this.orderType + ", action='" + this.action + '\'' + ", oldNodePaths='" + this.oldNodePaths + '\'' + ", nodePaths='" + this.nodePaths + '\'' + ", tags='" + this.tags + '\'' + ", updateNodekeys='" + this.updateNodeKeys + '\'' + ", updateNodeValues='" + this.updateNodeValues + '\'' + '}';
    }

    public void removeComposerNodes(String[] strArr) {
        reset();
        this.action = 32;
        this.nodePaths = strArr;
    }

    protected VEComposerFilterParam(Parcel parcel) {
        super(parcel);
        this.mode = parcel.readInt();
        this.orderType = parcel.readInt();
        this.action = parcel.readInt();
        parcel.readStringArray(this.oldNodePaths);
        parcel.readStringArray(this.nodePaths);
        parcel.readStringArray(this.tags);
        parcel.readStringArray(this.updateNodeKeys);
        parcel.readFloatArray(this.updateNodeValues);
    }

    public void appendComposerNodesWithTag(String[] strArr, String[] strArr2) {
        reset();
        this.action = 16;
        this.nodePaths = strArr;
        this.tags = strArr2;
    }

    public void reloadComposerNodesWithTag(String[] strArr, String[] strArr2) {
        reset();
        this.action = 4;
        this.nodePaths = strArr;
        this.tags = strArr2;
    }

    public void setComposerMode(int i2, int i3) {
        reset();
        this.action = 2;
        this.mode = i2;
        this.orderType = i3;
    }

    public void setComposerNodesWithTag(String[] strArr, String[] strArr2) {
        reset();
        this.action = 1;
        this.nodePaths = strArr;
        this.tags = strArr2;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.mode);
        parcel.writeInt(this.orderType);
        parcel.writeInt(this.action);
        parcel.writeStringArray(this.oldNodePaths);
        parcel.writeStringArray(this.nodePaths);
        parcel.writeStringArray(this.tags);
        parcel.writeStringArray(this.updateNodeKeys);
        parcel.writeFloatArray(this.updateNodeValues);
    }

    public void replaceComposerNodesWithTag(String[] strArr, String[] strArr2, String[] strArr3) {
        reset();
        this.action = 64;
        this.oldNodePaths = strArr;
        this.nodePaths = strArr2;
        this.tags = strArr3;
    }

    public void updateMultiComposerNodes(String[] strArr, String[] strArr2, float[] fArr) {
        reset();
        this.action = 8;
        this.nodePaths = strArr;
        this.updateNodeKeys = strArr2;
        this.updateNodeValues = fArr;
    }
}
