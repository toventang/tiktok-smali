package com.bytedance.sdk.xbridge.registry.core;

import android.app.Activity;
import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f44033a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, Object<?>> f44034b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<View> f44035c;

    /* renamed from: d  reason: collision with root package name */
    private WeakReference<Activity> f44036d;

    /* renamed from: e  reason: collision with root package name */
    private e f44037e;

    static {
        Covode.recordClassIndex(26890);
    }

    public final void a(View view) {
        if (this.f44035c == null) {
            this.f44035c = new WeakReference<>(view);
        }
    }

    public final void a(Activity activity) {
        WeakReference<Activity> weakReference = this.f44036d;
        if (weakReference == null || weakReference.get() == null) {
            this.f44036d = new WeakReference<>(activity);
        }
    }

    public final void a(e eVar) {
        l.c(eVar, "");
        if (this.f44037e == null) {
            this.f44037e = eVar;
        }
    }
}
