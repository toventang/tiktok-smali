package com.ss.android.ugc.aweme.bullet.module.base.a;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.bytedance.ies.bullet.service.base.as;
import com.bytedance.ies.ugc.appcontext.d;
import com.google.gson.a.c;
import com.google.gson.o;
import com.google.gson.q;
import com.google.gson.t;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class a implements SSWebView.c {

    /* renamed from: a  reason: collision with root package name */
    public long f69407a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f69408b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f69409c;

    /* renamed from: d  reason: collision with root package name */
    public View.OnTouchListener f69410d;

    /* renamed from: e  reason: collision with root package name */
    private C1568a[] f69411e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f69412f;

    /* renamed from: g  reason: collision with root package name */
    private final h f69413g;

    /* renamed from: h  reason: collision with root package name */
    private SSWebView f69414h;

    static {
        Covode.recordClassIndex(42799);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.a.a$a  reason: collision with other inner class name */
    public static final class C1568a {
        @c(a = "x")

        /* renamed from: a  reason: collision with root package name */
        public final double f69415a = Double.MIN_VALUE;
        @c(a = "y")

        /* renamed from: b  reason: collision with root package name */
        public final double f69416b = Double.MIN_VALUE;
        @c(a = "width")

        /* renamed from: c  reason: collision with root package name */
        public final double f69417c = Double.MAX_VALUE;
        @c(a = "height")

        /* renamed from: d  reason: collision with root package name */
        public final double f69418d = Double.MAX_VALUE;

        static {
            Covode.recordClassIndex(42800);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1568a)) {
                return false;
            }
            C1568a aVar = (C1568a) obj;
            return Double.compare(this.f69415a, aVar.f69415a) == 0 && Double.compare(this.f69416b, aVar.f69416b) == 0 && Double.compare(this.f69417c, aVar.f69417c) == 0 && Double.compare(this.f69418d, aVar.f69418d) == 0;
        }

        public final int hashCode() {
            return (((((a(this.f69415a) * 31) + a(this.f69416b)) * 31) + a(this.f69417c)) * 31) + a(this.f69418d);
        }

        public final String toString() {
            return "DisableInterceptRegion(x=" + this.f69415a + ", y=" + this.f69416b + ", width=" + this.f69417c + ", height=" + this.f69418d + ")";
        }

        private C1568a() {
        }

        private static int a(double d2) {
            long doubleToLongBits = Double.doubleToLongBits(d2);
            return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        }
    }

    static final class b extends m implements h.f.a.a<GestureDetector> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(42801);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ GestureDetector invoke() {
            GestureDetector gestureDetector = new GestureDetector(d.a(), new GestureDetector.SimpleOnGestureListener(this) {
                /* class com.ss.android.ugc.aweme.bullet.module.base.a.a.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f69419a;

                static {
                    Covode.recordClassIndex(42802);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f69419a = r1;
                }

                public final boolean onSingleTapUp(MotionEvent motionEvent) {
                    this.f69419a.this$0.f69407a = System.currentTimeMillis();
                    return super.onSingleTapUp(motionEvent);
                }
            });
            gestureDetector.setIsLongpressEnabled(true);
            return gestureDetector;
        }
    }

    @Override // com.bytedance.ies.bullet.kit.web.SSWebView.c
    public final boolean a() {
        if (System.currentTimeMillis() - this.f69407a < ((long) this.f69414h.getTimeInterval())) {
            return true;
        }
        return false;
    }

    private a(SSWebView sSWebView) {
        l.d(sSWebView, "");
        this.f69414h = sSWebView;
        this.f69408b = true;
        this.f69409c = false;
        this.f69410d = null;
        this.f69413g = i.a((h.f.a.a) new b(this));
    }

    @Override // com.bytedance.ies.bullet.kit.web.SSWebView.c
    public final boolean a(boolean z) {
        if (!this.f69409c) {
            throw new as("An operation is not implemented");
        } else if (!this.f69408b || !z) {
            return false;
        } else {
            return true;
        }
    }

    public final void a(com.ss.android.ugc.aweme.ad.c.a aVar) {
        String str;
        l.d(aVar, "");
        com.google.gson.l a2 = q.a(aVar.f65588b.toString());
        l.b(a2, "");
        o j2 = a2.j();
        com.google.gson.l c2 = j2.c("eventName");
        C1568a[] aVarArr = null;
        if (c2 != null) {
            str = c2.c();
        } else {
            str = null;
        }
        if (l.a((Object) str, (Object) "disableIntercept")) {
            com.google.gson.l c3 = j2.c("data");
            if (c3 != null) {
                try {
                    GsonProvider c4 = GsonHolder.c();
                    l.b(c4, "");
                    aVarArr = (C1568a[]) c4.b().a(c3, C1568a[].class);
                } catch (t unused) {
                }
            }
            this.f69411e = aVarArr;
        }
    }

    @Override // com.bytedance.ies.bullet.kit.web.SSWebView.c
    public final boolean a(MotionEvent motionEvent) {
        boolean z;
        l.d(motionEvent, "");
        if (motionEvent.getActionMasked() == 0) {
            this.f69412f = false;
            int[] iArr = new int[2];
            this.f69414h.getLocationInWindow(iArr);
            int b2 = n.b((double) (motionEvent.getRawX() - ((float) iArr[0])));
            int b3 = n.b((double) (motionEvent.getRawY() - ((float) iArr[1])));
            C1568a[] aVarArr = this.f69411e;
            if (aVarArr != null) {
                int length = aVarArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    C1568a aVar = aVarArr[i2];
                    double d2 = (double) b2;
                    if (d2 >= aVar.f69415a && d2 <= aVar.f69415a + aVar.f69417c) {
                        double d3 = (double) b3;
                        if (d3 >= aVar.f69416b && d3 <= aVar.f69416b + aVar.f69418d) {
                            z = true;
                            break;
                        }
                    }
                    i2++;
                }
                this.f69412f = z;
            }
            z = false;
            this.f69412f = z;
        }
        if (this.f69412f) {
            this.f69414h.requestDisallowInterceptTouchEvent(true);
        }
        if (this.f69414h.f32384a) {
            ((GestureDetector) this.f69413g.getValue()).onTouchEvent(motionEvent);
            View.OnTouchListener onTouchListener = this.f69410d;
            if (onTouchListener != null) {
                onTouchListener.onTouch(this.f69414h, motionEvent);
            }
        }
        if (!this.f69409c) {
            return SSWebView.c.a.a(motionEvent);
        }
        if (this.f69408b) {
            this.f69414h.requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 2) {
            return true;
        }
        return SSWebView.c.a.a(motionEvent);
    }

    public /* synthetic */ a(SSWebView sSWebView, byte b2) {
        this(sSWebView);
    }
}
