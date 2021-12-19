package com.ss.android.ugc.aweme.common.h;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.p;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1741a f76431a = new C1741a((byte) 0);

    static {
        Covode.recordClassIndex(47187);
    }

    /* renamed from: com.ss.android.ugc.aweme.common.h.a$a  reason: collision with other inner class name */
    public static final class C1741a {
        static {
            Covode.recordClassIndex(47188);
        }

        private C1741a() {
        }

        public /* synthetic */ C1741a(byte b2) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.common.h.a$a$a  reason: collision with other inner class name */
        static final class C1742a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ View f76432a;

            static {
                Covode.recordClassIndex(47189);
            }

            C1742a(View view) {
                this.f76432a = view;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
                if (r5 != null) goto L_0x0022;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onAnimationUpdate(android.animation.ValueAnimator r7) {
                /*
                    r6 = this;
                    java.lang.String r0 = ""
                    h.f.b.l.b(r7, r0)
                    java.lang.Object r5 = r7.getAnimatedValue()
                    boolean r0 = r5 instanceof h.p
                    if (r0 != 0) goto L_0x000e
                    r5 = 0
                L_0x000e:
                    h.p r5 = (h.p) r5
                    android.view.View r4 = r6.f76432a
                    r3 = 2
                    r2 = 0
                    if (r5 == 0) goto L_0x0036
                    java.lang.Object r0 = r5.getFirst()
                    java.lang.Float r0 = (java.lang.Float) r0
                    if (r0 == 0) goto L_0x0036
                    float r1 = r0.floatValue()
                L_0x0022:
                    java.lang.Object r0 = r5.getSecond()
                    java.lang.Float r0 = (java.lang.Float) r0
                    if (r0 == 0) goto L_0x002e
                    float r2 = r0.floatValue()
                L_0x002e:
                    android.view.MotionEvent r0 = com.ss.android.ugc.aweme.common.h.a.C1741a.a(r3, r1, r2)
                    r4.dispatchTouchEvent(r0)
                    return
                L_0x0036:
                    r1 = 0
                    if (r5 == 0) goto L_0x002e
                    goto L_0x0022
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.h.a.C1741a.C1742a.onAnimationUpdate(android.animation.ValueAnimator):void");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.common.h.a$a$b */
        public static final class b extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ View f76433a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ p f76434b;

            static {
                Covode.recordClassIndex(47190);
            }

            public final void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                this.f76433a.dispatchTouchEvent(C1741a.a(3, ((Number) this.f76434b.getFirst()).floatValue(), ((Number) this.f76434b.getSecond()).floatValue()));
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                this.f76433a.dispatchTouchEvent(C1741a.a(1, ((Number) this.f76434b.getFirst()).floatValue(), ((Number) this.f76434b.getSecond()).floatValue()));
            }

            b(View view, p pVar) {
                this.f76433a = view;
                this.f76434b = pVar;
            }
        }

        public static MotionEvent a(int i2, float f2, float f3) {
            MotionEvent obtain = MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), i2, f2, f3, 0);
            l.b(obtain, "");
            return obtain;
        }
    }

    public static final void a(View view, p<Float, Float> pVar, p<Float, Float> pVar2) {
        l.d(view, "");
        l.d(pVar, "");
        l.d(pVar2, "");
        l.d(view, "");
        l.d(pVar, "");
        l.d(pVar2, "");
        view.dispatchTouchEvent(C1741a.a(0, pVar.getFirst().floatValue(), pVar.getSecond().floatValue()));
        view.dispatchTouchEvent(C1741a.a(2, pVar2.getFirst().floatValue(), pVar2.getSecond().floatValue()));
        view.dispatchTouchEvent(C1741a.a(1, pVar2.getFirst().floatValue(), pVar2.getSecond().floatValue()));
    }
}
