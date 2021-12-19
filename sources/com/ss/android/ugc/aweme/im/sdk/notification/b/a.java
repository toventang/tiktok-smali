package com.ss.android.ugc.aweme.im.sdk.notification.b;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Scroller;
import android.widget.TextView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.facebook.drawee.f.e;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.im.sdk.notification.a.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.Objects;

public final class a extends FrameLayout {

    /* renamed from: d  reason: collision with root package name */
    public static final C2599a f102889d = new C2599a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final View f102890a;

    /* renamed from: b  reason: collision with root package name */
    public h.f.a.b<? super Integer, z> f102891b;

    /* renamed from: c  reason: collision with root package name */
    int f102892c;

    /* renamed from: e  reason: collision with root package name */
    private final CircleImageView f102893e;

    /* renamed from: f  reason: collision with root package name */
    private final CircleImageView f102894f;

    /* renamed from: g  reason: collision with root package name */
    private final CircleImageView f102895g;

    /* renamed from: h  reason: collision with root package name */
    private final CircleImageView f102896h;

    /* renamed from: i  reason: collision with root package name */
    private final TextView f102897i;

    /* renamed from: j  reason: collision with root package name */
    private final TextView f102898j;

    /* renamed from: k  reason: collision with root package name */
    private final float f102899k;

    /* renamed from: l  reason: collision with root package name */
    private final float f102900l;

    /* renamed from: m  reason: collision with root package name */
    private final float f102901m;
    private boolean n;
    private int o;
    private float p;
    private final Scroller q;
    private final GestureDetector r;
    private int s;

    static {
        Covode.recordClassIndex(65959);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.b.a$a  reason: collision with other inner class name */
    public static final class C2599a {
        static {
            Covode.recordClassIndex(65960);
        }

        private C2599a() {
        }

        public /* synthetic */ C2599a(byte b2) {
            this();
        }
    }

    public final void computeScroll() {
        super.computeScroll();
        if (this.q.computeScrollOffset()) {
            scrollTo(this.q.getCurrX(), this.q.getCurrY());
            invalidate();
        }
    }

    public final void a() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f102890a, "translationY", (-n.b(getContext(), 80.0f)) - ((float) this.f102892c), 0.0f);
        l.b(ofFloat, "");
        ofFloat.setDuration(300L);
        ofFloat.start();
    }

    public final void setActionListener(h.f.a.b<? super Integer, z> bVar) {
        this.f102891b = bVar;
    }

    public static final class c extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f102904a;

        static {
            Covode.recordClassIndex(65962);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(a aVar) {
            this.f102904a = aVar;
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            h.f.a.b<? super Integer, z> bVar = this.f102904a.f102891b;
            if (bVar == null) {
                return true;
            }
            bVar.invoke(0);
            return true;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            if (motionEvent == null || motionEvent2 == null) {
                return super.onFling(motionEvent, motionEvent2, f2, f3);
            }
            float x = motionEvent.getX() - motionEvent2.getX();
            if (motionEvent.getY() > motionEvent2.getY()) {
                float y = motionEvent.getY() - motionEvent2.getY();
                if (x == 0.0f) {
                    x = 1.0f;
                }
                if (y / Math.abs(x) > 0.65f) {
                    h.f.a.b<? super Integer, z> bVar = this.f102904a.f102891b;
                    if (bVar == null) {
                        return true;
                    }
                    bVar.invoke(3);
                    return true;
                }
            }
            return super.onFling(motionEvent, motionEvent2, f2, f3);
        }
    }

    private final void b(int i2) {
        View view = this.f102890a;
        l.b(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, i2);
        }
        layoutParams.height = i2;
        View view2 = this.f102890a;
        l.b(view2, "");
        view2.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f102902a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f102903b;

        static {
            Covode.recordClassIndex(65961);
        }

        b(float f2, h.f.a.a aVar) {
            this.f102902a = f2;
            this.f102903b = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            h.f.a.a aVar;
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            if (((Float) animatedValue).floatValue() == this.f102902a && (aVar = this.f102903b) != null) {
                aVar.invoke();
            }
        }
    }

    private final void a(int i2) {
        this.s = i2;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            break;
                        default:
                            return;
                    }
                } else {
                    b((int) this.f102901m);
                    return;
                }
            }
            b((int) this.f102900l);
            return;
        }
        b((int) this.f102900l);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(5340);
        View inflate = View.inflate(context, R.layout.a8w, this);
        this.f102890a = inflate;
        this.f102893e = (CircleImageView) inflate.findViewById(R.id.pf);
        this.f102894f = (CircleImageView) inflate.findViewById(R.id.mp);
        this.f102895g = (CircleImageView) inflate.findViewById(R.id.mr);
        this.f102896h = (CircleImageView) inflate.findViewById(R.id.mq);
        this.f102897i = (TextView) inflate.findViewById(R.id.csg);
        this.f102898j = (TextView) inflate.findViewById(R.id.akm);
        this.f102899k = n.b(context, 25.0f);
        this.f102900l = n.b(context, 80.0f);
        this.f102901m = n.b(context, 160.0f);
        this.o = -1;
        this.f102892c = n.e(context);
        this.q = new Scroller(context);
        this.r = new GestureDetector(context, new c(this));
        MethodCollector.o(5340);
    }

    public final void a(k kVar) {
        if (kVar != null) {
            CircleImageView circleImageView = this.f102893e;
            l.b(circleImageView, "");
            com.facebook.drawee.f.a aVar = (com.facebook.drawee.f.a) circleImageView.getHierarchy();
            l.b(aVar, "");
            e eVar = new e();
            eVar.f47476b = true;
            aVar.a(eVar);
            if (kVar.f102868a == 0 || kVar.f102868a == 3 || kVar.f102868a == 2 || kVar.f102868a == 6) {
                if (kVar.f102872e != null) {
                    com.ss.android.ugc.aweme.base.e.a(this.f102893e, kVar.f102872e);
                } else {
                    com.ss.android.ugc.aweme.base.e.b(this.f102893e, kVar.f102873f, -1, -1);
                }
            } else if (kVar.f102868a == 1) {
                if (kVar.f102872e != null) {
                    com.ss.android.ugc.aweme.base.e.a(this.f102893e, kVar.f102872e);
                } else {
                    CircleImageView circleImageView2 = this.f102894f;
                    l.b(circleImageView2, "");
                    circleImageView2.setVisibility(0);
                    CircleImageView circleImageView3 = this.f102895g;
                    l.b(circleImageView3, "");
                    circleImageView3.setVisibility(0);
                    CircleImageView circleImageView4 = this.f102896h;
                    l.b(circleImageView4, "");
                    circleImageView4.setVisibility(0);
                    com.ss.android.ugc.aweme.base.e.a(this.f102894f, kVar.f102874g);
                    com.ss.android.ugc.aweme.base.e.a(this.f102896h, kVar.f102875h);
                }
            } else if (kVar.f102868a == 5) {
                com.ss.android.ugc.aweme.base.e.a(this.f102893e, 2131232791);
            } else if (kVar.f102868a == 8) {
                com.ss.android.ugc.aweme.base.e.b(this.f102893e, kVar.f102873f, -1, -1);
            } else if (kVar.f102868a == 9) {
                com.ss.android.ugc.aweme.base.e.b(this.f102893e, kVar.f102873f, -1, -1);
            }
            TextView textView = this.f102897i;
            l.b(textView, "");
            textView.setText(kVar.f102876i);
            TextView textView2 = this.f102898j;
            l.b(textView2, "");
            textView2.setText(kVar.f102878k);
            if (kVar.f102868a == 0) {
                a(this.s);
            } else {
                a(kVar.f102868a);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && !this.r.onTouchEvent(motionEvent) && this.s == 0) {
            int action = motionEvent.getAction();
            int i2 = 0;
            if (action != 1) {
                if (action == 2) {
                    int i3 = this.o;
                    if (i3 == -1 || motionEvent.findPointerIndex(i3) < 0) {
                        return false;
                    }
                    if (Math.min(motionEvent.getRawY() - this.p, this.f102899k) > this.f102899k / 4.0f && !this.n) {
                        b((int) this.f102901m);
                        scrollBy(0, -((int) this.f102899k));
                        this.n = true;
                    }
                } else if (action != 3) {
                    if (action == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.o) {
                            if (actionIndex == 0) {
                                i2 = 1;
                            }
                            this.o = motionEvent.getPointerId(i2);
                        }
                    }
                }
            }
            if (motionEvent.findPointerIndex(this.o) < 0) {
                return false;
            }
            if (this.n) {
                this.n = false;
                int i4 = -getScrollY();
                this.q.startScroll(0, i4, 0, -i4, 300);
                invalidate();
                this.o = -1;
                a(2);
                h.f.a.b<? super Integer, z> bVar = this.f102891b;
                if (bVar != null) {
                    bVar.invoke(4);
                }
            }
            this.o = -1;
        }
        return true;
    }

    public /* synthetic */ a(Context context, byte b2) {
        this(context);
    }
}
