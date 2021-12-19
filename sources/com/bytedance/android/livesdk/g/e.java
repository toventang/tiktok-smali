package com.bytedance.android.livesdk.g;

import android.text.TextUtils;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveForbbidenDetailPageSetting;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.covode.number.Covode;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f17823a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f17824b;

    static {
        Covode.recordClassIndex(9895);
    }

    public static String a() {
        String value = LiveForbbidenDetailPageSetting.INSTANCE.getValue();
        if (TextUtils.isEmpty(value)) {
            return b();
        }
        return value;
    }

    private static String b() {
        if (((IHostApp) a.a(IHostApp.class)).isInMusicallyRegion()) {
            return "https://webcast-va.tiktokv.com/falcon/webcast_mt/page/ban/index.html?showHeader=1";
        }
        return "https://webcast.tiktokv.com/falcon/webcast_mt/page/ban/index.html?showHeader=1";
    }
}
