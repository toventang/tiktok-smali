package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.s;
import com.bytedance.covode.number.Covode;

public abstract class z implements View.OnAttachStateChangeListener, View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final float f1729a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1730b;

    /* renamed from: c  reason: collision with root package name */
    final View f1731c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1732d;

    /* renamed from: e  reason: collision with root package name */
    private Runnable f1733e;

    /* renamed from: f  reason: collision with root package name */
    private Runnable f1734f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1735g;

    /* renamed from: h  reason: collision with root package name */
    private int f1736h;

    /* renamed from: i  reason: collision with root package name */
    private final int[] f1737i = new int[2];

    static {
        Covode.recordClassIndex(526);
    }

    public abstract s a();

    public void onViewAttachedToWindow(View view) {
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {
        static {
            Covode.recordClassIndex(528);
        }

        public final void run() {
            z.this.d();
        }

        b() {
        }
    }

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        static {
            Covode.recordClassIndex(527);
        }

        public final void run() {
            ViewParent parent = z.this.f1731c.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        a() {
        }
    }

    private void e() {
        Runnable runnable = this.f1734f;
        if (runnable != null) {
            this.f1731c.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1733e;
        if (runnable2 != null) {
            this.f1731c.removeCallbacks(runnable2);
        }
    }

    /* access modifiers changed from: protected */
    public boolean b() {
        s a2 = a();
        if (a2 == null || a2.e()) {
            return true;
        }
        a2.c();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean c() {
        s a2 = a();
        if (a2 == null || !a2.e()) {
            return true;
        }
        a2.d();
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        e();
        View view = this.f1731c;
        if (view.isEnabled() && !view.isLongClickable() && b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1735g = true;
        }
    }

    public void onViewDetachedFromWindow(View view) {
        this.f1735g = false;
        this.f1736h = -1;
        Runnable runnable = this.f1733e;
        if (runnable != null) {
            this.f1731c.removeCallbacks(runnable);
        }
    }

    public z(View view) {
        this.f1731c = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1729a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1730b = tapTimeout;
        this.f1732d = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
        if (r0 != false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0084, code lost:
        if (r1 != 3) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r15, android.view.MotionEvent r16) {
        /*
        // Method dump skipped, instructions count: 286
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.z.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
