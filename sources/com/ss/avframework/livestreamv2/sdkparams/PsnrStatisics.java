package com.ss.avframework.livestreamv2.sdkparams;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.tinyjson.Serialized;

public final class PsnrStatisics {
    private boolean enablePsnr;
    @Serialized(name = "psnr_calc_frames")
    private int psnrCalcFrames = 20;
    @Serialized(name = "psnr_period_seconds")
    private int psnrPeriodSeconds = 30;

    static {
        Covode.recordClassIndex(100460);
    }

    public final boolean getEnablePsnr() {
        return this.enablePsnr;
    }

    public final int getPsnrCalcFrames() {
        return this.psnrCalcFrames;
    }

    public final int getPsnrPeriodSeconds() {
        return this.psnrPeriodSeconds;
    }

    public final void setEnablePsnr(boolean z) {
        this.enablePsnr = z;
    }

    public final void setPsnrCalcFrames(int i2) {
        this.psnrCalcFrames = i2;
    }

    public final void setPsnrPeriodSeconds(int i2) {
        this.psnrPeriodSeconds = i2;
    }
}
