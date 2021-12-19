package com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout;

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
import android.graphics.RectF;
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
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.core.g.f;
import androidx.core.h.s;
import androidx.core.h.v;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.tools.utils.r;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@ViewPager.a
public class TabLayout extends HorizontalScrollView {
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
    private boolean M;
    private int N;
    private boolean O;
    private final f.a<i> P;

    /* renamed from: a  reason: collision with root package name */
    public e f130709a;

    /* renamed from: b  reason: collision with root package name */
    int f130710b;

    /* renamed from: c  reason: collision with root package name */
    int f130711c;

    /* renamed from: d  reason: collision with root package name */
    int f130712d;

    /* renamed from: e  reason: collision with root package name */
    int f130713e;

    /* renamed from: f  reason: collision with root package name */
    int f130714f;

    /* renamed from: g  reason: collision with root package name */
    ColorStateList f130715g;

    /* renamed from: h  reason: collision with root package name */
    float f130716h;

    /* renamed from: i  reason: collision with root package name */
    float f130717i;

    /* renamed from: j  reason: collision with root package name */
    final int f130718j;

    /* renamed from: k  reason: collision with root package name */
    int f130719k;

    /* renamed from: l  reason: collision with root package name */
    int f130720l;

    /* renamed from: m  reason: collision with root package name */
    int f130721m;
    boolean n;
    ViewPager o;
    g p;
    public boolean q;
    public boolean r;
    public b s;
    public int t;
    private final ArrayList<f> v;
    private f w;
    private int x;
    private final int y;
    private final int z;

    public interface b {
        static {
            Covode.recordClassIndex(85695);
        }

        void a(f fVar);
    }

    public interface c {
        static {
            Covode.recordClassIndex(85696);
        }

        void a(f fVar);

        void b(f fVar);

        void c(f fVar);
    }

    public class i extends LinearLayout {

        /* renamed from: b  reason: collision with root package name */
        private f f130774b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f130775c;

        /* renamed from: d  reason: collision with root package name */
        private ImageView f130776d;

        /* renamed from: e  reason: collision with root package name */
        private View f130777e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f130778f;

        /* renamed from: g  reason: collision with root package name */
        private ImageView f130779g;

        /* renamed from: h  reason: collision with root package name */
        private int f130780h = 2;

        static {
            Covode.recordClassIndex(85705);
        }

        public final f getTab() {
            return this.f130774b;
        }

        public final TextView getTextView() {
            return this.f130775c;
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            setTab(null);
            setSelected(false);
        }

        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f130774b == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            if (TabLayout.this.s != null) {
                TabLayout.this.s.a(this.f130774b);
            } else {
                this.f130774b.a();
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            boolean z;
            View view;
            MethodCollector.i(4315);
            f fVar = this.f130774b;
            if (fVar == null || (view = fVar.f130751f) == null) {
                View view2 = this.f130777e;
                if (view2 != null) {
                    removeView(view2);
                    this.f130777e = null;
                }
                this.f130778f = null;
                this.f130779g = null;
            } else {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f130777e = view;
                TextView textView = this.f130775c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f130776d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f130776d.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.f130778f = textView2;
                if (textView2 != null) {
                    this.f130780h = androidx.core.widget.h.a(textView2);
                }
                this.f130779g = (ImageView) view.findViewById(16908294);
            }
            if (fVar == null || !fVar.b()) {
                z = false;
            } else {
                z = true;
            }
            setSelected(z);
            MethodCollector.o(4315);
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
            if (fVar != this.f130774b) {
                this.f130774b = fVar;
                b();
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
            TextView textView = this.f130775c;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f130776d;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f130777e;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public i(Context context) {
            super(context);
            MethodCollector.i(4146);
            if (TabLayout.this.f130718j != 0) {
                v.a(this, androidx.appcompat.a.a.a.b(context, TabLayout.this.f130718j));
            }
            v.a(this, TabLayout.this.f130710b, TabLayout.this.f130711c, TabLayout.this.f130712d, TabLayout.this.f130713e);
            setGravity(17);
            setOrientation(1);
            setClickable(true);
            v.a(this, s.a(getContext()));
            MethodCollector.o(4146);
        }

        public final void onMeasure(int i2, int i3) {
            Layout layout;
            MethodCollector.i(4294);
            int size = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i2 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f130719k, Integer.MIN_VALUE);
            }
            super.onMeasure(i2, i3);
            if (this.f130775c != null) {
                getResources();
                float f2 = TabLayout.this.f130716h;
                int i4 = this.f130780h;
                ImageView imageView = this.f130776d;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f130775c;
                    if (textView != null && textView.getLineCount() > 1) {
                        f2 = TabLayout.this.f130717i;
                    }
                } else {
                    i4 = 1;
                }
                float textSize = this.f130775c.getTextSize();
                int lineCount = this.f130775c.getLineCount();
                int a2 = androidx.core.widget.h.a(this.f130775c);
                if ((f2 != textSize || (a2 >= 0 && i4 != a2)) && (TabLayout.this.f130721m != 1 || f2 <= textSize || lineCount != 1 || ((layout = this.f130775c.getLayout()) != null && layout.getLineWidth(0) * (f2 / layout.getPaint().getTextSize()) <= ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))))) {
                    this.f130775c.setTextSize(0, f2);
                    this.f130775c.setMaxLines(i4);
                    super.onMeasure(i2, i3);
                }
            }
            MethodCollector.o(4294);
        }
    }

    public f getCurSelectedTab() {
        return this.w;
    }

    public int getTabGravity() {
        return this.f130720l;
    }

    /* access modifiers changed from: package-private */
    public int getTabMaxWidth() {
        return this.f130719k;
    }

    public int getTabMode() {
        return this.f130721m;
    }

    public ColorStateList getTabTextColors() {
        return this.f130715g;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, float f2, boolean z2, boolean z3) {
        int round = Math.round(((float) i2) + f2);
        if (round >= 0 && round < this.f130709a.getChildCount()) {
            if (z3) {
                this.f130709a.a(i2, f2);
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
        a(fVar, this.v.isEmpty());
    }

    public final void a(f fVar, boolean z2) {
        a(fVar, this.v.size(), z2);
    }

    public final f a(int i2) {
        if (i2 < 0 || i2 >= getTabCount()) {
            return null;
        }
        return this.v.get(i2);
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
        c();
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2) {
        for (int i2 = 0; i2 < this.f130709a.getChildCount(); i2++) {
            View childAt = this.f130709a.getChildAt(i2);
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
            Covode.recordClassIndex(85697);
        }

        public final void onChanged() {
            TabLayout.this.c();
        }

        public final void onInvalidated() {
            TabLayout.this.c();
        }

        d() {
        }
    }

    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public Object f130746a;

        /* renamed from: b  reason: collision with root package name */
        public Drawable f130747b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f130748c;

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f130749d;

        /* renamed from: e  reason: collision with root package name */
        public int f130750e = -1;

        /* renamed from: f  reason: collision with root package name */
        public View f130751f;

        /* renamed from: g  reason: collision with root package name */
        TabLayout f130752g;

        /* renamed from: h  reason: collision with root package name */
        public i f130753h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f130754i = true;

        static {
            Covode.recordClassIndex(85701);
        }

        public final f c() {
            this.f130754i = false;
            return this;
        }

        /* access modifiers changed from: package-private */
        public final void d() {
            i iVar = this.f130753h;
            if (iVar != null) {
                iVar.b();
            }
        }

        f() {
        }

        public final void a() {
            TabLayout tabLayout = this.f130752g;
            if (tabLayout != null) {
                tabLayout.b(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* access modifiers changed from: package-private */
        public final void e() {
            this.f130752g = null;
            this.f130753h = null;
            this.f130746a = null;
            this.f130747b = null;
            this.f130748c = null;
            this.f130749d = null;
            this.f130750e = -1;
            this.f130751f = null;
        }

        public final boolean b() {
            TabLayout tabLayout = this.f130752g;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            } else if ((this.f130754i || this.f130750e != -1) && tabLayout.getSelectedTabPosition() == this.f130750e) {
                return true;
            } else {
                return false;
            }
        }

        public final f a(View view) {
            this.f130751f = view;
            d();
            return this;
        }

        public final f a(CharSequence charSequence) {
            this.f130748c = charSequence;
            d();
            return this;
        }
    }

    public static class g implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<TabLayout> f130755a;

        /* renamed from: b  reason: collision with root package name */
        private int f130756b;

        /* renamed from: c  reason: collision with root package name */
        private int f130757c;

        /* renamed from: d  reason: collision with root package name */
        private int f130758d;

        /* renamed from: e  reason: collision with root package name */
        private int f130759e;

        /* renamed from: f  reason: collision with root package name */
        private ArgbEvaluator f130760f = new ArgbEvaluator();

        /* renamed from: g  reason: collision with root package name */
        private AccelerateInterpolator f130761g = new AccelerateInterpolator();

        /* renamed from: h  reason: collision with root package name */
        private DecelerateInterpolator f130762h = new DecelerateInterpolator(1.6f);

        static {
            Covode.recordClassIndex(85702);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            this.f130757c = 0;
            this.f130756b = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
            this.f130756b = this.f130757c;
            this.f130757c = i2;
        }

        public g(TabLayout tabLayout) {
            this.f130755a = new WeakReference<>(tabLayout);
            this.f130759e = tabLayout.getTabTextColors().getColorForState(TabLayout.SELECTED_STATE_SET, 0);
            this.f130758d = tabLayout.getTabTextColors().getDefaultColor();
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            boolean z;
            TabLayout tabLayout = this.f130755a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i2 && i2 < tabLayout.getTabCount()) {
                int i3 = this.f130757c;
                if (i3 == 0 || (i3 == 2 && this.f130756b == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                tabLayout.b(tabLayout.a(i2), z);
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.g.onPageScrolled(int, float, int):void");
        }
    }

    public int getTabCount() {
        return this.v.size();
    }

    static {
        Covode.recordClassIndex(85692);
    }

    private LinearLayout.LayoutParams f() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        a(layoutParams);
        return layoutParams;
    }

    private float getScrollPosition() {
        e eVar = this.f130709a;
        return ((float) eVar.f130726a) + eVar.f130727b;
    }

    private int getTabMinWidth() {
        int i2 = this.y;
        if (i2 != -1) {
            return i2;
        }
        if (this.f130721m == 0) {
            return this.A;
        }
        return 0;
    }

    public int getSelectedTabPosition() {
        f fVar = this.w;
        if (fVar != null) {
            return fVar.f130750e;
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

    private int getTabScrollRange() {
        return Math.max(0, ((this.f130709a.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public final void d() {
        if (this.w != null) {
            this.f130709a.a(-1, 0.0f);
            g(this.w);
            this.w = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.o == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                a((ViewPager) parent, true);
            }
        }
    }

    private void g() {
        if (this.F == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.F = valueAnimator;
            valueAnimator.setInterpolator(a.f130783b);
            this.F.setDuration(300L);
            this.F.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(85693);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    private int getDefaultHeight() {
        int size = this.v.size();
        for (int i2 = 0; i2 < size; i2++) {
            f fVar = this.v.get(i2);
            if (!(fVar == null || fVar.f130747b == null || TextUtils.isEmpty(fVar.f130748c))) {
                return 72;
            }
        }
        return 48;
    }

    private void h() {
        int i2;
        if (this.f130721m == 0) {
            i2 = Math.max(0, this.B - this.f130710b);
        } else {
            i2 = 0;
        }
        v.a(this.f130709a, i2, 0, 0, 0);
        int i3 = this.f130721m;
        if (i3 == 0) {
            this.f130709a.setGravity(8388611);
        } else if (i3 == 1) {
            this.f130709a.setGravity(1);
        }
        a(true);
    }

    /* access modifiers changed from: package-private */
    public class e extends LinearLayout {

        /* renamed from: a  reason: collision with root package name */
        int f130726a = -1;

        /* renamed from: b  reason: collision with root package name */
        float f130727b;

        /* renamed from: c  reason: collision with root package name */
        float f130728c;

        /* renamed from: d  reason: collision with root package name */
        float f130729d;

        /* renamed from: e  reason: collision with root package name */
        public float f130730e;

        /* renamed from: f  reason: collision with root package name */
        public float f130731f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f130732g;

        /* renamed from: i  reason: collision with root package name */
        private int f130734i;

        /* renamed from: j  reason: collision with root package name */
        private final Paint f130735j;

        /* renamed from: k  reason: collision with root package name */
        private int f130736k = -1;

        /* renamed from: l  reason: collision with root package name */
        private int f130737l = -1;

        /* renamed from: m  reason: collision with root package name */
        private int f130738m = -1;
        private ValueAnimator n;
        private int o;
        private int p;

        static {
            Covode.recordClassIndex(85698);
        }

        private void a() {
            int i2;
            int i3;
            View childAt = getChildAt(this.f130726a);
            if (childAt == null || childAt.getWidth() <= 0) {
                i2 = -1;
                i3 = -1;
            } else {
                i2 = childAt.getLeft();
                i3 = childAt.getRight();
                if (this.f130727b > 0.0f && this.f130726a < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f130726a + 1);
                    float f2 = this.f130727b;
                    i2 = (int) ((this.f130727b * ((float) childAt2.getLeft())) + ((1.0f - f2) * ((float) i2)));
                    i3 = (int) ((f2 * ((float) childAt2.getRight())) + ((1.0f - this.f130727b) * ((float) i3)));
                }
            }
            a(i2, i3);
        }

        /* access modifiers changed from: package-private */
        public final void b(int i2) {
            if (this.f130734i != i2) {
                this.f130734i = i2;
                v.c(this);
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2) {
            if (this.f130735j.getColor() != i2) {
                this.f130735j.setColor(i2);
                v.c(this);
            }
        }

        public final void onRtlPropertiesChanged(int i2) {
            super.onRtlPropertiesChanged(i2);
            if (Build.VERSION.SDK_INT < 23 && this.f130736k != i2) {
                requestLayout();
                this.f130736k = i2;
            }
        }

        public final void draw(Canvas canvas) {
            View childAt;
            View findViewById;
            super.draw(canvas);
            int i2 = this.f130737l;
            if (i2 >= 0 && this.f130738m > i2 && !TabLayout.this.q) {
                if (!TabLayout.this.r || (childAt = getChildAt(TabLayout.this.getSelectedTabPosition())) == null || (findViewById = childAt.findViewById(R.id.c8v)) == null) {
                    canvas.drawRoundRect(new RectF((float) this.f130737l, (float) (getHeight() - this.f130734i), (float) this.f130738m, (float) getHeight()), this.f130728c, this.f130729d, this.f130735j);
                    return;
                }
                if (TabLayout.this.o == null || !this.f130732g) {
                    int i3 = this.f130737l;
                    float width = (float) (i3 + (((this.f130738m - i3) - findViewById.getWidth()) / 2));
                    this.f130730e = width;
                    this.f130731f = width + ((float) findViewById.getWidth());
                }
                canvas.drawRoundRect(new RectF(this.f130730e, (float) (getHeight() - this.f130734i), this.f130731f, (float) getHeight()), this.f130728c, this.f130729d, this.f130735j);
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2, int i3) {
            if (i2 != this.f130737l || i3 != this.f130738m) {
                this.f130737l = i2;
                this.f130738m = i3;
                v.c(this);
            }
        }

        e(Context context) {
            super(context);
            MethodCollector.i(7520);
            this.o = TabLayout.this.b(27);
            this.p = Integer.MAX_VALUE;
            setWillNotDraw(false);
            this.f130735j = new Paint();
            MethodCollector.o(7520);
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2, float f2) {
            ValueAnimator valueAnimator = this.n;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.n.cancel();
            }
            this.f130726a = i2;
            this.f130727b = f2;
            a();
        }

        /* access modifiers changed from: package-private */
        public final void b(final int i2, int i3) {
            boolean z;
            final int i4;
            final int i5;
            ValueAnimator valueAnimator = this.n;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.n.cancel();
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
            if (Math.abs(i2 - this.f130726a) <= 1) {
                i4 = this.f130737l;
                i5 = this.f130738m;
            } else {
                int b2 = TabLayout.this.b(24);
                if (i2 >= this.f130726a ? !z : z) {
                    i4 = left - b2;
                } else {
                    i4 = b2 + right;
                }
                i5 = i4;
            }
            if (i4 != left || i5 != right) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.n = valueAnimator2;
                valueAnimator2.setInterpolator(a.f130783b);
                valueAnimator2.setDuration((long) i3);
                valueAnimator2.setFloatValues(0.0f, 1.0f);
                valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.e.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(85699);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        e.this.a(a.a(i4, left, animatedFraction), a.a(i5, right, animatedFraction));
                    }
                });
                valueAnimator2.addListener(new AnimatorListenerAdapter() {
                    /* class com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.e.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(85700);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        e.this.f130726a = i2;
                        e.this.f130727b = 0.0f;
                    }
                });
                valueAnimator2.start();
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
            if (r2 != false) goto L_0x0090;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onMeasure(int r11, int r12) {
            /*
            // Method dump skipped, instructions count: 340
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.e.onMeasure(int, int):void");
        }

        /* access modifiers changed from: protected */
        public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            MethodCollector.i(7609);
            super.onLayout(z, i2, i3, i4, i5);
            ValueAnimator valueAnimator = this.n;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                a();
                MethodCollector.o(7609);
                return;
            }
            this.n.cancel();
            b(this.f130726a, Math.round((1.0f - this.n.getAnimatedFraction()) * ((float) this.n.getDuration())));
            MethodCollector.o(7609);
        }
    }

    public final void b() {
        for (int childCount = this.f130709a.getChildCount() - 1; childCount >= 0; childCount--) {
            f(childCount);
        }
        Iterator<f> it = this.v.iterator();
        while (it.hasNext()) {
            f next = it.next();
            it.remove();
            next.e();
            u.release(next);
        }
        this.w = null;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        int currentItem;
        if (this.O) {
            b();
            PagerAdapter pagerAdapter = this.G;
            if (pagerAdapter != null) {
                int count = pagerAdapter.getCount();
                e(count);
                for (int i2 = 0; i2 < count; i2++) {
                    a(a().a(this.G.getPageTitle(i2)), false);
                }
                ViewPager viewPager = this.o;
                if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                    b(a(currentItem), true);
                }
            }
        }
    }

    public final f a() {
        f acquire = u.acquire();
        if (acquire == null) {
            acquire = new f();
        }
        acquire.f130752g = this;
        acquire.f130753h = d(acquire);
        return acquire;
    }

    public void addView(View view) {
        a(view);
    }

    public void setAutoFillWhenScrollable(boolean z2) {
        this.n = z2;
    }

    public void setDefaultAddTab(boolean z2) {
        this.O = z2;
    }

    public void setHideIndicatorView(boolean z2) {
        this.q = z2;
    }

    public void setOnTabClickListener(b bVar) {
        this.s = bVar;
    }

    public void setSupportCustomIndicator(boolean z2) {
        this.r = z2;
    }

    /* access modifiers changed from: package-private */
    public class a implements ViewPager.d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f130723a;

        static {
            Covode.recordClassIndex(85694);
        }

        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.d
        public final void a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            if (TabLayout.this.o == viewPager) {
                TabLayout.this.a(pagerAdapter2, this.f130723a);
            }
        }
    }

    public static class h implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        final boolean f130763a;

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference<TabLayout> f130764b;

        /* renamed from: c  reason: collision with root package name */
        private int f130765c;

        /* renamed from: d  reason: collision with root package name */
        private int f130766d;

        /* renamed from: e  reason: collision with root package name */
        private int f130767e;

        static {
            Covode.recordClassIndex(85703);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
            this.f130765c = this.f130766d;
            this.f130766d = i2;
        }

        public h(TabLayout tabLayout) {
            this.f130764b = new WeakReference<>(tabLayout);
            this.f130763a = v.e(tabLayout) != 1 ? false : true;
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            boolean z;
            TabLayout tabLayout = this.f130764b.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i2 && i2 < tabLayout.getTabCount()) {
                int i3 = this.f130766d;
                if (i3 == 0 || (i3 == 2 && this.f130765c == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                tabLayout.b(tabLayout.a(i2), z);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
            if (r3 == 2) goto L_0x001e;
         */
        @Override // androidx.viewpager.widget.ViewPager.e
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onPageScrolled(final int r9, float r10, int r11) {
            /*
                r8 = this;
                java.lang.ref.WeakReference<com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout> r0 = r8.f130764b
                java.lang.Object r5 = r0.get()
                com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout r5 = (com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout) r5
                int r0 = r8.f130767e
                r4 = r9
                if (r0 != r4) goto L_0x000e
                return
            L_0x000e:
                if (r5 == 0) goto L_0x004f
                int r3 = r8.f130766d
                r0 = 0
                r2 = 1
                r1 = 2
                if (r3 != r1) goto L_0x001b
                int r0 = r8.f130765c
                if (r0 != r2) goto L_0x0052
            L_0x001b:
                r6 = 1
                if (r3 != r1) goto L_0x0022
            L_0x001e:
                int r0 = r8.f130765c
                if (r0 == 0) goto L_0x0050
            L_0x0022:
                r7 = 1
            L_0x0023:
                float[] r0 = new float[r1]
                r0 = {x0054: FILL_ARRAY_DATA  , data: [0, 1065353216} // fill-array
                android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r0)
                r0 = 200(0xc8, double:9.9E-322)
                android.animation.ValueAnimator r0 = r2.setDuration(r0)
                int r3 = r8.f130767e
                com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.c r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.c
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6, r7)
                r0.addUpdateListener(r1)
                r8.f130767e = r4
                com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$h$1 r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$h$1
                r2 = r2
                r3 = r5
                r4 = r4
                r5 = r6
                r6 = r7
                r1.<init>(r3, r4, r5, r6)
                r0.addListener(r1)
                r0.start()
            L_0x004f:
                return
            L_0x0050:
                r7 = 0
                goto L_0x0023
            L_0x0052:
                r6 = 0
                goto L_0x001e
                fill-array 0x0054: FILL_ARRAY_DATA  , data: [0, 1065353216]
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.h.onPageScrolled(int, float, int):void");
        }
    }

    public static class j implements c {

        /* renamed from: a  reason: collision with root package name */
        private final ViewPager f130781a;

        static {
            Covode.recordClassIndex(85706);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.c
        public final void b(f fVar) {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.c
        public final void c(f fVar) {
        }

        public j(ViewPager viewPager) {
            this.f130781a = viewPager;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.c
        public final void a(f fVar) {
            this.f130781a.setCurrentItem(fVar.f130750e);
        }
    }

    private void b(c cVar) {
        this.D.remove(cVar);
    }

    private void d(int i2) {
        a(i2, 0.0f, true, true);
    }

    public final View c(int i2) {
        return this.f130709a.getChildAt(i2);
    }

    public void setSelectedTabIndicatorColor(int i2) {
        this.f130709a.a(i2);
    }

    public void setSelectedTabIndicatorHeight(int i2) {
        this.f130709a.b(i2);
    }

    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        a(pagerAdapter, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        a(viewPager, false);
    }

    private void e(f fVar) {
        this.f130709a.addView(fVar.f130753h, fVar.f130750e, f());
    }

    public void a(c cVar) {
        if (!this.D.contains(cVar)) {
            this.D.add(cVar);
        }
    }

    public final void b(f fVar) {
        b(fVar, true);
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
        g();
        this.F.addListener(animatorListener);
    }

    public void setTabGravity(int i2) {
        if (this.f130720l != i2) {
            this.f130720l = i2;
            h();
        }
    }

    public void setTabMode(int i2) {
        if (i2 != this.f130721m) {
            this.f130721m = i2;
            h();
        }
    }

    public void setTabStripLeftMargin(int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f130709a.getLayoutParams();
        layoutParams.leftMargin = i2;
        this.f130709a.setLayoutParams(layoutParams);
    }

    private void a(View view) {
        if (view instanceof b) {
            a((b) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void e(int i2) {
        if (!this.M) {
            return;
        }
        if (i2 > this.N) {
            setTabMode(0);
        } else {
            setTabMode(1);
        }
    }

    private void f(int i2) {
        i iVar = (i) this.f130709a.getChildAt(i2);
        this.f130709a.removeViewAt(i2);
        if (iVar != null) {
            iVar.a();
            this.P.release(iVar);
        }
        requestLayout();
    }

    private void g(f fVar) {
        for (int size = this.D.size() - 1; size >= 0; size--) {
            this.D.get(size).b(fVar);
        }
    }

    private void h(f fVar) {
        for (int size = this.D.size() - 1; size >= 0; size--) {
            this.D.get(size).c(fVar);
        }
    }

    private void setSelectedTabView(int i2) {
        boolean z2;
        int childCount = this.f130709a.getChildCount();
        if (i2 < childCount) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.f130709a.getChildAt(i3);
                if (i3 == i2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                childAt.setSelected(z2);
            }
        }
    }

    public void setSelectedTabIndicatorCornerRadius(float f2) {
        e eVar = this.f130709a;
        if (f2 >= 0.0f && f2 >= 0.0f) {
            if (eVar.f130728c != f2 || eVar.f130729d != f2) {
                eVar.f130728c = f2;
                eVar.f130729d = f2;
                v.c(eVar);
            }
        }
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f130715g != colorStateList) {
            this.f130715g = colorStateList;
            int size = this.v.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.v.get(i2).d();
            }
        }
    }

    private void a(LinearLayout.LayoutParams layoutParams) {
        if (this.f130721m == 1 && this.f130720l == 0) {
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

    private i d(f fVar) {
        i iVar;
        f.a<i> aVar = this.P;
        if (aVar == null || (iVar = aVar.acquire()) == null) {
            iVar = new i(getContext());
        }
        iVar.setTab(fVar);
        iVar.setFocusable(true);
        iVar.setMinimumWidth(getTabMinWidth());
        return iVar;
    }

    private void f(f fVar) {
        for (int size = this.D.size() - 1; size >= 0; size--) {
            this.D.get(size).a(fVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final int b(int i2) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i2));
    }

    public final void c(f fVar) {
        int i2;
        f fVar2 = this.w;
        if (fVar2 != fVar) {
            if (fVar != null) {
                i2 = fVar.f130750e;
            } else {
                i2 = -1;
            }
            if ((fVar2 == null || fVar2.f130750e == -1) && i2 != -1) {
                d(i2);
            } else {
                g(i2);
            }
            if (i2 != -1) {
                setSelectedTabView(i2);
            }
            if (fVar2 != null) {
                g(fVar2);
            }
            this.w = fVar;
            if (fVar != null) {
                f(fVar);
            }
        } else if (fVar2 != null) {
            h(fVar);
            smoothScrollTo(a(fVar.f130750e, 0.0f), 0);
        }
    }

    public void setTabMargin(int i2) {
        this.x = b(i2);
        for (int i3 = 0; i3 < getTabCount(); i3++) {
            View childAt = this.f130709a.getChildAt(i3);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.leftMargin = b(i2);
            marginLayoutParams.rightMargin = b(i2);
            childAt.setLayoutParams(marginLayoutParams);
            childAt.invalidate();
        }
    }

    private void g(int i2) {
        if (i2 != -1) {
            if (getWindowToken() != null && v.v(this)) {
                e eVar = this.f130709a;
                int childCount = eVar.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    if (eVar.getChildAt(i3).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int a2 = a(i2, 0.0f);
                if (scrollX != a2) {
                    g();
                    this.F.setIntValues(scrollX, a2);
                    this.F.start();
                }
                this.f130709a.b(i2, 300);
                return;
            }
            d(i2);
        }
    }

    private void a(b bVar) {
        f a2 = a();
        if (bVar.f130787a != null) {
            a2.a(bVar.f130787a);
        }
        if (bVar.f130788b != null) {
            a2.f130747b = bVar.f130788b;
            a2.d();
        }
        if (bVar.f130789c != 0) {
            a2.a(com.a.a(LayoutInflater.from(a2.f130753h.getContext()), bVar.f130789c, a2.f130753h, false));
        }
        if (!TextUtils.isEmpty(bVar.getContentDescription())) {
            a2.f130749d = bVar.getContentDescription();
            a2.d();
        }
        a(a2);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(int i2, int i3) {
        setTabTextColors(b(i2, i3));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2) {
        a(view);
    }

    private static ColorStateList b(int i2, int i3) {
        return new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i3, i2});
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    private int a(int i2, float f2) {
        View view;
        int i3;
        int i4 = 0;
        if (this.f130721m != 0) {
            return 0;
        }
        View childAt = this.f130709a.getChildAt(i2);
        int i5 = i2 + 1;
        if (i5 < this.f130709a.getChildCount()) {
            view = this.f130709a.getChildAt(i5);
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
        ViewPager viewPager2 = this.o;
        if (viewPager2 != null) {
            g gVar = this.p;
            if (gVar != null) {
                viewPager2.removeOnPageChangeListener(gVar);
            }
            a aVar = this.I;
            if (aVar != null) {
                this.o.removeOnAdapterChangeListener(aVar);
            }
        }
        c cVar = this.E;
        if (cVar != null) {
            b(cVar);
            this.E = null;
        }
        if (viewPager != null) {
            this.o = viewPager;
            if (this.p == null) {
                this.p = new g(this);
            }
            this.p.a();
            viewPager.addOnPageChangeListener(this.p);
            j jVar = new j(viewPager);
            this.E = jVar;
            a(jVar);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                a(adapter, true);
            }
            if (this.I == null) {
                this.I = new a();
            }
            this.I.f130723a = true;
            viewPager.addOnAdapterChangeListener(this.I);
            d(viewPager.getCurrentItem());
        } else {
            this.o = null;
            a((PagerAdapter) null, false);
        }
        this.J = z2;
    }

    public final void b(f fVar, boolean z2) {
        int i2;
        f fVar2 = this.w;
        if (fVar2 != fVar) {
            if (fVar != null) {
                i2 = fVar.f130750e;
            } else {
                i2 = -1;
            }
            if (z2) {
                if ((fVar2 == null || fVar2.f130750e == -1) && i2 != -1) {
                    d(i2);
                } else {
                    g(i2);
                }
                if (i2 != -1) {
                    setSelectedTabView(i2);
                }
            }
            if (fVar2 != null) {
                g(fVar2);
            }
            this.w = fVar;
            if (fVar != null) {
                f(fVar);
            }
        } else if (fVar2 != null) {
            h(fVar);
            g(fVar.f130750e);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(7045);
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
            this.f130719k = i4;
        }
        super.onMeasure(i2, i3);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i5 = this.f130721m;
            if (i5 == 0 ? childAt.getMeasuredWidth() < getMeasuredWidth() : !(i5 != 1 || childAt.getMeasuredWidth() == getMeasuredWidth())) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
            }
        }
        MethodCollector.o(7045);
    }

    private void a(f fVar, int i2) {
        fVar.f130750e = i2;
        this.v.add(i2, fVar);
        int size = this.v.size();
        while (true) {
            i2++;
            if (i2 < size) {
                this.v.get(i2).f130750e = i2;
            } else {
                return;
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        MethodCollector.i(6857);
        this.v = new ArrayList<>();
        this.f130719k = Integer.MAX_VALUE;
        this.D = new ArrayList<>();
        this.O = true;
        this.r = true;
        this.P = new f.b(12);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(d.f130796a);
        boolean z2 = !obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        if (!z2) {
            setHorizontalScrollBarEnabled(false);
            e eVar = new e(context);
            this.f130709a = eVar;
            super.addView(eVar, 0, new FrameLayout.LayoutParams(-2, -1));
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ag_, R.attr.aga, R.attr.agb, R.attr.agc, R.attr.agd, R.attr.age, R.attr.agf, R.attr.agg, R.attr.agh, R.attr.agi, R.attr.agj, R.attr.agl, R.attr.agm, R.attr.agn, R.attr.ago, R.attr.agp, R.attr.agq, R.attr.agr, R.attr.ags, R.attr.agt, R.attr.agu, R.attr.agv, R.attr.agx, R.attr.agy, R.attr.agz}, 0, R.style.r4);
            this.f130709a.b(obtainStyledAttributes2.getDimensionPixelSize(10, 0));
            this.f130709a.a(obtainStyledAttributes2.getColor(7, 0));
            int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(15, 0);
            this.f130713e = dimensionPixelSize;
            this.f130712d = dimensionPixelSize;
            this.f130711c = dimensionPixelSize;
            this.f130710b = dimensionPixelSize;
            this.f130710b = obtainStyledAttributes2.getDimensionPixelSize(18, dimensionPixelSize);
            this.f130711c = obtainStyledAttributes2.getDimensionPixelSize(19, this.f130711c);
            this.f130712d = obtainStyledAttributes2.getDimensionPixelSize(17, this.f130712d);
            this.f130713e = obtainStyledAttributes2.getDimensionPixelSize(16, this.f130713e);
            int resourceId = obtainStyledAttributes2.getResourceId(22, R.style.ji);
            this.f130714f = resourceId;
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(resourceId, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.ui, R.attr.ahm});
            try {
                this.f130716h = (float) obtainStyledAttributes3.getDimensionPixelSize(0, 0);
                this.f130715g = obtainStyledAttributes3.getColorStateList(3);
                obtainStyledAttributes3.recycle();
                if (obtainStyledAttributes2.hasValue(23)) {
                    this.f130715g = obtainStyledAttributes2.getColorStateList(23);
                }
                if (obtainStyledAttributes2.hasValue(21)) {
                    this.f130715g = b(this.f130715g.getDefaultColor(), obtainStyledAttributes2.getColor(21, 0));
                }
                this.y = obtainStyledAttributes2.getDimensionPixelSize(13, -1);
                this.z = obtainStyledAttributes2.getDimensionPixelSize(12, -1);
                this.f130718j = obtainStyledAttributes2.getResourceId(0, 0);
                this.B = obtainStyledAttributes2.getDimensionPixelSize(1, 0);
                this.f130721m = obtainStyledAttributes2.getInt(14, 1);
                this.f130720l = obtainStyledAttributes2.getInt(2, 0);
                obtainStyledAttributes2.recycle();
                Resources resources = getResources();
                this.f130717i = (float) resources.getDimensionPixelSize(R.dimen.ib);
                this.A = resources.getDimensionPixelSize(R.dimen.i_);
                this.K = r.a(getContext(), 1.5f);
                this.L = r.a(getContext(), 1.5f);
                this.t = getResources().getConfiguration().orientation;
                h();
                MethodCollector.o(6857);
            } catch (Throwable th) {
                obtainStyledAttributes3.recycle();
                MethodCollector.o(6857);
                throw th;
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
            MethodCollector.o(6857);
            throw illegalArgumentException;
        }
    }

    private void a(f fVar, int i2, boolean z2) {
        if (fVar.f130752g == this) {
            a(fVar, i2);
            e(fVar);
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
