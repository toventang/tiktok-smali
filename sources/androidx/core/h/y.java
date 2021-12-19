package androidx.core.h;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;

public final class y {
    static {
        Covode.recordClassIndex(887);
    }

    public static boolean a(ViewParent viewParent, View view, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedPreFling(view, f2, f3);
            } catch (AbstractMethodError unused) {
                new StringBuilder("ViewParent ").append(viewParent).append(" does not implement interface method onNestedPreFling");
                return false;
            }
        } else if (viewParent instanceof n) {
            return ((n) viewParent).onNestedPreFling(view, f2, f3);
        } else {
            return false;
        }
    }

    public static boolean a(ViewParent viewParent, View view, float f2, float f3, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedFling(view, f2, f3, z);
            } catch (AbstractMethodError unused) {
                new StringBuilder("ViewParent ").append(viewParent).append(" does not implement interface method onNestedFling");
                return false;
            }
        } else if (viewParent instanceof n) {
            return ((n) viewParent).onNestedFling(view, f2, f3, z);
        } else {
            return false;
        }
    }

    public static boolean a(ViewParent viewParent, View view, View view2, int i2, int i3) {
        if (viewParent instanceof o) {
            return ((o) viewParent).a(view, view2, i2, i3);
        }
        if (i3 != 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onStartNestedScroll(view, view2, i2);
            } catch (AbstractMethodError unused) {
                new StringBuilder("ViewParent ").append(viewParent).append(" does not implement interface method onStartNestedScroll");
                return false;
            }
        } else if (viewParent instanceof n) {
            return ((n) viewParent).onStartNestedScroll(view, view2, i2);
        } else {
            return false;
        }
    }

    public static void a(ViewParent viewParent, View view, int i2, int i3, int[] iArr, int i4) {
        if (viewParent instanceof o) {
            ((o) viewParent).a(view, i2, i3, iArr, i4);
        } else if (i4 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedPreScroll(view, i2, i3, iArr);
                } catch (AbstractMethodError unused) {
                    new StringBuilder("ViewParent ").append(viewParent).append(" does not implement interface method onNestedPreScroll");
                }
            } else if (viewParent instanceof n) {
                ((n) viewParent).onNestedPreScroll(view, i2, i3, iArr);
            }
        }
    }

    public static void a(ViewParent viewParent, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (viewParent instanceof p) {
            ((p) viewParent).a(view, i2, i3, i4, i5, i6, iArr);
            return;
        }
        iArr[0] = iArr[0] + i4;
        iArr[1] = iArr[1] + i5;
        if (viewParent instanceof o) {
            ((o) viewParent).a(view, i2, i3, i4, i5, i6);
        } else if (i6 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScroll(view, i2, i3, i4, i5);
                } catch (AbstractMethodError unused) {
                    new StringBuilder("ViewParent ").append(viewParent).append(" does not implement interface method onNestedScroll");
                }
            } else if (viewParent instanceof n) {
                ((n) viewParent).onNestedScroll(view, i2, i3, i4, i5);
            }
        }
    }
}
