package com.bytedance.scene.navigation;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class a extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private boolean f42952a = true;

    static {
        Covode.recordClassIndex(26342);
    }

    public final void a(Runnable runnable) {
        Message obtain = Message.obtain(this, runnable);
        if (this.f42952a) {
            obtain.setAsynchronous(true);
        }
        sendMessage(obtain);
    }

    a(Looper looper) {
        super(looper);
        int i2 = Build.VERSION.SDK_INT;
        if (this.f42952a && Build.VERSION.SDK_INT < 22) {
            Message obtain = Message.obtain();
            try {
                obtain.setAsynchronous(true);
            } catch (NoSuchMethodError unused) {
                this.f42952a = false;
            }
            obtain.recycle();
        }
    }
}
