package com.ss.android.ugc.aweme.video.preload.c;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class a implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    private static final Executor f143642f = new ThreadPoolExecutor(3, 3, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(128), new ThreadPoolExecutor.DiscardOldestPolicy());

    /* renamed from: a  reason: collision with root package name */
    private final int f143643a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f143644b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f143645c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    private boolean f143646d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f143647e;

    public final void a() {
        if (!this.f143646d) {
            this.f143645c.post(this);
            this.f143646d = true;
            return;
        }
        this.f143647e = true;
    }

    static {
        Covode.recordClassIndex(93989);
    }

    public void run() {
        if (this.f143647e) {
            f143642f.execute(this.f143644b);
            this.f143647e = false;
        }
        this.f143645c.postDelayed(this, (long) this.f143643a);
    }

    public a(Runnable runnable, int i2) {
        this.f143644b = runnable;
        this.f143643a = i2;
    }
}
