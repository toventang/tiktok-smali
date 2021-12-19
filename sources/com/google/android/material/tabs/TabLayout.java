package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
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
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.material.internal.k;
import com.google.android.material.internal.l;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@ViewPager.a
public class TabLayout extends HorizontalScrollView {
    private static final f.a<f> tabPool = new f.c(16);
    private a adapterChangeListener;
    private int contentInsetStart;
    private b currentVpSelectedListener;
    boolean inlineLabel;
    int mode;
    private g pageChangeListener;
    private PagerAdapter pagerAdapter;
    private DataSetObserver pagerAdapterObserver;
    private final int requestedTabMaxWidth;
    public final int requestedTabMinWidth;
    private ValueAnimator scrollAnimator;
    private final int scrollableTabMinWidth;
    private b selectedListener;
    private final ArrayList<b> selectedListeners;
    private f selectedTab;
    private boolean setupViewPagerImplicitly;
    private final e slidingTabIndicator;
    final int tabBackgroundResId;
    int tabGravity;
    ColorStateList tabIconTint;
    PorterDuff.Mode tabIconTintMode;
    int tabIndicatorAnimationDuration;
    boolean tabIndicatorFullWidth;
    int tabIndicatorGravity;
    int tabMaxWidth;
    public int tabPaddingBottom;
    public int tabPaddingEnd;
    public int tabPaddingStart;
    public int tabPaddingTop;
    ColorStateList tabRippleColorStateList;
    Drawable tabSelectedIndicator;
    int tabTextAppearance;
    ColorStateList tabTextColors;
    float tabTextMultiLineSize;
    float tabTextSize;
    public final RectF tabViewContentBounds;
    private final f.a<TabView> tabViewPool;
    private final ArrayList<f> tabs;
    boolean unboundedRipple;
    ViewPager viewPager;

    public interface b<T extends f> {
        static {
            Covode.recordClassIndex(32606);
        }

        void a(T t);

        void b(T t);
    }

    public interface c extends b<f> {
        static {
            Covode.recordClassIndex(32607);
        }
    }

    /* access modifiers changed from: package-private */
    public class TabView extends LinearLayout {
        private Drawable baseBackgroundDrawable;
        private ImageView customIconView;
        private TextView customTextView;
        private View customView;
        private int defaultMaxLines = 2;
        private ImageView iconView;
        private f tab;
        private TextView textView;

        static {
            Covode.recordClassIndex(32604);
        }

        public f getTab() {
            return this.tab;
        }

        /* access modifiers changed from: package-private */
        public void reset() {
            setTab(null);
            setSelected(false);
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.tab == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.tab.a();
            return true;
        }

        /* access modifiers changed from: package-private */
        public final void updateOrientation() {
            setOrientation(!TabLayout.this.inlineLabel ? 1 : 0);
            TextView textView2 = this.customTextView;
            if (textView2 == null && this.customIconView == null) {
                updateTextAndIcon(this.textView, this.iconView);
            } else {
                updateTextAndIcon(textView2, this.customIconView);
            }
        }

        /* access modifiers changed from: protected */
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.baseBackgroundDrawable;
            if (drawable != null && drawable.isStateful() && (false || this.baseBackgroundDrawable.setState(drawableState))) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public int getContentWidth() {
            int i2 = 0;
            View[] viewArr = {this.textView, this.iconView, this.customView};
            int i3 = 0;
            int i4 = 0;
            boolean z = false;
            do {
                View view = viewArr[i2];
                if (view != null && view.getVisibility() == 0) {
                    if (z) {
                        i4 = Math.min(i4, view.getLeft());
                        i3 = Math.max(i3, view.getRight());
                    } else {
                        i4 = view.getLeft();
                        i3 = view.getRight();
                    }
                    z = true;
                }
                i2++;
            } while (i2 < 3);
            return i3 - i4;
        }

        /* access modifiers changed from: package-private */
        public final void update() {
            Drawable mutate;
            View view;
            MethodCollector.i(5948);
            f fVar = this.tab;
            if (fVar == null || (view = fVar.f52655f) == null) {
                View view2 = this.customView;
                if (view2 != null) {
                    removeView(view2);
                    this.customView = null;
                }
                this.customTextView = null;
                this.customIconView = null;
            } else {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.customView = view;
                TextView textView2 = this.textView;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                ImageView imageView = this.iconView;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.iconView.setImageDrawable(null);
                }
                TextView textView3 = (TextView) view.findViewById(16908308);
                this.customTextView = textView3;
                if (textView3 != null) {
                    this.defaultMaxLines = androidx.core.widget.h.a(textView3);
                }
                this.customIconView = (ImageView) view.findViewById(16908294);
            }
            boolean z = false;
            if (this.customView == null) {
                if (this.iconView == null) {
                    ImageView imageView2 = (ImageView) com.a.a(LayoutInflater.from(getContext()), R.layout.vo, this, false);
                    addView(imageView2, 0);
                    this.iconView = imageView2;
                }
                if (!(fVar == null || fVar.f52651b == null || (mutate = androidx.core.graphics.drawable.a.e(fVar.f52651b).mutate()) == null)) {
                    androidx.core.graphics.drawable.a.a(mutate, TabLayout.this.tabIconTint);
                    if (TabLayout.this.tabIconTintMode != null) {
                        androidx.core.graphics.drawable.a.a(mutate, TabLayout.this.tabIconTintMode);
                    }
                }
                if (this.textView == null) {
                    TextView textView4 = (TextView) com.a.a(LayoutInflater.from(getContext()), R.layout.vp, this, false);
                    addView(textView4);
                    this.textView = textView4;
                    this.defaultMaxLines = androidx.core.widget.h.a(textView4);
                }
                androidx.core.widget.h.a(this.textView, TabLayout.this.tabTextAppearance);
                if (TabLayout.this.tabTextColors != null) {
                    this.textView.setTextColor(TabLayout.this.tabTextColors);
                }
                updateTextAndIcon(this.textView, this.iconView);
            } else {
                TextView textView5 = this.customTextView;
                if (!(textView5 == null && this.customIconView == null)) {
                    updateTextAndIcon(textView5, this.customIconView);
                }
            }
            if (fVar != null) {
                if (!TextUtils.isEmpty(fVar.f52653d)) {
                    setContentDescription(fVar.f52653d);
                }
                if (fVar.f52656g == null) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Tab not attached to a TabLayout");
                    MethodCollector.o(5948);
                    throw illegalArgumentException;
                } else if (fVar.f52656g.getSelectedTabPosition() == fVar.f52654e) {
                    z = true;
                }
            }
            setSelected(z);
            MethodCollector.o(5948);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(a.b.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(a.b.class.getName());
        }

        /* access modifiers changed from: package-private */
        public void setTab(f fVar) {
            if (fVar != this.tab) {
                this.tab = fVar;
                update();
            }
        }

        public void drawBackground(Canvas canvas) {
            Drawable drawable = this.baseBackgroundDrawable;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.baseBackgroundDrawable.draw(canvas);
            }
        }

        public void setSelected(boolean z) {
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
            TextView textView2 = this.textView;
            if (textView2 != null) {
                textView2.setSelected(z);
            }
            ImageView imageView = this.iconView;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.customView;
            if (view != null) {
                view.setSelected(z);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [android.graphics.drawable.LayerDrawable] */
        /* JADX WARN: Type inference failed for: r1v2, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void updateBackgroundDrawable(android.content.Context r8) {
            /*
            // Method dump skipped, instructions count: 133
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.TabView.updateBackgroundDrawable(android.content.Context):void");
        }

        public TabView(Context context) {
            super(context);
            MethodCollector.i(5811);
            updateBackgroundDrawable(context);
            v.a(this, TabLayout.this.tabPaddingStart, TabLayout.this.tabPaddingTop, TabLayout.this.tabPaddingEnd, TabLayout.this.tabPaddingBottom);
            setGravity(17);
            setOrientation(!TabLayout.this.inlineLabel ? 1 : 0);
            setClickable(true);
            v.a(this, s.a(getContext()));
            MethodCollector.o(5811);
        }

        private void updateTextAndIcon(TextView textView2, ImageView imageView) {
            Drawable drawable;
            CharSequence charSequence;
            CharSequence charSequence2;
            int i2;
            f fVar = this.tab;
            CharSequence charSequence3 = null;
            if (fVar == null || fVar.f52651b == null) {
                drawable = null;
            } else {
                drawable = androidx.core.graphics.drawable.a.e(this.tab.f52651b).mutate();
            }
            f fVar2 = this.tab;
            if (fVar2 != null) {
                charSequence = fVar2.f52652c;
            } else {
                charSequence = null;
            }
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequence);
            if (textView2 != null) {
                if (z) {
                    textView2.setText(charSequence);
                    textView2.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView2.setVisibility(8);
                    textView2.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (!z || imageView.getVisibility() != 0) {
                    i2 = 0;
                } else {
                    i2 = TabLayout.this.dpToPx(8);
                }
                if (TabLayout.this.inlineLabel) {
                    if (i2 != androidx.core.h.h.b(marginLayoutParams)) {
                        androidx.core.h.h.b(marginLayoutParams, i2);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (i2 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i2;
                    androidx.core.h.h.b(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            f fVar3 = this.tab;
            if (fVar3 != null) {
                charSequence2 = fVar3.f52653d;
            } else {
                charSequence2 = null;
            }
            if (!z) {
                charSequence3 = charSequence2;
            }
            an.a(this, charSequence3);
        }

        public void onMeasure(int i2, int i3) {
            Layout layout;
            MethodCollector.i(5874);
            int size = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i2 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.tabMaxWidth, Integer.MIN_VALUE);
            }
            super.onMeasure(i2, i3);
            if (this.textView != null) {
                float f2 = TabLayout.this.tabTextSize;
                int i4 = this.defaultMaxLines;
                ImageView imageView = this.iconView;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView2 = this.textView;
                    if (textView2 != null && textView2.getLineCount() > 1) {
                        f2 = TabLayout.this.tabTextMultiLineSize;
                    }
                } else {
                    i4 = 1;
                }
                float textSize = this.textView.getTextSize();
                int lineCount = this.textView.getLineCount();
                int a2 = androidx.core.widget.h.a(this.textView);
                if ((f2 != textSize || (a2 >= 0 && i4 != a2)) && (TabLayout.this.mode != 1 || f2 <= textSize || lineCount != 1 || ((layout = this.textView.getLayout()) != null && approximateLineWidth(layout, 0, f2) <= ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))))) {
                    this.textView.setTextSize(0, f2);
                    this.textView.setMaxLines(i4);
                    super.onMeasure(i2, i3);
                }
            }
            MethodCollector.o(5874);
        }

        private float approximateLineWidth(Layout layout, int i2, float f2) {
            return layout.getLineWidth(i2) * (f2 / layout.getPaint().getTextSize());
        }
    }

    public int getTabGravity() {
        return this.tabGravity;
    }

    public ColorStateList getTabIconTint() {
        return this.tabIconTint;
    }

    public int getTabIndicatorGravity() {
        return this.tabIndicatorGravity;
    }

    /* access modifiers changed from: package-private */
    public int getTabMaxWidth() {
        return this.tabMaxWidth;
    }

    public int getTabMode() {
        return this.mode;
    }

    public ColorStateList getTabRippleColor() {
        return this.tabRippleColorStateList;
    }

    public Drawable getTabSelectedIndicator() {
        return this.tabSelectedIndicator;
    }

    public ColorStateList getTabTextColors() {
        return this.tabTextColors;
    }

    public boolean hasUnboundedRipple() {
        return this.unboundedRipple;
    }

    public boolean isInlineLabel() {
        return this.inlineLabel;
    }

    public boolean isTabIndicatorFullWidth() {
        return this.tabIndicatorFullWidth;
    }

    /* access modifiers changed from: package-private */
    public class d extends DataSetObserver {
        static {
            Covode.recordClassIndex(32608);
        }

        public final void onChanged() {
            TabLayout.this.populateFromPagerAdapter();
        }

        public final void onInvalidated() {
            TabLayout.this.populateFromPagerAdapter();
        }

        d() {
        }
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public Object f52650a;

        /* renamed from: b  reason: collision with root package name */
        public Drawable f52651b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f52652c;

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f52653d;

        /* renamed from: e  reason: collision with root package name */
        public int f52654e = -1;

        /* renamed from: f  reason: collision with root package name */
        public View f52655f;

        /* renamed from: g  reason: collision with root package name */
        public TabLayout f52656g;

        /* renamed from: h  reason: collision with root package name */
        public TabView f52657h;

        static {
            Covode.recordClassIndex(32612);
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            TabView tabView = this.f52657h;
            if (tabView != null) {
                tabView.update();
            }
        }

        public final void a() {
            TabLayout tabLayout = this.f52656g;
            if (tabLayout != null) {
                tabLayout.selectTab(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* access modifiers changed from: package-private */
        public final void c() {
            this.f52656g = null;
            this.f52657h = null;
            this.f52650a = null;
            this.f52651b = null;
            this.f52652c = null;
            this.f52653d = null;
            this.f52654e = -1;
            this.f52655f = null;
        }

        public final f a(View view) {
            this.f52655f = view;
            b();
            return this;
        }

        public final f a(int i2) {
            return a(com.a.a(LayoutInflater.from(this.f52657h.getContext()), i2, this.f52657h, false));
        }

        public final f a(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f52653d) && !TextUtils.isEmpty(charSequence)) {
                this.f52657h.setContentDescription(charSequence);
            }
            this.f52652c = charSequence;
            b();
            return this;
        }
    }

    public void clearOnTabSelectedListeners() {
        this.selectedListeners.clear();
    }

    public int getTabCount() {
        return this.tabs.size();
    }

    static {
        Covode.recordClassIndex(32602);
    }

    private LinearLayout.LayoutParams createLayoutParamsForTabs() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        updateTabViewLayoutParams(layoutParams);
        return layoutParams;
    }

    private int getTabMinWidth() {
        int i2 = this.requestedTabMinWidth;
        if (i2 != -1) {
            return i2;
        }
        if (this.mode == 0) {
            return this.scrollableTabMinWidth;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public f createTabFromPool() {
        f acquire = tabPool.acquire();
        if (acquire == null) {
            return new f();
        }
        return acquire;
    }

    public int getSelectedTabPosition() {
        f fVar = this.selectedTab;
        if (fVar != null) {
            return fVar.f52654e;
        }
        return -1;
    }

    public f newTab() {
        f createTabFromPool = createTabFromPool();
        createTabFromPool.f52656g = this;
        createTabFromPool.f52657h = createTabView(createTabFromPool);
        return createTabFromPool;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.setupViewPagerImplicitly) {
            setupWithViewPager(null);
            this.setupViewPagerImplicitly = false;
        }
    }

    public boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.slidingTabIndicator.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void updateAllTabs() {
        int size = this.tabs.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.tabs.get(i2).b();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.viewPager == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                setupWithViewPager((ViewPager) parent, true, true);
            }
        }
    }

    private void applyModeAndGravity() {
        int i2;
        if (this.mode == 0) {
            i2 = Math.max(0, this.contentInsetStart - this.tabPaddingStart);
        } else {
            i2 = 0;
        }
        v.a(this.slidingTabIndicator, i2, 0, 0, 0);
        int i3 = this.mode;
        if (i3 == 0) {
            this.slidingTabIndicator.setGravity(8388611);
        } else if (i3 == 1) {
            this.slidingTabIndicator.setGravity(1);
        }
        updateTabViews(true);
    }

    private void ensureScrollAnimator() {
        if (this.scrollAnimator == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.scrollAnimator = valueAnimator;
            valueAnimator.setInterpolator(com.google.android.material.a.a.f52127b);
            this.scrollAnimator.setDuration((long) this.tabIndicatorAnimationDuration);
            this.scrollAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.google.android.material.tabs.TabLayout.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(32603);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    private int getDefaultHeight() {
        int size = this.tabs.size();
        for (int i2 = 0; i2 < size; i2++) {
            f fVar = this.tabs.get(i2);
            if (fVar != null && fVar.f52651b != null && !TextUtils.isEmpty(fVar.f52652c)) {
                if (!this.inlineLabel) {
                    return 72;
                } else {
                    return 48;
                }
            }
        }
        return 48;
    }

    public void removeAllTabs() {
        for (int childCount = this.slidingTabIndicator.getChildCount() - 1; childCount >= 0; childCount--) {
            removeTabViewAt(childCount);
        }
        Iterator<f> it = this.tabs.iterator();
        while (it.hasNext()) {
            f next = it.next();
            it.remove();
            next.c();
            releaseFromTabPool(next);
        }
        this.selectedTab = null;
    }

    /* access modifiers changed from: package-private */
    public void populateFromPagerAdapter() {
        int currentItem;
        removeAllTabs();
        PagerAdapter pagerAdapter2 = this.pagerAdapter;
        if (pagerAdapter2 != null) {
            int count = pagerAdapter2.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                addTab(newTab().a(this.pagerAdapter.getPageTitle(i2)), false);
            }
            ViewPager viewPager2 = this.viewPager;
            if (viewPager2 != null && count > 0 && (currentItem = viewPager2.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                selectTab(getTabAt(currentItem));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class e extends LinearLayout {

        /* renamed from: a  reason: collision with root package name */
        int f52633a = -1;

        /* renamed from: b  reason: collision with root package name */
        float f52634b;

        /* renamed from: c  reason: collision with root package name */
        ValueAnimator f52635c;

        /* renamed from: e  reason: collision with root package name */
        private int f52637e;

        /* renamed from: f  reason: collision with root package name */
        private final Paint f52638f;

        /* renamed from: g  reason: collision with root package name */
        private final GradientDrawable f52639g;

        /* renamed from: h  reason: collision with root package name */
        private int f52640h = -1;

        /* renamed from: i  reason: collision with root package name */
        private int f52641i = -1;

        /* renamed from: j  reason: collision with root package name */
        private int f52642j = -1;

        static {
            Covode.recordClassIndex(32609);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            int i2;
            int i3;
            View childAt = getChildAt(this.f52633a);
            if (childAt == null || childAt.getWidth() <= 0) {
                i2 = -1;
                i3 = -1;
            } else {
                i2 = childAt.getLeft();
                i3 = childAt.getRight();
                if (!TabLayout.this.tabIndicatorFullWidth && (childAt instanceof TabView)) {
                    a((TabView) childAt, TabLayout.this.tabViewContentBounds);
                    i2 = (int) TabLayout.this.tabViewContentBounds.left;
                    i3 = (int) TabLayout.this.tabViewContentBounds.right;
                }
                if (this.f52634b > 0.0f && this.f52633a < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f52633a + 1);
                    int left = childAt2.getLeft();
                    int right = childAt2.getRight();
                    if (!TabLayout.this.tabIndicatorFullWidth && (childAt2 instanceof TabView)) {
                        a((TabView) childAt2, TabLayout.this.tabViewContentBounds);
                        left = (int) TabLayout.this.tabViewContentBounds.left;
                        right = (int) TabLayout.this.tabViewContentBounds.right;
                    }
                    float f2 = this.f52634b;
                    i2 = (int) ((((float) left) * f2) + ((1.0f - f2) * ((float) i2)));
                    i3 = (int) ((((float) right) * f2) + ((1.0f - f2) * ((float) i3)));
                }
            }
            a(i2, i3);
        }

        /* access modifiers changed from: package-private */
        public final void b(int i2) {
            if (this.f52637e != i2) {
                this.f52637e = i2;
                v.c(this);
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2) {
            if (this.f52638f.getColor() != i2) {
                this.f52638f.setColor(i2);
                v.c(this);
            }
        }

        public void onRtlPropertiesChanged(int i2) {
            super.onRtlPropertiesChanged(i2);
            if (Build.VERSION.SDK_INT < 23 && this.f52640h != i2) {
                requestLayout();
                this.f52640h = i2;
            }
        }

        public void draw(Canvas canvas) {
            int i2;
            Drawable drawable;
            int i3 = 0;
            if (TabLayout.this.tabSelectedIndicator != null) {
                i2 = TabLayout.this.tabSelectedIndicator.getIntrinsicHeight();
            } else {
                i2 = 0;
            }
            int i4 = this.f52637e;
            if (i4 >= 0) {
                i2 = i4;
            }
            int i5 = TabLayout.this.tabIndicatorGravity;
            if (i5 == 0) {
                i3 = getHeight() - i2;
                i2 = getHeight();
            } else if (i5 == 1) {
                i3 = (getHeight() - i2) / 2;
                i2 = (getHeight() + i2) / 2;
            } else if (i5 != 2) {
                if (i5 != 3) {
                    i2 = 0;
                } else {
                    i2 = getHeight();
                }
            }
            int i6 = this.f52641i;
            if (i6 >= 0 && this.f52642j > i6) {
                if (TabLayout.this.tabSelectedIndicator != null) {
                    drawable = TabLayout.this.tabSelectedIndicator;
                } else {
                    drawable = this.f52639g;
                }
                Drawable e2 = androidx.core.graphics.drawable.a.e(drawable);
                e2.setBounds(this.f52641i, i3, this.f52642j, i2);
                if (this.f52638f != null) {
                    if (Build.VERSION.SDK_INT == 21) {
                        e2.setColorFilter(this.f52638f.getColor(), PorterDuff.Mode.SRC_IN);
                    } else {
                        androidx.core.graphics.drawable.a.a(e2, this.f52638f.getColor());
                    }
                }
                e2.draw(canvas);
            }
            super.draw(canvas);
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2, int i3) {
            if (i2 != this.f52641i || i3 != this.f52642j) {
                this.f52641i = i2;
                this.f52642j = i3;
                v.c(this);
            }
        }

        e(Context context) {
            super(context);
            MethodCollector.i(2638);
            setWillNotDraw(false);
            this.f52638f = new Paint();
            this.f52639g = new GradientDrawable();
            MethodCollector.o(2638);
        }

        private void a(TabView tabView, RectF rectF) {
            int contentWidth = tabView.getContentWidth();
            if (contentWidth < TabLayout.this.dpToPx(24)) {
                contentWidth = TabLayout.this.dpToPx(24);
            }
            int left = (tabView.getLeft() + tabView.getRight()) / 2;
            int i2 = contentWidth / 2;
            rectF.set((float) (left - i2), 0.0f, (float) (left + i2), 0.0f);
        }

        /* access modifiers changed from: package-private */
        public final void b(final int i2, int i3) {
            ValueAnimator valueAnimator = this.f52635c;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f52635c.cancel();
            }
            View childAt = getChildAt(i2);
            if (childAt == null) {
                a();
                return;
            }
            final int left = childAt.getLeft();
            final int right = childAt.getRight();
            if (!TabLayout.this.tabIndicatorFullWidth && (childAt instanceof TabView)) {
                a((TabView) childAt, TabLayout.this.tabViewContentBounds);
                left = (int) TabLayout.this.tabViewContentBounds.left;
                right = (int) TabLayout.this.tabViewContentBounds.right;
            }
            final int i4 = this.f52641i;
            final int i5 = this.f52642j;
            if (i4 != left || i5 != right) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.f52635c = valueAnimator2;
                valueAnimator2.setInterpolator(com.google.android.material.a.a.f52127b);
                valueAnimator2.setDuration((long) i3);
                valueAnimator2.setFloatValues(0.0f, 1.0f);
                valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.google.android.material.tabs.TabLayout.e.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(32610);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        e.this.a(com.google.android.material.a.a.a(i4, left, animatedFraction), com.google.android.material.a.a.a(i5, right, animatedFraction));
                    }
                });
                valueAnimator2.addListener(new AnimatorListenerAdapter() {
                    /* class com.google.android.material.tabs.TabLayout.e.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(32611);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        e.this.f52633a = i2;
                        e.this.f52634b = 0.0f;
                    }
                });
                valueAnimator2.start();
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0078, code lost:
            if (r3 != false) goto L_0x0084;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onMeasure(int r9, int r10) {
            /*
            // Method dump skipped, instructions count: 139
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.e.onMeasure(int, int):void");
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            MethodCollector.i(3232);
            super.onLayout(z, i2, i3, i4, i5);
            ValueAnimator valueAnimator = this.f52635c;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                a();
                MethodCollector.o(3232);
                return;
            }
            this.f52635c.cancel();
            b(this.f52633a, Math.round((1.0f - this.f52635c.getAnimatedFraction()) * ((float) this.f52635c.getDuration())));
            MethodCollector.o(3232);
        }
    }

    public void addView(View view) {
        addViewInternal(view);
    }

    /* access modifiers changed from: package-private */
    public class a implements ViewPager.d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f52630a;

        static {
            Covode.recordClassIndex(32605);
        }

        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.d
        public final void a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            if (TabLayout.this.viewPager == viewPager) {
                TabLayout.this.setPagerAdapter(pagerAdapter2, this.f52630a);
            }
        }
    }

    public static class g implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        int f52658a;

        /* renamed from: b  reason: collision with root package name */
        int f52659b;

        /* renamed from: c  reason: collision with root package name */
        private final WeakReference<TabLayout> f52660c;

        static {
            Covode.recordClassIndex(32613);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public void onPageScrollStateChanged(int i2) {
            this.f52658a = this.f52659b;
            this.f52659b = i2;
        }

        public g(TabLayout tabLayout) {
            this.f52660c = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public void onPageSelected(int i2) {
            boolean z;
            TabLayout tabLayout = this.f52660c.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i2 && i2 < tabLayout.getTabCount()) {
                int i3 = this.f52659b;
                if (i3 == 0 || (i3 == 2 && this.f52658a == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                tabLayout.selectTab(tabLayout.getTabAt(i2), z);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
            r3 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
            r5.setScrollPosition(r7, r8, r1, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
            if (r4 == 2) goto L_0x0018;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
            if (r6.f52658a != 0) goto L_0x001c;
         */
        @Override // androidx.viewpager.widget.ViewPager.e
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPageScrolled(int r7, float r8, int r9) {
            /*
                r6 = this;
                java.lang.ref.WeakReference<com.google.android.material.tabs.TabLayout> r0 = r6.f52660c
                java.lang.Object r5 = r0.get()
                com.google.android.material.tabs.TabLayout r5 = (com.google.android.material.tabs.TabLayout) r5
                if (r5 == 0) goto L_0x0020
                int r4 = r6.f52659b
                r3 = 0
                r2 = 2
                r1 = 1
                if (r4 != r2) goto L_0x0015
                int r0 = r6.f52658a
                if (r0 != r1) goto L_0x0021
            L_0x0015:
                r1 = 1
                if (r4 != r2) goto L_0x001c
            L_0x0018:
                int r0 = r6.f52658a
                if (r0 == 0) goto L_0x001d
            L_0x001c:
                r3 = 1
            L_0x001d:
                r5.setScrollPosition(r7, r8, r1, r3)
            L_0x0020:
                return
            L_0x0021:
                r1 = 0
                goto L_0x0018
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.g.onPageScrolled(int, float, int):void");
        }
    }

    public static class h implements c {

        /* renamed from: a  reason: collision with root package name */
        private final ViewPager f52661a;

        static {
            Covode.recordClassIndex(32614);
        }

        @Override // com.google.android.material.tabs.TabLayout.b
        public void b(f fVar) {
        }

        public h(ViewPager viewPager) {
            this.f52661a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.b
        public void a(f fVar) {
            this.f52661a.setCurrentItem(fVar.f52654e);
        }
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public boolean releaseFromTabPool(f fVar) {
        return tabPool.release(fVar);
    }

    public void removeOnTabSelectedListener(b bVar) {
        this.selectedListeners.remove(bVar);
    }

    /* access modifiers changed from: package-private */
    public void selectTab(f fVar) {
        selectTab(fVar, true);
    }

    public void setSelectedTabIndicatorColor(int i2) {
        this.slidingTabIndicator.a(i2);
    }

    public void setSelectedTabIndicatorHeight(int i2) {
        this.slidingTabIndicator.b(i2);
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.tabIndicatorFullWidth = z;
        v.c(this.slidingTabIndicator);
    }

    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter2) {
        setPagerAdapter(pagerAdapter2, false);
    }

    public void setupWithViewPager(ViewPager viewPager2) {
        setupWithViewPager(viewPager2, true);
    }

    private void addTabView(f fVar) {
        this.slidingTabIndicator.addView(fVar.f52657h, fVar.f52654e, createLayoutParamsForTabs());
    }

    public void addOnTabSelectedListener(b bVar) {
        if (!this.selectedListeners.contains(bVar)) {
            this.selectedListeners.add(bVar);
        }
    }

    public void addTab(f fVar) {
        addTab(fVar, this.tabs.isEmpty());
    }

    @Override // android.widget.FrameLayout, android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public void setInlineLabelResource(int i2) {
        setInlineLabel(getResources().getBoolean(i2));
    }

    public void setOnTabSelectedListener(b bVar) {
        b bVar2 = this.selectedListener;
        if (bVar2 != null) {
            removeOnTabSelectedListener(bVar2);
        }
        this.selectedListener = bVar;
        if (bVar != null) {
            addOnTabSelectedListener(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        ensureScrollAnimator();
        this.scrollAnimator.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.tabSelectedIndicator != drawable) {
            this.tabSelectedIndicator = drawable;
            v.c(this.slidingTabIndicator);
        }
    }

    public void setSelectedTabIndicatorGravity(int i2) {
        if (this.tabIndicatorGravity != i2) {
            this.tabIndicatorGravity = i2;
            v.c(this.slidingTabIndicator);
        }
    }

    public void setTabGravity(int i2) {
        if (this.tabGravity != i2) {
            this.tabGravity = i2;
            applyModeAndGravity();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.tabIconTint != colorStateList) {
            this.tabIconTint = colorStateList;
            updateAllTabs();
        }
    }

    public void setTabIconTintResource(int i2) {
        setTabIconTint(androidx.appcompat.a.a.a.a(getContext(), i2));
    }

    public void setTabMode(int i2) {
        if (i2 != this.mode) {
            this.mode = i2;
            applyModeAndGravity();
        }
    }

    public void setTabRippleColorResource(int i2) {
        setTabRippleColor(androidx.appcompat.a.a.a.a(getContext(), i2));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.tabTextColors != colorStateList) {
            this.tabTextColors = colorStateList;
            updateAllTabs();
        }
    }

    public void setUnboundedRippleResource(int i2) {
        setUnboundedRipple(getResources().getBoolean(i2));
    }

    private void addViewInternal(View view) {
        if (view instanceof a) {
            addTabFromItemView((a) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void dispatchTabReselected(f fVar) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size);
        }
    }

    private void dispatchTabSelected(f fVar) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size).a(fVar);
        }
    }

    private void dispatchTabUnselected(f fVar) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size).b(fVar);
        }
    }

    private void removeTabViewAt(int i2) {
        TabView tabView = (TabView) this.slidingTabIndicator.getChildAt(i2);
        this.slidingTabIndicator.removeViewAt(i2);
        if (tabView != null) {
            tabView.reset();
            this.tabViewPool.release(tabView);
        }
        requestLayout();
    }

    private void updateTabViewLayoutParams(LinearLayout.LayoutParams layoutParams) {
        if (this.mode == 1 && this.tabGravity == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    /* access modifiers changed from: package-private */
    public int dpToPx(int i2) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i2));
    }

    public f getTabAt(int i2) {
        if (i2 < 0 || i2 >= getTabCount()) {
            return null;
        }
        return this.tabs.get(i2);
    }

    public void removeTab(f fVar) {
        if (fVar.f52656g == this) {
            removeTabAt(fVar.f52654e);
            return;
        }
        throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
    }

    public void setSelectedTabIndicator(int i2) {
        if (i2 != 0) {
            setSelectedTabIndicator(androidx.appcompat.a.a.a.b(getContext(), i2));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    private void addTabFromItemView(a aVar) {
        f newTab = newTab();
        if (aVar.f52662a != null) {
            newTab.a(aVar.f52662a);
        }
        if (aVar.f52663b != null) {
            newTab.f52651b = aVar.f52663b;
            newTab.b();
        }
        if (aVar.f52664c != 0) {
            newTab.a(aVar.f52664c);
        }
        if (!TextUtils.isEmpty(aVar.getContentDescription())) {
            newTab.f52653d = aVar.getContentDescription();
            newTab.b();
        }
        addTab(newTab);
    }

    private TabView createTabView(f fVar) {
        TabView tabView;
        f.a<TabView> aVar = this.tabViewPool;
        if (aVar == null || (tabView = aVar.acquire()) == null) {
            tabView = new TabView(getContext());
        }
        tabView.setTab(fVar);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(fVar.f52653d)) {
            tabView.setContentDescription(fVar.f52652c);
        } else {
            tabView.setContentDescription(fVar.f52653d);
        }
        return tabView;
    }

    private void setSelectedTabView(int i2) {
        boolean z;
        int childCount = this.slidingTabIndicator.getChildCount();
        if (i2 < childCount) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.slidingTabIndicator.getChildAt(i3);
                boolean z2 = true;
                if (i3 == i2) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
                if (i3 != i2) {
                    z2 = false;
                }
                childAt.setActivated(z2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.i(5584);
        for (int i2 = 0; i2 < this.slidingTabIndicator.getChildCount(); i2++) {
            View childAt = this.slidingTabIndicator.getChildAt(i2);
            if (childAt instanceof TabView) {
                ((TabView) childAt).drawBackground(canvas);
            }
        }
        super.onDraw(canvas);
        MethodCollector.o(5584);
    }

    public void setInlineLabel(boolean z) {
        if (this.inlineLabel != z) {
            this.inlineLabel = z;
            for (int i2 = 0; i2 < this.slidingTabIndicator.getChildCount(); i2++) {
                View childAt = this.slidingTabIndicator.getChildAt(i2);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).updateOrientation();
                }
            }
            applyModeAndGravity();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.tabRippleColorStateList != colorStateList) {
            this.tabRippleColorStateList = colorStateList;
            for (int i2 = 0; i2 < this.slidingTabIndicator.getChildCount(); i2++) {
                View childAt = this.slidingTabIndicator.getChildAt(i2);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).updateBackgroundDrawable(getContext());
                }
            }
        }
    }

    public void setUnboundedRipple(boolean z) {
        if (this.unboundedRipple != z) {
            this.unboundedRipple = z;
            for (int i2 = 0; i2 < this.slidingTabIndicator.getChildCount(); i2++) {
                View childAt = this.slidingTabIndicator.getChildAt(i2);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).updateBackgroundDrawable(getContext());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void updateTabViews(boolean z) {
        for (int i2 = 0; i2 < this.slidingTabIndicator.getChildCount(); i2++) {
            View childAt = this.slidingTabIndicator.getChildAt(i2);
            childAt.setMinimumWidth(getTabMinWidth());
            updateTabViewLayoutParams((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    private void animateToTab(int i2) {
        if (i2 != -1) {
            if (getWindowToken() != null && v.v(this)) {
                e eVar = this.slidingTabIndicator;
                int childCount = eVar.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    if (eVar.getChildAt(i3).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int calculateScrollXForTab = calculateScrollXForTab(i2, 0.0f);
                if (scrollX != calculateScrollXForTab) {
                    ensureScrollAnimator();
                    this.scrollAnimator.setIntValues(scrollX, calculateScrollXForTab);
                    this.scrollAnimator.start();
                }
                this.slidingTabIndicator.b(i2, this.tabIndicatorAnimationDuration);
                return;
            }
            setScrollPosition(i2, 0.0f, true);
        }
    }

    public void removeTabAt(int i2) {
        int i3;
        f fVar;
        f fVar2 = this.selectedTab;
        if (fVar2 != null) {
            i3 = fVar2.f52654e;
        } else {
            i3 = 0;
        }
        removeTabViewAt(i2);
        f remove = this.tabs.remove(i2);
        if (remove != null) {
            remove.c();
            releaseFromTabPool(remove);
        }
        int size = this.tabs.size();
        for (int i4 = i2; i4 < size; i4++) {
            this.tabs.get(i4).f52654e = i4;
        }
        if (i3 == i2) {
            if (this.tabs.isEmpty()) {
                fVar = null;
            } else {
                fVar = this.tabs.get(Math.max(0, i2 - 1));
            }
            selectTab(fVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2) {
        addViewInternal(view);
    }

    public void setTabTextColors(int i2, int i3) {
        setTabTextColors(createColorStateList(i2, i3));
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.agw);
    }

    public void setupWithViewPager(ViewPager viewPager2, boolean z) {
        setupWithViewPager(viewPager2, z, false);
    }

    private void configureTab(f fVar, int i2) {
        fVar.f52654e = i2;
        this.tabs.add(i2, fVar);
        int size = this.tabs.size();
        while (true) {
            i2++;
            if (i2 < size) {
                this.tabs.get(i2).f52654e = i2;
            } else {
                return;
            }
        }
    }

    private static ColorStateList createColorStateList(int i2, int i3) {
        return new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i3, i2});
    }

    public void addTab(f fVar, int i2) {
        addTab(fVar, i2, this.tabs.isEmpty());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    /* access modifiers changed from: package-private */
    public void selectTab(f fVar, boolean z) {
        int i2;
        f fVar2 = this.selectedTab;
        if (fVar2 != fVar) {
            if (fVar != null) {
                i2 = fVar.f52654e;
            } else {
                i2 = -1;
            }
            if (z) {
                if ((fVar2 == null || fVar2.f52654e == -1) && i2 != -1) {
                    setScrollPosition(i2, 0.0f, true);
                } else {
                    animateToTab(i2);
                }
                if (i2 != -1) {
                    setSelectedTabView(i2);
                }
            }
            this.selectedTab = fVar;
            if (fVar2 != null) {
                dispatchTabUnselected(fVar2);
            }
            if (fVar != null) {
                dispatchTabSelected(fVar);
            }
        } else if (fVar2 != null) {
            dispatchTabReselected(fVar);
            animateToTab(fVar.f52654e);
        }
    }

    /* access modifiers changed from: package-private */
    public void setPagerAdapter(PagerAdapter pagerAdapter2, boolean z) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter3 = this.pagerAdapter;
        if (!(pagerAdapter3 == null || (dataSetObserver = this.pagerAdapterObserver) == null)) {
            pagerAdapter3.unregisterDataSetObserver(dataSetObserver);
        }
        this.pagerAdapter = pagerAdapter2;
        if (z && pagerAdapter2 != null) {
            if (this.pagerAdapterObserver == null) {
                this.pagerAdapterObserver = new d();
            }
            pagerAdapter2.registerDataSetObserver(this.pagerAdapterObserver);
        }
        populateFromPagerAdapter();
    }

    private int calculateScrollXForTab(int i2, float f2) {
        View view;
        int i3;
        int i4 = 0;
        if (this.mode != 0) {
            return 0;
        }
        View childAt = this.slidingTabIndicator.getChildAt(i2);
        int i5 = i2 + 1;
        if (i5 < this.slidingTabIndicator.getChildCount()) {
            view = this.slidingTabIndicator.getChildAt(i5);
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
        int i6 = (int) (((float) (i3 + i4)) * 0.5f * f2);
        if (v.e(this) == 0) {
            return left + i6;
        }
        return left - i6;
    }

    public void addTab(f fVar, boolean z) {
        addTab(fVar, this.tabs.size(), z);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(5691);
        int dpToPx = dpToPx(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
        int mode2 = View.MeasureSpec.getMode(i3);
        if (mode2 == Integer.MIN_VALUE) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(dpToPx, View.MeasureSpec.getSize(i3)), 1073741824);
        } else if (mode2 == 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(dpToPx, 1073741824);
        }
        int size = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) != 0) {
            int i4 = this.requestedTabMaxWidth;
            if (i4 <= 0) {
                i4 = size - dpToPx(56);
            }
            this.tabMaxWidth = i4;
        }
        super.onMeasure(i2, i3);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i5 = this.mode;
            if (i5 == 0 ? childAt.getMeasuredWidth() < getMeasuredWidth() : !(i5 != 1 || childAt.getMeasuredWidth() == getMeasuredWidth())) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
            }
        }
        MethodCollector.o(5691);
    }

    public void setScrollPosition(int i2, float f2, boolean z) {
        setScrollPosition(i2, f2, z, true);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    public void addTab(f fVar, int i2, boolean z) {
        if (fVar.f52656g == this) {
            configureTab(fVar, i2);
            addTabView(fVar);
            if (z) {
                fVar.a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    private void setupWithViewPager(ViewPager viewPager2, boolean z, boolean z2) {
        ViewPager viewPager3 = this.viewPager;
        if (viewPager3 != null) {
            g gVar = this.pageChangeListener;
            if (gVar != null) {
                viewPager3.removeOnPageChangeListener(gVar);
            }
            a aVar = this.adapterChangeListener;
            if (aVar != null) {
                this.viewPager.removeOnAdapterChangeListener(aVar);
            }
        }
        b bVar = this.currentVpSelectedListener;
        if (bVar != null) {
            removeOnTabSelectedListener(bVar);
            this.currentVpSelectedListener = null;
        }
        if (viewPager2 != null) {
            this.viewPager = viewPager2;
            if (this.pageChangeListener == null) {
                this.pageChangeListener = new g(this);
            }
            g gVar2 = this.pageChangeListener;
            gVar2.f52659b = 0;
            gVar2.f52658a = 0;
            viewPager2.addOnPageChangeListener(this.pageChangeListener);
            h hVar = new h(viewPager2);
            this.currentVpSelectedListener = hVar;
            addOnTabSelectedListener(hVar);
            PagerAdapter adapter = viewPager2.getAdapter();
            if (adapter != null) {
                setPagerAdapter(adapter, z);
            }
            if (this.adapterChangeListener == null) {
                this.adapterChangeListener = new a();
            }
            this.adapterChangeListener.f52630a = z;
            viewPager2.addOnAdapterChangeListener(this.adapterChangeListener);
            setScrollPosition(viewPager2.getCurrentItem(), 0.0f, true);
        } else {
            this.viewPager = null;
            setPagerAdapter(null, false);
        }
        this.setupViewPagerImplicitly = z2;
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        MethodCollector.i(5397);
        this.tabs = new ArrayList<>();
        this.tabViewContentBounds = new RectF();
        this.tabMaxWidth = Integer.MAX_VALUE;
        this.selectedListeners = new ArrayList<>();
        this.tabViewPool = new f.b(12);
        setHorizontalScrollBarEnabled(false);
        e eVar = new e(context);
        this.slidingTabIndicator = eVar;
        super.addView(eVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray a2 = k.a(context, attributeSet, new int[]{R.attr.ag_, R.attr.aga, R.attr.agb, R.attr.agc, R.attr.agd, R.attr.age, R.attr.agf, R.attr.agg, R.attr.agh, R.attr.agi, R.attr.agj, R.attr.agl, R.attr.agm, R.attr.agn, R.attr.ago, R.attr.agp, R.attr.agq, R.attr.agr, R.attr.ags, R.attr.agt, R.attr.agu, R.attr.agv, R.attr.agx, R.attr.agy, R.attr.agz}, i2, R.style.r4, 22);
        eVar.b(a2.getDimensionPixelSize(10, -1));
        eVar.a(a2.getColor(7, 0));
        setSelectedTabIndicator(com.google.android.material.f.a.b(context, a2, 5));
        setSelectedTabIndicatorGravity(a2.getInt(9, 0));
        setTabIndicatorFullWidth(a2.getBoolean(8, true));
        int dimensionPixelSize = a2.getDimensionPixelSize(15, 0);
        this.tabPaddingBottom = dimensionPixelSize;
        this.tabPaddingEnd = dimensionPixelSize;
        this.tabPaddingTop = dimensionPixelSize;
        this.tabPaddingStart = dimensionPixelSize;
        this.tabPaddingStart = a2.getDimensionPixelSize(18, dimensionPixelSize);
        this.tabPaddingTop = a2.getDimensionPixelSize(19, this.tabPaddingTop);
        this.tabPaddingEnd = a2.getDimensionPixelSize(17, this.tabPaddingEnd);
        this.tabPaddingBottom = a2.getDimensionPixelSize(16, this.tabPaddingBottom);
        int resourceId = a2.getResourceId(22, R.style.ji);
        this.tabTextAppearance = resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.ui, R.attr.ahm});
        try {
            this.tabTextSize = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.tabTextColors = com.google.android.material.f.a.a(context, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (a2.hasValue(23)) {
                this.tabTextColors = com.google.android.material.f.a.a(context, a2, 23);
            }
            if (a2.hasValue(21)) {
                this.tabTextColors = createColorStateList(this.tabTextColors.getDefaultColor(), a2.getColor(21, 0));
            }
            this.tabIconTint = com.google.android.material.f.a.a(context, a2, 3);
            this.tabIconTintMode = l.a(a2.getInt(4, -1), null);
            this.tabRippleColorStateList = com.google.android.material.f.a.a(context, a2, 20);
            this.tabIndicatorAnimationDuration = a2.getInt(6, 300);
            this.requestedTabMinWidth = a2.getDimensionPixelSize(13, -1);
            this.requestedTabMaxWidth = a2.getDimensionPixelSize(12, -1);
            this.tabBackgroundResId = a2.getResourceId(0, 0);
            this.contentInsetStart = a2.getDimensionPixelSize(1, 0);
            this.mode = a2.getInt(14, 1);
            this.tabGravity = a2.getInt(2, 0);
            this.inlineLabel = a2.getBoolean(11, false);
            this.unboundedRipple = a2.getBoolean(24, false);
            a2.recycle();
            Resources resources = getResources();
            this.tabTextMultiLineSize = (float) resources.getDimensionPixelSize(R.dimen.ib);
            this.scrollableTabMinWidth = resources.getDimensionPixelSize(R.dimen.i_);
            applyModeAndGravity();
            MethodCollector.o(5397);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            MethodCollector.o(5397);
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public void setScrollPosition(int i2, float f2, boolean z, boolean z2) {
        int round = Math.round(((float) i2) + f2);
        if (round >= 0 && round < this.slidingTabIndicator.getChildCount()) {
            if (z2) {
                e eVar = this.slidingTabIndicator;
                if (eVar.f52635c != null && eVar.f52635c.isRunning()) {
                    eVar.f52635c.cancel();
                }
                eVar.f52633a = i2;
                eVar.f52634b = f2;
                eVar.a();
            }
            ValueAnimator valueAnimator = this.scrollAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.scrollAnimator.cancel();
            }
            scrollTo(calculateScrollXForTab(i2, f2), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }
}
