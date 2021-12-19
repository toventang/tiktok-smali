package com.ss.android.ugc.aweme.aq.b;

import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;

public final class f extends AnimationDrawable {

    /* renamed from: a  reason: collision with root package name */
    public a f66977a;

    /* renamed from: b  reason: collision with root package name */
    private Handler f66978b = new Handler(Looper.getMainLooper());

    public interface a {
        static {
            Covode.recordClassIndex(41282);
        }
    }

    static {
        Covode.recordClassIndex(41281);
    }

    public f() {
        setOneShot(false);
    }

    public final void stop() {
        super.stop();
        Handler handler = this.f66978b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        if (this.f66977a != null) {
            this.f66977a = null;
        }
    }

    public final void start() {
        Handler handler;
        super.start();
        if (getNumberOfFrames() > 0 && getDuration(0) > 0 && (handler = this.f66978b) != null) {
            handler.postDelayed(new g(this), (long) (getNumberOfFrames() * getDuration(0) * 4));
        }
    }
}
