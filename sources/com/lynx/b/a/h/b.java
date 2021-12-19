package com.lynx.b.a.h;

import android.content.res.Resources;
import android.graphics.PointF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.h.j;
import androidx.core.h.n;
import androidx.core.h.t;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;

public final class b implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public static int f55191a;

    /* renamed from: b  reason: collision with root package name */
    public static int f55192b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static float f55193c = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: e  reason: collision with root package name */
    private static final float f55194e;

    /* renamed from: f  reason: collision with root package name */
    private static final float f55195f;

    /* renamed from: d  reason: collision with root package name */
    private int f55196d;

    static {
        Covode.recordClassIndex(34614);
        float b2 = 1.0f / b(1.0f);
        f55194e = b2;
        f55195f = 1.0f - (b2 * b(1.0f));
    }

    public b(int i2) {
        this.f55196d = i2;
    }

    public static int a(float f2) {
        return (int) ((f2 * f55193c) + 0.5f);
    }

    public static boolean b(View view) {
        if (c(view) || (view instanceof ViewPager) || (view instanceof n)) {
            return true;
        }
        return false;
    }

    private static boolean c(View view) {
        if ((view instanceof AbsListView) || (view instanceof ScrollView) || (view instanceof t) || (view instanceof WebView) || (view instanceof j)) {
            return true;
        }
        return false;
    }

    public final float getInterpolation(float f2) {
        if (this.f55196d == f55192b) {
            float f3 = 1.0f - f2;
            return 1.0f - (f3 * f3);
        }
        float b2 = f55194e * b(f2);
        if (b2 > 0.0f) {
            return b2 + f55195f;
        }
        return b2;
    }

    public static int a(View view) {
        int makeMeasureSpec;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        if (layoutParams.height > 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(childMeasureSpec, makeMeasureSpec);
        return view.getMeasuredHeight();
    }

    private static float b(float f2) {
        float f3 = f2 * 8.0f;
        if (f3 < 1.0f) {
            return f3 - (1.0f - ((float) Math.exp((double) (-f3))));
        }
        return 0.36787945f + ((1.0f - ((float) Math.exp((double) (1.0f - f3)))) * 0.63212055f);
    }

    public static boolean a(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        return view.canScrollVertically(i2);
    }

    public static boolean a(View view, PointF pointF) {
        if (a(view, -1) && view.getVisibility() == 0) {
            return false;
        }
        if (!(view instanceof ViewGroup) || pointF == null) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        PointF pointF2 = new PointF();
        for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount - 1);
            if (a(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                if ("fixed".equals(childAt.getTag()) || "fixed-bottom".equals(childAt.getTag())) {
                    return false;
                } else {
                    pointF.offset(pointF2.x, pointF2.y);
                    boolean a2 = a(childAt, pointF);
                    pointF.offset(-pointF2.x, -pointF2.y);
                    return a2;
                }
            }
        }
        return true;
    }

    public static boolean a(View view, PointF pointF, boolean z) {
        if (a(view, 1) && view.getVisibility() == 0) {
            return false;
        }
        if ((view instanceof ViewGroup) && pointF != null && !c(view)) {
            ViewGroup viewGroup = (ViewGroup) view;
            PointF pointF2 = new PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount - 1);
                if (a(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    if ("fixed".equals(childAt.getTag()) || "fixed-top".equals(childAt.getTag())) {
                        return false;
                    } else {
                        pointF.offset(pointF2.x, pointF2.y);
                        boolean a2 = a(childAt, pointF, z);
                        pointF.offset(-pointF2.x, -pointF2.y);
                        return a2;
                    }
                }
            }
        }
        if (z || a(view, -1)) {
            return true;
        }
        return false;
    }

    public static boolean a(View view, View view2, float f2, float f3, PointF pointF) {
        if (view2.getVisibility() != 0) {
            return false;
        }
        float[] fArr = {f2, f3};
        fArr[0] = fArr[0] + ((float) (view.getScrollX() - view2.getLeft()));
        fArr[1] = fArr[1] + ((float) (view.getScrollY() - view2.getTop()));
        if (fArr[0] < 0.0f || fArr[1] < 0.0f || fArr[0] >= ((float) view2.getWidth()) || fArr[1] >= ((float) view2.getHeight())) {
            return false;
        }
        pointF.set(fArr[0] - f2, fArr[1] - f3);
        return true;
    }
}
