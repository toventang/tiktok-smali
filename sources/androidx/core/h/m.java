package androidx.core.h;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2548a;

    /* renamed from: b  reason: collision with root package name */
    private ViewParent f2549b;

    /* renamed from: c  reason: collision with root package name */
    private ViewParent f2550c;

    /* renamed from: d  reason: collision with root package name */
    private final View f2551d;

    /* renamed from: e  reason: collision with root package name */
    private int[] f2552e;

    static {
        Covode.recordClassIndex(864);
    }

    public final boolean a(int i2, int i3, int[] iArr, int[] iArr2) {
        return a(i2, i3, iArr, iArr2, 0);
    }

    public final boolean a(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        ViewParent c2;
        int i5;
        int i6;
        int[] iArr3 = iArr;
        if (!this.f2548a || (c2 = c(i4)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f2551d.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i6 = iArr2[1];
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (iArr3 == null) {
            iArr3 = a();
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        y.a(c2, this.f2551d, i2, i3, iArr3, i4);
        if (iArr2 != null) {
            this.f2551d.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i6;
        }
        if (iArr3[0] == 0 && iArr3[1] == 0) {
            return false;
        }
        return true;
    }

    private int[] a() {
        if (this.f2552e == null) {
            this.f2552e = new int[2];
        }
        return this.f2552e;
    }

    public m(View view) {
        this.f2551d = view;
    }

    private ViewParent c(int i2) {
        if (i2 == 0) {
            return this.f2549b;
        }
        if (i2 != 1) {
            return null;
        }
        return this.f2550c;
    }

    public final void a(boolean z) {
        if (this.f2548a) {
            View view = this.f2551d;
            if (Build.VERSION.SDK_INT >= 21) {
                view.stopNestedScroll();
            } else if (view instanceof j) {
                ((j) view).stopNestedScroll();
            }
        }
        this.f2548a = z;
    }

    public final void b(int i2) {
        ViewParent c2 = c(i2);
        if (c2 != null) {
            View view = this.f2551d;
            if (c2 instanceof o) {
                ((o) c2).b(view, i2);
            } else if (i2 == 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        c2.onStopNestedScroll(view);
                    } catch (AbstractMethodError unused) {
                        new StringBuilder("ViewParent ").append(c2).append(" does not implement interface method onStopNestedScroll");
                    }
                } else if (c2 instanceof n) {
                    ((n) c2).onStopNestedScroll(view);
                }
            }
            a(i2, (ViewParent) null);
        }
    }

    public final boolean a(int i2) {
        if (c(i2) != null) {
            return true;
        }
        return false;
    }

    private void a(int i2, ViewParent viewParent) {
        if (i2 == 0) {
            this.f2549b = viewParent;
        } else if (i2 == 1) {
            this.f2550c = viewParent;
        }
    }

    public final boolean a(float f2, float f3) {
        ViewParent c2;
        if (!this.f2548a || (c2 = c(0)) == null) {
            return false;
        }
        return y.a(c2, this.f2551d, f2, f3);
    }

    public final boolean a(int i2, int i3) {
        if (a(i3)) {
            return true;
        }
        if (!this.f2548a) {
            return false;
        }
        View view = this.f2551d;
        for (ViewParent parent = this.f2551d.getParent(); parent != null; parent = parent.getParent()) {
            if (y.a(parent, view, this.f2551d, i2, i3)) {
                a(i3, parent);
                View view2 = this.f2551d;
                if (parent instanceof o) {
                    ((o) parent).b(view, view2, i2, i3);
                } else if (i3 == 0) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        try {
                            parent.onNestedScrollAccepted(view, view2, i2);
                        } catch (AbstractMethodError unused) {
                            new StringBuilder("ViewParent ").append(parent).append(" does not implement interface method onNestedScrollAccepted");
                        }
                    } else if (parent instanceof n) {
                        ((n) parent).onNestedScrollAccepted(view, view2, i2);
                    }
                }
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public final boolean a(float f2, float f3, boolean z) {
        ViewParent c2;
        if (!this.f2548a || (c2 = c(0)) == null) {
            return false;
        }
        return y.a(c2, this.f2551d, f2, f3, z);
    }

    public final boolean a(int i2, int i3, int i4, int i5, int[] iArr) {
        return b(i2, i3, i4, i5, iArr, 0, null);
    }

    public final void a(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        b(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public final boolean b(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        ViewParent c2;
        int i7;
        int i8;
        int[] iArr3 = iArr2;
        if (!this.f2548a || (c2 = c(i6)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f2551d.getLocationInWindow(iArr);
            i7 = iArr[0];
            i8 = iArr[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr3 == null) {
            iArr3 = a();
            iArr3[0] = 0;
            iArr3[1] = 0;
        }
        y.a(c2, this.f2551d, i2, i3, i4, i5, i6, iArr3);
        if (iArr != null) {
            this.f2551d.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i8;
        }
        return true;
    }
}
