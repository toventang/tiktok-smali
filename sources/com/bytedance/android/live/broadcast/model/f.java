package com.bytedance.android.live.broadcast.model;

import com.bytedance.android.livesdk.gift.b;
import com.bytedance.android.livesdk.livesetting.gift.TTliveStartGiftLocalDefaultSetting;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class f {
    @c(a = "show_gift_setting_switch")

    /* renamed from: a  reason: collision with root package name */
    public int f7906a;
    @c(a = "live_commercial")

    /* renamed from: b  reason: collision with root package name */
    public boolean f7907b;
    @c(a = "show_promote")

    /* renamed from: c  reason: collision with root package name */
    public boolean f7908c;
    @c(a = "live_ba_link")

    /* renamed from: d  reason: collision with root package name */
    public boolean f7909d;
    @c(a = "play_back")

    /* renamed from: e  reason: collision with root package name */
    public int f7910e;
    @c(a = "transaction_history")

    /* renamed from: f  reason: collision with root package name */
    public int f7911f;

    static {
        Covode.recordClassIndex(3918);
    }

    public final boolean b() {
        int i2 = this.f7906a;
        if (i2 == 1 || i2 == 5) {
            return true;
        }
        return false;
    }

    public final boolean a() {
        int i2 = this.f7906a;
        if (i2 == 3) {
            return true;
        }
        if (i2 == 4 || i2 == 5 || i2 != 1) {
            return false;
        }
        if (TTliveStartGiftLocalDefaultSetting.INSTANCE.getValue()) {
            return b.a();
        }
        return true;
    }
}
