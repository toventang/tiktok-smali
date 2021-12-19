package com.bytedance.apm.p;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile Handler f25196a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private static HashSet<HandlerThread> f25197b = new HashSet<>();

    static {
        Covode.recordClassIndex(14679);
    }
}
