package com.bytedance.android.live.broadcast.utils;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.bytedance.covode.number.Covode;

public class c extends HandlerThread implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    private Surface f8629a;

    /* renamed from: b  reason: collision with root package name */
    private Rect f8630b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f8631c;

    static {
        Covode.recordClassIndex(4410);
    }

    public boolean quitSafely() {
        boolean quitSafely = super.quitSafely();
        this.f8631c.sendEmptyMessage(235);
        return quitSafely;
    }

    /* access modifiers changed from: protected */
    public void onLooperPrepared() {
        super.onLooperPrepared();
        Handler handler = new Handler(getLooper(), this);
        this.f8631c = handler;
        handler.sendEmptyMessage(233);
    }

    public boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 233) {
            Canvas lockCanvas = this.f8629a.lockCanvas(this.f8630b);
            lockCanvas.drawColor(-7829368);
            this.f8629a.unlockCanvasAndPost(lockCanvas);
            this.f8631c.sendEmptyMessageDelayed(233, 66);
            return true;
        } else if (i2 != 235) {
            return true;
        } else {
            this.f8629a = null;
            return true;
        }
    }

    public c(Surface surface, int i2, int i3) {
        super(c.class.getSimpleName());
        this.f8629a = surface;
        this.f8630b = new Rect(0, 0, i2, i3);
    }
}
