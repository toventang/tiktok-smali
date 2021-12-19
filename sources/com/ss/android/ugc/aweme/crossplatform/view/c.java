package com.ss.android.ugc.aweme.crossplatform.view;

import android.app.Activity;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class c extends CrossPlatformWebView {

    /* renamed from: j  reason: collision with root package name */
    public static final a f78970j = new a((byte) 0);

    /* renamed from: k  reason: collision with root package name */
    private boolean f78971k;

    /* renamed from: l  reason: collision with root package name */
    private Activity f78972l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f78973m;
    private boolean n;
    private final String o;
    private SparseArray p;

    static {
        Covode.recordClassIndex(49005);
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView
    public final View a(int i2) {
        if (this.p == null) {
            this.p = new SparseArray();
        }
        View view = (View) this.p.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.p.put(i2, findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(49006);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final boolean getMFromPreload() {
        return this.f78973m;
    }

    public final boolean getMLoadRnSuccess() {
        return this.n;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView
    public final Activity getActivity() {
        Activity activity = super.getActivity();
        if (activity != null) {
            return activity;
        }
        return this.f78972l;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater cloneInContext = LayoutInflater.from(getContext()).cloneInContext(getContext());
        l.b(cloneInContext, "");
        return cloneInContext;
    }

    public final void setMFromPreload(boolean z) {
        this.f78973m = z;
    }

    public final void setMLoadRnSuccess(boolean z) {
        this.n = z;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView, com.ss.android.ugc.aweme.crossplatform.view.a
    public final void d(Activity activity) {
        MethodCollector.i(12404);
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        if (com.ss.android.ugc.aweme.crossplatform.preload.a.a(this.o) == this) {
            a("onDestroy");
            MethodCollector.o(12404);
            return;
        }
        super.d(activity);
        MethodCollector.o(12404);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView
    public final void a(String str, Map<String, String> map) {
        super.a(str, map);
        this.n = false;
        com.ss.android.ugc.aweme.crossplatform.preload.a.b(this.o);
        Activity activity = this.f78972l;
        if (activity == null) {
            super.d(activity);
        }
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView
    public final void a(String str, boolean z, boolean z2) {
        l.d(str, "");
        if (!this.f78971k) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("container_launch_type", "preload");
            setAdditionalReportParams(linkedHashMap);
            super.a(str, z, z2);
            this.f78971k = true;
        }
    }
}
