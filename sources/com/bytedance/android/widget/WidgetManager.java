package com.bytedance.android.widget;

import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.v;
import com.bytedance.android.widget.Widget;
import com.bytedance.android.widget.WidgetContainer;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.widgets.FluencyOpt;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.au;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

public class WidgetManager implements m, au {
    public static final String TAG = WidgetManager.class.getCanonicalName();
    public c asyncLayoutInflater;
    public boolean configured;
    public View contentView;
    public Context context;
    Map<Object, Long> customCallBackInfoMap = new ConcurrentHashMap();
    protected boolean isRTL;
    public n lifecycleRegistry = new n(this);
    public FluencyOpt mFluencyOpt;
    public a mWidgetCreateTimeListener;
    private final int maxTaskCount;
    public Fragment parentFragment;
    public LayoutInflater syncLayoutInflater;
    public Widget.a widgetCallback = new Widget.a() {
        /* class com.bytedance.android.widget.WidgetManager.AnonymousClass1 */

        static {
            Covode.recordClassIndex(14276);
        }

        @Override // com.bytedance.android.widget.Widget.a
        public final void loadRecyclableWidget(LiveRecyclableWidget liveRecyclableWidget) {
        }

        @Override // com.bytedance.android.widget.Widget.a
        public final void loadSubWidget(LiveRecyclableWidget liveRecyclableWidget) {
        }

        @Override // com.bytedance.android.widget.Widget.a
        public final void recycleRecyclableWidget(LiveRecyclableWidget liveRecyclableWidget) {
        }

        @Override // com.bytedance.android.widget.Widget.a
        public final void removeAllMessages(Object obj) {
        }

        @Override // com.bytedance.android.widget.Widget.a
        public final Fragment getFragment() {
            return WidgetManager.this.parentFragment;
        }

        @Override // com.bytedance.android.widget.Widget.a
        public final void unloadWidget(Widget widget) {
            WidgetManager.this.unload(widget);
        }

        @Override // com.bytedance.android.widget.Widget.a
        public final void loadWidget(Widget widget) {
            WidgetManager.this.load(widget);
        }

        @Override // com.bytedance.android.widget.Widget.a
        public final void loadWidget(int i2, Widget widget, boolean z) {
            WidgetManager.this.load(i2, widget, z);
        }
    };
    public Map<Widget, ViewGroup> widgetViewGroupHashMap = new HashMap();
    public Set<Widget> widgets = new CopyOnWriteArraySet();

    public interface a {
        static {
            Covode.recordClassIndex(14278);
        }

        boolean needUploadTime(Widget widget);

        void onLoad(Widget widget, long j2);
    }

    public static int com_bytedance_android_widget_WidgetManager_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_CREATE) {
            onCreate();
        } else if (aVar == i.a.ON_START) {
            onStart();
        } else if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_STOP) {
            onStop();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // androidx.lifecycle.m
    public i getLifecycle() {
        return this.lifecycleRegistry;
    }

    @v(a = i.a.ON_CREATE)
    public void onCreate() {
        this.lifecycleRegistry.a(i.a.ON_CREATE);
    }

    @v(a = i.a.ON_PAUSE)
    public void onPause() {
        this.lifecycleRegistry.a(i.a.ON_PAUSE);
    }

    @v(a = i.a.ON_RESUME)
    public void onResume() {
        this.lifecycleRegistry.a(i.a.ON_RESUME);
    }

    @v(a = i.a.ON_START)
    public void onStart() {
        this.lifecycleRegistry.a(i.a.ON_START);
    }

    @v(a = i.a.ON_STOP)
    public void onStop() {
        this.lifecycleRegistry.a(i.a.ON_STOP);
    }

    static {
        Covode.recordClassIndex(14275);
    }

    public void detachWidget() {
        for (Widget widget : this.widgets) {
            widget.onDetachWidget();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.widget.WidgetManager$2  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f24310a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        static {
            /*
                r0 = 14277(0x37c5, float:2.0006E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                androidx.lifecycle.i$b[] r0 = androidx.lifecycle.i.b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.widget.WidgetManager.AnonymousClass2.f24310a = r2
                androidx.lifecycle.i$b r0 = androidx.lifecycle.i.b.DESTROYED     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.widget.WidgetManager.AnonymousClass2.f24310a     // Catch:{ NoSuchFieldError -> 0x0022 }
                androidx.lifecycle.i$b r0 = androidx.lifecycle.i.b.CREATED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.android.widget.WidgetManager.AnonymousClass2.f24310a     // Catch:{ NoSuchFieldError -> 0x002d }
                androidx.lifecycle.i$b r0 = androidx.lifecycle.i.b.STARTED     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.android.widget.WidgetManager.AnonymousClass2.f24310a     // Catch:{ NoSuchFieldError -> 0x0038 }
                androidx.lifecycle.i$b r0 = androidx.lifecycle.i.b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.widget.WidgetManager.AnonymousClass2.<clinit>():void");
        }
    }

    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        this.lifecycleRegistry.a(i.a.ON_DESTROY);
        Fragment fragment = this.parentFragment;
        if (fragment != null) {
            fragment.getLifecycle().b(this);
        }
        this.parentFragment = null;
        this.widgets.clear();
        this.widgetViewGroupHashMap.clear();
        this.customCallBackInfoMap.clear();
    }

    public void addWidgetAndCallCustomBack(Widget widget) {
        boolean contains = this.widgets.contains(widget);
        this.widgets.add(widget);
        if (!contains) {
            onCustomInfoCallBack(widget);
        }
    }

    public WidgetManager(int i2) {
        this.maxTaskCount = i2;
    }

    public WidgetManager load(Widget widget) {
        if (widget == null) {
            return this;
        }
        if (!widget.shouldAttach()) {
            widget.saveSnapShot(-1, false);
            addWidgetAndCallCustomBack(widget);
            return this;
        }
        widget.setWidgetCallback(this.widgetCallback);
        widget.context = this.context;
        boolean contains = this.widgets.contains(widget);
        this.widgets.add(widget);
        getLifecycle().a(widget);
        if (!contains) {
            onCustomInfoCallBack(widget);
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onCustomInfoCallBack(Widget widget) {
        for (Object obj : this.customCallBackInfoMap.keySet()) {
            if (this.customCallBackInfoMap.get(obj).longValue() < SystemClock.elapsedRealtime() && widget.hasRegister(obj.getClass())) {
                widget.onCustomInfoCallBack(obj);
            }
        }
    }

    public WidgetManager unload(Widget widget) {
        MethodCollector.i(3055);
        if (widget == null) {
            MethodCollector.o(3055);
            return this;
        }
        getLifecycle().b(widget);
        if (widget.isViewValid) {
            int i2 = AnonymousClass2.f24310a[getLifecycle().a().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    widget.onDestroy();
                } else if (i2 == 3) {
                    widget.onStop();
                    widget.onDestroy();
                } else if (i2 == 4) {
                    widget.onPause();
                    widget.onStop();
                    widget.onDestroy();
                }
            } else if (!widget.isDestroyed) {
                widget.onDestroy();
            }
        }
        if (widget.widgetContainer != null) {
            widget.widgetContainer.a(widget.contentView);
        } else if (this.widgetViewGroupHashMap.containsKey(widget)) {
            if (this.widgetViewGroupHashMap.get(widget) != null) {
                this.widgetViewGroupHashMap.get(widget).removeAllViews();
            }
            this.widgetViewGroupHashMap.remove(widget);
        }
        this.widgets.remove(widget);
        widget.context = null;
        widget.containerView = null;
        widget.widgetCallback = null;
        widget.widgetContainer = null;
        MethodCollector.o(3055);
        return this;
    }

    public WidgetManager load(int i2, Widget widget) {
        return load(i2, widget, true);
    }

    public <T> void onCustomInfoCallBack(Class<T> cls, T t) {
        if (!(t == null || cls == null)) {
            for (Widget widget : this.widgets) {
                if (widget.hasRegister(cls)) {
                    widget.onCustomInfoCallBack(t);
                }
            }
            this.customCallBackInfoMap.put(t, Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }

    public static WidgetManager of(Fragment fragment, View view, FluencyOpt fluencyOpt) {
        return of(fragment, view, fluencyOpt, 10);
    }

    public static WidgetManager of(e eVar, View view, FluencyOpt fluencyOpt) {
        return of(eVar, view, fluencyOpt, 10);
    }

    private WidgetManager loadOld(ViewGroup viewGroup, Widget widget, boolean z) {
        View view;
        widget.containerView = viewGroup;
        this.widgetViewGroupHashMap.put(widget, viewGroup);
        if (widget.getLayoutId() == 0) {
            continueLoadOld(widget, viewGroup, null);
            return this;
        }
        if (z) {
            FluencyOpt fluencyOpt = this.mFluencyOpt;
            if (fluencyOpt == null || (view = fluencyOpt.getPreloadLayout(widget.getLayoutId())) == null) {
                this.asyncLayoutInflater.a(widget.getLayoutId(), viewGroup, new g(this, widget, viewGroup));
            }
            continueLoadOld(widget, viewGroup, view);
        } else {
            FluencyOpt fluencyOpt2 = this.mFluencyOpt;
            if (fluencyOpt2 == null || (view = fluencyOpt2.getPreloadLayout(widget.getLayoutId())) == null) {
                view = com.a.a(this.syncLayoutInflater, widget.getLayoutId(), viewGroup, false);
            }
            continueLoadOld(widget, viewGroup, view);
        }
        return this;
    }

    public void continueLoadOld(Widget widget, ViewGroup viewGroup, View view) {
        MethodCollector.i(3024);
        if (this.parentFragment == null) {
            MethodCollector.o(3024);
            return;
        }
        widget.widgetContainer = null;
        if (widget.containerView == null) {
            MethodCollector.o(3024);
            return;
        }
        widget.contentView = view;
        if (!(viewGroup == null || view == null)) {
            viewGroup.addView(view);
        }
        boolean contains = this.widgets.contains(widget);
        this.widgets.add(widget);
        a aVar = this.mWidgetCreateTimeListener;
        if (aVar == null || !aVar.needUploadTime(widget)) {
            getLifecycle().a(widget);
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            getLifecycle().a(widget);
            this.mWidgetCreateTimeListener.onLoad(widget, SystemClock.elapsedRealtime() - elapsedRealtime);
        }
        if (!contains) {
            onCustomInfoCallBack(widget);
        }
        MethodCollector.o(3024);
    }

    private WidgetManager loadNew(WidgetContainer widgetContainer, Widget widget, boolean z) {
        View view;
        View preloadLayout;
        widget.widgetContainer = widgetContainer;
        if (widget.getLayoutId() == 0) {
            continueLoadNew(widget, widgetContainer, null);
        } else if (z) {
            long currentTimeMillis = System.currentTimeMillis();
            FluencyOpt fluencyOpt = this.mFluencyOpt;
            if (fluencyOpt == null || (preloadLayout = fluencyOpt.getPreloadLayout(widget.getLayoutId())) == null) {
                this.asyncLayoutInflater.a(widget.getLayoutId(), (ViewGroup) widgetContainer.getParent(), new f(this, widget, widgetContainer));
            } else {
                continueLoadNew(widget, widgetContainer, preloadLayout);
            }
            com_bytedance_android_widget_WidgetManager_com_ss_android_ugc_aweme_lancet_LogLancet_e("async_inflate_duration", widget.getClass().getSimpleName() + (System.currentTimeMillis() - currentTimeMillis));
        } else {
            long currentTimeMillis2 = System.currentTimeMillis();
            FluencyOpt fluencyOpt2 = this.mFluencyOpt;
            if (fluencyOpt2 == null || (view = fluencyOpt2.getPreloadLayout(widget.getLayoutId())) == null) {
                view = com.a.a(this.syncLayoutInflater, widget.getLayoutId(), (ViewGroup) widgetContainer.getParent(), false);
            }
            continueLoadNew(widget, widgetContainer, view);
            com_bytedance_android_widget_WidgetManager_com_ss_android_ugc_aweme_lancet_LogLancet_e("inflate_duration", widget.getClass().getSimpleName() + (System.currentTimeMillis() - currentTimeMillis2));
        }
        return this;
    }

    public WidgetManager load(int i2, Widget widget, boolean z) {
        if (this.parentFragment == null || widget == null) {
            return this;
        }
        widget.setWidgetCallback(this.widgetCallback);
        widget.context = this.context;
        if (!widget.shouldAttach()) {
            widget.saveSnapShot(i2, z);
            addWidgetAndCallCustomBack(widget);
            return this;
        } else if (this.contentView.findViewById(i2) instanceof WidgetContainer) {
            return loadNew((WidgetContainer) this.contentView.findViewById(i2), widget, z);
        } else {
            boolean z2 = false;
            Widget widget2 = null;
            for (Widget widget3 : this.widgets) {
                if (widget3.getClass() == widget.getClass()) {
                    z2 = true;
                    widget2 = widget3;
                }
            }
            if (!h.a(widget) && z2) {
                unload(widget2);
                return load(i2, widget, z);
            } else if (h.a(widget) || !h.a(this.context)) {
                return loadOld((ViewGroup) this.contentView.findViewById(i2), widget, z);
            } else {
                throw new e(widget);
            }
        }
    }

    public void continueLoadNew(Widget widget, WidgetContainer widgetContainer, View view) {
        int i2;
        int i3;
        int a2;
        int i4;
        MethodCollector.i(3045);
        if (this.parentFragment == null) {
            MethodCollector.o(3045);
            return;
        }
        if (view != null) {
            widget.contentView = view;
        }
        if (widgetContainer != null) {
            ViewParent parent = widgetContainer.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                if (view == null) {
                    viewGroup.removeViewInLayout(widgetContainer);
                } else {
                    int indexOfChild = viewGroup.indexOfChild(widgetContainer);
                    ViewGroup.LayoutParams layoutParams = widgetContainer.getLayoutParams();
                    if (layoutParams != null) {
                        i2 = layoutParams.height;
                    } else {
                        i2 = 0;
                    }
                    ViewGroup.LayoutParams layoutParams2 = widgetContainer.getLayoutParams();
                    if (layoutParams2 != null) {
                        i3 = layoutParams2.width;
                    } else {
                        i3 = 0;
                    }
                    widgetContainer.f24302a = new WidgetContainer.a(i2, i3, indexOfChild, widgetContainer.getId(), widgetContainer.getVisibility(), viewGroup);
                    if (view.getVisibility() == 0 && widgetContainer.getVisibility() == 0) {
                        view.setVisibility(0);
                    } else {
                        view.setVisibility(8);
                    }
                    if (viewGroup instanceof RelativeLayout) {
                        a2 = widgetContainer.getId();
                    } else {
                        a2 = androidx.core.h.v.a();
                    }
                    view.setId(a2);
                    widgetContainer.setId(-1);
                    viewGroup.removeViewInLayout(widgetContainer);
                    ViewParent parent2 = view.getParent();
                    if (!(parent2 instanceof ViewGroup)) {
                        parent2 = null;
                    }
                    ViewGroup viewGroup2 = (ViewGroup) parent2;
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(view);
                    }
                    if (widgetContainer.getLayoutParams() != null) {
                        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                        ViewGroup.LayoutParams layoutParams4 = widgetContainer.getLayoutParams();
                        if (layoutParams3 != null) {
                            int i5 = -2;
                            if (WidgetContainer.a(view.getLayoutParams().width)) {
                                i4 = view.getLayoutParams().width;
                            } else if (WidgetContainer.a(layoutParams4.width) || layoutParams4.width == view.getLayoutParams().width) {
                                i4 = layoutParams4.width;
                            } else {
                                i4 = -2;
                            }
                            layoutParams4.width = i4;
                            if (WidgetContainer.a(view.getLayoutParams().height)) {
                                i5 = view.getLayoutParams().height;
                            } else if (WidgetContainer.a(layoutParams4.height) || layoutParams4.height == view.getLayoutParams().height) {
                                i5 = layoutParams4.height;
                            }
                            layoutParams4.height = i5;
                        }
                        viewGroup.addView(view, indexOfChild, layoutParams4);
                    } else {
                        viewGroup.addView(view, indexOfChild);
                    }
                }
            }
            if (this.isRTL && view != null) {
                androidx.core.h.v.b(view, 1);
            }
        }
        boolean contains = this.widgets.contains(widget);
        this.widgets.add(widget);
        a aVar = this.mWidgetCreateTimeListener;
        if (aVar == null || !aVar.needUploadTime(widget)) {
            getLifecycle().a(widget);
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            getLifecycle().a(widget);
            this.mWidgetCreateTimeListener.onLoad(widget, SystemClock.elapsedRealtime() - elapsedRealtime);
        }
        if (!contains) {
            onCustomInfoCallBack(widget);
        }
        MethodCollector.o(3045);
    }

    public static WidgetManager of(Fragment fragment, View view, FluencyOpt fluencyOpt, int i2) {
        WidgetManager widgetManager = new WidgetManager(i2);
        widgetManager.config(null, fragment, view, fragment.getContext(), fluencyOpt);
        return widgetManager;
    }

    public static WidgetManager of(e eVar, View view, FluencyOpt fluencyOpt, int i2) {
        WidgetManager widgetManager = new WidgetManager(i2);
        widgetManager.config(eVar, null, view, eVar, fluencyOpt);
        return widgetManager;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$loadNew$0$WidgetManager(Widget widget, WidgetContainer widgetContainer, View view, int i2, ViewGroup viewGroup) {
        Fragment fragment = this.parentFragment;
        if (fragment != null && !fragment.isRemoving() && !this.parentFragment.isDetached() && getLifecycle().a() != i.b.DESTROYED) {
            continueLoadNew(widget, widgetContainer, view);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$loadOld$1$WidgetManager(Widget widget, ViewGroup viewGroup, View view, int i2, ViewGroup viewGroup2) {
        Fragment fragment = this.parentFragment;
        if (fragment != null && !fragment.isRemoving() && !this.parentFragment.isDetached() && getLifecycle().a() != i.b.DESTROYED) {
            continueLoadOld(widget, viewGroup, view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0063, code lost:
        if (r0.getLayoutDirection() == 1) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void config(androidx.fragment.app.e r6, androidx.fragment.app.Fragment r7, android.view.View r8, android.content.Context r9, com.bytedance.ies.sdk.widgets.FluencyOpt r10) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.widget.WidgetManager.config(androidx.fragment.app.e, androidx.fragment.app.Fragment, android.view.View, android.content.Context, com.bytedance.ies.sdk.widgets.FluencyOpt):void");
    }
}
