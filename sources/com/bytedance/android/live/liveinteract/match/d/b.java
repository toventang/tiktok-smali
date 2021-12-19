package com.bytedance.android.live.liveinteract.match.d;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class b {
    @c(a = "battle_id")

    /* renamed from: a  reason: collision with root package name */
    public long f10811a;
    @c(a = "inviter_gift_permission_type")

    /* renamed from: b  reason: collision with root package name */
    public int f10812b;

    static {
        Covode.recordClassIndex(5779);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f10811a == bVar.f10811a && this.f10812b == bVar.f10812b;
    }

    public final String toString() {
        return "BattleInviteResult(battleId=" + this.f10811a + ", inviterGiftPermissionType=" + this.f10812b + ")";
    }

    public final int hashCode() {
        long j2 = this.f10811a;
        return (((int) (j2 ^ (j2 >>> 32))) * 31) + this.f10812b;
    }
}
