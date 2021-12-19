package com.ss.android.ad.splash.f;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;

public final class e extends TouchDelegate {

    /* renamed from: a  reason: collision with root package name */
    private View f58947a;

    /* renamed from: b  reason: collision with root package name */
    private Rect f58948b;

    /* renamed from: c  reason: collision with root package name */
    private Rect f58949c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f58950d;

    /* renamed from: e  reason: collision with root package name */
    private int f58951e;

    static {
        Covode.recordClassIndex(36471);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            float r0 = r8.getX()
            int r6 = (int) r0
            float r0 = r8.getY()
            int r5 = (int) r0
            int r2 = r8.getAction()
            r4 = 2
            r1 = 1
            r3 = 0
            if (r2 == 0) goto L_0x0020
            if (r2 == r1) goto L_0x002e
            if (r2 == r4) goto L_0x002e
            r0 = 3
            if (r2 == r0) goto L_0x001b
        L_0x001a:
            return r3
        L_0x001b:
            boolean r1 = r7.f58950d
            r7.f58950d = r3
            goto L_0x002a
        L_0x0020:
            android.graphics.Rect r0 = r7.f58948b
            boolean r0 = r0.contains(r6, r5)
            if (r0 == 0) goto L_0x0060
            r7.f58950d = r1
        L_0x002a:
            r0 = 1
            if (r1 == 0) goto L_0x001a
            goto L_0x0038
        L_0x002e:
            boolean r1 = r7.f58950d
            if (r1 == 0) goto L_0x001a
            android.graphics.Rect r0 = r7.f58949c
            boolean r0 = r0.contains(r6, r5)
        L_0x0038:
            android.view.View r2 = r7.f58947a
            if (r0 == 0) goto L_0x0056
            int r0 = r2.getWidth()
            int r0 = r0 / r4
            float r1 = (float) r0
            int r0 = r2.getHeight()
            int r0 = r0 / r4
            float r0 = (float) r0
            r8.setLocation(r1, r0)
        L_0x004b:
            int r0 = r2.getVisibility()
            if (r0 != 0) goto L_0x001a
            boolean r3 = r2.dispatchTouchEvent(r8)
            goto L_0x001a
        L_0x0056:
            int r0 = r7.f58951e
            int r0 = r0 * 2
            int r0 = -r0
            float r0 = (float) r0
            r8.setLocation(r0, r0)
            goto L_0x004b
        L_0x0060:
            r7.f58950d = r3
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.splash.f.e.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public e(Rect rect, View view) {
        super(rect, view);
        this.f58948b = rect;
        this.f58951e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        Rect rect2 = new Rect(rect);
        this.f58949c = rect2;
        int i2 = this.f58951e;
        rect2.inset(-i2, -i2);
        this.f58947a = view;
    }
}
