package com.bytedance.android.livesdkapi.depend.model.live.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {

    /* renamed from: g  reason: collision with root package name */
    public static final a f23059g = new a((byte) 0);
    @com.google.gson.a.c(a = "status")

    /* renamed from: a  reason: collision with root package name */
    public int f23060a;
    @com.google.gson.a.c(a = "progress")

    /* renamed from: b  reason: collision with root package name */
    public long f23061b;
    @com.google.gson.a.c(a = "user_assisted")

    /* renamed from: c  reason: collision with root package name */
    public boolean f23062c;
    @com.google.gson.a.c(a = "reward_settle_prompt")

    /* renamed from: d  reason: collision with root package name */
    public f f23063d;
    @com.google.gson.a.c(a = "reward_settle_duration")

    /* renamed from: e  reason: collision with root package name */
    public long f23064e;
    @com.google.gson.a.c(a = "enter_room_prompt")

    /* renamed from: f  reason: collision with root package name */
    public f f23065f;

    static {
        Covode.recordClassIndex(13669);
    }

    public c(char c2) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f23060a == cVar.f23060a && this.f23061b == cVar.f23061b && this.f23062c == cVar.f23062c && l.a(this.f23063d, cVar.f23063d) && this.f23064e == cVar.f23064e && l.a(this.f23065f, cVar.f23065f);
    }

    public final String toString() {
        return "BattleBonusStatus(bonusPeriod=" + this.f23060a + ", taskProgress=" + this.f23061b + ", userAssisted=" + this.f23062c + ", rewardSettlePrompt=" + this.f23063d + ", rewardSettleDuration=" + this.f23064e + ", enterRoomPrompt=" + this.f23065f + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(13670);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private c() {
        this.f23060a = 0;
        this.f23061b = 0;
        this.f23062c = false;
        this.f23063d = null;
        this.f23064e = 3;
        this.f23065f = null;
    }

    public final int hashCode() {
        int i2;
        long j2 = this.f23061b;
        int i3 = ((this.f23060a * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        boolean z = this.f23062c;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (i3 + i4) * 31;
        f fVar = this.f23063d;
        int i8 = 0;
        if (fVar != null) {
            i2 = fVar.hashCode();
        } else {
            i2 = 0;
        }
        long j3 = this.f23064e;
        int i9 = (((i7 + i2) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        f fVar2 = this.f23065f;
        if (fVar2 != null) {
            i8 = fVar2.hashCode();
        }
        return i9 + i8;
    }

    private /* synthetic */ c(byte b2) {
        this();
    }
}
