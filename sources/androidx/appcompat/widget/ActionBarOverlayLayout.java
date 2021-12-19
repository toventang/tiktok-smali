package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.o;
import androidx.core.h.n;
import androidx.core.h.q;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class ActionBarOverlayLayout extends ViewGroup implements u, n {

    /* renamed from: g  reason: collision with root package name */
    static final int[] f1297g = {R.attr.h0, 16842841};
    private final Runnable A = new Runnable() {
        /* class androidx.appcompat.widget.ActionBarOverlayLayout.AnonymousClass3 */

        static {
            Covode.recordClassIndex(373);
        }

        public final void run() {
            ActionBarOverlayLayout.this.a();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1302e = actionBarOverlayLayout.f1298a.animate().translationY((float) (-ActionBarOverlayLayout.this.f1298a.getHeight())).setListener(ActionBarOverlayLayout.this.f1303f);
        }
    };
    private final q B;

    /* renamed from: a  reason: collision with root package name */
    ActionBarContainer f1298a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1299b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1300c;

    /* renamed from: d  reason: collision with root package name */
    boolean f1301d;

    /* renamed from: e  reason: collision with root package name */
    ViewPropertyAnimator f1302e;

    /* renamed from: f  reason: collision with root package name */
    final AnimatorListenerAdapter f1303f = new AnimatorListenerAdapter() {
        /* class androidx.appcompat.widget.ActionBarOverlayLayout.AnonymousClass1 */

        static {
            Covode.recordClassIndex(371);
        }

        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout.this.f1302e = null;
            ActionBarOverlayLayout.this.f1301d = false;
        }

        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout.this.f1302e = null;
            ActionBarOverlayLayout.this.f1301d = false;
        }
    };

    /* renamed from: h  reason: collision with root package name */
    private int f1304h;

    /* renamed from: i  reason: collision with root package name */
    private int f1305i;

    /* renamed from: j  reason: collision with root package name */
    private ContentFrameLayout f1306j;

    /* renamed from: k  reason: collision with root package name */
    private v f1307k;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f1308l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1309m;
    private boolean n;
    private int o;
    private int p;
    private final Rect q = new Rect();
    private final Rect r = new Rect();
    private final Rect s = new Rect();
    private final Rect t = new Rect();
    private final Rect u = new Rect();
    private final Rect v = new Rect();
    private final Rect w = new Rect();
    private a x;
    private OverScroller y;
    private final Runnable z = new Runnable() {
        /* class androidx.appcompat.widget.ActionBarOverlayLayout.AnonymousClass2 */

        static {
            Covode.recordClassIndex(372);
        }

        public final void run() {
            ActionBarOverlayLayout.this.a();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1302e = actionBarOverlayLayout.f1298a.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f1303f);
        }
    };

    public interface a {
        static {
            Covode.recordClassIndex(374);
        }

        void b(int i2);

        void e(boolean z);

        void k();

        void l();

        void m();
    }

    @Override // androidx.core.h.n
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // androidx.core.h.n
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        static {
            Covode.recordClassIndex(375);
        }

        public b() {
            super(-1, -1);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    public int getNestedScrollAxes() {
        return this.B.a();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override // androidx.appcompat.widget.u
    public final boolean b() {
        i();
        return this.f1307k.f();
    }

    @Override // androidx.appcompat.widget.u
    public final boolean c() {
        i();
        return this.f1307k.g();
    }

    @Override // androidx.appcompat.widget.u
    public final boolean d() {
        i();
        return this.f1307k.h();
    }

    @Override // androidx.appcompat.widget.u
    public final boolean e() {
        i();
        return this.f1307k.i();
    }

    @Override // androidx.appcompat.widget.u
    public final boolean f() {
        i();
        return this.f1307k.j();
    }

    @Override // androidx.appcompat.widget.u
    public final void g() {
        i();
        this.f1307k.k();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1298a;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public CharSequence getTitle() {
        i();
        return this.f1307k.e();
    }

    @Override // androidx.appcompat.widget.u
    public final void h() {
        i();
        this.f1307k.l();
    }

    static {
        Covode.recordClassIndex(370);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        removeCallbacks(this.z);
        removeCallbacks(this.A);
        ViewPropertyAnimator viewPropertyAnimator = this.f1302e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    private void i() {
        if (this.f1306j == null) {
            this.f1306j = (ContentFrameLayout) findViewById(R.id.by);
            this.f1298a = (ActionBarContainer) findViewById(R.id.bz);
            this.f1307k = a(findViewById(R.id.bx));
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.n = z2;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    @Override // androidx.appcompat.widget.u
    public final void a(int i2) {
        i();
        if (i2 == 109) {
            setOverlayMode(true);
        }
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(getContext());
        v.n(this);
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f1305i = i2;
        a aVar = this.x;
        if (aVar != null) {
            aVar.b(i2);
        }
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f1300c) {
            this.f1300c = z2;
            if (!z2) {
                a();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i2) {
        i();
        this.f1307k.a(i2);
    }

    public void setLogo(int i2) {
        i();
        this.f1307k.b(i2);
    }

    @Override // androidx.appcompat.widget.u
    public void setWindowCallback(Window.Callback callback) {
        i();
        this.f1307k.a(callback);
    }

    @Override // androidx.appcompat.widget.u
    public void setWindowTitle(CharSequence charSequence) {
        i();
        this.f1307k.a(charSequence);
    }

    public void setActionBarHideOffset(int i2) {
        a();
        this.f1298a.setTranslationY((float) (-Math.max(0, Math.min(i2, this.f1298a.getHeight()))));
    }

    public void setActionBarVisibilityCallback(a aVar) {
        this.x = aVar;
        if (getWindowToken() != null) {
            this.x.b(this.f1305i);
            int i2 = this.p;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                v.n(this);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        i();
        this.f1307k.a(drawable);
    }

    public void setOverlayMode(boolean z2) {
        boolean z3;
        this.f1299b = z2;
        if (!z2 || getContext().getApplicationInfo().targetSdkVersion >= 19) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f1309m = z3;
    }

    private static v a(View view) {
        if (view instanceof v) {
            return (v) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.f1308l != null && !this.f1309m) {
            if (this.f1298a.getVisibility() == 0) {
                i2 = (int) (((float) this.f1298a.getBottom()) + this.f1298a.getTranslationY() + 0.5f);
            } else {
                i2 = 0;
            }
            this.f1308l.setBounds(0, i2, getWidth(), this.f1308l.getIntrinsicHeight() + i2);
            this.f1308l.draw(canvas);
        }
    }

    @Override // androidx.core.h.n
    public void onStopNestedScroll(View view) {
        if (this.f1300c && !this.f1301d) {
            if (this.o <= this.f1298a.getHeight()) {
                a();
                postDelayed(this.z, 600);
                return;
            }
            a();
            postDelayed(this.A, 600);
        }
    }

    private void a(Context context) {
        boolean z2;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1297g);
        boolean z3 = false;
        this.f1304h = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1308l = drawable;
        if (drawable == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        setWillNotDraw(z2);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z3 = true;
        }
        this.f1309m = z3;
        this.y = new OverScroller(context);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0042, code lost:
        if (r3 != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean fitSystemWindows(android.graphics.Rect r5) {
        /*
            r4 = this;
            r4.i()
            androidx.core.h.v.m(r4)
            androidx.appcompat.widget.ActionBarContainer r1 = r4.f1298a
            r0 = 0
            boolean r3 = a(r1, r5, r0)
            android.graphics.Rect r0 = r4.t
            r0.set(r5)
            android.graphics.Rect r1 = r4.t
            android.graphics.Rect r0 = r4.q
            androidx.appcompat.widget.ar.a(r4, r1, r0)
            android.graphics.Rect r1 = r4.u
            android.graphics.Rect r0 = r4.t
            boolean r0 = r1.equals(r0)
            r2 = 1
            if (r0 != 0) goto L_0x002c
            android.graphics.Rect r1 = r4.u
            android.graphics.Rect r0 = r4.t
            r1.set(r0)
            r3 = 1
        L_0x002c:
            android.graphics.Rect r1 = r4.r
            android.graphics.Rect r0 = r4.q
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0042
            android.graphics.Rect r1 = r4.r
            android.graphics.Rect r0 = r4.q
            r1.set(r0)
            r0 = 1
        L_0x003e:
            r4.requestLayout()
        L_0x0041:
            return r2
        L_0x0042:
            if (r3 == 0) goto L_0x0041
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.fitSystemWindows(android.graphics.Rect):boolean");
    }

    public void onWindowSystemUiVisibilityChanged(int i2) {
        boolean z2;
        int i3 = Build.VERSION.SDK_INT;
        super.onWindowSystemUiVisibilityChanged(i2);
        i();
        int i4 = this.p ^ i2;
        this.p = i2;
        boolean z3 = false;
        if ((i2 & 4) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i2 & 256) != 0) {
            z3 = true;
        }
        a aVar = this.x;
        if (aVar != null) {
            aVar.e(!z3);
            if (z2 || !z3) {
                this.x.k();
            } else {
                this.x.l();
            }
        }
        if ((i4 & 256) != 0 && this.x != null) {
            v.n(this);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
        this.B = new q();
    }

    @Override // androidx.appcompat.widget.u
    public final void a(Menu menu, o.a aVar) {
        i();
        this.f1307k.a(menu, aVar);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        boolean z2;
        int measuredHeight;
        i();
        measureChildWithMargins(this.f1298a, i2, 0, i3, 0);
        b bVar = (b) this.f1298a.getLayoutParams();
        int max = Math.max(0, this.f1298a.getMeasuredWidth() + bVar.leftMargin + bVar.rightMargin);
        int max2 = Math.max(0, this.f1298a.getMeasuredHeight() + bVar.topMargin + bVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1298a.getMeasuredState());
        if ((v.m(this) & 256) != 0) {
            z2 = true;
            measuredHeight = this.f1304h;
            if (this.n && this.f1298a.getTabContainer() != null) {
                measuredHeight += this.f1304h;
            }
        } else {
            z2 = false;
            measuredHeight = this.f1298a.getVisibility() != 8 ? this.f1298a.getMeasuredHeight() : 0;
        }
        this.s.set(this.q);
        this.v.set(this.t);
        if (this.f1299b || z2) {
            this.v.top += measuredHeight;
            this.v.bottom += 0;
        } else {
            this.s.top += measuredHeight;
            this.s.bottom += 0;
        }
        a(this.f1306j, this.s, true);
        if (!this.w.equals(this.v)) {
            this.w.set(this.v);
            this.f1306j.a(this.v);
        }
        measureChildWithMargins(this.f1306j, i2, 0, i3, 0);
        b bVar2 = (b) this.f1306j.getLayoutParams();
        int max3 = Math.max(max, this.f1306j.getMeasuredWidth() + bVar2.leftMargin + bVar2.rightMargin);
        int max4 = Math.max(max2, this.f1306j.getMeasuredHeight() + bVar2.topMargin + bVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1306j.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    @Override // androidx.core.h.n
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.B.a(i2, 0);
        this.o = getActionBarHideOffset();
        a();
        a aVar = this.x;
        if (aVar != null) {
            aVar.m();
        }
    }

    @Override // androidx.core.h.n
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f1298a.getVisibility() != 0) {
            return false;
        }
        return this.f1300c;
    }

    private static boolean a(View view, Rect rect, boolean z2) {
        boolean z3;
        b bVar = (b) view.getLayoutParams();
        if (bVar.leftMargin != rect.left) {
            bVar.leftMargin = rect.left;
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVar.topMargin != rect.top) {
            bVar.topMargin = rect.top;
            z3 = true;
        }
        if (bVar.rightMargin != rect.right) {
            bVar.rightMargin = rect.right;
            z3 = true;
        }
        if (!z2 || bVar.bottomMargin == rect.bottom) {
            return z3;
        }
        bVar.bottomMargin = rect.bottom;
        return true;
    }

    @Override // androidx.core.h.n
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.f1300c || !z2) {
            return false;
        }
        this.y.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.y.getFinalY() > this.f1298a.getHeight()) {
            a();
            this.A.run();
        } else {
            a();
            this.z.run();
        }
        this.f1301d = true;
        return true;
    }

    @Override // androidx.core.h.n
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.o + i3;
        this.o = i6;
        setActionBarHideOffset(i6);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                b bVar = (b) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = bVar.leftMargin + paddingLeft;
                int i8 = bVar.topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }
}
