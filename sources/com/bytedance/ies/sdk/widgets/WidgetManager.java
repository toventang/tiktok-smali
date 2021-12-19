package com.bytedance.ies.sdk.widgets;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.b.a.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.widgets.Widget;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class WidgetManager extends Fragment {
    public static final String TAG = WidgetManager.class.getCanonicalName();
    public a asyncLayoutInflater;
    public boolean configured;
    public View contentView;
    public Context context;
    public DataCenter dataCenter;
    public i.b parentDestroyedCallback = new i.b() {
        /* class com.bytedance.ies.sdk.widgets.WidgetManager.AnonymousClass2 */

        static {
            Covode.recordClassIndex(20734);
        }

        @Override // androidx.fragment.app.i.b
        public void onFragmentViewDestroyed(i iVar, Fragment fragment) {
            if (fragment == WidgetManager.this.parentFragment) {
                iVar.a(WidgetManager.this.parentDestroyedCallback);
                fragment.getChildFragmentManager().a().a(WidgetManager.this).e();
            }
        }
    };
    public Fragment parentFragment;
    public LayoutInflater syncLayoutInflater;
    public Widget.WidgetCallback widgetCallback = new Widget.WidgetCallback() {
        /* class com.bytedance.ies.sdk.widgets.WidgetManager.AnonymousClass1 */

        static {
            Covode.recordClassIndex(20733);
        }

        @Override // com.bytedance.ies.sdk.widgets.Widget.WidgetCallback
        public Fragment getFragment() {
            return WidgetManager.this;
        }

        public static ad com_bytedance_ies_sdk_widgets_WidgetManager$1_androidx_lifecycle_VScopeLancet_of(Fragment fragment) {
            return ae.a(fragment, (ad.b) null);
        }

        @Override // com.bytedance.ies.sdk.widgets.Widget.WidgetCallback
        public void startActivity(Intent intent) {
            WidgetManager.this.startActivity(intent);
        }

        public static ad com_bytedance_ies_sdk_widgets_WidgetManager$1_androidx_lifecycle_VScopeLancet_of(e eVar) {
            return ae.a(eVar, (ad.b) null);
        }

        @Override // com.bytedance.ies.sdk.widgets.Widget.WidgetCallback
        public <T extends ac> T getViewModel(Class<T> cls) {
            return WidgetManager.this.parentFragment != null ? (T) com_bytedance_ies_sdk_widgets_WidgetManager$1_androidx_lifecycle_VScopeLancet_of(WidgetManager.this.parentFragment).a(cls) : (T) com_bytedance_ies_sdk_widgets_WidgetManager$1_androidx_lifecycle_VScopeLancet_of(WidgetManager.this.getActivity()).a(cls);
        }

        @Override // com.bytedance.ies.sdk.widgets.Widget.WidgetCallback
        public void startActivityForResult(Intent intent, int i2) {
            WidgetManager.this.startActivityForResult(intent, i2);
        }

        @Override // com.bytedance.ies.sdk.widgets.Widget.WidgetCallback
        public void startActivity(Intent intent, Bundle bundle) {
            WidgetManager.this.startActivity(intent, bundle);
        }

        @Override // com.bytedance.ies.sdk.widgets.Widget.WidgetCallback
        public <T extends ac> T getViewModel(Class<T> cls, ad.b bVar) {
            return WidgetManager.this.parentFragment != null ? (T) ae.a(WidgetManager.this.parentFragment, bVar).a(cls) : (T) ae.a(WidgetManager.this.getActivity(), bVar).a(cls);
        }

        @Override // com.bytedance.ies.sdk.widgets.Widget.WidgetCallback
        public void startActivityForResult(Intent intent, int i2, Bundle bundle) {
            WidgetManager.this.startActivityForResult(intent, i2, bundle);
        }
    };
    public Map<Widget, ViewGroup> widgetViewGroupHashMap = new HashMap();
    public List<Widget> widgets = new CopyOnWriteArrayList();

    public DataCenter getDataCenter() {
        return this.dataCenter;
    }

    static {
        Covode.recordClassIndex(20731);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.parentFragment = null;
        this.widgets.clear();
        this.widgetViewGroupHashMap.clear();
        this.dataCenter = null;
    }

    /* renamed from: com.bytedance.ies.sdk.widgets.WidgetManager$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$android$arch$lifecycle$Lifecycle$State;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 20735(0x50ff, float:2.9056E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                androidx.lifecycle.i$b[] r0 = androidx.lifecycle.i.b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.ies.sdk.widgets.WidgetManager.AnonymousClass3.$SwitchMap$android$arch$lifecycle$Lifecycle$State = r2
                androidx.lifecycle.i$b r0 = androidx.lifecycle.i.b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.ies.sdk.widgets.WidgetManager.AnonymousClass3.$SwitchMap$android$arch$lifecycle$Lifecycle$State     // Catch:{ NoSuchFieldError -> 0x0022 }
                androidx.lifecycle.i$b r0 = androidx.lifecycle.i.b.DESTROYED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.ies.sdk.widgets.WidgetManager.AnonymousClass3.$SwitchMap$android$arch$lifecycle$Lifecycle$State     // Catch:{ NoSuchFieldError -> 0x002d }
                androidx.lifecycle.i$b r0 = androidx.lifecycle.i.b.CREATED     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.ies.sdk.widgets.WidgetManager.AnonymousClass3.$SwitchMap$android$arch$lifecycle$Lifecycle$State     // Catch:{ NoSuchFieldError -> 0x0038 }
                androidx.lifecycle.i$b r0 = androidx.lifecycle.i.b.STARTED     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.bytedance.ies.sdk.widgets.WidgetManager.AnonymousClass3.$SwitchMap$android$arch$lifecycle$Lifecycle$State     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.lifecycle.i$b r0 = androidx.lifecycle.i.b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.sdk.widgets.WidgetManager.AnonymousClass3.<clinit>():void");
        }
    }

    public WidgetManager load(Widget widget) {
        if (widget == null) {
            return this;
        }
        widget.setWidgetCallback(this.widgetCallback);
        widget.context = this.context;
        widget.dataCenter = this.dataCenter;
        this.widgets.add(widget);
        getLifecycle().a(widget);
        return this;
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        for (Widget widget : this.widgets) {
            widget.onConfigurationChanged(configuration);
        }
    }

    public WidgetManager setDataCenter(DataCenter dataCenter2) {
        this.dataCenter = dataCenter2;
        for (Widget widget : this.widgets) {
            widget.dataCenter = dataCenter2;
        }
        return this;
    }

    public WidgetManager unload(Widget widget) {
        MethodCollector.i(7441);
        if (widget == null) {
            MethodCollector.o(7441);
            return this;
        }
        getLifecycle().b(widget);
        if (widget.isViewValid) {
            int i2 = AnonymousClass3.$SwitchMap$android$arch$lifecycle$Lifecycle$State[getLifecycle().a().ordinal()];
            if (i2 != 2) {
                if (i2 == 3) {
                    widget.onDestroy();
                } else if (i2 == 4) {
                    widget.onStop();
                    widget.onDestroy();
                } else if (i2 == 5) {
                    widget.onPause();
                    widget.onStop();
                    widget.onDestroy();
                }
            } else if (!widget.isDestroyed) {
                widget.onDestroy();
            }
        }
        widget.containerView = null;
        widget.context = null;
        widget.widgetCallback = null;
        widget.dataCenter = null;
        this.widgets.remove(widget);
        if (this.widgetViewGroupHashMap.containsKey(widget)) {
            this.widgetViewGroupHashMap.get(widget).removeAllViews();
            this.widgetViewGroupHashMap.remove(widget);
        }
        MethodCollector.o(7441);
        return this;
    }

    public WidgetManager load(int i2, Widget widget) {
        return load(i2, widget, true);
    }

    public static WidgetManager of(Fragment fragment, View view) {
        WidgetManager widgetManager = new WidgetManager();
        widgetManager.config(null, fragment, view, fragment.getContext());
        return widgetManager;
    }

    public static WidgetManager of(e eVar, View view) {
        WidgetManager widgetManager = new WidgetManager();
        widgetManager.config(eVar, null, view, eVar);
        return widgetManager;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        for (Widget widget : this.widgets) {
            widget.onActivityResult(i2, i3, intent);
        }
    }

    public void continueLoad(Widget widget, ViewGroup viewGroup, View view) {
        MethodCollector.i(7358);
        if (widget.containerView == null) {
            MethodCollector.o(7358);
            return;
        }
        widget.contentView = view;
        if (!(viewGroup == null || view == null)) {
            viewGroup.addView(view);
        }
        this.widgets.add(widget);
        getLifecycle().a(widget);
        MethodCollector.o(7358);
    }

    public WidgetManager load(int i2, Widget widget, boolean z) {
        if (widget == null) {
            return this;
        }
        widget.setWidgetCallback(this.widgetCallback);
        widget.context = this.context;
        widget.dataCenter = this.dataCenter;
        ViewGroup viewGroup = (ViewGroup) this.contentView.findViewById(i2);
        widget.containerView = viewGroup;
        this.widgetViewGroupHashMap.put(widget, viewGroup);
        if (widget.getLayoutId() == 0) {
            continueLoad(widget, viewGroup, null);
            return this;
        } else if (z) {
            this.asyncLayoutInflater.a(widget.getLayoutId(), viewGroup, new WidgetManager$$Lambda$0(this, widget, viewGroup));
            return this;
        } else {
            continueLoad(widget, viewGroup, com.a.a(this.syncLayoutInflater, widget.getLayoutId(), viewGroup, false));
            return this;
        }
    }

    public void config(e eVar, Fragment fragment, View view, Context context2) {
        i childFragmentManager;
        if (!this.configured) {
            if (eVar != null) {
                childFragmentManager = eVar.getSupportFragmentManager();
            } else if (fragment != null) {
                childFragmentManager = fragment.getChildFragmentManager();
            } else {
                return;
            }
            this.parentFragment = fragment;
            this.contentView = view;
            this.context = context2;
            this.asyncLayoutInflater = new a(context2);
            this.syncLayoutInflater = LayoutInflater.from(context2);
            if (!(fragment == null || fragment.getFragmentManager() == null)) {
                fragment.getFragmentManager().a(this.parentDestroyedCallback, false);
            }
            childFragmentManager.a().a(this, TAG).e();
            this.configured = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$load$0$WidgetManager(Widget widget, ViewGroup viewGroup, View view, int i2, ViewGroup viewGroup2) {
        if (!isRemoving() && !isDetached() && getLifecycle().a() != i.b.DESTROYED) {
            continueLoad(widget, viewGroup, view);
        }
    }
}
