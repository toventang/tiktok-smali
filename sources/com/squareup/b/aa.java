package com.squareup.b;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class aa {

    /* renamed from: a  reason: collision with root package name */
    final HandlerThread f57968a;

    /* renamed from: b  reason: collision with root package name */
    final d f57969b;

    /* renamed from: c  reason: collision with root package name */
    final Handler f57970c;

    /* renamed from: d  reason: collision with root package name */
    long f57971d;

    /* renamed from: e  reason: collision with root package name */
    long f57972e;

    /* renamed from: f  reason: collision with root package name */
    long f57973f;

    /* renamed from: g  reason: collision with root package name */
    long f57974g;

    /* renamed from: h  reason: collision with root package name */
    long f57975h;

    /* renamed from: i  reason: collision with root package name */
    long f57976i;

    /* renamed from: j  reason: collision with root package name */
    long f57977j;

    /* renamed from: k  reason: collision with root package name */
    long f57978k;

    /* renamed from: l  reason: collision with root package name */
    int f57979l;

    /* renamed from: m  reason: collision with root package name */
    int f57980m;
    int n;

    static {
        Covode.recordClassIndex(36032);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f57970c.sendEmptyMessage(0);
    }

    aa(d dVar) {
        this.f57969b = dVar;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.f57968a = handlerThread;
        handlerThread.start();
        ae.a(handlerThread.getLooper());
        this.f57970c = new a(handlerThread.getLooper(), this);
    }

    static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final aa f57981a;

        static {
            Covode.recordClassIndex(36033);
        }

        public final void handleMessage(final Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                this.f57981a.f57971d++;
            } else if (i2 == 1) {
                this.f57981a.f57972e++;
            } else if (i2 == 2) {
                aa aaVar = this.f57981a;
                long j2 = (long) message.arg1;
                aaVar.f57980m++;
                aaVar.f57974g += j2;
                aaVar.f57977j = aaVar.f57974g / ((long) aaVar.f57980m);
            } else if (i2 == 3) {
                aa aaVar2 = this.f57981a;
                long j3 = (long) message.arg1;
                aaVar2.n++;
                aaVar2.f57975h += j3;
                aaVar2.f57978k = aaVar2.f57975h / ((long) aaVar2.f57980m);
            } else if (i2 != 4) {
                t.f58073a.post(new Runnable() {
                    /* class com.squareup.b.aa.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(36034);
                    }

                    public final void run() {
                        throw new AssertionError("Unhandled stats message." + message.what);
                    }
                });
            } else {
                aa aaVar3 = this.f57981a;
                aaVar3.f57979l++;
                aaVar3.f57973f += ((Long) message.obj).longValue();
                aaVar3.f57976i = aaVar3.f57973f / ((long) aaVar3.f57979l);
            }
        }

        public a(Looper looper, aa aaVar) {
            super(looper);
            this.f57981a = aaVar;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Bitmap bitmap, int i2) {
        int a2 = ae.a(bitmap);
        Handler handler = this.f57970c;
        handler.sendMessage(handler.obtainMessage(i2, a2, 0));
    }
}
