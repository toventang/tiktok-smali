package com.bytedance.android.livesdk.model.message.b;

import com.bytedance.android.livesdkapi.depend.model.live.a.f;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class i {
    @c(a = "Prompt")

    /* renamed from: a  reason: collision with root package name */
    public f f19270a;

    static {
        Covode.recordClassIndex(11446);
    }

    public i(char c2) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof i) && l.a(this.f19270a, ((i) obj).f19270a);
        }
        return true;
    }

    public final int hashCode() {
        f fVar = this.f19270a;
        if (fVar != null) {
            return fVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "BattleRewardSettle(rewardSettlePrompt=" + this.f19270a + ")";
    }

    private i() {
        this.f19270a = null;
    }

    private /* synthetic */ i(byte b2) {
        this();
    }
}
