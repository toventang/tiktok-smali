package com.bytedance.ies.xelement.viewpager;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.viewpager.childitem.LynxTabbarItem;
import com.google.android.material.tabs.TabLayout;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.p;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.lynx.tasm.behavior.v;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.z;
import h.q;
import h.r;
import h.w;
import h.z;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class LynxTabBarView extends UISimpleView<TabLayout> {

    /* renamed from: h  reason: collision with root package name */
    public static final a f37467h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f37468a = true;

    /* renamed from: b  reason: collision with root package name */
    public boolean f37469b;

    /* renamed from: c  reason: collision with root package name */
    public TabLayout f37470c;

    /* renamed from: d  reason: collision with root package name */
    public b f37471d;

    /* renamed from: e  reason: collision with root package name */
    public TabLayout.f f37472e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f37473f;

    /* renamed from: g  reason: collision with root package name */
    public Map<Integer, String> f37474g = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private float f37475i = 9.0f;

    /* renamed from: j  reason: collision with root package name */
    private final ArrayList<a> f37476j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    private float f37477k = -1.0f;

    public interface b {
        static {
            Covode.recordClassIndex(22542);
        }

        void a(TabLayout.f fVar);
    }

    static {
        Covode.recordClassIndex(22538);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            int i2 = 0;
            boolean z = false;
            int i3 = 0;
            float f2 = 0.0f;
            switch (nextKey.hashCode()) {
                case -1491502497:
                    if (nextKey.equals("tab-height")) {
                        if (!readableMap.isNull(nextKey)) {
                            f2 = (float) readableMap.getDouble(nextKey, 0.0d);
                        }
                        setTabHeight(f2);
                        continue;
                    }
                    break;
                case -1369575443:
                    if (nextKey.equals("tab-indicator-color")) {
                        setTabIndicatorColor(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -1351291312:
                    if (nextKey.equals("tab-indicator-width")) {
                        if (!readableMap.isNull(nextKey)) {
                            f2 = (float) readableMap.getDouble(nextKey, 0.0d);
                        }
                        setTabIndicatorWidth(f2);
                        continue;
                    }
                    break;
                case -1332194002:
                    if (nextKey.equals("background")) {
                        setBackground(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -887638045:
                    if (nextKey.equals("tab-layout-gravity")) {
                        setTablayoutGravity(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -827357317:
                    if (nextKey.equals("tab-padding-left")) {
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, 0);
                        }
                        setTabPaddingLeft(i2);
                        continue;
                    }
                    break;
                case 127387944:
                    if (nextKey.equals("tab-padding-right")) {
                        if (!readableMap.isNull(nextKey)) {
                            i3 = readableMap.getInt(nextKey, 0);
                        }
                        setTabPaddingRight(i3);
                        continue;
                    }
                    break;
                case 182873757:
                    if (nextKey.equals("tab-inter-space")) {
                        if (!readableMap.isNull(nextKey)) {
                            f2 = (float) readableMap.getDouble(nextKey, 0.0d);
                        }
                        setTabInterspace(f2);
                        continue;
                    }
                    break;
                case 195239007:
                    if (nextKey.equals("tab-indicator-top")) {
                        if (!readableMap.isNull(nextKey)) {
                            f2 = (float) readableMap.getDouble(nextKey, 0.0d);
                        }
                        set(f2);
                        continue;
                    }
                    break;
                case 292087426:
                    if (nextKey.equals(com.bytedance.ies.xelement.pickview.b.b.f37376e)) {
                        setBorderLineColor(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 310371557:
                    if (nextKey.equals(com.bytedance.ies.xelement.pickview.b.b.f37375d)) {
                        if (!readableMap.isNull(nextKey)) {
                            f2 = (float) readableMap.getDouble(nextKey, 0.0d);
                        }
                        setBorderWidth(f2);
                        continue;
                    }
                    break;
                case 598588904:
                    if (nextKey.equals("border-height")) {
                        if (!readableMap.isNull(nextKey)) {
                            f2 = (float) readableMap.getDouble(nextKey, 0.0d);
                        }
                        setBorderHeight(f2);
                        continue;
                    }
                    break;
                case 626647517:
                    if (nextKey.equals("tab-indicator-height")) {
                        if (!readableMap.isNull(nextKey)) {
                            f2 = (float) readableMap.getDouble(nextKey, 0.0d);
                        }
                        setTabIndicatorHeight(f2);
                        continue;
                    }
                    break;
                case 790454668:
                    if (nextKey.equals("tab-height-rpx")) {
                        if (!readableMap.isNull(nextKey)) {
                            f2 = (float) readableMap.getDouble(nextKey, 0.0d);
                        }
                        setTabHeightRpx(f2);
                        continue;
                    }
                    break;
                case 909098312:
                    if (nextKey.equals("tab-indicator-radius")) {
                        if (!readableMap.isNull(nextKey)) {
                            f2 = (float) readableMap.getDouble(nextKey, 0.0d);
                        }
                        setTabIndicatorRadius(f2);
                        continue;
                    }
                    break;
                case 1027794903:
                    if (nextKey.equals("disable-attach-event")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setDisableAttachEvent(z);
                        continue;
                    }
                    break;
                case 1823781940:
                    if (nextKey.equals("border-top")) {
                        if (!readableMap.isNull(nextKey)) {
                            f2 = (float) readableMap.getDouble(nextKey, 0.0d);
                        }
                        setBorderTop(f2);
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public boolean needCustomLayout() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(22541);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static TabLayout a(Context context) {
            l.c(context, "");
            TabLayout tabLayout = new TabLayout(context);
            tabLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            tabLayout.setTabMode(0);
            tabLayout.setSelectedTabIndicator(R.drawable.b2p);
            tabLayout.setBackgroundResource(R.drawable.b2q);
            tabLayout.getBackground().mutate();
            Drawable tabSelectedIndicator = tabLayout.getTabSelectedIndicator();
            if (tabSelectedIndicator != null) {
                tabSelectedIndicator.mutate();
            }
            a(tabLayout);
            return tabLayout;
        }

        private static void a(TabLayout tabLayout) {
            Object obj;
            try {
                Field declaredField = TabLayout.class.getDeclaredField("tabPaddingStart");
                l.a((Object) declaredField, "");
                declaredField.setAccessible(true);
                declaredField.set(tabLayout, 0);
                Field declaredField2 = TabLayout.class.getDeclaredField("tabPaddingEnd");
                l.a((Object) declaredField2, "");
                declaredField2.setAccessible(true);
                declaredField2.set(tabLayout, 0);
                Field declaredField3 = TabLayout.class.getDeclaredField("tabPaddingTop");
                l.a((Object) declaredField3, "");
                declaredField3.setAccessible(true);
                declaredField3.set(tabLayout, 0);
                Field declaredField4 = TabLayout.class.getDeclaredField("tabPaddingBottom");
                l.a((Object) declaredField4, "");
                declaredField4.setAccessible(true);
                declaredField4.set(tabLayout, 0);
                Field declaredField5 = TabLayout.class.getDeclaredField("requestedTabMinWidth");
                l.a((Object) declaredField5, "");
                declaredField5.setAccessible(true);
                declaredField5.set(tabLayout, 0);
                obj = q.m223constructorimpl(z.f158842a);
            } catch (Throwable th) {
                obj = q.m223constructorimpl(r.a(th));
            }
            q.m226exceptionOrNullimpl(obj);
        }
    }

    public static final class d implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxTabBarView f37479a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f37480b;

        static {
            Covode.recordClassIndex(22544);
        }

        public final void onViewDetachedFromWindow(View view) {
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f37481a;

            static {
                Covode.recordClassIndex(22545);
            }

            a(d dVar) {
                this.f37481a = dVar;
            }

            public final void run() {
                this.f37481a.f37480b.a(LynxTabBarView.a(this.f37481a.f37479a).getTabAt(LynxTabBarView.a(this.f37481a.f37479a).getSelectedTabPosition()));
            }
        }

        public final void onViewAttachedToWindow(View view) {
            if (!this.f37479a.f37473f) {
                LynxTabBarView.a(this.f37479a).post(new a(this));
            }
        }

        d(LynxTabBarView lynxTabBarView, e eVar) {
            this.f37479a = lynxTabBarView;
            this.f37480b = eVar;
        }
    }

    public final TabLayout a() {
        TabLayout tabLayout = this.f37470c;
        if (tabLayout == null) {
            l.a("mTabLayout");
        }
        return tabLayout;
    }

    private final void b() {
        TabLayout tabLayout = this.f37470c;
        if (tabLayout == null) {
            l.a("mTabLayout");
        }
        if (tabLayout.getBackground() == null) {
            TabLayout tabLayout2 = this.f37470c;
            if (tabLayout2 == null) {
                l.a("mTabLayout");
            }
            tabLayout2.setBackgroundResource(R.drawable.b2q);
            TabLayout tabLayout3 = this.f37470c;
            if (tabLayout3 == null) {
                l.a("mTabLayout");
            }
            tabLayout3.getBackground().mutate();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public void measure() {
        if (this.f37477k > 0.0f) {
            TabLayout tabLayout = this.f37470c;
            if (tabLayout == null) {
                l.a("mTabLayout");
            }
            ViewGroup.LayoutParams layoutParams = tabLayout.getLayoutParams();
            if (layoutParams != null) {
                j jVar = this.mContext;
                l.a((Object) jVar, "");
                layoutParams.height = com.bytedance.ies.xelement.viewpager.a.a.b(jVar, this.f37477k);
            }
        }
        super.measure();
    }

    @m(a = "disable-attach-event", f = false)
    public final void setDisableAttachEvent(boolean z) {
        this.f37473f = z;
    }

    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxTabBarView f37478a;

        static {
            Covode.recordClassIndex(22543);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(LynxTabBarView lynxTabBarView) {
            this.f37478a = lynxTabBarView;
        }

        @Override // com.bytedance.ies.xelement.viewpager.LynxTabBarView.b
        public final void a(TabLayout.f fVar) {
            l.c(fVar, "");
            this.f37478a.f37472e = fVar;
        }
    }

    public static final class e implements TabLayout.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxTabBarView f37482a;

        static {
            Covode.recordClassIndex(22546);
        }

        @Override // com.google.android.material.tabs.TabLayout.b
        public final void b(TabLayout.f fVar) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(LynxTabBarView lynxTabBarView) {
            this.f37482a = lynxTabBarView;
        }

        @Override // com.google.android.material.tabs.TabLayout.b
        public final void a(TabLayout.f fVar) {
            int i2;
            if (this.f37482a.f37469b) {
                LynxTabBarView lynxTabBarView = this.f37482a;
                if (fVar != null) {
                    TabLayout tabLayout = lynxTabBarView.f37470c;
                    if (tabLayout == null) {
                        l.a("mTabLayout");
                        l.a();
                    }
                    int tabCount = tabLayout.getTabCount();
                    i2 = 0;
                    while (true) {
                        if (i2 >= tabCount) {
                            break;
                        }
                        TabLayout tabLayout2 = lynxTabBarView.f37470c;
                        if (tabLayout2 == null) {
                            l.a("mTabLayout");
                        }
                        if (tabLayout2.getTabAt(i2) == fVar) {
                            break;
                        }
                        i2++;
                    }
                }
                i2 = 0;
                j jVar = this.f37482a.mContext;
                String str = "";
                l.a((Object) jVar, str);
                com.lynx.tasm.c cVar = jVar.f55897e;
                com.lynx.tasm.c.c cVar2 = new com.lynx.tasm.c.c(this.f37482a.getSign(), "change");
                String str2 = this.f37482a.f37474g.get(Integer.valueOf(i2));
                if (str2 == null) {
                    str2 = str;
                }
                cVar2.a("tag", str2);
                cVar2.a("index", Integer.valueOf(i2));
                if (!this.f37482a.f37468a) {
                    if (this.f37482a.f37472e == fVar) {
                        str = "click";
                    } else {
                        str = "slide";
                    }
                }
                cVar2.a("scene", str);
                cVar.a(cVar2);
                this.f37482a.f37468a = false;
                this.f37482a.f37472e = null;
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LinearLayout.LayoutParams(-2, -2);
    }

    @m(a = "tab-inter-space")
    public final void setTabInterspace(float f2) {
        this.f37475i = f2 / 2.0f;
    }

    public static final /* synthetic */ TabLayout a(LynxTabBarView lynxTabBarView) {
        TabLayout tabLayout = lynxTabBarView.f37470c;
        if (tabLayout == null) {
            l.a("mTabLayout");
        }
        return tabLayout;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setEvents(Map<String, com.lynx.tasm.c.a> map) {
        super.setEvents(map);
        if (map != null) {
            this.f37469b = map.containsKey("change");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxTabBarView f37483a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f37484b;

        static {
            Covode.recordClassIndex(22547);
        }

        f(LynxTabBarView lynxTabBarView, z.e eVar) {
            this.f37483a = lynxTabBarView;
            this.f37484b = eVar;
        }

        public final void onClick(View view) {
            b bVar = this.f37483a.f37471d;
            if (bVar != null) {
                T t = this.f37484b.element;
                if (t == null) {
                    l.a();
                }
                bVar.a(t);
            }
        }
    }

    public LynxTabBarView(j jVar) {
        super(jVar);
    }

    @m(a = "tab-indicator-color")
    public final void setTabIndicatorColor(String str) {
        l.c(str, "");
        TabLayout tabLayout = this.f37470c;
        if (tabLayout == null) {
            l.a("mTabLayout");
        }
        tabLayout.setSelectedTabIndicatorColor(com.bytedance.ies.xelement.viewpager.a.a.a(str));
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public /* synthetic */ View createView(Context context) {
        if (context == null) {
            return null;
        }
        this.f37470c = a.a(context);
        e eVar = new e(this);
        TabLayout tabLayout = this.f37470c;
        if (tabLayout == null) {
            l.a("mTabLayout");
        }
        tabLayout.addOnTabSelectedListener(eVar);
        this.f37471d = new c(this);
        TabLayout tabLayout2 = this.f37470c;
        if (tabLayout2 == null) {
            l.a("mTabLayout");
        }
        tabLayout2.addOnAttachStateChangeListener(new d(this, eVar));
        TabLayout tabLayout3 = this.f37470c;
        if (tabLayout3 != null) {
            return tabLayout3;
        }
        l.a("mTabLayout");
        return tabLayout3;
    }

    @m(a = "tab-indicator-top")
    public final void set(float f2) {
        TabLayout tabLayout = this.f37470c;
        if (tabLayout == null) {
            l.a("mTabLayout");
        }
        Drawable tabSelectedIndicator = tabLayout.getTabSelectedIndicator();
        if (tabSelectedIndicator != null) {
            j jVar = this.mContext;
            l.a((Object) jVar, "");
            ((LayerDrawable) tabSelectedIndicator).setLayerInset(0, 0, 0, 0, com.bytedance.ies.xelement.viewpager.a.a.a(jVar, f2));
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setBackgroundColor(int i2) {
        b();
        if (Build.VERSION.SDK_INT < 23) {
            TabLayout tabLayout = this.f37470c;
            if (tabLayout == null) {
                l.a("mTabLayout");
            }
            tabLayout.setBackgroundColor(i2);
            return;
        }
        TabLayout tabLayout2 = this.f37470c;
        if (tabLayout2 == null) {
            l.a("mTabLayout");
        }
        Drawable background = tabLayout2.getBackground();
        if (background != null) {
            Drawable drawable = ((LayerDrawable) background).getDrawable(0);
            if (drawable != null) {
                ((GradientDrawable) drawable).setColor(i2);
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
        throw new w("null cannot be cast to non-null type");
    }

    @m(a = com.bytedance.ies.xelement.pickview.b.b.f37376e)
    public final void setBorderLineColor(String str) {
        l.c(str, "");
        if (Build.VERSION.SDK_INT >= 23) {
            b();
            TabLayout tabLayout = this.f37470c;
            if (tabLayout == null) {
                l.a("mTabLayout");
            }
            Drawable background = tabLayout.getBackground();
            if (background != null) {
                Drawable drawable = ((LayerDrawable) background).getDrawable(1);
                if (drawable != null) {
                    ((GradientDrawable) drawable).setColor(com.bytedance.ies.xelement.viewpager.a.a.a(str));
                    return;
                }
                throw new w("null cannot be cast to non-null type");
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    @m(a = "border-top")
    public final void setBorderTop(float f2) {
        if (Build.VERSION.SDK_INT >= 23) {
            b();
            TabLayout tabLayout = this.f37470c;
            if (tabLayout == null) {
                l.a("mTabLayout");
            }
            Drawable background = tabLayout.getBackground();
            if (background != null) {
                j jVar = this.mContext;
                l.a((Object) jVar, "");
                ((LayerDrawable) background).setLayerInset(0, 0, 0, 0, com.bytedance.ies.xelement.viewpager.a.a.a(jVar, f2));
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setLynxDirection(int i2) {
        super.setLynxDirection(i2);
        if (i2 == 2 || i2 == 2) {
            TabLayout tabLayout = this.f37470c;
            if (tabLayout == null) {
                l.a("mTabLayout");
            }
            androidx.core.h.v.b((View) tabLayout, 1);
            return;
        }
        TabLayout tabLayout2 = this.f37470c;
        if (tabLayout2 == null) {
            l.a("mTabLayout");
        }
        androidx.core.h.v.b((View) tabLayout2, 0);
    }

    @m(a = "tab-height")
    public final void setTabHeight(float f2) {
        TabLayout tabLayout = this.f37470c;
        if (tabLayout == null) {
            l.a("mTabLayout");
        }
        ViewGroup.LayoutParams layoutParams = tabLayout.getLayoutParams();
        if (layoutParams != null) {
            j jVar = this.mContext;
            l.a((Object) jVar, "");
            layoutParams.height = com.bytedance.ies.xelement.viewpager.a.a.a(jVar, f2);
        }
        TabLayout tabLayout2 = this.f37470c;
        if (tabLayout2 == null) {
            l.a("mTabLayout");
        }
        tabLayout2.requestLayout();
    }

    @m(a = "tab-height-rpx")
    public final void setTabHeightRpx(float f2) {
        this.f37477k = f2;
        TabLayout tabLayout = this.f37470c;
        if (tabLayout == null) {
            l.a("mTabLayout");
        }
        ViewGroup.LayoutParams layoutParams = tabLayout.getLayoutParams();
        if (layoutParams != null) {
            j jVar = this.mContext;
            l.a((Object) jVar, "");
            layoutParams.height = com.bytedance.ies.xelement.viewpager.a.a.b(jVar, this.f37477k);
        }
        TabLayout tabLayout2 = this.f37470c;
        if (tabLayout2 == null) {
            l.a("mTabLayout");
        }
        tabLayout2.requestLayout();
    }

    @m(a = "background")
    public final void setBackground(String str) {
        l.c(str, "");
        b();
        if (Build.VERSION.SDK_INT < 23) {
            TabLayout tabLayout = this.f37470c;
            if (tabLayout == null) {
                l.a("mTabLayout");
            }
            tabLayout.setBackgroundColor(com.bytedance.ies.xelement.viewpager.a.a.a(str));
            return;
        }
        TabLayout tabLayout2 = this.f37470c;
        if (tabLayout2 == null) {
            l.a("mTabLayout");
        }
        Drawable background = tabLayout2.getBackground();
        if (background != null) {
            Drawable drawable = ((LayerDrawable) background).getDrawable(0);
            if (drawable != null) {
                ((GradientDrawable) drawable).setColor(com.bytedance.ies.xelement.viewpager.a.a.a(str));
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
        throw new w("null cannot be cast to non-null type");
    }

    @m(a = "border-height")
    public final void setBorderHeight(float f2) {
        if (Build.VERSION.SDK_INT >= 23) {
            b();
            TabLayout tabLayout = this.f37470c;
            if (tabLayout == null) {
                l.a("mTabLayout");
            }
            Drawable background = tabLayout.getBackground();
            if (background != null) {
                Drawable drawable = ((LayerDrawable) background).getDrawable(1);
                if (drawable != null) {
                    GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                    int intrinsicWidth = gradientDrawable.getIntrinsicWidth();
                    j jVar = this.mContext;
                    l.a((Object) jVar, "");
                    gradientDrawable.setSize(intrinsicWidth, com.bytedance.ies.xelement.viewpager.a.a.a(jVar, f2));
                    return;
                }
                throw new w("null cannot be cast to non-null type");
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    @m(a = com.bytedance.ies.xelement.pickview.b.b.f37375d)
    public final void setBorderWidth(float f2) {
        if (Build.VERSION.SDK_INT >= 23) {
            b();
            j jVar = this.mContext;
            l.a((Object) jVar, "");
            int a2 = (int) (((float) com.bytedance.ies.xelement.viewpager.a.a.a(jVar)) * (f2 / 375.0f));
            TabLayout tabLayout = this.f37470c;
            if (tabLayout == null) {
                l.a("mTabLayout");
            }
            Drawable background = tabLayout.getBackground();
            if (background != null) {
                Drawable drawable = ((LayerDrawable) background).getDrawable(1);
                if (drawable != null) {
                    GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                    gradientDrawable.setSize(a2, gradientDrawable.getIntrinsicHeight());
                    return;
                }
                throw new w("null cannot be cast to non-null type");
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    @m(a = "tab-indicator-height")
    public final void setTabIndicatorHeight(float f2) {
        TabLayout tabLayout = this.f37470c;
        if (tabLayout == null) {
            l.a("mTabLayout");
        }
        Drawable tabSelectedIndicator = tabLayout.getTabSelectedIndicator();
        if (tabSelectedIndicator != null) {
            Drawable drawable = ((LayerDrawable) tabSelectedIndicator).getDrawable(0);
            if (drawable != null) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                int intrinsicWidth = gradientDrawable.getIntrinsicWidth();
                j jVar = this.mContext;
                l.a((Object) jVar, "");
                gradientDrawable.setSize(intrinsicWidth, com.bytedance.ies.xelement.viewpager.a.a.a(jVar, f2));
                TabLayout tabLayout2 = this.f37470c;
                if (tabLayout2 == null) {
                    l.a("mTabLayout");
                }
                tabLayout2.requestLayout();
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
        throw new w("null cannot be cast to non-null type");
    }

    @m(a = "tab-indicator-radius")
    public final void setTabIndicatorRadius(float f2) {
        TabLayout tabLayout = this.f37470c;
        if (tabLayout == null) {
            l.a("mTabLayout");
        }
        Drawable tabSelectedIndicator = tabLayout.getTabSelectedIndicator();
        if (tabSelectedIndicator != null) {
            Drawable drawable = ((LayerDrawable) tabSelectedIndicator).getDrawable(0);
            if (drawable != null) {
                j jVar = this.mContext;
                l.a((Object) jVar, "");
                ((GradientDrawable) drawable).setCornerRadius((float) com.bytedance.ies.xelement.viewpager.a.a.a(jVar, f2));
                TabLayout tabLayout2 = this.f37470c;
                if (tabLayout2 == null) {
                    l.a("mTabLayout");
                }
                tabLayout2.requestLayout();
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
        throw new w("null cannot be cast to non-null type");
    }

    @m(a = "tab-indicator-width")
    public final void setTabIndicatorWidth(float f2) {
        TabLayout tabLayout = this.f37470c;
        if (tabLayout == null) {
            l.a("mTabLayout");
        }
        Drawable tabSelectedIndicator = tabLayout.getTabSelectedIndicator();
        if (tabSelectedIndicator != null) {
            Drawable drawable = ((LayerDrawable) tabSelectedIndicator).getDrawable(0);
            if (drawable != null) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                j jVar = this.mContext;
                l.a((Object) jVar, "");
                gradientDrawable.setSize((int) (((float) com.bytedance.ies.xelement.viewpager.a.a.a(jVar)) * (f2 / 375.0f)), gradientDrawable.getIntrinsicHeight());
                TabLayout tabLayout2 = this.f37470c;
                if (tabLayout2 == null) {
                    l.a("mTabLayout");
                }
                tabLayout2.requestLayout();
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
        throw new w("null cannot be cast to non-null type");
    }

    @m(a = "tab-padding-left")
    public final void setTabPaddingLeft(int i2) {
        try {
            TabLayout tabLayout = this.f37470c;
            if (tabLayout == null) {
                l.a("mTabLayout");
            }
            Field declaredField = tabLayout.getClass().getDeclaredField("contentInsetStart");
            l.a((Object) declaredField, "");
            declaredField.setAccessible(true);
            TabLayout tabLayout2 = this.f37470c;
            if (tabLayout2 == null) {
                l.a("mTabLayout");
            }
            j jVar = this.mContext;
            l.a((Object) jVar, "");
            declaredField.set(tabLayout2, Integer.valueOf(com.bytedance.ies.xelement.viewpager.a.a.a(jVar, (float) i2)));
            TabLayout tabLayout3 = this.f37470c;
            if (tabLayout3 == null) {
                l.a("mTabLayout");
            }
            Method declaredMethod = tabLayout3.getClass().getDeclaredMethod("applyModeAndGravity", new Class[0]);
            l.a((Object) declaredMethod, "");
            declaredMethod.setAccessible(true);
            TabLayout tabLayout4 = this.f37470c;
            if (tabLayout4 == null) {
                l.a("mTabLayout");
            }
            q.m223constructorimpl(declaredMethod.invoke(tabLayout4, new Object[0]));
        } catch (Throwable th) {
            q.m223constructorimpl(r.a(th));
        }
    }

    @m(a = "tab-padding-right")
    public final void setTabPaddingRight(int i2) {
        try {
            TabLayout tabLayout = this.f37470c;
            if (tabLayout == null) {
                l.a("mTabLayout");
            }
            Field declaredField = tabLayout.getClass().getDeclaredField("slidingTabIndicator");
            l.a((Object) declaredField, "");
            declaredField.setAccessible(true);
            TabLayout tabLayout2 = this.f37470c;
            if (tabLayout2 == null) {
                l.a("mTabLayout");
            }
            Object obj = declaredField.get(tabLayout2);
            if (obj != null) {
                LinearLayout linearLayout = (LinearLayout) obj;
                int paddingStart = linearLayout.getPaddingStart();
                int top = linearLayout.getTop();
                j jVar = this.mContext;
                l.a((Object) jVar, "");
                androidx.core.h.v.a(linearLayout, paddingStart, top, com.bytedance.ies.xelement.viewpager.a.a.a(jVar, (float) i2), linearLayout.getBottom());
                TabLayout tabLayout3 = this.f37470c;
                if (tabLayout3 == null) {
                    l.a("mTabLayout");
                }
                tabLayout3.requestLayout();
                q.m223constructorimpl(h.z.f158842a);
                return;
            }
            throw new w("null cannot be cast to non-null type");
        } catch (Throwable th) {
            q.m223constructorimpl(r.a(th));
        }
    }

    @m(a = "tab-layout-gravity")
    public final void setTablayoutGravity(String str) {
        Field declaredField;
        l.c(str, "");
        Locale locale = Locale.ROOT;
        l.a((Object) locale, "");
        String lowerCase = str.toLowerCase(locale);
        l.a((Object) lowerCase, "");
        int hashCode = lowerCase.hashCode();
        if (hashCode != -1364013995) {
            if (hashCode != 3143043) {
                if (hashCode == 3317767 && lowerCase.equals("left")) {
                    TabLayout tabLayout = this.f37470c;
                    if (tabLayout == null) {
                        l.a("mTabLayout");
                    }
                    ViewGroup.LayoutParams layoutParams = tabLayout.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = -1;
                    }
                    TabLayout tabLayout2 = this.f37470c;
                    if (tabLayout2 == null) {
                        l.a("mTabLayout");
                    }
                    tabLayout2.requestLayout();
                }
            } else if (lowerCase.equals("fill")) {
                TabLayout tabLayout3 = this.f37470c;
                if (tabLayout3 == null) {
                    l.a("mTabLayout");
                }
                tabLayout3.setTabMode(1);
                TabLayout tabLayout4 = this.f37470c;
                if (tabLayout4 == null) {
                    l.a("mTabLayout");
                }
                ViewGroup.LayoutParams layoutParams2 = tabLayout4.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = -1;
                }
                TabLayout tabLayout5 = this.f37470c;
                if (tabLayout5 == null) {
                    l.a("mTabLayout");
                }
                tabLayout5.setTabGravity(0);
                TabLayout tabLayout6 = this.f37470c;
                if (tabLayout6 == null) {
                    l.a("mTabLayout");
                }
                tabLayout6.requestLayout();
            }
        } else if (lowerCase.equals("center")) {
            TabLayout tabLayout7 = this.f37470c;
            if (tabLayout7 == null) {
                l.a("mTabLayout");
            }
            tabLayout7.setTabGravity(1);
            TabLayout tabLayout8 = this.f37470c;
            if (tabLayout8 == null) {
                l.a("mTabLayout");
            }
            ViewGroup.LayoutParams layoutParams3 = tabLayout8.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.width = -1;
            }
            try {
                TabLayout tabLayout9 = this.f37470c;
                if (tabLayout9 == null) {
                    l.a("mTabLayout");
                }
                Class<?> cls = tabLayout9.getClass();
                if (!(cls == null || (declaredField = cls.getDeclaredField("slidingTabIndicator")) == null)) {
                    declaredField.setAccessible(true);
                    TabLayout tabLayout10 = this.f37470c;
                    if (tabLayout10 == null) {
                        l.a("mTabLayout");
                    }
                    Object obj = declaredField.get(tabLayout10);
                    if (obj != null) {
                        LinearLayout linearLayout = (LinearLayout) obj;
                        linearLayout.setGravity(17);
                        linearLayout.getLayoutParams().width = -2;
                        q.m223constructorimpl(h.z.f158842a);
                        TabLayout tabLayout11 = this.f37470c;
                        if (tabLayout11 == null) {
                            l.a("mTabLayout");
                        }
                        tabLayout11.requestLayout();
                        return;
                    }
                }
                throw new w("null cannot be cast to non-null type");
            } catch (Throwable th) {
                q.m223constructorimpl(r.a(th));
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public void insertChild(LynxBaseUI lynxBaseUI, int i2) {
        int i3;
        if ((lynxBaseUI instanceof LynxUI) && (lynxBaseUI instanceof LynxTabbarItem)) {
            LynxTabbarItem lynxTabbarItem = (LynxTabbarItem) lynxBaseUI;
            lynxTabbarItem.setParent(this);
            this.mChildren.add(i2, lynxBaseUI);
            ArrayList<a> arrayList = this.f37476j;
            a aVar = new a(this.mContext);
            aVar.setOverflow(lynxTabbarItem.getOverflow());
            aVar.addView(((LynxUI) lynxBaseUI).mView);
            arrayList.add(i2, aVar);
            if (lynxTabbarItem.getProps().containsKey("tag")) {
                this.f37474g.put(Integer.valueOf(i2), String.valueOf(lynxTabbarItem.getProps().get("tag")));
            }
            if (lynxTabbarItem.f37526b) {
                i3 = i2;
            } else {
                i3 = 0;
            }
            a(i2, i3);
            TabLayout tabLayout = this.f37470c;
            if (tabLayout == null) {
                l.a("mTabLayout");
            }
            l.c(tabLayout, "");
            lynxTabbarItem.f37527c = Integer.valueOf(i2);
            lynxTabbarItem.f37528d = tabLayout;
        }
    }

    @p
    public final void selectTab(ReadableMap readableMap, Callback callback) {
        l.c(readableMap, "");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.put("success", false);
        if (readableMap.hasKey("index")) {
            int i2 = readableMap.getInt("index");
            if (i2 >= 0) {
                TabLayout tabLayout = this.f37470c;
                if (tabLayout == null) {
                    l.a("mTabLayout");
                }
                if (i2 < tabLayout.getTabCount()) {
                    TabLayout tabLayout2 = this.f37470c;
                    if (tabLayout2 == null) {
                        l.a("mTabLayout");
                    }
                    TabLayout.f tabAt = tabLayout2.getTabAt(i2);
                    if (tabAt != null) {
                        tabAt.a();
                    }
                    javaOnlyMap.put("success", true);
                    if (callback != null) {
                        callback.invoke(0, javaOnlyMap);
                        return;
                    }
                    return;
                }
            }
            javaOnlyMap.put("msg", "index out of bounds");
            if (callback != null) {
                callback.invoke(0, javaOnlyMap);
                return;
            }
            return;
        }
        javaOnlyMap.put("msg", "no index key");
        if (callback != null) {
            callback.invoke(0, javaOnlyMap);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0077, code lost:
        if (r2 == null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0084, code lost:
        if (r0 == null) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r9, int r10) {
        /*
        // Method dump skipped, instructions count: 202
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.viewpager.LynxTabBarView.a(int, int):void");
    }
}
