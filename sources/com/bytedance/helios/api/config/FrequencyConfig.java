package com.bytedance.helios.api.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.g;
import h.f.b.l;

public final class FrequencyConfig {
    @c(a = "call_threshold")
    private final int callThreshold;
    @c(a = StringSet.name)
    private final String name;
    @c(a = "session_interval_time")
    private final long sessionIntervalTime;
    @c(a = "timeline_limit")
    private final int timelineLimit;

    static {
        Covode.recordClassIndex(17837);
    }

    public FrequencyConfig() {
        this(0, 0, 0, null, 15, null);
    }

    public static /* synthetic */ FrequencyConfig copy$default(FrequencyConfig frequencyConfig, int i2, long j2, int i3, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = frequencyConfig.callThreshold;
        }
        if ((i4 & 2) != 0) {
            j2 = frequencyConfig.sessionIntervalTime;
        }
        if ((i4 & 4) != 0) {
            i3 = frequencyConfig.timelineLimit;
        }
        if ((i4 & 8) != 0) {
            str = frequencyConfig.name;
        }
        return frequencyConfig.copy(i2, j2, i3, str);
    }

    public final int component1() {
        return this.callThreshold;
    }

    public final long component2() {
        return this.sessionIntervalTime;
    }

    public final int component3() {
        return this.timelineLimit;
    }

    public final String component4() {
        return this.name;
    }

    public final FrequencyConfig copy(int i2, long j2, int i3, String str) {
        return new FrequencyConfig(i2, j2, i3, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrequencyConfig)) {
            return false;
        }
        FrequencyConfig frequencyConfig = (FrequencyConfig) obj;
        return this.callThreshold == frequencyConfig.callThreshold && this.sessionIntervalTime == frequencyConfig.sessionIntervalTime && this.timelineLimit == frequencyConfig.timelineLimit && l.a(this.name, frequencyConfig.name);
    }

    public final int hashCode() {
        long j2 = this.sessionIntervalTime;
        int i2 = ((((this.callThreshold * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.timelineLimit) * 31;
        String str = this.name;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FrequencyConfig(callThreshold=" + this.callThreshold + ", sessionIntervalTime=" + this.sessionIntervalTime + ", timelineLimit=" + this.timelineLimit + ", name=" + this.name + ")";
    }

    public final int getCallThreshold() {
        return this.callThreshold;
    }

    public final String getName() {
        return this.name;
    }

    public final long getSessionIntervalTime() {
        return this.sessionIntervalTime;
    }

    public final int getTimelineLimit() {
        return this.timelineLimit;
    }

    public FrequencyConfig(int i2, long j2, int i3, String str) {
        this.callThreshold = i2;
        this.sessionIntervalTime = j2;
        this.timelineLimit = i3;
        this.name = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FrequencyConfig(int i2, long j2, int i3, String str, int i4, g gVar) {
        this((i4 & 1) != 0 ? Integer.MAX_VALUE : i2, (i4 & 2) != 0 ? Long.MAX_VALUE : j2, (i4 & 4) != 0 ? 200 : i3, (i4 & 8) != 0 ? null : str);
    }
}
