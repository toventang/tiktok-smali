package com.bytedance.helios.api.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;

public final class CrpConfig {
    @c(a = "event_timeout_mills")
    private final long eventTimeOutMills;
    @c(a = "report_delayed_mills")
    private final long reportDelayedMills;

    static {
        Covode.recordClassIndex(17835);
    }

    public CrpConfig() {
        this(0, 0, 3, null);
    }

    public static /* synthetic */ CrpConfig copy$default(CrpConfig crpConfig, long j2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = crpConfig.eventTimeOutMills;
        }
        if ((i2 & 2) != 0) {
            j3 = crpConfig.reportDelayedMills;
        }
        return crpConfig.copy(j2, j3);
    }

    public final long component1() {
        return this.eventTimeOutMills;
    }

    public final long component2() {
        return this.reportDelayedMills;
    }

    public final CrpConfig copy(long j2, long j3) {
        return new CrpConfig(j2, j3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CrpConfig)) {
            return false;
        }
        CrpConfig crpConfig = (CrpConfig) obj;
        return this.eventTimeOutMills == crpConfig.eventTimeOutMills && this.reportDelayedMills == crpConfig.reportDelayedMills;
    }

    public final int hashCode() {
        long j2 = this.eventTimeOutMills;
        long j3 = this.reportDelayedMills;
        return (((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "CrpConfig(eventTimeOutMills=" + this.eventTimeOutMills + ", reportDelayedMills=" + this.reportDelayedMills + ")";
    }

    public final long getEventTimeOutMills() {
        return this.eventTimeOutMills;
    }

    public final long getReportDelayedMills() {
        return this.reportDelayedMills;
    }

    public CrpConfig(long j2, long j3) {
        this.eventTimeOutMills = j2;
        this.reportDelayedMills = j3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CrpConfig(long j2, long j3, int i2, g gVar) {
        this((i2 & 1) != 0 ? 100 : j2, (i2 & 2) != 0 ? 50 : j3);
    }
}
