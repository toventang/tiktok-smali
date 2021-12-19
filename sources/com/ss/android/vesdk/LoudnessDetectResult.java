package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;

public class LoudnessDetectResult {
    public double avgLoudness;
    public double peakLoudness;
    public int result;

    static {
        Covode.recordClassIndex(99082);
    }

    public String toString() {
        return "LoudnessDetectResult{result=" + this.result + ", avgLoudness=" + this.avgLoudness + ", peakLoudness=" + this.peakLoudness + '}';
    }
}
