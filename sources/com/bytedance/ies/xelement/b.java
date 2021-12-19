package com.bytedance.ies.xelement;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.core.h.k;
import androidx.core.h.m;
import androidx.core.h.o;
import androidx.core.h.q;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import h.n;
import h.w;

public final class b extends FrameLayout implements k, o {

    /* renamed from: a  reason: collision with root package name */
    public static final a f36682a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private c f36683b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f36684c;

    /* renamed from: d  reason: collision with root package name */
    private final q f36685d;

    /* renamed from: e  reason: collision with root package name */
    private final m f36686e;

    /* renamed from: f  reason: collision with root package name */
    private int f36687f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f36688g;

    /* renamed from: h  reason: collision with root package name */
    private OverScroller f36689h;

    /* renamed from: i  reason: collision with root package name */
    private View f36690i;

    /* renamed from: j  reason: collision with root package name */
    private View f36691j;

    /* renamed from: k  reason: collision with root package name */
    private AbstractC0892b f36692k;

    /* renamed from: com.bytedance.ies.xelement.b$b  reason: collision with other inner class name */
    public interface AbstractC0892b {
        static {
            Covode.recordClassIndex(22022);
        }

        void a();
    }

    public enum c {
        VERTICAL_TOP,
        VERTICAL_BOTTOM,
        HORIZONTAL_LEFT,
        HORIZONTAL_RIGHT;

        static {
            Covode.recordClassIndex(22023);
        }
    }

    static {
        Covode.recordClassIndex(22020);
    }

    @Override // androidx.core.h.n
    public final boolean onNestedFling(View view, float f2, float f3, boolean z) {
        l.c(view, "");
        return false;
    }

    @Override // androidx.core.h.n
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        l.c(view, "");
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(22021);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final View getMBounceView() {
        return this.f36691j;
    }

    public final View getMContentView() {
        return this.f36690i;
    }

    public final boolean getMEnableBounce() {
        return this.f36684c;
    }

    public final c getMScrollDirection() {
        return this.f36683b;
    }

    public final int getNestedScrollAxes() {
        return this.f36685d.a();
    }

    @Override // androidx.core.h.j
    public final boolean isNestedScrollingEnabled() {
        return this.f36686e.f2548a;
    }

    public final void computeScroll() {
        if (this.f36689h.computeScrollOffset()) {
            scrollTo(this.f36689h.getCurrX(), this.f36689h.getCurrY());
            postInvalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final int computeHorizontalScrollRange() {
        if (this.f36683b != c.HORIZONTAL_RIGHT || this.f36683b != c.HORIZONTAL_LEFT) {
            return super.computeHorizontalScrollRange();
        }
        int childCount = getChildCount();
        int i2 = 0;
        if (childCount >= 0) {
            int i3 = 0;
            while (true) {
                View childAt = getChildAt(i3);
                l.a((Object) childAt, "");
                i2 += childAt.getWidth();
                if (i3 == childCount) {
                    break;
                }
                i3++;
            }
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    public final int computeVerticalScrollRange() {
        if (this.f36683b != c.VERTICAL_BOTTOM || this.f36683b != c.VERTICAL_TOP) {
            return super.computeVerticalScrollRange();
        }
        int childCount = getChildCount();
        int i2 = 0;
        if (childCount >= 0) {
            int i3 = 0;
            while (true) {
                View childAt = getChildAt(i3);
                l.a((Object) childAt, "");
                i2 += childAt.getHeight();
                if (i3 == childCount) {
                    break;
                }
                i3++;
            }
        }
        return i2;
    }

    public final void setMEnableBounce(boolean z) {
        this.f36684c = z;
    }

    public final void setOnScrollToEndListener(AbstractC0892b bVar) {
        this.f36692k = bVar;
    }

    @Override // androidx.core.h.k
    public final void a(int i2) {
        this.f36686e.b(i2);
    }

    public final void setMScrollDirection(c cVar) {
        l.c(cVar, "");
        this.f36683b = cVar;
    }

    public final void setNestedScrollingEnabled(boolean z) {
        this.f36686e.a(z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        this(context, (byte) 0);
        l.c(context, "");
    }

    public final void setMBounceView(View view) {
        View view2 = this.f36691j;
        if (view2 != null) {
            removeView(view2);
        }
        if (view != null) {
            addView(view);
        }
        this.f36691j = view;
    }

    public final void setMContentView(View view) {
        View view2 = this.f36690i;
        if (view2 != null) {
            removeView(view2);
        }
        if (view != null) {
            addView(view, -1, -1);
        }
        this.f36690i = view;
    }

    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return this.f36686e.a(f2, f3);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private b(Context context, byte b2) {
        this(context, (char) 0);
        l.c(context, "");
    }

    private final void a(int i2, int i3) {
        this.f36689h.startScroll(getScrollX(), getScrollY(), i2, i3);
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private b(Context context, char c2) {
        super(context, null, 0);
        l.c(context, "");
        MethodCollector.i(1676);
        this.f36683b = c.HORIZONTAL_RIGHT;
        this.f36685d = new q();
        this.f36686e = new m(this);
        this.f36689h = new OverScroller(context);
        MethodCollector.o(1676);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int measuredHeight;
        int i4;
        MethodCollector.i(1575);
        super.onMeasure(i2, i3);
        View view = this.f36691j;
        if (view != null) {
            measureChildWithMargins(view, i2, 0, i3, 0);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int i5 = c.f36821a[this.f36683b.ordinal()];
                if (i5 == 1 || i5 == 2) {
                    measuredHeight = view.getMeasuredHeight() + marginLayoutParams.topMargin;
                    i4 = marginLayoutParams.bottomMargin;
                } else if (i5 == 3 || i5 == 4) {
                    measuredHeight = view.getMeasuredWidth() + marginLayoutParams.rightMargin;
                    i4 = marginLayoutParams.leftMargin;
                } else {
                    n nVar = new n();
                    MethodCollector.o(1575);
                    throw nVar;
                }
                this.f36687f = measuredHeight + i4;
                MethodCollector.o(1575);
                return;
            }
            w wVar = new w("null cannot be cast to non-null type");
            MethodCollector.o(1575);
            throw wVar;
        }
        MethodCollector.o(1575);
    }

    @Override // androidx.core.h.o
    public final void b(View view, int i2) {
        AbstractC0892b bVar;
        AbstractC0892b bVar2;
        AbstractC0892b bVar3;
        AbstractC0892b bVar4;
        l.c(view, "");
        this.f36685d.a(i2);
        if (i2 != 1) {
            int i3 = c.f36826f[this.f36683b.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4 && getScrollY() < 0) {
                            double abs = (double) Math.abs(getScrollY());
                            double d2 = (double) this.f36687f;
                            Double.isNaN(d2);
                            if (abs > d2 * 0.88d && (bVar4 = this.f36692k) != null) {
                                bVar4.a();
                            }
                            a(0, -getScrollY());
                        }
                    } else if (getScrollY() > 0) {
                        double scrollY = (double) getScrollY();
                        double d3 = (double) this.f36687f;
                        Double.isNaN(d3);
                        if (scrollY > d3 * 0.88d && (bVar3 = this.f36692k) != null) {
                            bVar3.a();
                        }
                        a(0, -getScrollY());
                    }
                } else if (getScrollX() < 0) {
                    double abs2 = (double) Math.abs(getScrollX());
                    double d4 = (double) this.f36687f;
                    Double.isNaN(d4);
                    if (abs2 > d4 * 0.88d && (bVar2 = this.f36692k) != null) {
                        bVar2.a();
                    }
                    a(-getScrollX(), 0);
                }
            } else if (getScrollX() > 0) {
                double scrollX = (double) getScrollX();
                double d5 = (double) this.f36687f;
                Double.isNaN(d5);
                if (scrollX > d5 * 0.88d && (bVar = this.f36692k) != null) {
                    bVar.a();
                }
                a(-getScrollX(), 0);
            }
        }
    }

    public final boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return this.f36686e.a(f2, f3, z);
    }

    @Override // androidx.core.h.o
    public final void b(View view, View view2, int i2, int i3) {
        l.c(view, "");
        l.c(view2, "");
        this.f36685d.a(i2, i3);
    }

    @Override // androidx.core.h.o
    public final boolean a(View view, View view2, int i2, int i3) {
        l.c(view, "");
        l.c(view2, "");
        if (!this.f36684c) {
            return false;
        }
        int i4 = c.f36823c[this.f36683b.ordinal()];
        if (i4 == 1 || i4 == 2) {
            if (i2 == 1) {
                return true;
            }
            return false;
        } else if (i4 != 3 && i4 != 4) {
            throw new n();
        } else if (i2 == 2) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int measuredHeight;
        MethodCollector.i(1586);
        super.onLayout(z, getLeft(), getTop(), getRight(), getBottom());
        View view = this.f36691j;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int i6 = c.f36822b[this.f36683b.ordinal()];
                int i7 = 0;
                if (i6 == 1) {
                    i7 = marginLayoutParams.leftMargin;
                    measuredHeight = marginLayoutParams.topMargin + getMeasuredHeight();
                } else if (i6 == 2) {
                    i7 = marginLayoutParams.leftMargin;
                    measuredHeight = -(view.getMeasuredHeight() + marginLayoutParams.bottomMargin);
                } else if (i6 == 3) {
                    i7 = getMeasuredWidth() + marginLayoutParams.leftMargin;
                    measuredHeight = marginLayoutParams.topMargin;
                } else if (i6 != 4) {
                    measuredHeight = 0;
                } else {
                    i7 = -(view.getMeasuredWidth() + marginLayoutParams.rightMargin);
                    measuredHeight = marginLayoutParams.topMargin;
                }
                view.layout(i7, measuredHeight, view.getMeasuredWidth() + i7, view.getMeasuredHeight() + measuredHeight);
                MethodCollector.o(1586);
                return;
            }
            w wVar = new w("null cannot be cast to non-null type");
            MethodCollector.o(1586);
            throw wVar;
        }
        MethodCollector.o(1586);
    }

    @Override // androidx.core.h.o
    public final void a(View view, int i2, int i3, int[] iArr, int i4) {
        l.c(view, "");
        l.c(iArr, "");
        if (i4 == 0) {
            int i5 = c.f36824d[this.f36683b.ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 == 4) {
                            if (!view.canScrollVertically(-1) && i3 < 0) {
                                if (Math.abs(i3) + Math.abs(getScrollY()) > this.f36687f) {
                                    scrollTo(getScrollX(), -this.f36687f);
                                } else {
                                    requestDisallowInterceptTouchEvent(true);
                                    scrollBy(0, i3);
                                }
                                iArr[1] = i3;
                            } else if (i3 > 0 && getScrollY() < 0) {
                                if (i3 > Math.abs(getScrollY())) {
                                    scrollBy(0, -getScrollY());
                                } else {
                                    scrollBy(0, i3);
                                }
                                iArr[1] = i3;
                            }
                        }
                    } else if (!view.canScrollVertically(1) && i3 > 0) {
                        if (getScrollY() + i3 > this.f36687f) {
                            scrollTo(getScrollX(), this.f36687f);
                        } else {
                            requestDisallowInterceptTouchEvent(true);
                            scrollBy(0, i3);
                        }
                        iArr[1] = i3;
                    } else if (i3 < 0 && getScrollY() > 0) {
                        if (Math.abs(i3) > getScrollY()) {
                            scrollBy(0, -getScrollY());
                        } else {
                            scrollBy(0, i3);
                        }
                        iArr[1] = i3;
                    }
                } else if (!view.canScrollHorizontally(-1) && i2 < 0) {
                    int abs = Math.abs(i2) + Math.abs(getScrollX());
                    int i6 = this.f36687f;
                    if (abs > i6) {
                        scrollTo(-i6, getScrollY());
                    } else {
                        requestDisallowInterceptTouchEvent(true);
                        scrollBy(i2, 0);
                    }
                    iArr[0] = i2;
                } else if (i2 > 0 && getScrollX() < 0) {
                    if (i2 > Math.abs(getScrollX())) {
                        scrollBy(-getScrollX(), 0);
                    } else {
                        scrollBy(i2, 0);
                    }
                    iArr[0] = i2;
                }
            } else if (!view.canScrollHorizontally(1) && i2 > 0) {
                int scrollX = getScrollX() + i2;
                int i7 = this.f36687f;
                if (scrollX > i7) {
                    scrollTo(i7, getScrollY());
                } else {
                    requestDisallowInterceptTouchEvent(true);
                    scrollBy(i2, 0);
                }
                iArr[0] = i2;
            } else if (i2 < 0 && getScrollX() > 0) {
                if (Math.abs(i2) > getScrollX()) {
                    scrollBy(-getScrollX(), 0);
                } else {
                    scrollBy(i2, 0);
                }
                iArr[0] = i2;
            }
        }
    }

    @Override // androidx.core.h.o
    public final void a(View view, int i2, int i3, int i4, int i5, int i6) {
        l.c(view, "");
        if (i6 == 1) {
            int i7 = c.f36825e[this.f36683b.ordinal()];
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 == 4) {
                            if (this.f36688g && getScrollY() == this.f36687f) {
                                a(0, -getScrollY());
                                this.f36688g = false;
                            } else if (i3 > 0 && i5 > 0) {
                                a(0, -this.f36687f);
                                this.f36688g = true;
                            }
                        }
                    } else if (this.f36688g && getScrollY() == this.f36687f) {
                        a(0, -getScrollY());
                        this.f36688g = false;
                    } else if (i3 > 0 && i5 > 0) {
                        a(0, this.f36687f);
                        this.f36688g = true;
                    }
                } else if (this.f36688g && Math.abs(getScrollX()) == this.f36687f) {
                    a(-getScrollX(), 0);
                    this.f36688g = false;
                } else if (i2 < 0 && i4 < 0) {
                    a(-this.f36687f, 0);
                    this.f36688g = true;
                }
            } else if (this.f36688g && Math.abs(getScrollX()) == this.f36687f) {
                a(-getScrollX(), 0);
                this.f36688g = false;
            } else if (i2 > 0 && i4 > 0) {
                a(this.f36687f, 0);
                this.f36688g = true;
            }
        }
    }
}
