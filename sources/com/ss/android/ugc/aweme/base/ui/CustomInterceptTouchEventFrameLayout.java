package com.ss.android.ugc.aweme.base.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.utils.n;

public class CustomInterceptTouchEventFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static final int f68301a = n.a(8.0d);

    /* renamed from: b  reason: collision with root package name */
    boolean f68302b;

    /* renamed from: c  reason: collision with root package name */
    private a f68303c;

    /* renamed from: d  reason: collision with root package name */
    private Runnable f68304d;

    /* renamed from: e  reason: collision with root package name */
    private int f68305e;

    /* renamed from: f  reason: collision with root package name */
    private int f68306f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f68307g;

    public interface a {
        static {
            Covode.recordClassIndex(42056);
        }

        boolean a();
    }

    static {
        Covode.recordClassIndex(42055);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        a(motionEvent);
        return true;
    }

    public CustomInterceptTouchEventFrameLayout(Context context) {
        super(context);
        MethodCollector.i(11383);
        MethodCollector.o(11383);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        super.onInterceptTouchEvent(motionEvent);
        a(motionEvent);
        return this.f68302b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r1 != 3) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r1 = r6.getAction()
            if (r1 == 0) goto L_0x0051
            r0 = 1
            r4 = 0
            if (r1 == r0) goto L_0x004c
            r0 = 2
            if (r1 == r0) goto L_0x0013
            r0 = 3
            if (r1 == r0) goto L_0x004c
        L_0x0010:
            boolean r0 = r5.f68302b
            return r0
        L_0x0013:
            com.ss.android.ugc.aweme.base.ui.CustomInterceptTouchEventFrameLayout$a r0 = r5.f68303c
            if (r0 == 0) goto L_0x0010
            float r1 = r6.getX()
            int r0 = r5.f68305e
            float r0 = (float) r0
            float r1 = r1 - r0
            float r3 = r6.getY()
            int r0 = r5.f68306f
            float r0 = (float) r0
            float r3 = r3 - r0
            float r1 = java.lang.Math.abs(r1)
            int r2 = com.ss.android.ugc.aweme.base.ui.CustomInterceptTouchEventFrameLayout.f68301a
            float r0 = (float) r2
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x003b
            float r1 = java.lang.Math.abs(r3)
            float r0 = (float) r2
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0010
        L_0x003b:
            com.ss.android.ugc.aweme.base.ui.CustomInterceptTouchEventFrameLayout$a r0 = r5.f68303c
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0049
            java.lang.Runnable r0 = r5.f68304d
            r0.run()
            goto L_0x0010
        L_0x0049:
            r5.f68302b = r4
            goto L_0x0010
        L_0x004c:
            r5.f68302b = r4
            r5.f68307g = r4
            goto L_0x0010
        L_0x0051:
            float r0 = r6.getX()
            int r0 = (int) r0
            r5.f68305e = r0
            float r0 = r6.getY()
            int r0 = (int) r0
            r5.f68306f = r0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.ui.CustomInterceptTouchEventFrameLayout.a(android.view.MotionEvent):boolean");
    }

    public CustomInterceptTouchEventFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(11384);
        MethodCollector.o(11384);
    }
}
