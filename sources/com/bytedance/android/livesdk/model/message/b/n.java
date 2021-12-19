package com.bytedance.android.livesdk.model.message.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public final class n {
    @c(a = "hostScore")

    /* renamed from: a  reason: collision with root package name */
    public int f19284a;
    @c(a = "user_armies")

    /* renamed from: b  reason: collision with root package name */
    public List<o> f19285b;

    static {
        Covode.recordClassIndex(11452);
    }

    public final String toString() {
        return "BattleUserArmies{hostScore=" + this.f19284a + ", userArmies=" + this.f19285b + '}';
    }
}
