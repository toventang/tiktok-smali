package com.ss.android.ugc.aweme.shortvideo.countdown;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.d;
import h.f.b.l;

public final class CountdownState implements af {
    private final long maxDuration;
    private final String musicPath;
    private final long sdkRecordTime;
    private final long startTime;
    private final UrlModel taps;
    private final long totalTime;
    private final d waveInfo;

    static {
        Covode.recordClassIndex(82194);
    }

    public static int com_ss_android_ugc_aweme_shortvideo_countdown_CountdownState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ CountdownState copy$default(CountdownState countdownState, String str, UrlModel urlModel, long j2, long j3, long j4, long j5, d dVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = countdownState.musicPath;
        }
        if ((i2 & 2) != 0) {
            urlModel = countdownState.taps;
        }
        if ((i2 & 4) != 0) {
            j2 = countdownState.sdkRecordTime;
        }
        if ((i2 & 8) != 0) {
            j3 = countdownState.startTime;
        }
        if ((i2 & 16) != 0) {
            j4 = countdownState.totalTime;
        }
        if ((i2 & 32) != 0) {
            j5 = countdownState.maxDuration;
        }
        if ((i2 & 64) != 0) {
            dVar = countdownState.waveInfo;
        }
        return countdownState.copy(str, urlModel, j2, j3, j4, j5, dVar);
    }

    public final String component1() {
        return this.musicPath;
    }

    public final UrlModel component2() {
        return this.taps;
    }

    public final long component3() {
        return this.sdkRecordTime;
    }

    public final long component4() {
        return this.startTime;
    }

    public final long component5() {
        return this.totalTime;
    }

    public final long component6() {
        return this.maxDuration;
    }

    public final d component7() {
        return this.waveInfo;
    }

    public final CountdownState copy(String str, UrlModel urlModel, long j2, long j3, long j4, long j5, d dVar) {
        return new CountdownState(str, urlModel, j2, j3, j4, j5, dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountdownState)) {
            return false;
        }
        CountdownState countdownState = (CountdownState) obj;
        return l.a(this.musicPath, countdownState.musicPath) && l.a(this.taps, countdownState.taps) && this.sdkRecordTime == countdownState.sdkRecordTime && this.startTime == countdownState.startTime && this.totalTime == countdownState.totalTime && this.maxDuration == countdownState.maxDuration && l.a(this.waveInfo, countdownState.waveInfo);
    }

    public final int hashCode() {
        String str = this.musicPath;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        UrlModel urlModel = this.taps;
        int hashCode2 = (((((((((hashCode + (urlModel != null ? urlModel.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_shortvideo_countdown_CountdownState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.sdkRecordTime)) * 31) + com_ss_android_ugc_aweme_shortvideo_countdown_CountdownState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.startTime)) * 31) + com_ss_android_ugc_aweme_shortvideo_countdown_CountdownState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.totalTime)) * 31) + com_ss_android_ugc_aweme_shortvideo_countdown_CountdownState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.maxDuration)) * 31;
        d dVar = this.waveInfo;
        if (dVar != null) {
            i2 = dVar.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "CountdownState(musicPath=" + this.musicPath + ", taps=" + this.taps + ", sdkRecordTime=" + this.sdkRecordTime + ", startTime=" + this.startTime + ", totalTime=" + this.totalTime + ", maxDuration=" + this.maxDuration + ", waveInfo=" + this.waveInfo + ")";
    }

    public final long getMaxDuration() {
        return this.maxDuration;
    }

    public final String getMusicPath() {
        return this.musicPath;
    }

    public final long getSdkRecordTime() {
        return this.sdkRecordTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final UrlModel getTaps() {
        return this.taps;
    }

    public final long getTotalTime() {
        return this.totalTime;
    }

    public final d getWaveInfo() {
        return this.waveInfo;
    }

    public CountdownState(String str, UrlModel urlModel, long j2, long j3, long j4, long j5, d dVar) {
        this.musicPath = str;
        this.taps = urlModel;
        this.sdkRecordTime = j2;
        this.startTime = j3;
        this.totalTime = j4;
        this.maxDuration = j5;
        this.waveInfo = dVar;
    }
}
