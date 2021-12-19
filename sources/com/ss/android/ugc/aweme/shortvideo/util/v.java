package com.ss.android.ugc.aweme.shortvideo.util;

import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final v f132372a = new v();

    /* renamed from: b  reason: collision with root package name */
    private static HandlerThread f132373b;

    private v() {
    }

    public static final Looper a() {
        Looper looper = f132373b.getLooper();
        l.b(looper, "");
        return looper;
    }

    static {
        Covode.recordClassIndex(86677);
        HandlerThread handlerThread = new HandlerThread("AVUtilThread");
        f132373b = handlerThread;
        handlerThread.start();
    }
}
