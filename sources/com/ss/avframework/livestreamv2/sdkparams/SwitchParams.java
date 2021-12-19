package com.ss.avframework.livestreamv2.sdkparams;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.tinyjson.Serialized;

public final class SwitchParams {
    @Serialized(name = "gamePublishV2")
    private boolean gamePublishV2;
    @Serialized(name = "IMPerfAlarm")
    private boolean imPerfAlarm = true;
    @Serialized(name = "rtsAllowIgnoreBrAdjust")
    private boolean rtsAllowIgnoreBrAdjust = true;
    @Serialized(name = "rtsEnableDtls")
    private boolean rtsEnableDtls;
    @Serialized(name = "rtsStartNoBrAdjustMs")
    private int rtsStartNoBrAdjustMs = 5000;
    @Serialized(name = "rtsSupportVideoRtx")
    private boolean rtsSupportVideoRtx;

    static {
        Covode.recordClassIndex(100469);
    }

    public final boolean getGamePublishV2() {
        return this.gamePublishV2;
    }

    public final boolean getImPerfAlarm() {
        return this.imPerfAlarm;
    }

    public final boolean getRtsAllowIgnoreBrAdjust() {
        return this.rtsAllowIgnoreBrAdjust;
    }

    public final boolean getRtsEnableDtls() {
        return this.rtsEnableDtls;
    }

    public final int getRtsStartNoBrAdjustMs() {
        return this.rtsStartNoBrAdjustMs;
    }

    public final boolean getRtsSupportVideoRtx() {
        return this.rtsSupportVideoRtx;
    }

    public final void setGamePublishV2(boolean z) {
        this.gamePublishV2 = z;
    }

    public final void setImPerfAlarm(boolean z) {
        this.imPerfAlarm = z;
    }

    public final void setRtsAllowIgnoreBrAdjust(boolean z) {
        this.rtsAllowIgnoreBrAdjust = z;
    }

    public final void setRtsEnableDtls(boolean z) {
        this.rtsEnableDtls = z;
    }

    public final void setRtsStartNoBrAdjustMs(int i2) {
        this.rtsStartNoBrAdjustMs = i2;
    }

    public final void setRtsSupportVideoRtx(boolean z) {
        this.rtsSupportVideoRtx = z;
    }
}
