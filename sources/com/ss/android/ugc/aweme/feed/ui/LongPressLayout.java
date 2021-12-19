package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.feed.n.n;

public class LongPressLayout extends View {

    /* renamed from: a  reason: collision with root package name */
    public float f94126a;

    /* renamed from: b  reason: collision with root package name */
    public float f94127b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f94128c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f94129d;

    /* renamed from: e  reason: collision with root package name */
    public a f94130e;

    /* renamed from: f  reason: collision with root package name */
    public long f94131f;

    /* renamed from: g  reason: collision with root package name */
    View.OnClickListener f94132g;

    /* renamed from: h  reason: collision with root package name */
    View.OnClickListener f94133h;

    /* renamed from: i  reason: collision with root package name */
    boolean f94134i;

    /* renamed from: j  reason: collision with root package name */
    public n f94135j;

    /* renamed from: k  reason: collision with root package name */
    private Context f94136k;

    /* renamed from: l  reason: collision with root package name */
    private float f94137l;

    /* renamed from: m  reason: collision with root package name */
    private float f94138m;
    private int n;
    private int o;
    private View.OnTouchListener p;
    private Runnable q;

    public interface a {
        static {
            Covode.recordClassIndex(59830);
        }

        void a(float f2, float f3);
    }

    static {
        Covode.recordClassIndex(59827);
    }

    public n getInterceptListener() {
        return this.f94135j;
    }

    public int getTimeInterval() {
        return this.o;
    }

    public void setInLongPressMode(boolean z) {
        this.f94128c = z;
    }

    public void setInterceptListener(n nVar) {
        this.f94135j = nVar;
    }

    public void setListener(a aVar) {
        this.f94130e = aVar;
    }

    public void setScrollMode(boolean z) {
        this.f94129d = z;
    }

    public void setTapListener(View.OnTouchListener onTouchListener) {
        this.p = onTouchListener;
    }

    public void setTimeInterval(int i2) {
        this.o = i2;
    }

    public LongPressLayout(Context context) {
        this(context, null);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setDisabilityOnClickListener(View.OnClickListener onClickListener) {
        this.f94133h = onClickListener;
        super.setOnClickListener(new ba(this));
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (this.f94133h == null) {
            super.setOnClickListener(onClickListener);
        }
        this.f94132g = onClickListener;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener;
        if (!isEnabled()) {
            return false;
        }
        this.f94134i = true;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    this.f94137l = motionEvent.getX();
                    this.f94138m = motionEvent.getY();
                    float abs = Math.abs(this.f94126a - this.f94137l);
                    float abs2 = Math.abs(this.f94127b - this.f94138m);
                    int i2 = this.n;
                    if (abs > ((float) i2) || abs2 > ((float) i2)) {
                        com.ss.android.b.a.a.a.c(this.q);
                    }
                    View.OnTouchListener onTouchListener2 = this.p;
                    if (onTouchListener2 != null) {
                        onTouchListener2.onTouch(this, motionEvent);
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        com.ss.android.b.a.a.a.c(this.q);
                    }
                }
            }
            com.ss.android.b.a.a.a.c(this.q);
            if (SystemClock.elapsedRealtime() - this.f94131f < ((long) this.o) && (onTouchListener = this.p) != null) {
                onTouchListener.onTouch(this, motionEvent);
            }
        } else {
            this.f94126a = motionEvent.getX();
            this.f94127b = motionEvent.getY();
            this.f94131f = SystemClock.elapsedRealtime();
            com.ss.android.b.a.a.a.a(this.q, this.o);
            View.OnTouchListener onTouchListener3 = this.p;
            if (onTouchListener3 != null) {
                onTouchListener3.onTouch(this, motionEvent);
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    public LongPressLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private LongPressLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(2774);
        this.n = -1;
        this.o = 500;
        this.q = new Runnable() {
            /* class com.ss.android.ugc.aweme.feed.ui.LongPressLayout.AnonymousClass2 */

            static {
                Covode.recordClassIndex(59829);
            }

            public final void run() {
                if (LongPressLayout.this.f94130e != null) {
                    ViewParent parent = LongPressLayout.this.getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    if (LongPressLayout.this.f94135j == null || LongPressLayout.this.f94135j.a()) {
                        LongPressLayout.this.f94130e.a(LongPressLayout.this.f94126a, LongPressLayout.this.f94127b);
                    }
                }
            }
        };
        this.f94136k = context;
        this.n = ViewConfiguration.get(context).getScaledTouchSlop();
        setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.feed.ui.LongPressLayout.AnonymousClass1 */

            static {
                Covode.recordClassIndex(59828);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
            }
        });
        MethodCollector.o(2774);
    }
}
