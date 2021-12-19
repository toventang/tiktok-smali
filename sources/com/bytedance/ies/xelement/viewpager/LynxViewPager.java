package com.bytedance.ies.xelement.viewpager;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.viewpager.c;
import com.bytedance.ies.xelement.viewpager.childitem.LynxViewpagerItem;
import com.google.android.material.tabs.TabLayout;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.p;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.lynx.tasm.behavior.v;
import h.f.b.l;
import java.util.List;
import java.util.Map;

public class LynxViewPager extends UISimpleView<c> {

    /* renamed from: f  reason: collision with root package name */
    public static final a f37485f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f37486a;

    /* renamed from: b  reason: collision with root package name */
    public c f37487b;

    /* renamed from: c  reason: collision with root package name */
    public TabLayout.f f37488c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f37489d = true;

    /* renamed from: e  reason: collision with root package name */
    TabLayout.c f37490e;

    static {
        Covode.recordClassIndex(22548);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            float f2 = 0.0f;
            int i2 = 0;
            boolean z = false;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            switch (nextKey.hashCode()) {
                case -2088137419:
                    if (nextKey.equals("selected-text-color")) {
                        setSelectedTextColor(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -1951374851:
                    if (nextKey.equals("tabbar-background")) {
                        setTabbarBackground(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -1689248927:
                    if (nextKey.equals("tab-padding-top")) {
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, 0);
                        }
                        setTabPaddingTop(i2);
                        continue;
                    }
                    break;
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
                case -855908868:
                    if (nextKey.equals("unselected-text-color")) {
                        setUnSelectedTextColor(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -827357317:
                    if (nextKey.equals("tab-padding-left")) {
                        if (!readableMap.isNull(nextKey)) {
                            i6 = readableMap.getInt(nextKey, 0);
                        }
                        setTabPaddingLeft(i6);
                        continue;
                    }
                    break;
                case -798067553:
                    if (nextKey.equals("tab-padding-bottom")) {
                        if (!readableMap.isNull(nextKey)) {
                            i5 = readableMap.getInt(nextKey, 0);
                        }
                        setTabPaddingBottom(i5);
                        continue;
                    }
                    break;
                case 127387944:
                    if (nextKey.equals("tab-padding-right")) {
                        if (!readableMap.isNull(nextKey)) {
                            i4 = readableMap.getInt(nextKey, 0);
                        }
                        setTabPaddingRight(i4);
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
                case 210206703:
                    if (nextKey.equals("selected-text-size")) {
                        if (!readableMap.isNull(nextKey)) {
                            f2 = (float) readableMap.getDouble(nextKey, 0.0d);
                        }
                        setSelectedTextSize(f2);
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
                case 468669252:
                    if (nextKey.equals("hide-indicator")) {
                        setIndicatorVisibility(readableMap.getString(nextKey));
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
                case 942654657:
                    if (nextKey.equals("select-index")) {
                        if (!readableMap.isNull(nextKey)) {
                            i3 = readableMap.getInt(nextKey, 0);
                        }
                        setSelect(i3);
                        continue;
                    }
                    break;
                case 1095253835:
                    if (nextKey.equals("text-bold-mode")) {
                        setTextBoldMode(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1219787336:
                    if (nextKey.equals("unselected-text-size")) {
                        if (!readableMap.isNull(nextKey)) {
                            f2 = (float) readableMap.getDouble(nextKey, 0.0d);
                        }
                        setUnSelectedTextSize(f2);
                        continue;
                    }
                    break;
                case 1581826371:
                    if (nextKey.equals("tabbar-drag")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setTabBarDragEnable(z);
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
            Covode.recordClassIndex(22551);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class f implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxViewPager f37495a;

        static {
            Covode.recordClassIndex(22556);
        }

        public final void onViewDetachedFromWindow(View view) {
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f37496a;

            static {
                Covode.recordClassIndex(22557);
            }

            a(f fVar) {
                this.f37496a = fVar;
            }

            public final void run() {
                Integer num;
                int i2;
                LynxViewPager lynxViewPager = this.f37496a.f37495a;
                c cVar = lynxViewPager.f37487b;
                if (cVar == null) {
                    l.a("mPager");
                }
                TabLayout mTabLayout = cVar.getMTabLayout();
                TabLayout.f fVar = null;
                if (mTabLayout != null) {
                    num = Integer.valueOf(mTabLayout.getSelectedTabPosition());
                } else {
                    num = null;
                }
                c cVar2 = lynxViewPager.f37487b;
                if (cVar2 == null) {
                    l.a("mPager");
                }
                TabLayout mTabLayout2 = cVar2.getMTabLayout();
                if (mTabLayout2 != null) {
                    if (num != null) {
                        i2 = num.intValue();
                    } else {
                        i2 = 0;
                    }
                    fVar = mTabLayout2.getTabAt(i2);
                }
                TabLayout.c cVar3 = lynxViewPager.f37490e;
                if (cVar3 != null) {
                    cVar3.a(fVar);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(LynxViewPager lynxViewPager) {
            this.f37495a = lynxViewPager;
        }

        public final void onViewAttachedToWindow(View view) {
            LynxViewPager.a(this.f37495a).post(new a(this));
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public void layoutChildren() {
        j jVar = this.mContext;
        l.a((Object) jVar, "");
        if (jVar.q) {
            for (LynxBaseUI lynxBaseUI : this.mChildren) {
                if (!(lynxBaseUI instanceof LynxUI) || androidx.core.h.v.y(((LynxUI) lynxBaseUI).mView)) {
                    if (!needCustomLayout()) {
                        lynxBaseUI.layout();
                    } else if (lynxBaseUI instanceof UIGroup) {
                        ((UIGroup) lynxBaseUI).layoutChildren();
                    }
                }
            }
            return;
        }
        List list = this.mChildren;
        l.a((Object) list, "");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            LynxBaseUI lynxBaseUI2 = (LynxBaseUI) this.mChildren.get(i2);
            boolean z = lynxBaseUI2 instanceof LynxUI;
            if (!z || androidx.core.h.v.y(((LynxUI) lynxBaseUI2).mView)) {
                if (!needCustomLayout()) {
                    if (z) {
                        lynxBaseUI2.layout();
                    }
                } else if (lynxBaseUI2 instanceof UIGroup) {
                    ((UIGroup) lynxBaseUI2).layoutChildren();
                }
            }
        }
    }

    public static final class b implements c.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxViewPager f37491a;

        static {
            Covode.recordClassIndex(22552);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(LynxViewPager lynxViewPager) {
            this.f37491a = lynxViewPager;
        }

        @Override // com.bytedance.ies.xelement.viewpager.c.e
        public final void a(boolean z) {
            j jVar;
            if (z && (jVar = this.f37491a.mContext) != null && jVar.f55898f != null) {
                jVar.f55898f.f56472d = true;
            }
        }
    }

    public static final class c implements TabLayout.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxViewPager f37492a;

        static {
            Covode.recordClassIndex(22553);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(LynxViewPager lynxViewPager) {
            this.f37492a = lynxViewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.b
        public final void b(TabLayout.f fVar) {
            View view;
            TextView textView;
            if (fVar != null && (view = fVar.f52655f) != null && (textView = (TextView) view.findViewById(16908308)) != null) {
                LynxViewPager.a(this.f37492a).setUnSelectedTextStyle(textView);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.b
        public final void a(TabLayout.f fVar) {
            View view;
            TextView textView;
            int i2;
            String str;
            TabLayout.f tabAt;
            if (!(fVar == null || (view = fVar.f52655f) == null || (textView = (TextView) view.findViewById(16908308)) == null)) {
                LynxViewPager.a(this.f37492a).setSelectedTextStyle(textView);
                if (this.f37492a.f37486a) {
                    LynxViewPager lynxViewPager = this.f37492a;
                    String obj = textView.getText().toString();
                    TabLayout mTabLayout = LynxViewPager.a(this.f37492a).getMTabLayout();
                    if (mTabLayout != null) {
                        i2 = mTabLayout.getTabCount();
                    } else {
                        i2 = 0;
                    }
                    int i3 = 0;
                    while (true) {
                        str = "";
                        if (i3 >= i2) {
                            i3 = 0;
                            break;
                        }
                        if (!(mTabLayout == null || (tabAt = mTabLayout.getTabAt(i3)) == null)) {
                            l.a((Object) tabAt, str);
                            if (tabAt == fVar) {
                                break;
                            }
                        }
                        i3++;
                    }
                    if (!this.f37492a.f37489d) {
                        if (this.f37492a.f37488c == fVar) {
                            str = "click";
                        } else {
                            str = "slide";
                        }
                    }
                    lynxViewPager.a(obj, i3, str);
                    this.f37492a.f37489d = false;
                }
            }
            this.f37492a.f37488c = null;
        }
    }

    public static final class d implements c.AbstractC0920c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxViewPager f37493a;

        static {
            Covode.recordClassIndex(22554);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(LynxViewPager lynxViewPager) {
            this.f37493a = lynxViewPager;
        }

        @Override // com.bytedance.ies.xelement.viewpager.c.AbstractC0920c
        public final void a(TabLayout.f fVar) {
            l.c(fVar, "");
            this.f37493a.f37488c = fVar;
        }
    }

    public static final class e implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxViewPager f37494a;

        static {
            Covode.recordClassIndex(22555);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(LynxViewPager lynxViewPager) {
            this.f37494a = lynxViewPager;
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            if (this.f37494a.f37486a && LynxViewPager.a(this.f37494a).getMTabLayout() == null) {
                this.f37494a.a("", i2, "slide");
            }
        }
    }

    public LynxViewPager(j jVar) {
        super(jVar);
    }

    public static final /* synthetic */ c a(LynxViewPager lynxViewPager) {
        c cVar = lynxViewPager.f37487b;
        if (cVar == null) {
            l.a("mPager");
        }
        return cVar;
    }

    @m(a = "border-height")
    public final void setBorderHeight(float f2) {
        c cVar = this.f37487b;
        if (cVar == null) {
            l.a("mPager");
        }
        cVar.setBorderHeight(f2);
    }

    @m(a = com.bytedance.ies.xelement.pickview.b.b.f37375d)
    public final void setBorderWidth(float f2) {
        c cVar = this.f37487b;
        if (cVar == null) {
            l.a("mPager");
        }
        cVar.setBorderWidth(f2);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setEvents(Map<String, com.lynx.tasm.c.a> map) {
        super.setEvents(map);
        if (map != null) {
            this.f37486a = map.containsKey("change");
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setLynxDirection(int i2) {
        super.setLynxDirection(i2);
        c cVar = this.f37487b;
        if (cVar == null) {
            l.a("mPager");
        }
        cVar.setLynxDirection(i2);
    }

    @m(a = "selected-text-size")
    public final void setSelectedTextSize(float f2) {
        c cVar = this.f37487b;
        if (cVar == null) {
            l.a("mPager");
        }
        cVar.setSelectedTextSize(f2);
    }

    @m(a = "tabbar-drag")
    public final void setTabBarDragEnable(boolean z) {
        c cVar = this.f37487b;
        if (cVar == null) {
            l.a("mPager");
        }
        cVar.setTabBarDragEnable(z);
    }

    @m(a = "tab-height")
    public final void setTabHeight(float f2) {
        c cVar = this.f37487b;
        if (cVar == null) {
            l.a("mPager");
        }
        cVar.a(f2, false);
    }

    @m(a = "tab-height-rpx")
    public final void setTabHeightRpx(float f2) {
        c cVar = this.f37487b;
        if (cVar == null) {
            l.a("mPager");
        }
        cVar.a(f2, true);
    }

    @m(a = "tab-indicator-height")
    public final void setTabIndicatorHeight(float f2) {
        c cVar = this.f37487b;
        if (cVar == null) {
            l.a("mPager");
        }
        cVar.setTabIndicatorHeight(f2);
    }

    @m(a = "tab-indicator-radius")
    public final void setTabIndicatorRadius(float f2) {
        c cVar = this.f37487b;
        if (cVar == null) {
            l.a("mPager");
        }
        cVar.setTabIndicatorRadius(f2);
    }

    @m(a = "tab-indicator-width")
    public final void setTabIndicatorWidth(float f2) {
        c cVar = this.f37487b;
        if (cVar == null) {
            l.a("mPager");
        }
        cVar.setTabIndicatorWidth(f2);
    }

    @m(a = "tab-inter-space")
    public final void setTabInterspace(float f2) {
        c cVar = this.f37487b;
        if (cVar == null) {
            l.a("mPager");
        }
        cVar.setTabInterspace(f2);
    }

    @m(a = "tab-padding-bottom")
    public final void setTabPaddingBottom(int i2) {
        c cVar = this.f37487b;
        if (cVar == null) {
            l.a("mPager");
        }
        cVar.setTabPaddingBottom(i2);
    }

    @m(a = "tab-padding-left")
    public final void setTabPaddingLeft(int i2) {
        c cVar = this.f37487b;
        if (cVar == null) {
            l.a("mPager");
        }
        cVar.setTabPaddingStart(i2);
    }

    @m(a = "tab-padding-right")
    public final void setTabPaddingRight(int i2) {
        c cVar = this.f37487b;
        if (cVar == null) {
            l.a("mPager");
        }
        cVar.setTabPaddingEnd(i2);
    }

    @m(a = "tab-padding-top")
    public final void setTabPaddingTop(int i2) {
        c cVar = this.f37487b;
        if (cVar == null) {
            l.a("mPager");
        }
        cVar.setTabPaddingTop(i2);
    }

    @m(a = "unselected-text-size")
    public final void setUnSelectedTextSize(float f2) {
        c cVar = this.f37487b;
        if (cVar == null) {
            l.a("mPager");
        }
        cVar.setUnSelectedTextSize(f2);
    }

    public static final class g implements LynxViewpagerItem.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxViewPager f37497a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f37498b;

        static {
            Covode.recordClassIndex(22558);
        }

        @Override // com.bytedance.ies.xelement.viewpager.childitem.LynxViewpagerItem.b
        public final void a(String str) {
            l.c(str, "");
            c a2 = LynxViewPager.a(this.f37497a);
            int i2 = this.f37498b;
            l.c(str, "");
            a2.f37508d.set(i2, str);
            a2.f37505a.notifyDataSetChanged();
            a2.a();
        }

        g(LynxViewPager lynxViewPager, int i2) {
            this.f37497a = lynxViewPager;
            this.f37498b = i2;
        }
    }

    @m(a = "background")
    public final void setBackground(String str) {
        l.c(str, "");
        c cVar = this.f37487b;
        if (cVar == null) {
            l.a("mPager");
        }
        cVar.setBackgroundColor(com.bytedance.ies.xelement.viewpager.a.a.a(str));
    }

    @m(a = com.bytedance.ies.xelement.pickview.b.b.f37376e)
    public final void setBorderLineColor(String str) {
        l.c(str, "");
        c cVar = this.f37487b;
        if (cVar == null) {
            l.a("mPager");
        }
        cVar.setBorderLineColor(str);
    }

    @m(a = "selected-text-color")
    public final void setSelectedTextColor(String str) {
        l.c(str, "");
        c cVar = this.f37487b;
        if (cVar == null) {
            l.a("mPager");
        }
        cVar.setSelectedTextColor(str);
    }

    @m(a = "tab-indicator-color")
    public final void setTabIndicatorColor(String str) {
        l.c(str, "");
        c cVar = this.f37487b;
        if (cVar == null) {
            l.a("mPager");
        }
        cVar.setSelectedTabIndicatorColor(str);
    }

    @m(a = "tabbar-background")
    public final void setTabbarBackground(String str) {
        l.c(str, "");
        c cVar = this.f37487b;
        if (cVar == null) {
            l.a("mPager");
        }
        cVar.setTabbarBackground(str);
    }

    @m(a = "tab-layout-gravity")
    public final void setTablayoutGravity(String str) {
        l.c(str, "");
        c cVar = this.f37487b;
        if (cVar == null) {
            l.a("mPager");
        }
        cVar.setTablayoutGravity(str);
    }

    @m(a = "text-bold-mode")
    public final void setTextBoldMode(String str) {
        l.c(str, "");
        c cVar = this.f37487b;
        if (cVar == null) {
            l.a("mPager");
        }
        cVar.setTextBold(str);
    }

    @m(a = "unselected-text-color")
    public final void setUnSelectedTextColor(String str) {
        l.c(str, "");
        c cVar = this.f37487b;
        if (cVar == null) {
            l.a("mPager");
        }
        cVar.setUnSelectedTextColor(str);
    }

    @m(a = "hide-indicator")
    public final void setIndicatorVisibility(String str) {
        l.c(str, "");
        if (l.a((Object) str, (Object) "true")) {
            c cVar = this.f37487b;
            if (cVar == null) {
                l.a("mPager");
            }
            TabLayout mTabLayout = cVar.getMTabLayout();
            if (mTabLayout != null) {
                mTabLayout.setSelectedTabIndicator((Drawable) null);
            }
        }
    }

    @m(a = "select-index")
    public final void setSelect(int i2) {
        c cVar = this.f37487b;
        if (cVar == null) {
            l.a("mPager");
        }
        TabLayout mTabLayout = cVar.getMTabLayout();
        if (mTabLayout == null || mTabLayout.getSelectedTabPosition() != i2) {
            if (i2 >= 0) {
                c cVar2 = this.f37487b;
                if (cVar2 == null) {
                    l.a("mPager");
                }
                PagerAdapter adapter = cVar2.getMViewPager().getAdapter();
                if (adapter != null && i2 < adapter.getCount()) {
                    c cVar3 = this.f37487b;
                    if (cVar3 == null) {
                        l.a("mPager");
                    }
                    cVar3.setCurrentSelectIndex(i2);
                }
            }
            c cVar4 = this.f37487b;
            if (cVar4 == null) {
                l.a("mPager");
            }
            cVar4.setSelectedIndex(i2);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public /* synthetic */ View createView(Context context) {
        if (context == null) {
            return null;
        }
        c cVar = new c(context);
        this.f37487b = cVar;
        cVar.setInterceptTouchEventListener(new b(this));
        c cVar2 = this.f37487b;
        if (cVar2 == null) {
            l.a("mPager");
        }
        cVar2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        c cVar3 = this.f37487b;
        if (cVar3 == null) {
            l.a("mPager");
        }
        cVar3.setRTLMode(isRtl());
        this.f37490e = new c(this);
        c cVar4 = this.f37487b;
        if (cVar4 == null) {
            l.a("mPager");
        }
        TabLayout.c cVar5 = this.f37490e;
        if (cVar5 == null) {
            l.a();
        }
        cVar4.setTabSelectedListener$x_element_fold_view_newelement(cVar5);
        c cVar6 = this.f37487b;
        if (cVar6 == null) {
            l.a("mPager");
        }
        cVar6.setTabClickListenerListener(new d(this));
        c cVar7 = this.f37487b;
        if (cVar7 == null) {
            l.a("mPager");
        }
        cVar7.getMViewPager().addOnPageChangeListener(new e(this));
        c cVar8 = this.f37487b;
        if (cVar8 == null) {
            l.a("mPager");
        }
        cVar8.addOnAttachStateChangeListener(new f(this));
        c cVar9 = this.f37487b;
        if (cVar9 != null) {
            return cVar9;
        }
        l.a("mPager");
        return cVar9;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public void removeChild(LynxBaseUI lynxBaseUI) {
        l.c(lynxBaseUI, "");
        if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.remove(lynxBaseUI);
            lynxBaseUI.setParent(null);
            if (lynxBaseUI instanceof LynxViewpagerItem) {
                LynxViewpagerItem lynxViewpagerItem = (LynxViewpagerItem) lynxBaseUI;
                if (lynxViewpagerItem.getProps().hasKey("tag")) {
                    c cVar = this.f37487b;
                    if (cVar == null) {
                        l.a("mPager");
                    }
                    String valueOf = String.valueOf(lynxViewpagerItem.f37531a);
                    l.c(valueOf, "");
                    if (valueOf.length() != 0) {
                        if (cVar.f37508d.contains(valueOf)) {
                            cVar.f37508d.remove(valueOf);
                        }
                        if (cVar.f37508d.size() > 0) {
                            cVar.a((TabLayout) null);
                        }
                    }
                }
                c cVar2 = this.f37487b;
                if (cVar2 == null) {
                    l.a("mPager");
                }
                l.c(lynxViewpagerItem, "");
                cVar2.f37507c.remove(lynxViewpagerItem);
                cVar2.f37505a.notifyDataSetChanged();
                cVar2.a();
            } else if (lynxBaseUI instanceof LynxTabBarView) {
                c cVar3 = this.f37487b;
                if (cVar3 == null) {
                    l.a("mPager");
                }
                cVar3.a((View) ((LynxTabBarView) lynxBaseUI).a());
            } else {
                LLog.a(6, "LynxViewPager", "x-viewpager's child illegal, please check behaviors or child tag");
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public void insertChild(LynxBaseUI lynxBaseUI, int i2) {
        l.c(lynxBaseUI, "");
        if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.add(i2, lynxBaseUI);
            lynxBaseUI.setParent(this);
            if (lynxBaseUI instanceof LynxViewpagerItem) {
                LynxViewpagerItem lynxViewpagerItem = (LynxViewpagerItem) lynxBaseUI;
                if (lynxViewpagerItem.getProps().hasKey("tag")) {
                    c cVar = this.f37487b;
                    if (cVar == null) {
                        l.a("mPager");
                    }
                    String valueOf = String.valueOf(lynxViewpagerItem.f37531a);
                    l.c(valueOf, "");
                    cVar.f37508d.add(valueOf);
                    if (valueOf.length() > 0) {
                        cVar.a((TabLayout) null);
                    }
                    g gVar = new g(this, i2);
                    l.c(gVar, "");
                    lynxViewpagerItem.f37532b = gVar;
                }
                c cVar2 = this.f37487b;
                if (cVar2 == null) {
                    l.a("mPager");
                }
                l.c(lynxViewpagerItem, "");
                cVar2.f37507c.add(lynxViewpagerItem);
                cVar2.f37505a.notifyDataSetChanged();
                cVar2.a();
            } else if (lynxBaseUI instanceof LynxTabBarView) {
                c cVar3 = this.f37487b;
                if (cVar3 == null) {
                    l.a("mPager");
                }
                cVar3.setTabLayout((LynxTabBarView) lynxBaseUI);
            } else {
                LLog.a(6, "LynxViewPager", "x-viewpager's child illegal, please check behaviors or child tag");
            }
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
                c cVar = this.f37487b;
                if (cVar == null) {
                    l.a("mPager");
                }
                PagerAdapter adapter = cVar.getMViewPager().getAdapter();
                if (adapter != null && i2 < adapter.getCount()) {
                    c cVar2 = this.f37487b;
                    if (cVar2 == null) {
                        l.a("mPager");
                    }
                    cVar2.setCurrentSelectIndex(i2);
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

    public final void a(String str, int i2, String str2) {
        j jVar = this.mContext;
        l.a((Object) jVar, "");
        com.lynx.tasm.c cVar = jVar.f55897e;
        com.lynx.tasm.c.c cVar2 = new com.lynx.tasm.c.c(getSign(), "change");
        cVar2.a("tag", str);
        cVar2.a("index", Integer.valueOf(i2));
        cVar2.a("scene", str2);
        cVar.a(cVar2);
    }
}
