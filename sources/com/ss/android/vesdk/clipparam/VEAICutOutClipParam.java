package com.ss.android.vesdk.clipparam;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.VEListener;

public class VEAICutOutClipParam {
    public int archerStrategy = -1;
    public VEListener.ab listener;
    public String mModelPath = "";
    public String mWorkSpace = "";
    public String originPicForMask = "";
    public int trimIn;
    public int trimOut;

    static {
        Covode.recordClassIndex(99369);
    }

    public String toString() {
        return "VEAICutOutClipParam{trimIn=" + this.trimIn + ", maskPath='" + this.mWorkSpace + '\'' + ", mModelPath='" + this.mModelPath + '\'' + ", trimOut='" + this.trimOut + '\'' + ", archerStrategy='" + this.archerStrategy + '\'' + ", originPicForMask='" + this.originPicForMask + '\'' + '}';
    }
}
