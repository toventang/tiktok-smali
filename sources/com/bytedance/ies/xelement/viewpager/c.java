package com.bytedance.ies.xelement.viewpager;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.h.v;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.viewpager.LynxTabBarView;
import com.bytedance.ies.xelement.viewpager.childitem.LynxViewpagerItem;
import com.google.android.material.tabs.TabLayout;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.q;
import h.r;
import h.w;
import h.z;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class c extends LinearLayout {

    /* renamed from: g  reason: collision with root package name */
    public static final b f37504g = new b((byte) 0);
    private int A;
    private boolean B;
    private int C;

    /* renamed from: a  reason: collision with root package name */
    final a f37505a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f37506b;

    /* renamed from: c  reason: collision with root package name */
    public final List<LynxViewpagerItem> f37507c;

    /* renamed from: d  reason: collision with root package name */
    final List<String> f37508d;

    /* renamed from: e  reason: collision with root package name */
    public int f37509e;

    /* renamed from: f  reason: collision with root package name */
    public AbstractC0920c f37510f;

    /* renamed from: h  reason: collision with root package name */
    private LynxTabBarView f37511h;

    /* renamed from: i  reason: collision with root package name */
    private int f37512i;

    /* renamed from: j  reason: collision with root package name */
    private int f37513j;

    /* renamed from: k  reason: collision with root package name */
    private int f37514k;

    /* renamed from: l  reason: collision with root package name */
    private float f37515l = 9.0f;

    /* renamed from: m  reason: collision with root package name */
    private e f37516m;
    private ViewPager n;
    private TabLayout o;
    private float p;
    private int q;
    private float r;
    private int s;
    private boolean t;
    private boolean u;
    private TabLayout.c v;
    private d w;
    private int x;
    private int y;
    private int z;

    /* renamed from: com.bytedance.ies.xelement.viewpager.c$c  reason: collision with other inner class name */
    public interface AbstractC0920c {
        static {
            Covode.recordClassIndex(22566);
        }

        void a(TabLayout.f fVar);
    }

    public interface d {
        static {
            Covode.recordClassIndex(22567);
        }

        void a(TabLayout tabLayout, boolean z);
    }

    public interface e {
        static {
            Covode.recordClassIndex(22568);
        }

        void a(boolean z);
    }

    static {
        Covode.recordClassIndex(22563);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(22565);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final e getInterceptTouchEventListener() {
        return this.f37516m;
    }

    public final TabLayout getMTabLayout() {
        return this.o;
    }

    public final List<String> getMTabLayoutTitles() {
        return this.f37508d;
    }

    public final ViewPager getMViewPager() {
        return this.n;
    }

    public final class a extends PagerAdapter {
        static {
            Covode.recordClassIndex(22564);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return c.this.f37507c.size();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getItemPosition(Object obj) {
            l.c(obj, "");
            int a2 = n.a((List) c.this.f37507c, obj);
            if (a2 == -1) {
                return -2;
            }
            return a2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final CharSequence getPageTitle(int i2) {
            if (i2 + 1 > c.this.getMTabLayoutTitles().size() || c.this.f37509e == 1) {
                return null;
            }
            return c.this.getMTabLayoutTitles().get(i2);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final boolean isViewFromObject(View view, Object obj) {
            l.c(view, "");
            l.c(obj, "");
            if (!(obj instanceof LynxViewpagerItem) || view != ((LynxUI) obj).mView) {
                return false;
            }
            return true;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final Object instantiateItem(ViewGroup viewGroup, int i2) {
            MethodCollector.i(5979);
            l.c(viewGroup, "");
            LynxViewpagerItem lynxViewpagerItem = c.this.f37507c.get(i2);
            viewGroup.addView(lynxViewpagerItem.mView);
            lynxViewpagerItem.a(true, i2);
            MethodCollector.o(5979);
            return lynxViewpagerItem;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
            MethodCollector.i(5984);
            l.c(viewGroup, "");
            l.c(obj, "");
            if (obj instanceof LynxViewpagerItem) {
                LynxViewpagerItem lynxViewpagerItem = (LynxViewpagerItem) obj;
                viewGroup.removeView(lynxViewpagerItem.mView);
                lynxViewpagerItem.a(false, i2);
            }
            MethodCollector.o(5984);
        }
    }

    private final void b() {
        if (this.o == null) {
            a((TabLayout) null);
        }
    }

    private final void c() {
        Drawable background;
        if (this.o == null) {
            a((TabLayout) null);
        }
        TabLayout tabLayout = this.o;
        if (tabLayout == null || tabLayout.getBackground() == null) {
            TabLayout tabLayout2 = this.o;
            if (tabLayout2 != null) {
                tabLayout2.setBackgroundResource(R.drawable.b2q);
            }
            TabLayout tabLayout3 = this.o;
            if (tabLayout3 != null && (background = tabLayout3.getBackground()) != null) {
                background.mutate();
            }
        }
    }

    private final void d() {
        Drawable background;
        if (Build.VERSION.SDK_INT < 23 && this.f37514k > 0 && this.f37512i > 0 && this.f37513j > 0) {
            Context context = getContext();
            l.a((Object) context, "");
            int a2 = (com.bytedance.ies.xelement.viewpager.a.a.a(context) - this.f37513j) / 2;
            int i2 = this.f37514k - this.f37512i;
            TabLayout tabLayout = this.o;
            if (tabLayout == null || (background = tabLayout.getBackground()) == null) {
                throw new w("null cannot be cast to non-null type");
            }
            ((LayerDrawable) background).setLayerInset(1, a2, i2, a2, 0);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        TabLayout.f tabAt;
        Typeface typeface;
        int i2;
        Typeface typeface2;
        if (this.f37509e == 1) {
            LynxTabBarView lynxTabBarView = this.f37511h;
            if (lynxTabBarView != null) {
                lynxTabBarView.a(0, 0);
                return;
            }
            return;
        }
        TabLayout tabLayout = this.o;
        if (tabLayout != null) {
            int tabCount = tabLayout.getTabCount();
            for (int i3 = 0; i3 < tabCount; i3++) {
                TabLayout tabLayout2 = this.o;
                if (!(tabLayout2 == null || (tabAt = tabLayout2.getTabAt(i3)) == null)) {
                    l.a((Object) tabAt, "");
                    if (i3 == this.C) {
                        tabAt.a();
                    }
                    if (tabAt.f52655f == null) {
                        View a2 = com.a.a(LayoutInflater.from(getContext()), R.layout.aeo, tabAt.f52657h, false);
                        TextView textView = (TextView) a2.findViewById(16908308);
                        l.a((Object) textView, "");
                        textView.setText(tabAt.f52652c);
                        TabLayout tabLayout3 = this.o;
                        if (tabLayout3 == null || i3 != tabLayout3.getSelectedTabPosition()) {
                            textView.setTextSize(1, this.r);
                            if (this.u) {
                                typeface = Typeface.DEFAULT_BOLD;
                            } else {
                                typeface = Typeface.DEFAULT;
                            }
                            textView.setTypeface(typeface);
                            int i4 = this.s;
                            if (i4 != 0) {
                                textView.setTextColor(i4);
                            }
                        } else {
                            textView.setTextSize(1, this.p);
                            if (this.t) {
                                typeface2 = Typeface.DEFAULT_BOLD;
                            } else {
                                typeface2 = Typeface.DEFAULT;
                            }
                            textView.setTypeface(typeface2);
                            int i5 = this.q;
                            if (i5 != 0) {
                                textView.setTextColor(i5);
                            }
                        }
                        tabAt.a(a2);
                        TabLayout.TabView tabView = tabAt.f52657h;
                        l.a((Object) tabView, "");
                        tabView.setBackgroundColor(0);
                        Context context = getContext();
                        l.a((Object) context, "");
                        int a3 = com.bytedance.ies.xelement.viewpager.a.a.a(context, this.f37515l);
                        if (this.x == -1109) {
                            this.x = a3;
                        }
                        if (this.y == -1109) {
                            this.y = a3;
                        }
                        if (i3 == 0) {
                            i2 = this.x;
                        } else {
                            i2 = a3;
                        }
                        if (i3 == this.f37508d.size() - 1) {
                            a3 = this.y;
                        }
                        View view = tabAt.f52655f;
                        if (view == null) {
                            l.a();
                        }
                        View view2 = tabAt.f52655f;
                        if (view2 == null) {
                            l.a();
                        }
                        l.a((Object) view2, "");
                        int paddingTop = view2.getPaddingTop();
                        View view3 = tabAt.f52655f;
                        if (view3 == null) {
                            l.a();
                        }
                        l.a((Object) view3, "");
                        v.a(view, i2, paddingTop, a3, view3.getPaddingBottom());
                        TabLayout.TabView tabView2 = tabAt.f52657h;
                        if (tabView2 != null) {
                            tabView2.setOnClickListener(new g(this, tabAt));
                        } else {
                            throw new w("null cannot be cast to non-null type");
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    public final void setInterceptTouchEventListener(e eVar) {
        this.f37516m = eVar;
    }

    public final void setMTabLayout(TabLayout tabLayout) {
        this.o = tabLayout;
    }

    public final void setRTLMode(boolean z2) {
        this.f37506b = z2;
    }

    public final void setSelectedIndex(int i2) {
        this.C = i2;
    }

    public final void setTabBarDragEnable(boolean z2) {
        this.B = z2;
    }

    public final void a(View view) {
        if (view != null) {
            removeView(view);
        }
    }

    public final void setCurrentSelectIndex(int i2) {
        this.n.setCurrentItem(i2);
    }

    public final void setMViewPager(ViewPager viewPager) {
        l.c(viewPager, "");
        this.n = viewPager;
    }

    public final void setTabClickListenerListener(AbstractC0920c cVar) {
        l.c(cVar, "");
        this.f37510f = cVar;
    }

    public final void setTabInterspace(float f2) {
        this.f37515l = f2 / 2.0f;
    }

    public final void setTabLayoutUpdateListener$x_element_fold_view_newelement(d dVar) {
        l.c(dVar, "");
        this.w = dVar;
    }

    public final void setTabSelectedListener$x_element_fold_view_newelement(TabLayout.c cVar) {
        l.c(cVar, "");
        this.v = cVar;
    }

    public static final class f extends ViewPager {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f37518a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f37519b;

        static {
            Covode.recordClassIndex(22569);
        }

        @Override // androidx.viewpager.widget.ViewPager
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            e interceptTouchEventListener = this.f37518a.getInterceptTouchEventListener();
            if (interceptTouchEventListener != null) {
                interceptTouchEventListener.a(onInterceptTouchEvent);
            }
            return onInterceptTouchEvent;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar, Context context, Context context2) {
            super(context2);
            this.f37518a = cVar;
            this.f37519b = context;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f37520a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TabLayout.f f37521b;

        static {
            Covode.recordClassIndex(22570);
        }

        g(c cVar, TabLayout.f fVar) {
            this.f37520a = cVar;
            this.f37521b = fVar;
        }

        public final void onClick(View view) {
            AbstractC0920c cVar = this.f37520a.f37510f;
            if (cVar != null) {
                cVar.a(this.f37521b);
            }
        }
    }

    public final void setTabLayout(LynxTabBarView lynxTabBarView) {
        l.c(lynxTabBarView, "");
        this.f37511h = lynxTabBarView;
        a(lynxTabBarView.a());
    }

    public final void setLynxDirection(int i2) {
        TabLayout tabLayout = this.o;
        if (tabLayout != null) {
            if (i2 == 2 || i2 == 2) {
                v.b((View) tabLayout, 1);
            } else {
                v.b((View) tabLayout, 0);
            }
        }
    }

    public final void setSelectedTabIndicatorColor(String str) {
        l.c(str, "");
        b();
        TabLayout tabLayout = this.o;
        if (tabLayout != null) {
            tabLayout.setSelectedTabIndicatorColor(com.bytedance.ies.xelement.viewpager.a.a.a(str));
        }
    }

    public final void setTabPaddingBottom(int i2) {
        Context context = getContext();
        l.a((Object) context, "");
        this.A = com.bytedance.ies.xelement.viewpager.a.a.a(context, (float) i2);
        a();
    }

    public final void setTabPaddingEnd(int i2) {
        Context context = getContext();
        l.a((Object) context, "");
        this.y = com.bytedance.ies.xelement.viewpager.a.a.a(context, (float) i2);
        a();
    }

    public final void setTabPaddingStart(int i2) {
        Context context = getContext();
        l.a((Object) context, "");
        this.x = com.bytedance.ies.xelement.viewpager.a.a.a(context, (float) i2);
        a();
    }

    public final void setTabPaddingTop(int i2) {
        Context context = getContext();
        l.a((Object) context, "");
        this.z = com.bytedance.ies.xelement.viewpager.a.a.a(context, (float) i2);
        a();
    }

    public final void setBorderLineColor(String str) {
        Drawable drawable;
        l.c(str, "");
        c();
        TabLayout tabLayout = this.o;
        if (tabLayout != null) {
            drawable = tabLayout.getBackground();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            Drawable drawable2 = ((LayerDrawable) drawable).getDrawable(1);
            if (drawable2 != null) {
                ((GradientDrawable) drawable2).setColor(com.bytedance.ies.xelement.viewpager.a.a.a(str));
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
        throw new w("null cannot be cast to non-null type");
    }

    public final void setSelectedTextColor(String str) {
        Integer valueOf;
        TabLayout.f tabAt;
        View view;
        TextView textView;
        l.c(str, "");
        this.q = com.bytedance.ies.xelement.viewpager.a.a.a(str);
        TabLayout tabLayout = this.o;
        if (tabLayout != null && (valueOf = Integer.valueOf(tabLayout.getSelectedTabPosition())) != null) {
            int intValue = valueOf.intValue();
            TabLayout tabLayout2 = this.o;
            if (tabLayout2 != null && (tabAt = tabLayout2.getTabAt(intValue)) != null && (view = tabAt.f52655f) != null && (textView = (TextView) view.findViewById(16908308)) != null) {
                setSelectedTextStyle(textView);
            }
        }
    }

    public final void setSelectedTextSize(float f2) {
        Integer valueOf;
        TabLayout.f tabAt;
        View view;
        TextView textView;
        this.p = f2;
        TabLayout tabLayout = this.o;
        if (tabLayout != null && (valueOf = Integer.valueOf(tabLayout.getSelectedTabPosition())) != null) {
            int intValue = valueOf.intValue();
            TabLayout tabLayout2 = this.o;
            if (tabLayout2 != null && (tabAt = tabLayout2.getTabAt(intValue)) != null && (view = tabAt.f52655f) != null && (textView = (TextView) view.findViewById(16908308)) != null) {
                setSelectedTextStyle(textView);
            }
        }
    }

    public final void setSelectedTextStyle(TextView textView) {
        Typeface typeface;
        l.c(textView, "");
        if (this.f37509e == 0) {
            textView.setTextSize(1, this.p);
            if (this.t) {
                typeface = Typeface.DEFAULT_BOLD;
            } else {
                typeface = Typeface.DEFAULT;
            }
            textView.setTypeface(typeface);
            textView.setTextColor(this.q);
        }
    }

    public final void setTabbarBackground(String str) {
        Drawable drawable;
        l.c(str, "");
        c();
        TabLayout tabLayout = this.o;
        if (tabLayout != null) {
            drawable = tabLayout.getBackground();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            Drawable drawable2 = ((LayerDrawable) drawable).getDrawable(0);
            if (drawable2 != null) {
                ((GradientDrawable) drawable2).setColor(com.bytedance.ies.xelement.viewpager.a.a.a(str));
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
        throw new w("null cannot be cast to non-null type");
    }

    public final void setTextBold(String str) {
        l.c(str, "");
        int hashCode = str.hashCode();
        if (hashCode != -1577166796) {
            if (hashCode == 1191572123 && str.equals("selected")) {
                this.t = true;
                this.u = false;
            }
        } else if (str.equals("unselected")) {
            this.u = true;
            this.t = false;
        }
    }

    public final void setUnSelectedTextStyle(TextView textView) {
        Typeface typeface;
        l.c(textView, "");
        if (this.f37509e == 0) {
            textView.setTextSize(1, this.r);
            if (this.u) {
                typeface = Typeface.DEFAULT_BOLD;
            } else {
                typeface = Typeface.DEFAULT;
            }
            textView.setTypeface(typeface);
            textView.setTextColor(this.s);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        l.c(context, "");
        MethodCollector.i(5556);
        a aVar = new a();
        this.f37505a = aVar;
        this.n = new f(this, context, context);
        this.f37507c = new ArrayList();
        this.f37508d = new ArrayList();
        this.p = 16.0f;
        this.r = 16.0f;
        this.x = -1109;
        this.y = -1109;
        this.z = -1109;
        this.A = -1109;
        this.B = true;
        setOrientation(1);
        this.n.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.n.setAdapter(aVar);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(this.n, 0);
        MethodCollector.o(5556);
    }

    public final void setBorderHeight(float f2) {
        Drawable drawable;
        c();
        TabLayout tabLayout = this.o;
        if (tabLayout != null) {
            drawable = tabLayout.getBackground();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            Drawable drawable2 = ((LayerDrawable) drawable).getDrawable(1);
            if (drawable2 != null) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable2;
                int intrinsicWidth = gradientDrawable.getIntrinsicWidth();
                Context context = getContext();
                l.a((Object) context, "");
                gradientDrawable.setSize(intrinsicWidth, com.bytedance.ies.xelement.viewpager.a.a.a(context, f2));
                Context context2 = getContext();
                l.a((Object) context2, "");
                this.f37512i = com.bytedance.ies.xelement.viewpager.a.a.a(context2, f2);
                d();
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
        throw new w("null cannot be cast to non-null type");
    }

    public final void setBorderWidth(float f2) {
        Drawable drawable;
        c();
        Context context = getContext();
        l.a((Object) context, "");
        int a2 = (int) (((float) com.bytedance.ies.xelement.viewpager.a.a.a(context)) * (f2 / 375.0f));
        TabLayout tabLayout = this.o;
        if (tabLayout != null) {
            drawable = tabLayout.getBackground();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            Drawable drawable2 = ((LayerDrawable) drawable).getDrawable(1);
            if (drawable2 != null) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable2;
                gradientDrawable.setSize(a2, gradientDrawable.getIntrinsicHeight());
                Context context2 = getContext();
                l.a((Object) context2, "");
                this.f37513j = com.bytedance.ies.xelement.viewpager.a.a.a(context2, f2);
                d();
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
        throw new w("null cannot be cast to non-null type");
    }

    public final void setTabIndicatorHeight(float f2) {
        Drawable drawable;
        b();
        TabLayout tabLayout = this.o;
        if (tabLayout != null) {
            drawable = tabLayout.getTabSelectedIndicator();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            Drawable drawable2 = ((LayerDrawable) drawable).getDrawable(0);
            if (drawable2 != null) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable2;
                int intrinsicWidth = gradientDrawable.getIntrinsicWidth();
                Context context = getContext();
                l.a((Object) context, "");
                gradientDrawable.setSize(intrinsicWidth, com.bytedance.ies.xelement.viewpager.a.a.a(context, f2));
                TabLayout tabLayout2 = this.o;
                if (tabLayout2 != null) {
                    tabLayout2.requestLayout();
                    return;
                }
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
        throw new w("null cannot be cast to non-null type");
    }

    public final void setTabIndicatorRadius(float f2) {
        Drawable drawable;
        b();
        TabLayout tabLayout = this.o;
        if (tabLayout != null) {
            drawable = tabLayout.getTabSelectedIndicator();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            Drawable drawable2 = ((LayerDrawable) drawable).getDrawable(0);
            if (drawable2 != null) {
                Context context = getContext();
                l.a((Object) context, "");
                ((GradientDrawable) drawable2).setCornerRadius((float) com.bytedance.ies.xelement.viewpager.a.a.a(context, f2));
                TabLayout tabLayout2 = this.o;
                if (tabLayout2 != null) {
                    tabLayout2.requestLayout();
                    return;
                }
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
        throw new w("null cannot be cast to non-null type");
    }

    public final void setTabIndicatorWidth(float f2) {
        Drawable drawable;
        b();
        TabLayout tabLayout = this.o;
        if (tabLayout != null) {
            drawable = tabLayout.getTabSelectedIndicator();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            Drawable drawable2 = ((LayerDrawable) drawable).getDrawable(0);
            if (drawable2 != null) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable2;
                Context context = getContext();
                l.a((Object) context, "");
                gradientDrawable.setSize((int) (((float) com.bytedance.ies.xelement.viewpager.a.a.a(context)) * (f2 / 375.0f)), gradientDrawable.getIntrinsicHeight());
                TabLayout tabLayout2 = this.o;
                if (tabLayout2 != null) {
                    tabLayout2.requestLayout();
                    return;
                }
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
        throw new w("null cannot be cast to non-null type");
    }

    public final void setUnSelectedTextColor(String str) {
        Integer num;
        TabLayout tabLayout;
        TabLayout.f tabAt;
        TextView textView;
        l.c(str, "");
        TabLayout tabLayout2 = this.o;
        if (tabLayout2 != null) {
            num = Integer.valueOf(tabLayout2.getSelectedTabPosition());
        } else {
            num = null;
        }
        this.s = com.bytedance.ies.xelement.viewpager.a.a.a(str);
        TabLayout tabLayout3 = this.o;
        if (tabLayout3 != null) {
            int tabCount = tabLayout3.getTabCount();
            for (int i2 = 0; i2 < tabCount; i2++) {
                if (!((num != null && num.intValue() == i2) || (tabLayout = this.o) == null || (tabAt = tabLayout.getTabAt(i2)) == null)) {
                    l.a((Object) tabAt, "");
                    View view = tabAt.f52655f;
                    if (!(view == null || (textView = (TextView) view.findViewById(16908308)) == null)) {
                        setUnSelectedTextStyle(textView);
                    }
                }
            }
        }
    }

    public final void setUnSelectedTextSize(float f2) {
        Integer num;
        TabLayout tabLayout;
        TabLayout.f tabAt;
        TextView textView;
        this.r = f2;
        TabLayout tabLayout2 = this.o;
        if (tabLayout2 != null) {
            num = Integer.valueOf(tabLayout2.getSelectedTabPosition());
        } else {
            num = null;
        }
        TabLayout tabLayout3 = this.o;
        if (tabLayout3 != null) {
            int tabCount = tabLayout3.getTabCount();
            for (int i2 = 0; i2 < tabCount; i2++) {
                if (!((num != null && num.intValue() == i2) || (tabLayout = this.o) == null || (tabAt = tabLayout.getTabAt(i2)) == null)) {
                    l.a((Object) tabAt, "");
                    View view = tabAt.f52655f;
                    if (!(view == null || (textView = (TextView) view.findViewById(16908308)) == null)) {
                        setUnSelectedTextStyle(textView);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(TabLayout tabLayout) {
        if (tabLayout != null) {
            removeView(this.o);
            TabLayout tabLayout2 = this.o;
            if (tabLayout2 != null) {
                tabLayout2.setupWithViewPager(null);
            }
            this.o = tabLayout;
            this.f37508d.clear();
            this.f37509e = 1;
        } else if (this.o == null) {
            Context context = getContext();
            l.a((Object) context, "");
            TabLayout a2 = LynxTabBarView.a.a(context);
            this.o = a2;
            TabLayout.c cVar = this.v;
            if (!(cVar == null || a2 == null)) {
                a2.addOnTabSelectedListener(cVar);
            }
        } else {
            return;
        }
        TabLayout tabLayout3 = this.o;
        if (tabLayout3 != null) {
            tabLayout3.setupWithViewPager(this.n);
        }
        addView(this.o, 0);
        d dVar = this.w;
        if (dVar != null) {
            TabLayout tabLayout4 = this.o;
            if (tabLayout4 == null) {
                l.a();
            }
            dVar.a(tabLayout4, this.B);
        }
    }

    public final void setTablayoutGravity(String str) {
        Class<?> cls;
        Field declaredField;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        l.c(str, "");
        b();
        Locale locale = Locale.ROOT;
        l.a((Object) locale, "");
        String lowerCase = str.toLowerCase(locale);
        l.a((Object) lowerCase, "");
        int hashCode = lowerCase.hashCode();
        if (hashCode != -1364013995) {
            if (hashCode != 3143043) {
                if (hashCode == 3317767 && lowerCase.equals("left")) {
                    TabLayout tabLayout = this.o;
                    if (!(tabLayout == null || (layoutParams3 = tabLayout.getLayoutParams()) == null)) {
                        layoutParams3.width = -1;
                    }
                    TabLayout tabLayout2 = this.o;
                    if (tabLayout2 != null) {
                        tabLayout2.requestLayout();
                    }
                }
            } else if (lowerCase.equals("fill")) {
                TabLayout tabLayout3 = this.o;
                if (tabLayout3 != null) {
                    tabLayout3.setTabMode(1);
                }
                TabLayout tabLayout4 = this.o;
                if (!(tabLayout4 == null || (layoutParams2 = tabLayout4.getLayoutParams()) == null)) {
                    layoutParams2.width = -1;
                }
                TabLayout tabLayout5 = this.o;
                if (tabLayout5 != null) {
                    tabLayout5.setTabGravity(0);
                }
                TabLayout tabLayout6 = this.o;
                if (tabLayout6 != null) {
                    tabLayout6.requestLayout();
                }
            }
        } else if (lowerCase.equals("center")) {
            TabLayout tabLayout7 = this.o;
            if (tabLayout7 != null) {
                tabLayout7.setTabGravity(1);
            }
            TabLayout tabLayout8 = this.o;
            if (!(tabLayout8 == null || (layoutParams = tabLayout8.getLayoutParams()) == null)) {
                layoutParams.width = -1;
            }
            try {
                TabLayout tabLayout9 = this.o;
                if (!(tabLayout9 == null || (cls = tabLayout9.getClass()) == null || (declaredField = cls.getDeclaredField("slidingTabIndicator")) == null)) {
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(this.o);
                    if (obj != null) {
                        LinearLayout linearLayout = (LinearLayout) obj;
                        linearLayout.setGravity(17);
                        linearLayout.getLayoutParams().width = -2;
                        q.m223constructorimpl(z.f158842a);
                        TabLayout tabLayout10 = this.o;
                        if (tabLayout10 != null) {
                            tabLayout10.requestLayout();
                            return;
                        }
                        return;
                    }
                }
                throw new w("null cannot be cast to non-null type");
            } catch (Throwable th) {
                q.m223constructorimpl(r.a(th));
            }
        }
    }

    public final void a(float f2, boolean z2) {
        ViewGroup.LayoutParams layoutParams;
        int i2;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        if (z2) {
            TabLayout tabLayout = this.o;
            if (!(tabLayout == null || (layoutParams3 = tabLayout.getLayoutParams()) == null)) {
                Context context = getContext();
                l.a((Object) context, "");
                layoutParams3.height = com.bytedance.ies.xelement.viewpager.a.a.b(context, f2);
            }
        } else {
            TabLayout tabLayout2 = this.o;
            if (!(tabLayout2 == null || (layoutParams = tabLayout2.getLayoutParams()) == null)) {
                Context context2 = getContext();
                l.a((Object) context2, "");
                layoutParams.height = com.bytedance.ies.xelement.viewpager.a.a.a(context2, f2);
            }
        }
        TabLayout tabLayout3 = this.o;
        if (tabLayout3 == null || (layoutParams2 = tabLayout3.getLayoutParams()) == null) {
            i2 = 0;
        } else {
            i2 = layoutParams2.height;
        }
        this.f37514k = i2;
        d();
        TabLayout tabLayout4 = this.o;
        if (tabLayout4 != null) {
            tabLayout4.requestLayout();
        }
    }
}
