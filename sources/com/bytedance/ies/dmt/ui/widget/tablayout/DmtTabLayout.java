package com.bytedance.ies.dmt.ui.widget.tablayout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.an;
import androidx.core.g.f;
import androidx.core.h.s;
import androidx.core.h.v;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@ViewPager.a
public class DmtTabLayout extends HorizontalScrollView {
    private static final int[] N = {R.attr.ol};

    /* renamed from: a  reason: collision with root package name */
    public static final Interpolator f33711a = new androidx.g.a.a.b();

    /* renamed from: b  reason: collision with root package name */
    public static final f.a<f> f33712b = new f.c(16);
    private int A;
    private final int B;
    private int C;
    private c D;
    private c E;
    private ValueAnimator F;
    private PagerAdapter G;
    private DataSetObserver H;
    private a I;
    private boolean J;
    private float K;
    private float L;
    private final f.a<h> M;

    /* renamed from: c  reason: collision with root package name */
    public final e f33713c;

    /* renamed from: d  reason: collision with root package name */
    int f33714d;

    /* renamed from: e  reason: collision with root package name */
    int f33715e;

    /* renamed from: f  reason: collision with root package name */
    int f33716f;

    /* renamed from: g  reason: collision with root package name */
    int f33717g;

    /* renamed from: h  reason: collision with root package name */
    int f33718h;

    /* renamed from: i  reason: collision with root package name */
    ColorStateList f33719i;

    /* renamed from: j  reason: collision with root package name */
    float f33720j;

    /* renamed from: k  reason: collision with root package name */
    float f33721k;

    /* renamed from: l  reason: collision with root package name */
    int f33722l;

    /* renamed from: m  reason: collision with root package name */
    int f33723m;
    int n;
    int o;
    int p;
    boolean q;
    public final ArrayList<c> r;
    ViewPager s;
    g t;
    public b u;
    public int v;
    private final ArrayList<f> w;
    private f x;
    private int y;
    private int z;

    public interface b {
        static {
            Covode.recordClassIndex(20048);
        }

        void a(f fVar);
    }

    public interface c {
        static {
            Covode.recordClassIndex(20049);
        }

        void a(f fVar);

        void b(f fVar);
    }

    public class h extends LinearLayout {

        /* renamed from: b  reason: collision with root package name */
        private f f33766b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f33767c;

        /* renamed from: d  reason: collision with root package name */
        private ImageView f33768d;

        /* renamed from: e  reason: collision with root package name */
        private View f33769e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f33770f;

        /* renamed from: g  reason: collision with root package name */
        private ImageView f33771g;

        /* renamed from: h  reason: collision with root package name */
        private int f33772h = 2;

        static {
            Covode.recordClassIndex(20056);
        }

        public final TextView getCustomTextView() {
            return this.f33770f;
        }

        public final f getTab() {
            return this.f33766b;
        }

        public final TextView getTextView() {
            return this.f33767c;
        }

        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f33766b == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            if (DmtTabLayout.this.u != null) {
                DmtTabLayout.this.u.a(this.f33766b);
            } else {
                this.f33766b.a();
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            View view;
            MethodCollector.i(11911);
            f fVar = this.f33766b;
            if (fVar == null || (view = fVar.f33753f) == null) {
                View view2 = this.f33769e;
                if (view2 != null) {
                    removeView(view2);
                    this.f33769e = null;
                }
                this.f33770f = null;
                this.f33771g = null;
            } else {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f33769e = view;
                TextView textView = this.f33767c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f33768d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f33768d.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.f33770f = textView2;
                if (textView2 != null) {
                    this.f33772h = androidx.core.widget.h.a(textView2);
                }
                this.f33771g = (ImageView) view.findViewById(16908294);
            }
            boolean z = false;
            if (this.f33769e == null) {
                if (this.f33768d == null) {
                    ImageView imageView2 = (ImageView) com.a.a(LayoutInflater.from(getContext()), R.layout.vo, this, false);
                    addView(imageView2, 0);
                    this.f33768d = imageView2;
                }
                if (this.f33767c == null) {
                    TextView textView3 = (TextView) com.a.a(LayoutInflater.from(getContext()), R.layout.bi4, this, false);
                    addView(textView3);
                    this.f33767c = textView3;
                    this.f33772h = androidx.core.widget.h.a(textView3);
                }
                androidx.core.widget.h.a(this.f33767c, DmtTabLayout.this.f33718h);
                if (DmtTabLayout.this.f33719i != null) {
                    this.f33767c.setTextColor(DmtTabLayout.this.f33719i);
                }
                a(this.f33767c, this.f33768d);
            } else {
                TextView textView4 = this.f33770f;
                if (!(textView4 == null && this.f33771g == null)) {
                    a(textView4, this.f33771g);
                }
            }
            if (fVar != null && fVar.b()) {
                z = true;
            }
            setSelected(z);
            MethodCollector.o(11911);
        }

        public final void a(f fVar) {
            if (fVar != this.f33766b) {
                this.f33766b = fVar;
            }
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(a.b.class.getName());
        }

        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(a.b.class.getName());
        }

        /* access modifiers changed from: package-private */
        public final void setTab(f fVar) {
            if (fVar != this.f33766b) {
                this.f33766b = fVar;
                a();
            }
        }

        public final void setSelected(boolean z) {
            boolean z2;
            if (isSelected() != z) {
                z2 = true;
            } else {
                z2 = false;
            }
            super.setSelected(z);
            if (z2 && z) {
                int i2 = Build.VERSION.SDK_INT;
            }
            TextView textView = this.f33767c;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f33768d;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f33769e;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public h(Context context) {
            super(context);
            MethodCollector.i(11741);
            if (DmtTabLayout.this.f33722l != 0) {
                v.a(this, androidx.appcompat.a.a.a.b(context, DmtTabLayout.this.f33722l));
            }
            v.a(this, DmtTabLayout.this.f33714d, DmtTabLayout.this.f33715e, DmtTabLayout.this.f33716f, DmtTabLayout.this.f33717g);
            setGravity(17);
            setOrientation(1);
            setClickable(true);
            v.a(this, s.a(getContext()));
            MethodCollector.o(11741);
        }

        private void a(TextView textView, ImageView imageView) {
            Drawable drawable;
            CharSequence charSequence;
            CharSequence charSequence2;
            f fVar = this.f33766b;
            CharSequence charSequence3 = null;
            if (fVar != null) {
                drawable = fVar.f33749b;
            } else {
                drawable = null;
            }
            f fVar2 = this.f33766b;
            if (fVar2 != null) {
                charSequence = fVar2.f33750c;
            } else {
                charSequence = null;
            }
            f fVar3 = this.f33766b;
            if (fVar3 != null) {
                charSequence2 = fVar3.f33751d;
            } else {
                charSequence2 = null;
            }
            int i2 = 0;
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
                imageView.setContentDescription(charSequence2);
            }
            boolean z = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (z) {
                    textView.setText(charSequence);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
                textView.setContentDescription(charSequence2);
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (z && imageView.getVisibility() == 0) {
                    i2 = DmtTabLayout.this.c(8);
                }
                if (i2 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i2;
                    imageView.requestLayout();
                }
            }
            if (!z) {
                charSequence3 = charSequence2;
            }
            an.a(this, charSequence3);
        }

        public final void onMeasure(int i2, int i3) {
            Layout layout;
            MethodCollector.i(11909);
            int size = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            int tabMaxWidth = DmtTabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i2 = View.MeasureSpec.makeMeasureSpec(DmtTabLayout.this.f33723m, Integer.MIN_VALUE);
            }
            super.onMeasure(i2, i3);
            if (this.f33767c != null) {
                getResources();
                float f2 = DmtTabLayout.this.f33720j;
                int i4 = this.f33772h;
                ImageView imageView = this.f33768d;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f33767c;
                    if (textView != null && textView.getLineCount() > 1) {
                        f2 = DmtTabLayout.this.f33721k;
                    }
                } else {
                    i4 = 1;
                }
                float textSize = this.f33767c.getTextSize();
                int lineCount = this.f33767c.getLineCount();
                int a2 = androidx.core.widget.h.a(this.f33767c);
                if ((f2 != textSize || (a2 >= 0 && i4 != a2)) && (DmtTabLayout.this.o != 1 || f2 <= textSize || lineCount != 1 || ((layout = this.f33767c.getLayout()) != null && layout.getLineWidth(0) * (f2 / layout.getPaint().getTextSize()) <= ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))))) {
                    this.f33767c.setTextSize(0, f2);
                    this.f33767c.setMaxLines(i4);
                    super.onMeasure(i2, i3);
                }
            }
            MethodCollector.o(11909);
        }
    }

    public int getTabGravity() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public int getTabMaxWidth() {
        return this.f33723m;
    }

    public int getTabMode() {
        return this.o;
    }

    public ColorStateList getTabTextColors() {
        return this.f33719i;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, float f2, boolean z2, boolean z3) {
        int round = Math.round(((float) i2) + f2);
        if (round >= 0 && round < this.f33713c.getChildCount()) {
            if (z3) {
                this.f33713c.a(i2, f2);
            }
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.F.cancel();
            }
            scrollTo(a(i2, f2), 0);
            if (z2) {
                setSelectedTabView(round);
            }
        }
    }

    public final void a(f fVar) {
        b(fVar, this.w.isEmpty());
    }

    /* access modifiers changed from: package-private */
    public final void a(PagerAdapter pagerAdapter, boolean z2) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.G;
        if (!(pagerAdapter2 == null || (dataSetObserver = this.H) == null)) {
            pagerAdapter2.unregisterDataSetObserver(dataSetObserver);
        }
        this.G = pagerAdapter;
        if (z2 && pagerAdapter != null) {
            if (this.H == null) {
                this.H = new d();
            }
            pagerAdapter.registerDataSetObserver(this.H);
        }
        a();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        int currentItem;
        d();
        PagerAdapter pagerAdapter = this.G;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                b(a(this.p).a(this.G.getPageTitle(i2)), false);
            }
            ViewPager viewPager = this.s;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                a(b(currentItem), true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(f fVar, boolean z2) {
        f fVar2 = this.x;
        if (fVar2 != fVar) {
            int i2 = fVar != null ? fVar.f33752e : -1;
            if (z2) {
                if ((fVar2 == null || fVar2.f33752e == -1) && i2 != -1) {
                    e(i2);
                } else {
                    f(i2);
                }
                if (i2 != -1) {
                    setSelectedTabView(i2);
                }
            }
            if (fVar2 != null) {
                e(fVar2);
            }
            this.x = fVar;
            if (fVar != null) {
                d(fVar);
            }
        } else if (fVar2 != null) {
            g();
            f(fVar.f33752e);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2) {
        for (int i2 = 0; i2 < this.f33713c.getChildCount(); i2++) {
            View childAt = this.f33713c.getChildAt(i2);
            childAt.setMinimumWidth(getTabMinWidth());
            a((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z2) {
                childAt.requestLayout();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class d extends DataSetObserver {
        static {
            Covode.recordClassIndex(20050);
        }

        public final void onChanged() {
            DmtTabLayout.this.a();
        }

        public final void onInvalidated() {
            DmtTabLayout.this.a();
        }

        d() {
        }
    }

    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public Object f33748a;

        /* renamed from: b  reason: collision with root package name */
        public Drawable f33749b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f33750c;

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f33751d;

        /* renamed from: e  reason: collision with root package name */
        public int f33752e = -1;

        /* renamed from: f  reason: collision with root package name */
        public View f33753f;

        /* renamed from: g  reason: collision with root package name */
        int f33754g = -1;

        /* renamed from: h  reason: collision with root package name */
        public DmtTabLayout f33755h;

        /* renamed from: i  reason: collision with root package name */
        public h f33756i;

        static {
            Covode.recordClassIndex(20054);
        }

        /* access modifiers changed from: package-private */
        public final void c() {
            h hVar = this.f33756i;
            if (hVar != null) {
                hVar.a();
            }
        }

        public final void a() {
            DmtTabLayout dmtTabLayout = this.f33755h;
            if (dmtTabLayout != null) {
                dmtTabLayout.b(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public final boolean b() {
            DmtTabLayout dmtTabLayout = this.f33755h;
            if (dmtTabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            } else if (dmtTabLayout.getSelectedTabPosition() == this.f33752e) {
                return true;
            } else {
                return false;
            }
        }

        public final f a(View view) {
            this.f33753f = view;
            c();
            return this;
        }

        public final f a(CharSequence charSequence) {
            this.f33750c = charSequence;
            c();
            return this;
        }

        public final f a(int i2) {
            if (this.f33754g == i2 && this.f33753f != null) {
                return this;
            }
            this.f33754g = i2;
            return a(com.a.a(LayoutInflater.from(this.f33756i.getContext()), i2, this.f33756i, false));
        }
    }

    public static class g implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<DmtTabLayout> f33757a;

        /* renamed from: b  reason: collision with root package name */
        private int f33758b;

        /* renamed from: c  reason: collision with root package name */
        private int f33759c;

        /* renamed from: d  reason: collision with root package name */
        private int f33760d;

        /* renamed from: e  reason: collision with root package name */
        private int f33761e;

        /* renamed from: f  reason: collision with root package name */
        private ArgbEvaluator f33762f = new ArgbEvaluator();

        /* renamed from: g  reason: collision with root package name */
        private AccelerateInterpolator f33763g = new AccelerateInterpolator();

        /* renamed from: h  reason: collision with root package name */
        private DecelerateInterpolator f33764h = new DecelerateInterpolator(1.6f);

        static {
            Covode.recordClassIndex(20055);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            this.f33758b = 0;
            this.f33759c = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
            this.f33758b = this.f33759c;
            this.f33759c = i2;
        }

        public g(DmtTabLayout dmtTabLayout) {
            this.f33757a = new WeakReference<>(dmtTabLayout);
            this.f33761e = dmtTabLayout.getTabTextColors().getColorForState(DmtTabLayout.SELECTED_STATE_SET, 0);
            this.f33760d = dmtTabLayout.getTabTextColors().getDefaultColor();
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            boolean z;
            DmtTabLayout dmtTabLayout = this.f33757a.get();
            if (dmtTabLayout != null && dmtTabLayout.getSelectedTabPosition() != i2 && i2 < dmtTabLayout.getTabCount()) {
                int i3 = this.f33759c;
                if (i3 == 0 || (i3 == 2 && this.f33758b == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                dmtTabLayout.a(dmtTabLayout.b(i2), z);
            }
        }

        private static void a(ImageView imageView, TextView textView, int i2) {
            if (imageView != null && textView != null) {
                textView.setTextColor(i2);
                imageView.setImageAlpha(Color.alpha(i2));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
            if (r6 == 2) goto L_0x0018;
         */
        @Override // androidx.viewpager.widget.ViewPager.e
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onPageScrolled(int r13, float r14, int r15) {
            /*
            // Method dump skipped, instructions count: 256
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.g.onPageScrolled(int, float, int):void");
        }
    }

    public int getTabCount() {
        return this.w.size();
    }

    public int getTabStripLeftPadding() {
        return this.f33713c.getPaddingLeft();
    }

    public int getTabStripRightPadding() {
        return this.f33713c.getPaddingRight();
    }

    private LinearLayout.LayoutParams e() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        a(layoutParams);
        return layoutParams;
    }

    private float getScrollPosition() {
        e eVar = this.f33713c;
        return ((float) eVar.f33728a) + eVar.f33729b;
    }

    private int getTabMinWidth() {
        int i2 = this.z;
        if (i2 != -1) {
            return i2;
        }
        if (this.o == 0) {
            return this.B;
        }
        return 0;
    }

    public int getSelectedTabPosition() {
        f fVar = this.x;
        if (fVar != null) {
            return fVar.f33752e;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.J) {
            setupWithViewPager(null);
            this.J = false;
        }
    }

    public boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    private void g() {
        for (int size = this.r.size() - 1; size >= 0; size--) {
            this.r.get(size);
        }
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f33713c.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.s == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                a((ViewPager) parent, true);
            }
        }
    }

    static {
        Covode.recordClassIndex(20045);
    }

    private void f() {
        if (this.F == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.F = valueAnimator;
            valueAnimator.setInterpolator(f33711a);
            this.F.setDuration(200L);
            this.F.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(20046);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    DmtTabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    private int getDefaultHeight() {
        int size = this.w.size();
        for (int i2 = 0; i2 < size; i2++) {
            f fVar = this.w.get(i2);
            if (!(fVar == null || fVar.f33749b == null || TextUtils.isEmpty(fVar.f33750c))) {
                return 72;
            }
        }
        return 48;
    }

    private void h() {
        int i2;
        if (this.o == 0) {
            i2 = Math.max(0, this.C - this.f33714d);
        } else {
            i2 = 0;
        }
        v.a(this.f33713c, i2, 0, 0, 0);
        int i3 = this.o;
        if (i3 == 0) {
            this.f33713c.setGravity(8388611);
        } else if (i3 == 1) {
            this.f33713c.setGravity(1);
        }
        a(true);
    }

    public final h b() {
        h hVar;
        f.a<h> aVar = this.M;
        if (aVar == null || (hVar = aVar.acquire()) == null) {
            hVar = new h(getContext());
        }
        hVar.setFocusable(true);
        hVar.setMinimumWidth(getTabMinWidth());
        return hVar;
    }

    /* access modifiers changed from: package-private */
    public class e extends LinearLayout {

        /* renamed from: a  reason: collision with root package name */
        int f33728a = -1;

        /* renamed from: b  reason: collision with root package name */
        float f33729b;

        /* renamed from: c  reason: collision with root package name */
        public float f33730c;

        /* renamed from: d  reason: collision with root package name */
        public float f33731d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f33732e;

        /* renamed from: f  reason: collision with root package name */
        int f33733f;

        /* renamed from: h  reason: collision with root package name */
        private int f33735h;

        /* renamed from: i  reason: collision with root package name */
        private final Paint f33736i;

        /* renamed from: j  reason: collision with root package name */
        private int f33737j = -1;

        /* renamed from: k  reason: collision with root package name */
        private int f33738k = -1;

        /* renamed from: l  reason: collision with root package name */
        private int f33739l = -1;

        /* renamed from: m  reason: collision with root package name */
        private ValueAnimator f33740m;
        private int n;
        private int o;

        static {
            Covode.recordClassIndex(20051);
        }

        private void a() {
            int i2;
            View childAt = getChildAt(this.f33728a);
            int i3 = -1;
            if (childAt == null || childAt.getWidth() <= 0) {
                i2 = -1;
            } else {
                i3 = childAt.getLeft();
                i2 = childAt.getRight();
                if (this.f33729b > 0.0f && this.f33728a < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f33728a + 1);
                    float f2 = this.f33729b;
                    i3 = (int) ((this.f33729b * ((float) childAt2.getLeft())) + ((1.0f - f2) * ((float) i3)));
                    i2 = (int) ((f2 * ((float) childAt2.getRight())) + ((1.0f - this.f33729b) * ((float) i2)));
                }
            }
            a(i3, i2);
        }

        /* access modifiers changed from: package-private */
        public final void b(int i2) {
            if (this.f33735h != i2) {
                this.f33735h = i2;
                v.c(this);
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2) {
            if (this.f33736i.getColor() != i2) {
                this.f33736i.setColor(i2);
                v.c(this);
            }
        }

        public final void onRtlPropertiesChanged(int i2) {
            super.onRtlPropertiesChanged(i2);
            if (Build.VERSION.SDK_INT < 23 && this.f33737j != i2) {
                requestLayout();
                this.f33737j = i2;
            }
        }

        public final void draw(Canvas canvas) {
            View findViewById;
            super.draw(canvas);
            int i2 = this.f33738k;
            if (i2 >= 0 && this.f33739l > i2) {
                View childAt = getChildAt(DmtTabLayout.this.getSelectedTabPosition());
                if (childAt == null || (findViewById = childAt.findViewById(R.id.c8v)) == null) {
                    canvas.drawRect((float) (this.f33738k + this.f33733f), (float) (getHeight() - this.f33735h), (float) (this.f33739l - this.f33733f), (float) getHeight(), this.f33736i);
                    return;
                }
                if (DmtTabLayout.this.s == null || !this.f33732e) {
                    int i3 = this.f33738k;
                    float width = (float) (i3 + (((this.f33739l - i3) - findViewById.getWidth()) / 2));
                    this.f33730c = width;
                    this.f33731d = width + ((float) findViewById.getWidth());
                }
                canvas.drawRect(this.f33730c + ((float) this.f33733f), (float) (getHeight() - this.f33735h), this.f33731d - ((float) this.f33733f), (float) getHeight(), this.f33736i);
            }
        }

        e(Context context) {
            super(context);
            MethodCollector.i(13779);
            this.n = DmtTabLayout.this.c(27);
            this.o = Integer.MAX_VALUE;
            setWillNotDraw(false);
            this.f33736i = new Paint();
            MethodCollector.o(13779);
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2, float f2) {
            ValueAnimator valueAnimator = this.f33740m;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f33740m.cancel();
            }
            this.f33728a = i2;
            this.f33729b = f2;
            a();
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2, int i3) {
            if (i2 != this.f33738k || i3 != this.f33739l) {
                this.f33738k = i2;
                this.f33739l = i3;
                v.c(this);
            }
        }

        /* access modifiers changed from: package-private */
        public final void b(final int i2, int i3) {
            boolean z;
            final int i4;
            final int i5;
            ValueAnimator valueAnimator = this.f33740m;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f33740m.cancel();
            }
            if (v.e(this) == 1) {
                z = true;
            } else {
                z = false;
            }
            View childAt = getChildAt(i2);
            if (childAt == null) {
                a();
                return;
            }
            final int left = childAt.getLeft();
            final int right = childAt.getRight();
            if (Math.abs(i2 - this.f33728a) <= 1) {
                i4 = this.f33738k;
                i5 = this.f33739l;
            } else {
                int c2 = DmtTabLayout.this.c(24);
                if (i2 >= this.f33728a ? !z : z) {
                    i4 = left - c2;
                } else {
                    i4 = c2 + right;
                }
                i5 = i4;
            }
            if (i4 != left || i5 != right) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.f33740m = valueAnimator2;
                valueAnimator2.setInterpolator(DmtTabLayout.f33711a);
                valueAnimator2.setDuration((long) i3);
                valueAnimator2.setFloatValues(0.0f, 1.0f);
                valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.e.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(20052);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        e.this.a(e.a(i4, left, animatedFraction), e.a(i5, right, animatedFraction));
                    }
                });
                valueAnimator2.addListener(new AnimatorListenerAdapter() {
                    /* class com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.e.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(20053);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        e.this.f33728a = i2;
                        e.this.f33729b = 0.0f;
                    }
                });
                valueAnimator2.start();
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0087, code lost:
            if (r5 != false) goto L_0x0093;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onMeasure(int r10, int r11) {
            /*
            // Method dump skipped, instructions count: 329
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.e.onMeasure(int, int):void");
        }

        static int a(int i2, int i3, float f2) {
            return i2 + Math.round(f2 * ((float) (i3 - i2)));
        }

        /* access modifiers changed from: protected */
        public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            MethodCollector.i(13883);
            super.onLayout(z, i2, i3, i4, i5);
            ValueAnimator valueAnimator = this.f33740m;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                a();
                MethodCollector.o(13883);
                return;
            }
            this.f33740m.cancel();
            b(this.f33728a, Math.round((1.0f - this.f33740m.getAnimatedFraction()) * ((float) this.f33740m.getDuration())));
            MethodCollector.o(13883);
        }
    }

    private void d() {
        for (int childCount = this.f33713c.getChildCount() - 1; childCount >= 0; childCount--) {
            h hVar = (h) this.f33713c.getChildAt(childCount);
            this.f33713c.removeViewAt(childCount);
            if (hVar != null) {
                hVar.setTab(null);
                hVar.setSelected(false);
                this.M.release(hVar);
            }
            requestLayout();
        }
        Iterator<f> it = this.w.iterator();
        while (it.hasNext()) {
            f next = it.next();
            it.remove();
            next.f33755h = null;
            next.f33756i = null;
            next.f33748a = null;
            next.f33749b = null;
            next.f33750c = null;
            next.f33751d = null;
            next.f33752e = -1;
            next.f33753f = null;
            next.f33754g = -1;
            f33712b.release(next);
        }
        this.x = null;
    }

    public void addView(View view) {
        a(view);
    }

    public void setAutoFillWhenScrollable(boolean z2) {
        this.q = z2;
    }

    public void setContentInsetStart(int i2) {
        this.C = i2;
    }

    public void setCustomTabViewResId(int i2) {
        this.p = i2;
    }

    public void setOnTabClickListener(b bVar) {
        this.u = bVar;
    }

    public void setTabBackgroundResId(int i2) {
        this.f33722l = i2;
    }

    public void setTabMaxWidth(int i2) {
        this.A = i2;
    }

    public void setTabMinWidth(int i2) {
        this.z = i2;
    }

    public void setTabPaddingBottom(int i2) {
        this.f33717g = i2;
    }

    public void setTabPaddingEnd(int i2) {
        this.f33716f = i2;
    }

    public void setTabPaddingStart(int i2) {
        this.f33714d = i2;
    }

    public void setTabPaddingTop(int i2) {
        this.f33715e = i2;
    }

    public void setTabTextAppearance(int i2) {
        this.f33718h = i2;
    }

    /* access modifiers changed from: package-private */
    public class a implements ViewPager.d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f33725a;

        static {
            Covode.recordClassIndex(20047);
        }

        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.d
        public final void a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            if (DmtTabLayout.this.s == viewPager) {
                DmtTabLayout.this.a(pagerAdapter2, this.f33725a);
            }
        }
    }

    public static class i implements c {

        /* renamed from: a  reason: collision with root package name */
        private final ViewPager f33773a;

        static {
            Covode.recordClassIndex(20057);
        }

        @Override // com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.c
        public final void b(f fVar) {
        }

        public i(ViewPager viewPager) {
            this.f33773a = viewPager;
        }

        @Override // com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.c
        public final void a(f fVar) {
            this.f33773a.setCurrentItem(fVar.f33752e);
        }
    }

    public DmtTabLayout(Context context) {
        this(context, null);
    }

    private void b(c cVar) {
        this.r.remove(cVar);
    }

    private void e(int i2) {
        a(i2, 0.0f, true, true);
    }

    public final View d(int i2) {
        return this.f33713c.getChildAt(i2);
    }

    public void setSelectedTabHorizontalPadding(int i2) {
        this.f33713c.f33733f = i2;
    }

    public void setSelectedTabIndicatorColor(int i2) {
        this.f33713c.a(i2);
    }

    public void setSelectedTabIndicatorHeight(int i2) {
        this.f33713c.b(i2);
    }

    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        a(pagerAdapter, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        a(viewPager, false);
    }

    private void c(f fVar) {
        this.f33713c.addView(fVar.f33756i, fVar.f33752e, e());
    }

    public final void a(c cVar) {
        if (!this.r.contains(cVar)) {
            this.r.add(cVar);
        }
    }

    @Override // android.widget.FrameLayout, android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.D;
        if (cVar2 != null) {
            b(cVar2);
        }
        this.D = cVar;
        if (cVar != null) {
            a(cVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        f();
        this.F.addListener(animatorListener);
    }

    public void setTabGravity(int i2) {
        if (this.n != i2) {
            this.n = i2;
            h();
        }
    }

    public void setTabMode(int i2) {
        if (i2 != this.o) {
            this.o = i2;
            h();
        }
    }

    private void a(View view) {
        if (view instanceof a) {
            a((a) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void d(f fVar) {
        for (int size = this.r.size() - 1; size >= 0; size--) {
            this.r.get(size).a(fVar);
        }
    }

    private void e(f fVar) {
        for (int size = this.r.size() - 1; size >= 0; size--) {
            this.r.get(size).b(fVar);
        }
    }

    private void setSelectedTabView(int i2) {
        boolean z2;
        int childCount = this.f33713c.getChildCount();
        if (i2 < childCount) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.f33713c.getChildAt(i3);
                if (i3 == i2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                childAt.setSelected(z2);
            }
        }
    }

    public final f b(int i2) {
        if (i2 < 0 || i2 >= getTabCount()) {
            return null;
        }
        return this.w.get(i2);
    }

    /* access modifiers changed from: package-private */
    public final int c(int i2) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i2));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f33719i != colorStateList) {
            this.f33719i = colorStateList;
            int size = this.w.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.w.get(i2).c();
            }
        }
    }

    private void a(LinearLayout.LayoutParams layoutParams) {
        if (this.o == 1 && this.n == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        int i2 = this.y;
        if (i2 != 0) {
            layoutParams.leftMargin = i2;
            layoutParams.rightMargin = this.y;
        }
    }

    public void setTabMargin(int i2) {
        this.y = c(i2);
        for (int i3 = 0; i3 < getTabCount(); i3++) {
            View childAt = this.f33713c.getChildAt(i3);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.leftMargin = c(i2);
            marginLayoutParams.rightMargin = c(i2);
            childAt.setLayoutParams(marginLayoutParams);
        }
    }

    public void setTabMode(String str) {
        str.hashCode();
        if (!str.equals("scrollable")) {
            if (str.equals("fixed") && this.o != 1) {
                this.o = 1;
                h();
            }
        } else if (this.o != 0) {
            this.o = 0;
            h();
        }
    }

    private void f(int i2) {
        if (i2 != -1) {
            if (getWindowToken() != null && v.v(this)) {
                e eVar = this.f33713c;
                int childCount = eVar.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    if (eVar.getChildAt(i3).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int a2 = a(i2, 0.0f);
                if (scrollX != a2) {
                    f();
                    this.F.setIntValues(scrollX, a2);
                    this.F.start();
                }
                this.f33713c.b(i2, 200);
                return;
            }
            e(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(f fVar) {
        a(fVar, true);
    }

    private void a(a aVar) {
        f a2 = a(0);
        if (aVar.f33774a != null) {
            a2.a(aVar.f33774a);
        }
        if (aVar.f33775b != null) {
            a2.f33749b = aVar.f33775b;
            a2.c();
        }
        if (aVar.f33776c != 0) {
            a2.a(aVar.f33776c);
        }
        if (!TextUtils.isEmpty(aVar.getContentDescription())) {
            a2.f33751d = aVar.getContentDescription();
            a2.c();
        }
        a(a2);
    }

    public final f a(int i2) {
        f acquire = f33712b.acquire();
        if (acquire == null) {
            acquire = new f();
        }
        acquire.f33755h = this;
        if (acquire.f33756i == null) {
            acquire.f33756i = b();
        }
        if (i2 > 0) {
            acquire.f33756i.a(acquire);
            acquire.a(i2);
        } else {
            acquire.f33756i.setTab(acquire);
        }
        return acquire;
    }

    public final void a(int i2, int i3) {
        this.f33713c.setPadding(i2, 0, i3, 0);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2) {
        a(view);
    }

    public DmtTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private void b(f fVar, boolean z2) {
        a(fVar, this.w.size(), z2);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    private int a(int i2, float f2) {
        View view;
        int i3;
        int i4 = 0;
        if (this.o != 0) {
            return 0;
        }
        View childAt = this.f33713c.getChildAt(i2);
        int i5 = i2 + 1;
        if (i5 < this.f33713c.getChildCount()) {
            view = this.f33713c.getChildAt(i5);
        } else {
            view = null;
        }
        if (childAt != null) {
            i3 = childAt.getWidth();
        } else {
            i3 = 0;
        }
        if (view != null) {
            i4 = view.getWidth();
        }
        int left = (childAt.getLeft() + (i3 / 2)) - (getWidth() / 2);
        int i6 = (int) (((float) (i3 + i4 + (this.y * 4))) * 0.5f * f2);
        if (v.e(this) == 0) {
            return left + i6;
        }
        return left - i6;
    }

    private void a(ViewPager viewPager, boolean z2) {
        ViewPager viewPager2 = this.s;
        if (viewPager2 != null) {
            g gVar = this.t;
            if (gVar != null) {
                viewPager2.removeOnPageChangeListener(gVar);
            }
            a aVar = this.I;
            if (aVar != null) {
                this.s.removeOnAdapterChangeListener(aVar);
            }
        }
        c cVar = this.E;
        if (cVar != null) {
            b(cVar);
            this.E = null;
        }
        if (viewPager != null) {
            this.s = viewPager;
            if (this.t == null) {
                this.t = new g(this);
            }
            this.t.a();
            viewPager.addOnPageChangeListener(this.t);
            i iVar = new i(viewPager);
            this.E = iVar;
            a(iVar);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                a(adapter, true);
            }
            if (this.I == null) {
                this.I = new a();
            }
            this.I.f33725a = true;
            viewPager.addOnAdapterChangeListener(this.I);
            e(viewPager.getCurrentItem());
        } else {
            this.s = null;
            a((PagerAdapter) null, false);
        }
        this.J = z2;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(8692);
        int c2 = c(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i3);
        if (mode == Integer.MIN_VALUE) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(c2, View.MeasureSpec.getSize(i3)), 1073741824);
        } else if (mode == 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(c2, 1073741824);
        }
        int size = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) != 0) {
            int i4 = this.A;
            if (i4 <= 0) {
                i4 = size - c(56);
            }
            this.f33723m = i4;
        }
        super.onMeasure(i2, i3);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i5 = this.o;
            if (i5 == 0 ? childAt.getMeasuredWidth() < getMeasuredWidth() : !(i5 != 1 || childAt.getMeasuredWidth() == getMeasuredWidth())) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
            }
        }
        MethodCollector.o(8692);
    }

    private void a(f fVar, int i2) {
        fVar.f33752e = i2;
        this.w.add(i2, fVar);
        int size = this.w.size();
        while (true) {
            i2++;
            if (i2 < size) {
                this.w.get(i2).f33752e = i2;
            } else {
                return;
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    private DmtTabLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(8666);
        this.w = new ArrayList<>();
        this.f33723m = Integer.MAX_VALUE;
        this.r = new ArrayList<>();
        this.M = new f.b(12);
        setHorizontalScrollBarEnabled(false);
        e eVar = new e(context);
        this.f33713c = eVar;
        super.addView(eVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ag_, R.attr.aga, R.attr.agb, R.attr.agc, R.attr.agd, R.attr.age, R.attr.agf, R.attr.agg, R.attr.agh, R.attr.agi, R.attr.agj, R.attr.agl, R.attr.agm, R.attr.agn, R.attr.ago, R.attr.agp, R.attr.agq, R.attr.agr, R.attr.ags, R.attr.agt, R.attr.agu, R.attr.agv, R.attr.agx, R.attr.agy, R.attr.agz}, 0, R.style.r4);
        eVar.b(obtainStyledAttributes.getDimensionPixelSize(10, 0));
        eVar.a(obtainStyledAttributes.getColor(7, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(15, 0);
        this.f33714d = dimensionPixelSize;
        this.f33715e = dimensionPixelSize;
        this.f33716f = dimensionPixelSize;
        this.f33717g = dimensionPixelSize;
        this.f33714d = obtainStyledAttributes.getDimensionPixelSize(18, dimensionPixelSize);
        this.f33715e = obtainStyledAttributes.getDimensionPixelSize(19, this.f33715e);
        this.f33716f = obtainStyledAttributes.getDimensionPixelSize(17, this.f33716f);
        this.f33717g = obtainStyledAttributes.getDimensionPixelSize(16, this.f33717g);
        int resourceId = obtainStyledAttributes.getResourceId(22, R.style.ji);
        this.f33718h = resourceId;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.ui, R.attr.ahm});
        try {
            this.f33720j = (float) obtainStyledAttributes2.getDimensionPixelSize(0, 0);
            this.f33719i = obtainStyledAttributes2.getColorStateList(3);
            obtainStyledAttributes2.recycle();
            if (obtainStyledAttributes.hasValue(23)) {
                this.f33719i = obtainStyledAttributes.getColorStateList(23);
            }
            if (obtainStyledAttributes.hasValue(21)) {
                int color = obtainStyledAttributes.getColor(21, 0);
                int defaultColor = this.f33719i.getDefaultColor();
                this.f33719i = new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{color, defaultColor});
            }
            this.z = obtainStyledAttributes.getDimensionPixelSize(13, -1);
            this.A = obtainStyledAttributes.getDimensionPixelSize(12, -1);
            this.f33722l = obtainStyledAttributes.getResourceId(0, 0);
            this.C = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.o = obtainStyledAttributes.getInt(14, 1);
            this.n = obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.recycle();
            Resources resources = getResources();
            this.f33721k = (float) resources.getDimensionPixelSize(R.dimen.ib);
            this.B = resources.getDimensionPixelSize(R.dimen.i_);
            this.K = n.b(getContext(), 1.5f);
            this.L = n.b(getContext(), 1.5f);
            this.v = getResources().getConfiguration().orientation;
            h();
            MethodCollector.o(8666);
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            MethodCollector.o(8666);
            throw th;
        }
    }

    private void a(f fVar, int i2, boolean z2) {
        if (fVar.f33755h == this) {
            a(fVar, i2);
            c(fVar);
            if (z2) {
                fVar.a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* access modifiers changed from: protected */
    public boolean overScrollBy(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z2) {
        return super.overScrollBy(i2, i3, i4, i5, i6, i7, 80, i9, z2);
    }
}
