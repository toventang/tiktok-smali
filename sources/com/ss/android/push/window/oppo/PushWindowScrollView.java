package com.ss.android.push.window.oppo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class PushWindowScrollView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    protected VelocityTracker f60048a;

    /* renamed from: b  reason: collision with root package name */
    protected int f60049b = -1;

    /* renamed from: c  reason: collision with root package name */
    boolean f60050c;

    /* renamed from: d  reason: collision with root package name */
    private a f60051d;

    /* renamed from: e  reason: collision with root package name */
    private int f60052e;

    /* renamed from: f  reason: collision with root package name */
    private int f60053f;

    /* renamed from: g  reason: collision with root package name */
    private int f60054g;

    /* renamed from: h  reason: collision with root package name */
    private float f60055h;

    /* renamed from: i  reason: collision with root package name */
    private float f60056i;

    /* renamed from: j  reason: collision with root package name */
    private float f60057j;

    /* renamed from: k  reason: collision with root package name */
    private float f60058k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f60059l;

    /* renamed from: m  reason: collision with root package name */
    private int f60060m;
    private boolean n;
    private boolean o;
    private int p;

    public interface a {
        static {
            Covode.recordClassIndex(37117);
        }
    }

    static {
        Covode.recordClassIndex(37116);
    }

    private void a() {
        this.n = true;
        this.o = false;
        this.f60050c = false;
    }

    private void b() {
        this.o = false;
        this.n = false;
        this.f60059l = false;
        this.f60049b = -1;
        VelocityTracker velocityTracker = this.f60048a;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f60048a = null;
        }
    }

    public void setOnScrollListener(a aVar) {
        this.f60051d = aVar;
    }

    private void a(MotionEvent motionEvent) {
        int i2 = this.f60049b;
        int a2 = a(motionEvent, i2);
        if (i2 != -1 && a2 != -1) {
            float x = motionEvent.getX(a2);
            float abs = Math.abs(x - this.f60055h);
            float y = motionEvent.getY(a2);
            float abs2 = Math.abs(y - this.f60056i);
            int i3 = this.f60052e;
            if (abs2 > ((float) i3) && abs2 > abs) {
                a();
                this.f60055h = x;
                this.f60056i = y;
            } else if (abs > ((float) i3)) {
                this.f60059l = true;
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 1 || (action != 0 && this.f60059l)) {
            b();
            return false;
        }
        int i2 = action & 255;
        if (i2 == 0) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            this.f60049b = pointerId;
            if (pointerId != -1) {
                float x = motionEvent.getX(actionIndex);
                this.f60058k = x;
                this.f60055h = x;
                float y = motionEvent.getY(actionIndex);
                this.f60056i = y;
                this.f60057j = y;
                this.n = false;
                this.f60059l = false;
            }
        } else if (i2 == 2) {
            int a2 = a(motionEvent, this.f60049b);
            if (this.f60049b != -1) {
                motionEvent.getY(a2);
                a(motionEvent);
            }
        }
        if (!this.n) {
            if (this.f60048a == null) {
                this.f60048a = VelocityTracker.obtain();
            }
            this.f60048a.addMovement(motionEvent);
        }
        if (this.n || this.o) {
            return true;
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f60048a == null) {
            this.f60048a = VelocityTracker.obtain();
        }
        this.f60048a.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (!this.n) {
                        a(motionEvent);
                        if (this.f60059l) {
                            return false;
                        }
                    }
                    if (this.n) {
                        int a2 = a(motionEvent, this.f60049b);
                        if (this.f60049b != -1) {
                            float y = motionEvent.getY(a2);
                            float f2 = this.f60056i - y;
                            this.f60056i = y;
                            float f3 = ((float) this.p) + f2;
                            int i2 = (int) f3;
                            this.f60055h += f3 - ((float) i2);
                            this.p = i2;
                        }
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.f60056i = motionEvent.getY(actionIndex);
                        this.f60055h = motionEvent.getX(actionIndex);
                        this.f60049b = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        int a3 = a(motionEvent, this.f60049b);
                        if (this.f60049b != -1) {
                            this.f60056i = motionEvent.getY(a3);
                            this.f60055h = motionEvent.getX(a3);
                        }
                    }
                }
            }
            if (this.n) {
                VelocityTracker velocityTracker = this.f60048a;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f60054g);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f60049b);
                int a4 = a(motionEvent, this.f60049b);
                if (this.f60049b != -1 && Math.abs((int) (motionEvent.getY(a4) - this.f60057j)) > this.f60060m) {
                    Math.abs(yVelocity);
                }
                this.f60049b = -1;
                b();
            }
        } else {
            this.f60049b = motionEvent.getPointerId(motionEvent.getActionIndex());
            float y2 = motionEvent.getY();
            this.f60057j = y2;
            this.f60056i = y2;
            float x = motionEvent.getX();
            this.f60058k = x;
            this.f60055h = x;
        }
        return true;
    }

    private int a(MotionEvent motionEvent, int i2) {
        int findPointerIndex = motionEvent.findPointerIndex(i2);
        if (findPointerIndex == -1) {
            this.f60049b = -1;
        }
        return findPointerIndex;
    }

    public PushWindowScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(6739);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f60052e = viewConfiguration.getScaledTouchSlop();
        this.f60053f = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f60054g = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f60060m = (int) (getContext().getResources().getDisplayMetrics().density * 25.0f);
        MethodCollector.o(6739);
    }
}
