package com.ss.android.ugc.aweme.feed.x;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.g.e;
import com.bytedance.covode.number.Covode;

public final class r {

    public interface a {
        static {
            Covode.recordClassIndex(60387);
        }

        void a(int i2);

        void a(MotionEvent motionEvent);
    }

    static {
        Covode.recordClassIndex(60385);
    }

    private static GestureDetector a(Context context, a aVar, boolean z) {
        if (!z) {
            return null;
        }
        return new GestureDetector(context, new f(aVar, context));
    }

    public static View.OnTouchListener a(Activity activity, Handler handler, boolean z, a aVar) {
        return new View.OnTouchListener(activity, a(activity, aVar, z), aVar, handler) {
            /* class com.ss.android.ugc.aweme.feed.x.r.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            float f95350a;

            /* renamed from: b  reason: collision with root package name */
            float f95351b;

            /* renamed from: c  reason: collision with root package name */
            int f95352c;

            /* renamed from: d  reason: collision with root package name */
            int f95353d;

            /* renamed from: e  reason: collision with root package name */
            int f95354e;

            /* renamed from: f  reason: collision with root package name */
            int f95355f;

            /* renamed from: g  reason: collision with root package name */
            boolean f95356g;

            /* renamed from: h  reason: collision with root package name */
            boolean f95357h;

            /* renamed from: i  reason: collision with root package name */
            boolean f95358i;

            /* renamed from: j  reason: collision with root package name */
            MotionEvent f95359j;

            /* renamed from: k  reason: collision with root package name */
            MotionEvent f95360k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ Activity f95361l;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ GestureDetector f95362m;
            final /* synthetic */ a n;
            final /* synthetic */ Handler o;

            static {
                Covode.recordClassIndex(60386);
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                GestureDetector gestureDetector = this.f95362m;
                if (gestureDetector != null) {
                    gestureDetector.onTouchEvent(motionEvent);
                }
                int action = motionEvent.getAction();
                if (action == 0) {
                    if (this.o.hasMessages(0)) {
                        this.o.removeMessages(0);
                    }
                    this.f95358i = false;
                    MotionEvent motionEvent2 = this.f95359j;
                    MotionEvent motionEvent3 = this.f95360k;
                    if (!(motionEvent2 == null || motionEvent3 == null || !this.f95356g)) {
                        long eventTime = motionEvent.getEventTime() - motionEvent3.getEventTime();
                        if (eventTime <= ((long) ViewConfiguration.getDoubleTapTimeout()) && eventTime >= 40) {
                            int x = ((int) motionEvent2.getX()) - ((int) motionEvent.getX());
                            int y = ((int) motionEvent2.getY()) - ((int) motionEvent.getY());
                            if ((x * x) + (y * y) < this.f95355f) {
                                this.f95358i = true;
                                this.n.a(this.f95359j);
                            }
                        }
                    }
                    MotionEvent motionEvent4 = this.f95359j;
                    if (motionEvent4 != null) {
                        motionEvent4.recycle();
                    }
                    this.f95359j = MotionEvent.obtain(motionEvent);
                    this.f95357h = true;
                    this.f95356g = true;
                    this.f95350a = motionEvent.getX();
                    this.f95351b = motionEvent.getY();
                } else if (action != 1) {
                    if (action == 2) {
                        int x2 = (int) (motionEvent.getX() - this.f95350a);
                        int y2 = (int) (motionEvent.getY() - this.f95351b);
                        int i2 = (x2 * x2) + (y2 * y2);
                        if (i2 > this.f95354e || Math.abs(x2) >= this.f95353d) {
                            this.f95357h = false;
                            this.o.removeMessages(0);
                        }
                        if (i2 > this.f95355f) {
                            this.f95356g = false;
                        }
                    }
                } else if (this.f95357h) {
                    if (!this.f95358i && this.f95359j != null) {
                        Handler handler = this.o;
                        handler.sendMessageDelayed(handler.obtainMessage(0, new e(Float.valueOf(this.f95350a), Float.valueOf(this.f95351b))), (((long) ViewConfiguration.getDoubleTapTimeout()) - motionEvent.getEventTime()) + this.f95359j.getEventTime());
                    }
                    MotionEvent motionEvent5 = this.f95360k;
                    if (motionEvent5 != null) {
                        motionEvent5.recycle();
                    }
                    this.f95360k = MotionEvent.obtain(motionEvent);
                }
                return false;
            }

            {
                this.f95361l = r2;
                this.f95362m = r3;
                this.n = r4;
                this.o = r5;
                this.f95352c = ViewConfiguration.get(r2).getScaledDoubleTapSlop();
                int scaledTouchSlop = ViewConfiguration.get(r2).getScaledTouchSlop() * 3;
                this.f95353d = scaledTouchSlop;
                this.f95354e = scaledTouchSlop * scaledTouchSlop;
                int i2 = this.f95352c;
                this.f95355f = i2 * i2;
            }
        };
    }
}
