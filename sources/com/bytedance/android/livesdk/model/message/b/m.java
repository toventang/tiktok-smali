package com.bytedance.android.livesdk.model.message.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class m {
    @c(a = "progress")

    /* renamed from: a  reason: collision with root package name */
    public long f19281a;
    @c(a = "from_user_id")

    /* renamed from: b  reason: collision with root package name */
    public long f19282b;
    @c(a = "prompt_key")

    /* renamed from: c  reason: collision with root package name */
    public String f19283c;

    static {
        Covode.recordClassIndex(11451);
    }

    public m(char c2) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f19281a == mVar.f19281a && this.f19282b == mVar.f19282b && l.a(this.f19283c, mVar.f19283c);
    }

    public final String toString() {
        return "BattleTaskUpdate(taskProgress=" + this.f19281a + ", fromUserUid=" + this.f19282b + ", promptKey=" + this.f19283c + ")";
    }

    private m() {
        this.f19281a = 0;
        this.f19282b = 0;
        this.f19283c = null;
    }

    public final int hashCode() {
        int i2;
        long j2 = this.f19281a;
        long j3 = this.f19282b;
        int i3 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str = this.f19283c;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        return i3 + i2;
    }

    private /* synthetic */ m(byte b2) {
        this();
    }
}
