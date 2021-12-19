package com.bytedance.android.livesdkapi.model;

import com.bytedance.covode.number.Covode;
import h.f.b.g;

public final class LatestLiveData {
    private final long latestDuration;
    private final long latestLeaveTime;
    private final long latestRoomId;

    static {
        Covode.recordClassIndex(13837);
    }

    public LatestLiveData() {
        this(0, 0, 0, 7, null);
    }

    public static int com_bytedance_android_livesdkapi_model_LatestLiveData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ LatestLiveData copy$default(LatestLiveData latestLiveData, long j2, long j3, long j4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = latestLiveData.latestRoomId;
        }
        if ((i2 & 2) != 0) {
            j3 = latestLiveData.latestLeaveTime;
        }
        if ((i2 & 4) != 0) {
            j4 = latestLiveData.latestDuration;
        }
        return latestLiveData.copy(j2, j3, j4);
    }

    public final long component1() {
        return this.latestRoomId;
    }

    public final long component2() {
        return this.latestLeaveTime;
    }

    public final long component3() {
        return this.latestDuration;
    }

    public final LatestLiveData copy(long j2, long j3, long j4) {
        return new LatestLiveData(j2, j3, j4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatestLiveData)) {
            return false;
        }
        LatestLiveData latestLiveData = (LatestLiveData) obj;
        return this.latestRoomId == latestLiveData.latestRoomId && this.latestLeaveTime == latestLiveData.latestLeaveTime && this.latestDuration == latestLiveData.latestDuration;
    }

    public final int hashCode() {
        return (((com_bytedance_android_livesdkapi_model_LatestLiveData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.latestRoomId) * 31) + com_bytedance_android_livesdkapi_model_LatestLiveData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.latestLeaveTime)) * 31) + com_bytedance_android_livesdkapi_model_LatestLiveData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.latestDuration);
    }

    public final String toString() {
        return "LatestLiveData(latestRoomId=" + this.latestRoomId + ", latestLeaveTime=" + this.latestLeaveTime + ", latestDuration=" + this.latestDuration + ")";
    }

    public final long getLatestDuration() {
        return this.latestDuration;
    }

    public final long getLatestLeaveTime() {
        return this.latestLeaveTime;
    }

    public final long getLatestRoomId() {
        return this.latestRoomId;
    }

    public LatestLiveData(long j2, long j3, long j4) {
        this.latestRoomId = j2;
        this.latestLeaveTime = j3;
        this.latestDuration = j4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LatestLiveData(long j2, long j3, long j4, int i2, g gVar) {
        this((i2 & 1) != 0 ? 0 : j2, (i2 & 2) != 0 ? 0 : j3, (i2 & 4) != 0 ? 0 : j4);
    }
}
