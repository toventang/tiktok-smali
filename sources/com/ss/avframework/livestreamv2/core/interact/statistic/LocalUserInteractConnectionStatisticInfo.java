package com.ss.avframework.livestreamv2.core.interact.statistic;

import com.bytedance.covode.number.Covode;

public class LocalUserInteractConnectionStatisticInfo {
    public long receivedOnLeaveChannelTime;
    public long startIneractTime;
    public long stopInteractTime;
    public long streamMixedSuccessTime;
    public long switchFromInteractToLive;
    public long switchFromLiveToInteract;

    static {
        Covode.recordClassIndex(100292);
    }

    public void setInteractStartTime() {
        if (this.startIneractTime == 0) {
            this.startIneractTime = System.currentTimeMillis();
        }
    }

    public void setInteractStopTime() {
        if (this.stopInteractTime == 0) {
            this.stopInteractTime = System.currentTimeMillis();
        }
    }

    public long calcDurationFromInteractToLive() {
        if (this.receivedOnLeaveChannelTime == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.receivedOnLeaveChannelTime = currentTimeMillis;
            long j2 = this.stopInteractTime;
            if (j2 != 0) {
                this.switchFromInteractToLive = currentTimeMillis - j2;
            }
        }
        return this.switchFromInteractToLive;
    }

    public long calcDurationFromLiveToInteract() {
        if (this.streamMixedSuccessTime == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.streamMixedSuccessTime = currentTimeMillis;
            long j2 = this.startIneractTime;
            if (j2 != 0) {
                this.switchFromLiveToInteract = currentTimeMillis - j2;
            }
        }
        return this.switchFromLiveToInteract;
    }
}
