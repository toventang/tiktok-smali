package com.bytedance.android.livesdkapi.depend.model.live.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class l {
    @c(a = "reward_start_time")

    /* renamed from: a  reason: collision with root package name */
    public long f23093a;
    @c(a = "duration")

    /* renamed from: b  reason: collision with root package name */
    public long f23094b;
    @c(a = "reward_prepare_prompt")

    /* renamed from: c  reason: collision with root package name */
    public f f23095c;
    @c(a = "rewarding_prompt")

    /* renamed from: d  reason: collision with root package name */
    public f f23096d;

    static {
        Covode.recordClassIndex(13679);
    }

    public l(char c2) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f23093a == lVar.f23093a && this.f23094b == lVar.f23094b && h.f.b.l.a(this.f23095c, lVar.f23095c) && h.f.b.l.a(this.f23096d, lVar.f23096d);
    }

    public final String toString() {
        return "RewardPeriodConfig(rewardStartTime=" + this.f23093a + ", duration=" + this.f23094b + ", rewardPraparePrompt=" + this.f23095c + ", rewardingPrompt=" + this.f23096d + ")";
    }

    private l() {
        this.f23093a = 0;
        this.f23094b = 0;
        this.f23095c = null;
        this.f23096d = null;
    }

    public final int hashCode() {
        int i2;
        long j2 = this.f23093a;
        long j3 = this.f23094b;
        int i3 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        f fVar = this.f23095c;
        int i4 = 0;
        if (fVar != null) {
            i2 = fVar.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i3 + i2) * 31;
        f fVar2 = this.f23096d;
        if (fVar2 != null) {
            i4 = fVar2.hashCode();
        }
        return i5 + i4;
    }

    private /* synthetic */ l(byte b2) {
        this();
    }
}
