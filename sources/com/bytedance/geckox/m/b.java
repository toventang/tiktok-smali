package com.bytedance.geckox.m;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public Handler f29930a;

    /* renamed from: b  reason: collision with root package name */
    private HandlerThread f29931b;

    /* renamed from: c  reason: collision with root package name */
    private final String f29932c;

    /* renamed from: d  reason: collision with root package name */
    private final int f29933d = 3;

    static {
        Covode.recordClassIndex(17354);
    }

    private void a() {
        if (this.f29930a == null || this.f29931b.getLooper() == null) {
            HandlerThread handlerThread = new HandlerThread(this.f29932c, this.f29933d);
            this.f29931b = handlerThread;
            handlerThread.start();
            this.f29930a = new a(this.f29931b.getLooper());
        }
    }

    public b(String str) {
        this.f29932c = str;
        a();
    }

    public final void a(a aVar) {
        a(aVar, InteractFirstFrameTimeOutDurationSetting.DEFAULT, 300000);
    }

    /* access modifiers changed from: package-private */
    public class a extends Handler {
        static {
            Covode.recordClassIndex(17355);
        }

        public final void handleMessage(Message message) {
            a aVar = (a) message.obj;
            com.bytedance.geckox.i.a.a("handler timer task execute", Integer.valueOf(aVar.a()), Long.valueOf(aVar.f29927b));
            aVar.b();
            if (aVar.f29927b > 0) {
                Message obtainMessage = b.this.f29930a.obtainMessage(message.what);
                obtainMessage.obj = aVar;
                b.this.f29930a.sendMessageDelayed(obtainMessage, aVar.f29927b);
            }
        }

        public a(Looper looper) {
            super(looper);
        }
    }

    public final void a(a aVar, long j2, long j3) {
        a();
        int a2 = aVar.a();
        aVar.f29927b = j3;
        Message obtainMessage = this.f29930a.obtainMessage(a2);
        obtainMessage.obj = aVar;
        obtainMessage.what = a2;
        this.f29930a.sendMessageDelayed(obtainMessage, j2);
    }
}
