package com.bytedance.android.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.au;
import java.util.ArrayList;
import java.util.List;

public abstract class Widget implements m, au {
    public boolean async;
    private int containerId;
    public ViewGroup containerView;
    public View contentView;
    public Context context;
    public boolean hasAttached;
    public boolean isDestroyed;
    public boolean isViewValid;
    public n lifecycleRegistry = new n(this);
    public List mRegisterEvents = new ArrayList(8);
    public a widgetCallback;
    public WidgetContainer widgetContainer;

    public interface a {
        static {
            Covode.recordClassIndex(14272);
        }

        Fragment getFragment();

        void loadRecyclableWidget(LiveRecyclableWidget liveRecyclableWidget);

        void loadSubWidget(LiveRecyclableWidget liveRecyclableWidget);

        void loadWidget(int i2, Widget widget, boolean z);

        void loadWidget(Widget widget);

        void recycleRecyclableWidget(LiveRecyclableWidget liveRecyclableWidget);

        void removeAllMessages(Object obj);

        void unloadWidget(Widget widget);
    }

    static {
        Covode.recordClassIndex(14271);
    }

    public int getLayoutId() {
        return 0;
    }

    public <T> void onCustomInfoCallBack(T t) {
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

    public boolean shouldAttach() {
        return true;
    }

    @Override // androidx.lifecycle.m
    public i getLifecycle() {
        return this.lifecycleRegistry;
    }

    public boolean isViewValid() {
        return this.isViewValid;
    }

    public void onDetachWidget() {
        a aVar = this.widgetCallback;
        if (aVar != null) {
            aVar.unloadWidget(this);
        }
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

    public View getView() {
        View view = this.contentView;
        if (view != null) {
            return view;
        }
        WidgetContainer widgetContainer2 = this.widgetContainer;
        if (widgetContainer2 != null) {
            return widgetContainer2;
        }
        return this.containerView;
    }

    public int getViewId() {
        View view = getView();
        if (view != null) {
            return view.getId();
        }
        return -1;
    }

    public void hide() {
        View view = getView();
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public boolean isShowing() {
        View view = getView();
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @v(a = i.a.ON_CREATE)
    public void onCreate() {
        this.isViewValid = true;
        this.isDestroyed = false;
        this.hasAttached = true;
        this.lifecycleRegistry.a(i.a.ON_CREATE);
    }

    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        this.lifecycleRegistry.a(i.a.ON_DESTROY);
        this.isDestroyed = true;
        this.isViewValid = false;
    }

    public void show() {
        View view = getView();
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public void attach() {
        a aVar;
        if (shouldAttach() && (aVar = this.widgetCallback) != null && !this.hasAttached) {
            int i2 = this.containerId;
            if (i2 == -1) {
                aVar.loadWidget(this);
            } else {
                aVar.loadWidget(i2, this, this.async);
            }
            this.hasAttached = true;
        }
    }

    public void setWidgetCallback(a aVar) {
        this.widgetCallback = aVar;
    }

    public <T> boolean hasRegister(Class<T> cls) {
        return this.mRegisterEvents.contains(cls);
    }

    public <T> void register(T t) {
        this.mRegisterEvents.add(t);
    }

    public void saveSnapShot(int i2, boolean z) {
        this.containerId = i2;
        this.async = z;
    }
}
