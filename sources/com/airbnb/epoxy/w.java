package com.airbnb.epoxy;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

public class w implements Executor {

    /* renamed from: a  reason: collision with root package name */
    final Handler f5106a;

    static {
        Covode.recordClassIndex(2169);
    }

    w(Handler handler) {
        this.f5106a = handler;
    }

    public void execute(Runnable runnable) {
        if (Looper.myLooper() == this.f5106a.getLooper()) {
            runnable.run();
        } else {
            this.f5106a.post(runnable);
        }
    }
}
