package com.ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class CompileProbeConfigV2 {
    private final String bitrateRange;
    private final int bitrateStrategy;
    private final long endPointMs;
    private final int probeType;
    private final long startPointMs;

    static {
        Covode.recordClassIndex(83093);
    }

    public static int com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeConfigV2_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static int com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeConfigV2_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ CompileProbeConfigV2 copy$default(CompileProbeConfigV2 compileProbeConfigV2, long j2, long j3, int i2, int i3, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j2 = compileProbeConfigV2.startPointMs;
        }
        if ((i4 & 2) != 0) {
            j3 = compileProbeConfigV2.endPointMs;
        }
        if ((i4 & 4) != 0) {
            i2 = compileProbeConfigV2.probeType;
        }
        if ((i4 & 8) != 0) {
            i3 = compileProbeConfigV2.bitrateStrategy;
        }
        if ((i4 & 16) != 0) {
            str = compileProbeConfigV2.bitrateRange;
        }
        return compileProbeConfigV2.copy(j2, j3, i2, i3, str);
    }

    public final long component1() {
        return this.startPointMs;
    }

    public final long component2() {
        return this.endPointMs;
    }

    public final int component3() {
        return this.probeType;
    }

    public final int component4() {
        return this.bitrateStrategy;
    }

    public final String component5() {
        return this.bitrateRange;
    }

    public final CompileProbeConfigV2 copy(long j2, long j3, int i2, int i3, String str) {
        l.d(str, "");
        return new CompileProbeConfigV2(j2, j3, i2, i3, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompileProbeConfigV2)) {
            return false;
        }
        CompileProbeConfigV2 compileProbeConfigV2 = (CompileProbeConfigV2) obj;
        return this.startPointMs == compileProbeConfigV2.startPointMs && this.endPointMs == compileProbeConfigV2.endPointMs && this.probeType == compileProbeConfigV2.probeType && this.bitrateStrategy == compileProbeConfigV2.bitrateStrategy && l.a(this.bitrateRange, compileProbeConfigV2.bitrateRange);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeConfigV2_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((((com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeConfigV2_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.startPointMs) * 31) + com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeConfigV2_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.endPointMs)) * 31) + com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeConfigV2_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.probeType)) * 31) + com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeConfigV2_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.bitrateStrategy)) * 31;
        String str = this.bitrateRange;
        return com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeConfigV2_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "CompileProbeConfigV2(startPointMs=" + this.startPointMs + ", endPointMs=" + this.endPointMs + ", probeType=" + this.probeType + ", bitrateStrategy=" + this.bitrateStrategy + ", bitrateRange=" + this.bitrateRange + ")";
    }

    public final String getBitrateRange() {
        return this.bitrateRange;
    }

    public final int getBitrateStrategy() {
        return this.bitrateStrategy;
    }

    public final long getEndPointMs() {
        return this.endPointMs;
    }

    public final int getProbeType() {
        return this.probeType;
    }

    public final long getStartPointMs() {
        return this.startPointMs;
    }

    public CompileProbeConfigV2(long j2, long j3, int i2, int i3, String str) {
        l.d(str, "");
        this.startPointMs = j2;
        this.endPointMs = j3;
        this.probeType = i2;
        this.bitrateStrategy = i3;
        this.bitrateRange = str;
    }
}
