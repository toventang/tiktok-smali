package com.bytedance.android.livesdk.model.message.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class k {

    /* renamed from: c  reason: collision with root package name */
    public static final a f19277c = new a((byte) 0);
    @c(a = "result")

    /* renamed from: a  reason: collision with root package name */
    public int f19278a;
    @c(a = "reward_start_time")

    /* renamed from: b  reason: collision with root package name */
    public long f19279b;

    static {
        Covode.recordClassIndex(11448);
    }

    public k(char c2) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f19278a == kVar.f19278a && this.f19279b == kVar.f19279b;
    }

    public final int hashCode() {
        long j2 = this.f19279b;
        return (this.f19278a * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "BattleTaskSettle(taskResult=" + this.f19278a + ", rewardStartTime=" + this.f19279b + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(11449);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private k() {
        this.f19278a = 0;
        this.f19279b = 0;
    }

    private /* synthetic */ k(byte b2) {
        this();
    }
}
