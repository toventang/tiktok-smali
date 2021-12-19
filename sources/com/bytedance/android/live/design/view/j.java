package com.bytedance.android.live.design.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.core.h.v;
import com.bytedance.android.live.design.view.a;
import com.bytedance.android.live.design.view.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.java.ResourcesProtector;

public final class j {
    static {
        Covode.recordClassIndex(4819);
    }

    private static int a(int i2, int i3, int i4) {
        return i4 == 48 ? i2 - i3 : i4 == 80 ? i2 + i3 : i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        if (r5 != false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r5 != false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        return r2 - r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(int r2, int r3, int r4, boolean r5) {
        /*
            r1 = 8388611(0x800003, float:1.1754948E-38)
            if (r4 != r1) goto L_0x0009
            if (r5 == 0) goto L_0x0010
        L_0x0007:
            int r2 = r2 + r3
        L_0x0008:
            return r2
        L_0x0009:
            r0 = 8388613(0x800005, float:1.175495E-38)
            if (r4 != r0) goto L_0x0012
            if (r5 == 0) goto L_0x0007
        L_0x0010:
            int r2 = r2 - r3
            return r2
        L_0x0012:
            if (r4 != r1) goto L_0x0017
            if (r5 != 0) goto L_0x0007
            goto L_0x0008
        L_0x0017:
            if (r4 != r0) goto L_0x0008
            if (r5 != 0) goto L_0x0008
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.design.view.j.a(int, int, int, boolean):int");
    }

    public static boolean b(long j2) {
        return j2 > 0;
    }

    public static void a(long j2) {
        if (b(j2)) {
            e.c.f9440a.a(j2, 4);
        }
    }

    static void a(final e.b bVar) {
        if (v.v(bVar.f9438d.f9457b)) {
            b(bVar);
            return;
        }
        AnonymousClass1 r1 = new View.OnLayoutChangeListener() {
            /* class com.bytedance.android.live.design.view.j.AnonymousClass1 */

            static {
                Covode.recordClassIndex(4820);
            }

            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                bVar.f9437c = null;
                j.b(bVar);
                bVar.f9438d.f9457b.removeOnLayoutChangeListener(this);
            }
        };
        bVar.f9437c = r1;
        bVar.f9438d.f9457b.addOnLayoutChangeListener(r1);
    }

    static final /* synthetic */ void a(h hVar, Runnable runnable, View.OnAttachStateChangeListener onAttachStateChangeListener, e.b bVar, d dVar) {
        hVar.f9457b.removeCallbacks(runnable);
        hVar.f9457b.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        if (bVar.f9436b != null) {
            bVar.f9436b.a(dVar.f9427a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0065, code lost:
        if (r12 != false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0067, code lost:
        r9.setAnimationStyle(com.zhiliaoapp.musically.R.style.p);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0045, code lost:
        if (r12 != false) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(android.content.Context r8, com.bytedance.android.live.design.view.d r9, android.graphics.PointF r10, int r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.design.view.j.a(android.content.Context, com.bytedance.android.live.design.view.d, android.graphics.PointF, int, boolean):void");
    }

    public static long a(a aVar) {
        return a((h) aVar);
    }

    public static long a(h hVar) {
        if (hVar == null || hVar.f9456a == null || hVar.f9457b == null || hVar.f9458c == null) {
            return 0;
        }
        return e.c.f9440a.a(hVar);
    }

    private static View a(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x019a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(com.bytedance.android.live.design.view.e.b r19) {
        /*
        // Method dump skipped, instructions count: 566
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.design.view.j.b(com.bytedance.android.live.design.view.e$b):void");
    }

    public static long a(View view, CharSequence charSequence) {
        a.C0140a aVar = new a.C0140a(view);
        aVar.f9423a = charSequence;
        return a((h) aVar.b());
    }

    private static int a(Resources resources, int i2) {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(i2);
        if (matchConfig == null) {
            return resources.getInteger(i2);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(i2);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i3 = 0; i3 < min; i3++) {
                StackTraceElement stackTraceElement = stackTrace[i3];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(i2);
        }
    }

    public static long a(View view, CharSequence charSequence, long j2) {
        a.C0140a aVar = new a.C0140a(view);
        aVar.f9423a = charSequence;
        return a((h) ((a.C0140a) aVar.a(j2)).b());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        if (r6 != false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0070, code lost:
        if (r7.left < (r11.right - r9.right)) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0072, code lost:
        r8.right = r9.right;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007b, code lost:
        r8.right = java.lang.Math.min(r11.right - r7.left, r10.right);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        if (r6 != false) goto L_0x000a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(int r5, boolean r6, android.graphics.Rect r7, android.graphics.Rect r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11) {
        /*
        // Method dump skipped, instructions count: 143
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.design.view.j.a(int, boolean, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):void");
    }
}
