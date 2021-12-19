package com.bytedance.ies.sdk.widgets;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;

public abstract class Widget implements m, au {
    public ViewGroup containerView;
    public View contentView;
    public Context context;
    public DataCenter dataCenter;
    public boolean isDestroyed;
    public boolean isViewValid;
    public n lifecycleRegistry = new n(this);
    public WidgetManager subWidgetManager;
    public WidgetCallback widgetCallback;

    public interface WidgetCallback {
        static {
            Covode.recordClassIndex(20728);
        }

        Fragment getFragment();

        <T extends ac> T getViewModel(Class<T> cls);

        <T extends ac> T getViewModel(Class<T> cls, ad.b bVar);

        void startActivity(Intent intent);

        void startActivity(Intent intent, Bundle bundle);

        void startActivityForResult(Intent intent, int i2);

        void startActivityForResult(Intent intent, int i2, Bundle bundle);
    }

    static {
        Covode.recordClassIndex(20727);
    }

    public int getLayoutId() {
        return 0;
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    public void onConfigurationChanged(Configuration configuration) {
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

    public boolean isViewValid() {
        return this.isViewValid;
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

    @v(a = i.a.ON_CREATE)
    public void onCreate() {
        this.isViewValid = true;
        this.isDestroyed = false;
        this.lifecycleRegistry.a(i.a.ON_CREATE);
    }

    public void enableSubWidgetManager() {
        if (this.subWidgetManager == null) {
            WidgetManager of = WidgetManager.of(this.widgetCallback.getFragment(), this.contentView);
            this.subWidgetManager = of;
            of.setDataCenter(this.dataCenter);
        }
    }

    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        this.lifecycleRegistry.a(i.a.ON_DESTROY);
        if (this.subWidgetManager != null) {
            this.widgetCallback.getFragment().getChildFragmentManager().a().a(this.subWidgetManager).e();
        }
        this.isDestroyed = true;
        this.isViewValid = false;
    }

    public void setWidgetCallback(WidgetCallback widgetCallback2) {
        this.widgetCallback = widgetCallback2;
    }

    public <T extends ac> T getViewModel(Class<T> cls) {
        return (T) this.widgetCallback.getViewModel(cls);
    }

    public void startActivity(Intent intent) {
        this.widgetCallback.startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i2) {
        this.widgetCallback.startActivityForResult(intent, i2);
    }

    public <T extends ac> T getViewModel(Class<T> cls, ad.b bVar) {
        return (T) this.widgetCallback.getViewModel(cls, bVar);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        this.widgetCallback.startActivity(intent, bundle);
    }

    public void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        this.widgetCallback.startActivityForResult(intent, i2, bundle);
    }
}
