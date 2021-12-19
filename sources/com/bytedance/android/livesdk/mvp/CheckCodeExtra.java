package com.bytedance.android.livesdk.mvp;

import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;

public final class CheckCodeExtra extends Extra {
    @c(a = "block_duration")
    private final long blockDuration;

    static {
        Covode.recordClassIndex(11732);
    }

    public CheckCodeExtra() {
        this(0, 1, null);
    }

    public static int com_bytedance_android_livesdk_mvp_CheckCodeExtra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ CheckCodeExtra copy$default(CheckCodeExtra checkCodeExtra, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = checkCodeExtra.blockDuration;
        }
        return checkCodeExtra.copy(j2);
    }

    public final long component1() {
        return this.blockDuration;
    }

    public final CheckCodeExtra copy(long j2) {
        return new CheckCodeExtra(j2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof CheckCodeExtra) && this.blockDuration == ((CheckCodeExtra) obj).blockDuration;
        }
        return true;
    }

    public final int hashCode() {
        return com_bytedance_android_livesdk_mvp_CheckCodeExtra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.blockDuration);
    }

    public final String toString() {
        return "CheckCodeExtra(blockDuration=" + this.blockDuration + ")";
    }

    public final long getBlockDuration() {
        return this.blockDuration;
    }

    public CheckCodeExtra(long j2) {
        this.blockDuration = j2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckCodeExtra(long j2, int i2, g gVar) {
        this((i2 & 1) != 0 ? 0 : j2);
    }
}
