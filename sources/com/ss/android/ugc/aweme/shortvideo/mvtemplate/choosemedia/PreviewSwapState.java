package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import h.f.b.g;
import h.f.b.l;

public final class PreviewSwapState implements af {
    private final Integer from;
    private final Integer to;
    private final long value;

    static {
        Covode.recordClassIndex(84578);
    }

    public static int com_ss_android_ugc_aweme_shortvideo_mvtemplate_choosemedia_PreviewSwapState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ PreviewSwapState copy$default(PreviewSwapState previewSwapState, Integer num, Integer num2, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = previewSwapState.from;
        }
        if ((i2 & 2) != 0) {
            num2 = previewSwapState.to;
        }
        if ((i2 & 4) != 0) {
            j2 = previewSwapState.value;
        }
        return previewSwapState.copy(num, num2, j2);
    }

    public final Integer component1() {
        return this.from;
    }

    public final Integer component2() {
        return this.to;
    }

    public final long component3() {
        return this.value;
    }

    public final PreviewSwapState copy(Integer num, Integer num2, long j2) {
        return new PreviewSwapState(num, num2, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewSwapState)) {
            return false;
        }
        PreviewSwapState previewSwapState = (PreviewSwapState) obj;
        return l.a(this.from, previewSwapState.from) && l.a(this.to, previewSwapState.to) && this.value == previewSwapState.value;
    }

    public final int hashCode() {
        Integer num = this.from;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.to;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return ((hashCode + i2) * 31) + com_ss_android_ugc_aweme_shortvideo_mvtemplate_choosemedia_PreviewSwapState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.value);
    }

    public final String toString() {
        return "PreviewSwapState(from=" + this.from + ", to=" + this.to + ", value=" + this.value + ")";
    }

    public final Integer getFrom() {
        return this.from;
    }

    public final Integer getTo() {
        return this.to;
    }

    public final long getValue() {
        return this.value;
    }

    public PreviewSwapState(Integer num, Integer num2, long j2) {
        this.from = num;
        this.to = num2;
        this.value = j2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PreviewSwapState(Integer num, Integer num2, long j2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? null : num2, j2);
    }
}
