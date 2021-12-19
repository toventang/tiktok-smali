package com.ss.avframework.livestreamv2.sdkparams;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.tinyjson.Serialized;

public final class NodeOptParams {
    @Serialized(name = "preparedIp")
    private boolean preparedIp;
    @Serialized(name = "rtmp")
    private int rtmp = Integer.MAX_VALUE;
    @Serialized(name = "rtmpq")
    private int rtmpq = Integer.MAX_VALUE;
    @Serialized(name = "rtmps")
    private int rtmps = Integer.MAX_VALUE;
    @Serialized(name = "strategyNodeOpt")
    private boolean strategyNodeOpt;

    static {
        Covode.recordClassIndex(100459);
    }

    public final boolean getPreparedIp() {
        return this.preparedIp;
    }

    public final int getRtmp() {
        return this.rtmp;
    }

    public final int getRtmpq() {
        return this.rtmpq;
    }

    public final int getRtmps() {
        return this.rtmps;
    }

    public final boolean getStrategyNodeOpt() {
        return this.strategyNodeOpt;
    }

    public final void setPreparedIp(boolean z) {
        this.preparedIp = z;
    }

    public final void setRtmp(int i2) {
        this.rtmp = i2;
    }

    public final void setRtmpq(int i2) {
        this.rtmpq = i2;
    }

    public final void setRtmps(int i2) {
        this.rtmps = i2;
    }

    public final void setStrategyNodeOpt(boolean z) {
        this.strategyNodeOpt = z;
    }
}
