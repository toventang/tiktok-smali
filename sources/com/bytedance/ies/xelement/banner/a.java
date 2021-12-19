package com.bytedance.ies.xelement.banner;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Scroller;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class a extends FrameLayout implements ViewPager.e {
    private int A;
    private int B;
    private int C;
    private List<View> D;
    private LinearLayout E;
    private C0893a F;
    private ViewPager.e G;
    private Method H;
    private Field I;

    /* renamed from: a  reason: collision with root package name */
    public int f36717a;

    /* renamed from: b  reason: collision with root package name */
    public int f36718b;

    /* renamed from: c  reason: collision with root package name */
    public int f36719c;

    /* renamed from: d  reason: collision with root package name */
    public int f36720d;

    /* renamed from: e  reason: collision with root package name */
    public String f36721e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f36722f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f36723g;

    /* renamed from: h  reason: collision with root package name */
    boolean f36724h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f36725i;

    /* renamed from: j  reason: collision with root package name */
    int f36726j;

    /* renamed from: k  reason: collision with root package name */
    public int f36727k;

    /* renamed from: l  reason: collision with root package name */
    public int f36728l;

    /* renamed from: m  reason: collision with root package name */
    public BannerViewPager f36729m;
    boolean n;
    public List<LynxUI> o;
    public final Runnable p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private boolean y;
    private boolean z;

    static {
        Covode.recordClassIndex(22054);
    }

    private void d() {
        removeCallbacks(this.p);
        postDelayed(this.p, (long) this.f36718b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.banner.a$a  reason: collision with other inner class name */
    public class C0893a extends PagerAdapter {
        static {
            Covode.recordClassIndex(22058);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getItemPosition(Object obj) {
            return -2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            if (a.this.f36722f) {
                return a.this.f36717a;
            }
            return a.this.o.size();
        }

        C0893a() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final float getPageWidth(int i2) {
            if (a.this.f36721e.equals("multi-pages")) {
                if (a.this.f36728l == 0) {
                    return 1.0f;
                }
                return ((float) a.this.f36720d) / ((float) a.this.f36728l);
            } else if (a.this.f36721e.equals("carousel")) {
                return 0.8f;
            } else {
                return 1.0f;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final Object instantiateItem(ViewGroup viewGroup, int i2) {
            boolean z;
            FrameLayout frameLayout;
            MethodCollector.i(9350);
            int n = a.this.n(i2);
            a aVar = a.this;
            if (aVar.o.size() == 0) {
                frameLayout = new View(aVar.getContext());
            } else {
                LynxUI lynxUI = aVar.o.get(n);
                T t = lynxUI.mView;
                FrameLayout frameLayout2 = new FrameLayout(aVar.getContext());
                if (t instanceof ViewGroup) {
                    if (lynxUI.getOverflow() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    frameLayout2.setClipChildren(z);
                }
                if (t.getParent() instanceof ViewGroup) {
                    ((ViewGroup) t.getParent()).removeView(t);
                }
                if (aVar.n) {
                    t.setTag("swiper_lynx_view_tag");
                }
                frameLayout2.addView(t);
                View view = new View(aVar.getContext());
                frameLayout2.addView(view, new FrameLayout.LayoutParams(-1, -1));
                if (!aVar.f36724h) {
                    view.setBackgroundColor(aVar.f36726j);
                    view.setTag("swiper_item_mask_tag");
                }
                frameLayout = frameLayout2;
                if (aVar.n) {
                    frameLayout2.setTag(Integer.valueOf(i2));
                    frameLayout = frameLayout2;
                }
            }
            viewGroup.addView(frameLayout);
            MethodCollector.o(9350);
            return frameLayout;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
            MethodCollector.i(9519);
            viewGroup.removeView((View) obj);
            MethodCollector.o(9519);
        }
    }

    private void e() {
        try {
            if (this.I == null) {
                Field declaredField = ViewPager.class.getDeclaredField("mFirstLayout");
                this.I = declaredField;
                declaredField.setAccessible(true);
            }
            this.I.set(this.f36729m, true);
        } catch (Throwable unused) {
        }
    }

    public final boolean b() {
        if (!this.n || !this.f36722f || !"normal".equals(this.f36721e) || this.o.size() != 2) {
            return false;
        }
        return true;
    }

    private void c() {
        if (this.F != null) {
            for (View view : this.D) {
                view.setBackground(o(this.B));
            }
            int i2 = 0;
            int i3 = this.f36727k;
            if (i3 >= 0 && i3 < this.D.size()) {
                i2 = this.f36727k;
            }
            if (this.D.size() > 0) {
                this.D.get(i2).setBackground(o(this.A));
                this.C = this.f36729m.getCurrentItem();
            }
        }
    }

    public final void a() {
        int i2;
        a(this.f36721e, this.t, this.u, this.v);
        e(this.z);
        if (this.F == null) {
            this.F = new C0893a();
            this.f36729m.addOnPageChangeListener(this);
            this.f36729m.setAdapter(this.F);
        }
        int i3 = this.f36727k;
        if (i3 < 0 || i3 >= this.o.size()) {
            this.f36727k = 0;
        }
        if (this.f36722f) {
            i2 = (this.f36717a / 2) + this.f36727k;
        } else {
            i2 = this.f36727k;
        }
        boolean z2 = this.f36725i;
        try {
            e();
            if (this.H == null) {
                Method declaredMethod = ViewPager.class.getDeclaredMethod("setCurrentItemInternal", Integer.TYPE, Boolean.TYPE, Boolean.TYPE);
                this.H = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            this.H.invoke(this.f36729m, Integer.valueOf(i2), Boolean.valueOf(z2), true);
        } catch (Throwable unused) {
            this.f36729m.setCurrentItem(i2, z2);
        }
        if (this.f36723g) {
            d();
        }
    }

    public final a a(int i2) {
        this.A = i2;
        return this;
    }

    public final a b(int i2) {
        this.B = i2;
        return this;
    }

    public final a c(int i2) {
        this.f36726j = i2;
        return this;
    }

    public final a d(boolean z2) {
        this.y = z2;
        return this;
    }

    public final a e(int i2) {
        this.f36719c = i2;
        return this;
    }

    public final a j(int i2) {
        this.f36720d = i2;
        return this;
    }

    public final a k(int i2) {
        this.w = i2;
        return this;
    }

    public final a l(int i2) {
        this.x = i2;
        return this;
    }

    public final a m(int i2) {
        this.f36728l = i2;
        return this;
    }

    public final void setOnPageChangeListener(ViewPager.e eVar) {
        this.G = eVar;
    }

    public final void setTwoItemCircularSwipe(boolean z2) {
        this.n = z2;
    }

    public a(Context context) {
        this(context, (byte) 0);
    }

    public final a b(boolean z2) {
        this.f36724h = z2;
        return this;
    }

    public final a c(boolean z2) {
        this.f36723g = z2;
        d();
        return this;
    }

    public final a f(int i2) {
        this.f36718b = i2;
        d();
        return this;
    }

    @Override // androidx.viewpager.widget.ViewPager.e
    public final void onPageScrollStateChanged(int i2) {
        ViewPager.e eVar = this.G;
        if (eVar != null) {
            eVar.onPageScrollStateChanged(i2);
        }
    }

    public final void setLayerTextureType(int i2) {
        this.f36729m.setLayerType(i2, null);
    }

    private static GradientDrawable o(int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i2);
        return gradientDrawable;
    }

    public final a e(boolean z2) {
        this.z = z2;
        BannerViewPager bannerViewPager = this.f36729m;
        if (bannerViewPager != null) {
            bannerViewPager.setScrollable(z2);
        }
        return this;
    }

    public final a f(boolean z2) {
        this.f36725i = z2;
        a(this.f36721e, this.t, this.u, this.v);
        return this;
    }

    public final a g(int i2) {
        this.t = i2;
        a(this.f36721e, i2, this.u, this.v);
        return this;
    }

    public final a h(int i2) {
        this.u = i2;
        a(this.f36721e, this.t, i2, this.v);
        return this;
    }

    public final a i(int i2) {
        this.v = i2;
        a(this.f36721e, this.t, this.u, i2);
        return this;
    }

    public final void setOverflow(int i2) {
        boolean z2 = false;
        if (i2 == 0) {
            this.f36729m.setLayerType(0, null);
        } else {
            z2 = true;
        }
        setClipChildren(z2);
    }

    public final a a(boolean z2) {
        if (this.f36722f != z2) {
            int n2 = n(this.f36729m.getCurrentItem());
            this.f36722f = z2;
            C0893a aVar = this.F;
            if (aVar != null) {
                aVar.notifyDataSetChanged();
                this.f36729m.setCurrentItem(n2);
            }
        }
        return this;
    }

    private View p(int i2) {
        List<LynxUI> list;
        if (i2 < 0 || (list = this.o) == null || list.size() == 0 || i2 >= this.o.size()) {
            return null;
        }
        return this.o.get(i2).mView;
    }

    public final a d(final int i2) {
        C0893a aVar;
        this.f36727k = i2;
        if (n(this.f36729m.getCurrentItem()) == i2 && (aVar = this.F) != null && aVar.getCount() > 0) {
            return this;
        }
        C0893a aVar2 = this.F;
        if (aVar2 == null || i2 >= aVar2.getCount()) {
            this.f36729m.postDelayed(new Runnable() {
                /* class com.bytedance.ies.xelement.banner.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(22056);
                }

                public final void run() {
                    a.this.a();
                }
            }, 200);
        } else {
            this.f36729m.post(new Runnable() {
                /* class com.bytedance.ies.xelement.banner.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(22055);
                }

                public final void run() {
                    if (a.this.f36722f) {
                        int currentItem = a.this.f36729m.getCurrentItem();
                        a.this.f36729m.setCurrentItem((i2 + currentItem) - a.this.n(currentItem), a.this.f36725i);
                        return;
                    }
                    a aVar = a.this;
                    aVar.f36727k = Math.max(Math.min(aVar.f36727k, a.this.o.size()), 0);
                    a.this.f36729m.setCurrentItem(a.this.f36727k, a.this.f36725i);
                }
            });
        }
        return this;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f36723g) {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3 || action == 4) {
                d();
            } else if (action == 0) {
                removeCallbacks(this.p);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final int n(int i2) {
        if (this.o.size() == 0 || !this.f36722f) {
            return i2;
        }
        int i3 = i2 - (this.f36717a / 2);
        int abs = Math.abs(i3) % this.o.size();
        if (i3 >= 0 || abs == 0) {
            return abs;
        }
        return this.o.size() - abs;
    }

    public final a a(LynxUI lynxUI) {
        MethodCollector.i(7762);
        if (lynxUI != null) {
            this.o.add(lynxUI);
            if (this.y) {
                View view = new View(getContext());
                view.setClickable(false);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.r, this.s);
                layoutParams.leftMargin = this.q;
                layoutParams.rightMargin = this.q;
                this.E.addView(view, layoutParams);
                view.setBackground(o(this.B));
                this.D.add(view);
            }
        }
        if (this.F != null) {
            e();
            this.F.notifyDataSetChanged();
        }
        c();
        MethodCollector.o(7762);
        return this;
    }

    public final void b(LynxUI lynxUI) {
        MethodCollector.i(7847);
        for (LynxUI lynxUI2 : this.o) {
            if (lynxUI2 == lynxUI) {
                this.o.remove(lynxUI);
                if (this.y) {
                    try {
                        this.D.remove(0);
                        LinearLayout linearLayout = this.E;
                        linearLayout.removeView(linearLayout.getChildAt(0));
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                if (this.F != null) {
                    e();
                    this.F.notifyDataSetChanged();
                }
                c();
                MethodCollector.o(7847);
                return;
            }
        }
        MethodCollector.o(7847);
    }

    @Override // androidx.viewpager.widget.ViewPager.e
    public final void onPageSelected(int i2) {
        ViewPager.e eVar = this.G;
        if (eVar != null) {
            eVar.onPageSelected(n(i2));
        }
        if (this.y) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.r, this.s);
            layoutParams.leftMargin = this.q;
            layoutParams.rightMargin = this.q;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.r, this.s);
            layoutParams2.leftMargin = this.q;
            layoutParams2.rightMargin = this.q;
            int n2 = n(this.C);
            int n3 = n(i2);
            if (this.o.size() == 0) {
                n3 = 0;
            }
            if (!this.D.isEmpty() && a(n2, this.D) && a(n3, this.D)) {
                this.D.get(n2).setBackground(o(this.B));
                this.D.get(n2).setLayoutParams(layoutParams2);
                this.D.get(n3).setBackground(o(this.A));
                this.D.get(n3).setLayoutParams(layoutParams);
                this.C = i2;
            }
        }
    }

    public final a a(String str) {
        this.f36721e = str;
        if (!str.equals("coverflow") && !str.equals("flat-coverflow")) {
            this.f36724h = true;
            this.f36726j = Color.argb(128, 0, 0, 0);
        }
        a(this.f36721e, this.t, this.u, this.v);
        return this;
    }

    class b extends Scroller {
        static {
            Covode.recordClassIndex(22059);
        }

        public b(Context context) {
            super(context);
        }

        public final void startScroll(int i2, int i3, int i4, int i5) {
            super.startScroll(i2, i3, i4, i5, a.this.f36719c);
        }

        public final void startScroll(int i2, int i3, int i4, int i5, int i6) {
            super.startScroll(i2, i3, i4, i5, a.this.f36719c);
        }
    }

    private a(Context context, byte b2) {
        this(context, (char) 0);
    }

    private static boolean a(int i2, Collection<?> collection) {
        if (i2 < 0 || i2 >= collection.size()) {
            return false;
        }
        return true;
    }

    private void a(int i2, View view) {
        MethodCollector.i(8950);
        if (view instanceof ViewGroup) {
            if (view.findViewWithTag("swiper_lynx_view_tag") != null) {
                MethodCollector.o(8950);
                return;
            }
            View p2 = p(n(i2));
            if (p2 == null) {
                MethodCollector.o(8950);
                return;
            }
            if (p2.getParent() instanceof ViewGroup) {
                ((ViewGroup) p2.getParent()).removeView(p2);
            }
            ((ViewGroup) view).addView(p2);
        }
        MethodCollector.o(8950);
    }

    private a(Context context, char c2) {
        super(context, null, 0);
        MethodCollector.i(13493);
        this.f36717a = 5000;
        this.q = 5;
        this.r = 20;
        this.s = 20;
        this.f36718b = 5000;
        this.f36719c = 500;
        this.t = 10;
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.f36720d = 1;
        this.f36721e = "normal";
        this.y = true;
        this.f36722f = true;
        this.f36723g = true;
        this.z = true;
        this.f36724h = true;
        this.f36725i = true;
        this.f36726j = Color.argb(128, 0, 0, 0);
        this.A = Color.argb(255, 255, 255, 255);
        this.B = Color.argb(89, 255, 255, 255);
        this.f36727k = 0;
        this.C = 0;
        this.f36728l = 0;
        this.n = false;
        this.o = new CopyOnWriteArrayList();
        this.p = new Runnable() {
            /* class com.bytedance.ies.xelement.banner.a.AnonymousClass3 */

            static {
                Covode.recordClassIndex(22057);
            }

            public final void run() {
                boolean z;
                if (!a.this.f36723g) {
                    return;
                }
                if (a.this.f36722f) {
                    if (a.this.f36721e.equals("coverflow") || a.this.f36721e.equals("flat-coverflow")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int size = a.this.o.size();
                    int i2 = 3;
                    if (a.this.b()) {
                        i2 = 2;
                    }
                    if ((size > 5 || !z) && size >= i2) {
                        int currentItem = a.this.f36729m.getCurrentItem() + 1;
                        if (currentItem >= a.this.f36717a) {
                            a.this.f36729m.setCurrentItem(a.this.f36717a / 2, false);
                        } else {
                            a.this.f36729m.setCurrentItem(currentItem, a.this.f36725i);
                        }
                        a aVar = a.this;
                        aVar.postDelayed(aVar.p, (long) a.this.f36718b);
                        return;
                    }
                    return;
                }
                int currentItem2 = a.this.f36729m.getCurrentItem() + 1;
                if (currentItem2 >= a.this.f36729m.getAdapter().getCount()) {
                    a.this.f36729m.setCurrentItem(0, false);
                    a aVar2 = a.this;
                    aVar2.postDelayed(aVar2.p, (long) a.this.f36718b);
                    return;
                }
                a.this.f36729m.setCurrentItem(currentItem2, a.this.f36725i);
                a aVar3 = a.this;
                aVar3.postDelayed(aVar3.p, (long) a.this.f36718b);
            }
        };
        this.D = new ArrayList();
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.bkv, this, true);
        this.f36729m = (BannerViewPager) a2.findViewById(R.id.rb);
        this.E = (LinearLayout) a2.findViewById(R.id.a65);
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(this.f36729m, new b(this.f36729m.getContext()));
            MethodCollector.o(13493);
        } catch (Exception e2) {
            LLog.a(6, "Banner", e2.getMessage());
            MethodCollector.o(13493);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        if (r4 >= 0) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r4 >= 0) goto L_0x0069;
     */
    @Override // androidx.viewpager.widget.ViewPager.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageScrolled(int r8, float r9, int r10) {
        /*
        // Method dump skipped, instructions count: 243
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.banner.a.onPageScrolled(int, float, int):void");
    }

    private void a(String str, int i2, int i3, int i4) {
        int i5;
        C0893a aVar = this.F;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
        if (str.equals("coverflow") || str.equals("flat-coverflow")) {
            this.f36729m.setClipToPadding(false);
            int i6 = this.f36728l / 5;
            if (i3 < 0 || i4 < 0) {
                this.f36729m.setPadding(i6, 0, i6, 0);
            } else {
                this.f36729m.setPadding(i3 + i2, 0, i4 + i2, 0);
            }
            this.f36729m.setPageMargin(i2);
            this.f36729m.setOffscreenPageLimit(2);
            if (str.equals("coverflow")) {
                this.f36729m.setPageTransformer(false, new b());
            }
        } else if (str.equals("multi-pages")) {
            this.f36729m.setClipToPadding(false);
            int i7 = this.w;
            if (i7 >= 0 && (i5 = this.x) >= 0) {
                this.f36729m.setPadding(i7, 0, i5, 0);
            }
            this.f36729m.setPageMargin(i2);
            this.f36729m.setOffscreenPageLimit(1);
        } else {
            this.f36729m.setPageMargin(i2);
            ViewGroup.LayoutParams layoutParams = this.f36729m.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.rightMargin = 0;
            }
            this.f36729m.setOffscreenPageLimit(1);
            this.f36729m.setPageTransformer(false, null);
        }
    }
}
