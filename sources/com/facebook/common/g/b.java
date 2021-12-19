package com.facebook.common.g;

import com.bytedance.covode.number.Covode;

public enum b {
    OnCloseToDalvikHeapLimit(0.5d),
    OnSystemMemoryCriticallyLowWhileAppInForeground(1.0d),
    OnSystemLowMemoryWhileAppInForeground(0.5d),
    OnSystemLowMemoryWhileAppInBackground(1.0d),
    OnAppBackgrounded(1.0d);
    
    private double mSuggestedTrimRatio;

    public final double getSuggestedTrimRatio() {
        return this.mSuggestedTrimRatio;
    }

    static {
        Covode.recordClassIndex(28653);
    }

    private b(double d2) {
        this.mSuggestedTrimRatio = d2;
    }
}
