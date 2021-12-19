package com.bytedance.ies.sdk.widgets;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.widget.Widget;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.datachannel.f;
import com.ss.android.ugc.aweme.au;
import f.a.b.a;

public abstract class LiveWidget extends Widget implements au {
    private a compositeDisposable;
    public DataChannel dataChannel;
    private com.bytedance.android.livesdk.util.rxutils.a lifecycleTransformer;
    public RecyclableWidgetManager subWidgetManager;

    static {
        Covode.recordClassIndex(20713);
    }

    @Override // com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public final <T> com.bytedance.android.livesdk.util.rxutils.a<T> getAutoUnbindTransformer() {
        return this.lifecycleTransformer;
    }

    public Context getContext() {
        return this.context;
    }

    public DataChannel provideDataChannel() {
        return this.dataChannel;
    }

    public void enableSubWidgetManager() {
        enableSubWidgetManager(null, null);
    }

    @Override // com.bytedance.android.widget.Widget
    public void onDetachWidget() {
        if (!(this instanceof IUnLoadWidget)) {
            if (this.widgetCallback != null) {
                this.widgetCallback.unloadWidget(this);
            }
            RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
            if (recyclableWidgetManager != null && recyclableWidgetManager.isSubWidgetManager) {
                this.subWidgetManager.detachWidget();
            }
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public void onCreate() {
        a aVar = this.compositeDisposable;
        if (aVar != null) {
            aVar.dispose();
        }
        this.compositeDisposable = new a();
        this.lifecycleTransformer = new com.bytedance.android.livesdk.util.rxutils.a(this.compositeDisposable);
        super.onCreate();
        this.dataChannel = f.a(this.widgetCallback.getFragment());
    }

    @Override // com.bytedance.android.widget.Widget
    public void onDestroy() {
        super.onDestroy();
        if (this.widgetCallback != null) {
            this.widgetCallback.removeAllMessages(this);
        }
        onDetachWidget();
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.b(this);
        }
        DataChannelGlobal.f34575d.b(this);
        this.compositeDisposable.dispose();
        RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
        if (!(recyclableWidgetManager == null || recyclableWidgetManager.parentFragment == null)) {
            this.subWidgetManager.parentFragment.getLifecycle().b(this.subWidgetManager);
        }
        this.subWidgetManager = null;
    }

    public final <T extends View> T findViewById(int i2) {
        return (T) getView().findViewById(i2);
    }

    public void onVisibilityToUser(boolean z) {
        RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
        if (recyclableWidgetManager != null && recyclableWidgetManager.isSubWidgetManager) {
            this.subWidgetManager.onVisibility(z);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public void setWidgetCallback(Widget.a aVar) {
        super.setWidgetCallback(aVar);
        if (aVar != null) {
            this.dataChannel = f.a(aVar.getFragment());
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public <T> void onCustomInfoCallBack(T t) {
        RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
        if (recyclableWidgetManager != null && recyclableWidgetManager.isSubWidgetManager) {
            this.subWidgetManager.onCustomInfoCallBack(t.getClass(), t);
        }
    }

    public void enableSubWidgetManager(WidgetManager.a aVar, FluencyOpt fluencyOpt) {
        if (this.subWidgetManager == null) {
            RecyclableWidgetManager of = RecyclableWidgetManager.of(this.widgetCallback.getFragment(), getView(), false, (IWidgetProvider) LiveWidgetProvider.getInstance(), fluencyOpt);
            this.subWidgetManager = of;
            of.mWidgetCreateTimeListener = aVar;
            this.subWidgetManager.isSubWidgetManager = true;
        }
    }
}
