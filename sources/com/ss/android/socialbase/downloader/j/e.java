package com.ss.android.socialbase.downloader.j;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;

public final class e implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    private volatile Handler f60726a = new Handler(a.f60727a, this);

    public interface b {
        static {
            Covode.recordClassIndex(37470);
        }

        long a();
    }

    static {
        Covode.recordClassIndex(37468);
    }

    public final void a() {
        Handler handler = this.f60726a;
        if (handler != null) {
            this.f60726a = null;
            handler.removeCallbacksAndMessages(null);
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final Looper f60727a;

        static {
            Covode.recordClassIndex(37469);
            HandlerThread handlerThread = new HandlerThread("DownloadWatchDog");
            handlerThread.start();
            f60727a = handlerThread.getLooper();
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return true;
        }
        try {
            b bVar = (b) message.obj;
            long a2 = bVar.a();
            if (a2 <= 0) {
                return true;
            }
            a(bVar, a2);
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    public final void a(b bVar, long j2) {
        Handler handler = this.f60726a;
        if (handler != null) {
            Message obtain = Message.obtain();
            obtain.what = 0;
            obtain.obj = bVar;
            handler.sendMessageDelayed(obtain, j2);
        }
    }
}
