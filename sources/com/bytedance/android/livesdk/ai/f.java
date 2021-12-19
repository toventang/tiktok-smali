package com.bytedance.android.livesdk.ai;

import android.os.SystemClock;
import com.bytedance.android.live.core.c.a;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.covode.number.Covode;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public long f13768a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f13769b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f13770c;

    static {
        Covode.recordClassIndex(7661);
    }

    public final void a() {
        String str;
        if (this.f13768a != 0) {
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis() - this.f13768a;
            if (this.f13769b) {
                str = "yes";
            } else {
                str = "no";
            }
            b.a.a("livesdk_mini_window_mute_or_pause_live_duration").a("duration", currentThreadTimeMillis).a("is_auto", str).b();
            a.a(4, "picture_in_picture", "PipMutePlayTimeLogger uploadEndMuteTime, duration is ".concat(String.valueOf(currentThreadTimeMillis)));
            this.f13768a = 0;
            this.f13770c = false;
        }
    }
}
