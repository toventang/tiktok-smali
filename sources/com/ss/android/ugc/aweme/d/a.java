package com.ss.android.ugc.aweme.d;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dh;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f79330a;

    /* renamed from: b  reason: collision with root package name */
    static final dh f79331b = new dh();

    /* renamed from: c  reason: collision with root package name */
    public static final a f79332c = new a();

    /* renamed from: d  reason: collision with root package name */
    private static final HandlerThread f79333d;

    private a() {
    }

    static {
        Covode.recordClassIndex(49246);
        HandlerThread handlerThread = new HandlerThread("AsyncInflateHandler");
        f79333d = handlerThread;
        handlerThread.start();
        f79330a = new Handler(handlerThread.getLooper());
        Process.setThreadPriority(handlerThread.getThreadId(), -20);
    }
}
