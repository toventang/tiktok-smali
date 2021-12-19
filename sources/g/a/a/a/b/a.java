package g.a.a.a.b;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;

public class a extends b {

    /* renamed from: a  reason: collision with root package name */
    protected ScaleGestureDetector f158064a;

    /* renamed from: b  reason: collision with root package name */
    protected GestureDetector f158065b;

    /* renamed from: c  reason: collision with root package name */
    protected int f158066c;

    /* renamed from: d  reason: collision with root package name */
    protected float f158067d;

    /* renamed from: e  reason: collision with root package name */
    protected int f158068e;

    /* renamed from: f  reason: collision with root package name */
    protected GestureDetector.OnGestureListener f158069f;

    /* renamed from: g  reason: collision with root package name */
    protected ScaleGestureDetector.OnScaleGestureListener f158070g;

    /* renamed from: h  reason: collision with root package name */
    protected boolean f158071h;

    /* renamed from: i  reason: collision with root package name */
    protected boolean f158072i;

    /* renamed from: j  reason: collision with root package name */
    protected boolean f158073j;

    /* renamed from: k  reason: collision with root package name */
    public b f158074k;

    /* renamed from: l  reason: collision with root package name */
    public c f158075l;

    public interface b {
        static {
            Covode.recordClassIndex(104952);
        }
    }

    public interface c {
        static {
            Covode.recordClassIndex(104953);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(104950);
    }

    public boolean getDoubleTapEnabled() {
        return this.f158071h;
    }

    /* access modifiers changed from: protected */
    public GestureDetector.OnGestureListener getGestureListener() {
        return new C4178a();
    }

    /* access modifiers changed from: protected */
    public ScaleGestureDetector.OnScaleGestureListener getScaleListener() {
        return new d();
    }

    public void setDoubleTapEnabled(boolean z) {
        this.f158071h = z;
    }

    public void setDoubleTapListener(b bVar) {
        this.f158074k = bVar;
    }

    public void setScaleEnabled(boolean z) {
        this.f158072i = z;
    }

    public void setScrollEnabled(boolean z) {
        this.f158073j = z;
    }

    public void setSingleTapListener(c cVar) {
        this.f158075l = cVar;
    }

    /* renamed from: g.a.a.a.b.a$a  reason: collision with other inner class name */
    public class C4178a extends GestureDetector.SimpleOnGestureListener {
        static {
            Covode.recordClassIndex(104951);
        }

        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }

        public C4178a() {
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (a.this.f158075l == null) {
                return true;
            }
            a.this.f158075l.a();
            return true;
        }

        public final void onLongPress(MotionEvent motionEvent) {
            if (a.this.isLongClickable() && !a.this.f158064a.isInProgress()) {
                a.this.setPressed(true);
                a.this.performLongClick();
            }
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            if (a.this.f158071h) {
                a.this.s = true;
                float scale = a.this.getScale();
                a aVar = a.this;
                a.this.a(Math.min(a.this.getMaxScale(), Math.max(aVar.a(scale, aVar.getMaxScale()), a.this.getMinScale())), motionEvent.getX(), motionEvent.getY(), 200.0f);
                a.this.invalidate();
            }
            return super.onDoubleTap(motionEvent);
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            if (a.this.f158073j && motionEvent.getPointerCount() <= 1 && motionEvent2.getPointerCount() <= 1 && !a.this.f158064a.isInProgress() && a.this.getScale() != 1.0f) {
                return a.this.a(motionEvent, motionEvent2, f2, f3);
            }
            return false;
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            if (a.this.f158073j && motionEvent != null && motionEvent2 != null && motionEvent.getPointerCount() <= 1 && motionEvent2.getPointerCount() <= 1 && !a.this.f158064a.isInProgress()) {
                return a.this.b(f2, f3);
            }
            return false;
        }
    }

    public class d extends ScaleGestureDetector.SimpleOnScaleGestureListener {

        /* renamed from: a  reason: collision with root package name */
        protected boolean f158081a;

        static {
            Covode.recordClassIndex(104954);
        }

        public d() {
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float currentSpan = scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan();
            float scale = a.this.getScale() * scaleGestureDetector.getScaleFactor();
            if (a.this.f158072i) {
                if (!this.f158081a) {
                    this.f158081a = true;
                } else if (currentSpan != 0.0f) {
                    a.this.s = true;
                    a.this.a(Math.min(a.this.getMaxScale(), Math.max(scale, a.this.getMinScale() - 0.1f)), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                    a.this.f158068e = 1;
                    a.this.invalidate();
                    return true;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    @Override // g.a.a.a.b.b
    public final void a(float f2) {
        if (f2 < getMinScale()) {
            b(getMinScale());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f158064a.onTouchEvent(motionEvent);
        if (!this.f158064a.isInProgress()) {
            this.f158065b.onTouchEvent(motionEvent);
        }
        if ((motionEvent.getAction() & 255) == 1 && getScale() < getMinScale()) {
            b(getMinScale());
        }
        return true;
    }

    public final boolean a(int i2) {
        RectF bitmapRect = getBitmapRect();
        a(bitmapRect, this.z);
        Rect rect = new Rect();
        getGlobalVisibleRect(rect);
        if (bitmapRect == null) {
            return false;
        }
        if (bitmapRect.right < ((float) rect.right) || i2 >= 0) {
            if (((double) Math.abs(bitmapRect.left - this.z.left)) > 1.0d) {
                return true;
            }
            return false;
        } else if (Math.abs(bitmapRect.right - ((float) rect.right)) > 1.0f) {
            return true;
        } else {
            return false;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final float a(float f2, float f3) {
        if (this.f158068e == 1) {
            float f4 = this.f158067d;
            if ((2.0f * f4) + f2 <= f3) {
                return f2 + f4;
            }
            this.f158068e = -1;
            return f3;
        }
        this.f158068e = 1;
        return 1.0f;
    }

    public final boolean b(float f2, float f3) {
        if (getScale() == 1.0f) {
            return false;
        }
        this.s = true;
        c(-f2, -f3);
        invalidate();
        return true;
    }

    private a(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, (byte) 0);
        this.f158071h = true;
        this.f158072i = true;
        this.f158073j = true;
    }

    /* access modifiers changed from: protected */
    @Override // g.a.a.a.b.b
    public final void a(Context context, AttributeSet attributeSet, int i2) {
        super.a(context, attributeSet, i2);
        this.f158066c = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f158069f = getGestureListener();
        this.f158070g = getScaleListener();
        this.f158064a = new ScaleGestureDetector(getContext(), this.f158070g);
        this.f158065b = new GestureDetector(getContext(), this.f158069f, null, true);
        this.f158068e = 1;
    }

    /* access modifiers changed from: protected */
    @Override // g.a.a.a.b.b
    public final void a(Drawable drawable, Matrix matrix, float f2, float f3) {
        super.a(drawable, matrix, f2, f3);
        this.f158067d = getMaxScale() / 3.0f;
    }

    public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        float x = motionEvent2.getX() - motionEvent.getX();
        float y = motionEvent2.getY() - motionEvent.getY();
        if (Math.abs(f2) <= 800.0f && Math.abs(f3) <= 800.0f) {
            return false;
        }
        this.s = true;
        d(x / 2.0f, y / 2.0f);
        invalidate();
        return true;
    }
}
