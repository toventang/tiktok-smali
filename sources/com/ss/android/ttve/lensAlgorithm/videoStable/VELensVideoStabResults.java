package com.ss.android.ttve.lensAlgorithm.videoStable;

import com.bytedance.covode.number.Covode;
import com.ss.android.ttve.lensAlgorithm.VEBaseLensResults;

public class VELensVideoStabResults extends VEBaseLensResults {
    public int processHeight;
    public int processWidth;
    public String ptsList;
    public VideoStabResult[] videoStabResult;

    static {
        Covode.recordClassIndex(37621);
    }

    public static class VideoStabResult {
        public String matrixList;
        public float realCropRatio;
        public int realRadius;
        public float videoStabMaxCropRatio;
        public int videoStabMotionType;
        public int videoStabSmoothRadius;

        static {
            Covode.recordClassIndex(37622);
        }

        public VideoStabResult() {
        }

        public VideoStabResult(float f2, int i2, int i3, String str, int i4, float f3) {
            this.videoStabMaxCropRatio = f2;
            this.videoStabSmoothRadius = i2;
            this.videoStabMotionType = i3;
            this.matrixList = str;
            this.realRadius = i4;
            this.realCropRatio = f3;
        }
    }

    public VELensVideoStabResults() {
    }

    public VELensVideoStabResults(VideoStabResult[] videoStabResultArr, String str, int i2, int i3) {
        this.videoStabResult = videoStabResultArr;
        this.ptsList = str;
        this.processWidth = i2;
        this.processHeight = i3;
    }
}
