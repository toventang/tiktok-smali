package com.bytedance.ies.xelement.viewpager;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.viewpager.b;
import com.bytedance.ies.xelement.viewpager.childitem.LynxFoldHeader;
import com.bytedance.ies.xelement.viewpager.childitem.LynxFoldToolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.w;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public class LynxFoldView extends UISimpleView<b> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f37455e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public b f37456a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f37457b;

    /* renamed from: c  reason: collision with root package name */
    public float f37458c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<LynxBaseUI> f37459d = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private Handler f37460f;

    /* renamed from: g  reason: collision with root package name */
    private final h f37461g = i.a((h.f.a.a) d.f37465a);

    /* renamed from: h  reason: collision with root package name */
    private final h f37462h = i.a((h.f.a.a) b.f37463a);

    static {
        Covode.recordClassIndex(22530);
    }

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_ies_xelement_viewpager_LynxFoldView_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_ies_xelement_viewpager_LynxFoldView_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public boolean needCustomLayout() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(22533);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<Method> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f37463a = new b();

        static {
            Covode.recordClassIndex(22534);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Method invoke() {
            return a();
        }

        private static Method a() {
            Class superclass = AppBarLayout.Behavior.class.getSuperclass();
            Method method = null;
            if (superclass != null) {
                try {
                    method = superclass.getDeclaredMethod("animateOffsetTo", CoordinatorLayout.class, AppBarLayout.class, Integer.TYPE, Float.TYPE);
                } catch (Exception e2) {
                    LLog.a(6, "LynxFoldView", "init animateOffsetToMethod error " + e2.getMessage());
                }
            }
            if (method != null) {
                method.setAccessible(true);
            }
            return method;
        }
    }

    static final class d extends m implements h.f.a.a<Method> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f37465a = new d();

        static {
            Covode.recordClassIndex(22536);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Method invoke() {
            return a();
        }

        private static Method a() {
            Class superclass = AppBarLayout.Behavior.class.getSuperclass();
            Method method = null;
            if (superclass != null) {
                try {
                    method = superclass.getDeclaredMethod("setHeaderTopBottomOffset", CoordinatorLayout.class, AppBarLayout.class, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                } catch (Exception e2) {
                    LLog.a(6, "LynxFoldView", "init animateOffsetToMethod error " + e2.getMessage());
                }
            }
            if (method != null) {
                method.setAccessible(true);
            }
            return method;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public void removeAll() {
        this.f37459d.clear();
        super.removeAll();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public void measureChildren() {
        super.measureChildren();
        Iterator<LynxBaseUI> it = this.f37459d.iterator();
        while (it.hasNext()) {
            LynxBaseUI next = it.next();
            if (next != null) {
                next.measure();
            }
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxFoldView f37466a;

        static {
            Covode.recordClassIndex(22537);
        }

        e(LynxFoldView lynxFoldView) {
            this.f37466a = lynxFoldView;
        }

        public final void run() {
            for (LynxBaseUI lynxBaseUI : this.f37466a.getChildren()) {
                if (lynxBaseUI instanceof LynxViewPager) {
                    for (LynxBaseUI lynxBaseUI2 : lynxBaseUI.getChildren()) {
                        if (lynxBaseUI2 instanceof LynxTabBarView) {
                            LynxFoldView lynxFoldView = this.f37466a;
                            if (lynxBaseUI2 != null) {
                                lynxFoldView.f37459d.add(lynxBaseUI2);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public void layoutChildren() {
        super.layoutChildren();
        Iterator<LynxBaseUI> it = this.f37459d.iterator();
        while (it.hasNext()) {
            LynxBaseUI next = it.next();
            if (needCustomLayout() && (next instanceof UIGroup)) {
                ((UIGroup) next).layoutChildren();
            }
        }
    }

    public static final class c implements AppBarLayout.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxFoldView f37464a;

        static {
            Covode.recordClassIndex(22535);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(LynxFoldView lynxFoldView) {
            this.f37464a = lynxFoldView;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.a
        public final void a(AppBarLayout appBarLayout, int i2) {
            this.f37464a.recognizeGesturere();
            j jVar = this.f37464a.mContext;
            l.a((Object) jVar, "");
            jVar.c().b();
            if (this.f37464a.f37457b) {
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) LynxFoldView.a(this.f37464a).b(R.id.a8d);
                l.a((Object) collapsingToolbarLayout, "");
                int height = collapsingToolbarLayout.getHeight();
                Toolbar toolbar = (Toolbar) LynxFoldView.a(this.f37464a).b(R.id.fnj);
                l.a((Object) toolbar, "");
                int height2 = height - toolbar.getHeight();
                if (height2 != 0) {
                    LLog.a(3, "LynxFoldView", "onOffsetChanged: " + i2 + ", height = " + height2 + ' ');
                    float abs = Math.abs((float) i2) / ((float) height2);
                    if (((double) Math.abs(this.f37464a.f37458c - abs)) >= 0.01d) {
                        j jVar2 = this.f37464a.mContext;
                        l.a((Object) jVar2, "");
                        com.lynx.tasm.c cVar = jVar2.f55897e;
                        com.lynx.tasm.c.c cVar2 = new com.lynx.tasm.c.c(this.f37464a.getSign(), "offset");
                        String a2 = com.a.a("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(abs)}, 1));
                        l.a((Object) a2, "");
                        cVar2.a("offset", a2);
                        cVar.a(cVar2);
                        StringBuilder sb = new StringBuilder("send ");
                        String a3 = com.a.a("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(abs)}, 1));
                        l.a((Object) a3, "");
                        LLog.a(3, "LynxFoldView", sb.append(a3).toString());
                        this.f37464a.f37458c = abs;
                    }
                }
            }
        }
    }

    public static final /* synthetic */ b a(LynxFoldView lynxFoldView) {
        b bVar = lynxFoldView.f37456a;
        if (bVar == null) {
            l.a("mFoldToolbarLayout");
        }
        return bVar;
    }

    public LynxFoldView(j jVar) {
        super(jVar);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setEvents(Map<String, com.lynx.tasm.c.a> map) {
        super.setEvents(map);
        LLog.a(3, "LynxFoldView", "events: ".concat(String.valueOf(map)));
        if (map != null) {
            this.f37457b = map.containsKey("offset");
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public /* synthetic */ View createView(Context context) {
        if (context == null) {
            return null;
        }
        b bVar = new b(context);
        this.f37456a = bVar;
        bVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        b bVar2 = this.f37456a;
        if (bVar2 == null) {
            l.a("mFoldToolbarLayout");
        }
        ((AppBarLayout) bVar2.b(R.id.l_)).a(new c(this));
        b bVar3 = this.f37456a;
        if (bVar3 != null) {
            return bVar3;
        }
        l.a("mFoldToolbarLayout");
        return bVar3;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public void removeChild(LynxBaseUI lynxBaseUI) {
        l.c(lynxBaseUI, "");
        if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.remove(lynxBaseUI);
            LynxUI lynxUI = (LynxUI) lynxBaseUI;
            lynxUI.setParent(null);
            b bVar = this.f37456a;
            if (bVar == null) {
                l.a("mFoldToolbarLayout");
            }
            bVar.removeView(lynxUI.mView);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public void removeView(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI instanceof LynxViewPager) {
            Iterator<LynxBaseUI> it = lynxBaseUI.getChildren().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                LynxBaseUI next = it.next();
                if (next instanceof LynxTabBarView) {
                    if (next != null) {
                        this.f37459d.remove(next);
                    }
                }
            }
        }
        super.removeView(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            if (layoutParams.width == -1 && layoutParams.height == -2) {
                return layoutParams;
            }
            layoutParams.width = -1;
            layoutParams.height = -2;
            if (layoutParams instanceof CollapsingToolbarLayout.a) {
                int i2 = Build.VERSION.SDK_INT;
                return new CollapsingToolbarLayout.a((FrameLayout.LayoutParams) layoutParams);
            } else if (layoutParams instanceof CoordinatorLayout.e) {
                CoordinatorLayout.e eVar = new CoordinatorLayout.e((CoordinatorLayout.e) layoutParams);
                eVar.a(new AppBarLayout.ScrollingViewBehavior());
                return eVar;
            } else if (layoutParams instanceof Toolbar.b) {
                return new Toolbar.b((Toolbar.b) layoutParams);
            }
        }
        CoordinatorLayout.e eVar2 = new CoordinatorLayout.e(-1, -2);
        eVar2.a(new AppBarLayout.ScrollingViewBehavior());
        return eVar2;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public void insertChild(LynxBaseUI lynxBaseUI, int i2) {
        l.c(lynxBaseUI, "");
        if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.add(i2, lynxBaseUI);
            LynxUI lynxUI = (LynxUI) lynxBaseUI;
            lynxUI.setParent(this);
            if (lynxBaseUI instanceof LynxFoldToolbar) {
                b bVar = this.f37456a;
                if (bVar == null) {
                    l.a("mFoldToolbarLayout");
                }
                com.lynx.tasm.behavior.ui.view.a aVar = (com.lynx.tasm.behavior.ui.view.a) ((LynxUI) lynxBaseUI).mView;
                l.a((Object) aVar, "");
                l.c(aVar, "");
                Toolbar toolbar = (Toolbar) bVar.b(R.id.fnj);
                l.a((Object) toolbar, "");
                toolbar.setVisibility(0);
                ((Toolbar) bVar.b(R.id.fnj)).addView(aVar);
            } else if (lynxBaseUI instanceof LynxFoldHeader) {
                b bVar2 = this.f37456a;
                if (bVar2 == null) {
                    l.a("mFoldToolbarLayout");
                }
                com.lynx.tasm.behavior.ui.view.a aVar2 = (com.lynx.tasm.behavior.ui.view.a) ((LynxUI) lynxBaseUI).mView;
                l.a((Object) aVar2, "");
                l.c(aVar2, "");
                ((CollapsingToolbarLayout) bVar2.b(R.id.a8d)).addView(aVar2, 0);
            } else {
                b bVar3 = this.f37456a;
                if (bVar3 == null) {
                    l.a("mFoldToolbarLayout");
                }
                T t = lynxUI.mView;
                l.a((Object) t, "");
                l.c(t, "");
                if (t instanceof c) {
                    c cVar = (c) t;
                    cVar.setTabLayoutUpdateListener$x_element_fold_view_newelement(new b.a(bVar3, t));
                    if (cVar.getMTabLayout() != null) {
                        cVar.a((View) cVar.getMTabLayout());
                        TabLayout mTabLayout = cVar.getMTabLayout();
                        if (mTabLayout != null) {
                            bVar3.d((View) mTabLayout);
                        } else {
                            throw new w("null cannot be cast to non-null type");
                        }
                    }
                    CoordinatorLayout.e eVar = new CoordinatorLayout.e(new ViewGroup.LayoutParams(-1, -1));
                    eVar.a(new AppBarLayout.ScrollingViewBehavior());
                    cVar.setLayoutParams(eVar);
                }
                bVar3.addView(t);
                if (this.f37460f == null) {
                    this.f37460f = new Handler(Looper.getMainLooper());
                }
                Handler handler = this.f37460f;
                if (handler != null) {
                    handler.post(new e(this));
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0047  */
    @com.lynx.tasm.behavior.p
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFoldExpanded(com.lynx.react.bridge.ReadableMap r20, com.lynx.react.bridge.Callback r21) {
        /*
        // Method dump skipped, instructions count: 373
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.viewpager.LynxFoldView.setFoldExpanded(com.lynx.react.bridge.ReadableMap, com.lynx.react.bridge.Callback):void");
    }
}
