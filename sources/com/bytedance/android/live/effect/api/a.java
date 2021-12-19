package com.bytedance.android.live.effect.api;

import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnableNewGestureDialogSetting;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f9636a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f9637b = y.a((int) R.string.gpy);

    /* renamed from: c  reason: collision with root package name */
    public static final String f9638c = y.a((int) R.string.gq0);

    /* renamed from: d  reason: collision with root package name */
    public static final String f9639d = y.a((int) R.string.gpv);

    /* renamed from: e  reason: collision with root package name */
    public static final String f9640e = y.a((int) R.string.gpw);

    /* renamed from: f  reason: collision with root package name */
    public static String f9641f;

    static {
        String a2;
        Covode.recordClassIndex(4894);
        if (LiveEnableNewGestureDialogSetting.INSTANCE.enable()) {
            a2 = y.a((int) R.string.gpx);
        } else {
            a2 = y.a((int) R.string.gpz);
        }
        f9636a = a2;
    }
}
