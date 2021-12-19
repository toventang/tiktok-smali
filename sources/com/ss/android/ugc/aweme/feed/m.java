package com.ss.android.ugc.aweme.feed;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

/* access modifiers changed from: package-private */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Callable f93590a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f93591b;

    /* renamed from: c  reason: collision with root package name */
    private final int f93592c;

    /* renamed from: d  reason: collision with root package name */
    private final int f93593d;

    /* renamed from: e  reason: collision with root package name */
    private final Lock f93594e;

    static {
        Covode.recordClassIndex(59281);
    }

    m(Callable callable, Handler handler, int i2, int i3, Lock lock) {
        this.f93590a = callable;
        this.f93591b = handler;
        this.f93592c = i2;
        this.f93593d = i3;
        this.f93594e = lock;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Throwable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 331
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.m.run():void");
    }
}
