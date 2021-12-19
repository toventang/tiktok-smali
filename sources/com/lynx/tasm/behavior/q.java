package com.lynx.tasm.behavior;

import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.TemplateAssembler;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.UIShadowProxy;
import com.lynx.tasm.behavior.ui.swiper.XSwiperUI;
import com.lynx.tasm.c.a;
import com.lynx.tasm.image.LynxFlattenImageUI;
import com.lynx.tasm.image.LynxImageUI;
import com.lynx.tasm.utils.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class q {

    /* renamed from: a  reason: collision with root package name */
    public int f55931a = -1;

    /* renamed from: b  reason: collision with root package name */
    public UIBody f55932b;

    /* renamed from: c  reason: collision with root package name */
    public j f55933c;

    /* renamed from: d  reason: collision with root package name */
    final HashSet<String> f55934d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<Integer, LynxBaseUI> f55935e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap<Integer, Integer> f55936f = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    public boolean f55937g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f55938h;

    /* renamed from: i  reason: collision with root package name */
    public TemplateAssembler f55939i;

    /* renamed from: j  reason: collision with root package name */
    private final HashMap<Integer, LynxBaseUI> f55940j = new HashMap<>();

    /* renamed from: k  reason: collision with root package name */
    private final c f55941k;

    static {
        Covode.recordClassIndex(34953);
    }

    public final synchronized void a(int i2, String str, v vVar, Map<String, a> map, boolean z) {
        MethodCollector.i(12589);
        String concat = "UIOwner.createView.".concat(String.valueOf(str));
        TraceEvent.a(0, concat);
        m.b();
        LynxBaseUI b2 = b(a(i2, str, map, z), vVar);
        this.f55934d.add(str);
        a(i2, str, vVar);
        this.f55935e.put(Integer.valueOf(i2), b2);
        TraceEvent.b(0, concat);
        MethodCollector.o(12589);
    }

    public final UIShadowProxy a(LynxBaseUI lynxBaseUI, v vVar) {
        UIShadowProxy uIShadowProxy = null;
        if (vVar != null) {
            if (a(vVar)) {
                uIShadowProxy = new UIShadowProxy(this.f55933c, lynxBaseUI);
            }
            lynxBaseUI.updatePropertiesInterval(vVar);
        }
        return uIShadowProxy;
    }

    public final LynxBaseUI a(int i2, String str, Map<String, a> map, boolean z) {
        LynxBaseUI a2;
        if (this.f55931a >= 0 || !str.equals("page")) {
            a2 = a(str, z);
            a2.setEvents(map);
        } else {
            a2 = this.f55932b;
            this.f55931a = i2;
        }
        a2.setSign(i2, str);
        return a2;
    }

    public final void a(int i2, boolean z) {
        if (this.f55933c.r) {
            b(i2, z);
            return;
        }
        LynxBaseUI lynxBaseUI = this.f55935e.get(Integer.valueOf(i2));
        String str = "UIOwner.updateFlatten." + lynxBaseUI.mTagName;
        TraceEvent.a(0, str);
        lynxBaseUI.destroy();
        LynxBaseUI a2 = a(lynxBaseUI.mTagName, z);
        a2.setSign(lynxBaseUI.getSign(), lynxBaseUI.mTagName);
        b(a2, new v(lynxBaseUI.getProps()));
        this.f55935e.put(Integer.valueOf(lynxBaseUI.getSign()), a2);
        TraceEvent.b(0, str);
    }

    public final void a(int i2, int i3, int i4) {
        if (this.f55933c.r) {
            if (this.f55935e.size() > 0) {
                LynxBaseUI lynxBaseUI = this.f55935e.get(Integer.valueOf(i2));
                LynxBaseUI lynxBaseUI2 = this.f55935e.get(Integer.valueOf(i3));
                if (lynxBaseUI == null || lynxBaseUI2 == null) {
                    throw new RuntimeException("Trying to add unknown ui signature: ".concat(String.valueOf(i3)));
                }
                if (!lynxBaseUI.canHaveFlattenChild() && lynxBaseUI2.isFlatten()) {
                    b(i3, false);
                    lynxBaseUI2 = this.f55935e.get(Integer.valueOf(i3));
                }
                lynxBaseUI.insertChild(lynxBaseUI2, i4);
                a(lynxBaseUI, lynxBaseUI2, i4);
                if (lynxBaseUI2.isFlatten()) {
                    e(lynxBaseUI2);
                }
            }
        } else if (this.f55935e.size() > 0) {
            LynxBaseUI lynxBaseUI3 = this.f55935e.get(Integer.valueOf(i2));
            LynxBaseUI lynxBaseUI4 = this.f55935e.get(Integer.valueOf(i3));
            if (lynxBaseUI3 == null || lynxBaseUI4 == null) {
                throw new RuntimeException("Trying to add unknown ui signature: ".concat(String.valueOf(i3)));
            }
            String str = "UIOwner.insert." + lynxBaseUI3.mTagName + "." + lynxBaseUI4.mTagName;
            TraceEvent.a(0, str);
            lynxBaseUI3.insertChild(lynxBaseUI4, i4);
            TraceEvent.b(0, str);
        }
    }

    public final void a(int i2, int i3) {
        if (this.f55933c.r) {
            if (this.f55935e.size() > 0) {
                LynxBaseUI lynxBaseUI = this.f55935e.get(Integer.valueOf(i2));
                LynxBaseUI lynxBaseUI2 = this.f55935e.get(Integer.valueOf(i3));
                if (lynxBaseUI == null || lynxBaseUI2 == null) {
                    throw new RuntimeException("Trying to remove unknown ui signature: ".concat(String.valueOf(i3)));
                }
                String str = "UIOwner.remove." + lynxBaseUI.mTagName + "." + lynxBaseUI2.mTagName;
                TraceEvent.a(0, str);
                a(lynxBaseUI2);
                lynxBaseUI.removeChild(lynxBaseUI2);
                d(lynxBaseUI2);
                TraceEvent.b(0, str);
            }
        } else if (this.f55935e.size() > 0) {
            LynxBaseUI lynxBaseUI3 = this.f55935e.get(Integer.valueOf(i2));
            LynxBaseUI lynxBaseUI4 = this.f55935e.get(Integer.valueOf(i3));
            if (lynxBaseUI3 == null || lynxBaseUI4 == null) {
                throw new RuntimeException("Trying to remove unknown ui signature: ".concat(String.valueOf(i3)));
            }
            String str2 = "UIOwner.remove." + lynxBaseUI3.mTagName + "." + lynxBaseUI4.mTagName;
            TraceEvent.a(0, str2);
            lynxBaseUI3.removeChild(lynxBaseUI4);
            TraceEvent.b(0, str2);
        }
    }

    public final LynxBaseUI a(String str, LynxBaseUI lynxBaseUI) {
        LynxBaseUI a2;
        LynxBaseUI a3;
        if (!(lynxBaseUI == null || lynxBaseUI.mIdSelector == null || !lynxBaseUI.mIdSelector.equals(str))) {
            return lynxBaseUI;
        }
        if (!this.f55933c.r) {
            if (lynxBaseUI instanceof LynxFlattenUI) {
                lynxBaseUI = lynxBaseUI.getParentBaseUI();
            }
            if (!(lynxBaseUI instanceof UIGroup)) {
                return null;
            }
            UIGroup uIGroup = (UIGroup) lynxBaseUI;
            for (int i2 = 0; i2 < uIGroup.getChildCount(); i2++) {
                LynxBaseUI childAt = uIGroup.getChildAt(i2);
                if (childAt.mIdSelector != null && childAt.mIdSelector.equals(str)) {
                    return childAt;
                }
                if (!(childAt.mTagName.equals("component") || !(childAt instanceof UIGroup) || (a2 = a(str, childAt)) == null)) {
                    return a2;
                }
            }
        } else if (lynxBaseUI == null) {
            return null;
        } else {
            for (LynxBaseUI lynxBaseUI2 : lynxBaseUI.getChildren()) {
                if (lynxBaseUI2.mIdSelector != null && lynxBaseUI2.mIdSelector.equals(str)) {
                    return lynxBaseUI2;
                }
                if (!(lynxBaseUI2.mTagName.equals("component") || (a3 = a(str, lynxBaseUI2)) == null)) {
                    return a3;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final LynxBaseUI a(String str, boolean z) {
        LynxBaseUI a2;
        LynxBaseUI b2 = b() ? b(str, z) : null;
        if (c()) {
            b2 = a(str);
        }
        if (b2 != null) {
            return b2;
        }
        a a3 = this.f55941k.a(str);
        if (z) {
            a2 = a3.b(this.f55933c);
        } else {
            a2 = a3.a(this.f55933c);
        }
        return a2 == null ? a3.a(this.f55933c) : a2;
    }

    public final void a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, Rect rect, float[] fArr, int i15) {
        int i16;
        LynxBaseUI lynxBaseUI = this.f55935e.get(Integer.valueOf(i2));
        if (lynxBaseUI != null) {
            lynxBaseUI.updateLayoutSize(i5, i6);
            com.lynx.tasm.a.c.a transitionAnimator = lynxBaseUI.getTransitionAnimator();
            String str = "UIOwner.setLayoutData." + lynxBaseUI.mTagName;
            TraceEvent.a(0, str);
            if (transitionAnimator != null && transitionAnimator.b() && !this.f55937g) {
                transitionAnimator.a(lynxBaseUI, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, 0, 0, 0, 0, rect);
                this.f55932b.invalidate();
            } else if (!lynxBaseUI.enableLayoutAnimation() || this.f55937g || (i2 == (i16 = this.f55931a) && (i2 != i16 || !this.f55938h))) {
                lynxBaseUI = lynxBaseUI;
                lynxBaseUI.setLayoutData(i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, rect);
            } else {
                lynxBaseUI.getLayoutAnimator().a(lynxBaseUI instanceof UIShadowProxy ? (LynxUI) ((UIShadowProxy) lynxBaseUI).f56071a : (LynxUI) lynxBaseUI, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, 0, 0, 0, 0, rect);
                this.f55932b.invalidate();
            }
            lynxBaseUI.onAnimatedNodeReady();
            lynxBaseUI.updateSticky(fArr);
            lynxBaseUI.mMaxHeight = (float) i15;
            TraceEvent.b(0, str);
            return;
        }
        throw new RuntimeException("Trying to operation unknown ui signature: ".concat(String.valueOf(i2)));
    }

    public final void a(int i2, String str, v vVar) {
        if (str.equals("component") && vVar.a("ComponentID")) {
            this.f55936f.put(Integer.valueOf(vVar.a("ComponentID", -1)), Integer.valueOf(i2));
        }
    }

    public final Set<String> a() {
        HashSet hashSet = new HashSet(this.f55934d);
        this.f55934d.clear();
        return hashSet;
    }

    private boolean b() {
        com.lynx.tasm.q qVar;
        TemplateAssembler templateAssembler = this.f55939i;
        if (templateAssembler == null || (qVar = templateAssembler.f55580j) == null) {
            return false;
        }
        return qVar.f56830e;
    }

    private boolean c() {
        com.lynx.tasm.q qVar;
        TemplateAssembler templateAssembler = this.f55939i;
        if (templateAssembler == null || (qVar = templateAssembler.f55580j) == null) {
            return false;
        }
        return qVar.f56834i;
    }

    public static LynxBaseUI c(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI instanceof UIShadowProxy) {
            return ((UIShadowProxy) lynxBaseUI).f56071a;
        }
        return lynxBaseUI;
    }

    private LynxBaseUI a(String str) {
        if ("swiper".equals(str) || "x-swiper".equals(str)) {
            return new XSwiperUI(this.f55933c);
        }
        return null;
    }

    private static void d(LynxBaseUI lynxBaseUI) {
        lynxBaseUI.mBound = null;
        lynxBaseUI.setLeft(lynxBaseUI.getOriginLeft());
        lynxBaseUI.setTop(lynxBaseUI.getOriginTop());
    }

    private void e(LynxBaseUI lynxBaseUI) {
        int i2 = 0;
        for (LynxBaseUI lynxBaseUI2 : lynxBaseUI.getChildren()) {
            int i3 = i2 + 1;
            a(lynxBaseUI, lynxBaseUI2, i2);
            if (lynxBaseUI2.isFlatten()) {
                e(lynxBaseUI2);
            }
            i2 = i3;
        }
    }

    static Map<String, a> a(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        androidx.c.a aVar = new androidx.c.a();
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            ReadableMap map = readableArray.getMap(i2);
            a aVar2 = new a(map.getString(StringSet.name), map.getString(StringSet.type), map.getString("function"));
            aVar.put(aVar2.f56485a, aVar2);
        }
        return aVar;
    }

    public final LynxBaseUI b(int i2) {
        if (i2 == -1) {
            return this.f55932b;
        }
        if (this.f55936f.containsKey(Integer.valueOf(i2))) {
            i2 = this.f55936f.get(Integer.valueOf(i2)).intValue();
        }
        return a(i2);
    }

    public final void c(int i2) {
        TraceEvent.a(0, "UIOwner.destroy");
        if (this.f55935e.size() > 0) {
            LynxBaseUI lynxBaseUI = this.f55935e.get(Integer.valueOf(i2));
            if (lynxBaseUI == null) {
                TraceEvent.b(0, "UIOwner.destroy");
                return;
            }
            LynxBaseUI parentBaseUI = lynxBaseUI.getParentBaseUI();
            if (parentBaseUI == null) {
                TraceEvent.b(0, "UIOwner.destroy");
                return;
            }
            parentBaseUI.removeChildFiber(lynxBaseUI);
            this.f55935e.remove(Integer.valueOf(i2));
            lynxBaseUI.destroy();
            b(lynxBaseUI);
        }
        TraceEvent.b(0, "UIOwner.destroy");
    }

    public static void a(LynxBaseUI lynxBaseUI) {
        UIGroup uIGroup = (UIGroup) lynxBaseUI.getDrawParent();
        LynxBaseUI parentBaseUI = lynxBaseUI.getParentBaseUI();
        if (!(uIGroup == null || parentBaseUI == null)) {
            if (!lynxBaseUI.isFlatten()) {
                LynxBaseUI lynxBaseUI2 = lynxBaseUI.mPreviousDrawUI;
                LynxBaseUI lynxBaseUI3 = lynxBaseUI.mNextDrawUI;
                if (lynxBaseUI2 != null) {
                    lynxBaseUI2.mNextDrawUI = lynxBaseUI3;
                    if (lynxBaseUI3 != null) {
                        lynxBaseUI3.mPreviousDrawUI = lynxBaseUI2;
                    }
                } else {
                    uIGroup.mDrawHead = lynxBaseUI3;
                    if (lynxBaseUI3 != null) {
                        lynxBaseUI3.mPreviousDrawUI = null;
                    }
                }
                if (parentBaseUI.isFlatten()) {
                    uIGroup.removeView(lynxBaseUI);
                }
                lynxBaseUI.mNextDrawUI = null;
                lynxBaseUI.mPreviousDrawUI = null;
                lynxBaseUI.mDrawParent = null;
                return;
            }
            LynxBaseUI lynxBaseUI4 = lynxBaseUI;
            while (lynxBaseUI4.isFlatten() && !lynxBaseUI4.getChildren().isEmpty()) {
                lynxBaseUI4 = lynxBaseUI4.getChildAt(lynxBaseUI4.getChildren().size() - 1);
            }
            LynxBaseUI lynxBaseUI5 = lynxBaseUI.mPreviousDrawUI;
            if (lynxBaseUI5 != null) {
                lynxBaseUI5.mNextDrawUI = lynxBaseUI4.mNextDrawUI;
                if (lynxBaseUI4.mNextDrawUI != null) {
                    lynxBaseUI4.mNextDrawUI.mPreviousDrawUI = lynxBaseUI5;
                }
            } else {
                uIGroup.mDrawHead = lynxBaseUI4.mNextDrawUI;
                if (lynxBaseUI4.mNextDrawUI != null) {
                    lynxBaseUI4.mNextDrawUI.mPreviousDrawUI = null;
                }
            }
            lynxBaseUI.mPreviousDrawUI = null;
            for (LynxBaseUI lynxBaseUI6 = lynxBaseUI.mNextDrawUI; lynxBaseUI6 != lynxBaseUI4.mNextDrawUI; lynxBaseUI6 = lynxBaseUI6.mNextDrawUI) {
                lynxBaseUI6.mPreviousDrawUI.mNextDrawUI = null;
                lynxBaseUI6.mPreviousDrawUI = null;
                uIGroup.removeView(lynxBaseUI6);
                lynxBaseUI6.mDrawParent = null;
            }
            lynxBaseUI4.mNextDrawUI = null;
            lynxBaseUI.mDrawParent = null;
            parentBaseUI.invalidate();
        }
    }

    public static boolean a(v vVar) {
        if (vVar.a("box-shadow") || vVar.a("outline-color") || vVar.a("outline-style") || vVar.a("outline-width")) {
            return true;
        }
        return false;
    }

    public final LynxBaseUI a(int i2) {
        HashMap<Integer, LynxBaseUI> hashMap = this.f55935e;
        if (hashMap != null) {
            return hashMap.get(Integer.valueOf(i2));
        }
        return null;
    }

    public final void b(LynxBaseUI lynxBaseUI) {
        for (int i2 = 0; i2 < lynxBaseUI.getChildren().size(); i2++) {
            LynxBaseUI childAt = lynxBaseUI.getChildAt(i2);
            childAt.destroy();
            this.f55935e.remove(Integer.valueOf(childAt.getSign()));
            if ((childAt instanceof UIGroup) || this.f55933c.r) {
                b(childAt);
            }
        }
    }

    private LynxBaseUI b(LynxBaseUI lynxBaseUI, v vVar) {
        return a(lynxBaseUI, a(lynxBaseUI, vVar), vVar);
    }

    private LynxBaseUI b(String str, boolean z) {
        if (!"image".equals(str) && !"filter-image".equals(str)) {
            return null;
        }
        if (z) {
            return new LynxFlattenImageUI(this.f55933c);
        }
        return new LynxImageUI(this.f55933c);
    }

    private void b(int i2, boolean z) {
        int i3;
        LynxBaseUI lynxBaseUI = this.f55935e.get(Integer.valueOf(i2));
        LynxBaseUI parentBaseUI = lynxBaseUI.getParentBaseUI();
        v vVar = new v(lynxBaseUI.getProps());
        ArrayList<LynxBaseUI> arrayList = new ArrayList(lynxBaseUI.getChildren());
        String str = "UIOwner.updateFlatten." + lynxBaseUI.mTagName;
        TraceEvent.a(0, str);
        int i4 = 0;
        if (parentBaseUI != null) {
            i3 = parentBaseUI.getIndex(lynxBaseUI);
            a(lynxBaseUI);
            parentBaseUI.removeChild(lynxBaseUI);
        } else {
            i3 = 0;
        }
        if (!lynxBaseUI.isFlatten()) {
            for (LynxBaseUI lynxBaseUI2 : arrayList) {
                a(lynxBaseUI2);
            }
        }
        for (int size = lynxBaseUI.getChildren().size() - 1; size >= 0; size--) {
            lynxBaseUI.removeChild(lynxBaseUI.getChildAt(size));
        }
        LynxBaseUI a2 = a(lynxBaseUI.mTagName, z);
        a2.setSign(lynxBaseUI.getSign(), lynxBaseUI.mTagName);
        b(a2, vVar);
        this.f55935e.put(Integer.valueOf(lynxBaseUI.getSign()), a2);
        if (parentBaseUI != null) {
            parentBaseUI.insertChild(a2, i3);
            a(parentBaseUI, a2, i3);
        }
        for (LynxBaseUI lynxBaseUI3 : arrayList) {
            d(lynxBaseUI3);
            a2.insertChild(lynxBaseUI3, i4);
            i4++;
        }
        e(a2);
        a2.updateLayoutInfo(lynxBaseUI);
        a2.copyAnimationRelatedPropFromOldUI(lynxBaseUI);
        if (a2 instanceof UIGroup) {
            ((UIGroup) a2).layoutChildren();
        }
        a2.invalidate();
        lynxBaseUI.destroy();
        TraceEvent.b(0, str);
    }

    public final LynxBaseUI b(String str, LynxBaseUI lynxBaseUI) {
        LynxBaseUI b2;
        LynxBaseUI b3;
        if (!(lynxBaseUI == null || lynxBaseUI.mRefId == null || !lynxBaseUI.mRefId.equals(str))) {
            return lynxBaseUI;
        }
        if (!this.f55933c.r) {
            if (lynxBaseUI instanceof LynxFlattenUI) {
                lynxBaseUI = lynxBaseUI.getParentBaseUI();
            }
            if (!(lynxBaseUI instanceof UIGroup)) {
                return null;
            }
            UIGroup uIGroup = (UIGroup) lynxBaseUI;
            for (int i2 = 0; i2 < uIGroup.getChildCount(); i2++) {
                LynxBaseUI childAt = uIGroup.getChildAt(i2);
                if (childAt.mRefId != null && childAt.mRefId.equals(str)) {
                    return childAt;
                }
                if (!(childAt.mTagName.equals("component") || !(childAt instanceof UIGroup) || (b2 = b(str, childAt)) == null)) {
                    return b2;
                }
            }
        } else if (lynxBaseUI == null) {
            return null;
        } else {
            for (LynxBaseUI lynxBaseUI2 : lynxBaseUI.getChildren()) {
                if (lynxBaseUI2.mRefId != null && lynxBaseUI2.mRefId.equals(str)) {
                    return lynxBaseUI2;
                }
                if (!(lynxBaseUI2.mTagName.equals("component") || (b3 = b(str, lynxBaseUI2)) == null)) {
                    return b3;
                }
            }
        }
        return null;
    }

    public q(j jVar, c cVar, UIBody.a aVar) {
        this.f55933c = jVar;
        this.f55941k = cVar;
        UIBody uIBody = new UIBody(this.f55933c, aVar);
        this.f55932b = uIBody;
        this.f55933c.f55901i = uIBody;
        this.f55937g = true;
        this.f55938h = true;
    }

    public static LynxBaseUI a(LynxBaseUI lynxBaseUI, UIShadowProxy uIShadowProxy, v vVar) {
        if (vVar != null) {
            lynxBaseUI.afterPropsUpdated(vVar);
            if (vVar.a("transition")) {
                lynxBaseUI.initTransitionAnimator(vVar.f56468a);
            }
            if (vVar.a("animation")) {
                lynxBaseUI.setAnimation(vVar.d("animation"));
            }
        }
        return uIShadowProxy != null ? uIShadowProxy : lynxBaseUI;
    }

    private static void a(LynxBaseUI lynxBaseUI, LynxBaseUI lynxBaseUI2, int i2) {
        LynxBaseUI lynxBaseUI3;
        if (lynxBaseUI.isFlatten()) {
            lynxBaseUI3 = lynxBaseUI.getDrawParent();
            if (lynxBaseUI3 == null) {
                return;
            }
        } else {
            lynxBaseUI3 = lynxBaseUI;
        }
        if (i2 == 0) {
            LynxUI lynxUI = (LynxUI) lynxBaseUI3;
            if (!lynxBaseUI.isFlatten()) {
                lynxBaseUI = null;
            }
            lynxUI.insertDrawList(lynxBaseUI, lynxBaseUI2);
        } else {
            LynxBaseUI childAt = lynxBaseUI.getChildAt(i2 - 1);
            while (childAt.isFlatten() && !childAt.getChildren().isEmpty()) {
                childAt = childAt.getChildAt(childAt.getChildren().size() - 1);
            }
            ((LynxUI) lynxBaseUI3).insertDrawList(childAt, lynxBaseUI2);
        }
        if (!lynxBaseUI2.isFlatten()) {
            UIGroup uIGroup = (UIGroup) lynxBaseUI3;
            if (uIGroup.mIsInsertViewCalled) {
                uIGroup.insertView((LynxUI) lynxBaseUI2);
            }
        }
    }

    public final void b(int i2, int i3, int i4) {
        if (this.f55935e.size() > 0) {
            LynxBaseUI lynxBaseUI = this.f55935e.get(Integer.valueOf(i2));
            LynxBaseUI lynxBaseUI2 = this.f55935e.get(Integer.valueOf(i3));
            if (lynxBaseUI == null || lynxBaseUI2 == null) {
                throw new RuntimeException("Trying to add unknown ui signature: ".concat(String.valueOf(i3)));
            }
            lynxBaseUI.insertChildFiber(lynxBaseUI2, i4);
        }
    }
}
