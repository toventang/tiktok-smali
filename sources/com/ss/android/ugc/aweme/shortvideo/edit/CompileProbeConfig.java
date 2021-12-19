package com.ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;

public final class CompileProbeConfig {
    private final long endPointMs;
    private final long startPointMs;

    static {
        Covode.recordClassIndex(83092);
    }

    public static int com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ CompileProbeConfig copy$default(CompileProbeConfig compileProbeConfig, long j2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = compileProbeConfig.startPointMs;
        }
        if ((i2 & 2) != 0) {
            j3 = compileProbeConfig.endPointMs;
        }
        return compileProbeConfig.copy(j2, j3);
    }

    public final long component1() {
        return this.startPointMs;
    }

    public final long component2() {
        return this.endPointMs;
    }

    public final CompileProbeConfig copy(long j2, long j3) {
        return new CompileProbeConfig(j2, j3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompileProbeConfig)) {
            return false;
        }
        CompileProbeConfig compileProbeConfig = (CompileProbeConfig) obj;
        return this.startPointMs == compileProbeConfig.startPointMs && this.endPointMs == compileProbeConfig.endPointMs;
    }

    public final int hashCode() {
        return (com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.startPointMs) * 31) + com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.endPointMs);
    }

    public final String toString() {
        return "CompileProbeConfig(startPointMs=" + this.startPointMs + ", endPointMs=" + this.endPointMs + ")";
    }

    public final long getEndPointMs() {
        return this.endPointMs;
    }

    public final long getStartPointMs() {
        return this.startPointMs;
    }

    public CompileProbeConfig(long j2, long j3) {
        this.startPointMs = j2;
        this.endPointMs = j3;
    }
}
