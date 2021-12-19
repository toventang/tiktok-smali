package com.bytedance.android.ecommerce.ocr.view;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.ecommerce.k.g;
import com.bytedance.android.ecommerce.k.h;
import com.bytedance.covode.number.Covode;

public final class b implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public OcrActivity f7290a;

    /* renamed from: b  reason: collision with root package name */
    e f7291b;

    static {
        Covode.recordClassIndex(3497);
    }

    public final boolean a() {
        if (this.f7290a != null) {
            return true;
        }
        return false;
    }

    public b(OcrActivity ocrActivity) {
        this.f7290a = ocrActivity;
    }

    public class a implements View.OnTouchListener {

        /* renamed from: b  reason: collision with root package name */
        private Handler f7294b = new Handler(Looper.getMainLooper()) {
            /* class com.bytedance.android.ecommerce.ocr.view.b.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(3500);
            }

            public final void handleMessage(Message message) {
                super.handleMessage(message);
                if (b.this.a()) {
                    b.this.f7290a.f7253a.g();
                }
            }
        };

        /* renamed from: c  reason: collision with root package name */
        private int f7295c = 300;

        /* renamed from: d  reason: collision with root package name */
        private int f7296d = 5;

        /* renamed from: e  reason: collision with root package name */
        private long f7297e;

        /* renamed from: f  reason: collision with root package name */
        private float f7298f;

        static {
            Covode.recordClassIndex(3499);
        }

        public a() {
        }

        private static float a(MotionEvent motionEvent) {
            if (motionEvent.getPointerCount() >= 2) {
                return a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
            }
            return -1.0f;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            b.this.a();
            int pointerCount = motionEvent.getPointerCount();
            if (pointerCount == 1) {
                if (motionEvent.getAction() == 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int i2 = this.f7295c;
                    if (elapsedRealtime - this.f7297e < ((long) i2)) {
                        this.f7294b.removeMessages(1);
                        b.this.f7290a.a(3);
                    } else {
                        this.f7294b.sendEmptyMessageDelayed(1, (long) i2);
                    }
                    this.f7297e = elapsedRealtime;
                }
            } else if (pointerCount >= 2) {
                int action = motionEvent.getAction() & 255;
                if (action == 2) {
                    float a2 = a(motionEvent);
                    if (a2 == -1.0f) {
                        return false;
                    }
                    float f2 = this.f7298f;
                    int i3 = this.f7296d;
                    if (a2 > ((float) i3) + f2) {
                        b.this.f7290a.a(1);
                    } else if (a2 >= f2 - ((float) i3)) {
                        return false;
                    } else {
                        b.this.f7290a.a(2);
                    }
                    this.f7298f = a2;
                } else if (action == 5) {
                    this.f7298f = a(motionEvent);
                }
            }
            return true;
        }

        private static float a(float f2, float f3, float f4, float f5) {
            float f6 = f2 - f4;
            float f7 = f3 - f5;
            return (float) Math.sqrt((double) ((f6 * f6) + (f7 * f7)));
        }
    }

    @Override // com.bytedance.android.ecommerce.k.g.a
    public final void a(h.a aVar) {
        if (a()) {
            OcrActivity ocrActivity = this.f7290a;
            if (!aVar.isAvailable()) {
                ocrActivity.a(0, 106, "network un available!", null);
            }
        }
    }
}
