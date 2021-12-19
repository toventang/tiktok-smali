package com.bytedance.ies.sdk.widgets;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.a;
import com.bytedance.android.widget.Widget;
import com.bytedance.android.widget.WidgetContainer;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.android.widget.e;
import com.bytedance.android.widget.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.f;
import com.ss.android.ugc.aweme.au;
import java.util.Set;

public class RecyclableWidgetManager extends WidgetManager implements au {
    public boolean isSubWidgetManager;
    private boolean mIsVisibilityToUser;
    public final IWidgetProvider mWidgetProvider;

    static {
        Covode.recordClassIndex(20722);
    }

    @Override // com.bytedance.android.widget.WidgetManager, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public Set<Widget> getWidgetList() {
        return this.widgets;
    }

    public <T extends LiveRecyclableWidget> void continueLoadSubWidget(T t) {
        if (t.isInitialized()) {
            continueLoadNew(t, null, ((LiveRecyclableWidget) t).contentView);
        }
    }

    @Override // com.bytedance.android.widget.WidgetManager
    public WidgetManager load(Widget widget) {
        WidgetManager load = super.load(widget);
        onVisibilityToUser(widget, this.mIsVisibilityToUser);
        return load;
    }

    public void onVisibility(boolean z) {
        this.mIsVisibilityToUser = z;
        for (Widget widget : this.widgets) {
            onVisibilityToUser(widget, z);
        }
    }

    public static void detachFromParent(View view) {
        MethodCollector.i(4555);
        if (view == null || view.getParent() == null) {
            MethodCollector.o(4555);
            return;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            MethodCollector.o(4555);
            return;
        }
        try {
            ((ViewGroup) parent).removeView(view);
            MethodCollector.o(4555);
        } catch (Exception unused) {
            MethodCollector.o(4555);
        }
    }

    public <T extends LiveRecyclableWidget> T load(Class<T> cls) {
        T t = (T) initWidget(cls, null);
        boolean contains = this.widgets.contains(t);
        this.widgets.add(t);
        getLifecycle().a(t);
        onVisibilityToUser(t, this.mIsVisibilityToUser);
        if (!contains) {
            onCustomInfoCallBack(t);
        }
        return t;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$generateNewWidget$0$RecyclableWidgetManager(LiveRecyclableWidget liveRecyclableWidget, WidgetContainer widgetContainer) {
        continueLoadNew(liveRecyclableWidget, widgetContainer, liveRecyclableWidget.contentView);
    }

    public RecyclableWidgetManager(IWidgetProvider iWidgetProvider, int i2) {
        super(i2);
        this.mWidgetProvider = iWidgetProvider;
        this.widgetCallback = new Widget.a() {
            /* class com.bytedance.ies.sdk.widgets.RecyclableWidgetManager.AnonymousClass1 */

            static {
                Covode.recordClassIndex(20726);
            }

            @Override // com.bytedance.android.widget.Widget.a
            public Fragment getFragment() {
                return RecyclableWidgetManager.this.parentFragment;
            }

            @Override // com.bytedance.android.widget.Widget.a
            public void loadSubWidget(LiveRecyclableWidget liveRecyclableWidget) {
                RecyclableWidgetManager.this.continueLoadSubWidget(liveRecyclableWidget);
            }

            @Override // com.bytedance.android.widget.Widget.a
            public void recycleRecyclableWidget(LiveRecyclableWidget liveRecyclableWidget) {
                RecyclableWidgetManager.this.mWidgetProvider.recycleRecyclableWidget(liveRecyclableWidget);
            }

            @Override // com.bytedance.android.widget.Widget.a
            public void unloadWidget(Widget widget) {
                RecyclableWidgetManager.this.unload(widget);
            }

            @Override // com.bytedance.android.widget.Widget.a
            public void loadWidget(Widget widget) {
                RecyclableWidgetManager.this.load(widget);
            }

            @Override // com.bytedance.android.widget.Widget.a
            public void removeAllMessages(Object obj) {
                if (RecyclableWidgetManager.this.mFluencyOpt != null) {
                    RecyclableWidgetManager.this.mFluencyOpt.removeMessages(obj);
                }
            }

            @Override // com.bytedance.android.widget.Widget.a
            public void loadRecyclableWidget(LiveRecyclableWidget liveRecyclableWidget) {
                if (liveRecyclableWidget.widgetContainer != null) {
                    RecyclableWidgetManager.this.generateNewWidget(liveRecyclableWidget.widgetContainer, liveRecyclableWidget.async, liveRecyclableWidget);
                }
                if (liveRecyclableWidget.containerView != null) {
                    RecyclableWidgetManager.this.generateOldWidget(liveRecyclableWidget.containerView, liveRecyclableWidget.async, liveRecyclableWidget);
                }
            }

            @Override // com.bytedance.android.widget.Widget.a
            public void loadWidget(int i2, Widget widget, boolean z) {
                RecyclableWidgetManager.this.load(i2, widget, z);
            }
        };
    }

    private void onVisibilityToUser(Widget widget, boolean z) {
        if (widget instanceof LiveWidget) {
            ((LiveWidget) widget).onVisibilityToUser(z);
        }
    }

    private <T extends LiveRecyclableWidget> T initWidget(Class<T> cls, Object[] objArr) {
        T t = (T) ((LiveRecyclableWidget) this.mWidgetProvider.provide(cls));
        t.setArgs(objArr);
        t.setWidgetCallback(this.widgetCallback);
        ((LiveRecyclableWidget) t).context = this.context;
        ((LiveRecyclableWidget) t).dataChannel = f.a(this.parentFragment);
        return t;
    }

    public <T extends LiveRecyclableWidget> T load(int i2, Class<T> cls) {
        return (T) load(i2, (Class) cls, true);
    }

    public <T extends LiveRecyclableWidget> T loadSubWidget(Class<T> cls, Object[] objArr) {
        T t = (T) initWidget(cls, objArr);
        if (!t.shouldAttach()) {
            t.saveSnapShot(true);
            addWidgetAndCallCustomBack(t);
            return t;
        }
        continueLoadSubWidget(t);
        return t;
    }

    private <T extends LiveRecyclableWidget> T tryGetWidget(Class<T> cls, Object[] objArr) {
        for (Widget widget : this.widgets) {
            if (widget.getClass() == cls) {
                return (T) ((LiveRecyclableWidget) widget);
            }
        }
        T t = (T) initWidget(cls, objArr);
        if (((LiveRecyclableWidget) t).widgetContainer != null) {
            ((LiveRecyclableWidget) t).widgetContainer.a(((LiveRecyclableWidget) t).contentView);
        }
        return t;
    }

    public <T extends LiveRecyclableWidget> T load(View view, Class<T> cls) {
        return (T) load(view, (Class) cls, true);
    }

    private <T extends LiveRecyclableWidget> T load(View view, Class<T> cls, boolean z) {
        return (T) load(view, cls, z, (Object[]) null);
    }

    @Override // com.bytedance.android.widget.WidgetManager
    public void continueLoadNew(Widget widget, WidgetContainer widgetContainer, View view) {
        if (this.parentFragment != null && widget.context != null) {
            if (view != null && (widgetContainer != null || !this.isSubWidgetManager)) {
                detachFromParent(view);
            }
            super.continueLoadNew(widget, widgetContainer, view);
            onVisibilityToUser(widget, this.mIsVisibilityToUser);
        }
    }

    @Override // com.bytedance.android.widget.WidgetManager
    public void continueLoadOld(Widget widget, ViewGroup viewGroup, View view) {
        if (this.parentFragment != null && widget.containerView != null) {
            if (view != null) {
                detachFromParent(view);
            }
            super.continueLoadOld(widget, viewGroup, view);
            onVisibilityToUser(widget, this.mIsVisibilityToUser);
        }
    }

    public <T extends LiveRecyclableWidget> T load(int i2, Class<T> cls, boolean z) {
        return (T) load(i2, cls, z, (Object[]) null);
    }

    public <T extends LiveRecyclableWidget> T generateOldWidget(ViewGroup viewGroup, boolean z, T t) {
        View view;
        View preloadLayout;
        ((LiveRecyclableWidget) t).containerView = viewGroup;
        this.widgetViewGroupHashMap.put(t, viewGroup);
        if (t.isInitialized()) {
            try {
                continueLoadOld(t, viewGroup, ((LiveRecyclableWidget) t).contentView);
                return t;
            } catch (Exception e2) {
                throw new RuntimeException(this.context.getResources().getClass().getName(), e2);
            }
        } else if (t.getLayoutId() == 0) {
            continueLoadOld(t, viewGroup, null);
            return t;
        } else if (z) {
            if (this.mFluencyOpt == null || (preloadLayout = this.mFluencyOpt.getPreloadLayout(t.getLayoutId())) == null) {
                this.asyncLayoutInflater.a(t.getLayoutId(), viewGroup, new RecyclableWidgetManager$$Lambda$2(this, t, viewGroup));
            } else {
                continueLoadOld(t, viewGroup, preloadLayout);
            }
            return t;
        } else {
            if (this.mFluencyOpt == null || (view = this.mFluencyOpt.getPreloadLayout(t.getLayoutId())) == null) {
                view = a.a(this.syncLayoutInflater, t.getLayoutId(), viewGroup, false);
            }
            continueLoadOld(t, viewGroup, view);
            return t;
        }
    }

    public <T extends LiveRecyclableWidget> T generateNewWidget(WidgetContainer widgetContainer, boolean z, T t) {
        View view;
        View preloadLayout;
        if (!t.shouldAttach()) {
            t.saveSnapShot(widgetContainer, z);
            addWidgetAndCallCustomBack(t);
            return t;
        }
        ((LiveRecyclableWidget) t).widgetContainer = widgetContainer;
        if (t.isInitialized()) {
            if (z) {
                try {
                    if (this.mFluencyOpt != null) {
                        this.mFluencyOpt.post(new RecyclableWidgetManager$$Lambda$0(this, t, widgetContainer), null);
                    }
                } catch (Exception e2) {
                    throw new RuntimeException(this.context.getResources().getClass().getName(), e2);
                }
            } else {
                continueLoadNew(t, widgetContainer, ((LiveRecyclableWidget) t).contentView);
            }
            return t;
        } else if (t.getLayoutId() == 0) {
            continueLoadNew(t, widgetContainer, null);
            return t;
        } else if (z) {
            if (this.mFluencyOpt == null || (preloadLayout = this.mFluencyOpt.getPreloadLayout(t.getLayoutId())) == null) {
                this.asyncLayoutInflater.a(t.getLayoutId(), (ViewGroup) widgetContainer.getParent(), new RecyclableWidgetManager$$Lambda$1(this, t, widgetContainer));
            } else {
                continueLoadNew(t, widgetContainer, preloadLayout);
            }
            return t;
        } else {
            if (this.mFluencyOpt == null || (view = this.mFluencyOpt.getPreloadLayout(t.getLayoutId())) == null) {
                view = a.a(this.syncLayoutInflater, t.getLayoutId(), (ViewGroup) widgetContainer.getParent(), false);
            }
            continueLoadNew(t, widgetContainer, view);
            return t;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ies.sdk.widgets.RecyclableWidgetManager */
    /* JADX WARN: Multi-variable type inference failed */
    public <T extends LiveRecyclableWidget> T loadNew(WidgetContainer widgetContainer, Class<T> cls, boolean z, Object[] objArr) {
        return (T) generateNewWidget(widgetContainer, z, initWidget(cls, objArr));
    }

    public <T extends LiveRecyclableWidget> T loadOld(ViewGroup viewGroup, Class<T> cls, boolean z, Object[] objArr) {
        T t = (T) initWidget(cls, objArr);
        if (t.shouldAttach()) {
            return (T) generateOldWidget(viewGroup, z, t);
        }
        t.saveSnapShot(viewGroup, z);
        addWidgetAndCallCustomBack(t);
        return t;
    }

    public <T extends LiveRecyclableWidget> T load(int i2, Class<T> cls, boolean z, Object[] objArr) {
        return (T) load(this.contentView.findViewById(i2), cls, z, objArr);
    }

    public <T extends LiveRecyclableWidget> T load(View view, Class<T> cls, boolean z, Object[] objArr) {
        Widget widget = null;
        if (this.parentFragment == null) {
            return null;
        }
        if (view == null && this.isSubWidgetManager) {
            return (T) loadSubWidget(cls, objArr);
        }
        if (view instanceof WidgetContainer) {
            return (T) loadNew((WidgetContainer) view, cls, z, objArr);
        }
        boolean z2 = false;
        for (Widget widget2 : this.widgets) {
            if (widget2.getClass() == cls) {
                z2 = true;
                widget = widget2;
            }
        }
        if (view != null) {
            if (z2 && !h.a(cls)) {
                unload(widget);
                return (T) load(view.getId(), cls, z, objArr);
            } else if (h.a(this.context) && !h.a(cls)) {
                throw new e(cls);
            }
        }
        return (T) loadOld((ViewGroup) view, cls, z, objArr);
    }

    public static RecyclableWidgetManager of(Fragment fragment, View view, boolean z, IWidgetProvider iWidgetProvider, FluencyOpt fluencyOpt) {
        return of(fragment, view, z, iWidgetProvider, fluencyOpt, 10);
    }

    public static RecyclableWidgetManager of(androidx.fragment.app.e eVar, View view, boolean z, IWidgetProvider iWidgetProvider, FluencyOpt fluencyOpt) {
        return of(eVar, view, z, iWidgetProvider, fluencyOpt, 10);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$generateNewWidget$1$RecyclableWidgetManager(LiveRecyclableWidget liveRecyclableWidget, WidgetContainer widgetContainer, View view, int i2, ViewGroup viewGroup) {
        if (this.parentFragment != null && !this.parentFragment.isRemoving() && !this.parentFragment.isDetached() && getLifecycle().a() != i.b.DESTROYED) {
            continueLoadNew(liveRecyclableWidget, widgetContainer, view);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$generateOldWidget$2$RecyclableWidgetManager(LiveRecyclableWidget liveRecyclableWidget, ViewGroup viewGroup, View view, int i2, ViewGroup viewGroup2) {
        if (this.parentFragment != null && !this.parentFragment.isRemoving() && !this.parentFragment.isDetached() && getLifecycle().a() != i.b.DESTROYED) {
            continueLoadOld(liveRecyclableWidget, viewGroup, view);
        }
    }

    public static RecyclableWidgetManager of(Fragment fragment, View view, boolean z, IWidgetProvider iWidgetProvider, FluencyOpt fluencyOpt, int i2) {
        RecyclableWidgetManager recyclableWidgetManager = new RecyclableWidgetManager(iWidgetProvider, i2);
        recyclableWidgetManager.config(null, fragment, view, fragment.getContext(), fluencyOpt);
        recyclableWidgetManager.mIsVisibilityToUser = z;
        return recyclableWidgetManager;
    }

    public static RecyclableWidgetManager of(androidx.fragment.app.e eVar, View view, boolean z, IWidgetProvider iWidgetProvider, FluencyOpt fluencyOpt, int i2) {
        RecyclableWidgetManager recyclableWidgetManager = new RecyclableWidgetManager(iWidgetProvider, i2);
        recyclableWidgetManager.config(eVar, null, view, eVar, fluencyOpt);
        recyclableWidgetManager.mIsVisibilityToUser = z;
        return recyclableWidgetManager;
    }
}
