package androidx.core.h;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final a f2526a;

    interface a {
        static {
            Covode.recordClassIndex(851);
        }

        void a();

        void a(GestureDetector.OnDoubleTapListener onDoubleTapListener);

        boolean a(MotionEvent motionEvent);
    }

    static {
        Covode.recordClassIndex(850);
    }

    static class c implements a {

        /* renamed from: a  reason: collision with root package name */
        private final GestureDetector f2541a;

        static {
            Covode.recordClassIndex(854);
        }

        @Override // androidx.core.h.d.a
        public final void a() {
            this.f2541a.setIsLongpressEnabled(false);
        }

        @Override // androidx.core.h.d.a
        public final void a(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f2541a.setOnDoubleTapListener(onDoubleTapListener);
        }

        @Override // androidx.core.h.d.a
        public final boolean a(MotionEvent motionEvent) {
            return this.f2541a.onTouchEvent(motionEvent);
        }

        c(Context context, GestureDetector.OnGestureListener onGestureListener) {
            this.f2541a = new GestureDetector(context, onGestureListener, null);
        }
    }

    public final void a() {
        this.f2526a.a();
    }

    static class b implements a {

        /* renamed from: l  reason: collision with root package name */
        private static final int f2527l = ViewConfiguration.getLongPressTimeout();

        /* renamed from: m  reason: collision with root package name */
        private static final int f2528m = ViewConfiguration.getTapTimeout();
        private static final int n = ViewConfiguration.getDoubleTapTimeout();

        /* renamed from: a  reason: collision with root package name */
        final Handler f2529a = new a();

        /* renamed from: b  reason: collision with root package name */
        final GestureDetector.OnGestureListener f2530b;

        /* renamed from: c  reason: collision with root package name */
        GestureDetector.OnDoubleTapListener f2531c;

        /* renamed from: d  reason: collision with root package name */
        boolean f2532d;

        /* renamed from: e  reason: collision with root package name */
        boolean f2533e;

        /* renamed from: f  reason: collision with root package name */
        boolean f2534f;

        /* renamed from: g  reason: collision with root package name */
        MotionEvent f2535g;

        /* renamed from: h  reason: collision with root package name */
        private int f2536h;

        /* renamed from: i  reason: collision with root package name */
        private int f2537i;

        /* renamed from: j  reason: collision with root package name */
        private int f2538j;

        /* renamed from: k  reason: collision with root package name */
        private int f2539k;
        private boolean o;
        private boolean p;
        private MotionEvent q;
        private boolean r;
        private float s;
        private float t;
        private float u;
        private float v;
        private boolean w;
        private VelocityTracker x;

        @Override // androidx.core.h.d.a
        public final void a() {
            this.w = false;
        }

        static {
            Covode.recordClassIndex(852);
        }

        class a extends Handler {
            static {
                Covode.recordClassIndex(853);
            }

            a() {
            }

            public final void handleMessage(Message message) {
                int i2 = message.what;
                if (i2 == 1) {
                    b.this.f2530b.onShowPress(b.this.f2535g);
                } else if (i2 == 2) {
                    b bVar = b.this;
                    bVar.f2529a.removeMessages(3);
                    bVar.f2533e = false;
                    bVar.f2534f = true;
                    bVar.f2530b.onLongPress(bVar.f2535g);
                } else if (i2 != 3) {
                    throw new RuntimeException("Unknown message ".concat(String.valueOf(message)));
                } else if (b.this.f2531c == null) {
                } else {
                    if (!b.this.f2532d) {
                        b.this.f2531c.onSingleTapConfirmed(b.this.f2535g);
                    } else {
                        b.this.f2533e = true;
                    }
                }
            }
        }

        @Override // androidx.core.h.d.a
        public final void a(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f2531c = onDoubleTapListener;
        }

        /* JADX WARNING: Removed duplicated region for block: B:101:0x0252  */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x0269  */
        @Override // androidx.core.h.d.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(android.view.MotionEvent r14) {
            /*
            // Method dump skipped, instructions count: 679
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.h.d.b.a(android.view.MotionEvent):boolean");
        }

        b(Context context, GestureDetector.OnGestureListener onGestureListener) {
            this.f2530b = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                this.f2531c = (GestureDetector.OnDoubleTapListener) onGestureListener;
            }
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            } else if (onGestureListener != null) {
                this.w = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.f2538j = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f2539k = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f2536h = scaledTouchSlop * scaledTouchSlop;
                this.f2537i = scaledDoubleTapSlop * scaledDoubleTapSlop;
            } else {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
        }
    }

    public final void a(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f2526a.a(onDoubleTapListener);
    }

    public final boolean a(MotionEvent motionEvent) {
        return this.f2526a.a(motionEvent);
    }

    public d(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, (byte) 0);
    }

    private d(Context context, GestureDetector.OnGestureListener onGestureListener, byte b2) {
        int i2 = Build.VERSION.SDK_INT;
        this.f2526a = new c(context, onGestureListener);
    }
}
