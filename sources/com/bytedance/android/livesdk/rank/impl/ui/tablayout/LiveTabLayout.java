package com.bytedance.android.livesdk.rank.impl.ui.tablayout;

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
public class LiveTabLayout extends HorizontalScrollView {
    private static final int[] N = {R.attr.ol};

    /* renamed from: a  reason: collision with root package name */
    public static final Interpolator f20952a = new androidx.g.a.a.b();
    private static final f.a<f> u = new f.c(16);
    private final int A;
    private int B;
    private c C;
    private final ArrayList<c> D;
    private c E;
    private ValueAnimator F;
    private PagerAdapter G;
    private DataSetObserver H;
    private a I;
    private boolean J;
    private float K;
    private float L;
    private final f.a<h> M;

    /* renamed from: b  reason: collision with root package name */
    public final e f20953b;

    /* renamed from: c  reason: collision with root package name */
    int f20954c;

    /* renamed from: d  reason: collision with root package name */
    int f20955d;

    /* renamed from: e  reason: collision with root package name */
    int f20956e;

    /* renamed from: f  reason: collision with root package name */
    int f20957f;

    /* renamed from: g  reason: collision with root package name */
    int f20958g;

    /* renamed from: h  reason: collision with root package name */
    ColorStateList f20959h;

    /* renamed from: i  reason: collision with root package name */
    float f20960i;

    /* renamed from: j  reason: collision with root package name */
    float f20961j;

    /* renamed from: k  reason: collision with root package name */
    int f20962k;

    /* renamed from: l  reason: collision with root package name */
    int f20963l;

    /* renamed from: m  reason: collision with root package name */
    int f20964m;
    int n;
    int o;
    boolean p;
    ViewPager q;
    g r;
    public b s;
    public int t;
    private final ArrayList<f> v;
    private f w;
    private int x;
    private int y;
    private int z;

    public interface b {
        static {
            Covode.recordClassIndex(12397);
        }
    }

    public interface c {
        static {
            Covode.recordClassIndex(12398);
        }

        void a(f fVar);
    }

    public class h extends LinearLayout {

        /* renamed from: b  reason: collision with root package name */
        private f f21007b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f21008c;

        /* renamed from: d  reason: collision with root package name */
        private ImageView f21009d;

        /* renamed from: e  reason: collision with root package name */
        private View f21010e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f21011f;

        /* renamed from: g  reason: collision with root package name */
        private ImageView f21012g;

        /* renamed from: h  reason: collision with root package name */
        private int f21013h = 2;

        static {
            Covode.recordClassIndex(12405);
        }

        public final TextView getCustomTextView() {
            return this.f21011f;
        }

        public final f getTab() {
            return this.f21007b;
        }

        public final TextView getTextView() {
            return this.f21008c;
        }

        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f21007b == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            if (LiveTabLayout.this.s == null) {
                this.f21007b.a();
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            View view;
            MethodCollector.i(1512);
            f fVar = this.f21007b;
            if (fVar == null || (view = fVar.f20994f) == null) {
                View view2 = this.f21010e;
                if (view2 != null) {
                    removeView(view2);
                    this.f21010e = null;
                }
                this.f21011f = null;
                this.f21012g = null;
            } else {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f21010e = view;
                TextView textView = this.f21008c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f21009d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f21009d.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.f21011f = textView2;
                if (textView2 != null) {
                    this.f21013h = androidx.core.widget.h.a(textView2);
                }
                this.f21012g = (ImageView) view.findViewById(16908294);
            }
            boolean z = false;
            if (this.f21010e == null) {
                if (this.f21009d == null) {
                    ImageView imageView2 = (ImageView) com.a.a(LayoutInflater.from(getContext()), R.layout.vo, this, false);
                    addView(imageView2, 0);
                    this.f21009d = imageView2;
                }
                if (this.f21008c == null) {
                    TextView textView3 = (TextView) com.a.a(LayoutInflater.from(getContext()), R.layout.vp, this, false);
                    addView(textView3);
                    this.f21008c = textView3;
                    this.f21013h = androidx.core.widget.h.a(textView3);
                }
                androidx.core.widget.h.a(this.f21008c, LiveTabLayout.this.f20958g);
                if (LiveTabLayout.this.f20959h != null) {
                    this.f21008c.setTextColor(LiveTabLayout.this.f20959h);
                }
                a(this.f21008c, this.f21009d);
            } else {
                TextView textView4 = this.f21011f;
                if (!(textView4 == null && this.f21012g == null)) {
                    a(textView4, this.f21012g);
                }
            }
            if (fVar != null && fVar.b()) {
                z = true;
            }
            setSelected(z);
            MethodCollector.o(1512);
        }

        /* access modifiers changed from: package-private */
        public final void a(f fVar) {
            if (fVar != this.f21007b) {
                this.f21007b = fVar;
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
            if (fVar != this.f21007b) {
                this.f21007b = fVar;
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
            TextView textView = this.f21008c;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f21009d;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f21010e;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public h(Context context) {
            super(context);
            MethodCollector.i(1424);
            if (LiveTabLayout.this.f20962k != 0) {
                v.a(this, androidx.appcompat.a.a.a.b(context, LiveTabLayout.this.f20962k));
            }
            v.a(this, LiveTabLayout.this.f20954c, LiveTabLayout.this.f20955d, LiveTabLayout.this.f20956e, LiveTabLayout.this.f20957f);
            setGravity(17);
            setOrientation(1);
            setClickable(true);
            v.a(this, s.a(getContext()));
            MethodCollector.o(1424);
        }

        private void a(TextView textView, ImageView imageView) {
            Drawable drawable;
            CharSequence charSequence;
            CharSequence charSequence2;
            f fVar = this.f21007b;
            CharSequence charSequence3 = null;
            if (fVar != null) {
                drawable = fVar.f20990b;
            } else {
                drawable = null;
            }
            f fVar2 = this.f21007b;
            if (fVar2 != null) {
                charSequence = fVar2.f20991c;
            } else {
                charSequence = null;
            }
            f fVar3 = this.f21007b;
            if (fVar3 != null) {
                charSequence2 = fVar3.f20992d;
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
                    i2 = LiveTabLayout.this.b(8);
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
            MethodCollector.i(1479);
            int size = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            int tabMaxWidth = LiveTabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i2 = View.MeasureSpec.makeMeasureSpec(LiveTabLayout.this.f20963l, Integer.MIN_VALUE);
            }
            super.onMeasure(i2, i3);
            if (this.f21008c != null) {
                getResources();
                float f2 = LiveTabLayout.this.f20960i;
                int i4 = this.f21013h;
                ImageView imageView = this.f21009d;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f21008c;
                    if (textView != null && textView.getLineCount() > 1) {
                        f2 = LiveTabLayout.this.f20961j;
                    }
                } else {
                    i4 = 1;
                }
                float textSize = this.f21008c.getTextSize();
                int lineCount = this.f21008c.getLineCount();
                int a2 = androidx.core.widget.h.a(this.f21008c);
                if ((f2 != textSize || (a2 >= 0 && i4 != a2)) && (LiveTabLayout.this.n != 1 || f2 <= textSize || lineCount != 1 || ((layout = this.f21008c.getLayout()) != null && layout.getLineWidth(0) * (f2 / layout.getPaint().getTextSize()) <= ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))))) {
                    this.f21008c.setTextSize(0, f2);
                    this.f21008c.setMaxLines(i4);
                    super.onMeasure(i2, i3);
                }
            }
            MethodCollector.o(1479);
        }
    }

    public int getTabGravity() {
        return this.f20964m;
    }

    /* access modifiers changed from: package-private */
    public int getTabMaxWidth() {
        return this.f20963l;
    }

    public int getTabMode() {
        return this.n;
    }

    public ColorStateList getTabTextColors() {
        return this.f20959h;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, float f2, boolean z2, boolean z3) {
        int round = Math.round(((float) i2) + f2);
        if (round >= 0 && round < this.f20953b.getChildCount()) {
            if (z3) {
                this.f20953b.a(i2, f2);
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
    public final void a(f fVar, boolean z2) {
        f fVar2 = this.w;
        if (fVar2 != fVar) {
            int i2 = fVar != null ? fVar.f20993e : -1;
            if (z2) {
                if ((fVar2 == null || fVar2.f20993e == -1) && i2 != -1) {
                    c(i2);
                } else {
                    e(i2);
                }
                if (i2 != -1) {
                    setSelectedTabView(i2);
                }
            }
            if (fVar2 != null) {
                f();
            }
            this.w = fVar;
            if (fVar != null) {
                b(fVar);
            }
        } else if (fVar2 != null) {
            g();
            e(fVar.f20993e);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2) {
        for (int i2 = 0; i2 < this.f20953b.getChildCount(); i2++) {
            View childAt = this.f20953b.getChildAt(i2);
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
            Covode.recordClassIndex(12399);
        }

        public final void onChanged() {
            LiveTabLayout.this.a();
        }

        public final void onInvalidated() {
            LiveTabLayout.this.a();
        }

        d() {
        }
    }

    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public Object f20989a;

        /* renamed from: b  reason: collision with root package name */
        public Drawable f20990b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f20991c;

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f20992d;

        /* renamed from: e  reason: collision with root package name */
        public int f20993e = -1;

        /* renamed from: f  reason: collision with root package name */
        public View f20994f;

        /* renamed from: g  reason: collision with root package name */
        int f20995g = -1;

        /* renamed from: h  reason: collision with root package name */
        LiveTabLayout f20996h;

        /* renamed from: i  reason: collision with root package name */
        public h f20997i;

        static {
            Covode.recordClassIndex(12403);
        }

        /* access modifiers changed from: package-private */
        public final void c() {
            h hVar = this.f20997i;
            if (hVar != null) {
                hVar.a();
            }
        }

        f() {
        }

        public final void a() {
            LiveTabLayout liveTabLayout = this.f20996h;
            if (liveTabLayout != null) {
                liveTabLayout.a(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public final boolean b() {
            LiveTabLayout liveTabLayout = this.f20996h;
            if (liveTabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            } else if (liveTabLayout.getSelectedTabPosition() == this.f20993e) {
                return true;
            } else {
                return false;
            }
        }

        private f a(View view) {
            this.f20994f = view;
            c();
            return this;
        }

        public final f a(CharSequence charSequence) {
            this.f20991c = charSequence;
            c();
            return this;
        }

        public final f a(int i2) {
            if (this.f20995g == i2 && this.f20994f != null) {
                return this;
            }
            this.f20995g = i2;
            return a(com.a.a(LayoutInflater.from(this.f20997i.getContext()), i2, this.f20997i, false));
        }
    }

    public static class g implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<LiveTabLayout> f20998a;

        /* renamed from: b  reason: collision with root package name */
        private int f20999b;

        /* renamed from: c  reason: collision with root package name */
        private int f21000c;

        /* renamed from: d  reason: collision with root package name */
        private int f21001d;

        /* renamed from: e  reason: collision with root package name */
        private int f21002e;

        /* renamed from: f  reason: collision with root package name */
        private ArgbEvaluator f21003f = new ArgbEvaluator();

        /* renamed from: g  reason: collision with root package name */
        private AccelerateInterpolator f21004g = new AccelerateInterpolator();

        /* renamed from: h  reason: collision with root package name */
        private DecelerateInterpolator f21005h = new DecelerateInterpolator(1.6f);

        static {
            Covode.recordClassIndex(12404);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            this.f20999b = 0;
            this.f21000c = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
            this.f20999b = this.f21000c;
            this.f21000c = i2;
        }

        public g(LiveTabLayout liveTabLayout) {
            this.f20998a = new WeakReference<>(liveTabLayout);
            this.f21002e = liveTabLayout.getTabTextColors().getColorForState(LiveTabLayout.SELECTED_STATE_SET, 0);
            this.f21001d = liveTabLayout.getTabTextColors().getDefaultColor();
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            boolean z;
            LiveTabLayout liveTabLayout = this.f20998a.get();
            if (liveTabLayout != null && liveTabLayout.getSelectedTabPosition() != i2 && i2 < liveTabLayout.getTabCount()) {
                int i3 = this.f21000c;
                if (i3 == 0 || (i3 == 2 && this.f20999b == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                liveTabLayout.a(liveTabLayout.a(i2), z);
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
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.rank.impl.ui.tablayout.LiveTabLayout.g.onPageScrolled(int, float, int):void");
        }
    }

    public int getTabCount() {
        return this.v.size();
    }

    public int getTabStripLeftPadding() {
        return this.f20953b.getPaddingLeft();
    }

    public int getTabStripRightPadding() {
        return this.f20953b.getPaddingRight();
    }

    private float getScrollPosition() {
        e eVar = this.f20953b;
        return ((float) eVar.f20969a) + eVar.f20970b;
    }

    private int getTabMinWidth() {
        int i2 = this.y;
        if (i2 != -1) {
            return i2;
        }
        if (this.n == 0) {
            return this.A;
        }
        return 0;
    }

    public int getSelectedTabPosition() {
        f fVar = this.w;
        if (fVar != null) {
            return fVar.f20993e;
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

    private void f() {
        for (int size = this.D.size() - 1; size >= 0; size--) {
            this.D.get(size);
        }
    }

    private void g() {
        for (int size = this.D.size() - 1; size >= 0; size--) {
            this.D.get(size);
        }
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f20953b.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.q == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                a((ViewPager) parent, true);
            }
        }
    }

    static {
        Covode.recordClassIndex(12394);
    }

    private void e() {
        if (this.F == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.F = valueAnimator;
            valueAnimator.setInterpolator(f20952a);
            this.F.setDuration(200L);
            this.F.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.bytedance.android.livesdk.rank.impl.ui.tablayout.LiveTabLayout.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(12395);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LiveTabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    private int getDefaultHeight() {
        int size = this.v.size();
        for (int i2 = 0; i2 < size; i2++) {
            f fVar = this.v.get(i2);
            if (!(fVar == null || fVar.f20990b == null || TextUtils.isEmpty(fVar.f20991c))) {
                return 72;
            }
        }
        return 48;
    }

    private void h() {
        int i2;
        if (this.n == 0) {
            i2 = Math.max(0, this.B - this.f20954c);
        } else {
            i2 = 0;
        }
        v.a(this.f20953b, i2, 0, 0, 0);
        int i3 = this.n;
        if (i3 == 0) {
            this.f20953b.setGravity(8388611);
        } else if (i3 == 1) {
            this.f20953b.setGravity(1);
        }
        a(true);
    }

    public class e extends LinearLayout {

        /* renamed from: a  reason: collision with root package name */
        int f20969a = -1;

        /* renamed from: b  reason: collision with root package name */
        float f20970b;

        /* renamed from: c  reason: collision with root package name */
        public float f20971c;

        /* renamed from: d  reason: collision with root package name */
        public float f20972d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f20973e;

        /* renamed from: f  reason: collision with root package name */
        int f20974f;

        /* renamed from: h  reason: collision with root package name */
        private int f20976h;

        /* renamed from: i  reason: collision with root package name */
        private final Paint f20977i;

        /* renamed from: j  reason: collision with root package name */
        private int f20978j = -1;

        /* renamed from: k  reason: collision with root package name */
        private int f20979k = -1;

        /* renamed from: l  reason: collision with root package name */
        private int f20980l = -1;

        /* renamed from: m  reason: collision with root package name */
        private ValueAnimator f20981m;
        private int n;
        private int o;

        static {
            Covode.recordClassIndex(12400);
        }

        private void a() {
            int i2;
            View childAt = getChildAt(this.f20969a);
            int i3 = -1;
            if (childAt == null || childAt.getWidth() <= 0) {
                i2 = -1;
            } else {
                i3 = childAt.getLeft();
                i2 = childAt.getRight();
                if (this.f20970b > 0.0f && this.f20969a < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f20969a + 1);
                    float f2 = this.f20970b;
                    i3 = (int) ((this.f20970b * ((float) childAt2.getLeft())) + ((1.0f - f2) * ((float) i3)));
                    i2 = (int) ((f2 * ((float) childAt2.getRight())) + ((1.0f - this.f20970b) * ((float) i2)));
                }
            }
            a(i3, i2);
        }

        /* access modifiers changed from: package-private */
        public final void b(int i2) {
            if (this.f20976h != i2) {
                this.f20976h = i2;
                v.c(this);
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2) {
            if (this.f20977i.getColor() != i2) {
                this.f20977i.setColor(i2);
                v.c(this);
            }
        }

        public final void onRtlPropertiesChanged(int i2) {
            super.onRtlPropertiesChanged(i2);
            if (Build.VERSION.SDK_INT < 23 && this.f20978j != i2) {
                requestLayout();
                this.f20978j = i2;
            }
        }

        public final void draw(Canvas canvas) {
            View findViewById;
            super.draw(canvas);
            int i2 = this.f20979k;
            if (i2 >= 0 && this.f20980l > i2) {
                View childAt = getChildAt(LiveTabLayout.this.getSelectedTabPosition());
                if (childAt == null || (findViewById = childAt.findViewById(R.id.c8v)) == null) {
                    canvas.drawRect((float) (this.f20979k + this.f20974f), (float) (getHeight() - this.f20976h), (float) (this.f20980l - this.f20974f), (float) getHeight(), this.f20977i);
                    return;
                }
                if (LiveTabLayout.this.q == null || !this.f20973e) {
                    int i3 = this.f20979k;
                    float width = (float) (i3 + (((this.f20980l - i3) - findViewById.getWidth()) / 2));
                    this.f20971c = width;
                    this.f20972d = width + ((float) findViewById.getWidth());
                }
                canvas.drawRect(this.f20971c + ((float) this.f20974f), (float) (getHeight() - this.f20976h), this.f20972d - ((float) this.f20974f), (float) getHeight(), this.f20977i);
            }
        }

        e(Context context) {
            super(context);
            MethodCollector.i(1337);
            this.n = LiveTabLayout.this.b(27);
            this.o = Integer.MAX_VALUE;
            setWillNotDraw(false);
            this.f20977i = new Paint();
            MethodCollector.o(1337);
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2, float f2) {
            ValueAnimator valueAnimator = this.f20981m;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f20981m.cancel();
            }
            this.f20969a = i2;
            this.f20970b = f2;
            a();
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2, int i3) {
            if (i2 != this.f20979k || i3 != this.f20980l) {
                this.f20979k = i2;
                this.f20980l = i3;
                v.c(this);
            }
        }

        /* access modifiers changed from: package-private */
        public final void b(final int i2, int i3) {
            boolean z;
            final int i4;
            final int i5;
            ValueAnimator valueAnimator = this.f20981m;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f20981m.cancel();
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
            if (Math.abs(i2 - this.f20969a) <= 1) {
                i4 = this.f20979k;
                i5 = this.f20980l;
            } else {
                int b2 = LiveTabLayout.this.b(24);
                if (i2 >= this.f20969a ? !z : z) {
                    i4 = left - b2;
                } else {
                    i4 = b2 + right;
                }
                i5 = i4;
            }
            if (i4 != left || i5 != right) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.f20981m = valueAnimator2;
                valueAnimator2.setInterpolator(LiveTabLayout.f20952a);
                valueAnimator2.setDuration((long) i3);
                valueAnimator2.setFloatValues(0.0f, 1.0f);
                valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.bytedance.android.livesdk.rank.impl.ui.tablayout.LiveTabLayout.e.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(12401);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        e.this.a(e.a(i4, left, animatedFraction), e.a(i5, right, animatedFraction));
                    }
                });
                valueAnimator2.addListener(new AnimatorListenerAdapter() {
                    /* class com.bytedance.android.livesdk.rank.impl.ui.tablayout.LiveTabLayout.e.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(12402);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        e.this.f20969a = i2;
                        e.this.f20970b = 0.0f;
                    }
                });
                valueAnimator2.start();
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
            if (r5 != false) goto L_0x0090;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onMeasure(int r10, int r11) {
            /*
            // Method dump skipped, instructions count: 324
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.rank.impl.ui.tablayout.LiveTabLayout.e.onMeasure(int, int):void");
        }

        static int a(int i2, int i3, float f2) {
            return i2 + Math.round(f2 * ((float) (i3 - i2)));
        }

        /* access modifiers changed from: protected */
        public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            MethodCollector.i(1363);
            super.onLayout(z, i2, i3, i4, i5);
            ValueAnimator valueAnimator = this.f20981m;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                a();
                MethodCollector.o(1363);
                return;
            }
            this.f20981m.cancel();
            b(this.f20969a, Math.round((1.0f - this.f20981m.getAnimatedFraction()) * ((float) this.f20981m.getDuration())));
            MethodCollector.o(1363);
        }
    }

    private void c() {
        for (int childCount = this.f20953b.getChildCount() - 1; childCount >= 0; childCount--) {
            h hVar = (h) this.f20953b.getChildAt(childCount);
            this.f20953b.removeViewAt(childCount);
            if (hVar != null) {
                hVar.setTab(null);
                hVar.setSelected(false);
                this.M.release(hVar);
            }
            requestLayout();
        }
        Iterator<f> it = this.v.iterator();
        while (it.hasNext()) {
            f next = it.next();
            it.remove();
            next.f20996h = null;
            next.f20997i = null;
            next.f20989a = null;
            next.f20990b = null;
            next.f20991c = null;
            next.f20992d = null;
            next.f20993e = -1;
            next.f20994f = null;
            next.f20995g = -1;
            u.release(next);
        }
        this.w = null;
    }

    private h d() {
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
    public final void a() {
        int currentItem;
        c();
        PagerAdapter pagerAdapter = this.G;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                b(d(this.o).a(this.G.getPageTitle(i2)), false);
            }
            ViewPager viewPager = this.q;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                a(a(currentItem), true);
            }
        }
    }

    public void addView(View view) {
        a(view);
    }

    public void setAutoFillWhenScrollable(boolean z2) {
        this.p = z2;
    }

    public void setContentInsetStart(int i2) {
        this.B = i2;
    }

    public void setCustomTabViewResId(int i2) {
        this.o = i2;
    }

    public void setOnTabClickListener(b bVar) {
        this.s = bVar;
    }

    public void setTabBackgroundResId(int i2) {
        this.f20962k = i2;
    }

    public void setTabMaxWidth(int i2) {
        this.z = i2;
    }

    public void setTabMinWidth(int i2) {
        this.y = i2;
    }

    public void setTabPaddingBottom(int i2) {
        this.f20957f = i2;
    }

    public void setTabPaddingEnd(int i2) {
        this.f20956e = i2;
    }

    public void setTabPaddingStart(int i2) {
        this.f20954c = i2;
    }

    public void setTabPaddingTop(int i2) {
        this.f20955d = i2;
    }

    public void setTabTextAppearance(int i2) {
        this.f20958g = i2;
    }

    /* access modifiers changed from: package-private */
    public class a implements ViewPager.d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f20966a;

        static {
            Covode.recordClassIndex(12396);
        }

        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.d
        public final void a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            if (LiveTabLayout.this.q == viewPager) {
                LiveTabLayout.this.a(pagerAdapter2, this.f20966a);
            }
        }
    }

    public static class i implements c {

        /* renamed from: a  reason: collision with root package name */
        private final ViewPager f21014a;

        static {
            Covode.recordClassIndex(12406);
        }

        public i(ViewPager viewPager) {
            this.f21014a = viewPager;
        }

        @Override // com.bytedance.android.livesdk.rank.impl.ui.tablayout.LiveTabLayout.c
        public final void a(f fVar) {
            this.f21014a.setCurrentItem(fVar.f20993e);
        }
    }

    private void b(c cVar) {
        this.D.remove(cVar);
    }

    private void c(int i2) {
        a(i2, 0.0f, true, true);
    }

    /* access modifiers changed from: package-private */
    public final void a(f fVar) {
        a(fVar, true);
    }

    public void setSelectedTabHorizontalPadding(int i2) {
        this.f20953b.f20974f = i2;
    }

    public void setSelectedTabIndicatorColor(int i2) {
        this.f20953b.a(i2);
    }

    public void setSelectedTabIndicatorHeight(int i2) {
        this.f20953b.b(i2);
    }

    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        a(pagerAdapter, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        a(viewPager, false);
    }

    private void a(c cVar) {
        if (!this.D.contains(cVar)) {
            this.D.add(cVar);
        }
    }

    @Override // android.widget.FrameLayout, android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.C;
        if (cVar2 != null) {
            b(cVar2);
        }
        this.C = cVar;
        if (cVar != null) {
            a(cVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        e();
        this.F.addListener(animatorListener);
    }

    public void setTabGravity(int i2) {
        if (this.f20964m != i2) {
            this.f20964m = i2;
            h();
        }
    }

    public void setTabMode(int i2) {
        if (i2 != this.n) {
            this.n = i2;
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

    private void b(f fVar) {
        for (int size = this.D.size() - 1; size >= 0; size--) {
            this.D.get(size).a(fVar);
        }
    }

    private void setSelectedTabView(int i2) {
        boolean z2;
        int childCount = this.f20953b.getChildCount();
        if (i2 < childCount) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.f20953b.getChildAt(i3);
                if (i3 == i2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                childAt.setSelected(z2);
            }
        }
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f20959h != colorStateList) {
            this.f20959h = colorStateList;
            int size = this.v.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.v.get(i2).c();
            }
        }
    }

    private void a(LinearLayout.LayoutParams layoutParams) {
        if (this.n == 1 && this.f20964m == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        int i2 = this.x;
        if (i2 != 0) {
            layoutParams.leftMargin = i2;
            layoutParams.rightMargin = this.x;
        }
    }

    private f d(int i2) {
        f acquire = u.acquire();
        if (acquire == null) {
            acquire = new f();
        }
        acquire.f20996h = this;
        if (acquire.f20997i == null) {
            acquire.f20997i = d();
        }
        if (i2 > 0) {
            acquire.f20997i.a(acquire);
            acquire.a(i2);
        } else {
            acquire.f20997i.setTab(acquire);
        }
        return acquire;
    }

    public void setTabMargin(int i2) {
        this.x = b(i2);
        for (int i3 = 0; i3 < getTabCount(); i3++) {
            View childAt = this.f20953b.getChildAt(i3);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.leftMargin = b(i2);
            marginLayoutParams.rightMargin = b(i2);
            childAt.setLayoutParams(marginLayoutParams);
        }
    }

    public void setTabMode(String str) {
        str.hashCode();
        if (!str.equals("scrollable")) {
            if (str.equals("fixed") && this.n != 1) {
                this.n = 1;
                h();
            }
        } else if (this.n != 0) {
            this.n = 0;
            h();
        }
    }

    private void e(int i2) {
        if (i2 != -1) {
            if (getWindowToken() != null && v.v(this)) {
                e eVar = this.f20953b;
                int childCount = eVar.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    if (eVar.getChildAt(i3).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int a2 = a(i2, 0.0f);
                if (scrollX != a2) {
                    e();
                    this.F.setIntValues(scrollX, a2);
                    this.F.start();
                }
                this.f20953b.b(i2, 200);
                return;
            }
            c(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final int b(int i2) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i2));
    }

    private void a(a aVar) {
        f d2 = d(0);
        if (aVar.f21015a != null) {
            d2.a(aVar.f21015a);
        }
        if (aVar.f21016b != null) {
            d2.f20990b = aVar.f21016b;
            d2.c();
        }
        if (aVar.f21017c != 0) {
            d2.a(aVar.f21017c);
        }
        if (!TextUtils.isEmpty(aVar.getContentDescription())) {
            d2.f20992d = aVar.getContentDescription();
            d2.c();
        }
        b(d2, this.v.isEmpty());
    }

    public final f a(int i2) {
        if (i2 < 0 || i2 >= getTabCount()) {
            return null;
        }
        return this.v.get(i2);
    }

    public LiveTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2) {
        a(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    private void b(f fVar, boolean z2) {
        int size = this.v.size();
        if (fVar.f20996h == this) {
            a(fVar, size);
            h hVar = fVar.f20997i;
            e eVar = this.f20953b;
            int i2 = fVar.f20993e;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            a(layoutParams);
            eVar.addView(hVar, i2, layoutParams);
            if (z2) {
                fVar.a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    private int a(int i2, float f2) {
        View view;
        int i3;
        int i4 = 0;
        if (this.n != 0) {
            return 0;
        }
        View childAt = this.f20953b.getChildAt(i2);
        int i5 = i2 + 1;
        if (i5 < this.f20953b.getChildCount()) {
            view = this.f20953b.getChildAt(i5);
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
        int i6 = (int) (((float) (i3 + i4 + (this.x * 4))) * 0.5f * f2);
        if (v.e(this) == 0) {
            return left + i6;
        }
        return left - i6;
    }

    private void a(ViewPager viewPager, boolean z2) {
        ViewPager viewPager2 = this.q;
        if (viewPager2 != null) {
            g gVar = this.r;
            if (gVar != null) {
                viewPager2.removeOnPageChangeListener(gVar);
            }
            a aVar = this.I;
            if (aVar != null) {
                this.q.removeOnAdapterChangeListener(aVar);
            }
        }
        c cVar = this.E;
        if (cVar != null) {
            b(cVar);
            this.E = null;
        }
        if (viewPager != null) {
            this.q = viewPager;
            if (this.r == null) {
                this.r = new g(this);
            }
            this.r.a();
            viewPager.addOnPageChangeListener(this.r);
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
            this.I.f20966a = true;
            viewPager.addOnAdapterChangeListener(this.I);
            c(viewPager.getCurrentItem());
        } else {
            this.q = null;
            a((PagerAdapter) null, false);
        }
        this.J = z2;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(2371);
        int b2 = b(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i3);
        if (mode == Integer.MIN_VALUE) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(b2, View.MeasureSpec.getSize(i3)), 1073741824);
        } else if (mode == 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(b2, 1073741824);
        }
        int size = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) != 0) {
            int i4 = this.z;
            if (i4 <= 0) {
                i4 = size - b(56);
            }
            this.f20963l = i4;
        }
        super.onMeasure(i2, i3);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i5 = this.n;
            if (i5 == 0 ? childAt.getMeasuredWidth() < getMeasuredWidth() : !(i5 != 1 || childAt.getMeasuredWidth() == getMeasuredWidth())) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
            }
        }
        MethodCollector.o(2371);
    }

    private void a(f fVar, int i2) {
        fVar.f20993e = i2;
        this.v.add(i2, fVar);
        int size = this.v.size();
        while (true) {
            i2++;
            if (i2 < size) {
                this.v.get(i2).f20993e = i2;
            } else {
                return;
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    private LiveTabLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(2306);
        this.v = new ArrayList<>();
        this.f20963l = Integer.MAX_VALUE;
        this.D = new ArrayList<>();
        this.M = new f.b(12);
        setHorizontalScrollBarEnabled(false);
        e eVar = new e(context);
        this.f20953b = eVar;
        super.addView(eVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ag_, R.attr.aga, R.attr.agb, R.attr.agc, R.attr.agd, R.attr.age, R.attr.agf, R.attr.agg, R.attr.agh, R.attr.agi, R.attr.agj, R.attr.agl, R.attr.agm, R.attr.agn, R.attr.ago, R.attr.agp, R.attr.agq, R.attr.agr, R.attr.ags, R.attr.agt, R.attr.agu, R.attr.agv, R.attr.agx, R.attr.agy, R.attr.agz}, 0, R.style.r4);
        eVar.b(obtainStyledAttributes.getDimensionPixelSize(10, 0));
        eVar.a(obtainStyledAttributes.getColor(7, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(15, 0);
        this.f20954c = dimensionPixelSize;
        this.f20955d = dimensionPixelSize;
        this.f20956e = dimensionPixelSize;
        this.f20957f = dimensionPixelSize;
        this.f20954c = obtainStyledAttributes.getDimensionPixelSize(18, dimensionPixelSize);
        this.f20955d = obtainStyledAttributes.getDimensionPixelSize(19, this.f20955d);
        this.f20956e = obtainStyledAttributes.getDimensionPixelSize(17, this.f20956e);
        this.f20957f = obtainStyledAttributes.getDimensionPixelSize(16, this.f20957f);
        int resourceId = obtainStyledAttributes.getResourceId(22, R.style.ji);
        this.f20958g = resourceId;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.ui, R.attr.ahm});
        try {
            this.f20960i = (float) obtainStyledAttributes2.getDimensionPixelSize(0, 0);
            this.f20959h = obtainStyledAttributes2.getColorStateList(3);
            obtainStyledAttributes2.recycle();
            if (obtainStyledAttributes.hasValue(23)) {
                this.f20959h = obtainStyledAttributes.getColorStateList(23);
            }
            if (obtainStyledAttributes.hasValue(21)) {
                int color = obtainStyledAttributes.getColor(21, 0);
                int defaultColor = this.f20959h.getDefaultColor();
                this.f20959h = new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{color, defaultColor});
            }
            this.y = obtainStyledAttributes.getDimensionPixelSize(13, -1);
            this.z = obtainStyledAttributes.getDimensionPixelSize(12, -1);
            this.f20962k = obtainStyledAttributes.getResourceId(0, 0);
            this.B = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.n = obtainStyledAttributes.getInt(14, 1);
            this.f20964m = obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.recycle();
            Resources resources = getResources();
            this.f20961j = (float) resources.getDimensionPixelSize(R.dimen.ib);
            this.A = resources.getDimensionPixelSize(R.dimen.i_);
            this.K = n.b(getContext(), 1.5f);
            this.L = n.b(getContext(), 1.5f);
            this.t = getResources().getConfiguration().orientation;
            h();
            MethodCollector.o(2306);
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            MethodCollector.o(2306);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public boolean overScrollBy(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z2) {
        return super.overScrollBy(i2, i3, i4, i5, i6, i7, 80, i9, z2);
    }
}
