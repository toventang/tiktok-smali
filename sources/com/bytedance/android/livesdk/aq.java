package com.bytedance.android.livesdk;

import androidx.c.d;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageManagerV2EnableSetting;
import com.bytedance.android.livesdk.x.f;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;

public final class aq {

    /* renamed from: a  reason: collision with root package name */
    static d<IMessageManager> f14023a = new d<>(2);

    /* renamed from: b  reason: collision with root package name */
    static d<f> f14024b = new d<>(2);

    /* renamed from: c  reason: collision with root package name */
    static long f14025c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f14026d = LiveMessageManagerV2EnableSetting.INSTANCE.getValue();

    static {
        Covode.recordClassIndex(7773);
    }

    public static void a(long j2) {
        f a2 = f14024b.a(j2, null);
        if (a2 != null) {
            a2.b();
        }
        f14024b.b(j2);
    }
}
